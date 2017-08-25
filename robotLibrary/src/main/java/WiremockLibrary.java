/**
 * Thanks to this class without a package, there won't be a need in robot tests to
 * provide full library package.
 */
@SuppressWarnings("unused")
public class WiremockLibrary extends org.my.robotLibrary.WiremockLibrary
{

    /**
     * {@link org.my.robotLibrary.WiremockLibrary#WiremockLibrary(String)}
     */
    public WiremockLibrary(String confPath)
    {
        super(confPath);
    }

    /**
     * {@link org.my.robotLibrary.WiremockLibrary#WiremockLibrary(String, int)}
     */
    public WiremockLibrary(String confPath, int port)
    {
        super(confPath, port);
    }
}
