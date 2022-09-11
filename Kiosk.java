public class Kiosk implements BusinessStrategy {
  public int orderNumber;
  public float pay;
  
  public Kiosk(){
    System.out.println("Kiosk has been set up.");
  }

  public void pay(PaymentStrategy paymentMethod, float sale) {
    //CashStrategy payment = new CashStrategy(cashPayment);
    if (!(paymentMethod instanceof CashStrategy)) {
      System.out.println("Cash only at kiosk");
      return;
    }
    paymentMethod.pay(sale); 
    
  }

  public void makeOrder() {
    TicketStrategy ticket = new TicketStrategy(this.orderNumber);
    ticket.doOrder();
  }
}