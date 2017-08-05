public class BalanceInquiry extends Transaction {
  public BalanceInquiry(int accountNumber, Screen screen, BankDatabase bankDatabase) {
    super(accountNumber, screen, bankDatabase);
  }

  @Override
  public void execute() {
    BankDatabase bankDatabase = getBankDatabase();
    Screen screen = getScreen();

    double availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());
    double totalBalance = bankDatabase.getTotalBalance(getAccountNumber());

    screen.displayMessageLine("\nBalance Information: ");
    screen.displayMessage(" - Available Balance: ");
    screen.displayDollarAmount(availableBalance);
    screen.displayMessage("\n - Total Balance: ");
    screen.displayDollarAmount(totalBalance);
    screen.displayMessageLine("");
  }

}
