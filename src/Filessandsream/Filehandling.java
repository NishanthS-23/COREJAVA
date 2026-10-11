	package Filessandsream;

import java.io.File;
import java.io.IOException;

public class Filehandling {

	public static void main(String[] args)
	{
		File f=new File("D:\\eclipse\\eclipse\\COREJAVA\\src\\Filessandsream\\Inmakes.TXT");
		try {
			if(f.createNewFile())
			{
				System.out.println("file created");
			}
			else if(f.exists())
			{
				System.out.println("file already created");
				System.out.println("Is file read="+f.canRead());
				System.out.println("Is file write="+f.canWrite());
				System.out.println("file path"+f.getAbsolutePath());
				System.out.println("file hidden="+f.isHidden());
				
			}
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
