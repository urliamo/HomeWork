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
      boolean seated = false;
      System.out.print("row number?");
      int row = reader.nextInt();
      System.out.print("col number?");
      int col = reader.nextInt();
      while (!seated) {
        if (!cinema[row][col].isTaken()) {
          cinema[row][col].setTaken(true);
          seated = true;
        } else {
          System.out.print("seat taken, choose again");
        }
      }

    }
  }

}
