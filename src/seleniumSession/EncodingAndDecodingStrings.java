package seleniumSession;

import org.bouncycastle.util.encoders.Base64;

public class EncodingAndDecodingStrings {

	public static void main(String[] args) {

		String str= "test123";
		byte[]encodedString=Base64.encode(str.getBytes());
		System.out.println("Encoded string: "+new String(encodedString));
		
		//Decode
		byte[] decodedString=Base64.decode(encodedString);
		System.out.println("Decoded String: "+new String(decodedString));
		
	}

}
