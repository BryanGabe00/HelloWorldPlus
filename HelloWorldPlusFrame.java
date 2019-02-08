import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;

public class HelloWorldPlusFrame extends JFrame
{
  public HelloWorldPlusFrame()
  {
    super("HelloWorld");
    setBounds(100, 100, 400, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel label = new JLabel("Hello World!!! ~ Bryan Gabe", SwingConstants.CENTER);
    label.setFont(new Font("ComicSandsMS", Font.BOLD, 48));
    label.setForeground(Color.blue);
    getContentPane().add(label);
  }
}
