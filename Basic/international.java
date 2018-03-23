class international {
  public static String intern(String a) {
    if (a.length() <= 2)
      return a;
    StringBuilder x = new StringBuilder();
    x.append(a.charAt(0)).append(String.valueOf(a.length() - 2)).append(a.charAt(a.length() - 1));
    return x.toString();
  }

  public static void main(String[] args) {
    System.out.println(intern("abcd"));
    System.out.println(intern("internationalization"));
    System.out.println(intern("it"));
  }
}