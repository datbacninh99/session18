import java.io.BufferedReader;
import java.io.FileReader;

public class BT5 {
    public static void main(String[] args) throws Exception {
        // Mở file CSV
        BufferedReader br = new BufferedReader(new FileReader("countries.csv"));
        String line;

        // Đọc từng dòng của file
        while ((line = br.readLine()) != null) {
            // Chia dòng thành các phần tử dựa trên dấu phẩy
            String[] country = line.split(",");

            // Hiển thị thông tin về quốc gia
            System.out.println("ID: " + country[0] + ", Code: " + country[1] + ", Name: " + country[2]);
        }

        br.close();
    }
}