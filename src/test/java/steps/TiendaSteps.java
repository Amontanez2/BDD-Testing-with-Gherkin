package steps;

import io.cucumber.java.en.*;

public class TiendaSteps {

    @Given("el usuario está en la página de productos")
    public void usuario_en_productos() {
        System.out.println("Usuario en la página de productos");
    }

    @Given("hay productos disponibles")
    public void hay_productos_disponibles() {
        System.out.println("Productos disponibles");
    }

    @When("el usuario agrega un producto al carrito")
    public void agregar_producto() {
        System.out.println("Producto agregado al carrito");
    }

    @Then("el carrito muestra el producto seleccionado")
    public void validar_producto_carrito() {
        System.out.println("Producto visible en el carrito");
    }

    // ================= ELIMINAR =================

    @Given("el usuario tiene un producto en el carrito")
    public void producto_en_carrito() {
        System.out.println("Producto ya estaba en carrito");
    }

    @When("el usuario elimina el producto del carrito")
    public void eliminar_producto() {
        System.out.println("Producto eliminado");
    }

    @Then("el carrito debería quedar vacío")
    public void carrito_vacio() {
        System.out.println("Carrito vacío");
    }

    // ================= COMPRA =================

    @Given("el usuario ha agregado un producto al carrito")
    public void producto_agregado_previamente() {
        System.out.println("Producto agregado previamente");
    }

    @When("el usuario accede al carrito de compras")
    public void acceder_carrito() {
        System.out.println("Accediendo al carrito");
    }

    @When("el usuario confirma la compra del producto")
    public void confirmar_compra() {
        System.out.println("Compra confirmada");
    }

    @Then("la compra debería realizarse con éxito")
    public void compra_exitosa() {
        System.out.println("Compra realizada correctamente");
    }

    // ================= SCENARIO OUTLINE =================

    @When("el usuario agrega {string} al carrito")
    public void agregar_producto_variable(String producto) {
        System.out.println("Producto agregado: " + producto);
    }

    @Then("el carrito debería mostrar {string}")
    public void validar_producto_variable(String producto) {
        System.out.println("Carrito contiene: " + producto);
    }
}