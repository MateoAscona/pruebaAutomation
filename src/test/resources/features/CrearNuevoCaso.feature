Feature: Validar nueva facturación

  Scenario: Validar que se pregunte si el asociado solicita el envío de facturas al dar de alta un nuevo caso Tipo Facturación
    Given Oficial da de alta un nuevo caso Tipo Facturación
    When se pregunta '¿Asociado solicita que le enviemos alguna de sus facturas?' presentando las opciones SI o NO
    Then se espera la respuesta del asistente
