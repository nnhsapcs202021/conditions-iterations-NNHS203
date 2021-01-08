

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.awt.Color;

/**
 * The test class ColorManipulatorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ColorManipulatorTest
{
    /**
     * Default constructor for test class ColorManipulatorTest
     */
    public ColorManipulatorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test 
    public void test()
    {  Picture picture= new Picture( "Schmit.jpg" );
        ColorManipulator manipulator = new ColorManipulator( picture );
        manipulator.grayscale();
       Pixel pixel = picture.getPixel( 198,88 );
       Color color = pixel.getColor();
       assertEquals((132+150+174)/3, color.getRed(), 1e-6); // 1 x 10^-6
    }
}
