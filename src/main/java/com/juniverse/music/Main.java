package com.juniverse.music;


import java.util.logging.Logger;
/**
 * Programa de línea de comandos: {@code <archivo_entrada> <archivo_salida>}; el formato de salida se deduce de la extensión.
 *
 * @author ajuar
 */
public class Main {
    private static final Logger LOGGER = AppLogger.get(Main.class);


    /**
     * Valida los argumentos y lanza la conversión.
     * @param args archivo de entrada y archivo de salida
     */
    public static void main(String[] args) {
        // Verificar argumentos
        if (args.length != 2) {
            LOGGER.severe("Uso: java AudioConverter <archivo_entrada> <archivo_salida>");
            LOGGER.severe("Ejemplo: java -jar mvn-audio-converter-1.0.0-launcher.jar input.wav output.mp3");
            System.exit(1);
        }
        AudioConverter.converter(args[0], args[1]);
    }
}
