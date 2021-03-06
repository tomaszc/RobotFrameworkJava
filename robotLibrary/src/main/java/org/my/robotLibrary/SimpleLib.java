package org.my.robotLibrary;

import org.my.robotLibrary.keywords.SimpleKeywords;
import org.robotframework.javalib.annotation.Autowired;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.javalib.library.AnnotationLibrary;

/**
 * Library entry point.
 */
public class SimpleLib extends AnnotationLibrary
{
    /**
     * <p>
     * This is how to choose SimpleLib life scope during robot-tests execution.
     * <ul>
     * <li>"TEST CASE" - per test</li>
     * <li>"TEST SUITE" - per suite</li>
     * <li>"GLOBAL" - per whole execution</li>
     * </ul>
     * </p>
     * <p>
     * Change it and take a look at sysout generated by {@link SimpleKeywords} execution to see if new class instance
     * was used or not.
     * </p>
     */
    public static final String ROBOT_LIBRARY_SCOPE = "TEST SUITE";

    /**
     * Injected class - must be marked by {@link RobotKeywords} and be registered in extended {@link AnnotationLibrary}.
     * It's scope will be the same as as this ({@link SimpleLib})
     */
    @Autowired
    protected SimpleKeywords keywords;

    /**
     * Register autowireable classes.
     */
    public SimpleLib()
    {
        this.addKeywordPattern("org/my/robotLibrary/keywords/**/*.class");
        this.createKeywordFactory();
    }

    /**
     * Register autowireable classes.
     * Overriden to show how library constructor parameters can be invoked by:
     * <pre><code>*** Settings ***
Library  org.my.robotLibrary.SimpleLib  "constructor_argument"
     </code></pre>
     */
    public SimpleLib(String welcomeMessage)
    {
        this.addKeywordPattern("org/my/robotLibrary/keywords/**/*.class");
        this.createKeywordFactory();

        //TODO uncomment if you don't believe me that this constructor is really executed
        //throw new RuntimeException("WORKS: "+welcomeMessage);
    }
}
