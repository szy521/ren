import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class TestNumber {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++ ){
            System.out.println(GetOrderIDByTime());
        }
    }

    public static String GetOrderIDByTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String newDate=sdf.format(new Date());
        String result="";
        Random random=new Random();
        for(int i=0;i<3;i++){
            result+=random.nextInt(10);
        }
        return newDate+result;
    }
}
