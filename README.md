# conversor_de_monedas_exchangerate-api
<h1>¡Bienvenidx al Conversor de Moneda!</h1>
Este proyecto permite convertir monedas de manera rápida y sencilla utilizando las últimas tasas de cambio proporcionadas por ExchangeRate-API. 
Desarrollado en el marco de especialización Back-End en java, para el programa ONE de Alura LATAM + Oracle

<h2>CONSUMO DE LA API:</h2>
Se utilizó la API (ExchangeRate-API) de tasas de cambio para obtener los últimos datos de conversión de monedas. El codigo utiliza la biblioteca HttpClient para realizar solicitudes a la API. Se utilizó la clase HttpRequest para configurar y personalizar las solicitudes. 

<h2>MONEDAS:</h2>
Lista de monedas disponibles para la elección, permitiendo al usuario convertir entre las opciones que brinda la API. <br>
Dólar           --> USD  <br>
Peso Argentino  --> ARS  <br>
Real Brasileño  --> BRL <br>
Peso Colombiano --> COP <br>

<h2>FUNCIONAMIENTO</h2>
Al iniciar la ejecución del programa se muestra la siguiente ventana emergente:  <br>

![menuEmergente](https://github.com/user-attachments/assets/e6616061-5927-4981-b323-75233f684a03)

Al seleccionar una opcion dentro de las que se muestran en el menu, se mostrara una nueva ventana emergente donde se podra ingresar la cantidad que se desea convertir: <br>
![cantidadAConvertir](https://github.com/user-attachments/assets/60a34591-7112-469b-823e-f851a1eaeeae)

Una vez ingresada la cantidad, se muestra una nueva ventana emergente con el resultado de esta conversión: <br>
![resultado](https://github.com/user-attachments/assets/bb3dc469-6eea-4e72-9075-604437396bd9)

Este menu de conversiones continuara mostrandose hasta que se decida salir, usando 2 opciones, la que se encuentra en el menu correspondiente a la opcion 7:  <br>
![salida](https://github.com/user-attachments/assets/e28b1474-0d8d-4ad8-9bca-618c708db3af)

o presionando el boton de "Cancel" que se muestra en la imagen donde se ve el menu:  <br>
![cancel](https://github.com/user-attachments/assets/14aaa0af-91d4-44a2-9cf5-2ae7231cd7ad)

<h4>Entradas no validas</h4>
Por otro lado, si se ingresa datos no validos como un numero diferente a los que se presentan en el menu se muesrta:  <br>

![numerofueradelmenu](https://github.com/user-attachments/assets/38eb7b7c-fe11-423f-803d-d3c805cf44cd)

O si se ingresa un String, o cualquier elemento diferente a un numero se muestra:  <br>
![letra](https://github.com/user-attachments/assets/c2804789-2f92-47d9-8672-9aecab219796)

Este es el funcionamiento basico del Convesor de Monedas.
