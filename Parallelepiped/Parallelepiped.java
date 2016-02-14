package Parallelepiped;

public class Parallelepiped{

    private Number height;
    private Number baseWidth;
    private Number baseHeight;

    public Parallelepiped( Number h, Number bW , Number bH )
    {
        this.height = h;
        this.baseHeight = bH;
        this.baseWidth = bW;
    };

    public Parallelepiped(Number size)
    {
        this.height = size;
        this.baseWidth = size;
        this.baseHeight = size;
    };

    public Number getBaseArea()
    {
        return multiplyNumbers( this.baseHeight , this.baseWidth);
    };

    public Number getHeight()
    {
        return this.height;
    };

    public void setHeight( Number height )
    {
        this.height = height;
    };

    public Number getBaseWidth()
    {
        return this.baseWidth;
    };

    public void setBaseWidth( Number bWidth )
    {
        this.baseWidth = bWidth;
    };

    public Number getBaseHeight()
    {
        return this.baseHeight;
    };

    public void setBaseHeight( Number bHeight )
    {
        this.baseHeight = bHeight;
    };

    public Number getVolume()
    {
        return multiplyNumbers( multiplyNumbers( this.baseHeight ,this.baseWidth) , this.height);
    };

    private static Number addNumbers(Number a, Number b) {

        if(a instanceof Double || b instanceof Double) {
            return new Double(a.doubleValue() + b.doubleValue());
        } else if(a instanceof Float || b instanceof Float) {
            return new Float(a.floatValue() + b.floatValue());
        } else if(a instanceof Long || b instanceof Long) {
            return new Long(a.longValue() + b.longValue());
        } else {
            return new Integer(a.intValue() + b.intValue());
        }
    }


    private static Number multiplyNumbers( Number a, Number b )
    {
        if( a instanceof Double || b instanceof Double ) return new Double( a.doubleValue()* b.doubleValue() );
        else if(a instanceof Float || b instanceof Float) return new Float(a.floatValue() * b.floatValue());
        else if(a instanceof Long || b instanceof Long)return new Long(a.longValue() * b.longValue());
        else return new Integer( a.intValue()* b.intValue() );
    };

}