public class TicketStrategy implements OrderStrategy {
  public int orderNumber;
  public TicketStrategy(int orderNumber) {
    this.orderNumber = orderNumber;
      }
  @Override
  public void doOrder() {
    System.out.println("Taken a ticket order. #" + this.orderNumber);
  }
}