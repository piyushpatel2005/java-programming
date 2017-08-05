public abstract class Transaction {
  private int accountNumber;
  private Screen screen;
  private BankDatabase bankDatabase;

  public Transaction(int accountNumber, Screen screen, BankDatabase bankDatabase) {
    this.accountNumber = accountNumber;
    this.screen = screen;
    this.bankDatabase = bankDatabase;
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public Screen getScreen() {
    return this.screen;
  }

  public BankDatabase getBankDatabase() {
    return this.bankDatabase;
  }

  abstract public void execute();
}
