import java.util.Arrays;

public class Main {
    public static void bubble(int[] tab) {
        int n = tab.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 4, 7, 3, 2, 8};
        bubble(tab);
        System.out.println(Arrays.toString(tab));
        
    }
}
