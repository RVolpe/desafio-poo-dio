package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public double calculaXp() {
        return Conteudo.XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + super.getTitulo() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                ", data=" + this.data +
                '}';
    }
}
