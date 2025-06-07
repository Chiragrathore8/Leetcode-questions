class Solution {
    public String predictPartyVictory(String senate) {
        Deque<Integer> r = new LinkedList<>();
        Deque<Integer> d = new LinkedList<>();
        int n = senate.length();
        for(int i = 0; i < n; i++){
            if(senate.charAt(i) == 'R') r.add(i);
            else d.add(i);
        }
        while(!r.isEmpty() && !d.isEmpty()){
            if(r.peek() < d.peek()) r.addLast(n++);
            else d.addLast(n++);
            r.pop();
            d.pop();
        }
        return r.isEmpty() ? "Dire":"Radiant";
    }
}