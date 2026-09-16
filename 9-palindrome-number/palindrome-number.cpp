class Solution {
public:
    bool isPalindrome(int x) {
        
        if (x < 0) {
            return false;
        }
        if (x != 0 && x % 10 == 0) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            int digit = x % 10;
            reversedHalf = reversedHalf * 10 + digit;
            x = x / 10;
        }

        
        return x == reversedHalf || x == reversedHalf / 10;
    }
};