package steps;

import io.cucumber.java.en.*;

public class LoginSteps {

    // ================= ESCENARIO 1 =================

    @Given("el usuario abre la pagina")
    public void abrir_pagina() {
        System.out.println("Usuario abre la página");
    }

    @When("ingresa usuario y contraseña")
    public void ingresar_datos() {
        System.out.println("Ingresando usuario y contraseña");
    }

    @Then("visualiza la pagina principal")
    public void validar_pagina() {
        System.out.println("Página principal visible");
    }

    // ================= ESCENARIO 2 =================

    @Given("el usuario está en la página de login")
    public void usuario_en_login() {
        System.out.println("Usuario en página de login");
    }

    @When("el usuario ingresa su usuario")
    public void ingresar_usuario() {
        System.out.println("Usuario ingresado");
    }

    @When("el usuario ingresa su contraseña")
    public void ingresar_contraseña() {
        System.out.println("Contraseña ingresada");
    }

    @Then("el usuario debería acceder a la página principal")
    public void acceso_correcto() {
        System.out.println("Acceso concedido");
    }

    // ================= SCENARIO OUTLINE =================

    @Given("el usuario se encuentra en la pagina del login")
    public void usuario_en_login_outline() {
        System.out.println("Usuario en login (outline)");
    }

    @When("el usuario ingresa {string} y {string}")
    public void ingresar_credenciales(String usuario, String contraseña) {
        System.out.println("Usuario: " + usuario);
        System.out.println("Contraseña: " + contraseña);
    }

    @Then("el usuario debería ver {string}")
    public void validar_resultado(String resultado) {
        System.out.println("Resultado: " + resultado);
    }
}
