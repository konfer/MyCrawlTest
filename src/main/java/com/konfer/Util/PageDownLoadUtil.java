package com.konfer.Util;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class PageDownLoadUtil
{
    public static String getPageContext(String url)
    {
        HttpClientBuilder builder= HttpClients.custom();
        CloseableHttpClient client=builder.build();
        String content=null;

        HttpGet request=new HttpGet(url);
        try
        {
            CloseableHttpResponse response=client.execute(request);
            HttpEntity entity=response.getEntity();
            content= EntityUtils.toString(entity);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return content;
    }


}
