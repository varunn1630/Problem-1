//Varun Chaudhari
//UCF ID:4831096

import java.util.Scanner;
public class problem1 {
   public static String encrypt(String number) { // Line from Stack overflow
       int arr[] = new int[4];
       for(int i=0;i<4;i++) {
           char ch = number.charAt(i);
           arr[i] = Character.getNumericValue(ch); // Line from Stack overflow
       }
       //        System.out.println("Encrypted Value :"+encval);

       for(int i=0;i<4;i++) {
           int temp = arr[i] ;
           temp += 7 ;
           temp = temp % 10 ;
           arr[i] = temp ;
       }
       int temp = arr[0];
       arr[0] = arr[2];
       arr[2]= temp ;
       temp = arr[1];
       arr[1] =arr[3];
       arr[3] = temp ;
       int newNumber = 0 ;
       for(int i=0;i<4;i++)
           newNumber = newNumber * 10 + arr[i];
       String output = Integer.toString(newNumber); // Line from Stack overflow
       if(arr[0]==0)
           output = "0"+output;
       return output;
   }
   public static String decrypt(String number) { // Line from Stack overflow
       int arr[] = new int[4];
       for(int i=0;i<4;i++) {
           char ch = number.charAt(i);
           arr[i] = Character.getNumericValue(ch);
       }
       int temp = arr[0];
       arr[0]=arr[2];
       arr[2]=temp;
       temp = arr[1];
       arr[1]=arr[3];
       arr[3]=temp;
       for(int i=0;i<4;i++) {
           int digit = arr[i];
           switch(digit) {
               case 0: arr[i] = 3; // Lines from Stack overflow
                   break;
               case 1: arr[i] = 4;
                   break;
               case 2: arr[i] = 5;
                   break;
               case 3: arr[i] = 6;
                   break;
               case 4: arr[i] = 7;
                   break;
               case 5: arr[i] = 8;
                   break;
               case 6: arr[i] = 9;
                   break;
               case 7: arr[i] = 0;
                   break;
               case 8: arr[i] = 1;
                   break;
               case 9: arr[i] = 2;
                   break;
          //        int final=firstDigit, secondDigit, thirdDigit, fourthDigit;

          //    return 0;
           }
       }
       int newNumber = 0 ;
       for(int i=0;i<4;i++)
           newNumber = newNumber * 10 + arr[i];
       String output = Integer.toString(newNumber);
       if(arr[0]==0)
           output = "0"+output;
       return output;

   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a 4 digit integer:");
       //        System.out.print(" Enter Number Four Integer: ");

       String number = sc.nextLine();
       String encryptedNumber = encrypt(number);
       System.out.println("The decrypted number is:"+encryptedNumber);
       System.out.println("The original number is:"+decrypt(encryptedNumber));
       //    }
       //        int final=firstDigit, secondDigit, thirdDigit, fourthDigit;

       //    return 0;
   }
}