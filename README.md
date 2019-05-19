# GlobalClassInJava

# **_ENGLISH_** (Refactor > Rename: Sistema => Global, ISistema => IGlobal)

These are the 3 ways of implementing Global Classes in Java I could come up with:



**Case1**: Only `GlobalClass`, with everything `static`, works with/without singleton (which doesn't matter since 
all instances
 would share the same variable values anyways). Doesn't require but 1 instantiation done wherever, since members are 
 `static`, and attributes are given a value in the constructor.
 
 **Case2**: `GlobalClass` + interface, only attributes are `static`, works with/without singleton. Requires instance of 
 `IGlobal` in each 
 class (whether as a parameter in each method, instantiated in each method or as a class attribute). You can have an 
 infinite number of `GlobalClass`s, they will all share the values of `static` attributes.
 
 **Case3**: `GlobalClass` + interface, non-`static` members, must be singleton so everything shares values. Requires 
 instance of `IGlobal` in each class (whether as a parameter in each method, instantiated in each method or as a 
 class attribute). There will only ever be 1 object/instance of `GlobalClass`.


# **_ESPAÑOL_** (Refactor > Renombrar: GlobalClass => Sistema,  IGlobal => ISistema)

Estas son las 3 maneras de implementar clases de Sistema (Clases Globales) en Java que se me han ocurrido:

**Caso1:** Sólo clase `Sistema`, todo `static`, funciona con/sin singleton (que da igual, porque todas las 
instanciaciones tendrán los mismos valores al ser todas las variables `static`). No requiere más que 1 sola 
instanciación realizada en cualquier lado, dado que los miembros son `static`, y los atributos se inicializan en el 
constructor.

**Caso2**: Clase + interfaz, sólo atributos `static`, funciona con/sin singleton. Requiere instancia de `ISistema` en 
cada clase 
(pasada como parámetro a sus métodos, instanciada en cada uno o poseída como atributo de clase). Puedes tener un 
infinito número de `Sistema`s, que compartirán los valores de los atributos `static`.

**Caso3**: Clase + interfaz, miembros non-`static`, tiene que ser singleton para que las instanciaciones tengan los
mismos valores. Requiere instancia de `ISistema` en cada clase (pasada como parámetro a sus métodos, instanciada en 
cada uno o poseída como atributo de clase). Sólo habrá 1 objeto/instancia `Sistema`.
