class Main {
  public static void main(String[] args) {
    int i, j;

    System.out.println("Processing...");
    /* 素数かどうかを判定 */
    for (i = 2; i <= 100000; ++i) {
      for (j = 2; j < i; ++j) {
        if (i % j == 0) {
          break;
        }
      }
    }
    System.out.println("Processing completed");
  }
}