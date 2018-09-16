package com.hexagonal.cron.services;

import com.hexagonal.cron.domains.Cron;
import com.hexagonal.cron.repositories.CronRepositoryMock;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by javiertercedor on 16/9/18.
 */
public class CronServiceTest {

    private CronService cronService;

    @Test
    public void executeCronProcess_validData_expectedNullValue(){
        cronService = new CronService(new CronRepositoryMock());

        Cron cron = cronService.executeCronProcess();

        Assert.assertNull(cron);
    }
}