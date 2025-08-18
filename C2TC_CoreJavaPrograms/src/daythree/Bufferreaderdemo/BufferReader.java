package daythree.Bufferreaderdemo;
import java.io.*;
public class BufferReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//used for efficient reading by wrapping the data
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		int age=Integer.parseInt(br.readLine());
		System.out.println(name + ":"+ age);
	}

}
