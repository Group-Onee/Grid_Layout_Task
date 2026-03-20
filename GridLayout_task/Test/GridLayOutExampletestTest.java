import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import javax.swing.*;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

public class GridLayOutExampletestTest {

    GridLayoutExample app;
    JFrame frame;

    @BeforeEach
    public void setUp() {
        app = new GridLayoutExample();
        frame = app.createJFrameGridLayout();
    }

    @AfterEach
    public void tearDown() {
        if (frame != null){
            frame.dispose();
        }
        app = null;
    }

    @Test
    public void testFrameNotNull(){
        assertNotNull(frame);
    }

    @Test
    public void testFrameTitle(){
        assertEquals("GridLayout Example", frame.getTitle());
    }

    @Test
    public void testFrameLayoutType(){
        LayoutManager layout = frame.getContentPane().getLayout();
        assertInstanceOf(GridLayout.class, layout);
    }

    @Test
    public void testGridLayoutConfiguration(){
        GridLayout layout = (GridLayout) frame.getContentPane().getLayout();
        assertEquals(1, layout.getRows());
        assertEquals(3, layout.getColumns());
    }

    @Test
    public void testJPanelOneProperties(){
        JPanel panel = app.createJPanelOne();
        assertNotNull(panel);
        assertEquals(Color.blue, panel.getBackground());
        assertNotNull(panel.getBorder());
    }

    @Test
    public void testPanelAddedToFrame(){
        Component[] components = frame.getContentPane().getComponents();
        assertTrue(components.length > 0);
        assertInstanceOf(JPanel.class, components[0]);
    }

    @Test
    public void testFrameVisibility(){
        assertTrue(frame.isVisible());
    }

    @Test
    public void testFrameMaximized(){
        assertEquals(JFrame.MAXIMIZED_BOTH, frame.getExtendedState());
    }

    @BeforeAll
    public static void initAll(){
        System.out.println("starting all tests....");
    }

    @AfterAll
    public static void tearDownAll(){
        System.out.println("All tests completed.");
    }
}