public class Lista {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        System.out.println("Tamanho da Lista = " + lista.getTamanho());

        lista.adiciona("Cachorro Golden Retriever");
        System.out.println();
        System.out.println(lista);
        System.out.println();
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        System.out.println();
        System.out.println("Ínicio da Lista = " + lista.getInicio().getElemento());
        System.out.println();
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());
        System.out.println();

        lista.adiciona("Cachorro Cocker Spaniel Inglês");

        System.out.println(lista);
        System.out.println();
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        System.out.println();
        System.out.println("Ínicio da Lista = " + lista.getInicio().getElemento());
        System.out.println();
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());
        System.out.println();


        lista.adiciona("Cavalo Crioulo");
        lista.adiciona("Cavalo Puro Sangue Inglês");
        lista.adiciona("Cavalo Puro Sangue Árabe");

        System.out.println("Elemento na posição 2 = " + lista.get(2).getElemento());

        lista.remover("Cavalo Puro Sangue Inglês");
        
        System.out.println(lista);
        System.out.println();
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        System.out.println();
        System.out.println("Ínicio da Lista = " + lista.getInicio().getElemento());
        System.out.println();
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());
        System.out.println();

    }
}
