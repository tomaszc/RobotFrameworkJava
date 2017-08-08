package org.my.robotLibrary.keywords;

import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywordOverload;
import org.robotframework.javalib.annotation.RobotKeywords;

/**
 * Autowirable (thanks to {@link RobotKeywords} with some robot keywords.</br>
 * Need to use {@link }
 */
@RobotKeywords
public class SimpleKeywords
{
    /**
     * Need to use {@link RobotKeywordOverload} instead of {@link RobotKeyword} if method is overloaded
     */
    @RobotKeywordOverload
    public void printToSysout()
    {
        System.out.println(this.toString()+": works!");
    }

    /**
     * One from overloaded methods must be marked by {@link RobotKeyword} and have default value set
     * trough {@link ArgumentNames} to work!
     */
    @RobotKeyword
    @ArgumentNames({"toPrint=WhateverButMandatory"})
    public void printToSysout(String value)
    {
        System.out.println(this.toString()+": works, value=" + value);
    }

    public void thisMethodWontBeAvailableBecauseOfNoAnnotation(){
        System.out.println(this.toString()+": this method shouldn't work ...");
    }

}
