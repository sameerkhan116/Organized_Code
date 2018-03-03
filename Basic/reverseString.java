class reverseString {
  public static String reversed(String s) {
    int i = 0, j = s.length() - 1;
    char[] x = s.toCharArray();
    while(i <= j) {
      char temp = x[i];
      x[i] = x[j];
      x[j] = temp;
      i++; j--;
    }
    return String.valueOf(x);
  }

  public static void main(String[] args) {
    System.out.println(reversed("sameerkhan"));
  }
}