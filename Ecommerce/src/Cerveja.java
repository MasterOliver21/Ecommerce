public class Cerveja extends Produto {
    
    private double teorAlcoolico;
    private String prazoValidade;

    public void SetTeorAlcoolico(double teorAlcoolico){
        this.teorAlcoolico = teorAlcoolico;
    }
    public void SetPrazoValidade(String prazoValidade){
        this.prazoValidade = prazoValidade;
    }

    public double GetTeorAlcoolico(){
        return this.teorAlcoolico;
    }

    public String GetPrazoValidade(){
        return this.prazoValidade;
    }

}
