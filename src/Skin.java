/**
*   This class is redundant as we could have just used the fields
*   class as an object for the skin class when the skin object is
*   first instantiated, since here we didn't make any changes to
*   the fields class. Still, points for readability I guess?
**/
public class Skin extends Fields{
    public Skin(String name, String condition) {
        super(name, condition);
    }
}
