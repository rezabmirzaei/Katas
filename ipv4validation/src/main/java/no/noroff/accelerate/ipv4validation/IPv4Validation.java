package no.noroff.accelerate.ipv4validation;

public class IPv4Validation {

    public static boolean isValidIP(String ipAddress) {

        // Split the IP address into segments
        String[] segments = ipAddress.split("\\.");

        // Check if there are exactly 4 segments
        if (segments.length != 4) {
            return false;
        }

        // Validate each segment
        for (String segment : segments) {

            // Check if segment is a valid integer
            if (!segment.matches("\\d+")) {
                return false;
            }

            // Check if leading zeros are present
            if (segment.length() > 1 && segment.startsWith("0")) {
                return false;
            }

            // Check if value is between 0 and 255
            int segmentInt = Integer.parseInt(segment);
            if (segmentInt < 0 || segmentInt > 255) {
                return false;
            }

        }

        return true;
    }

}
