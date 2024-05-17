# Patrones de Diseño

## Patrón Singleton

El patrón de diseño Singleton garantiza que una clase tenga una única instancia.

En la clase Singleton.java, el constructor es privado para evitar que otras clases puedan crear instancias de Singleton directamente usando el operador new. Esto garantiza que las instancias sólo puedan ser creadas dentro de la clase Singleton.

El método público getSingleton() devuelve la instancia única de Singleton. El método verifica si INSTANCE es null y, en ese caso, crea una nueva instancia de Singleton. Si no es null, simplemente retorna la instancia existente.

En la clase app, se obtienen las instancias y se guardan en las variables intancia1 e instancia2 respectivamente. Luego se compara instancia1 y instancia2 para verificar si ambas referencias apuntan a la misma instancia única de Singleton.

Salida de consola:
> Ambas instancias son iguales.