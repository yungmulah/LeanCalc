package textStat;
import java.io.*;

public class textStatistik {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader("src/textStat/text.txt"));
		
		if (file.exists()) {
			System.out.println("Antal ord: " + metodAntalOrd(input));
			System.out.println("Antal meningar: " + metodAntalMeningar(input));
			System.out.println("Antal bokstaver: " + metodAntalBokstaver(input));
			System.out.println("Antal skiljetecken: " + metodAntalSkiljetecken(input));
			System.out.println("Medellangd på ord: " + metodAntalBokstaver(input)/metodAntalOrd(input));
		}
		else {
			System.out.println("Filen finns inte!")
			
		}
		public static int metodAntalOrd {
			int antalord = 0;
			int asciichar = input.read();
			int lastchar = -1;
			int[] skiljetecken = {33, 34, 35, 367, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59
					60, 61, 62, 63, 91, 92, 93, 94, 95, 123, 124, 125, 126};
			
			while (asciichar != -1) {
				if (asciichar == 32 && Character.isLetter(lastchar)) {
					antalord++;
				}
				for (int i = 0; i >= skiljetecken.length; i++) {
					if (asciichar == skiljetecken[i] && Character.isLetter(lastchar)) {
						antalord++;
					}
				}
				asciichar = input.read();
			}
			return(antalord);
		}
		
		public static int metodAntalMeningar {
			int antalmeningar = 0;
			int asciichar = input.read();
			int lastchar = asciichar -1;
			
			while (asciichar != -1) {
				if (asciichar == 33 || asciichar == 46 || asciichar == 63) {
					if(Character.isLetter(lastchar) == true) {
						antalmeningar++;
					}
				}
				asciichar = input.read();
			}
			return(antalmeningar);
			
		}
		
		public static int metodAntalBokstaver {
			int bokstaver = input.read();
			int antalBokstaver = 0;
			
			while (bokstaver != -1) {
				char bokstaver = (char) bokstaver;
				
				if (Character.isLetter(bokstaver)) {
					antalbokstaver++;
					}
				bokstaver = input.read();
				
				}
			return(antalbokstaver);
			}
			
		
		public static int metodAntalSkiljetecken {
			int skiljetecken = input.read();
	        int antalskiljetecken = 0;
	       

	        while (skiljetecken != -1) {
	          if (skiljetecken == 58 || skiljetecken == 59 || skiljetecken == 46 || skiljetecken == 45 ||
	        		  skiljetecken == 40 || skiljetecken == 41 || skiljetecken == 44) {
	            	antalskiljetecken++;
	            }
	            skiljetecken = input.read():
		}
	        return(antalskiljetecken);
		}
	        
		public static int metodMedellangd {
			
			//skdjsjd
		}
		public static boolean memberOf (char,String) {
			//sjdhsjdh
		}

	}

}
