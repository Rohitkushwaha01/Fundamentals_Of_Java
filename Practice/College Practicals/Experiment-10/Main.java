import java.applet.*;
import java.awt.*;

public class Main extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(20, 20, 500, 20);
		g.drawRect(20, 40, 200, 40);
		g.fillRect(300, 40, 200, 40);
		g.drawRoundRect(20, 100, 200, 40, 10, 10);
		g.fillRoundRect(300, 100, 200, 40, 10, 10);
		g.setColor(Color.RED);
		g.drawOval(20, 160, 200, 100);
		g.fillOval(300, 160, 200, 100);
	}
}