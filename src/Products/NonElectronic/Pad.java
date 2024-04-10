package Products.NonElectronic;

import java.util.Objects;

public class Pad extends NonElectronicProduct {
    private String size;

    public Pad(String name, float price, int stock, int weight, String size) {
        super(name, price, stock, weight);
        this.size=size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pad pad = (Pad) o;
        return Objects.equals(size, pad.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }

    @Override
    public String toString() {
        return "Pad{" +
                "size='" + size + '\'' +
                '}';
    }
}
