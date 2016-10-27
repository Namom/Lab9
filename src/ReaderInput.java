import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;

public class ReaderInput {
	public static void main(String[] args) throws IOException{
		Reader.init(new FileInputStream(new File("data/input.txt")));
		Reader.setDelimeter("\t");
		String S;
		S = Reader.next();
		System.out.println(S);
	}
}