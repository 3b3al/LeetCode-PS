class Solution {
    public int myAtoi(String s) {
        int sign = 1, sLength = s.length(), start = 0;

        // Use long to avoid intermediate overflow.
        // Example: "-21474836482"
        // While parsing, we temporarily reach 2147483648, which is larger than
        // Integer.MAX_VALUE (2147483647). An int would overflow before we could
        // clamp the value to Integer.MIN_VALUE.
        long result = 0;

        while (start < sLength && s.charAt(start) == ' ') {
            start++;
        }

        if (start >= sLength)
            return 0;

        if (s.charAt(start) == '-' || s.charAt(start) == '+') {
            if (s.charAt(start) == '-')
                sign = -1;
            start++;
        }

        while (start < sLength && Character.isDigit(s.charAt(start))) {
            // Convert the ASCII character ('0'...'9') to its numeric value (0...9).
            int digit = s.charAt(start) - '0';

            // Overflow check.
            // Since result is a long, a simpler check such as:
            //   result > Integer.MAX_VALUE
            // would also work after updating result.
            // This check is kept to prevent overflow before multiplication and
            // because it is the standard approach used when result is an int.
            if (result > Integer.MAX_VALUE / 10 ||
                (result == Integer.MAX_VALUE / 10 &&
                 digit > (sign == 1 ? 7 : 8))) {

                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            start++;
        }

        return (int) result * sign;
    }
}