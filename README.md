# Convertidor de audio

Herramienta de línea de comandos que convierte archivos de audio entre formatos, con barra de progreso, usando la biblioteca JAVE (que incluye FFmpeg).

## Características

- Formatos de salida: **MP3, WAV, OGG, AAC, FLAC y WMA** (se deduce de la extensión del archivo de salida).
- Estéreo a 44.1 kHz; bitrate de 128 kbps en los formatos con pérdida.
- Barra de progreso, duración, ratio de compresión y tiempo empleado.
- No requiere instalar FFmpeg: va incluido en las dependencias.

## Requisitos

- JDK 21 y Maven 3.9 o superior.

## Compilar y ejecutar

```bash
mvn clean package
java -jar target/mvn-audio-converter-1.0.0-launcher.jar entrada.wav salida.mp3
```

## Notas

- La primera ejecución puede tardar un poco mientras JAVE extrae el binario de FFmpeg.
- Si la extensión de salida no se reconoce, se convierte a MP3.

## Licencia

Código de ejemplo de uso libre con fines educativos.
