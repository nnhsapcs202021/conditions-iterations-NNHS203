import java.awt.Color;


/**
 * Class that manipulates the colors in a specified picture
 *
 * @author hansheng liu
 * @version 6 Jan 2020
 */
public class ColorManipulator
{
    private Picture picture;
//hi
    /**
     * Constructs a new ColorManipulator object with the specified picture
     *
     * @param  newPicture  the picture to manipulate
     */
    public ColorManipulator( Picture newPicture )
    {
        this.picture = newPicture;
    }
    
    /**
     * Returns the Picture associated with this ColorManipulator object. Intended to
     *      be used by the test class.
     *
     * @returns the Picture associated with this ColorManipulator object
     */
    public Picture getPicture()
    {
        return this.picture;
    }

    /**
     * Sets the blue component of the color of every pixel in the picture to the maximum value
     *
     *      An example of manipulating one component of the color of a pixel.
     */
    public void maxBlue()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                pixel.setBlue( 255 ); // pixel can go from 0-255
                
            }
        }
    }
    public void maxRed()
    {int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                pixel.setRed( 255 ); // pixel can go from 0-255
                
            }
        }
    }
     public void maxGreen()
    {int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                pixel.setGreen( 255 ); // pixel can go from 0-255
                
            }
        }
    }
   public void grayscale()
    {  
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
             
                Pixel pixel = this.picture.getPixel( x, y );
                Color color = pixel.getColor();
               int pixel_red =  pixel.getRed();
               int pixel_blue = pixel.getBlue();
               int pixel_green = pixel.getGreen();   
               int pixel_gray = (pixel_red+pixel_blue+pixel_green)/3;
               Color grayed = new Color(pixel_gray,pixel_gray,pixel_gray);
 
                pixel.setColor( grayed );
            }
        }
       

    }
   
    /**
     * Negates the color of every pixel in the picture
     *
     *      An example of manipulating the color of a pixel using a Color object
     */
    public void negate()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                Color color = pixel.getColor();
                
                int negatedRed = 255 - color.getRed();
                int negatedBlue = 255 - color.getBlue();
                int negatedGreen = 255 - color.getGreen();
                
                Color negated = new Color( negatedRed, negatedBlue, negatedGreen );
                pixel.setColor( negated );
            }
        }
    }

    public static void main(String args[])
    {
        // the selfie image must be in the Shepard Fairey folder
        Picture picture= new Picture( "Schmit.jpg" );
        ColorManipulator manipulator = new ColorManipulator( picture );
        picture.explore();
        manipulator.negate();
        picture.explore();
    }
}
