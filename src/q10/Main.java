import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tokens = line.trim().split(" ");
int[] stack = new int[tokens.length];
int top = -1;

for (String token : tokens) {
    // Check if operator
    if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
        
        int b = stack[top--];
        int a = stack[top--];
        int result = 0;

        if (token.equals("+")) result = a + b;
        else if (token.equals("-")) result = a - b;
        else if (token.equals("*")) result = a * b;
        else if (token.equals("/")) result = a / b;

        stack[++top] = result;

    } else {
        // Operand
        int num = Integer.parseInt(token);
        stack[++top] = num;
    }
}

// Final result
System.out.println(stack[top]);
        // TODO: Evaluate a postfix (Reverse Polish Notation) expression
        //       Operands are non-negative integers, operators are: + - * /
        //       Use a stack to evaluate
        //       Input: single line, tokens separated by spaces
        //       Output: integer result
        //
        // Input: 5 1 2 + 4 * + 3 -
        // Output: 14
        //
        // Explanation: 5 + ((1+2)*4) - 3 = 5 + 12 - 3 = 14

        String line = sc.nextLine();

    }
}
