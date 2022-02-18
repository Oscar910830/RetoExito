#language: en
Feature: Busqueda existosa en la pagina de Exito

  Scenario: Buscar en Exito

    Given que me encuentro en la pagina de Exito
    When busco productos
    Then hace la busqueda y me muestra el resultado