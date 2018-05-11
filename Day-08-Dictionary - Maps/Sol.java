import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       Map<String,Integer> NameNumber = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            NameNumber.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            Integer a = NameNumber.get(s);
          if(a!=null){
                System.out.println(s+"="+ a);
            }
            else{
                System.out.println("Not found");
            }
            
        }
        in.close();
    }
}
