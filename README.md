# Ejercicio I - Aplicación JavaFX de Gestión de Personas

Este proyecto es una aplicación JavaFX para gestionar información sobre personas, utilizando una base de datos para almacenar los datos. La aplicación permite realizar operaciones básicas como agregar, modificar y eliminar personas, así como filtrar la lista de personas.

## Características
    
    - Interfaz gráfica de usuario intuitiva basada en JavaFX.
    - Conexión a una base de datos (MariaDB/MySQL) para almacenamiento persistente de datos.
    - Funcionalidades para agregar, modificar y eliminar registros de personas.
    - Filtros para facilitar la búsqueda de personas por nombre.
    - Soporte multidioma (español, euskera, inglés).

## Requisitos

    - Java Development Kit (JDK) 11 o superior.
    - MariaDB/MySQL instalado y configurado.
    - Dependencias de JavaFX.

## Instalación
    
    1. Clona este repositorio:
       ```bash
       git clone https://github.com/andreatticj/ejercicioI_DEIN.git
    2. Asegúrate de tener MariaDB/MySQL funcionando.
    
    3. Crea la base de datos y las tablas necesarias según el script proporcionado en el directorio sql.
    
    4. Configura la conexión a la base de datos en el archivo de configuración.
       
    5. Ejecuta la aplicación desde tu IDE favorito o utilizando Maven/Gradle.

  ## Estructura del Proyecto

    src/: Carpeta que contiene el código fuente de la aplicación.
        eu/andreatt/ejercicioi_dein/application/: Contiene la clase principal HelloApplication.java.
        eu/andreatt/ejercicioi_dein/bbdd/: Contiene la clase ConexionBBDD.java para la gestión de la base de datos.
        eu/andreatt/ejercicioi_dein/controller/: Contiene los controladores como HelloController.java y modalI.java para la lógica de la interfaz gráfica.
        eu/andreatt/ejercicioi_dein/dao/: Contiene la clase PersonaDAO.java para la interacción con la base de datos.
        eu/andreatt/ejercicioi_dein/model/: Contiene la clase Persona.java, que define el modelo de datos.
        eu/andreatt/ejercicioi_dein/util/: Contiene la clase Propiedades.java para la gestión de archivos de propiedades.
    resources/: Carpeta que contiene los recursos de la aplicación.
        fxml/: Archivos FXML que definen la estructura de la interfaz gráfica (ej. ejercicioI.fxml, modalI.fxml).
        images/: Iconos e imágenes utilizados en la aplicación (ej. agenda.png, agregar.png, contactos.jpeg, editar.png, eliminar.png).
        idiomas/: Archivos de propiedades para la localización en diferentes idiomas (ej. messages_en.properties, messages_es.properties, messages_eus.properties).
        css/: Archivos de estilos CSS para la interfaz de usuario (ej. styles.css).

## Uso

    Al abrir la aplicación, verás una tabla con la lista de personas.
    Puedes filtrar la lista escribiendo en el campo de texto correspondiente.
    Usa los botones para agregar, modificar o eliminar personas de la base de datos.

