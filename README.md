# Manejo de Archivos y Carpetas

<p align="justify">Este repositorio contiene un programa en Java llamado LectoescrituraArchivo. Este programa se utiliza para crear una carpeta y un archivo, escribir en el archivo, y luego comparar un dato ingresado por el usuario con la lista de datos en el archivo.</p>

## Descripción
<p align="justify">El programa LectoescrituraArchivo realiza las siguientes operaciones: </p>

- **Crear una carpeta y un archivo.** <p align="justify">El programa crea una carpeta y un archivo en una ruta especificada. Si la carpeta ya existe, el programa no la crea de nuevo.</p>

- **Escribir en el archivo.** <p align="justify">El programa escribe una lista de datos en el archivo. La lista de datos se crea utilizando el método creaLista, que devuelve una lista de cadenas de texto.</p>

- **Leer y comparar datos.**<p align="justify"> El programa solicita al usuario que ingrese un texto. Luego, lee los datos del archivo y compara cada línea con el texto ingresado por el usuario. Si el texto coincide con una línea en el archivo, el programa incrementa un contador. Finalmente, el programa imprime cuántas veces aparece el texto en el archivo.</p>

- El programa maneja las excepciones para asegurarse de que el archivo exista antes de intentar leerlo, y para manejar cualquier error que pueda ocurrir durante la lectura del archivo.</p>

## Cómo ejecutar el programa
<p align="justify">Para ejecutar el programa, necesitas tener instalado Java en tu máquina. Luego, puedes compilar y ejecutar el programa utilizando los siguientes comandos en la terminal:</p>



````bash
javac LectoescrituraArchivo.java
java LectoescrituraArchivo
