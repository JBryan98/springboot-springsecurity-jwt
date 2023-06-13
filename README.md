<div align="center">
<img src="https://cdn.hashnode.com/res/hashnode/image/upload/v1642352194340/nOY8Qkcmy.jpeg?w=1600&h=840&fit=crop&crop=entropy&auto=compress,format&format=webp)" alt="spring+jwt" height="350px" width="75%">
</div>

# Implementación de JWT en Spring Boot 3.0 y Spring Security 6
Este repositorio muestra una configuración básica para poder manejar usuarios con más de un rol, teniendo en cuenta
que solo los usuarios con rol 'ADMIN' pueden crear usuarios.


Por defecto el proyecto trae 3 roles **'ADMIN', 'USER'** e **'INVITED'**.
Además se cuenta con un usuario 'ADMIN' para poder generar nuevos usuarios.


Estos detalles pueden verse en el archivo **import.sql** que se encuentra dentro de **resources** y donde pueden ser
modificados de ser necesario.

### Para poder acceder al login, se tienen las siguientes credenciales:

```bash
{
    "username": "jb98",
    "password": "12345"
}
```

### Requisitos
- Spring Boot 3.0
- JDK >= 17
- Maven > 3.6

### Nota:
- De preferencia trabajar con Spring Boot 3.0 y no con versiones **>=3.1** para evitar errores, ya que la version 6.1
  de Spring Security dejo en deprecados algunos métodos y estan marcados para ser removidos en futuras versiones, como .and(), entre otros.
  Para mayores detalles se puede consultar a "https://docs.spring.io/spring-security/site/docs/current/api/deprecated-list.html"
- El proyecto esta configurado para no permitir **usernames** ni **emails** duplicados.
