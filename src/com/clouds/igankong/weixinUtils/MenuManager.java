package com.clouds.igankong.weixinUtils;

import com.clouds.igankong.ParamesAPI.AccessToken;
import com.clouds.igankong.ParamesAPI.WeixinUtil;

/** 
 * 菜单管理器类 
 *  
 */  
public class MenuManager {  
  
    public static void main(String[] args) { 
        // 企业Id  
        String CorpID = "wx52d22b7993b73a6a";  
        // 管理组的凭证密钥，每个secret代表了对应用、通讯录、接口的不同权限；不同的管理组拥有不同的secret 
        String Secret = "63315b00c9b3bc0f67951ddcc372ea11";  
  
        // 调用接口获取access_token  
        AccessToken at = WeixinUtil.getAccessToken(CorpID, Secret);  
  
        if (null != at) {  
            // 调用接口创建菜单  
            int result = WeixinUtil.createMenu(getMenu(), at.getToken());  
  
            // 判断菜单创建结果  
            if (0 == result){  
            	System.out.println("菜单创建成功！");
            }else  
            	System.out.println("菜单创建失败！");
        }  
    }  
  
    /** 
     * 组装菜单数据 
     *  
     * @return 
     */  
    private static Menu getMenu() {  
        MenuCommonButton btn11 = new MenuCommonButton();  
        btn11.setName("学霸天气");  
        btn11.setType("click");  
        btn11.setKey("11");  
  
        MenuCommonButton btn12 = new MenuCommonButton();  
        btn12.setName("学霸公交");  
        btn12.setType("click");  
        btn12.setKey("12");  
  
        MenuCommonButton btn13 = new MenuCommonButton();  
        btn13.setName("学霸周边");  
        btn13.setType("click");  
        btn13.setKey("13");  
        
        MenuCommonButton btn14 = new MenuCommonButton();  
        btn14.setName("学霸火车");  
        btn14.setType("click");  
        btn14.setKey("14");
  
        MenuCommonButton btn15 = new MenuCommonButton();  
        btn15.setName("历史今天");  
        btn15.setType("click");  
        btn15.setKey("15"); 
        
      
  
        MenuCommonButton btn21 = new MenuCommonButton();  
        btn21.setName("学霸点播");  
        btn21.setType("click");  
        btn21.setKey("21");  
  
        MenuCommonButton btn22 = new MenuCommonButton();  
        btn22.setName("学霸游戏");  
        btn22.setType("click");  
        btn22.setKey("22");  
  
        MenuCommonButton btn23 = new MenuCommonButton();  
        btn23.setName("学霸翻译");  
        btn23.setType("click");  
        btn23.setKey("23");  
  
        MenuCommonButton btn24 = new MenuCommonButton();  
        btn24.setName("人脸检测");  
        btn24.setType("click");  
        btn24.setKey("24");  
  
        MenuCommonButton btn25 = new MenuCommonButton();  
        btn25.setName("学霸唠嗑");  
        btn25.setType("click");  
        btn25.setKey("25");  
  
//        CommonButton btn31 = new CommonButton();  
//        btn31.setName("授权测试");  
//        btn31.setType("click");  
//        btn31.setKey("31");  
        
      MenuViewButton btn31 = new MenuViewButton();  
      btn31.setName("学霸授权");  
      btn31.setType("view");  
      btn31.setUrl("http://112.124.111.3/jialian/");
  
  
        MenuCommonButton btn32 = new MenuCommonButton();  
        btn32.setName("学霸快递");  
        btn32.setType("click");  
        btn32.setKey("32");  
  
        MenuCommonButton btn33 = new MenuCommonButton();  
        btn33.setName("学霸笑话");  
        btn33.setType("click");  
        btn33.setKey("33");
        
        MenuViewButton btn34 = new MenuViewButton();  
        btn34.setName("学霸微网");  
        btn34.setType("view");  
        btn34.setUrl("http://112.124.111.3/jialian/");
        
        MenuCommonButton btn35 = new MenuCommonButton();  
        btn35.setName("图片测试");  
        btn35.setType("click");  
        btn35.setKey("35");
        
//        ViewButton btn35 = new ViewButton();  
//        btn35.setName("学霸客服");  
//        btn35.setType("view");  
//        btn35.setUrl("http://wpa.qq.com/msgrd?v=3&uin=471644097&site=qq&menu=yes");
  
        MenuComplexButton mainBtn1 = new MenuComplexButton();  
        mainBtn1.setName("学霸生活");  
        mainBtn1.setSub_button(new MenuButton[] { btn11, btn12, btn13, btn14 , btn15});  
  
        MenuComplexButton mainBtn2 = new MenuComplexButton();  
        mainBtn2.setName("学霸休闲");  
        mainBtn2.setSub_button(new MenuButton[] { btn21, btn22, btn23, btn24 , btn25 });  
  
        MenuComplexButton mainBtn3 = new MenuComplexButton();  
        mainBtn3.setName("更多服务");  
        mainBtn3.setSub_button(new MenuButton[] { btn31, btn32, btn33 , btn34 , btn35});  
  
        /** 
         *  
         * 在某个一级菜单下没有二级菜单的情况，menu该如何定义呢？<br> 
         * 比如，第三个一级菜单项不是“更多体验”，而直接是“幽默笑话”，那么menu应该这样定义：<br> 
         * menu.setButton(new Button[] { mainBtn1, mainBtn2, btn33 }); 
         */  
        Menu menu = new Menu();  
        menu.setButton(new MenuButton[] { mainBtn1, mainBtn2, mainBtn3 });  
  
        return menu;  
    }  
}  
