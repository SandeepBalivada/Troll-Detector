import java.util.*;
import java.io.*;
public class trollDetect {
   
	public static void main(String[] args) {
		//System.out.println("This is just a demo text being used for trolls");
		/*int words[]= new int[100];
		words[0]=25;
		words[1]=30;*/
		String words[]= new String[100];
		/*words[0]="fuck";
		words[1]="douchebag";*/
		int totabs=0;
		
		
		try {
			//System.out.println(words[0]);
			File file = new File("abusivewords.txt");
			FileReader fr = new FileReader(file.getAbsoluteFile());
			BufferedReader br = new BufferedReader(fr);
			String text;
			int n=0;
			while((text = br.readLine()) != null )
			{
				words[n] = text;
				n++;
				totabs++;
			}
			//fr.close();
			//br.close();
			Scanner scan = new Scanner(System.in);
			while(true)
            {
			int detectflag=0;
			System.out.println("\n \nWhat do you wish to do? \n 1)Detect trolls \n 2)Display all abusive words being tracked \n 3)Update abusive words \n 4)Exit\n\n");
			int choice = scan.nextInt();
			if(choice==1)
			 {
			  System.out.println("Enter the text you wish to detect for trolls: \n");
			  scan.nextLine();
			  String str = scan.nextLine();
			  System.out.println("The string that you have entered is: "+"\""+str+"\"");
			  String strarr[]=str.split(" ");
			  for(int i=0;i<strarr.length;i++)
			  {
				//System.out.println(strarr[i]);
				for(int k=0;k<totabs;k++)
				{
					if(strarr[i].equalsIgnoreCase(words[k])){
						System.out.println("\n ***  Troll word "+words[k]+" has been detected *** \n");
						detectflag++;
					}
					
				}
			  }
			  if(detectflag==0)
			  	System.out.println("\n No words detected\n");
			 }
			else if(choice==2)
			{
				System.out.println("Abusive words that are being tracked are:");
				for(int i=0;i<totabs;i++)
					System.out.println(words[i]);
			}
			else if(choice==3)
			{  
			   System.out.println("Enter the number of abusive words you wish to Update:");
			   int noabsup = scan.nextInt();
			   scan.nextLine();
			   System.out.println("Sandeep"+" "+file);
			   FileWriter fw = new FileWriter(file,true);
			   BufferedWriter bw = new BufferedWriter(fw);
			   System.out.println("Enter those "+noabsup+" abusive words:");
			   int k= totabs;
			   for(int i=0;i<noabsup;i++)
			   {
			   	words[k+i] = scan.nextLine();
			   	bw.newLine();
			   	bw.append(words[k+i]);
			   	totabs++;
			   }
			   //fw.close();
			  bw.close();
			   System.out.println("Total "+totabs+" abusive words are being tracked now.They are:");
			   for(int i=0;i<totabs;i++)
			   {
			   	System.out.println(words[i]);
			   }
			}
			else if(choice==4)
			{
				break;
			}
     }
			scan.close();
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
	    

	}

}

