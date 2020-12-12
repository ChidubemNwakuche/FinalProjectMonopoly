import java.util.Scanner;
import java.util.Random;
import javax.swing.*;

public class Board{

    // also change these to popup boxes
public int chance (int x)
{
    //when you pull a card from chance or community chest a popup screen with the card shows up
    int y = 0;

    if (x==0)
    {
        JFrame topFrame = null;        // Application window
        JTextField outputField = null; // Displays output salary


        // Create text field
        outputField = new JTextField();
        // Display program output using the text field
        outputField.setText("Speeding fine pay $15");

        // Prevent user from editing output text
        outputField.setEditable(false);

        // Create window
        topFrame = new JFrame("Chance");

        // Add text field to window
        topFrame.add(outputField);

        // Resize window to fit components
        topFrame.pack();

        // Set program to terminate when window is closed
        //topFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display window
        topFrame.setVisible(true);

        System.out.println("Speeding fine pay $15");
        y = -15;
    }

    else if (x==1)
    {
        JFrame topFrame = null;        // Application window
        JTextField outputField = null; // Displays output salary


        // Create text field
        outputField = new JTextField();
        // Display program output using the text field
        outputField.setText("You've been elected chairman of the board, pay $100");

        // Prevent user from editing output text
        outputField.setEditable(false);

        // Create window
        topFrame = new JFrame("Chance");

        // Add text field to window
        topFrame.add(outputField);

        // Resize window to fit components
        topFrame.pack();

        // Set program to terminate when window is closed
        //topFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display window
        topFrame.setVisible(true);

        System.out.println("You've been elected chairman of the board, pay $100");
        y = -100;
    }

    else if (x==2)
    {
        JFrame topFrame = null;        // Application window
        JTextField outputField = null; // Displays output salary


        // Create text field
        outputField = new JTextField();
        // Display program output using the text field
        outputField.setText("Bank pays you a dividend of $50");

        // Prevent user from editing output text
        outputField.setEditable(false);

        // Create window
        topFrame = new JFrame("Chance");

        // Add text field to window
        topFrame.add(outputField);

        // Resize window to fit components
        topFrame.pack();

        // Set program to terminate when window is closed
       // topFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display window
        topFrame.setVisible(true);

        System.out.println("Bank pays you a dividend of $50");
        y = 50;
    }
    else if (x==3)
    {
        JFrame topFrame = null;        // Application window
        JTextField outputField = null; // Displays output salary


        // Create text field
        outputField = new JTextField();
        // Display program output using the text field
        outputField.setText("Your building loan matures collect $150");

        // Prevent user from editing output text
        outputField.setEditable(false);

        // Create window
        topFrame = new JFrame("Chance");

        // Add text field to window
        topFrame.add(outputField);

        // Resize window to fit components
        topFrame.pack();

        // Set program to terminate when window is closed
        //topFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display window
        topFrame.setVisible(true);
        System.out.println("Your building loan matures collect $150");
        y = 150;
    }

    return y;
}
// *******************************************************************************
    //change these to popop boxes
    public int communityChest (int x)
    {
        int y = 0;
        if (x == 0)
        {

            System.out.println (" Life insurance matures collect $100");

            JFrame topFrame = null;        // Application window
            JTextField outputField = null; // Displays output salary


            // Create text field
            outputField = new JTextField();
            // Display program output using the text field
            outputField.setText("Life insurance matures collect $100");

            // Prevent user from editing output text
            outputField.setEditable(false);

            // Create window
            topFrame = new JFrame("Community Chest");

            // Add text field to window
            topFrame.add(outputField);

            // Resize window to fit components
            topFrame.pack();

            // Display window
            topFrame.setVisible(true);

            //setting y to see how much money needs to be added to their cash
            y = 100;
        }
        else if (x == 1)
        {


            JFrame topFrame = null;        // Application window
            JTextField outputField = null; // Displays output salary


            // Create text field
            outputField = new JTextField();
            // Display program output using the text field
            outputField.setText(" It's your birthday collect $20");

            // Prevent user from editing output text
            outputField.setEditable(false);

            // Create window
            topFrame = new JFrame("Community Chest");

            // Add text field to window
            topFrame.add(outputField);

            // Resize window to fit components
            topFrame.pack();

            // Set program to terminate when window is closed
            //topFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Display window
            topFrame.setVisible(true);

            System.out.println (" It's your birthday collect $20");
                    y = 20;
        }
        else if (x == 2)
        {

            JFrame topFrame = null;        // Application window
            JTextField outputField = null; // Displays output salary


            // Create text field
            outputField = new JTextField();
            // Display program output using the text field
            outputField.setText(" Collect $25 consultancy fee");

            // Prevent user from editing output text
            outputField.setEditable(false);

            // Create window
            topFrame = new JFrame("Community Chest");

            // Add text field to window
            topFrame.add(outputField);

            // Resize window to fit components
            topFrame.pack();

            // Set program to terminate when window is closed
            //topFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Display window
            topFrame.setVisible(true);

            System.out.println (" Collect $25 consultancy fee");
                    y = 25;
        }
        else if (x == 3)
        {

            JFrame topFrame = null;        // Application window
            JTextField outputField = null; // Displays output salary


            // Create text field
            outputField = new JTextField();
            // Display program output using the text field
            outputField.setText("Tax refund collect $20");

            // Prevent user from editing output text
            outputField.setEditable(false);

            // Create window
            topFrame = new JFrame("Community Chest");

            // Add text field to window
            topFrame.add(outputField);

            // Resize window to fit components
            topFrame.pack();

            // Set program to terminate when window is closed
            //topFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Display window
            topFrame.setVisible(true);

            System.out.println (" Tax refund collect $20");
                    y = 20;
        }
        else
        {

            JFrame topFrame = null;        // Application window
            JTextField outputField = null; // Displays output salary


            // Create text field
            outputField = new JTextField();
            // Display program output using the text field
            outputField.setText(" You inherit $100");

            // Prevent user from editing output text
            outputField.setEditable(false);

            // Create window
            topFrame = new JFrame("Community Chest");

            // Add text field to window
            topFrame.add(outputField);

            // Resize window to fit components
            topFrame.pack();

            // Set program to terminate when window is closed
            //topFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Display window
            topFrame.setVisible(true);

            System.out.println (" You inherit $100");
                    y = 100;
        }

        return y;
    }


