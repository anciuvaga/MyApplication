package checkLeapYears;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;


public class CheckNextLeapYears {

    public static boolean isLeapYear(int year){
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void checkNextLeapYears(int k, int year){
        int count = 0;

        for (int i = year;i <= Integer.MAX_VALUE ; i++ ){

            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)){
                System.out.print(i + " ");
                count++;
                if(count == k){
                    break;
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the year you would like to start counting leap years: ");
        int y = Integer.parseInt(br.readLine());
        int year = y;

        System.out.println("Enter the next number of leap years: ");
        int k = Integer.parseInt(br.readLine());
        int j =k;
        checkNextLeapYears(j,year);

    }
}
