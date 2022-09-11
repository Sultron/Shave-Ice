public interface  BusinessStrategy {
  public void pay(PaymentStrategy paymentMethod, float sale);
  public void makeOrder();
}