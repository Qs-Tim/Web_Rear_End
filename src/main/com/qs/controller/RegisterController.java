package main.com.qs.controller;

import main.com.qs.entity.Id_Pass;
import main.com.qs.entity.Reader;
import main.com.qs.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;

@RestController
public class RegisterController {

    private ReaderService readerService;

    @Autowired
    public void setReaderService(ReaderService readerService) {
        this.readerService = readerService;
    }

    @PostMapping("/register")
    public void register(@RequestBody Reader reader, @RequestBody Id_Pass id_pass){
        reader.setRegisterTime(new Date(new java.util.Date().getTime()));
        reader.setModifyTime(new Date(new java.util.Date().getTime()));

        System.out.println(readerService.registerReader(reader,id_pass));

    }
}
