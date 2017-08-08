package org.my.robotLibrary;

import org.my.robotLibrary.keywords.SimpleKeywords;
import org.robotframework.javalib.annotation.Autowired;
import org.robotframework.javalib.library.AnnotationLibrary;

/**
 * Library entry point.
 */
public class SimpleLib extends AnnotationLibrary
{
    //SimpleLib life scope during tests execution - should it be inistantiated per test/ per suite / per whole execution
    public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

    @Autowired
    protected SimpleKeywords keywords;

    /**
     * Register autowireable classes
     */
    public SimpleLib()
    {
        this.addKeywordPattern("org/my/robotLibrary/keywords/**/*.class");
        this.createKeywordFactory();
    }
}
