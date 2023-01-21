
package stream;

/**
 *
 * @author Andrea
 */
public class Factura {
    private String articulo;
    private int importe;

    public Factura() {
    }

    public Factura(String articulo, int importe) {
        this.articulo = articulo;
        this.importe = importe;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Factura{" + "articulo=" + articulo + ", importe=" + importe + '}';
    }    
}