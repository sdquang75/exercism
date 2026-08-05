public class LogLevels {
    
    public static String message(String logLine) {
//        throw new UnsupportedOperationException("Please implement the (static) LogLevels.message() method");
     //   LogLevels.message("[ERROR]: Invalid operation")
// => "Invalid operation"
        int start = logLine.indexOf(':');
          String timkiem = logLine.substring(start+1);
        return  timkiem.trim();
    }


    public static String logLevel(String logLine) {
    //    throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");
       // LogLevels.logLevel("[ERROR]: Invalid operation")
// => "error"
        int start = logLine.indexOf('[');
        int end = logLine.indexOf(']');
        String hai = logLine.substring(start+1,end);
        return hai.toLowerCase();

    }

    public static String reformat(String logLine) {
       // throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");
   //     LogLevels.reformat("[INFO]: Operation completed")
// => "Operation completed (info)"
        int start = logLine.indexOf('[');
        int end = logLine.indexOf(']');
//        String noidung = logLine.substring(start+1,end).trim().toLowerCase();
        String noidung = logLevel(logLine);

//        String ten = logLine.substring(end+2).trim();
        String ten = message(logLine);
        String submit = ten + " "+"("+noidung+")";
        return submit;

    }
}
