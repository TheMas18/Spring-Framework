package FileHandling;

import java.io.*;
import java.util.Scanner;

public class LearnFiles {
	public static void main(String[] args) throws Exception {

//			try {
//				int i=System.in.read();
//				System.out.println(i);//returns ascii value
//				System.out.println((char)i);//actual value
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

//		FileOutputStream fout = new FileOutputStream("Demo.txt");
//		fout.write(65);
//		String s = "Welcome to Automation Edge";
//		byte[] b = s.getBytes();
//		fout.write(b);
//		fout.close();

//		FileInputStream fin = new FileInputStream("Demo.txt");
//
//		int i = 0;
//		while ((i = fin.read()) != -1) {
//			System.out.print((char) i);
//		}
//		fin.close();

//		Console c=System.console();    
//		System.out.println("Enter your name: ");    
//		String n=c.readLine();    
//		System.out.println("Welcome "+n);    

//		FileOutputStream fout = new FileOutputStream("Demo.txt");
//		BufferedOutputStream bout = new BufferedOutputStream(fout);
//		String s = "Welcome to javaTpoint.";
//		byte b[] = s.getBytes();
//		bout.write(b);
//		bout.flush();

		FileInputStream fin = new FileInputStream("Demo.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		int i = 0;
		while ((i = bin.read()) != -1) {
			System.out.print((char)i);

		}
//		File obj=new File("File.xlsx");
//			try {
//				if(obj.createNewFile()) {
//					System.out.println("File is created " + obj.getName());
//				}
//				else {
//					System.out.println("File Already Exists " +obj.getName()+obj.getAbsolutePath());
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}

//			try {
//				FileWriter obj=new FileWriter("File.txt");
//				obj.write("Hello world Inside File");
//				obj.close();
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		File obj=new File("File.txt");
//		Scanner read;
//		try {
//			read = new Scanner(obj);
//			while(read.hasNextLine()) {
//				String data = read.nextLine();
//		        System.out.println(data);
//			}read.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		File obj=new File("File.xlsx");
//		if(obj.delete()) {
//			System.out.println("File Is deleted");
//		}else {
//			System.out.println("Failed to delete the file");
//		}
//		

	}
}
