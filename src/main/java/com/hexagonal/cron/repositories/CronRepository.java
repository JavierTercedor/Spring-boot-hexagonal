package com.hexagonal.cron.repositories;

import com.hexagonal.cron.domains.Cron;

/**
 * Created by javiertercedor on 16/9/18.
 */
public interface CronRepository {

    Cron execute();
}
