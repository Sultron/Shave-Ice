public class CashStrategy implements PaymentStrategy {
  private float cashPayment;
  CashStrategy(float cashPayment){
    this.cashPayment = cashPayment;
  }

  @Override
  public void pay(float amount) {
    System.out.printf("Amount Due: %.2f\n", amount);
    System.out.println("Paid with Cash.");
    System.out.printf("Change Due: %.2f\n",(this.cashPayment - amount));
  }
}