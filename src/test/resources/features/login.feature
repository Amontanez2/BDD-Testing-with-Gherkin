Feature: Login

  Scenario: Login exitoso
    Given el usuario abre la pagina
    When ingresa usuario y contraseña
    Then visualiza la pagina principal

  Scenario: Inicio de sesión exitoso
    Given el usuario está en la página de login
    When el usuario ingresa su usuario
    And el usuario ingresa su contraseña
    Then el usuario debería acceder a la página principal

  Scenario Outline: Inicio de sesion
    Given el usuario se encuentra en la pagina del login
    When el usuario ingresa "<usuario>" y "<contraseña>"
    Then el usuario debería ver "<resultado>"
    Examples:
      | usuario  | contraseña | resultado |
      | admin    |  2345 |  exito |
      | cor1     | 123 |   error |
      | cor2    |     |  error |
