package Products.electronics;

import java.util.Objects;

public class Mouse extends ElectronicProduct {
    private Boolean gamer;
    private Boolean rgb;

    public Mouse(String name, float price, int stock, String brand, boolean gamer, boolean rgb) {
        super(name, price, stock, brand);
        this.gamer = gamer;
        this.rgb = rgb;
    }

    public Boolean getGamer() {
        return gamer;
    }

    public void setGamer(Boolean gamer) {
        this.gamer = gamer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mouse mouse = (Mouse) o;
        return Objects.equals(gamer, mouse.gamer) && Objects.equals(rgb, mouse.rgb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gamer, rgb);
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "gamer=" + gamer +
                ", rgb=" + rgb +
                '}';
    }
}
