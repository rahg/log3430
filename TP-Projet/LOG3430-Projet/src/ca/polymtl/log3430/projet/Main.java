package ca.polymtl.log3430.projet;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String filenameA = "", filenameB = "";
		boolean lemmeComp = false;
		int minLength = 0, minPercentage = 0;
		
		for(int i = 0; i < args.length; i++) {		
			int nextI = i + 1;
			switch(args[i]) {
				case "-a":
					if(nextI > args.length || args[nextI].charAt(0) == '-') {
						System.out.println("Erreur argument: -a");
						System.exit(-1);
						break;
					}
					
					filenameA = args[i];

					break;
					
				case "-b":
					if(nextI > args.length || args[nextI].charAt(0) == '-') {
						System.out.println("Erreur argument: -b");
						System.exit(-1);
						break;
					}
					
					filenameB = args[i];

					break;
					
				case "-c":
					if(nextI > args.length || args[nextI].charAt(0) == '-') {
						System.out.println("Erreur argument: -c");
						System.exit(-1);
						break;
					}
					
					if(args[nextI] == "true") {
						lemmeComp = true;
					}

					break;
					
				case "-l":
					if(nextI > args.length || args[nextI].charAt(0) == '-') {
						System.out.println("Erreur argument: -l");
						System.exit(-1);
						break;
					}
					
					minLength = Integer.valueOf(args[nextI]);

					break;
					
				case "-p":
					if(nextI > args.length || args[nextI].charAt(0) == '-') {
						System.out.println("Erreur argument: -p");
						System.exit(-1);
						break;
					}
					
					minPercentage = Integer.valueOf(args[nextI]);

					break;
			}
		}
			
		PlagiDetector detector = new PlagiDetector(filenameA, filenameB, lemmeComp, minLength, minPercentage);
	}
}
