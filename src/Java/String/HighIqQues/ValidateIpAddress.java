package String.HighIqQues;

import java.util.regex.Pattern;

public class ValidateIpAddress {

    public String helper(String queryIP) {

        // ===================== IPv4 =====================
        // Format : x.x.x.x
        // Each x must be in the range [0,255]
        //
        // Valid cases:
        // [0-9]          -> 0 to 9
        // [1-9][0-9]     -> 10 to 99 (No leading zero)
        // 1[0-9]{2}      -> 100 to 199
        // 2[0-4][0-9]    -> 200 to 249
        // 25[0-5]        -> 250 to 255
        //
        // (number\\.){3} -> First 3 numbers followed by '.'
        // (number)       -> Last number (No trailing dot)

        String ipV4 =
                "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}" +
                        "([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";

        if (Pattern.matches(ipV4, queryIP))
            return "IPv4";


        // ===================== IPv6 =====================
        // Format :
        // xxxx:xxxx:xxxx:xxxx:xxxx:xxxx:xxxx:xxxx
        //
        // Each block:
        // [0-9a-fA-F]{1,4}
        // -> 1 to 4 hexadecimal characters
        //
        // (hex:){7}
        // -> First 7 blocks followed by ':'
        //
        // (hex)
        // -> Last block (No trailing colon)

        String ipV6 =
                "^([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$";

        if (Pattern.matches(ipV6, queryIP))
            return "IPv6";

        return "Neither";
    }
}