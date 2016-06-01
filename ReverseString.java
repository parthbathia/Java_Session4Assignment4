import java.io.*;

public class ReverseString {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		System.out.print("Enter a String : ");
		String str = br.readLine();
		String rev = new StringBuffer(str).reverse().toString();
		
		System.out.println("Entered String : " + str);
		System.out.println("\nReverse of Entered String : " + rev );
		

	}

}
