import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class FileCommandOperations {
    private static void copyFile(String sourcePath, String destinationPath) throws IOException {
        try (FileInputStream in = new FileInputStream(sourcePath); FileOutputStream out = new FileOutputStream(destinationPath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }
    }

    private static void printProperties(File file) {
        System.out.println("File name: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("File size (bytes): " + file.length());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Last modified: " + new Date(file.lastModified()));
    }

    public static void main(String[] args) {
        System.out.println("Hetva-25");
        if (args.length < 2) {
            System.out.println("Usage:");
            System.out.println("copy <source> <destination>");
            System.out.println("delete <file>");
            System.out.println("rename <old-name> <new-name>");
            return;
        }
        String command = args[0].toLowerCase();
        try {
            if ("copy".equals(command)) {
                if (args.length != 3) {
                    System.out.println("Usage: copy <source> <destination>");
                    return;
                }
                copyFile(args[1], args[2]);
                File destination = new File(args[2]);
                System.out.println("File copied successfully");
                printProperties(destination);
            } else if ("delete".equals(command)) {
                if (args.length != 2) {
                    System.out.println("Usage: delete <file>");
                    return;
                }
                File target = new File(args[1]);
                if (!target.exists()) {
                    throw new FileNotFoundException("File not found: " + args[1]);
                }
                if (target.delete()) {
                    System.out.println("File deleted successfully");
                    printProperties(target);
                } else {
                    System.out.println("Unable to delete file");
                }
            } else if ("rename".equals(command)) {
                if (args.length != 3) {
                    System.out.println("Usage: rename <old-name> <new-name>");
                    return;
                }
                File oldFile = new File(args[1]);
                File newFile = new File(args[2]);
                if (!oldFile.exists()) {
                    throw new FileNotFoundException("File not found: " + args[1]);
                }
                if (oldFile.renameTo(newFile)) {
                    System.out.println("File renamed successfully");
                    printProperties(newFile);
                } else {
                    System.out.println("Unable to rename file");
                }
            } else {
                System.out.println("Invalid command");
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
