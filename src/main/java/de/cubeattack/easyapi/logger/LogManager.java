package de.cubeattack.easyapi.logger;

import ch.qos.logback.classic.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class LogManager
{
    private static final Logger LOGGER = LoggerFactory.getLogger("de.cubeattack");

    public static void setLevel(Level level) {
        ((ch.qos.logback.classic.Logger) LOGGER).setLevel(level);
    }

    public static void setLevel(Level level, String logger) {
        ((ch.qos.logback.classic.Logger) LoggerFactory.getLogger(logger)).setLevel(level);
    }

    public static Logger getLogger() {
        return LOGGER;
    }
}
