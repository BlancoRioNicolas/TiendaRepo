package Carrito;

import Class.Products.Product;

public class Item {
    private final int cantidad;

    private final Product producto;

    public Item(int cantidad, Product producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }
    public Product getProducto(){
        return producto;
    }
public double getSubTotal(){
        return this.cantidad * this.getProducto().getPrice();
}
}
