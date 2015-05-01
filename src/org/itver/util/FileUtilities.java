package org.itver.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author vrebo
 */
public class FileUtilities {

    private FileUtilities() {
    }

    public static String readFile(String url) throws FileNotFoundException, IOException {
        StringBuilder texto = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(url));
        while (br.ready()) {
            texto.append(br.readLine()).append("\n");
        }
        return texto.toString();
    }

    public static void writeToFile(String url, String texto) throws FileNotFoundException {
        writeToFile(new File(url), texto);
    }

    public static void writeToFile(File archivo, String texto) throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter(archivo)) {
            pw.write(texto);
            pw.flush();
        }
    }
}
