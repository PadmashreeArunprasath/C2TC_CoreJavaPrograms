package Day3.Bufferreaderdemo;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderDemo {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("src\\Day3\\Bufferreaderdemo\\data.txt");
		BufferedReader br=new BufferedReader(fr);
		
		//to read a Single Line
		String content;
		content=br.readLine();
		System.out.println(content);
		
		//to read multiple lines
		while((content=br.readLine())!=null) {
			System.out.println(content);
		}
		br.close();
	}

}
