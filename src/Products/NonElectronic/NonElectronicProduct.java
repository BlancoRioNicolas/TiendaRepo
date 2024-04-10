package Products.NonElectronic;

import Class.Products.Product;

import java.util.Objects;

public class NonElectronicProduct extends Product {

    private int weight;
    public NonElectronicProduct(String name, float price, int stock, int weight) {
        super(name, price, stock);
        this.weight=weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NonElectronicProduct that = (NonElectronicProduct) o;
        return weight == that.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }

    @Override
    public String toString() {
        return "NonElectronicProduct{" +
                "weight=" + weight +
                '}';
    }
}
