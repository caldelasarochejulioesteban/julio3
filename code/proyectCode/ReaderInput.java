import java.io.*;
import java.util.*;

public class ReaderInput {
    public DataSet cargarArchivo(String ruta) throws IOException {
        List<Double> listaX = new ArrayList<>();
        List<Double> listaY = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (linea.isEmpty()) continue;
                String[] partes = linea.split(",");
                if (partes.length != 2) throw new IOException("Formato incorrecto: " + linea);
                listaX.add(Double.parseDouble(partes[0]));
                listaY.add(Double.parseDouble(partes[1]));
            }
        }
        return new DataSet(
            listaX.stream().mapToDouble(Double::doubleValue).toArray(),
            listaY.stream().mapToDouble(Double::doubleValue).toArray()
        );
    }
}