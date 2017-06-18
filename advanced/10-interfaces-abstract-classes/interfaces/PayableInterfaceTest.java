public class PayableInterfaceTest {
	public static void main(String[] args) {
		Payable[] payableObjects = new Payable[4];

		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payableObjects[1] = new Invoice("56788", "tire", 4, 79.95);
		payableObjects[2] = new SalariedEmployee("John", "Smith", "111-111-1111", 800.00);
		payableObjects[3] = new SalariedEmployee("Lisa", "Barnes", "888-888-8888", 1200.00);


		System.out.println("Invoices and employees processed polymorphically");

		for(Payable currentPayable : payableObjects) {
			System.out.printf("%n%s %n%s %,.2f%n",
						currentPayable.toString(),
						"payable due", currentPayable.getPaymentAmount());
		}	
	}
}