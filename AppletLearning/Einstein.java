package AppletLearning;
//import java.applet.*;
import java.applet.Applet ;
import java.awt.*;
public class Einstein extends Applet{
    public void paint(Graphics page){
        page.drawRect(50,50,40,40);
        page.drawRect(60,80,225,30);
        page.drawOval(75,65,20,20);
        page.drawLine(35,60,100,120);

        page.drawString("Out of clutter, find simplicity.",110,70);
        page.drawString("---Albert Einstein",130,100);

    }
}
/*
* Applet class: Applet is deprecated since Java 9 and may be removed in future versions. However, it's still supported in Java 21. If you're targeting a modern Java environment, consider using other technologies for GUI development, such as Swing, JavaFX, or web technologies.
* */
