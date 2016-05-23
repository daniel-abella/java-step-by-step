package generics;

import java.util.List;

public class Animal {

    public void addAnimais(List<Animal> listaAnimais) {
        for (Animal animal : listaAnimais) {
            System.out.println(animal);
        }
    }

    public void addArrayAnimais(Animal[] animais) {
        animais[0] = new Cat();
    }

    /**
     * Aceita qualquer objeto que implemente IZoologico
     */
    public void addUsandoCoringaComInterface(List<? extends IZoologico> lista) {

    }

    /**
     * Aceita qualquer objeto que seja filho de Animal
     */
    public void addUsandoCoringaComExtents(List<? extends Animal> listaAnimais) {

    }

    /**
     * Aceita Dog ou qualquer objeto que esteja "ACIMA" da hier�rquia de Dog.
     */
    public void addUsandoCoringaComSuper(List<? super Dog> listaDogsPai) {

    }

    /**
     * Aceita qualquer objeto, qualquer que seja.
     */
    public void addListaCoringas(List<?> listaCoringa) {
    	listaCoringa.add(); // N�o pode adicionar, pois n�o se sabe o tipo do objeto.
    	Object obj = listaCoringa.get(0); // Posso chamar alguns m�todos, por�m outros n
    	int size = listaCoringa.size();
    }
    
    /**
     * S� aceita uma lista de Objects e nada mais.
     */
    public void addListaObjetcs(List<Object> listaCoringa) {

    }

}
