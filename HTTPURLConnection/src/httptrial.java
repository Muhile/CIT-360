import java.net.*;
import java.io.*;

public class httptrial {

	public static void main(String[] args) throws Exception {

		URL theWebPage = new URL("https://www.churchofjesuschrist.org/?lang=eng&_r=1");
		
		HttpURLConnection seePage = (HttpURLConnection)theWebPage.openConnection();
		
		BufferedReader getThePage = new BufferedReader(new InputStreamReader(seePage.getInputStream()));
		
		String httpCode;
		
		while((httpCode = getThePage.readLine()) != null) {
			if(httpCode.isEmpty() != true) {
				System.out.println(httpCode);
			} else {
				System.out.println("This is a blank line");
			}
		}
		
		for(int i=1;i<=8;i++){  
			System.out.println(seePage.getHeaderFieldKey(i)+" = "+seePage.getHeaderField(i));  
		}  
		getThePage.close();
	}

}
