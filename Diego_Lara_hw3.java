public class Diego_Lara_hw3 {
    
public static int fib() {
    int sum = 0;
    int a = 1;
    int b = 2;
    int c = 0;
    while (a < 4000000) {
        if (a % 2 == 0) {
            sum += a;
        }
        c = a + b;
        a = b;
        b = c;
    }
    return sum;
}

public static void main(String[] args) {
        System.out.println(fib());
}
}
