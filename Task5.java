class Result {
    public static String timeConversion(String s) {
        String ampm = s.substring(8);
        int hour = Integer.parseInt(s.substring(0,2));
        String rest = s.substring(2,8);

        if(ampm.equals("AM") && hour == 12)
            hour = 0;
        else if(ampm.equals("PM") && hour != 12)
            hour += 12;

        return String.format("%02d", hour) + rest;
    }
}