package stanford.androidlib.graphics;

import java.io.Serializable;

/**
 * This class is a float-precision version of the <code>Rectangle</code> class
 * in <code>java.awt</code>.
 */
public class GRectangle implements Serializable {
    /**
     * The serialization code for this class.  This value should be incremented
     * whenever you change the structure of this class in an incompatible way,
     * typically by adding a new instance variable.
     */
    static final long serialVersionUID = 1L;

    // private fields
    private float xc;
    private float yc;
    private float myWidth;
    private float myHeight;

    /**
     * Constructs a new empty <code>GRectangle</code>.
     *
     * @usage rect = new GRectangle();
     */
    public GRectangle() {
        this(0, 0, 0, 0);
    }

    /**
     * Constructs a new <code>GRectangle</code> with the specified coordinates and size.
     *
     * @usage rect = new GRectangle(x, y, width, height);
     * @param x The x-coordinate of the rectangle
     * @param y The y-coordinate of the rectangle
     * @param width The width of the rectangle
     * @param height The height of the rectangle
     */
    public GRectangle(float x, float y, float width, float height) {
        xc = x;
        yc = y;
        myWidth = width;
        myHeight = height;
    }

    /**
     * Constructs a <code>GRectangle</code> at the origin with the specified width and height.
     *
     * @usage rect = new GRectangle(width, height);
     * @param width The width of the rectangle
     * @param height The height of the rectangle
     */
    public GRectangle(float width, float height) {
        this(0, 0, width, height);
    }

    /**
     * Constructs a new <code>GRectangle</code> with the specified location and size.
     *
     * @usage rect = new GRectangle(pt, size);
     * @param pt The location of the upper left corner of the rectangle
     * @param size The dimensions of the rectangle
     */
    public GRectangle(GPoint pt, GDimension size) {
        this(pt.getX(), pt.getY(), size.getWidth(), size.getHeight());
    }

    /**
     * Constructs a new empty <code>GRectangle</code> at the specified location.
     *
     * @usage rect = new GRectangle(pt);
     * @param pt The location of the upper left corner of the rectangle
     */
    public GRectangle(GPoint pt) {
        this(pt.getX(), pt.getY(), 0, 0);
    }

    /**
     * Constructs a new <code>GRectangle</code> at the origin with the specified size.
     *
     * @usage rect = new GRectangle(size);
     * @param size The dimensions of the rectangle
     */
    public GRectangle(GDimension size) {
        this(0, 0, size.getWidth(), size.getHeight());
    }

    /**
     * Constructs a new <code>GRectangle</code> from an existing one.
     *
     * @usage rect = new GRectangle(r);
     * @param r The original rectangle
     */
    public GRectangle(GRectangle r) {
        this(r.xc, r.yc, r.myWidth, r.myHeight);
    }

    /**
     * Returns the x coordinate of this <code>GRectangle</code>.
     *
     * @usage x = rect.getX();
     * @return The x coordinate of this <code>GRectangle</code>
     */
    public float getX() {
        return xc;
    }

    /**
     * Returns the y coordinate of this <code>GRectangle</code>.
     *
     * @usage y = rect.getY();
     * @return The y coordinate of this <code>GRectangle</code>
     */
    public float getY() {
        return yc;
    }

    /**
     * Returns the width of this <code>GDimension</code>.
     *
     * @usage width = rect.getWidth();
     * @return The width of this <code>GDimension</code>
     */
    public float getWidth() {
        return myWidth;
    }

    /**
     * Returns the height of this <code>GDimension</code>.
     *
     * @usage height = rect.getHeight();
     * @return The height of this <code>GDimension</code>
     */
    public float getHeight() {
        return myHeight;
    }

    /**
     * Sets the components of a <code>GRectangle</code> from the specified values.
     *
     * @usage rect.setBounds(x, y, width, height);
     * @param x The x-coordinate of the rectangle
     * @param y The y-coordinate of the rectangle
     * @param width The width of the rectangle
     * @param height The height of the rectangle
     */
    public void setBounds(float x, float y, float width, float height) {
        xc = x;
        yc = y;
        myWidth = width;
        myHeight = height;
    }

    /**
     * Sets the components of a <code>GRectangle</code> from the specified location and size.
     *
     * @usage rect.setBounds(pt, size);
     * @param pt The location of the upper left corner of the rectangle
     * @param size The dimensions of the rectangle
     */
    public void setBounds(GPoint pt, GDimension size) {
        setBounds(pt.getX(), pt.getY(), size.getWidth(), size.getHeight());
    }

    /**
     * Sets the bounds of one <code>GRectangle</code> equal to that of another.
     *
     * @usage rect.setBounds(bounds);
     * @param bounds A <code>GRectangle</code> specifying the new bounds
     */
    public void setBounds(GRectangle bounds) {
        setBounds(bounds.xc, bounds.yc, bounds.myWidth, bounds.myHeight);
    }

