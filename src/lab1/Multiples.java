package lab1;
import java.util.Vector;
import java.util.Map;
import java.util.HashMap;

public class Multiples {
    public static void main(String[] args) {
//        Vector<Integer> result = multiples(1000, 3, 5);
//        for (int i : result) {
//            System.out.println(i);
//        }
        int result = Multiples.multiples(16, 3, 5);
        System.out.println(result);
    }

//
//    public static Vector<Integer> multiples(int n, int a, int b) {
//        Vector<Integer> result = new Vector<>();
//        for(int i = 1; i <= n; i++){
//            if(i % a == 0 || i % b == 0){
//                result.addElement(i);
//            }
//        }
//        return result;
//    }

    public static int multiples(int n, int a, int b) {
        int result = 0;
        for(int i = 1; i < n; i++) {
            if(i % a == 0 || i % b == 0) {
                result ++;
            }
        }
        return result;
    }
}
