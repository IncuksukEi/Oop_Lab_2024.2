import javax.swing.JOptionPane;
class FirstDegreeEquation{
    public static void main(String[] args){
        String strNum1 = JOptionPane.showInputDialog("ax + b = 0\n Enter the a number:");
        String strNum2 = JOptionPane.showInputDialog("ax + b = 0\n Enter the b number:");

        double Num1 = Double.parseDouble(strNum1);
        double Num2 = Double.parseDouble(strNum2);
        JOptionPane.showMessageDialog(null,Num1+"x +"+Num2+" = 0");
        if(Num1 == 0 && Num2 == 0){
            JOptionPane.showMessageDialog(null,"The equation has many solutions");
        }else if(Num1 == 0 && Num2 != 0){
            JOptionPane.showMessageDialog(null,"The equation has no solution");
        }else{
            double x = -Num2/Num1;
            JOptionPane.showMessageDialog(null,"The equation has one solution: x = "+x);
        }
    }
}

class SystemOfFirstDegreeEquations{
    public static void main(String[] args){
        String strNum1 = JOptionPane.showInputDialog("a1x + b1y = c1\n Enter the a1 number:");
        String strNum2 = JOptionPane.showInputDialog("a1x + b1y = c1\n Enter the b1 number:");
        String strNum3 = JOptionPane.showInputDialog("a1x + b1y = c1\n Enter the c1 number:");
        String strNum4 = JOptionPane.showInputDialog("a2x + b2y = c2\n Enter the a2 number:");
        String strNum5 = JOptionPane.showInputDialog("a2x + b2y = c2\n Enter the b2 number:");
        String strNum6 = JOptionPane.showInputDialog("a2x + b2y = c2\n Enter the c2 number:");

        double Num1 = Double.parseDouble(strNum1);
        double Num2 = Double.parseDouble(strNum2);
        double Num3 = Double.parseDouble(strNum3);
        double Num4 = Double.parseDouble(strNum4);
        double Num5 = Double.parseDouble(strNum5);
        double Num6 = Double.parseDouble(strNum6);
        JOptionPane.showMessageDialog(null,Num1+"x +"+Num2+"y = "+Num3+"\n"+Num4+"x +"+Num5+"y = "+Num6);
        double D = Num1*Num5 - Num2*Num4;
        double Dx = Num3*Num5 - Num2*Num6;
        double Dy = Num1*Num6 - Num3*Num4;
        if(D == 0 && Dx == 0 && Dy == 0){
            JOptionPane.showMessageDialog(null,"The equation has many solutions");
        }else if(D == 0 && (Dx != 0 || Dy != 0)){
            JOptionPane.showMessageDialog(null,"The equation has no solution");
        }else{
            double x = Dx/D;
            double y = Dy/D;
            JOptionPane.showMessageDialog(null,"The equation has one solution: x = "+x+" and y = "+y);
        }
    }
}

class SecondDegreeEquation{
    public static void main(String[] args){
        String strNum1 = JOptionPane.showInputDialog("ax^2 + bx + c = 0\n Enter the a number:");
        String strNum2 = JOptionPane.showInputDialog("ax^2 + bx + c = 0\n Enter the b number:");
        String strNum3 = JOptionPane.showInputDialog("ax^2 + bx + c = 0\n Enter the c number:");

        double Num1 = Double.parseDouble(strNum1);
        double Num2 = Double.parseDouble(strNum2);
        double Num3 = Double.parseDouble(strNum3);
        JOptionPane.showMessageDialog(null,Num1+"x^2 +"+Num2+"x +"+Num3+" = 0");
        if(Num1 == 0 && Num2 == 0 && Num3 == 0){
            JOptionPane.showMessageDialog(null,"The equation has many solutions");
        }else if(Num1 == 0 && Num2 == 0 && Num3 != 0){
            JOptionPane.showMessageDialog(null,"The equation has no solution");
        }else if(Num1 == 0 && Num2 != 0){
            double x = -Num3/Num2;
            JOptionPane.showMessageDialog(null,"The equation has one solution: x = "+x);
        }else{
            double delta = Num2*Num2 - 4*Num1*Num3;
            if(delta < 0){
                JOptionPane.showMessageDialog(null,"The equation has no solution");
            }else if(delta == 0){
                double x = -Num2/(2*Num1);
                JOptionPane.showMessageDialog(null,"The equation has one solution: x = "+x);
            }else{
                double x1 = (-Num2 + Math.sqrt(delta))/(2*Num1);
                double x2 = (-Num2 - Math.sqrt(delta))/(2*Num1);
                JOptionPane.showMessageDialog(null,"The equation has two solutions: x1 = "+x1+" and x2 = "+x2);
            }
        }
    }
}