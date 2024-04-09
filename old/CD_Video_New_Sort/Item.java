package CD_Video_New_Sort;
public class Item implements Comparable<Item>{
    private String title;
    private int playingTime;

   public Item(String theTitle, int time) {
        title = theTitle;
        playingTime = time;
    }
   @Override
   public int compareTo(Item i){
     if(this.playingTime>i.playingTime)
       return 1;
     else if(this.playingTime<i.playingTime)
       return -1;
     else
       return 0;
       //return this.title.compareTo(i.title);
   }
   public String  toString()
    {
        return title + " (" + playingTime + " mins)\n";
    }
}
