import java.util.*;

public class A1113364_0421_2 {
    public static void main(String[] args){
      
        Scanner sc=new Scanner(System.in);
        String date;
        boolean format;
        
        do{
            System.out.println("請輸入西元年月日(請以YYYY/MM/DD或MM/DD/YYYY的格式):");
            date=sc.nextLine();

            if(date.matches("[0-9]{4}/[0-1]{1}[0-9]{1}/[0-3]{1}[0-9]{1}")||date.matches("[0-1]{1}[0-9]{1}/[0-3]{1}[0-9]{1}/[0-9]{4}")){             
                format=true;
                System.out.println("你輸入的年月日為:"+date);
                
            } else{
                System.out.println("輸入錯誤，請重新輸入");
                format=false;
             }
        }
        while(!format);
        sc.close();
    }
}