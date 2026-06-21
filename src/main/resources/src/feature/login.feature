Feature: Login

  Scenario: Login exitoso
    Given el usuario abre la pagina
    When ingresa usuario y contraseña
    Then visualiza la pagina principal