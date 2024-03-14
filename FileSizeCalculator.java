import java.io.File;
import java.util.Scanner;

public class FileSizeCalculator {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để đọc đường dẫn từ người dùng
        Scanner scanner = new Scanner(System.in);
        
        // Yêu cầu người dùng nhập đường dẫn của tệp
        System.out.print("Nhập đường dẫn của tệp: ");
        String filePath = scanner.nextLine();

        // Tạo một đối tượng File với đường dẫn đã nhập
        File file = new File(filePath);

        // Kiểm tra xem tệp có tồn tại không
        if (file.exists()) {
            // Lấy độ lớn của tệp (đơn vị byte)
            long fileSize = file.length();
            
            // Chuyển đổi độ lớn của tệp sang đơn vị kilobyte
            double fileSizeKB = fileSize / 1024.0;
            
            // In ra màn hình độ lớn của tệp
            System.out.println("Kích thước của tệp là: " + fileSizeKB + " KB");
        } else {
            // Nếu tệp không tồn tại, thông báo lỗi
            System.out.println("Lỗi: Tệp không tồn tại.");
        }
        scanner.close();
    }
}
