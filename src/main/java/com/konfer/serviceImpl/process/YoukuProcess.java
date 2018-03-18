package com.konfer.serviceImpl.process;

import com.konfer.Util.StringAnalyse.FilmPlayNumAnalyse;
import com.konfer.Util.TestConfiguration;
import com.konfer.entity.Page;
import com.konfer.service.IProcessService;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.XPatherException;

public class YoukuProcess implements IProcessService
{
    private Object[] evaluateXPath;
    private String totalPlayNum;

    public void process(Page page)
    {
        HtmlCleaner htmlCleaner=new HtmlCleaner();
        TagNode rootNode=htmlCleaner.clean(page.getContent());

        try {
            evaluateXPath=rootNode.evaluateXPath(TestConfiguration.FilmPlayofBeautySmilePath);
            assert(evaluateXPath.length>0);
            if (evaluateXPath.length>0)
            {
                TagNode node=(TagNode)evaluateXPath[0];
                totalPlayNum= FilmPlayNumAnalyse.testYoukuPlayTotalNumWithoutDot(node.getText().toString());
                System.out.println(totalPlayNum);
            }
        } catch (XPatherException e)
        {
            e.printStackTrace();
        }
        page.setTvNum(totalPlayNum);
    }
}
