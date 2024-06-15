# FirstJavaProject
Java project in Spanish, description of the exercise below 

Ejercicio de Programación Java: Gestión de Supermercado
En este ejercicio, crearás un sistema para gestionar los productos de un supermercado. Deberás implementar una jerarquía de
clases que incluya una clase abstracta Producto, con subclases Bebida, ProductoLimpieza y Carne. Además, utilizarás interfaces
para representar características especiales de los productos.
Instrucciones:
1. Define una clase abstracta Producto que represente los productos que se venden en el supermercado. Esta clase debe tener
propiedades como nombre, precio y fechaCaducidad.
2. Implementa métodos para establecer y obtener estas propiedades en la clase Producto.
3. Define subclases de Producto para representar diferentes categorías de productos: Bebida, ProductoLimpieza y Carne.
Cada subclase debe añadir propiedades y métodos específicos según su categoría.
4. Crea una interfaz Descuento que incluya métodos para aplicar descuentos a los productos.
5. Crea una interfaz EsAlimento que indique si un producto es un alimento y que devuelva un entero representando la
cantidad de calorías del alimento.
6. Implementa las interfaces en las clases correspondientes según sea necesario.
7. Desarrolla un programa interactivo que permita al usuario crear objetos de productos según su elección. El programa debe
permitir al usuario ingresar los detalles de los productos por consola.
8. Asegúrate de manejar el caso en el que el usuario no introduzca ningún producto, lanzando una excepción adecuada y
proporcionando un mensaje informativo.
9. Al finalizar la creacion de productos, el programa debe calcular y mostrar cuánto dinero cuestan los productos que son
alimentos en total y cuánto los que no lo son.
10. Implementa la siguiente regla de negocio: las carnes con dos días o menos de caducidad tienen un descuento del 20%.
