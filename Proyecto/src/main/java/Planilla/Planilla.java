package Planilla;

import java.util.List;

import Persona.Colaborador;

public class Planilla implements CalculoPlanilla {

    private List<Colaborador> colaboradores;

    public Planilla() {

    }

    public Planilla(List<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }

    public List<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(List<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }

    @Override
    public int calcularTotal() {
        int total = 0;
        for (Colaborador colaborador : colaboradores) {
            total += (colaborador.getHorasTrabajadas() * 50);
        }
        return total;
    }

    @Override
    public String toString() {
        return "Planilla [colaboradores=" + colaboradores + "]";
    }

}
