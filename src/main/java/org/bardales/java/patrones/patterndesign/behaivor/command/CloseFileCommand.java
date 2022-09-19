package org.bardales.java.patrones.patterndesign.behaivor.command;

public class CloseFileCommand implements Command {

    private FileSystemReceiver fileSystemReceiver;

    public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
       this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.closeFile();
    }

}
