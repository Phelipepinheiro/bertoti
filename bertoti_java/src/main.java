public class Main {
    public static void main(String[] args) {
        // Criando uma lanchonete
        Lanchonete lanchonete = new Lanchonete();
        lanchonete.setNome("Minha Lanchonete");
        lanchonete.setEndereco("Rua Principal, 123");

        // Criando o cardápio da lanchonete
        Cardapio cardapio = new Cardapio();

        // Criando produtos
        Produto p1 = new Produto();
        p1.setNome("Hambúrguer");
        p1.setPreco(10.0);

        Produto p2 = new Produto();
        p2.setNome("Batata Frita");
        p2.setPreco(5.0);

        // Adicionando produtos ao cardápio
        cardapio.adicionarProduto(p1);
        cardapio.adicionarProduto(p2);

        // Definindo o cardápio da lanchonete
        lanchonete.setCardapio(cardapio);

        // Listando os produtos do cardápio da lanchonete
        List<Produto> produtos = lanchonete.getCardapio().listarProdutos();
        System.out.println("Produtos no cardápio da lanchonete:");
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - R$" + produto.getPreco());
        }
    }
}
