package org.bardales.java.patrones.patterndesign.behaivor.command;

public class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystemReceiver;

    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
       this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.openFile();
    }

}
