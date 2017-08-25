/**
 * Thanks to this class without a package, there won't be a need in robot tests to
 * provide full library package.
 */
public class SimpleLib extends org.my.robotLibrary.SimpleLib
{
    public SimpleLib()
    {
        super();
    }

    public SimpleLib(String welcomeMessage)
    {
        super(welcomeMessage);
    }
}
