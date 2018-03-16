package com.konfer.serviceImpl;

import com.konfer.Util.PageDownLoadUtil;
import com.konfer.entity.Page;
import com.konfer.service.IDownLoadService;

public class HttpClientDownLoadService implements IDownLoadService
{
    public Page downLoad(String url)
    {
        Page page=new Page();
        page.setContent(PageDownLoadUtil.getPageContext(url));
        return page;
    }
}
