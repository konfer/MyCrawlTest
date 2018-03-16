package com.konfer.serviceImpl.process;

import com.konfer.Util.TestConfiguration;
import com.konfer.entity.Page;
import com.konfer.service.IProcessService;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.XPatherException;

public class YoukuProcess implements IProcessService
{
    public void process(Page page)
    {
        HtmlCleaner htmlCleaner=new HtmlCleaner();
        TagNode rootNode=htmlCleaner.clean(page.getContent());

        try {
            Object[] evaluateXPath=rootNode.evaluateXPath(TestConfiguration.youkuTelePlayNumHtmlPath);
        } catch (XPatherException e)
        {
            e.printStackTrace();
        }
    }
}
