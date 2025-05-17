package logs;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class ConsoleLogs {

    static Logger logger = Logger.getLogger(ConsoleLogs.class.getName());

    public static void main(String[] args) {
        System.out.println("This a log as well"); // mostly used for debugging

        // using logs on the console
        ConsoleHandler consoleHandler = new ConsoleHandler();
        // consoleHandler.setFormatter(new XMLFormatter());
        consoleHandler.setFormatter(new SimpleFormatter());
        consoleHandler.setLevel(Level.CONFIG);

        // setup the logger and assign the console handler
        logger.setUseParentHandlers(false);
        logger.addHandler(consoleHandler);
        logger.setLevel(Level.CONFIG);

        logger.config("Config level Message"); // db params change
        logger.config("Object Created");

        logger.warning("Invalid password");
        logger.severe("System out of memory");
        logger.info("Information like Welcome");

    }
}
