package logs;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

import records.Person;

@SuppressWarnings("unused")
public class FileLogs {
    static Logger logger = Logger.getLogger("FileLogs");

    public static void main(String[] args) {
        // create a file Handler
        try {
            FileHandler fileHandler = new FileHandler("mylogs.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            // fileHandler.setFormatter(new XMLFormatter());

            // set up the logger to use the file handler
            logger.setUseParentHandlers(false);
            logger.addHandler(fileHandler);
            logger.setLevel(Level.INFO);

            logger.info("User Alex Logged In");
            logger.warning("Invalid password used");
            logger.severe("Out of memory");

            // creating a person object
            Person p = new Person("John", 15);
            logger.info("new Person created");

        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }

    }
}
