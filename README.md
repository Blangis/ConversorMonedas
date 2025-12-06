# Currency Converter – Java

Conversor de monedas en Java utilizando la API de ExchangeRate-API.
El usuario puede elegir entre distintas conversiones, ingresar un monto y obtener el resultado en tiempo real.

### Características
- Menú interactivo para seleccionar el tipo de conversión.
- Soporte para varias monedas (USD, EUR, MXN, JPY, GBP, CAD, etc.).
- Consumo de API mediante HttpClient.
- Manejo de errores por entrada inválida.
- Validación de opciones del menú.
- Conversión formateada para el usuario.

###  Tecnologías utilizadas
- Java 17+
- HttpClient
- Gson
- ExchangeRate-API

  ### Estructura del proyecto
  src/
  
├── Main.java – Programa principal, menú y flujo general

├── PairConversion.java – Lógica de consumo de API

├── Coin.java – Record para mapear la respuesta JSON

### Configuración necesaria

Instalar Gson si usas Maven:
(Escribe la dependencia manualmente en tu pom.xml.)

Obtener tu API Key en:
`https://www.exchangerate-api.com/`

y reemplazar tu clave en la URL dentro de PairConversion.
