import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BT1 {
    public static void main(String[] args) throws Exception {
        String line;
        int count = 0;
        File file = new File("data.txt");

        // Tạo file nếu file không tồn tại
        try {
            boolean value = file.createNewFile();
            if (value){
                System.out.println("File đã được tạo");
            }
        } catch (Exception e){
            e.getStackTrace();
        }

        // Đọc file
        FileReader file2 = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(file2);

        // Nhận từng dòng cho đến hết file
        while((line = br.readLine()) != null) {
            // Chia mỗi dòng thành các từ
            String words[] = line.split(" ");
            // Đếm từng từ
            count = count + words.length;
        }

        // In ra số lượng từ trong file
        System.out.println("Số từ hiện tại ở file là: " + count);
        br.close();
    }
}