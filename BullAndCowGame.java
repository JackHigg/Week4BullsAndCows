import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class BullAndCowGame{

    private List<Integer> digits=new ArrayList<Integer>();
    private String fullNumber;

    public BullAndCowGame(){

        this.setArray();
        this.setFullNumber();
        this.getGuess();

    }

    public void setArray(){

        GenerateNumbers N1 = new GenerateNumbers();
        digits = N1.getDigitArray();
        System.out.println(digits);

    }

    public void setFullNumber(){

       this.fullNumber=Integer.toString(digits.get(0))+Integer.toString(digits.get(1))+Integer.toString(digits.get(2))+Integer.toString(digits.get(3));

    }

    public void getGuess(){

         String guess;

        Scanner kboard = new Scanner(System.in);

        boolean result = false;
        int noOfGuesses=0;

        while (!result){

            System.out.println("\nPlease enter guess :");
            guess=kboard.next();

            noOfGuesses++;

            if (guess.length()<4){

                System.out.println("\nGuess must be for digits long");

            }
            else
            {
                result=checkGuess(guess);
            }



        }

        System.out.println("Congrats you have successfully guessed the correct number : "+fullNumber+" in "+noOfGuesses+" guesses");

    }

    public boolean checkGuess(String guess){

        boolean result = false;

        int cows=0;
        int bulls=0;

        List<Integer> bullLocation = new ArrayList<Integer>();
        List<Integer> guessDigits = new ArrayList<Integer>();

        guessDigits.add(Integer.parseInt(guess.substring(0,1)));
        guessDigits.add(Integer.parseInt(guess.substring(1,2)));
        guessDigits.add(Integer.parseInt(guess.substring(2,3)));
        guessDigits.add(Integer.parseInt(guess.substring(3,4)));

        System.out.println(guessDigits);


        if (digits.get(0)==Integer.parseInt(guess.substring(0,1))){

            bulls++;

            bullLocation.add(0,digits.get(0));

        }
        else
        {
            bullLocation.add(0,-1);
        }

        if (digits.get(1)==Integer.parseInt(guess.substring(1,2))){

            bulls++;

            bullLocation.add(1,digits.get(1));

        }
        else
        {
            bullLocation.add(1,-1);
        }

        if (digits.get(2)==Integer.parseInt(guess.substring(2,3))){

            bulls++;

            bullLocation.add(2,digits.get(2));

        }
        else
        {
            bullLocation.add(2,-1);
        }




        if (digits.get(3)==Integer.parseInt(guess.substring(3,4))){

            bulls++;

            bullLocation.add(3,digits.get(3));

        }
        else
        {
            bullLocation.add(3,-1);
        }

        for (int x:bullLocation){
            System.out.println("moooo bull");
            System.out.println(x);
        }




      if (guess.equalsIgnoreCase(fullNumber)){

          result = true;

      }
      else
      {
//          for(int digit : digits){
//
//
//
//
//                  if (digit==Integer.parseInt(guess.substring(0,1) ) && bullLocation.get(0)<0){
//
//                      cows++;
//
//                  }
//
//
//
//              if (digit==Integer.parseInt(guess.substring(1,2)) && bullLocation.get(1)<0){
//
//                  cows++;
//
//              }
//
//              if (digit==Integer.parseInt(guess.substring(2,3)) && bullLocation.get(2)<0){
//
//                  cows++;
//
//              }
//
//              if (digit==Integer.parseInt(guess.substring(3,4)) && bullLocation.get(3)<0){
//
//                  cows++;
//
//              }
//
//
//          }

           for (int digit : guessDigits){

               if (digit==Integer.parseInt(fullNumber.substring(0,1) ) && bullLocation.get(0)<0){

                      cows++;

                  }



              if (digit==Integer.parseInt(fullNumber.substring(1,2)) && bullLocation.get(1)<0){

                  cows++;

              }

              if (digit==Integer.parseInt(fullNumber.substring(2,3)) && bullLocation.get(2)<0){

                  cows++;

              }

              if (digit==Integer.parseInt(fullNumber.substring(3,4)) && bullLocation.get(3)<0){

                  cows++;

              }

           }


          System.out.println("\nScore");
          System.out.println("\nCows :"+cows);
          System.out.println("\nBulls :"+bulls);



      }

        return result;
    }




}
