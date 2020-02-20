package currentAmount_calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class CurrentCalc {
    public static void main(String[] args) throws IOException {

        final int voltage = 220;
        double r;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter R (ohm): ");
         r = Double.parseDouble(br.readLine());

        System.out.println("I= " + voltage/r + " Amp");
    }
}
