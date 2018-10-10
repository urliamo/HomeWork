package cinema;

import java.util.Scanner;

public class Program {
  protected Seat[][] cinema = new Seat[4][3];
  protected Scanner reader = new Scanner(System.in);
  protected int tickets;

  public void Main(String[] args) {

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
        cinema[i][j] = new Seat();
      }
    }

    System.out.print("how many tickets?");
    tickets = reader.nextInt();
    for (int i = 0; i < tickets; i++) {
      System.out.print("row number?");
      int row = reader.nextInt() - 1;
      System.out.print("col number?");
      int col = reader.nextInt() - 1;
      while (cinema[row][col].isTaken()) {
        System.out.print("seat taken, choose again");
        System.out.print("row number?");
        row = reader.nextInt() - 1;
        System.out.print("col number?");
        col = reader.nextInt() - 1;

      }
      cinema[row][col].setTaken(true);
      System.out.print("seat reservred for you, price: " + cinema[row][col].getPrice());
    }
  }

}
