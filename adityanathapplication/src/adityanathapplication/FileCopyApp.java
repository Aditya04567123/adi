package adityanath;

import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileCopyApp{
public static void main(String[] args) {
	try {
		FileInputStream fis = new FileInputStream("java.png");
		FileOutputStream fos = new FileOutputStream("java_copy.png");
		
		int byteData;
		while((byteData=fis.read())!=-1) {
			fos.write(byteData);
		}
		fis.close();
		fos.close();
		System.out.println("file copied");
	} catch (Exception e) {
		e.printStackTrace();
	}
 }
}

