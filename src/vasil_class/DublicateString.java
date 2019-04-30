package vasil_class;

public class DublicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dublicateWords(new String[] {  "cactus", "alina", "alina","bojan", "bojan", "cactus", "cactus" }));
	}

	public static int dublicateWords(String[] args) {
		
int dubl=0;
		for (int i = 0; i < args.length; i++) {
			int count = 0;	
			for (int j = i+1; j < args.length; j++) {
				if (args[i].equals(args[j])&& i != j) {
					count++;
					// args[j]="0";
					//System.out.println(args[j]);
				}
			}
			if (count == 1) {
				dubl++;
				//System.out.println(args[j]);
				// Printing the word along with count

			}

		}
		return dubl;

	}
}