    //*************************************************
    //method with prompt

    public int board(int x, int y){
    //int x is the position on the board while int
        // y is the number rolled on the dice

        String array[] = new String[40];

        //the first 10
        array[0] = "GO - collect $200 as you pass";
        array[1] = "Mediterranean Avenue";
        array[2] = "Community Chest";
        array [3] = "Baltic Avenue";
        array[4] = "Income Tax - pay $200";
        array[5] = "Reading Railroad";
        array [6] = "Oriental Avenue";
        array[7] = "Chance";
        array [8] = "Vermont Avenue";
        array[9] = "Connecticut avenue";


        // the second ten
        array[10] = "In Jail or Just Visiting";
        array[11] = "St. Charles Place";
        array[12] = "Electric company";
        array[13] = "States Avenue";
        array[14] = "Virginia Avenue";
        array[15] = "Pennsylvania Railroad";
        array[16] = "St. Charles Place";
        array[17] = "Community Chest";
        array[18] = "Tennessee Avenue";
        array[19] = "New York Avenue";

        //the third ten

        array[20] = "Free Parking";
        array[21] = "Kentucky avenue";
        array[22] = "Chance";
        array[23] = "Indiana Avenue";
        array[24] = "Illinois Avenue";
        array[25] = "B. & O. Railroad";
        array[26] = "Atlantic Avenue";
        array[27] = "Ventnor Avenue";
        array[28] = "Water Works";
        array [29] = "Marvin Gardens";

        //the final ten
        array[30] = "Free Space";
        array[31] = "Pacific Avenue";
        array[32]= "North Carolina Avenue";
        array[33] = "Community Chest";
        array[34] = "Pennsylvania Avenue";
        array[35] = "Short Line Railroad";
        array[36] = "Chance";
        array[37] = "Park Place";
        array[38] = "Luxury Tax";
        array[39] = "Boardwalk";


        // money to return to see how much their money changes
        int money = 0;

        // each player gets $200 if they pass go
        if(x < 12)
        {
            System.out.println("You passed go so you get $200");
            money = money + 200;
        }


        //---------------------------------------------------------
        //coding what happens on each space on the board

        Scanner scnr = new Scanner(System.in);


       System.out.println("You landed on " + array[x]) ;

       //first 10
        //nothing happens on zero
        if (x == 0)
        {

        }

        // give the option to purchase
        else if (x == 1)
        {

            // checking to see if its sold or not using a boolean
            Property object1 = new Property();
            boolean sold = object1.getSold();

            if (sold == false) {


                System.out.println("This property costs $60");
                System.out.println("Would you like to purchase " + array[1] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object1.setSold();

                    // the property costs $60
                    money = money - 60;

                }

            }

             else if (sold == true)
             {
                 // they need to pay rent if someone else owns it
                  System.out.println("Rent costs $4");
                 money = money - 4;

             }


        }

        // community chest need to pull a card
        else if(x==2)
        {
            System.out.println("Type anything to pull a card from the Community Chest");
            String pick = scnr.next();
            Random rand = new Random();
            int random = rand.nextInt(5);

            int diff = 0;
            diff = communityChest(random);

            // adding any money earned in the community chest

            money = money + diff;

        }

        else if (x==3)
        {
            // if sold = false
            Property object2 = new Property();
            boolean sold = object2.getSold();

            if (sold == false) {

                System.out.println("This property costs $60");
                System.out.println("Would you like to purchase " + array[3] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object2.setSold();
                    // the property costs $60
                    money = money - 60;
                }
            }


            else if (sold == true) {
                // they need to pay rent if someone else owns it
                 System.out.println("Rent costs $8");
                money = money - 8;
            }

        }

        else if (x==4){
            System.out.println("You lost $200");
            money = money - 200;
        }
        else if (x==5){
            // if sold = false

            Property object5 = new Property();
            boolean sold = object5.getSold();

            if (sold == false) {
                System.out.println("This property costs $200");
                System.out.println("Would you like to purchase " + array[5] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    object5.setSold();
                    money = money - 200;
                }
            }
            // if sold = true

           else  if (sold == true ){
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $25");
                money = money - 25;
            }

        }
        else if ( x == 6)
        {

            Property object6 = new Property();
            boolean sold = object6.getSold();
            // if sold = false

            if (sold == false ){
            System.out.println("This property costs $100");
            System.out.println("Would you like to purchase " + array[6] + "? (Yes/ No)");
            String purchase = scnr.next();
            if (purchase.equalsIgnoreCase("yes")) {
                object6.setSold();
                money = money - 100;
            }
        }

            // if sold = true

            else if (sold == true) {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $12");
                money = money - 12;
            }

        }


        else if(x==7)
        {
            System.out.println("Type anything to pull a card from Chance");
            String pick = scnr.next();
            Random rand = new Random();
            int random = rand.nextInt(4);

            int diff = 0;
            diff = chance(random);

            // adding any money earned in chance

            money = money + diff;

        }

        else if (x == 8)
        {
            // checking to see if its sold or not using a boolean
            Property object8 = new Property();
            boolean sold = object8.getSold();

            if (sold == false) {


                System.out.println("This property costs $100");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object8.setSold();

                    money = money - 100;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $12");
                money = money - 12;

            }


        }



        else if (x == 9){
            // checking to see if its sold or not using a boolean
            Property object9 = new Property();
        boolean sold = object9.getSold();

        if (sold == false) {


            System.out.println("This property costs $120");
            System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
            String purchase = scnr.next();
            if (purchase.equalsIgnoreCase("yes")) {
                // changing status to sold
                object9.setSold();

                money = money - 120;

            }

        }

        else if (sold == true)
        {
            // they need to pay rent if someone else owns it
            System.out.println("Rent costs $16");
            money = money - 16;

        }


    }

    //------------------------------------------------------------------
    // second 10
        else if (x == 10)
        {

        }

        else if (x==11)
        {
            Property object11 = new Property();
            boolean sold = object11.getSold();

            if (sold == false) {


                System.out.println("This property costs $140");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object11.setSold();

                    money = money - 140;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $16");
                money = money - 16;

            }
        }

        else if (x==12)
        {
            Property object12 = new Property();
            boolean sold = object12.getSold();

            if (sold == false) {


                System.out.println("This property costs $150");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object12.setSold();

                    money = money - 150;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $20");
                money = money - 20;

            }
        }

        else if (x == 13)
        {
            Property object12 = new Property();
            boolean sold = object12.getSold();

            if (sold == false) {


                System.out.println("This property costs $140");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object12.setSold();

                    money = money - 140;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $20");
                money = money - 20;

            }
        }

        else if (x==14)
        {
            Property object14 = new Property();
            boolean sold = object14.getSold();

            if (sold == false) {


                System.out.println("This property costs $160");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object14.setSold();

                    money = money - 160;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $24");
                money = money - 24;

            }
        }

        else if(x==15)
        {
            Property object15 = new Property();
            boolean sold = object15.getSold();

            if (sold == false) {


                System.out.println("This property costs $200");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object15.setSold();

                    money = money - 200;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $25");
                money = money - 25;

            }
        }

        else if (x == 16)
        {
            Property object16 = new Property();
            boolean sold = object16.getSold();

            if (sold == false) {


                System.out.println("This property costs $180");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object16.setSold();

                    money = money - 180;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $28");
                money = money - 28;

            }
        }

        //community chest
        else if (x==17)
        {
            System.out.println("Type anything to pull a card from the Community Chest");
            String pick = scnr.next();
            Random rand = new Random();
            int random = rand.nextInt(5);

            int diff = 0;
            diff = communityChest(random);

            // adding any money earned in the community chest

            money = money + diff;
        }

        else if (x == 18)
        {
            Property object18 = new Property();
            boolean sold = object18.getSold();

            if (sold == false) {


                System.out.println("This property costs $180");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object18.setSold();

                    money = money - 180;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $28");
                money = money - 28;

            }
        }

        else if (x== 19)
        {
            Property object19 = new Property();
            boolean sold = object19.getSold();

            if (sold == false) {


                System.out.println("This property costs $200");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object19.setSold();

                    money = money - 200;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $28");
                money = money - 32;

            }
        }


        //-------------------------------------------------------
        // the third 10
        else if (x == 20)
        {

        }

        else if (x == 21)
        {
            Property object21 = new Property();
            boolean sold = object21.getSold();

            if (sold == false) {


                System.out.println("This property costs $220");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object21.setSold();

                    money = money - 220;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $36");
                money = money - 36;

            }
        }

        //chance
        else if (x == 22){
            System.out.println("Type anything to pull a card from Chance");
            String pick = scnr.next();
            Random rand = new Random();
            int random = rand.nextInt(4);

            int diff = 0;
            diff = chance(random);

            // adding any money earned in chance

            money = money + diff;
        }

        //indiana avenue
        else if (x==23)
        {
            Property object23 = new Property();
            boolean sold = object23.getSold();

            if (sold == false) {


                System.out.println("This property costs $220");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object23.setSold();

                    money = money - 220;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $36");
                money = money - 36;

            }
        }

        //illinois avenue

        else if (x == 24)
        {
            Property object24 = new Property();
            boolean sold = object24.getSold();

            if (sold == false) {


                System.out.println("This property costs $240");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object24.setSold();

                    money = money - 240;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $36");
                money = money - 40;

            }
        }

        //railroad
        else if (x==25)
        {
            Property object25 = new Property();
            boolean sold = object25.getSold();

            if (sold == false) {


                System.out.println("This property costs $200");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object25.setSold();

                    money = money - 200;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $25");
                money = money - 25;

            }
        }


        // atlantic avenue
        else if (x == 26)
        {
            Property object26 = new Property();
            boolean sold = object26.getSold();

            if (sold == false) {


                System.out.println("This property costs $260");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object26.setSold();

                    money = money - 260;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $44");
                money = money - 44;

            }
        }

        //ventnor avenue
        else if (x == 27)
        {
            Property object27 = new Property();
            boolean sold = object27.getSold();

            if (sold == false) {


                System.out.println("This property costs $260");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object27.setSold();

                    money = money - 260;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $44");
                money = money - 44;

            }
        }

        //water works
        else if (x==28){
            Property object28 = new Property();
            boolean sold = object28.getSold();

            if (sold == false) {


                System.out.println("This property costs $150");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object28.setSold();

                    money = money - 150;

                }

            }

            else if (sold == true)
            {
                // they need to pay 4 times rent if someone else owns it
                System.out.println("Rent costs 4 times the amount rolled");
                money = money - (4*y);

            }
        }

