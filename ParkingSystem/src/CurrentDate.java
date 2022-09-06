import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {
    public static long getCurrentDateTime(){
        return new Date().getTime();
    }

    public static String getCurrentDateString(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(new Date());
    }
}
