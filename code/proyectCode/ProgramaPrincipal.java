public class ProgramaPrincipal {
    public static void main(String[] args) {
        try {
            ReaderInput lector = new ReaderInput();
            CorrelacionLineal calculadora = new CorrelacionLineal();
            WriterOutput escritor = new WriterOutput();
            DataSet datos = lector.cargarArchivo("input.txt");
            double correlacion = calculadora.calcularCoeficiente(datos);
            escritor.generarSalida("output.txt", correlacion);
            System.out.println("Proceso completado. Revisa output.txt");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}