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