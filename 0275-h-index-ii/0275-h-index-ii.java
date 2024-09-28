class Solution {
    public int hIndex(int[] c) {
//  Arrays.sort(c);
    int h = c.length;
    int max = 0;

    for (int i = 0; i < h; i++) {
        if (c[i] >= h - i) {
            max = Math.max(max, h - i);
        }
    }

    return max;
}
}