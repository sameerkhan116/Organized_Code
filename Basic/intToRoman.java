/* 
  Time complexity: O(1)
  
  Explanation:
  ------------
  1. Create an multidimensional array, one row for thousands, hundreds, tens, ones etc.
  2. return dict[0][num / 1000] + dict[1][(num % 1000) / 100] + dict[2][(num % 100) / 10] + dict[3][(num % 10)]  
*/

class intToRoman {
  public static String roman(int num) {
    String[][] dict = new String[][] { { "", "M", "MM", "MMM" },
        { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" },
        { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" },
        { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" } };
    return dict[0][num / 1000] + dict[1][(num % 1000) / 100] + dict[2][(num % 100) / 10] + dict[3][(num % 10)];
  }

  public static void main(String[] args) {
    System.out.println(roman(15));
  }
}