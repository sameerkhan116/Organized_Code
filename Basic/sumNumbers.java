import java.util.*;

class sumNumbers {
  public static int sum(String a) {
    int result = 0;
    StringBuilder x = new StringBuilder();
    for(int i = 0; i < a.length(); i++){
      if(Character.isDigit(a.charAt(i))) x.append(a.charAt(i));
      else x.append(' ');
    }
    if(x.toString().trim().equals("")) return 0; 
    for(String y : x.toString().trim().split("\\s+")) {
      result += Integer.parseInt(y);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(sum("abc123xyz"));
    System.out.println(sum("aa11b33"));
    System.out.println(sum("7 11"));
  }
}