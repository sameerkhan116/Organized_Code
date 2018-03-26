import java.util.*;
/*
  Time Complexity: O(n)

  Explanation:
  -----------
  1. Set start = i1.get(0).start, end = i1.get(0).end
  2. Loop over intervals: interval i1 : intervals 
    • If i1.start <= end: end = Math.max(end, i1.end)
    • else res.add(new Interval(start, end)), start = i1.start, end = i1.end
  3. res.add(new Interval(start, end))
  4. return res
*/

class mergeIntervals {

  static class Interval {
    int start, end;

    Interval() {
      start = 0;
      end = 0;
    }

    Interval(int s, int e) {
      start = s;
      end = e;
    }
  }

  public static List<Interval> merge(List<Interval> intervals) {
    if (intervals.size() <= 1)
      return intervals;
    intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
    int start = intervals.get(0).start, end = intervals.get(0).end;

    List<Interval> res = new ArrayList<>();
    for (Interval i : intervals) {
      if (i.start <= end) {
        end = Math.max(end, i.end);
      } else {
        res.add(new Interval(start, end));
        start = i.start;
        end = i.end;
      }
    }
    res.add(new Interval(start, end));
    return res;
  }
}