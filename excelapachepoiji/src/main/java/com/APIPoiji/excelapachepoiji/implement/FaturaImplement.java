package com.APIPoiji.excelapachepoiji.implement;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.APIPoiji.excelapachepoiji.entity.Fatura;
import com.poiji.bind.Poiji;

@Service
public class FaturaImplement {

    @Value("${filePath}")
    public String FILE_PATH;

    public List<Fatura> getListFromExcelData() {
        File file = new File(FILE_PATH);
        List<Fatura> fatura = Poiji.fromExcel(file, Fatura.class);
        return fatura;
    }

}
