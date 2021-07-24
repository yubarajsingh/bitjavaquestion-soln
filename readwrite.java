import java.io.*;
import java.util.*;
class WriteRead{
    public static void main(String args[]) throws Exception{
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter you word");
        String wor=sc.nextLine();
        FileWriter fr= new FileWriter("abc.txt");
        System.out.println("written successfully and saved");
        fr.write(wor);
        fr.close();
        System.out.println("file closed");
        
        FileReader re= new FileReader("abc.txt");
        System.out.println("the written word in file are");
        int i;
        while((i=re.read())!=-1){
            System.out.println((char)i);
        }

    }
}