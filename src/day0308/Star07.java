package day0308;

import java.util.Scanner;
  public class Star07 {
     public static void main(String[] args) {
          // TODO Auto-generated method stub
         Scanner scanner = new Scanner(System.in);
         System.out.println("출력할 줄 수를 입력해주세요");
         int userNumber= scanner.nextInt();
          
         //윗 부분을 담당하는 i for문 
         for(int i=1; i<=userNumber-1; i++) {
             String stars = new String();
             for(int j=1; j <=i; j++) {
                 stars+="*";
             }
             
             System.out.println(stars);
         }
         
         //아랫부분을 담당하는 i for문
         for(int i=1; i<=userNumber; i++) {
             String stars = new String();
             for(int j=i; j<=userNumber; j++) {
                 stars += "*";
             }
             System.out.println(stars);
         }
         
         scanner.close();
     }
}
