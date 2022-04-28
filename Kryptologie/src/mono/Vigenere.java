package mono;

public class Vigenere {

	public static char shift(char c, int k) {
	    return (char) ((( c - 65 + k ) % 26 ) + 65 );
	  }
	  
	  public static String vigenere(String arg, String keyword) {
	    String res = "";
	    
	    for(int i=0; i<arg.length(); i++) {
	      char c = arg.charAt(i);
	      res += shift (c, keyword.charAt(i % keyword.length()) - 65);
	    
	    }
	    
	    return res;
	  }
	  
	  public static String vigenereDecode(String arg, String keyword) {
	    String res = "";
	    
	    for(int i=0; i<arg.length(); i++) {
	      char c = arg.charAt(i);
	      res += shift (c, 26 - (keyword.charAt(i % keyword.length()) - 65));
	    
	    }
	    
	    return res;
	  }
	  
	  public static void main(String[] args) {
	    String plain = "VINIVIDIVICI";
	    String plain2 = "WVHBPAEZPBWA";
	    String keyword = "BRUTUS";
	    
	    String cipher = vigenere(plain, keyword);
	    String cipher2 = vigenereDecode(plain2, keyword);
	   
	    System.out.println( "Klartext:" + plain );
	    System.out.println( "Codewort:" + keyword );
	    System.out.println( "Geheimtext:" + cipher );
	    
	    System.out.println( "" );
	    
	    System.out.println( "Geheimtext:" + plain2 );
	    System.out.println( "Codewort:" + keyword );
	    System.out.println( "Klartext:" + cipher2 );
	    
	  }


}
