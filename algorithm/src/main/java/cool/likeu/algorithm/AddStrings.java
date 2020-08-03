package cool.likeu.algorithm;

/**
 * LeetCode 2020/08/03 每日推荐
 * <p> 题目：字符串相加</p>
 * <p>
 *     给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 * </p>
 * <p>
 *     提示：
 *     <ul>
 *         <li>num1 和num2 的长度都小于 5100</li>
 *         <li>num1 和num2 都只包含数字 0-9</li>
 *         <li>num1 和num2 都不包含任何前导零</li>
 *         <li>你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式</li>
 *     </ul>
 * </p>
 *
 * <a href="https://leetcode-cn.com/problems/add-strings/">https://leetcode-cn.com/problems/add-strings/</a>
 */
public class AddStrings {
    
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                // 使用ascii码值来进行运算补位
                // '0' 代表是字符串的ascii值：48
                // 因此 '0' - '0' = 0 , '1' - '0' = 1, '9' - '0' = 9 ....
                carry += num1.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += num2.charAt(j--) - '0';
            }
            // 手动补位
            sb.append(carry % 10);
            carry /= 10;
        }
        return sb.reverse().toString();
    }
    
    public static void main(String[] args) {
        AddStrings app = new AddStrings();
        long start = System.nanoTime();
        String result = app.addStrings("12345", "7890");
        long end = System.nanoTime();
        System.out.println("字符串相加，结果为：" + result + ", 耗时为：" + (end - start));
    }
    
}
