package src;
public class Cardapio(listaProdutos) {
    private ArrayList<Produto> listaProdutos;

    public Cardapio() {
        listaProdutos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    public void removerProduto(Produto produto) {
        listaProdutos.remove(produto);
    }

    public List<Produto> listarProdutos() {
        return listaProdutos;
    }
}
