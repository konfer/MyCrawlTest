package com.konfer.CrawlStartControll;

import com.konfer.entity.Page;
import com.konfer.service.IDownLoadService;
import com.konfer.service.IProcessService;
import com.konfer.serviceImpl.HttpClientDownLoadService;

public class StartTelePlayCount
{
    private Page TelePlayPage;
    private String url;
    private IDownLoadService TelePlayDownLoadService=new HttpClientDownLoadService();
    private IProcessService processService;

    public void setProcessService(IProcessService processService)
    {
        this.processService = processService;
    }

    private void setTelePlayPage(Page TelePage)
    {
        this.TelePlayPage=TelePage;
    }

    public Page getTelePlayPage()
    {
        return TelePlayPage;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public IDownLoadService getTelePlayDownLoadService()
    {
        return TelePlayDownLoadService;
    }

    public void setTelePlayDownLoadService(IDownLoadService telePlayDownLoadService)
    {
        TelePlayDownLoadService = telePlayDownLoadService;
    }

    public void downLoadPage()
    {
        Page telePage=TelePlayDownLoadService.downLoad(this.url);
        setTelePlayPage(telePage);
    }


    public void proccessPage()
    {
        this.processService.process(TelePlayPage);
    }



}
