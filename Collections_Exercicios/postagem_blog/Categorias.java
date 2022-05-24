public enum Categorias {

    DEVOPS(1),
    DESENVOLVIMENTO(2),
    DATA_SCIENCE(3);

    private final int valor;
    Categorias(int valorEnum) {
        this.valor = valorEnum;
    }

    public int getValor() {
        return valor;
    }
}
