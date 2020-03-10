package Verdulería;

import java.util.Objects;

public class LineaPedido {
    private int Amount;
    private Producto product;

    public LineaPedido(int amount, Producto product) {
        Amount = amount;
        this.product = product;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public Producto getProduct() {
        return product;
    }

    public void setProduct(Producto product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineaPedido that = (LineaPedido) o;
        return getAmount() == that.getAmount() &&
                Objects.equals(getProduct(), that.getProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAmount(), getProduct());
    }

    @Override
    public String toString() {
        return "OrderDetails" +
                " cantidad " + Amount +
                " con el producto " + product;
    }
}
