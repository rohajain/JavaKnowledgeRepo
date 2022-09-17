import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Streams {

	public Streams() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int x = 10,y;
		//x= x++;
		//x = x++;
		//System.out.println(""+" "+x);
		
		//int[] a,b;  // b is array
		//int c[],d; // d is int
		
		float a=10,b=1;
		float c= a+b;
		
		Arrays.asList(1,2,3).stream()
				.filter(x -> x > 1)
				.map(x-> x*x*3)			
				.forEach(x-> System.out.println(x));
		
		
		
		try(Stream<String> stream = Files.lines(Paths.get("D://testData.txt"))) {
			
			
			stream.filter(x -> x.contains("soham"))
			.map(x -> x.toUpperCase())
			.forEach(x -> System.out.println(x));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Float i = new Float(2.0);
		Float j = new Float(1.1);
		System.out.println(i-j);
		System.out.println((float)(2.0-1.1));
		
		String sentence = "Program creek is a Java site.";
		Stream<String> wordStream = Pattern.compile("\\W").splitAsStream(sentence);
		String[] wordArr = wordStream.toArray(String[]::new);
		System.out.println(Arrays.toString(wordArr));
		
		
		
		
		
	}

}
