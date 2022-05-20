
public class Telefone {

    public String codigoArea;
    public String numero;

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    public String getCodigoArea() {

        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {

        this.codigoArea = codigoArea;
    }

    public String getNumero() {

        return numero;
    }

    public void setNumero(String numero) {

        this.numero = numero;
    }

    @Override
    public String toString() {
        return "("+ getCodigoArea() + ") " + getNumero();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Telefone telefone = (Telefone) o;

        if (codigoArea != null ? !codigoArea.equals(telefone.codigoArea) : telefone.codigoArea != null) return false;
        return numero != null ? numero.equals(telefone.numero) : telefone.numero == null;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (codigoArea == null ? 0 : codigoArea.hashCode());
        hash = 31 * hash + (numero == null ? 0 : numero.hashCode());
        return hash;
    }
}
