import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class BT3 {
    public static void main(String[] args) throws Exception {
        String line;
        List<String> longestWords = new ArrayList<>();
        int maxLength = 0;

        // B1: Đọc file thành String
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));

        // B2: Convert thành mảng string với mỗi từ là 1 phần tử
        while ((line = br.readLine()) != null) {
            String[] words = line.split(" ");

            // B3: Tạo 1 list string để lưu các từ tìm được
            // B4: Duyệt mảng tìm length lớn nhất
            for (String word : words) {
                if (word.length() > maxLength) {
                    longestWords.clear();
                    longestWords.add(word);
                    maxLength = word.length();
                } else if (word.length() == maxLength) {
                    longestWords.add(word);
                }
            }
        }

        // B5: Tạo vòng lặp in ra các từ có độ dài lớn nhất, và độ dài của chúng
        System.out.println("Các từ có độ dài lớn nhất là: ");
        for (String word : longestWords) {
            System.out.println(word + " (độ dài: " + maxLength + ")");
        }

        br.close();
    }
}