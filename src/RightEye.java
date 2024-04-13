/**
 *  This class is redundant, we could have just as easily used one
 *  class for "eye" and instantiated it to either left or right
 *  eye during object creation.
 */

public class RightEye extends LeftEye {
    public RightEye(String name, String condition, String color) {
        super(name, condition, color);
    }
}
