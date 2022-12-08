package hust.soict.dsai.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class GarbageCreator {
	public static void main(String[] args) throws IOException {

		String fileName="/OtherProject/src/hust/soict/dsai/garbage/text.txt";
		byte[] inputBytes= {0};
		long startTime,endTime;
		
		inputBytes= Files.readAllBytes(Paths.get(fileName));
		startTime = System.currentTimeMillis();
		String outString ="";
		for(byte b : inputBytes) {
			outString+=(char)b;
		}
		endTime=System.currentTimeMillis();
		System.out.println(endTime-startTime);
		}
	}

