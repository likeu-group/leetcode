package cool.likeu.jdk.api.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorLearning {

	/**
	 * 可用核心数
	 */
	private final static int AVAILABLE_PROCESSORS = Runtime.getRuntime().availableProcessors();

	/**
	 * 线程池
	 */
	private final static ThreadPoolExecutor POOL_EXECUTOR =
			new ThreadPoolExecutor(AVAILABLE_PROCESSORS, AVAILABLE_PROCESSORS * 2, 1, TimeUnit.MINUTES,
					new LinkedBlockingQueue<>(5), new ThreadPoolExecutor.CallerRunsPolicy());

	public static void main(String[] args) throws ExecutionException, InterruptedException {

		long start = System.currentTimeMillis();

		// NEW -> COMPLETING -> NORMAL   正常终止转换流程
		// NEW -> COMPLETING -> EXCEPTIONAL  执行过程中发生异常流程转换
		// NEW -> CANCEL     任务还没开始就取消
		// NEW -> INTERRUPTING -> INTERRUPTED  任务被中断
		FutureTask<String> futureTask = new FutureTask<>(() -> {
			String result = null;

			try {
				result = doSomethingA();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return result;
		});

		POOL_EXECUTOR.execute(futureTask);

		String taskResultB = doSomethingB();
		String taskResultA = futureTask.get();

		System.out.println("TaskResultA: " + taskResultA + "; TaskResultB: " + taskResultB);
		System.out.println("执行时间: " + (System.currentTimeMillis() - start));
	}

	private static String doSomethingB() {
		return "Do Something B";
	}

	private static String doSomethingA() {
		return "Do Something A";
	}

}
