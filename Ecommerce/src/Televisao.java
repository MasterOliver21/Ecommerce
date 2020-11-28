public class Televisao extends Produto{
    
    private double peso;
    private double tamanho;
    private String resolucao;




    public void SetPeso(double peso){
        this.peso = peso;
    }

    public void SetTamanho(double tamanho){
        this.tamanho = tamanho;
    }

    public void SetResolucao(String resolucao){
        this.resolucao = resolucao;
    }

    public double GetPeso(double peso){
        return this.peso;
    }
    public double GetTamanho(double tamanho){
        return this.tamanho;
    }

    public String GetResolucao(){
        return this.resolucao;
    }
    
}
