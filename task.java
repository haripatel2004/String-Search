import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.Scanner;

class task{
    public static void main(String[] args) {
        File input=new File(input.txt);
        FileReader fr=null;
        Scanner ob=new Scanner(System.in);
        String Searchword,str;
        System.out.print("enter word you want to search:");
        Searchword=ob.nextLine();

            fr=new FileReader(input);
            BufferedReader br=new BufferedReader(fr);
         while((str=br.readLine())!=null)
         {
            if(str.contains(Searchword))
            {
                System.out.print(str);
            }
         }
        fr.close();
    }
}