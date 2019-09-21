//Name: Varun Chaudhari
//UCF ID: 4831096

import java.util.Scanner;
public class problem3 {
        public static void main(String[] args) {
             Scanner scnr = new Scanner(System.in);
             // Array of topics
             String[] topics = {"Technology", "Roads", "Buildings", "Travel", "Education"};
             // Array of ratings

             int [][] ratings = new int [topics.length][];
             int i;
             int j;
             int people;
             int rating;
             // initializing the array of ratings with 0 initially
             for( i=0;i<ratings.length;i++)

             {
                    ratings[i] = new int[10];

                    for( j=0;j<ratings[i].length;j++)

                         ratings[i][j] = 0;
             }
             // Inputs the total number of people rating
             System.out.print("Enter the number of people rating: ");
             people = scnr.nextInt();
             for( i=0;i<people;i++)

             {
                //Input to rate each topic
                    System.out.println("Rate each topic in the scale 1-10 for the below "+topics.length+" topics : ");
                    for(j=0;j<topics.length;j++)

                    {

                           System.out.print("Enter your rating for "+topics[j]+" : ");

                           rating = scnr.nextInt();
                           while(rating < 1 || rating > 10)

                           {
                                 System.out.println("Rating should be between [1,10]");

                                 System.out.print("Enter your rating for "+topics[j]+" : ");

                                 rating = scnr.nextInt();
                           }
                           ratings[j][rating-1]++; // It increments the entry of the corresponding entry
                    }
             }
             // create array for storing average rating, taking integer average
             int avgRating[] = new int[topics.length];
             String highestPointIssue="" , lowestPointIssue="" ;
             int highestPointTotal = 0 , lowestPointTotal= 0;

             // loop to calculate the average rating, lowest point total and highets point total
             for(i=0;i<ratings.length;i++)

             {
                    avgRating[i] = 0;

                    for(j=0;j<ratings[i].length;j++)

                           avgRating[i] += (ratings[i][j]*(j+1));

                    if(i == 0)
                    {
                           highestPointTotal = avgRating[i];
                           lowestPointTotal= avgRating[i];
                           highestPointIssue = topics[i];
                           lowestPointIssue = topics[i];
                    }
                    else
                    {
                           if(avgRating[i] > highestPointTotal)
                           {
                                 highestPointIssue = topics[i];
                                 highestPointTotal = avgRating[i];
                           }
                           if(avgRating[i] < lowestPointTotal)

                           {
                                 lowestPointIssue = topics[i];
                                 lowestPointTotal= avgRating[i];
                           }
                    }
                    avgRating[i] = avgRating[i]/people;
             }
             System.out.printf("\n%-20s","");
             for(i=0;i<10;i++)
                    System.out.printf("%-10d",(i+1));
             System.out.printf("%20s","Average Rating");
             System.out.println();
             for(i=0;i<ratings.length;i++)

             {
                    System.out.printf("\n%-20s",topics[i]);
                    for(j=0;j<ratings[i].length;j++)
                           System.out.printf("%-10d",ratings[i][j]);
                    System.out.printf("%20d",avgRating[i]);
             }

             // It prints output of the topics with highest and lowest point total

             System.out.println("\nHighest Point total : "+highestPointTotal+" Issue : "+highestPointIssue);
             System.out.println("Lowest Point total : "+lowestPointTotal+" Issue : "+lowestPointIssue);
             scnr.close();
       }
}