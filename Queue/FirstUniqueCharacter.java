package Queue;

class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];

        for(char ch : s.toCharArray())
        {
            freq[ch - 'a']++;               // it will increment the each character freq. if appear repeated.
        }

        for(int i = 0; i < s.length(); i++)
        {
            if(freq[s.charAt(i) - 'a'] == 1)    // return i, if freq. of character is 1.
            {
                return i;
            }
        }
        return -1;
    }
}
