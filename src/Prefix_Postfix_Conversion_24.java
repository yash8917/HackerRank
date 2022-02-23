//public class Prefix_Postfix_Conversion_24 {
//}
import java.io.*;
/*Convert the input prefix expression into Infix expression.
Prefix : An expression is called the prefix expression if the operator appears in the expression before the operands. Simply of the form (operator operand1 operand2).
Example : *+AB-CD
Infix : An expression is called the Infix expression if the operator appears in between the operands in the expression. Simply of the form (operand1 operator operand2).
Example : (A+B) * (C-D)
Input Format

Input a string from the user.
Constraints

Nil
Output Format

Print the infixed String.
Sample Input 0

*+AB-CD
Sample Output 0

((A+B)*(C-D))
Explanation 0

x+AB-CD is the input prefix and it's corresponding infix from is ((A+B)x(C-D)).*/
        import java.util.*;

public class Prefix_Postfix_Conversion_24 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(convert(s));

    }
    public static boolean isOperator(char x){
        switch(x){
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
        }
        return false;
    }
    public static String convert(String str){
        Stack <String> stack =new Stack <>();
        int l =str.length();
        for(int i=l-1 ;i >=0 ;i--){
            char c =str.charAt(i);
            if(isOperator(c)){
                String ob1 =stack.pop();
                String ob2= stack.pop();
                String temp="(" + ob1 + c + ob2 + ")";
                stack.push(temp);
            }
            else
                stack.push(c + "");
        }
        return stack.pop();
    }
}