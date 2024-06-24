import java.util.Arrays;

public class Main {
    public void bubbleSort(int[] tab) {
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

    public int[] removeDuplicates(int tab[]) {
        if (tab.length == 0) return new int[0];

        int j = 0;

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] != tab[j]) {
                j++;
                tab[j] = tab[i];
            }
        }

        int[] oneTab = new int[j + 1];
        for (int i = 0; i <= j; i++) {
            oneTab[i] = tab[i];
        }
        return oneTab;
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 4, 7, 3, 2, 8};
        Main main = new Main();
        System.out.println(Arrays.toString(tab));

        main.bubbleSort(tab);
        System.out.print("Sorted array: ");
        for (int i : tab) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] uniqueTab = main.removeDuplicates(tab);
        System.out.print("Array without duplicates: ");
        for (int i : uniqueTab) {
            System.out.print(i + " ");
        }

    }
}