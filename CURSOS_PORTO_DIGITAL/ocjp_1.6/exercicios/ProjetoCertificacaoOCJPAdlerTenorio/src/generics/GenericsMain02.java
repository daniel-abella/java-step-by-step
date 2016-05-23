package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain02 {

    public static void main(String... strings) {

        // Classe principal com os m�todos
        Animal animal = new Animal();

        /**
         * 1. Erro de compila��o pois nao aceita polimorfismo em LISTA GENERICAS
         */
         List<Dog> listaDogs = new ArrayList<Dog>();
         animal.addAnimais(listaDogs);

        /** 2. Em Arrays � aceit�vel */
        Dog[] dogs = new Dog[3];
        animal.addArrayAnimais(dogs); // Gerar�
        // java.lang.ArrayStoreException,
        // pois o que foi passado � um array
        // de Dog e dentro do m�todo
        // adicionarArrayAnimais �
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
        animal.addUsandoCoringaComSuper(listaSmallDogs);// Erro de compila��o pois Small dog � FILHO de dog

        /** 6. Diferen�a entre Lis<?> e List<Object> */
        List<Integer> listaInteger = new ArrayList<Integer>();
        List<String> listaStrings = new ArrayList<String>();

        List<Object> listaObjects = new ArrayList<Object>();

        animal.addListaCoringas(listaInteger);
        animal.addListaCoringas(listaStrings);
        animal.addListaObjetcs(listaObjects);

        // List<?> e List<? extends Object> S�O ID�NTICOS !!

        /** 7. Classe gen�rica */
        ClasseGenerica<Minhoca, Minhoca> minhoca = new ClasseGenerica<Minhoca, Minhoca>();
        minhoca.escreverCachorroPequeno(new SmallDog());
    }
}
