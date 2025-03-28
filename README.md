# Sistema de Gestión Bibliotecaria 📚

Un sistema modular para gestionar bibliotecas, implementando patrones de diseño para garantizar escalabilidad, mantenibilidad y flexibilidad. Desarrollado en Java/Kotlin/C# (según preferencia).

---

## Características Principales ✨
- **Gestión de libros**:  
  - Estados de libros: `Disponible`, `Prestado`, `Reservado`, `Dañado` (patrón **State**).  
  - Clasificación jerárquica por categorías y subcategorías (`Category`).  
- **Usuarios académicos**:  
  - Creación de `Estudiantes`, `Profesores` e `Investigadores` mediante **Factory Method**.  
  - Notificaciones a investigadores solo si hay libros disponibles de su área (patrón **Observer**).  
- **Préstamos flexibles**:  
  - Estrategias de préstamo: `7 días` (Restringido), `14 días` (Estándar), `30 días` (Extendido) (patrón **Strategy**).  
- **Singleton**:  
  - Una única instancia global de `LibrarySystem` (equivalente a una "base de datos central").  
- **Iteradores**:  
  - Recorrido seguro de colecciones (`BookIterator`, `UserIterator`, `LoanIterator`).  

---

## Diagrama de Clases 🗂️  
Consulta el archivo [Diagrama de Clases.pdf](Diagrama%20de%20Clases.pdf) para entender la estructura completa del sistema.

---

## Patrones de Diseño Aplicados 🛠️  
| Patrón           | Objetivo                                                                 | Clases Involucradas                  |  
|-------------------|-------------------------------------------------------------------------|--------------------------------------|  
| **Singleton**     | Garantizar una única instancia de `LibrarySystem`.                     | `LibrarySystem`                      |  
| **Observer**      | Notificar a investigadores sobre libros disponibles de su área.        | `IObserver`, `ISubject`, `Researcher`|  
| **State**         | Gestionar estados de libros (ej: préstamo, devolución).                | `IBookState`, `BorrowedState`, etc.  |  
| **Strategy**      | Calcular fechas de devolución según el tipo de préstamo.               | `ILoanStrategy`, `StandardLoanStrategy` |  
| **Factory Method**| Crear usuarios académicos de forma desacoplada.                        | `SimpleUserFactory`, `User`          |  
| **Iterator**      | Recorrer colecciones sin exponer su estructura interna.                | `IIterator`, `BookIterator`, etc.    |  

---

## Configuración y Uso 🚀  
1. **Requisitos**:  
   - JDK 11+.  
   - IDE de tu preferencia (Ej: IntelliJ, Visual Studio, Netbeans...).  

2. **Ejecución**:  
```bash
git clone https://github.com/tu-usuario/library-system.git
cd library-system
# Compilar y ejecutar según el lenguaje elegido
