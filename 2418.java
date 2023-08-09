class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i = 0; i < heights.length-1; i++)
        {
            int max = i;
            for(int j = i + 1; j < heights.length; j++)
            {
                if (heights[j] > heights[max])
                {
                    max = j;
                }
            }
            int temp = heights[i];
            heights[i] = heights[max];
            heights[max] = temp;

            String tempName = names[i];
            names[i] = names[max];
            names[max] = tempName;
        }
        return names;
        // if you want faster learn quicksort
    }
}   