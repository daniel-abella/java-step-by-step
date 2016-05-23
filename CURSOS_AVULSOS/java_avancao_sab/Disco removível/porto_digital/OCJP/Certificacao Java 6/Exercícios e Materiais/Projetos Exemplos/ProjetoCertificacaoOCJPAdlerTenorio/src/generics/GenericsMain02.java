package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain02 {

    public static void main(String... strings) {

        // Classe principal com os métodos
        Animal animal = new Animal();

        /**
         * 1. Erro de compilação pois nao aceita polimorfismo em LISTA GENERICAS
         */
         List<Dog> listaDogs = new ArrayList<Dog>();
         animal.addAnimais(listaDogs);

        /** 2. Em Arrays é aceitável */
        Dog[] dogs = new Dog[3];
        animal.addArrayAnimais(dogs); // Gerará
        // java.lang.ArrayStoreException,
        // pois o que foi passado é um array
        // de Dog e dentro do método
        // adicionarArrayAnimais é
        // instanciado um cat.

        /** 3. Pode fazer isso ! */
        List<Animal> listaAnimais = new ArrayList<Animal>();
        listaAnimais.add(new Dog());
        listaAnimais.add(new Cat());
        listaAnimais.add(new Bird());

        animal.addAnimais(listaAnimais);

        /** 4. Coringa Com Interface */
        List<Bird> listaPassaros = new ArrayList<Bird>();
        animal.addUsandoCoringaComInterface(listaPassaros);

        /** 5. Coringa Com Super */
        List<SmallDog> listaSmallDogs = new ArrayList<SmallDog>();
        animal.addUsandoCoringaComSuper(listaSmallDogs);// Erro de compilação pois Small dog é FILHO de dog

        /** 6. Diferença entre Lis<?> e List<Object> */
        List<Integer> listaInteger = new ArrayList<Integer>();
        List<String> listaStrings = new ArrayList<String>();

        List<Object> listaObjects = new ArrayList<Object>();

        animal.addListaCoringas(listaInteger);
        animal.addListaCoringas(listaStrings);
        animal.addListaObjetcs(listaObjects);

        // List<?> e List<? extends Object> SÂO IDÊNTICOS !!

        /** 7. Classe genérica */
        ClasseGenerica<Minhoca, Minhoca> minhoca = new ClasseGenerica<Minhoca, Minhoca>();
        minhoca.escreverCachorroPequeno(new SmallDog());
    }
}
