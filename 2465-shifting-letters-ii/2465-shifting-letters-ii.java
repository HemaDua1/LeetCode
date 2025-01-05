class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] netShift = new int[n + 1]; 
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2] == 1 ? 1 : -1;

            netShift[start] += direction;
            netShift[end + 1] -= direction;
        }
        int cumulativeShift = 0;
        char[] result = s.toCharArray();
        for (int i = 0; i < n; i++) {
            cumulativeShift += netShift[i];
            cumulativeShift %= 26; 
            char shiftedChar = (char) ('a' + (result[i] - 'a' + cumulativeShift + 26) % 26);
            result[i] = shiftedChar;
        }

        return new String(result);
    }
}
