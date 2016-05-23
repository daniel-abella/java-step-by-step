package generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ClasseGenerica<T, X extends Animal & IZoologico & IInvertebrado> extends Object
        implements Serializable {

    // TODO Obs.: Declaração de classes com Generics NÂO se usa o CORINGA<?> !!!

    T t;
    X x;

    public ClasseGenerica() {
    }

    public ClasseGenerica(T t, X x) {
        super();
        this.t = t;
        this.x = x;
    }

    public T getT() {
        return this.t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public X getX() {
        return this.x;
    }

    public void setX(X x) {
        this.x = x;
    }

    // Testando métodos
    public <A extends Dog> void escreverCachorroPequeno(A a) {
        System.out.println(a);
    }

    /** Começo exemplo isolado */
    // A primeira expressão é a restrição do tipo E dentro do list e a segunda é a restrinção
    // do tipo de retorno
    public <E extends Number> List<? super E> obterColecaoGenerica(List<E> nums) {
        return nums;
    }

    /** Fim exemplo isolado */

    // Exemplo de SUPER com CORINGA:
    // O super com coringa pode-se adicionar na coleção objetos do MESMO tipo do
    // super, porém não se pode obter SEM CAST
    public List<? super Dog> obterListaCoringaSuper(List<? super Dog> listaPaiCachorros) {
        listaPaiCachorros.add(new Dog());// pode-se adicionar na coleção objetos
                                         // do MESMO tipo do super

        //Dog dog = listaPaiCachorros.get(0); // Erro compilação
        Dog dog02 = (Dog) listaPaiCachorros.get(0); // Com CAST pode ter retorno
                                                  // de tudo
        return listaPaiCachorros;
    }

    // Exemplo extends com coringa
    // Vc Não pode adicionar valores para por conta do fato do java evitar
    // colecoes heterogeneas porém pode-se obter valor
    public List<? extends Dog> obterListaCoringaComExtends(List<? extends Dog> listaFilhosDogs) {
        // listaFilhosDogs.add(new Dog()); // Não se pode adicionar

        Dog dog = listaFilhosDogs.get(0); // Pode-se obter SEM Cast

        return listaFilhosDogs;
    }

    public static void main(String... args) {
        // Teste: Exemplo de SUPER com CORINGA:
        List<Object> listaObjetos = new ArrayList<Object>();
        listaObjetos.add(new Double(999999));
        listaObjetos.add(new Long(999999L));

       
        ClasseGenerica<Minhoca, Minhoca> minhoca = new ClasseGenerica<Minhoca, Minhoca>();
        System.out.println(minhoca.obterListaCoringaSuper(listaObjetos));

        // Teste: Exemplo extends com coringa
        List<SmallDog> listaFilhoDogs = new ArrayList<SmallDog>();
        listaFilhoDogs.add(new SmallDog());
        listaFilhoDogs.add(new SmallDog());

        System.out.println(minhoca.obterListaCoringaComExtends(listaFilhoDogs));
    }
}