package org.bardales.java.patrones.patterndesign.behaivor.command;

public class FileInvoker {

    private Command command;

    public FileInvoker(Command command) {
       this.command = command;
    }

    public void execute() {
       this.command.execute();
    }

}