    /**
     * Returns a new <code>GRectangle</code> whose bounds are the same as this one.
     *
     * @usage r = rect.getBounds();
     * @return A new rectangle with the same bounds
     */
    public GRectangle getBounds() {
        return new GRectangle(this);
    }

    /**
     * Sets the location of the <code>GRectangle</code> to the specified <code>x</code>
     * and <code>y</code> values.
     *
     * @usage rect.setLocation(x, y);
     * @param x The new x-coordinate for the rectangle
     * @param y The new y-coordinate for the rectangle
     */
    public void setLocation(float x, float y) {
        xc = x;
        yc = y;
    }

    /**
     * Sets the location of the <code>GRectangle</code> to the specified point.
     *
     * @usage rect.setLocation(pt);
     * @param pt The new location for the rectangle
     */
    public void setLocation(GPoint pt) {
        setLocation(pt.getX(), pt.getY());
    }

    /**
     * Returns a new <code>GPoint</code> with the location of the rectangle.
     *
     * @usage pt = rect.getLocation();
     * @return The location of the rectangle as a <code>GPoint</code>
     */
    public GPoint getLocation() {
        return new GPoint(xc, yc);
    }

    /**
     * Adjusts the coordinates of a rectangle by the specified <code>dx</code> and
     * <code>dy</code> offsets.
     *
     * @usage rect.translate(dx, dy);
     * @param dx The change in the x direction (positive is rightward)
     * @param dy The change in the y direction (positive is downward)
     */
    public void translate(float dx, float dy) {
        xc += dx;
        yc += dy;
    }

    /**
     * Sets the size of the <code>GRectangle</code> to the specified values.
     *
     * @usage rect.setSize(width, height);
     * @param width The new width of the rectangle
     * @param height The new height of the rectangle
     */
    public void setSize(float width, float height) {
        myWidth = width;
        myHeight = height;
    }

    /**
     * Sets the size of the <code>GRectangle</code> to the specified dimension.
     *
     * @usage rect.setSize(size);
     * @param size The new dimensions of the rectangle
     */
    public void setSize(GDimension size) {
        setSize(size.getWidth(), size.getHeight());
    }

    /**
     * Returns a new <code>GDimension</code> object with the size of the <code>GRectangle</code>.
     * @usage size = rect.getSize();
     * @return The size of the rectangle as a <code>GDimension</code>
     */
    public GDimension getSize() {
        return new GDimension(myWidth, myHeight);
    }

    /**
     * Adjusts the edges of a rectangle by the specified <code>dx</code> and <code>dy</code>
     * offsets along each of its borders.
     *
     * @usage rect.grow(dx, dy);
     * @param dx The offset to extend each of the left and right borders
     * @param dy The offset to extend each of the top and bottom borders
     */
    public void grow(float dx, float dy) {
        xc -= dx;
        yc -= dy;
        myWidth += 2 * dx;
        myHeight += 2 * dy;
    }

    /**
     * Returns <code>true</code> if the rectangle is empty.
     *
     * @usage if (rect.isEmpty()) . . .
     * @return <code>true</code> if the rectangle is empty, and <code>false</code> otherwise
     */
    public boolean isEmpty() {
        return myWidth <= 0 || myHeight <= 0;
    }

    /**
     * Returns <code>true</code> if the <code>GRectangle</code> contains the specified point.
     *
     * @usage if (rect.contains(x, y)) . . .
     * @param x The x-coordinate of the point being tested
     * @param y The y-coordinate of the point being tested
     * @return <code>true</code> if the rectangle contains (<code>x</code>,&nbsp;<code>y</code>),
     *         and <code>false</code> otherwise
     */
    public boolean contains(float x, float y) {
        return x >= xc && y >= yc && x < xc + myWidth && y < yc + myHeight;
    }

    /**
     * Returns <code>true</code> if the <code>GRectangle</code> contains the specified point.
     *
     * @usage if (rect.contains(pt)) . . .
     * @param pt The point being tested
     * @return <code>true</code> if the rectangle contains <code>pt</code>,
     *         and <code>false</code> otherwise
     */
    public boolean contains(GPoint pt) {
        return contains(pt.getX(), pt.getY());
    }

    /**
     * Returns <code>true</code> if <code>r1</code> and <code>r2</code> have a nonempty
     * intersection.
     *
     * @usage if (r1.intersects(r2)) . . .
     * @param r2 A second rectangle
     * @return <code>true</code> if the two rectangles intersect, and <code>false</code> otherwise
     */
    public boolean intersects(GRectangle r2) {
        GRectangle r1 = this;
        if (r1.xc > r2.xc + r2.myWidth) return false;
        if (r1.yc > r2.yc + r2.myHeight) return false;
        if (r2.xc > r1.xc + r1.myWidth) return false;
        if (r2.yc > r1.yc + r1.myHeight) return false;
        return true;
    }

