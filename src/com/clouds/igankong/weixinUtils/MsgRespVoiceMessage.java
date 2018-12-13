package com.clouds.igankong.weixinUtils;

/**
 * 语音消息
 * 
 */
public class MsgRespVoiceMessage extends MsgRespBaseMessage {
	// 语音
	private MsgRespVoice Voice;

	public MsgRespVoice getVoice() {
		return Voice;
	}

	public void setVoice(MsgRespVoice voice) {
		Voice = voice;
	}
}
