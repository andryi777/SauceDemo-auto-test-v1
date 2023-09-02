@tag
Feature: Pagina principal de Saucedemo

  @Login
  Scenario: Validar ingreso de login
    Given accedo a la web de Saucelabs
    Then debe mostrarse el título "Swag Labs"
    
  @ValidarItemDetalle
  Scenario Outline: Validar ingreso de login
    Given accedo a la web de Saucelabs
    And selecciono el item "<item>"
    Then debe mostrarse el item "<item>" con su precio "<precio>"

    Examples: 
      | item | precio |
      | Sauce Labs Bolt T-Shirt | $15.99 |
