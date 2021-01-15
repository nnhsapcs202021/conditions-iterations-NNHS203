import java.awt.Color;

/**
 * Transforms a picture by applying a Shepard Fairey-inspired effect.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShepardFairey
{
    private ColorManipulator manipulator;
    private Picture picture;

    private static final Color OFF_WHITE = new Color( 248, 229, 175 );
    private static final Color LIGHT_BLUE = new Color( 121, 149, 159 );
    private static final Color RED = new Color( 198, 50, 45 );
    private static final Color DARK_BLUE = new Color( 16, 48, 77 );

    public ShepardFairey( Picture newPicture )
    {
        this.manipulator = new ColorManipulator( newPicture );
        this.picture = newPicture;
    }

    /**
     * Transforms the picture by applying a Shepard Fairey-inspired effect.
     *
     */
    public void transform()
    {int width = this.picture.getWidth();
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
                if (pixel_gray <=55)
                { pixel.setColor(DARK_BLUE);
                }
                else if (pixel_gray <= 110)
                { pixel.setColor(RED);
                
                }
                else if (pixel_gray <= 165)
                { pixel.setColor(LIGHT_BLUE);
                
                }
                else
                { pixel.setColor(OFF_WHITE);
                
                }
            }
        }
        
    }

    public static void main(String args[])
    {
        // create a new picture object based on the original selfie
        //  (the selfie image must be in the Shepard Fairey folder)
        Picture selfie = new Picture( "Schmit.jpg" );

        // create a ShepardFairey object to transform the selfie picture
        ShepardFairey fairey = new ShepardFairey( selfie );

        // display the original selfie picture
        selfie.explore();

        // transform the selfie picture by applying a Shepard Fairey-inspired effect
        fairey.transform();
        
        // display the transformed selfie picture
        selfie.explore();

        // save the transformed selfie picture
        
        /* This code doesn't work for some students for unknown reasons.
         * You may need to specify an absolute path. For example:
         *  finalPic.write("C:\\Users\\gschmit\\GitHub\\decisions-loops-gcschmit\\Shepard Fairey\\MrSchmitPortrait.jpg");
         */
        selfie.write( "C:\\Users\\liuha\\conditions-iterations-new\\MrSchmitPortrait.jpg");
        
        
  
    }
}