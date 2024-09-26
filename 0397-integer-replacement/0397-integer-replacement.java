class Solution {
HashMap<Integer, Integer> r = new HashMap<>();
    public int integerReplacement(int n) {
    if (n == 1) {
      return 0;
    }
    if (n == Integer.MAX_VALUE) {
      return 32;
    }
    if (!r.containsKey(n)) {
      if (n % 2 == 0) {
        r.put(n, integerReplacement(n / 2));
      } else {
        r.put(n, Math.min(integerReplacement(n - 1),integerReplacement(n + 1)));
      }
    }
    return 1 + r.get(n);
  }
}