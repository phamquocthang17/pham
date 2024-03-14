import java.io.File;
import java.util.Scanner;

public class deletefile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn của tệp: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(file.getName() + " đã được xóa thành công.");
            } else {
                System.out.println("Xóa thất bại.");
            }
        } else {
            System.out.println("Tệp không tồn tại.");
        }
        scanner.close();
    }
}
