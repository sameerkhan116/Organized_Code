/*
  Time Complexity: O(n)
  
  Explanation:
  ------------
  1. Go over each element fo the given string
  2. Switch for value I, V, X, C, M and push corresponding int to arr.
  3. If arr[i] < arr[i + 1] sum -= arr[i] else sum += arr[i]
*/

import java.util.*;

class romanToInt {
  public static int romanToInt(String s) {
    List<Integer> x = new ArrayList<Integer>();
    for(int i = 0; i < s.length(); i++) {
      switch(s.charAt(i)) {
        case 'I':
          x.add(1);
          break;
        case 'V':
          x.add(5);
          break;
        case 'X':
          x.add(10);
          break;
        case 'L':
          x.add(50);
          break;
        case 'C':
          x.add(100);
          break;
        case 'D':
          x.add(500);
          break;
        case 'M':
          x.add(1000);
          break;
      }
    }
    int res = 0;
    for(int i = 0; i < x.size() - 1; i++) {
      if(x.get(i) < x.get(i + 1)) res -= x.get(i);
      else res += x.get(i);
    }
    return res + x.get(x.size() - 1);
  }

  public static void main(String[] args) {
    System.out.println(rti("XCI"));
  }
}