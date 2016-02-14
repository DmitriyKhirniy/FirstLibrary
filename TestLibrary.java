import Parallelepiped.*;
public class TestLibrary {

    public static int minRange = 10;
    public static int maxRange = 1000;

    public void Test()
    {
        Number a = getRandom(minRange , maxRange);
        Number b = getRandom(minRange , maxRange);
        Number c = getRandom(minRange , maxRange);
        Parallelepiped shape = new Parallelepiped(a,b,c);
        show(shape);
    };

    private void show( Parallelepiped shape )
    {
        System.out.println("--------------------------------------------------");
        System.out.println("The shape has dimensions:");
        System.out.println("Base width: "+ shape.getBaseWidth() + "cm.");
        System.out.println("Base height: "+shape.getBaseHeight()+"cm.");
        System.out.println("Height: "+shape.getHeight()+"cm.");

        System.out.println("The area of base: "+shape.getBaseArea()+"cm.");
        System.out.println("The volume: "+shape.getVolume()+"cm.");
        System.out.println("The perimeter of base: "+shape.getBasePerimeter()+"cm.");
        System.out.println("The value of lateral surface area: "+shape.getLateralSurfaceArea()+"cm." );
        System.out.println("Total surface area: "+shape.getTotalSurfaceArea()+"cm.");
    };

    public Number getRandom( int min , int max )
    {
       int type =  min + (int)(Math.random() * ((max - min) + 1));
        if(type < max/2) return  min + (int)(Math.random() * ((max - min) + 1));
        else return (float)(min + (Math.random() * ((max - min) + 1)));
    };

}
