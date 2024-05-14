import java.util.Scanner;
import java.util.regex.Pattern;

public class common {
    private static final String INT_GREATER_THAN_ZERO_REGEX = "^([1-9][0-9]*)";
    private static final String BA_REGEX = "^BA-\\d{3}$";
    private static final String BN_REGEX = "^BN-\\d{3}$";
    private static final String DATE_REGEX ="\\d{2}/\\d{2}/\\d{4}";
    public static Scanner scannerInteger = new Scanner(System.in);
    public static Scanner scannerDouble = new Scanner(System.in);
    public static Scanner scannerString = new Scanner(System.in);
    public static int ScannerInteger() {
        try {
            return scannerInteger.nextInt();
        } catch (Exception e) {
            System.out.println("Nhập sai định dạng.");
            System.out.println("Vui lòng nhập lại.");
            scannerInteger.nextLine();
            return ScannerInteger();
        }
    }
    public static double ScannerDouble() {
        try {
            return scannerDouble.nextDouble();
        } catch (Exception e) {
            System.out.println("Nhập sai định dạng.");
            System.out.println("Vui lòng nhập lại.");
            scannerDouble.nextLine();
            return ScannerDouble();
        }
    }
    public static String ScannerDate() {
        Pattern pattern = Pattern.compile(DATE_REGEX);
        try {
            String information = scannerString.nextLine();
            if (!pattern.matcher(information).matches()) {
                throw new Exception();
            }
            return information;
        } catch (Exception e) {
            System.out.println("Phải đúng định dạng dd/MM/yyyy");
            System.out.println("Vui lòng nhập lại.");
            return ScannerDate();
        }
    }



    public static String ScannerString() {
        try {
            return scannerString.nextLine();
        } catch (Exception e) {
            System.out.println("Nhập sai định dạng.");
            System.out.println("Vui lòng nhập lại.");
            scannerString.nextLine();
            return ScannerString();
        }
    }

    public static int ScannerIntGreaterThanZero() {
        Pattern pattern = Pattern.compile(INT_GREATER_THAN_ZERO_REGEX);
        try {
            int information = scannerInteger.nextInt();
            if (!pattern.matcher(String.valueOf(information)).matches()) {
                throw new IllegalArgumentException();
            }
            return information;
        } catch (IllegalArgumentException iae) {
            System.out.println("Hãy bắt đầu từ 1.");
            System.out.println("Vui lòng nhập lại.");
            scannerInteger.nextLine();
            return ScannerIntGreaterThanZero();
        } catch (Exception e) {
            System.out.println("Nhập sai định dạng.");
            System.out.println("Vui lòng nhập lại.");
            scannerInteger.nextLine();
            return ScannerIntGreaterThanZero();
        }
    }
    public static String ScannerBA() {
        Pattern pattern = Pattern.compile(BA_REGEX);
        try {
            String information = scannerString.nextLine();
            if (!pattern.matcher(information).matches()) {
                throw new Exception();
            }
            return information;
        } catch (Exception e) {
            System.out.println("Mã bệnh án phải đúng định dạng BA-XXX, với XXX là các kí tự số.");
            System.out.println("Vui lòng nhập lại.");
            return ScannerBA();
        }
    }
    public static String ScannerBN() {
        Pattern pattern = Pattern.compile(BN_REGEX);
        try {
            String information = scannerString.nextLine();
            if (!pattern.matcher(information).matches()) {
                throw new Exception();
            }
            return information;
        } catch (Exception e) {
            System.out.println("Mã bệnh nhân phải đúng định dạng BN-XXX, với XXX là các kí tự số.");
            System.out.println("Vui lòng nhập lại.");
            return ScannerBN();
        }
    }
}
