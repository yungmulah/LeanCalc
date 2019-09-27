package textStat;
import java.io.*;

public class textTesting {

	public static void main (String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader("src/textStat/text.txt"));

		        int karaktarer1 = input.read();
		        int antalbokstaver = 0;

		        while (karaktarer1 != -1) {
		            char karaktarer = (char) karaktarer1;
		          
		            if (Character.isLetter(karaktarer1) ) {
		            	antalbokstaver++;
		            }
		            karaktarer1 = input.read();

		            }
		        System.out.println(antalbokstaver);		            
		            
		        }
		        
		        

	}


