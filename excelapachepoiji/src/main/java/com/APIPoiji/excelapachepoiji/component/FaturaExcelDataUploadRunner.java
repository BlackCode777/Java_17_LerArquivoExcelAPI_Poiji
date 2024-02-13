package com.APIPoiji.excelapachepoiji.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.APIPoiji.excelapachepoiji.repository.FaturaRepository;
import com.APIPoiji.excelapachepoiji.service.FaturaService;

public class FaturaExcelDataUploadRunner implements CommandLineRunner {

    @Autowired
    FaturaRepository faturaRepository;

    @Autowired
    FaturaService faturaService;

    @Override
    public void run(String... args) throws Exception {
        faturaRepository.saveAll(faturaService.getListFromExcelData());
    }

}
