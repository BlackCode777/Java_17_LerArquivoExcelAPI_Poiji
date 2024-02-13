package com.APIPoiji.excelapachepoiji.entity;

import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelCellName;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// @Data
// @NoArgsConstructor
// @AllArgsConstructor
@Entity
public class Fatura {

    @Id
    @GeneratedValue
    public Integer id;

    @ExcelCellName("nome")
    public String nome;

    @ExcelCell(1)
    public String valor;

    @ExcelCell(2)
    public String dataRecebida;

    @Override
    public String toString() {
        return "Fatura{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor='" + valor + '\'' +
                ", dataRecebida='" + dataRecebida + '\'' +
                '}';
    }

}
