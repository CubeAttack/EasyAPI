package de.cubeattack.easyapi;

@SuppressWarnings("unused")
public class ShutdownManager
{
    public static void registerShutdownHook(Thread thread) {
        Runtime.getRuntime().addShutdownHook(thread);
    }
}