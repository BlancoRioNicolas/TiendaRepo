package Products.electronics;

import Class.Products.Product;

import java.util.Objects;

public class ElectronicProduct extends Product {
    private String brand;
    public ElectronicProduct(String name, float price, int stock, String brand) {
        super(name, price, stock);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElectronicProduct that = (ElectronicProduct) o;
        return Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), brand);
    }

    @Override
    public String toString() {
        return "ElectronicProduct{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
