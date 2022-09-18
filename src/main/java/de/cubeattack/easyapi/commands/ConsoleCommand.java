package de.cubeattack.easyapi.commands;

import java.util.Arrays;

class ConsoleCommand
{
    private final String[] commands;
    private final Executable executable;

    public ConsoleCommand(Executable executable, String... commands) {
        this.commands = commands;
        this.executable = executable;
    }

    public boolean equalsCommand(String cmd) {
        return Arrays.stream(commands).anyMatch(t -> t.equalsIgnoreCase(cmd));
    }

    public void run(String[] args){
        executable.run(args);
    }
}
