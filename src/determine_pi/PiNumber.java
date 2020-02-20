package determine_pi;


import java.math.BigDecimal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PiNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of terms: ");
        int no = Integer.parseInt(reader.readLine());
        /*
         * pi = 4/1 + (-4/3) + 4/5 + (-4/7) + 4/9 ...
         */

        int odd = 1;
        BigDecimal pi = new BigDecimal(3.0);
        int i = 0;
        double lastNr = 2; // inceputul formulei
//        for(int i=0; i <no; i++) {

//        while(no> pi.toString().length()-2){
        while (pi.toString().length() <= 3 || !String.valueOf(Math.PI).substring(0,no + 2).equals(pi.toString().substring(0,no + 2))) {

            if (i % 2 == 0) {
                pi = pi.add(new BigDecimal(String.valueOf((double) 4 / ((lastNr) * (lastNr + 1) * (lastNr + 2)))));
            } else {
                pi = pi.subtract(new BigDecimal(String.valueOf((double) 4 / ((lastNr) * (lastNr + 1) * (lastNr + 2)))));
            }
            lastNr += 2;
            i++;
        }

//        for (int i = 1; i <= no; i++) {
//            double currentTerm = 0.0;
//            if (i % 2 == 0) {
//                currentTerm = (double) -4 / odd;
//            } else {
//                currentTerm = (double) 4 / odd;
//            }
//            odd = odd + 2;
//            pi = pi + currentTerm;
//        }
        System.out.println(pi);
        System.out.println(Math.PI);
    }
}


