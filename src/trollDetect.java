import java.util.*;
import java.io.*;
public class trollDetect {
   

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is just a demo text being used for trolls");
		/*int words[]= new int[100];
		words[0]=25;
		words[1]=30;*/
		String words[]= new String[100];
		words[0]="hell lot of strings";
		words[1]="another string under use";
		//int k=1;
		System.out.println(words[0]);
		Scanner scan = new Scanner(System.in);
		System.out.println("What do you wish to do? \n 1)Detect trolls \n 2)Update abusive words \n 3)Exit");
		int choice = scan.nextInt();
		if(choice==1)
		 {
		  System.out.println("Enter the text you wish to detect for trolls:");
		  String str1 = scan.nextLine();
		  String str = scan.nextLine();
		  System.out.println("The string that you have entered is: "+"\""+str+"\"");
		  String strarr[]=str.split(" ");
		  for(int i=0;i<strarr.length;i++)
		  {
			System.out.println(strarr[i]);
		  }
		 }
		else if(choice==2)
		{
			
		}
	    scan.close();
	    

	}

}
