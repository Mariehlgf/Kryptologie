package mono;

public class MonoKidd {

	public static void main(String[] args) {
		
		String cipher =		
				
				  "53##+305))6*;4826)4#.)4#);806*;48+8$60))85;1#(;:#*"
				+ "8+83(88)5*+;46(;88*96*?;8)*#(;485);5*+2:*#(;4956*2"
				+ "(5*-4)8$8*;4069285);)6+8)4##;1(#9;48081;8:8#1;48+8"
				+ "5;4)485+528806*81(#9;48;(88;4(#?34;48)4#;161;:188;"
				+ "#?;";

		System.out.println( cipher.charAt(1) ); //liefert das Zeichen an der Position 1 in Cipher (=3)
		System.out.println( cipher.length() ); //liefert die Länge des Strings Cipher (=Anzahl der Zeichen = 203)
		
		//ASCII-Codes Umwandlung eines Zeichens in den zugehörigen ASCII-Code
		System.out.println( (int) 'Z' );
		//ASCII-Codes Umwandlung eines ASCII-Codes in das zugehörige Zeichen
		System.out.println( (char) 65);
		
		String klar = "";
		klar += "A";
		System.out.println(klar);
		klar += "G";
		System.out.println(klar);
		
	}

}
