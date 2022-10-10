package accesodatos;

//Interfaces: se utilizan para clases que comparten comportamiento, a diferencia de las abstractas que comparten caracteristicas.

public interface IaccesoDatos {
    int MAX_REGISTRO = 10;

    //Los metodos en interfaces son, por default, abstractos.
    void insertar();

    void listar();

    void actualizar();

    void eliminar();

}
