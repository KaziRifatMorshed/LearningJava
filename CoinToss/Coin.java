package CoinToss;

// import static java.lang.Math.random;

public class Coin{
    private final int HEADS = 0;
    private final int TAILS = 1;
    //private final boolean TAILS = 1; // WHY NOT ???
    //private final boolean HEADS = 0; // WHY NOT BOOLEAN ?
    //private boolean face;
    private int face;

  public Coin(){ // eta ki ???
	flip();
	}
  public void flip(){
	face = (int)(Math.random()*2);
	}
  public boolean isHead(){
	return (face == HEADS);
	}

    public String toString(){
        if(face == HEADS){return "it's HEADS !!!";}
        else {return "it's TAILS !!!";}
    }
    public String PrintString(){
        if(face == HEADS){return "it's HEADS!";}
        else {return "it's TAILS!";}
    }
    // EOF
}
