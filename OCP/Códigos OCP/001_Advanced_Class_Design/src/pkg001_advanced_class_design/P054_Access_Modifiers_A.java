package pkg001_advanced_class_design;

/**
 *
 * @author HUGO 
 */
public class P054_Access_Modifiers_A {
    /*
        Uno de los principios básicos de los lenguajes orientados a objetos es la encapsulación,
        El acceso a las propiedades y métodos se determina mediante las palabras reservadas de los modificadores de acceso.
        
        private: únicamente la clase puede acceder a la propiedad o método.
        package private (valor por defecto si no se indica ninguno): solo las clases en el mismo paquete pueden acceder a la propiedad o método.
        protected: las clases del mismo paquete y que heredan de la clase pueden acceder a la propiedad o método.
        public: la propiedad o método es accesible desde cualquier método de otra clase.    
    */
    
    public static void main(String[] args) {
        BigCat cat= new BigCat();
        System.out.println(cat.name);
        System.out .println(cat.hasFur);
        System.out .println(cat.hasPaws);
        System.out .println(cat.id);
    }
        
    public static class BigCat {
        public String name = "cat"; // Se accede desde cualquier lado
        protected boolean hasFur = true; // se accede desde la herencia
        boolean hasPaws = true; // se accede desde la clase private si no se coloca al incio.
        private int id; //Se accede desde la clase.
    }


}

