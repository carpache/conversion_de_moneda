# CONVENTIDOR DE MONEDA

Crear el menu para las opciones de convertir  monedas

Se creo el programa en base a las API de conversion de moneda que se encuetra en este link https://www.exchangerate-api.com/    donde debe crear y registrar para poder recibir un key 

 EL PROGRAMA DE ESTA DIVIDO EN 4 CLASES

 PRIMERA CLASE

 CLASE PRINCIPAL 
 Donde esta la presentacion del programa 
 se utilizo la creaciond la vatiable int opcion, el metodo Scanner, Switch entre las 7 opciones o casos con la conversion de la meneda bae y la moneda a convertir


 SEGUNDA CLASE
 es la clase Moneda que estas den forma de RECORD donde automaticamento se crean SET Y GET ,registrando las variable en el parametro:

 String base_code,
 String target_code,
 double conversion_rate




 TERCERA CLASE

 la clase convertidordeMoneda 
 es donde se crea las variables :

 cantidad-                                                                                                 
 cantidadConvertir cada una en variable DOUBLE
CON LA FURMULA FINAL DE CONVERSION 



CUARTA CLASE

  la clase consultarMOneda esta es la mas importante donde tiene que vincular el servidor de conersion de moneda con java:

   URI direccion = URI.create( "https://v6.exchangerate-api.com/v6/de300d12d2bc8d1273fb5ece/pair/" + base_code +"/"+ target_code  );

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri( direccion )
                .build();
creando un exception si no se enccuntre la moneda que no este en referencia 
 

 



 

 
