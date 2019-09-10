package ivan.samoylov;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File currentDir = new File("/home/ivan");
        readRecursive(currentDir);
    }

    public static void readRecursive(final File folder) {
        try {
            for (final File fileEntry : folder.listFiles()) {
                if (fileEntry.isDirectory()) {
                    readRecursive(fileEntry);
                } else {
                    System.out.println(fileEntry.getName());
                }
            }
        }
        catch (Exception e){

        }
    }
}
