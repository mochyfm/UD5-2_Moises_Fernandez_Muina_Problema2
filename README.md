# Problema 2 (5 puntos)

Enunciado del problema:

Nos han contactado desde la famosísima compañía *TeLaS* de fabricación de *vehículos eléctricos* y textiles. Nos piden que creemos un modelo digital para su nuevo vehículo el Vereda3000 GT.

Para garantizar la compatibilidad con todos sus sistemas, nuestra clase debe implementar la siguiente interfaz:

    public interface Vehicle {

      public float energyLevel();
      public void recharge();
      public void move();
      public String status();
      
    }

Cada uno de los métodos debe tener el siguiente comportamiento:

- **energyLevel()**: Debe devolver un valor flotante que se corresponderá con la cantidad de energía que se encuentra almacenada en las baterías del vehículo.

- **recharge()**: Cada vez que se ejecute este método la carga de la batería pasará a ser la máxima posible.

- **move()**: Cada vez que se ejecute este método, la carga de la batería tendrá que decrementarse en un valor que dependerá de cada vehículo. Del mismo modo tendrá que registrarse que se ha llevado a cabo un movimiento.

- **status()**: Debe devolver una cadena con el siguiente formato:
El vehículo <matrícula> tiene un nivel de carga de: <nivel de energía> y se ha movido <número de movimientos> veces.

    
Crea una clase VeredaGT que implemente la interfaz Vehicle y que debe tener, como mínimo, los siguientes atributos:

- **matrícula**: Un valor alfanumérico que identifica unívocamente al coche.

- **maxEnergy**: Un valor numérico que representa el nivel de carga máximo de la batería.

- **energy**: Un valor numérico que representa el nivel de carga actual de la batería.

- **movementCount**: Un valor numérico que representa el número de movimientos que ha ejecutado el vehículo. Debe tener un valor inicial de 0 siempre.

- **energyDelta**: Un valor numérico que representa la cantidad de energía que consume el vehículo por cada movimiento.

Crea un programa que muestre el correcto funcionamiento de la clase. Presta especial atención para que la clase no permita 
ningún comportamiento inadecuado, por ejemplo: Un vehículo sin energía no debería poder moverse.
