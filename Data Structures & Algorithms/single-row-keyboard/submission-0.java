class Solution {
    public int calculateTime(String keyboard, String word) {
        int time = 0;
        int finger = 0;

        for (char c : word.toCharArray()) {
            int target = keyboard.indexOf(c);
            int steps = Math.abs(finger - target);
            finger = target;
            time += steps;
        }

        return time;
    }
}
