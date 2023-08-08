class Solution {
    public int finalValueAfterOperations(String[] operations) {
        String[] minus = {"--X", "X--"};
        String[] plus = {"++X", "X++"};

        int counter = 0;

        for(int i = 0; i < operations.length; i++)
        {
            if(operations[i].equals(minus[0]) || operations[i].equals(minus[1]) )
            {
                counter--;
            }
            else
            {
                counter++;
            }
        }
        return counter;
    }
}