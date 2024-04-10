package Products.electronics;

import java.util.Objects;

public class Screen extends ElectronicProduct {
    private String resolution;

    public Screen(String name, float price, int stock, String brand, String resolution) {
        super(name, price, stock, brand);
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Screen screen = (Screen) o;
        return Objects.equals(resolution, screen.resolution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolution);
    }

    @Override
    public String toString() {
        return "Screen{" +
                "resolution='" + resolution + '\'' +
                '}';
    }
}
