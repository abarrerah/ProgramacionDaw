package Verdulería;

import java.util.Objects;

public class Producto {
    private String mName;
    private double price;

    public Producto(String mName, double price) {
        this.mName = mName;
        this.price = price;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Double.compare(producto.getPrice(), getPrice()) == 0 &&
                Objects.equals(getmName(), producto.getmName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getmName(), getPrice());
    }

    @Override
    public String toString() {
        return  " " + price;
    }
}
