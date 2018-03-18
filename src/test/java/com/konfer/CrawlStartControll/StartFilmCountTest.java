package com.konfer.CrawlStartControll;

import com.konfer.Util.TestConfiguration;
import com.konfer.serviceImpl.HttpClientDownLoadService;
import com.konfer.serviceImpl.db.ConsoleStoreService;
import com.konfer.serviceImpl.process.YoukuProcess;
import org.junit.Test;

public class StartFilmCountTest
{

    @Test
    public void testYoukuCount()
    {
        StartFilmPlayCount FilmPlayCount=new StartFilmPlayCount();
        FilmPlayCount.setDownLoadService(new HttpClientDownLoadService());
        FilmPlayCount.setUrl(TestConfiguration.FilmPlayofBeautySmileUrl);
        FilmPlayCount.setStoreService(new ConsoleStoreService());
        //FilmPlayCount.downLoadPage();
        FilmPlayCount.setProcessService(new YoukuProcess());
        FilmPlayCount.proccessPage();
        FilmPlayCount.storePageInfo();
    }



}
