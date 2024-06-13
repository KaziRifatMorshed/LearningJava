package CoinToss;

public class CountFlips {
    public static void main(String[] args) {
        final int NUM_FLIPS = 1000;
        int heads = 0, tails = 0;
        Coin myCoin = new Coin();  // instantiate the Coin object

        for (int count = 1; count <= NUM_FLIPS; count++) {
            myCoin.flip();

            if (myCoin.isHead())
                heads++;
            else
                tails++;
        }

        System.out.println("The number flips: " + NUM_FLIPS);
        System.out.println("The number of heads: " + heads);
        System.out.println("The number of tails: " + tails);

    }

}
