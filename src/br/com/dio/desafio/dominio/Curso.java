package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calculaXp() {
        return Conteudo.XP_PADRAO * this.cargaHoraria;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + super.getTitulo() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                ", cargaHoraria=" + this.cargaHoraria +
                '}';
    }
}
