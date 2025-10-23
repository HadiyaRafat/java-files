package Data;
import java .io.*;
public class BufferedExample {

	public static void main(String[] args) throws IOException {
		BufferedReader B=new BufferedReader (new InputStreamReader(System.in));
		double eng,sci,maths;
		System.out.println("Read the percentage :  ");
		eng=Double .parseDouble(B.readLine());
		sci=Double .parseDouble(B.readLine());
		maths=Double .parseDouble(B.readLine());
		double percentage =((eng+sci+maths)/3);
		System.out.println("The Percentage is :"+percentage);
		String s =(percentage>=75)?"A grade":(percentage>60)?"B grade":(percentage>50)?"C grade":"D grade";
		System.out.println(s);
		
		

	}

}
