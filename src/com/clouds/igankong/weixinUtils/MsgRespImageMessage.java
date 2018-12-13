package com.clouds.igankong.weixinUtils;

/**
 * 图片消息
 * 
 */
public class MsgRespImageMessage extends MsgRespBaseMessage {
	// 图片
	private MsgRespImage Image;

	public MsgRespImage getImage() {
		return Image;
	}

	public void setImage(MsgRespImage image) {
		Image = image;
	}
}
