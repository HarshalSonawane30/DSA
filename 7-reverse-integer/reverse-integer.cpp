class Solution {
public:
    int reverse(int x) {
        int rev = 0;

        for (; x != 0; x /= 10) {
            int digit = x % 10;

          
            if (rev > INT_MAX / 10 || (rev == INT_MAX / 10 && digit > 7))
                return 0;

            if (rev < INT_MIN / 10 || (rev == INT_MIN / 10 && digit < -8))
                return 0;

            rev = rev * 10 + digit;
        }

        return rev;
    }
};