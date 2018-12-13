package com.clouds.igankong.weixinUtils;

import java.util.List;

/**
 * 图文消息
 * 
 * */
public class MsgRespNewsMessage extends MsgRespBaseMessage{
    //	 图文消息个数，限制为10条以内  
    private int ArticleCount;  
    // 多条图文消息信息，默认第一个item为大图  
    private List<MsgRespArticle> Articles;  
  
    public int getArticleCount() {  
        return ArticleCount;  
    }  
  
    public void setArticleCount(int articleCount) {  
        ArticleCount = articleCount;  
    }  
  
    public List<MsgRespArticle> getArticles() {  
        return Articles;  
    }  
  
    public void setArticles(List<MsgRespArticle> articles) {  
        Articles = articles;  
    }  

}
