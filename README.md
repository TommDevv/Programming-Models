# Programming-Models Proyect

# Requerimientos

## User Stories

- 
    
    ### Historias de Usuario Funcionales
    
    1. **Registro de Usuarios**
        - Como usuario nuevo, quiero registrarme en el sistema con un nombre de usuario y contraseña para poder acceder a la librería.
    2. **Autenticación de Usuarios**
        - Como usuario registrado, quiero iniciar sesión con mi nombre de usuario y contraseña para acceder a mis funcionalidades personalizadas.
    3. **Creación de Documentos**
        - Como usuario autenticado, quiero poder crear un nuevo documento en la librería introduciendo al menos un dato (título, fecha de publicación, autores, etc.) para que este empiece a existir en el sistema.
    4. **Modificación de Documentos**
        - Como usuario autenticado, quiero poder modificar los datos de un documento existente, actualizando su información como título, autores, ISBN, etc.
    5. **Eliminación de Documentos**
        - Como usuario creador de un documento, quiero poder eliminar un documento que creé, siempre y cuando no esté prestado para consulta.
    6. **Consulta de Documentos**
        - Como usuario, quiero poder buscar y consultar la información de documentos existentes en la librería utilizando diferentes criterios de búsqueda como título, autor, ISBN, etc.
    7. **Reserva de Documentos**
        - Como usuario autenticado, quiero poder reservar un documento para consulta física, registrando la fecha de reserva.
    8. **Devolución de Documentos**
        - Como usuario autenticado, quiero poder devolver un documento que he reservado para que vuelva a estar disponible en la librería.
    9. **Visualización del Historial de Cambios**
        - Como administrador, quiero poder visualizar el historial de cambios de un documento, incluyendo quién lo creó, quién lo modificó y quién lo eliminó, junto con las fechas correspondientes.
    
    ### Historias de Usuario No Funcionales
    
    1. **Interfaz de Usuario**
        - Como usuario, quiero una interfaz de usuario intuitiva y fácil de usar para poder navegar y utilizar la librería sin complicaciones.
    2. **Respaldo y Recuperación de Datos**
        - Como administrador, quiero que el sistema realice respaldos periódicos de la base de datos para asegurar la recuperación de datos en caso de fallos.
    
    ### Consideraciones Adicionales
    
    - **Tipos de Documentos**
        - Como desarrollador, debo asegurarme de que el sistema maneje correctamente los diferentes tipos de documentos (libros, ponencias, artículos científicos), almacenando y mostrando los campos específicos correspondientes a cada tipo.
    - **Información de Contacto**
        - Como usuario, quiero poder ver y editar la información de contacto de los autores y editoriales (correo electrónico, dirección física, número de teléfono) asociada a cada documento.

## Requerimientos

- [ ]  Sistema de Login
    - detalles
        - Archivo de persistencia de los datos de usuario (properties)
- [x]  Modelo de usuario
    - detalles
        - Usuario, Contraseña, nickname, tipo **
- [x]  Modelo de archivo
    - detalles
        - título, fecha de publicación (localDate class) **, autores, ISBN, editorial, disponibilidad, estado, registro.
        - Registro: libro, Creador, ultimo modificador, fecha
        - Editorial y autor: Direccion fisica, correo y numero de telefono
            - Variaciones**
                - Libros: Paginas totales
                - Ponencias: nombre del congreso donde se escribió
                - Articulos: SSN
- [ ]  Sistema CRUD
- [ ]  Persistencia de documentos
- [ ]  Disponibilidad y registro de documentos
    - detalles
        - Archivo de persistencia por registro: editor, fecha, libro
- [ ]  GUI
    - detalles
        - ventana de login
        - ventana de administrador
        - ventana de vista y registro de documentos
- [x]  Adaptabilidad de los tipos de archivo
