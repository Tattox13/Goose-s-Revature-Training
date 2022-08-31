package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //
        Logger logger = LoggerFactory.getLogger("org.example.App");

        //
        logger.trace("Something happened");
        logger.debug("Hello World.");
        logger.info("Give some information about the program.");
        logger.warn("Something might happen that's bad.");
        logger.error("Something bad happened!");
        logger.trace("Trace test\n");

        System.out.println("message");
    }
}