        // marvin gardens
        else if (x==29)
        {
            Property object29 = new Property();
            boolean sold = object29.getSold();

            if (sold == false) {


                System.out.println("This property costs $280");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object29.setSold();

                    money = money - 280;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $48");
                money = money - 48;

            }
        }

        //-----------------------------------------------
        // last ten

        // free spot
        else if (x==30){

        }


        //pacific avenue
        else if (x == 31)
        {
            Property object31 = new Property();
            boolean sold = object31.getSold();

            if (sold == false) {


                System.out.println("This property costs $300");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object31.setSold();

                    money = money - 300;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $52");
                money = money - 52;

            }

        }

        else if (x == 32)
        {
            Property object32 = new Property();
            boolean sold = object32.getSold();

            if (sold == false) {


                System.out.println("This property costs $300");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object32.setSold();

                    money = money - 300;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $52");
                money = money - 52;

            }

        }

        //community chest
        else if (x==33)
        {
            System.out.println("Type anything to pull a card from the Community Chest");
            String pick = scnr.next();
            Random rand = new Random();
            int random = rand.nextInt(5);

            int diff = 0;
            diff = communityChest(random);

            // adding any money earned in the community chest

            money = money + diff;

        }

        else if (x == 34)
        {
            Property object34 = new Property();
            boolean sold = object34.getSold();

            if (sold == false) {


                System.out.println("This property costs $300");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object34.setSold();

                    money = money - 300;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $52");
                money = money - 52;

            }

        }
// short line
        else if (x == 35)
        {
            Property object35 = new Property();
            boolean sold = object35.getSold();

            if (sold == false) {


                System.out.println("This property costs $200");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object35.setSold();

                    money = money - 200;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $25");
                money = money - 25;

            }

        }

        else if (x == 36)
        {
            System.out.println("Type anything to pull a card from Chance");
            String pick = scnr.next();
            Random rand = new Random();
            int random = rand.nextInt(4);

            int diff = 0;
            diff = chance(random);

            // adding any money earned in chance

            money = money + diff;

        }

        else if (x == 37) {

            Property object37 = new Property();
            boolean sold = object37.getSold();

            if (sold == false) {


                System.out.println("This property costs $350");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object37.setSold();

                    money = money - 350;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs $70");
                money = money - 70;

            }
        }

        else if (x==38)
        {
            money = money - 100;
        }

        else if (x==39)
        {
            Property object35 = new Property();
            boolean sold = object35.getSold();

            if (sold == false) {


                System.out.println("This property costs $400");
                System.out.println("Would you like to purchase " + array[x] + "? (Yes/ No)");
                String purchase = scnr.next();
                if (purchase.equalsIgnoreCase("yes")) {
                    // changing status to sold
                    object35.setSold();

                    money = money - 400;

                }

            }

            else if (sold == true)
            {
                // they need to pay rent if someone else owns it
                System.out.println("Rent costs 100");
                money = money - 100;

            }
        }




        return money;
    }

}





























