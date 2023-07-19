package NewMavenPack;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		String s=Newxcel.getStringData(0,0);
		System.out.println(s);
		String n=Newxcel.getIntegerData(0,1);
		System.out.println(n);
	}

}
