package coin_program;

public class Coin {
    public static void main(String[] args) {
        int coins[] = {1,3,10,25,50};
        int sum_up = 33;
        System.out.println ( "Minimum coins required is "
                + minCoins(coins, sum_up));
    }

    static int minCoins(int coins[], int sum_up)
    {
        int len_of_coins = coins.length;
        int[] result_array = new int[sum_up+1];
        for (int i = 1; i <= sum_up; i++) {
            int min_value = Integer.MAX_VALUE/2;
            System.out.println("Valoarea initiala a min_value: " + min_value);
            for (int j = 0; j < len_of_coins; j++) {
                if (coins[j] <= i) {
                    if (result_array[i-coins[j]] < min_value) {
                        min_value = result_array[i-coins[j]];
                        System.out.println("Calculul dupa comparatie: " + min_value);
                    }
                }
            }
            result_array[i] = min_value + 1;
        }
        return result_array[sum_up] < Integer.MAX_VALUE/2 ? result_array[sum_up] : -1;
    }
}