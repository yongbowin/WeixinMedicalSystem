package com.clouds.igankong.weixinUtils;

/**
 * 视频消息
 * 
 */
public class MsgRespVideoMessage extends MsgRespBaseMessage {
	// 视频
	private MsgRespVideo Video;

	public MsgRespVideo getVideo() {
		return Video;
	}

	public void setVideo(MsgRespVideo video) {
		Video = video;
	}
}
