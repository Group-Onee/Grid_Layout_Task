import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GridLayoutExample {
    JPanel JPanelOne, JPanelTwo, JPanelThree;

    public GridLayoutExample() {
        this.createJFrameGridLayout();
    }

    public JFrame createJFrameGridLayout() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame GridFrame = new JFrame("GridLayout Example");
        GridFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        GridFrame.setLayout(new GridLayout(1, 3));
        GridFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        GridFrame.add(this.createJPanelOne());
        GridFrame.add(this.createJPanelTwo());
        GridFrame.add(this.createJPanelThree());

        GridFrame.setVisible(true);
        return GridFrame;
    }

    public JPanel createJPanelOne() {
        JPanelOne = new JPanel();
        Border JPanelOneBorder = BorderFactory.createTitledBorder("JPanel One");
        JPanelOne.setBorder(JPanelOneBorder);
        JPanelOne.setBackground(Color.blue);

        return JPanelOne;
    }
    public JPanel createJPanelTwo() {
        JPanelTwo = new JPanel();
        Border JPanelTwoBorder = BorderFactory.createTitledBorder("JPanel Two");
        JPanelTwo.setBorder(JPanelTwoBorder);
        JPanelTwo.setBackground(Color.gray);
        return JPanelTwo;
    }

    public JPanel createJPanelThree() {
        JPanelThree = new JPanel();
        Border JPanelThreeBorder = BorderFactory.createTitledBorder("JPanel Three");
        JPanelThree.setBorder(JPanelThreeBorder);
        JPanelThree.setBackground(Color.green);
        return JPanelThree;
    }

}
