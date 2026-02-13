#language: es
#encoding: UTF-8

Característica: Descarga documento de Cuenta de Ahorros comercial

@Reto
Escenario: Descarga de contrato unico de Productos y Servicios Bancarios  del producto de Cuenta de ahorros comercial
  Dado Que el cliente quiere acceder al servicio Cuenta de ahorro comercial de Depositos empresas
  Cuando va a la seccion de documentos
  Y descarga el documento Contrato unico de Productos y Servicios Bancarios
  Entonces deberia ver el documento generado
