package com.konfer.CrawlStartControll;

import com.konfer.Util.TestConfiguration;
import com.konfer.entity.Page;
import com.konfer.serviceImpl.HttpClientDownLoadService;
import com.konfer.serviceImpl.process.YoukuProcess;
import org.junit.Test;

public class StartTelePlayCountTest
{

    @Test
    public void testYoukuCount()
    {
        StartTelePlayCount telePlayCount=new StartTelePlayCount();
        telePlayCount.setTelePlayDownLoadService(new HttpClientDownLoadService());
        telePlayCount.setUrl(TestConfiguration.testDownLoadUrl);
        telePlayCount.downLoadPage();
        telePlayCount.setProcessService(new YoukuProcess());
        telePlayCount.proccessPage();
    }



}
