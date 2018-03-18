package com.konfer.Util.StringAnalyse;

public class FilmPlayNumAnalyse
{
    public String YoukuPlayTotalNum(String context)
    {
        return null;
    }

    public static String withoutDot(String resultsNum)
    {
        //String resultsNum="2310032.8";
        int dotNum=resultsNum.indexOf(".");
        String totalPlayNum=resultsNum.substring(0,dotNum)+resultsNum.substring(dotNum+1,resultsNum.length())+"000";
        return totalPlayNum;
    }

    public static String testYoukuPlayTotalNumWithoutDot(String context)
    {
        String[] results=context.split(" ");
        String resultsNum=results[1].substring(0,results[1].length()-1);
        String totalPlayNum=FilmPlayNumAnalyse.withoutDot(resultsNum);
        return totalPlayNum;

    }

    public static String testYoukuPlayTotalNum(String context)
    {
        String[] results=context.split(" ");
        String resultsNum=results[1].substring(0,results[1].length()-1);
        return resultsNum;
    }

}
