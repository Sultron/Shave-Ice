public interface PaymentStrategy {
  //public String doBusiness(String shopType);
  public void pay(float amount);
}