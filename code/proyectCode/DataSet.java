public class DataSet {
    private double[] valoresX;
    private double[] valoresY;
    public DataSet(double[] valoresX, double[] valoresY) {
        if (valoresX == null || valoresY == null) {
            throw new IllegalArgumentException("Los arreglos no pueden ser nulos.");
        }
        if (valoresX.length != valoresY.length) {
            throw new IllegalArgumentException("Los datos deben tener la misma cantidad de elementos.");
        }
        if (valoresX.length < 2) {
            throw new IllegalArgumentException("Se requieren al menos dos entradas.");
        }
        this.valoresX = valoresX;
        this.valoresY = valoresY;
    }
    public double[] obtenerX() { return valoresX; }
    public double[] obtenerY() { return valoresY; }
    public int tamaño() { return valoresX.length; }
}