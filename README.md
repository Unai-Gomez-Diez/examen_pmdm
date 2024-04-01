## Examen Programación Multimedia y Dispositivos Móviles 22-23 (Marzo)

## Aviso Importante

Tal como se indica en la programación didáctica del módulo, para aprobar se necesita superar todos
los objetivos.

Los objetivos están agrupados en:

1. Aplicaciones Móviles
2. Android Studio
3. Arquitectura
4. User Interface(UI)
5. Multimedia
6. Publicación App
7. Calidad del código

## Requisitos para la realización de la prueba

- La prueba tiene una duración de 4 horas. Una vez terminada la prueba, se quitarán los privilegios
  al usuario para evitar modificaciones.
- La prueba se hará sobre este repositorio.
- La prueba se entrega a través de una Pull Request por cada uno de los ejercicios solicitados. Si
  no se entrega una Pull Request se considerará incompleta pues existe un objetivo sobre la
  documentación a través de Pull Request.
- En la Pull Request pondrá como revisor al profesor.
- **No se hará nada de la capa de datos** todo lo necesario de esta capa está ya en el proyecto.
- Los iconos que se dan están en la carpeta assets. El resto de iconos los tiene que añadir el
  alumno (recuerda que no puedes buscar por Google).
- Se deberá seguir una arquitectura Clean Architecture: presentation, domain y data.
- Se podrán crear todas las funciones de extensión o complementarias que ayuden en la mejora y
  calidad del código.

Si se incumple algunos de los requisitos descritos la prueba se considerará como **NO APTA**.

## Para todos los ejercicios

- Se usa Either.
- Se usa Hilt.
- Se usan estilos.
- No hace falta añadir ningún tema.

## Ejercicio 1: Estructura de la aplicación

Se pide crear la estructura de la aplicación:

1. Añadir las librerías que se crean oportunas.
2. La aplicación tendrá una actividad principal y dos fragmentos. Esta actividad tendrá el
   FragmentContainer donde se cargarán los fragmentos.
3. El fragmento a cargar por defecto es el de Listado de adopciones. (Opcional)Esto se establecerá con el
   componente de Navegación.
4. El fragmento AdoptionsFragment se encargará de mostrar el listado de adopciones.
5. El fragmento AdoptionDetailFragment mostrará el detalle de la adopción.

## Ejercicio 2: Listado de Adopciones (AdoptionsFragment)

Se pide crear la pantalla que muestra el listado de adopciones:

1. Crear los items usando un componente eficiente sabiendo que no se conocen el número de adopciones
   existentes.
2. El diseño será el que se adjunta. La vista debe ser construida de forma eficiente.
3. Deberá existir una toolbar.
4. Al hacer click en una de las adopciones, se mostrará el detalle de la adopción seleccionada.
5. Al pulsar sobre el icono de corazón de la Toolbar, se mostrará un SnackBar con el texto: Favorito
   seleccionado.
6. Al pulsar sobre el icono de compartir que se muestra en cada uno de los items de adopciones,
   mostrará un SnackBar con el texto: compartir.
7. Es necesario el uso de dimens, strings y estilos.
8. La comunicación con los casos de uso se hará mediante el patrón MVVM.
9. La comunicación entre el ViewModel y la vista se hará mediente LiveData.
10. Los casos de uso se ejecutarán con Coroutines (lo da el profesor).
11. La imagen de las adopciones se cargará por URL.
12. Se deberán gestionar los tres estados de la vista: loading, error y datos.
13. Cuando la vista está en el estado loading, se mostrará un SnackBar con el texto: Cargando....
14. Cuando la vista está en el estado error, se mostrará un SnackBar con el texto: Error!!
15. Se deberé usar Hilt como Inyector de Dependencias.

**Diseño**

![](assets/listado_adopciones.jpeg)

## Ejercicio 3: Detalle de Adopciones

Se pide crear la pantalla que muestra el detalle de adopciones.

1. La vista tendrá en cuenta cualquier tipo de resolución del móvil.
2. El diseño será el que se adjunta. La vista debe ser construida de forma eficiente.
3. Al pulsar sobre la flecha de la toolbar volveremos al listado de adopciones.
4. En el listado de adopciones al pulsar en el botón 'atrás' saldremos de la aplicación.
5. Deberá existir una toolbar.
6. Es necesario el uso de dimens, strings y estilos.
7. La comunicación con los casos de uso se hará mediante el patrón MVVM.
8. La comunicación entre el ViewModel y la vista se hará mediente LiveData.
9. Los casos de uso se ejecutarán con Coroutines (lo da el profesor).
10. La imagen de las adopciones se cargará por URL.
11. Se deberán gestionar los tres estados de la vista: loading, error y datos.
12. Cuando la vista está en el estado loading, se mostrará un SnackBar con el texto: Cargando....
13. Cuando la vista está en el estado error, se mostrará un SnackBar con el texto: Error!!
14. El uso de Hilt es opcional.

**Diseño**

![](assets/detalle_adopcion.jpeg)

## Ejercicio 4: Publicación de la app

Se pide publicar el proyecto en el Play Store.

1. Generaremos una versión firmada del bundle (aar).
2. Crearemos una rama release del proyecto.
3. Crearemos un tag de la rama release. Añadiremos el bundle al tag (aar).

## Código de prueba

**Ejecución de una Coroutine en el ViewModel**

```
Librería: 
viewModelScope.launch{
   // Código aquí
}
```
