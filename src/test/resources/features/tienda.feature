Feature: Compra en tienda virtual
  Como cliente
  Quiero ver productos y agregarlos al carrito
  Para poder comprarlos

  Scenario: Agregar producto al carrito
    Given el usuario está en la página de productos
    And hay productos disponibles
    When el usuario agrega un producto al carrito
    Then el carrito muestra el producto seleccionado

  Scenario: Eliminar producto del carrito
    Given el usuario tiene un producto en el carrito
    When el usuario elimina el producto del carrito
    Then el carrito debería quedar vacío


  Scenario: Comprar producto
    Given el usuario está en la página de productos
    And el usuario ha agregado un producto al carrito
    When el usuario accede al carrito de compras
    And el usuario confirma la compra del producto
    Then la compra debería realizarse con éxito


  Scenario Outline: Agregar productos al carrito
    Given el usuario está en la página de productos
    When el usuario agrega "<producto>" al carrito
    Then el carrito debería mostrar "<producto>"

    Examples:
      | producto      |
      | Laptop        |
      | Celular       |
      | Audífonos     |



