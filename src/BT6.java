import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class BT6 {
    public static void main(String[] args) throws Exception {
        // Đọc nội dung từ tệp văn bản
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line;
        Map<String, Integer> frequencyMap = new HashMap<>();

        while ((line = br.readLine()) != null) {
            // Tính toán tần suất xuất hiện của từng từ
            String[] words = line.split(" ");
            for (String word : words) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        // Xác định từ được sử dụng nhiều nhất
        String mostFrequentWord = "";
        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentWord = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        // Hiển thị từ được sử dụng nhiều nhất
        System.out.println("Từ được sử dụng nhiều nhất: " + mostFrequentWord + " (tần suất: " + maxFrequency + ")");

        br.close();
    }
}