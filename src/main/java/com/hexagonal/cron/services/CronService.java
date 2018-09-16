package com.hexagonal.cron.services;

import com.hexagonal.cron.domains.Cron;
import com.hexagonal.cron.repositories.CronRepository;

/**
 * Created by javiertercedor on 16/9/18.
 */
public class CronService {

    private CronRepository cronRepository;

    public CronService(CronRepository cronRepository) {
        this.cronRepository = cronRepository;
    }

    public Cron executeCronProcess(){
        return cronRepository.execute();
    }
}
