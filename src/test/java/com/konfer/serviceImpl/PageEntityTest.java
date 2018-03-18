package com.konfer.serviceImpl;

import com.konfer.Util.TestConfiguration;
import com.konfer.entity.Page;
import org.junit.Test;

public class PageEntityTest
{

    @Test
    public void testPageDownLoad()
    {
        HttpClientDownLoadService downLoadService=new HttpClientDownLoadService();
        Page p=downLoadService.downLoad(TestConfiguration.testDownLoadUrl);
        System.out.println(p.getContent());
    }

    @Test
    public void testYoukukPageDownLoad()
    {
        HttpClientDownLoadService downLoadService=new HttpClientDownLoadService();
        Page p=downLoadService.downLoad(TestConfiguration.FilmPlayofBeautySmileUrl);
        System.out.println(p.getContent());
    }



}
