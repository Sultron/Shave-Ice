import java.util.Random;
public class ComputerStrategy implements OrderStrategy {
  private int orderNumber;
  public ComputerStrategy(){
    Random random = new Random();
    orderNumber = random.nextInt(999999 - 100000 + 1) + 1000000;
  }

  @Override
  public void doOrder() {
    System.out.println("Taken a computer order. " + orderNumber);
  }
}