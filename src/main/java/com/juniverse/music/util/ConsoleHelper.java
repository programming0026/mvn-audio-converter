package com.juniverse.music.util;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Salida por consola en UTF-8 para que se vean bien los acentos.
 *
 * @author ajuar
 */
public final class ConsoleHelper {

    private static PrintStream utf8Out;

    static {
        try {
            utf8Out = new PrintStream(System.out, true, StandardCharsets.UTF_8);
        } catch (Exception e) {
            utf8Out = System.out;
        }
    }

    /** Imprime texto sin salto de línea. */
    public static void print(String text) {
        utf8Out.print(text);
    }

    /** Imprime texto con salto de línea. */
    public static void println(String text) {
        utf8Out.println(text);
    }

    /** Imprime un salto de línea. */
    public static void println() {
        utf8Out.println();
    }

    /**
     * Imprime con formato.
     * @param format cadena de formato
     * @param args argumentos
     */
    public static void printf(String format, Object... args) {
        utf8Out.printf(format, args);
    }
}
