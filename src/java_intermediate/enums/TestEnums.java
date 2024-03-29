package java_intermediate.enums;

public class TestEnums {

    public static void main(String[] args) {
        Month month = Month.JANUARY;
        System.out.println("January");

    }

    public Month getMonth(int numOfMonth) {
        if (numOfMonth < 1 || numOfMonth > 12) {
            return null;
        }

        Month month;
        switch (numOfMonth) {
            case 1:
                month = Month.JANUARY;
                break;
            case 2:
                month = Month.FEBRUARY;
                break;
            case 3:
                month = Month.MARCH;
                break;
            case 4:
                month = Month.APRIL;
                break;
            case 5:
                month = Month.MAY;
                break;
            case 6:
                month = Month.JUNE;
                break;
            case 7:
                month = Month.JULY;
                break;
            case 8:
                month = Month.AUGUST;
                break;
            case 9:
                month = Month.SEPTEMBER;
                break;
            case 10:
                month = Month.OCTOBER;
                break;
            case 11:
                month = Month.NOVEMBER;
                break;
            case 12:
                month = Month.DECEMBER;
                break;
            default:
                month = null;
        }

        return month;
    }
}
