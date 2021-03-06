package Ex3;

import javax.swing.*;

public class Onibus extends Veiculo {
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame,"PLACA: "+getPlaca()+"/n Ano"+getAno()+"/n Assentos: "+assentos);
    }
}
