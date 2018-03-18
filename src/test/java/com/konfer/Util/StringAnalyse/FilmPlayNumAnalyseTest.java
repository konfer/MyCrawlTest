package com.konfer.Util.StringAnalyse;

import org.junit.Test;

public class FilmPlayNumAnalyseTest
{
    @Test
    public void testYoukuPlayTotalNumWithoutDot()
    {
        String exampleString = "播放 2310032.8万";
        String[] results=exampleString.split(" ");
        String resultsNum=results[1].substring(0,results[1].length()-1);
   //     String[] totalPlayNums=resultsArray.split(".");
      //  int dotNum=resultsNum.indexOf(".");
        String totalPlayNum=FilmPlayNumAnalyse.withoutDot(resultsNum);
        System.out.println(totalPlayNum);



    }

    @Test
    public void testYoukuPlayTotalNum()
    {
        String exampleString = "播放 2310032.8万";
        String[] results=exampleString.split(" ");
        String resultsNum=results[1].substring(0,results[1].length()-1);
        System.out.println(resultsNum);
    }

//    public String withoutDot(String resultsNum)
//    {
//        //String resultsNum="2310032.8";
//        int dotNum=resultsNum.indexOf(".");
//        String totalPlayNum=resultsNum.substring(0,dotNum)+resultsNum.substring(dotNum+1,resultsNum.length())+"000";
//        return totalPlayNum;
//    }



}
