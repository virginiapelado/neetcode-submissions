class Solution {
    public int calPoints(String[] operations) {

        int sum = 0;
        ArrayList<Integer> stack = new ArrayList<Integer>();

        for (String op : operations) {
            if (op.equals("+")) {
                // peek last two, sum, push
                int last1 = stack.get(stack.size() - 1);
                int last2 = stack.get(stack.size() - 2);
                stack.add(last1 + last2);
            } else if (op.equals("D")) {
                // peek last, double, push
                int last = stack.get(stack.size() - 1);
                stack.add(last * 2);
            } else if (op.equals("C")) {
                // pop
                stack.remove(stack.size() - 1);
            } else {
                // parse integer, push
                int parsed = Integer.parseInt(op);
                stack.add(parsed);
            }
        }
        
        for (int score : stack) {
            sum += score;
        }

        return sum;
    }
}