import java.util.Scanner;
import java.util.Random;

public class Monopoly{

    // simulate the roll
    public static int roll(String roll, int total)
    {
       total = 0;

            Random rand = new Random();
            int random = rand.nextInt(12);

            // imports the random number into methodDice1 and 2 and gets the total of the roll
            int die1 = methodDice1(random);
            int die2 = methodDice2(random);
            total = die1 + die2;
            System.out.println("You rolled a " + die1 + " and a "+ die2 + " so move " + total + " spaces." );



        return total;
    }



    //***************************************************
    // dice roll method dice 1
    // it kept rolling the same thing so I wrote the integers made the
    // integers random to make it look more random and added more options
    public static int methodDice1(int a)
    {


        int dice = 0;


        int[] array = {3,2,5,4,6,1,2,1,5,3,4,6};

        dice = array[a];

        return dice;
    }

    // dice roll method dice 2
    // it kept rolling the same thing so I wrote the integers made the integers random to make it look more random and added more options
    public static int methodDice2(int a)
    {


        int dice = 0;


        int[] array = {2,1,5,3,4,6,3,2,5,4,6,1};

        dice = array[a];

        return dice;
    }

    //**********************************************
    // Main method
    public static void main(String[] args){
        //Welcoming the player and explaining how the game goes
        System.out.println();
        System.out.print("Welcome to Monopoly!\n\nThere are three (3) players, the game ends when someone types \"quit\" \ninstead of roll or when two of the three players go bankrupt.");
        System.out.println(" Each \nplayer will begin with $1500.");
        System.out.println();
        System.out.println("Select your game piece by choosing a number:");
        System.out.println("(1) Scottish Terrier \n(2) Battleship \n(3) Race Car \n(4) Top Hat \n(5) Cat\n");


        //Players pick their pieces
        Scanner scnr = new Scanner(System.in);

        // player 1 picking their game piece
        System.out.println("Player 1 pick your game piece:");


        int p1 = scnr.nextInt();
        String gp1 = " ";


        if (p1 == 1) {
            gp1 = "Scottish Terrier";
        } else if (p1 == 2) {
            gp1 = "Battleship";
        } else if (p1 == 3) {
            gp1 = "Race Car";
        }
        else if (p1 == 4) {
            gp1 = "Top Hat";
        }
        else if (p1 == 5) {
            gp1 = "Cat";
        }
        else {
            // code to keep letting them pick until they get it
            System.out.println("That's not one of the options please try again");
            int h = 0;
            for  (h=0; p1!=1 && p1!=2 && p1!=3 && p1!=4 && p1!=5 ; h++)
            {
                p1 = scnr.nextInt();
                if (p1 == 1) {
                    gp1 = "Scottish Terrier";
                } else if (p1 == 2) {
                    gp1 = "Battleship";
                } else if (p1 == 3) {
                    gp1 = "Race Car";
                }
                else if (p1 == 4) {
                    gp1 = "Top Hat";
                }
                else if (p1 == 5) {
                    gp1 = "Cat";
                }
                else {
                    System.out.println("That's not one of the options please try again");}
            }
        }




        System.out.println("Player 1 is a " + gp1 + "!\n");

//-------------------------------------------------------------
        System.out.println("Player 2 pick your game piece:");

        int p2 = scnr.nextInt();
        String gp2 = " ";


        if (p2 == 1) {
            gp2 = "Scottish Terrier";
        } else if (p2 == 2) {
            gp2 = "Battleship";
        } else if (p2 == 3) {
            gp2 = "Race Car";
        }
        else if (p2 == 4) {
            gp2 = "Top Hat";
        }
        else if (p2 == 5) {
            gp2 = "Cat";
        }
        else {

            System.out.println("That's not one of the options please try again");
            int h = 0;
            for (h = 0; p2 != 1 && p2 != 2 && p2 != 3 && p2 != 4 && p2 != 5; h++) {
                p2 = scnr.nextInt();
                if (p2 == 1) {
                    gp2 = "Scottish Terrier";
                } else if (p1 == 2) {
                    gp2 = "Battleship";
                } else if (p1 == 3) {
                    gp2 = "Race Car";
                } else if (p1 == 4) {
                    gp2 = "Top Hat";
                } else if (p1 == 5) {
                    gp2 = "Cat";
                } else {
                    System.out.println("That's not one of the options please try again");
                }

            }
        }// else bracket

            System.out.println("Player 2 is a " + gp2 + "!\n");

            //------------------------------------------------------------------------
            System.out.println("Player 3 pick your game piece:");
            int p3 = scnr.nextInt();
            String gp3 = " ";


            if (p3 == 1) {
                gp3 = "Scottish Terrier";
            } else if (p3 == 2) {
                gp3 = "Battleship";
            } else if (p3 == 3) {
                gp3 = "Race Car";
            } else if (p3 == 4) {
                gp3 = "Top Hat";
            } else if (p3 == 5) {
                gp3 = "Cat";
            } else {

                System.out.println("That's not one of the options please try again");

                int h = 0;
                for (h = 0; p3 != 1 && p3 != 2 && p3 != 3 && p3 != 4 && p3 != 5; h++) {
                    p3 = scnr.nextInt();
                    if (p3 == 1) {
                        gp3 = "Scottish Terrier";
                    } else if (p1 == 2) {
                        gp3 = "Battleship";
                    } else if (p1 == 3) {
                        gp3 = "Race Car";
                    } else if (p1 == 4) {
                        gp3 = "Top Hat";
                    } else if (p1 == 5) {
                        gp3 = "Cat";
                    } else {
                        System.out.println("That's not one of the options please try again");
                    }

                }

            }// else bracket


        System.out.println("Player 3 is a " + gp3 + "!\n\n");

//----------------------------------------------------------
        // the first turn
        //Player 1 turn
        //Dice roll
        // this picks one of the numbers in the array since there are 16 options
        int money1 = 1300;
        System.out.println("Player 1: " + gp1 + " you have $" + money1);
        System.out.println(" type anything and hit enter to roll");
        String roll = scnr.next();
        int total1;

        total1 = roll(roll, money1);

        // sending total to the Board.java
        Board referenceVariable = new Board();
       int diff =  referenceVariable.board(total1, total1);
       money1 = money1 + diff;
       System.out.print("You now have $" + money1);
        System.out.println();
        System.out.println();


//------------------------------------------------------------
        //Player 2 turn
        //Dice roll
        int money2 = 1300;
        System.out.println();
        System.out.println("Player 2: " + gp2 + " you have $" + money2);
        System.out.println(" type anything and hit enter to roll");
        roll = scnr.next();
        int total2;

        total2 = roll(roll, money2);

        int diff2 =  referenceVariable.board(total2, total2);
        money2 = money2 + diff2;
        System.out.print("You now have $" + money2);
        System.out.println();
        System.out.println();
//------------------------------------------------------------
        //Player 3
        //Dice roll
        int money3 = 1300;
        System.out.println();
        System.out.println("Player 3: " + gp3 + " you have $" + money3);
        System.out.println(" type anything and hit enter to roll");
        roll = scnr.next();
        int total3;

        total3 = roll(roll, money3);

        int diff3 =  referenceVariable.board(total3, total3);
        money3 = money3 + diff3;
        System.out.print("You now have $" + money3);
        System.out.println();
        System.out.println();

        String quit  = " ";
        System.out.println("type quit to stop the game");
        quit = scnr.next();


// every turn after that
        int total1a = 0;
        int total2a = 0;
        int total3a = 0;
        int i =0;

        // for loop stops if someone types quit.
        // for loop stops if two of the three players go bankrupt

//make sure that the quit statement works
        for(i = 0; !(quit.equalsIgnoreCase("quit")) || (money1 >0 && money2 > 0) ||
                (money1 >0 && money3 > 0) || (money3 > 0 && money2 > 0); i++) {


            // if they type quit then leave loop
            if (quit.equalsIgnoreCase("quit")){
                break;
            }
            else if ((money1 <=0 && money2 <= 0) || (money1 <=0 && money3 <= 0) || (money3 <=0 && money2 <= 0))
            {
                break;
            }


           // if statements so that the player won't run if money is zero or less
           if (money1 <=0 ){
               System.out.println("Player 1 " + gp1 +" is bankrupt");
           }

           else {
               //Dice roll
               System.out.println("Player 1: " + gp1 + " you have $" + money1);
               System.out.println(" type anything and hit enter to roll");
               roll = scnr.next();

               total1a = roll(roll, money1);

               // so this way the total is always less than for the board but it still adds so the player can advance
               // you want to change this if you add more spaces
               total1 = (total1 + total1a) % 39;

               // sending total to the Board.java

               diff = referenceVariable.board(total1, total1a);
               money1 = money1 + diff;
               System.out.print("You now have $" + money1);
               System.out.println();
               System.out.println();

           }

            if (money2 <=0 ){
                System.out.println("Player 2 " + gp2 +" is bankrupt");
            }

            else {

                System.out.println("Player 2: " + gp2 + " you have $" + money2);
                System.out.println(" type anything and hit enter to roll");
                roll = scnr.next();

                total2a = roll(roll, money2);

                // so this way the total is always less than for the board but it still adds so the player can advance
                // you want to change this if you add more spaces
                total2 = (total2 + total2a) % 39;

                // sending total to the Board.java

                diff = referenceVariable.board(total2, total2a);
                money2 = money2 + diff2;
                System.out.print("You now have $" + money2);
                System.out.println();
                System.out.println();

            }

            if (money3 <=0 ){
                System.out.println("Player 3 " + gp3 +" is bankrupt");
            }

            else {
                System.out.println("Player 3: " + gp3 + " you have $" + money3);
                System.out.println(" type anything and hit enter to roll");
                roll = scnr.next();

                total3a = roll(roll, money3);

                // so this way the total is always less than for the board but it still adds so the player can advance
                // you want to change this if you add more spaces
                total3 = (total3 + total3a) % 39;

                // sending total to the Board.java

                diff = referenceVariable.board(total3, total3a);
                money3 = money3 + diff;
                System.out.print("You now have $" + money3);
                System.out.println();
                System.out.println();

            }
            System.out.println("type quit to stop the game");
           quit = scnr.next();


            // if they type quit then leave loop
           if (quit.equalsIgnoreCase("quit")){
               break;
           }
           else if ((money1 <=0 && money2 <= 0) || (money1 <=0 && money3 <= 0) || (money3 <=0 && money2 <= 0))
           {
               break;
           }
        }// for bracket


        // winning statement
        if(quit.equalsIgnoreCase("quit") )
        {
            //player with most money wins
            if (money1 > money2 && money1 > money3)
            {
                System.out.println("Player 1 wins! Thanks for playing!");
            }

           else  if (money2 > money1 && money2 > money3)
            {
                System.out.println("Player 2 wins! Thanks for playing!");
            }

            else if (money3 > money2 && money3 > money1)
            {
                System.out.println("Player 3 wins! Thanks for playing!");
            }
        }

        else if (money1 <=0 && money2 <= 0)
        {
            System.out.println("Player 3 wins! Thanks for playing!");
        }
        else if  (money1 <=0 && money3 <= 0)
        {
            System.out.println("Player 2 wins! Thanks for playing!");
        }
        else if (money3 <=0 && money2 <= 0)
        {
            System.out.println("Player 1 wins! Thanks for playing!");
        }

    }
}