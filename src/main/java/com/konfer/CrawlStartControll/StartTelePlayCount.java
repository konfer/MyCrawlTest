package com.konfer.CrawlStartControll;

import com.konfer.entity.Page;
import com.konfer.service.IDownLoadService;
import com.konfer.service.IProcessService;
import com.konfer.service.IStoreService;
import com.konfer.serviceImpl.HttpClientDownLoadService;

public class StartFilmPlayCount
{
    private Page FilmPlayPage;
    private String url;
    private IDownLoadService downLoadService;
    private IProcessService processService;
    private IStoreService storeService;
    public long FilmPlayNum;

    public void setProcessService(IProcessService processService)
    {
        this.processService = processService;
    }

    private void setFilmPlayPage(Page FilmPage)
    {
        this.FilmPlayPage=FilmPage;
    }

    public Page getFilmPlayPage()
    {
        return FilmPlayPage;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public IDownLoadService getDownLoadService()
    {
        return downLoadService;
    }

    public void setDownLoadService(IDownLoadService downLoadService)
    {
        this.downLoadService = downLoadService;
    }

    public IStoreService getStoreService()
    {
        return storeService;
    }

    public void setStoreService(IStoreService storeService)
    {
        this.storeService = storeService;
    }

    private void downLoadPage()
    {
        Page FilmPage=downLoadService.downLoad(this.url);
        setFilmPlayPage(FilmPage);
    }


    public void proccessPage()
    {
        downLoadPage();
        this.processService.process(FilmPlayPage);
    }

    public void storePageInfo()
    {
        this.storeService.store(FilmPlayPage);
    }

}
