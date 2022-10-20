import javax.naming.ldap.SortControl;

/**
Реализовать алгоритм сортировки вставками
 */

public class z2 {

  public static void main(String[] args) {
    int array[] = { 12, 2, 5, 1, 16, 3, 2, 4 };
    System.out.println("Исходный массив: ");
    printArray(array);
    System.out.println("Отсортированный массив: ");
    sorting(array);
    printArray(array);
  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println("/n");
  }

  public static void sorting(int[] array) {
    int j = 0;
    for (int i = 1; i < array.length; i++) {
      int max = array[i];
      for (j = i; j > 0 && array[j - 1] > max; j--) {
        array[j] = array[j - 1];
      }
      array[j] = max;
    }
  }
}
