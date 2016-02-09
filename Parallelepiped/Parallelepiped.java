package Parallelepiped;

public class Parallelepiped {

    private int height;
    private int baseWidth;
    private int baseHeight;

    public Parallelepiped( int h, int bW , int bH )
    {
        this.height = h;
        this.baseHeight = bH;
        this.baseWidth = bW;
    };

    public int getBaseArea()
    {
        return this.baseHeight*this.baseWidth;
    };

}