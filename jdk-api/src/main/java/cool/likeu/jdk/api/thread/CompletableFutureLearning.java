package cool.likeu.jdk.api.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <p>1. 一个CompletableFuture任务可能有一些依赖其计算结果的行为方法，
 * 这些行为方法被收集到一个无锁基于CAS操作链接起来的链表组成的栈中</p>
 * <p>2. 当Completable-Future的计算任务完成后，会自动弹出栈中的行为方法并执行。需要注意的是，由于是栈结构，
 * 在同一个CompletableFuture对象上行为注册的顺序与行为执行的顺序是相反的</p>
 */
public class CompletableFutureLearning {

	/**
	 * 1. thenCompose 实现当一个CompletableFuture执行完毕后，执行另外一个CompletableFuture;
	 * 2. thenCombine 实现当两个并发运行的CompletableFuture任务都完成后，是用两者的结果作为参数再执行一个异步任务；
	 * 3. allOf 等待多个并发运行的CompletableFuture任务执行完毕；
	 * 4. anyOf 等多个并发运行的CompletableFuture任务中有一个执行完毕就返回；
	 * 5. exceptionally 处理异常情况；
	 */

	private final static int AVAILABLE_PROCESSORS = Runtime.getRuntime().availableProcessors();

	private final static ThreadPoolExecutor POOL_EXECUTOR =
			new ThreadPoolExecutor(AVAILABLE_PROCESSORS, AVAILABLE_PROCESSORS * 2,
					1, TimeUnit.MINUTES, new LinkedBlockingQueue<>(5), new ThreadPoolExecutor.CallerRunsPolicy());

	static final CompletableFutureLearning HOLDER = new CompletableFutureLearning();

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		CompletableFuture<String> future = new CompletableFuture<>();

		POOL_EXECUTOR.execute(() -> {

			try {
				Thread.sleep(3000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("----" + Thread.currentThread().getName() + " set future result -----");
			future.complete("Hello, jiaduo");
		});

		System.out.println("--- main thread wait future result ---");
		System.out.println(future.get());
		System.out.println("--- main thread got future result ---");

		// Async
		CompletableFuture<Void> asyncFuture = CompletableFuture.runAsync(() -> {
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("over");
		});
		System.out.println(asyncFuture.get());

		HOLDER.thenAccept();

		HOLDER.whenComplete();
	}

	private void thenAccept() throws ExecutionException, InterruptedException {
		CompletableFuture<Void> oneFuture = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(2000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return "Hello";
		}, POOL_EXECUTOR).thenAcceptAsync(s -> {
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(s + " world");
		}, POOL_EXECUTOR);

		System.out.println(oneFuture.get());
	}

	private void whenComplete() throws ExecutionException, InterruptedException {
		CompletableFuture<String> whenCompletableFuture = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Hello ";
		}).whenComplete((s, throwable) -> {
			if (throwable == null) {
				System.out.println(s);
			} else {
				System.out.println(throwable.getLocalizedMessage());
			}
		});

		System.out.println(whenCompletableFuture.get());
	}
}
