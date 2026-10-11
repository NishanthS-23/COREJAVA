package Filessandsream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Flieoutpustream {

	public static void main(String[] args) {
		
	try {String s="I am A hava devops";
		FileOutputStream f1=new FileOutputStream ("D:\\eclipse\\eclipse\\COREJAVA\\src\\Filessandsream\\nishanth");
		FileOutputStream f2=new FileOutputStream ("D:\\eclipse\\eclipse\\COREJAVA\\src\\Filessandsream\\Suvetha");
		try {
			
			f1.write(1);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		// TODO Auto-generated method stub

	}

}
