import javax.swing.JOptionPane;

public class TwoNumberOperations {
    public static void main(String[] args){
        String strNum1 = JOptionPane.showInputDialog("Enter the first number:");
        String strNum2 = JOptionPane.showInputDialog("Enter the second number:");

        double Num1 = Double.parseDouble(strNum1);
        double Num2 = Double.parseDouble(strNum2);

        double Sum = Num1 + Num2;
        double Diference = Num1 - Num2;
        double Product = Num1 * Num2;
        double Quotient = Num1 / Num2;
        if (Num2 == 0) {
            JOptionPane.showMessageDialog(null, "Cannot divide by zero");
            System.exit(0);
        } else {
        JOptionPane.showMessageDialog(null, "Sum: " + Sum + "\nDifference: " + Diference + "\nProduct: " + Product + "\nQuotient: " + Quotient);
        }
        System.exit(0);
    }
}