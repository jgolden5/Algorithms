import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] unsorted1 = new int[]{3, 9, 4, 6, 8, 1, 0, 2, 7, 5};
    System.out.println("Unsorted = " + Arrays.toString(unsorted1));
    int[] sorted1 = Bubble.sort(unsorted1);
    System.out.println("Sorted   = " + Arrays.toString(sorted1));

    int[] unsorted2 = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    System.out.println("Unsorted = " + Arrays.toString(unsorted2));
    int[] sorted2 = Bubble.sort(unsorted2);
    System.out.println("Sorted   = " + Arrays.toString(sorted2));

    int[] unsorted3 = new int[]{0, 6, 3, 3, 3, 3, 3, 3, 9, 4};
    System.out.println("Unsorted = " + Arrays.toString(unsorted3));
    int[] sorted3 = Bubble.sort(unsorted3);
    System.out.println("Sorted   = " + Arrays.toString(sorted3));
  }
}
