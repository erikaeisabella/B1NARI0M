
import java.text.SimpleDateFormat;
import java.util.Date;

public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date d = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        System.out.println(df.format(d));

    }
    
}
