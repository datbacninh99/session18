import java.io.*;

public class BT2 {
    public static void main(String[] args) {
        File sourceFile = new File("source.txt");
        File targetFile = new File("target.txt");

        try (InputStream in = new FileInputStream(sourceFile);
             OutputStream out = new FileOutputStream(targetFile)) {

            // Kiểm tra nếu file nguồn không tồn tại
            if (!sourceFile.exists()) {
                System.out.println("File nguồn không tồn tại.");
                return;
            }

            // Cảnh báo nếu file đích đã tồn tại
            if (targetFile.exists()) {
                System.out.println("File đích đã tồn tại.");
            }

            // Sao chép nội dung từ file nguồn đến file đích
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }

            System.out.println("Đã sao chép " + sourceFile.length() + " byte từ " + sourceFile.getName() + " đến " + targetFile.getName());

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}