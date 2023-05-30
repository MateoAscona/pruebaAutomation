Feature: Validar nueva facturación

  Scenario: Validar que se pregunte si el asociado solicita el envío de facturas al dar de alta un nuevo caso Tipo Facturación
    Given El oficial esta logueado
    When Se crea un nuevo caso tipo facturacion
    Then se espera la respuesta del asistente
