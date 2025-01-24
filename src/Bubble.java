public class Bubble {
  public static int[] sort(int[] start) {
    int[] result = start;
    for(int i = 0; i < start.length; i++) {
      for(int j = 0; j < start.length - i - 1; j++) {
        if(result[j] > result[j + 1]) {
          int temp = result[j];
          result[j] = result[j + 1];
          result[j + 1] = temp;
        }
      }
    }
    return result;
  }
}
