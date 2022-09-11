public class CreditCardStrategy implements PaymentStrategy {
  private int cardNumber;
  CreditCardStrategy(int cardNumber) {
    this.cardNumber = cardNumber;
  }
  @Override
  public void pay(float amount) {
    System.out.println("Amount Due: " + amount);
    System.out.println("Paid with Card.");
  }
}