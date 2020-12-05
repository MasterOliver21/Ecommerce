abstract class Produto  {

    private String fabricante;
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        setNome(nome);
        setPreco(preco);
    }

    public void setFabricante(String NomeFabricante){
        this.fabricante = NomeFabricante;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }

    
}