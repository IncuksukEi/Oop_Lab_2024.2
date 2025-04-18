import java.util.Scanner;
public class DaysOfAMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String  month = input.nextLine();
        System.out.print("Enter the year: ");
        int  year = input.nextInt();
        input.nextLine();
        String[][] monthNames = {
                {"January", "Jan.", "Jan", "1"},
                {"February", "Feb.", "Feb", "2"},
                {"March", "Mar.", "Mar", "3"},
                {"April", "Apr.", "Apr", "4"},
                {"May", "May", "May", "5"},
                {"June", "Jun.", "Jun", "6"},
                {"July", "Jul.", "Jul", "7"},
                {"August", "Aug.", "Aug", "8"},
                {"September", "Sept.", "Sep", "9"},
                {"October", "Oct.", "Oct", "10"},
                {"November", "Nov.", "Nov", "11"},
                {"December", "Dec.", "Dec", "12"}
        };
        int iMonth = 0;
        for(int  i = 0; i < 12; i++){
            for(int  j = 0; j < 4; j++){
                if(month.equalsIgnoreCase(monthNames[i][j])){
                    iMonth = i+1;
                    break;
                }
            }
        }
        if(iMonth == 0){
            System.out.println("Invalid month");
        }else {
            boolean LeapYear = false;
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                LeapYear = true;
            }
            int daysInMonth;
            switch (iMonth) {
                case 2:
                    daysInMonth = LeapYear ? 29 : 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = 30;
                    break;
                default:
                    daysInMonth = 31;
                    break;
            }
            System.out.println("Days in month: " + daysInMonth);
        }
    }
}