    /**
     * Returns the largest rectangle that is contained in both
     * <code>r1</code> and <code>r2</code>.
     *
     * @usage r3 = r1.intersection(r2);
     * @param r2 A second rectangle
     * @return The intersection of this rectangle and <code>r2</code>
     */
    public GRectangle intersection(GRectangle r2) {
        GRectangle r1 = this;
        float x1 = Math.max(r1.xc, r2.xc);
        float y1 = Math.max(r1.yc, r2.yc);
        float x2 = Math.min(r1.xc + r1.myWidth, r2.xc + r2.myWidth);
        float y2 = Math.min(r1.yc + r1.myHeight, r2.yc + r2.myHeight);
        return new GRectangle(x1, y1, x2 - x1, y2 - y1);
    }

    /**
     * Returns the smallest rectangle that contains both
     * <code>r1</code> and <code>r2</code>.
     *
     * @usage r3 = r1.union(r2);
     * @param r2 A second rectangle
     * @return The union of this rectangle and <code>r2</code>
     */
    public GRectangle union(GRectangle r2) {
        if (isEmpty()) return new GRectangle(r2);
        if (r2.isEmpty()) return new GRectangle(this);
        GRectangle r1 = this;
        float x1 = Math.min(r1.xc, r2.xc);
        float y1 = Math.min(r1.yc, r2.yc);
        float x2 = Math.max(r1.xc + r1.myWidth, r2.xc + r2.myWidth);
        float y2 = Math.max(r1.yc + r1.myHeight, r2.yc + r2.myHeight);
        return new GRectangle(x1, y1, x2 - x1, y2 - y1);
    }

    /**
     * Adjusts the bounds of the current <code>GRectangle</code> so that it contains
     * the rectangle represented by the argument.
     *
     * @usage rect.add(r);
     * @param r A new rectangle to include in this one
     */
    public void add(GRectangle r) {
        if (r.isEmpty()) return;
        if (isEmpty()) {
            setBounds(r);
            return;
        }
        float x2 = Math.max(xc + myWidth, r.xc + r.myWidth);
        float y2 = Math.max(yc + myHeight, r.yc + r.myHeight);
        xc = Math.min(r.xc, xc);
        yc = Math.min(r.yc, yc);
        myWidth = x2 - xc;
        myHeight = y2 - yc;
    }

    /**
     * Adds the specified point to the rectangle.
     *
     * @usage rect.add(x, y);
     * @param x The x coordinate of the new point
     * @param y The y coordinate of the new point
     */
    public void add(float x, float y) {
        if (isEmpty()) {
            setBounds(x, y, 0, 0);
            return;
        }
        float x2 = Math.max(x + myWidth, x);
        float y2 = Math.max(y + myHeight, y);
        xc = Math.min(x, xc);
        yc = Math.min(y, yc);
        myWidth = x2 - xc;
        myHeight = y2 - yc;
    }

    /**
     * Returns an integer hash code for the rectangle.  The hash code for a
     * <code>GRectangle</code> is constructed from the hash codes from the
     * <code>float</code> values of the coordinates, which are the ones used in the
     * <code>equals</code> method.
     *
     * @usage hash = rect.hashCode();
     * @return The hash code for this rectangle
     * @noshow
     */
    public int hashCode() {
        int hash = new Float((float) xc).hashCode();
        hash = (37 * hash) ^ new Float((float) yc).hashCode();
        hash = (37 * hash) ^ new Float((float) myWidth).hashCode();
        hash = (37 * hash) ^ new Float((float) myHeight).hashCode();
        return hash;
    }

    /**
     * Tests whether two <code>GRectangle</code> objects are equal.
     * Because floating-point values are inexact, this method checks for
     * equality by comparing the <code>float</code> values (rather than the
     * <code>float</code> values) of the coordinates.
     *
     * @usage if (rect.equals(obj)) . . .
     * @param obj Any object
     * @return <code>true</code> if the <code>obj</code> is a <code>GRectangle</code>
     *         equal to this one, and <code>false</code> otherwise
     * @noshow
     */
    public boolean equals(Object obj) {
        if (!(obj instanceof GRectangle)) return false;
        GRectangle r = (GRectangle) obj;
        if ((float) xc != (float) r.xc) return false;
        if ((float) yc != (float) r.yc) return false;
        if ((float) myWidth != (float) r.myWidth) return false;
        if ((float) myHeight != (float) r.myHeight) return false;
        return true;
    }

    /**
     * Converts this <code>GRectangle</code> to its string representation.
     *
     * @usage str = rect.toString();
     * @return A string representation of this rectangle
     * @noshow
     */
    public String toString() {
        return "[" + (float) xc + ", " + (float) yc + ", "
                + (float) myWidth + "x" + (float) myHeight + "]";
    }
}
