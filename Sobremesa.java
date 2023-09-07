public class Sobremesa {

    public static void main(String[] args) {

        // cria os conjuntos de palavras a serem selecionadas pelo gerador de receitas
        String[] wordListOne = {"Sorvete", "Suco", "Torta", "Bolo", "Mousse", "Vitamina"};
        String[] wordListTwo = {"Banana", "Maçã", "Laranja", "Morango", "Uva", "Melancia"};
        String[] wordListThree = {"Tomate", "Espinafre", "Hortelã", "Gengibre", "Cenoura", "Pepino"};

        // conta quantas palavras existem em cada lista
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // gera números aleatórios cujos valores não podem ultrapassar os índices máximos de cada lista
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // define a frase a ser exibida
        String phrase = wordListOne[rand1] + " de " + wordListTwo[rand2] + " com " + wordListThree[rand3];

        // exibe a frase
        System.out.println("A receita do dia é: " + phrase);

    }

}
