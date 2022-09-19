package org.bardales.java.patrones.patterndesign.behaivor.command;

public class CommandTest {

    public static void main(String... args) {
        FileSystemReceiver fileSystemWindows = new WindowsFileSystemReceiver();

        Command openFileCommand = new OpenFileCommand(fileSystemWindows);
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);
        fileInvoker.execute();

        Command writeFileCommand = new WriteFileCommand(fileSystemWindows);
        fileInvoker = new FileInvoker(writeFileCommand);
        fileInvoker.execute();

        Command closeFileCommand = new CloseFileCommand(fileSystemWindows);
        fileInvoker = new FileInvoker(closeFileCommand);
        fileInvoker.execute();

        FileSystemReceiver fileSystemUnix = new UnixFileSystemReceiver();
        fileInvoker = new FileInvoker(() -> fileSystemUnix.openFile());
        fileInvoker.execute();

        fileInvoker = new FileInvoker(() -> fileSystemUnix.writeFile());
        fileInvoker.execute();

        fileInvoker = new FileInvoker(() -> fileSystemUnix.closeFile());
        fileInvoker.execute();
    }

}