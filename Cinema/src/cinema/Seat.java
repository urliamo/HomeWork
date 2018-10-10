package cinema;

public class Seat {
  private double price;
  private boolean taken;

  public Seat() {
    this.setPrice((Math.random() * 20 + 70));
    this.setTaken(false);
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public boolean isTaken() {
    return taken;
  }

  public void setTaken(boolean taken) {
    this.taken = taken;
  }

}
