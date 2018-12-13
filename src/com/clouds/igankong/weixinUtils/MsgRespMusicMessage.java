package com.clouds.igankong.weixinUtils;
/**
 * 音乐消息
 * 
 * */
public class MsgRespMusicMessage extends MsgRespBaseMessage{
	 // 音乐  
    private MsgRespMusic Music;  
  
    public MsgRespMusic getMusic() {  
        return Music;  
    }  
  
    public void setMusic(MsgRespMusic music) {  
        Music = music;  
    }  

}
