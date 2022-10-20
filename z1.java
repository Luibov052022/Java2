/**
 Написать программу, показывающую последовательность действий для игры “Ханойская башня”
 */

import java.util.Scanner;

public class z1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите количество дисков: ");
    int count = sc.nextInt();
    System.out.print("Введите стартовую позицию (1,2,3): ");
    int pos1 = sc.nextInt();
    System.out.print("Введите промежуточную позицию (1,2,3): ");
    int pos2 = sc.nextInt();
    System.out.print("Введите конечную позицию (1,2,3): ");
    int pos3 = sc.nextInt();
    move(count, pos1, pos2, pos3);
  }

  public static void move(int count, int pos1, int pos2, int pos3) {
    if (count == 1) System.out.println(
      "Диск №1 перемещается от " + pos1 + " к " + pos3
    ); else {
      move(count - 1, pos1, pos3, pos2);
      System.out.println(
        "Диск №" + count + " перемещается от " + pos1 + " к " + pos3
      );
      move(count - 1, pos2, pos1, pos3);
    }
  }
}
