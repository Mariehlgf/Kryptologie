package mono;

public class Caesar {
	
	public static String klartext = "HALLO";
	public static String geheimtext = "";
	public static int key = 1;
	
	public static String verschluesseln() {
		System.out.println(klartext);
		
		for (int i = 0; i<klartext.length(); i++) {
			char c = klartext.charAt(i);
			int cInt = (int) c + key;
			if (cInt > 90) {
				cInt = cInt - 26;
			}
			if (cInt < 65) {
				cInt = cInt + 26; 
			}
			c = (char) cInt;
			geheimtext += c;
		}
		return geheimtext;
	}

	public static String entschluesseln() {
		System.out.println(geheimtext);
		
		while (key < 26) {
			klartext = "";
			for (int i = 0; i<geheimtext.length(); i++) {
				char c = geheimtext.charAt(i);
				int cInt = (int) c - key;
				if (cInt > 90) {
					cInt = cInt - 26;
				}
				if (cInt < 65) {
					cInt = cInt + 26; 
				}
				c = (char) cInt;
				klartext += c;
			}
			System.out.println( "key" + key + ":" + klartext);
			key++;
		}
		return klartext;
	}
	
	public static void main(String[] args) {
		System.out.println(verschluesseln());
		entschluesseln();

	}

}
