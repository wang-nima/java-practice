import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//test github

public class Myclass {

	public static void main(String[] args) throws IOException {
		String fileContent = readFileContent("/Users/shiyuwang/students.txt");
		System.out.println(fileContent);
	}

	// 参数string为你的文件名
	private static String readFileContent(String fileName) throws IOException {

		File file = new File(fileName);

		BufferedReader bf = new BufferedReader(new FileReader(file));

		String content = "";
		StringBuilder sb = new StringBuilder();
		
		int i = 0;
		while (true) {
			content = bf.readLine();
			if(content == null)
				break;
			i++;
			String a[] = content.split(", ");  
			sb.append(a[0]+" ");  
			sb.append(a[1]+" "); 
			sb.append(a[2]+" \n"); 

		}
		sb.append(i);
		bf.close();
		return sb.toString();
	}
}