import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//test github

public class Myclass {

	public static void main(String[] args) throws IOException {
		String fileContent = readFileContent("/Users/shiyuwang/java_input.txt");
		System.out.println(fileContent);
	}

	// 参数string为你的文件名
	private static String readFileContent(String fileName) throws IOException {

		File file = new File(fileName);

		BufferedReader bf = new BufferedReader(new FileReader(file));

		String content = "";
		StringBuilder sb = new StringBuilder();

		while (content != null) {
			content = bf.readLine();

			if (content == null) {
				break;
			}

			sb.append(content);
		}

		bf.close();
		return sb.toString();
	}
}