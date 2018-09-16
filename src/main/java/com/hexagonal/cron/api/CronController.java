package com.hexagonal.cron.api;

import com.hexagonal.cron.repositories.CronRepositoryMeliaImpl;
import com.hexagonal.cron.services.CronService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;

/**
 * Created by javiertercedor on 16/9/18.
 */
@Controller
public class CronController {

    private CronService cronService;

    @PostConstruct
    private void CronController(){
        cronService = new CronService(new CronRepositoryMeliaImpl());
    }

    @GetMapping("/cronStatus")
    @ResponseBody
    public String cronStatus() {
        return cronService.executeCronProcess().toString();
    }
}
