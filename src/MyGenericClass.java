// Transformamos una clase normal en una clase generica:
// Abrimos y cerramos '< >' (parametro de tipo) y especificamos
// un nombre como parametro por convencion se usan 'T', 'U' o 'K'.
// Las clases genericas tienen que ser capaces de manejar cualquier tipo de objeto.
// Primero asigna el valor null a cualquier tipo de objeto.
// Despues va a tener un getter y un setter
// El setter cambia el valor de null a otro que le pasemos por parametro.
// El getter que nos devuelva el estado en el que se encuentra el objeto.
public class MyGenericClass<T> {

    // 'T' indica el tipo del objeto.
    private T object;

    public MyGenericClass(){
        object = null;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T newValue) {
        object = newValue;
    }
}
