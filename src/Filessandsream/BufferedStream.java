package Filessandsream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStream {

	public static void main(String[] args) {
		// Buffer- temporary storage,increase performance
		
   try {
	FileOutputStream fout=new FileOutputStream("E:/javaprogram/Buffer.txt");
	BufferedOutputStream bout=new BufferedOutputStream(fout);
	String msg="I love java program";
	byte b[]=msg.getBytes();
	
		bout.write(b);
		bout.close();
		fout.close();	
	
		FileInputStream fin=new FileInputStream("E:/javaprogram/Buffer.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		int x;
		while((x=bin.read())!=-1)
{
	System.out.print((char)x);
}
		bin.close();
		fin.close();
	} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
   }
	        catch(IOException e)
	           {
	           	e.printStackTrace();  
	        }
	

        }
	}
