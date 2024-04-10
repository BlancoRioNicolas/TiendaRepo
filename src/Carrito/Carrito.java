package Carrito;

import Class.Products.Product;

import java.util.ArrayList;

public class Carrito {
   private ArrayList<Item> items;

    public Carrito() {
        this.items = new ArrayList<>();
    }
    public String agregarAlCarrito (int cantidad, Product producto){
        if(this.items==null) this.items= new ArrayList<>();
        if(producto.getStock()<cantidad) return "No hay stock suficiente";

        Item item = new Item(cantidad,producto);
        if(this.items.add(item))return "Se ha agregado correctamente sus " + cantidad + producto.getName();
        else return "No se ha podido agregar correctamente el o los productos";
    }
    public ArrayList<Item> getItems{ return items}

    public String mostrarCarrito (){
        StringBuilder sb = new StringBuilder();
        this.items.forEach();
    }
}
