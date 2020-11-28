abstract class Produto  {

    private String fabricante;
    private String nome;
    private double preco;


    public void SetFabricante(String NomeFabricante){
        this.fabricante = NomeFabricante;
    }

    public void SetNome(String nome){
        this.nome = nome;
    }

    public void SetPreco(double preco){
        this.preco = preco;
    }

    public String GetFabricante(){
        return this.fabricante;
    }

    public String GetNome(){
        return this.nome;
    }
    public double GetPreco(){
        return this.preco;
    }

    
}