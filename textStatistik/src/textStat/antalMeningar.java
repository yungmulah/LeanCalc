package textStat;
import java.io.*;

public class antalMeningar {

	public static void main (String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader("src/textStat/text.txt"));
		
		int skiljetecken = input.read();
        int antalskiljetecken = 0;
       

        while (skiljetecken != -1) {
          if (skiljetecken == 58 || skiljetecken == 59 || skiljetecken == 46 || skiljetecken == 45 ||
        		  skiljetecken == 40 || skiljetecken == 41 || skiljetecken == 44) {
            	antalskiljetecken++;
            }
            skiljetecken = input.read();

            }
        System.out.println(antalskiljetecken);		            
		        
	
		        
		        
	}
}


