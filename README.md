# 📚 Sistema de Gestión de Biblioteca  

## 📖 Descripción  
El **Sistema de Gestión de Biblioteca** es una aplicación diseñada para facilitar la administración de libros, préstamos y usuarios en una biblioteca. Permite realizar operaciones como:  
- 📌 **Búsqueda de libros** por título, autor o género.  
- 🏷️ **Reserva y devolución** de libros.  
- 👤 **Gestión de usuarios** con distintos roles (estudiantes, profesores, investigadores).  
- 🔔 **Notificaciones** cuando un libro reservado esté disponible.  

El proyecto está diseñado siguiendo **principios SOLID** y patrones de diseño para garantizar un código modular, reutilizable y escalable.  

---

## 🏗️ Patrones de Diseño Implementados  
Este sistema ha sido diseñado utilizando los siguientes patrones de diseño:  

- **Singleton** → Control de acceso único al gestor de base de datos.  
- **Factory Method** → Creación flexible de libros físicos y electrónicos.  
- **Abstract Factory** → Generación de distintos tipos de usuarios.  
- **Builder** → Construcción de objetos de libros con múltiples atributos opcionales.  
- **Prototype** → Clonación rápida de libros.  
- **Adapter** → Integración con bases de datos externas.  
- **Decorator** → Adición dinámica de características a los libros.  
- **Observer** → Notificación automática a usuarios sobre disponibilidad de libros.  
- **Strategy** → Implementación de múltiples algoritmos de búsqueda.  
- **Command** → Gestión de reservas y devoluciones con soporte de deshacer/rehacer.  

---

## ⚙️ Tecnologías Utilizadas  
- **Lenguaje:** Java  
- **Base de Datos:** MySQL 
- **Interfaz Gráfica:** Java Swing (opcional)  
- **Herramientas:** Netbeans, Git, GitHub  

---

## 🚀 Instalación y Ejecución  

### 🔹 Requisitos Previos  
1. Tener **Java 17+** instalado.  
2. Instalar **MySQL** como base de datos.  
3. Clonar el repositorio:  

   ```sh
   git clone https://github.com/tuusuario/Sistema-Gestion-Biblioteca.git
   cd Sistema-Gestion-Biblioteca

4. Configurar la base de datos en el archivo config.properties

### 🔹 Ejecución
Para ejecutar el sistema, usa el siguiente comando en el terminal:

  ```sh
  mvn clean install
  java -jar target/biblioteca.jar
  ```

---

## 🛠️ Contribución
Si deseas contribuir al proyecto:

1. Haz un fork del repositorio.
2. Crea una nueva rama:

  ```sh
  git checkout -b feature-nueva-funcionalidad
  ```

3. Realiza tus combios y sube tu código:

   ```sh
   git commit -m "Añadida nueva funcionalidad"
   git push origin feature-nueva-funcionalidad
   ```
4. Crea un Pull Request explicando los cambios.

---

## 📩 Contacto

👨‍💻 Autor: Pablo Aranda Cortés

📧 Email: pabloarandacortes02@gmail.com

🔗 GitHub: github.com/Pab0Aranda
