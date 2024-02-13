package com.APIPoiji.excelapachepoiji;

import java.io.File;
import java.util.List;

import com.APIPoiji.excelapachepoiji.entity.Fatura;
import com.poiji.bind.Poiji;

public class ExcelJavaListPoiji_ExcelParaMySQL_Executavel {
    public static void main(String[] args) {

        File file = new File(
                "E:/ProjetosProgramacao_2024/ProjetoProg_JavaSpring/EstudosJava_SpringBootCompleto_2024_DockerPostgresqlSwagger/Java_17_LerArquivoExcelAPI_Poiji/excelapachepoiji/src/main/resources/static/PlanilhaTestePoijiMaven.xlsx");

        List<Fatura> fatura = Poiji.fromExcel(file, Fatura.class);

        fatura.forEach(System.out::println);

        System.out.println("Printing List Data: " + fatura.toString());

    }
}
