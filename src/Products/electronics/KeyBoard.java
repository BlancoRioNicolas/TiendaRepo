package Products.electronics;

import java.util.Objects;

public class KeyBoard extends ElectronicProduct {
    private Boolean mechanic;

    private boolean extended;

    public KeyBoard(String name, float price, int stock, String brand, Boolean mechanic, Boolean extended) {
        super(name, price, stock, brand);
        this.extended = extended;
        this.mechanic = mechanic;
    }

    public Boolean getMechanic() {
        return mechanic;
    }

    public void setMechanic(Boolean mechanic) {
        this.mechanic = mechanic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        KeyBoard keyBoard = (KeyBoard) o;
        return extended == keyBoard.extended && Objects.equals(mechanic, keyBoard.mechanic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mechanic, extended);
    }

    @Override
    public String toString() {
        return "KeyBoard{" +
                "mechanic=" + mechanic +
                ", extended=" + extended +
                '}';
    }
}
