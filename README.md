# Patrones de Diseño

## Patrón Singleton

El patrón de diseño Singleton garantiza que una clase tenga una única instancia.

En la clase Singleton.java, el constructor es privado para evitar que otras clases puedan crear instancias de Singleton directamente usando el operador new. Esto garantiza que las instancias sólo puedan ser creadas dentro de la clase Singleton.

El método público getSingleton() devuelve la instancia única de Singleton. El método verifica si INSTANCE es null y, en ese caso, crea una nueva instancia de Singleton. Si no es null, simplemente retorna la instancia existente.

En la clase app, se obtienen las instancias y se guardan en las variables intancia1 e instancia2 respectivamente. Luego se compara instancia1 y instancia2 para verificar si ambas referencias apuntan a la misma instancia única de Singleton.

Salida de consola:
> Ambas instancias son iguales.

## Patrón Mediator

El patrón de diseño Mediator se utiliza para reducir las dependencias directas entre objetos, facilitando así el desacoplamiento. Este patrón introduce un mediador que controla la comunicación entre diferentes objetos, evitando que estos interactúen directamente entre sí.

El Mediator actúa como el intermediario entre Car, Radio y Phone, gestionando las interacciones entre estos componentes.

La clase Car interactúa con el mediador para encender o apagar el coche, delegando las acciones correspondientes al mediador.
La clase Radio interactúa con el mediador para encender o apagar la radio, delegando las acciones correspondientes al mediador.
La clase Phone interactúa con el mediador para manejar las llamadas telefónicas y el estado de la música, delegando las acciones correspondientes al mediador.

La clase Config se encarga de inicializar el sistema y demostrar su funcionamiento.
La clase Main se encarga de iniciar la configuración y demostrar el sistema.

## Patrón Decorator

El patrón de diseño Decorator permite agregar comportamiento a un objeto de manera dinámica. Este patrón es útil cuando se desea extender la funcionalidad de las clases de manera flexible y sin modificar su código.

En este ejemplo, tenemos una interfaz DataBase que define las operaciones básicas de una base de datos y una implementación concreta de esta interfaz llamada DataBaseMemory. También tenemos una clase Logger que se encarga de registrar mensajes.

Luego, creamos una clase LoggerDecorator que implementa la interfaz DataBase y actúa como un decorador para añadir funcionalidad de logging a cualquier implementación de DataBase sin modificar su código.

Para verificar el correcto funcionamiento del LoggerDecorator, se implementa una prueba unitaria que realiza las siguientes acciones:

Inserta un registro en la base de datos a través del decorador.
Verifica que el registro ha sido añadido a la base de datos.
Verifica que el registro de la operación ha sido añadido al logger.
Obtiene los registros de la base de datos a través del decorador y verifica que se registra esta operación.

Para ver cómo se usan estas clases en un programa principal, puedes configurar el entorno en una clase Config y luego utilizarla en la clase Main.

Salida de consola:
> Registros en la base de datos: [Registro1, Registro2]
> Logs: [inserta Registro1, inserta Registro2, lectura]

## Patrón State

El patrón de diseño State permite a un objeto cambiar su comportamiento cuando cambia su estado interno. Este patrón es útil cuando un objeto necesita alterar su comportamiento en tiempo de ejecución dependiendo de su estado, y evita el uso de grandes estructuras condicionales (como if-else o switch).

En este ejemplo, se modela el estado de una tarjeta de crédito con los siguientes estados: ActiveState, DisableState, LockState y BuyingState. La clase User actúa como el contexto que maneja el estado actual de la tarjeta y delega el comportamiento a la instancia de estado correspondiente.

La clase State es abstracta y define los métodos que cada estado concreto debe implementar.
La clase ActiveState representa el estado en el que la tarjeta está activa y permite compras.
La clase DisableState representa el estado en el que la tarjeta está desactivada.
La clase LockState representa el estado en el que la tarjeta está bloqueada.
La clase BuyingState representa el estado en el que la tarjeta está realizando una compra.
La clase User actúa como el contexto que maneja el estado actual de la tarjeta y delega las solicitudes a la instancia de estado correspondiente.
La clase Main demuestra el uso del patrón State cambiando el estado de la tarjeta de crédito del usuario y mostrando las transiciones en la consola.

Salida de consola:
> State: Actived ...
> Current State: buying
> Current State: Stop buying
> Current State: Locked...
> Current State: Locked...

## Patrón Strategy

El patrón de diseño Strategy permite que una clase cambie su comportamiento en tiempo de ejecución mediante la composición con diferentes estrategias que implementan un comportamiento específico. Este patrón es útil cuando se desea que una clase tenga una familia de algoritmos y seleccione uno de ellos para su uso.

El patrón Strategy se utiliza para manejar los diferentes métodos de pago. El usuario puede elegir entre PayPal y tarjeta de crédito, y la aplicación utilizará la estrategia correspondiente para procesar el pago.

En PayStrategy.java, definimos una interfaz común para todas las estrategias de pago.
PayByPayPal.java: Implementa el método de pago con PayPal.
PayByCreditCard.java: Implementa el método de pago con tarjeta de crédito.
En Order.java, la clase Order utiliza la interfaz PayStrategy para delegar la recolección de datos de pago y el proceso de pago.
La clase Main.java actúa como el cliente que selecciona productos, elige el método de pago y procesa el pedido.

> Please select a product:
> 1 - Mother board
> 2 - CPU
> 3 - HDD
> 4 - Memory
> Count: 2
> Do you wish to continue selecting products? Y/N: N
> Please select a payment method:
> 1 - PayPal
> 2 - Credit Card
> Enter the user's email: user@example.com
> Enter the password: ********
> Pay 4400 units or Continue shopping? P/C: P
> Paying 4400 using PayPal.
> Payment has been successful.