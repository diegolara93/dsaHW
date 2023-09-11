import java.util.*;

public class Diego_Lara_hw2 {
public static int birthdayCakeCandles(List<Integer> candles) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (max < candles.get(i)) {
                count = 1;
                max = candles.get(i);
            } else if (max == candles.get(i)) {
                count++;
            }
        }
        return count;
}


    public static void main(String[] args) {
       /* Create List for the birthday candles */
         List<Integer> candles = new ArrayList<>();
            candles.add(3);
            candles.add(2);
            candles.add(1);
            candles.add(3);
            candles.add(3);
            candles.add(3);
            candles.add(3);
        
        System.out.println(birthdayCakeCandles(candles));
}
}