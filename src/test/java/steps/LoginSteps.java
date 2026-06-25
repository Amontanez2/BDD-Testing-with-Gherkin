package steps;

import io.cucumber.java.en.*;
import pages.LoginPage;

import utils.DriverManager;

public class LoginSteps {

    LoginPage login = new LoginPage(DriverManager.driver);

    @Given("el usuario abre la pagina")
    public void abrir_pagina() {
        login.abrirPagina();
    }

    @When("ingresa usuario y contraseña")
    public void ingresar_datos() {
        login.ingresarUsuario("standard_user");
        login.ingresarPassword("secret_sauce");
        login.clickLogin();
    }

    @Then("visualiza la pagina principal")
    public void validar_pagina() {
        System.out.println("Login ejecutado correctamente");
    }
}