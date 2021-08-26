package com.essencials.controller;

import com.essencials.domain.Anime;
import com.essencials.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2
@AllArgsConstructor
public class AnimeController {

    private  DateUtil dateUtil;


    @GetMapping(path ="list")
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDateDataBaseStyle(LocalDateTime.now()));
        return Arrays.asList(new Anime("DB2"),
                new Anime("JAVA11"), new Anime("MongoDB3"));
    }
}
