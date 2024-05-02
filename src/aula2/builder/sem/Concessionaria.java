package aula2.builder.sem;

class Carro {
    private String motor;
    private int rodas;
    private String cor;

    public Carro() {
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Carro [motor=" + motor + ", rodas=" + rodas + ", cor=" + cor + "]";
    }
}


public class Concessionaria {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMotor("V8");
        carro.setRodas(4);
        carro.setCor("Azul");

        System.out.println(carro);
    }
}

