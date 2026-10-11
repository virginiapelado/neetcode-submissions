class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            char[] arr = details[i].toCharArray();
            if (arr[11] == '6' && (arr[12] != '0')|| arr[11] == '7' || arr[11] == '8' || arr[11] == '9') {
                count++;
            }
        }
        return count;
    }
}

// problem with this solution: if a person is over 99 yo, it won't count them

// --> not applicable for this exercise as we only have 2 posible digits for a persons age