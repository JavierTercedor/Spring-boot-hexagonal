package com.hexagonal.cron.repositories;

import com.hexagonal.cron.domains.Cron;
import org.springframework.stereotype.Component;

/**
 * Created by javiertercedor on 16/9/18.
 */
@Component
public class CronRepositoryMeliaImpl implements CronRepository {

    @Override
    public Cron execute() {
        return Cron.createCron("Success Response");
    }
}
