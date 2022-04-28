package mono;

public class ChuckNorris {

	public static String alphabet(String codewort) {
		String alphabet = "";
		for (int i=0; i < codewort.length(); i++) {
			//if(!alphabet.contains(codewort.charAt(i))
		}
		
		return alphabet;
	}
	
	public static void main(String[] args) {
		
		String cipher13 ="GDY HENSLDYY, GDY LXDB HEUEX  QEEZE, CEXFEEXZE NFXE QEUEXHEXZE";
		
		cipher13 = cipher13.replaceAll(" ", "");
		cipher13 = cipher13.replaceAll(",", "");
	    
	    System.out.println(cipher13);
	    System.out.println(alphabet("CHUCKNORRIS"));
	    
	    System.out.println(cipher13.contains("GDY"));
	}

}
