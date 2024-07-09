# language: es
@Regresion
Característica: Seleccionar dos productos de la categoria Amor y agregarlos al carrito de compras

  Escenario: Seleccionar dos productos de la categoria amor
    Dado que estoy en la pagina principal del sitio de compras
    Cuando selecciono la categoria "Amor" agregando los productos "MDF 0001" "MDF 00010" al carrito
    Entonces el carrito de compras deberia contener ambos productos seleccionados

  Escenario: Seleccionar un producto de la categoría cumpleaños, agregarlo y eliminarlo del carro de compras
    Dado que estoy en la pagina principal del sitio de compras
    Cuando selecciono la categoria "Cumpleaños" agregando el "MDF 0001" al carrito
    Y elimino el producto del carrito de comporas
    Entonces el carrito de compras deberia estar vacio