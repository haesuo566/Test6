/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE330_Insufficiently_Random_Values__basic_15.java
Label Definition File: CWE330_Insufficiently_Random_Values__basic.label.xml
Template File: point-flaw-15.tmpl.java
*/
/*
* @description
* CWE: 330 Insufficiently Random Values
* Sinks:
*    GoodSink: use SecureRandom
*    BadSink : hardcoded salt
* Flow Variant: 15 Control flow: switch(7)
*
* */

package testcases.CWE330_Insufficiently_Random_Values;

import testcasesupport.*;

import javax.servlet.http.*;
import java.io.*;
import java.security.SecureRandom;
import java.util.Random;

public class CWE330_Insufficiently_Random_Values__basic_15 extends AbstractTestCase
{

    public void bad() throws Throwable
    {
        switch(7)
        {
        case 7:
        {
            Random rand = new Random();
            /* FLAW: seed is static, making the numbers always occur in the same sequence */
            rand.setSeed(123456);
            IO.writeLine("Random int: " + rand.nextInt(100));
        }
        break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        {
            /* FIX: use SecureRandom to be cryptographically secure */
            SecureRandom rand = new SecureRandom();
            IO.writeLine("Random int: " + rand.nextInt(100));
        }
        break;
        }
    }

    /* good1() change the switch to switch(8) */
    private void good1() throws Throwable
    {
        switch(8)
        {
        case 7:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        {
            Random rand = new Random();
            /* FLAW: seed is static, making the numbers always occur in the same sequence */
            rand.setSeed(123456);
            IO.writeLine("Random int: " + rand.nextInt(100));
        }
        break;
        default:
        {
            /* FIX: use SecureRandom to be cryptographically secure */
            SecureRandom rand = new SecureRandom();
            IO.writeLine("Random int: " + rand.nextInt(100));
        }
        break;
        }
    }

    /* good2() reverses the blocks in the switch  */
    private void good2() throws Throwable
    {
        switch(7)
        {
        case 7:
        {
            /* FIX: use SecureRandom to be cryptographically secure */
            SecureRandom rand = new SecureRandom();
            IO.writeLine("Random int: " + rand.nextInt(100));
        }
        break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        {
            Random rand = new Random();
            /* FLAW: seed is static, making the numbers always occur in the same sequence */
            rand.setSeed(123456);
            IO.writeLine("Random int: " + rand.nextInt(100));
        }
        break;
        }

    }

    public void good() throws Throwable
    {
        good1();
        good2();
    }

    /* Below is the main(). It is only used when building this testcase on
       its own for testing or for building a binary to use in testing binary
       analysis tools. It is not used when compiling all the testcases as one
       application, which is how source code analysis tools are tested. */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}
