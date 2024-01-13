import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		// Map 형태의 자료를 사용하는 경우?
		Map<Long, Integer> map = new HashMap<>();

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			Long num = Long.parseLong(br.readLine());
			int value;

			try {
				value = map.get(num);

			} catch (Exception e) {
				value = 0;
			}

			map.put(num, value + 1);

		}

		int MAX_VALUE = 0;
		long result = 2147040000;

		for (Entry<Long, Integer> entry : map.entrySet()) {
			int nowValue = entry.getValue();

			if (MAX_VALUE < nowValue) {

				MAX_VALUE = nowValue;
			}

		}

		for (Entry<Long, Integer> entry : map.entrySet()) {
			Long nowKey = entry.getKey();
			int nowValue = entry.getValue();
			if (nowValue == MAX_VALUE && nowKey < result) {

				result = nowKey;
			}

		}

		System.out.println(result);

	}

}
