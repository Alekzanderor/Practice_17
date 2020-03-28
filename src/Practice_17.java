import java.io.*;
import  java.util.Scanner;

public class Practice_17 {

    public static void main(String[] args) {

        String text;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type 'stop' to stop");

        try (FileWriter fw = new FileWriter("Practice_17.txt"))
        {
            do{
                System.out.print(": ");
                text=br.readLine();
                if(text.compareTo("stop")==0) break;

                text=text+"\r\n";
                fw.write(text);
            } while (text.compareTo("stop")!=0);
        }catch (IOException exc){
            System.out.println("Error IO:"+exc);
        }
    }
}