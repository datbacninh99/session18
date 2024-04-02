import java.io.*;
import java.util.*;

public class BT4 {
    public static void main(String[] args) throws Exception {
        // Tạo file gốc và nhập văn bản
        File sourceFile = new File("source.txt");
        File targetFile = new File("target.txt");

        // Đọc văn bản thành string
        BufferedReader br = new BufferedReader(new FileReader(sourceFile));
        String line;
        StringBuilder sb = new StringBuilder();

        while ((line = br.readLine()) != null) {
            // Convert string thành mảng string với mỗi string là 1 từ
            String[] words = line.split(" ");

            // Đảo ngược mảng string và đổi lại thành 1 string
            List<String> wordList = Arrays.asList(words);
            Collections.reverse(wordList);
            sb.append(String.join(" ", wordList)).append("\n");
        }
        br.close();

        // Ghi ra file mới
        BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile));
        bw.write(sb.toString());
        bw.close();
    }
}