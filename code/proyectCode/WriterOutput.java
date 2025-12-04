import java.io.*;

public class WriterOutput {

    public void generarSalida(String ruta, double resultado) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            bw.write("Resultado del coeficiente de correlación:\n");
            bw.write("r = " + resultado);
        }
    }
}
