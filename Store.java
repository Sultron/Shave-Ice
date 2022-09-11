public class Store implements BusinessStrategy {

  public Store() {
    System.out.println("Store has been set up");
  }

  public void pay(PaymentStrategy paymentMethod, float sale) {
    paymentMethod.pay(sale);
  }

  public void makeOrder(){
    ComputerStrategy order = new ComputerStrategy();
    order.doOrder();
  }

  
}