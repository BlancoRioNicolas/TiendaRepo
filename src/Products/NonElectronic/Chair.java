package Products.NonElectronic;

import java.util.Objects;

public class Chair extends NonElectronicProduct {
    private String material;

    public Chair(String name, float price, int stock, int weight, String material) {
        super(name, price, stock, weight);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Chair chair = (Chair) o;
        return Objects.equals(material, chair.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), material);
    }

    @Override
    public String toString() {
        return "Chair{" +
                "material='" + material + '\'' +
                '}';
    }
}
