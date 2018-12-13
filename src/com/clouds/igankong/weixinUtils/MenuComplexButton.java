package com.clouds.igankong.weixinUtils;

/** 
 * 复杂按钮（父按钮） 
 *  
 */  
public class MenuComplexButton extends MenuButton {  
    private MenuButton[] sub_button;  
  
    public MenuButton[] getSub_button() {  
        return sub_button;  
    }  
  
    public void setSub_button(MenuButton[] sub_button) {  
        this.sub_button = sub_button;  
    }  
}  
