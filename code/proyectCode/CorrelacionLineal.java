public class CorrelacionLineal {
    public double calcularCoeficiente(DataSet datos) {
        double[] x = datos.obtenerX();
        double[] y = datos.obtenerY();
        int n = datos.tamaño();
        double sx=0, sy=0, sxy=0, sx2=0, sy2=0;
        for (int i=0; i<n; i++) {
            sx += x[i];
            sy += y[i];
            sxy += x[i]*y[i];
            sx2 += x[i]*x[i];
            sy2 += y[i]*y[i];
        }
        double num = (n*sxy) - (sx*sy);
        double den = Math.sqrt((n*sx2 - sx*sx)*(n*sy2 - sy*sy));
        if (den == 0) throw new ArithmeticException("División entre cero.");
        return num / den;
    }
}