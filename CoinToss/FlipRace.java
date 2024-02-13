package CoinToss;
public class FlipRace {
    public static void main(String []args)    {
        final int goal = 3;
        int count1 = 0, count2 = 0;
        //Creating coin objects
        Coin paisa1 = new Coin();
        Coin paisa2 = new Coin();

        while(count1 < goal && count2<goal) {
        //while(true){
            paisa1.flip();
            paisa2.flip();
            // now print present results
            System.out.println(STR."<coin1 = \{paisa1}> && <coin2 = \{paisa2.PrintString()}>");

            // increment or RESET THE COUNTER
            count1 = (paisa1.isHead())?count1 + 1 : 0;
            count2 = (paisa2.isHead())?count2 + 1 : 0;

            // Determine the winner
            if((count1 == goal) && (count2 == goal)){ // আগে চেক কর
                System.out.println("it is a TIE !?!?!?!");
                break;
            } else if (count1 == goal){
                System.out.println("Coin 1 wins !!!");
                break;
            } else if (count2 == goal) {
                System.out.println("Coin 2 Wins !!!");
                break;
            }
        }
        System.out.println("\ngame end\n");
    }

    //EOF
}
