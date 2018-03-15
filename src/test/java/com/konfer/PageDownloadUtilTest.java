package com.konfer;

import com.konfer.Util.PageDownLoadUtil;
import org.junit.Test;



public class PageDownloadUtilTest
{

    @Test
    public void testPageContext()
    {
        String url="http://movie.youku.com/?spm=a2hww.20027244.m_251424.5~1~3~8!2~A";
        String content= PageDownLoadUtil.getPageContext(url);

        System.out.println(content);


    }

}


