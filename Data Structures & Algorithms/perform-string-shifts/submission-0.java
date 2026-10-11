class Solution {
    public String stringShift(String s, int[][] shift) {

        ArrayList<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        } 

        for (int i = 0; i < shift.length; i++) {
            int count = shift[i][1];
            while (count > 0) {
                if (shift[i][0] == 0) {      // move left: remove 1st letter, append at the end
                    
                    list.add(list.get(0));     // add first letter to the endd
                    list.remove(0);            // remove first letter

                } else if (shift[i][0] == 1) {    // move right: remove last letter, add letter to front

                    // char temp = list.get(s.length() - 1);
                    // list.remove(list.get(s.length() - 1));
                    // list.add(0, temp);

                    char last = list.remove(list.size() - 1);  // remove last letter, save for later
                    list.add(0, last);                         // add last letter to front
                }
                count--;
            }
        }
        StringBuilder str1 = new StringBuilder();
        for (char c : list) {
            str1.append(c);
        }

        return str1.toString();
    }
}
