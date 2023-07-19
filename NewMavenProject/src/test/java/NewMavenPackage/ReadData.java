package NewMavenPackage;
import java.io.IOException;
public class ReadData {

	public static void main(String[] args) throws IOException{
		ExcelCode e=new ExcelCode();
		System.out.println(e.readData(0,0));
		//System.out.println("Username is "+username);
		System.out.println(e.readData(0,1));
		//System.out.println("Password is "+password);
	}
}