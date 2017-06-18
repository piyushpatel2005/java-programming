import javax.swing.JOptionPane;


public class Addition {
	public static void main(String[] args) {
		String firstNumber = JOptionPane.showInputDialog("Enter first integer: ");
		String secondNumber = JOptionPane.showInputDialog("Enter second integer:");

		int number1 = 0;
		int number2 = 0;
		try {
			number1 = Integer.parseInt(firstNumber);
			number2 = Integer.parseInt(secondNumber);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, 
				"Please, enter integer numbers", 
				"Error!",
				JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}
		int sum = number1 + number2;

		JOptionPane.showMessageDialog(null, 
								"The sum is " + sum, 
								"Sum of Two Integers", 
								JOptionPane.PLAIN_MESSAGE);
	}
}