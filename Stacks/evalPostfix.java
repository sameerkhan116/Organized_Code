import java.util.*;
/*
  Time complexity: O(n)

  Explanation:
  1. Read string character wise
  2. While CharacterIsDigit, keep adding to stack
  3. if character is operation: a = stack.pop(), b = stack.pop()
  4. stack.push a (operation) b
  5. return stack.pop()
*/

class evalPostfix {
  public static int eval(String exp) {
    char[] x = exp.toCharArray();
    Stack<Integer> stack = new Stack<Integer>();
    for (int i = 0; i < x.length; i++) {
      if (Character.isDigit(x[i]))
        stack.push(Character.getNumericValue(x[i]));
      else {
        int b = stack.pop();
        int a = stack.pop();
        int res = 0;
        switch (x[i]) {
        case '*':
          res = a * b;
          break;
        case '+':
          res = a + b;
          break;
        case '-':
          res = a - b;
          break;
        case '/':
          res = a / b;
          break;
        }
        stack.push(res);
      }
    }
    return stack.pop();
  }

  public static void main(String[] args) {
    System.out.println(eval("231*+9-"));
  }
}