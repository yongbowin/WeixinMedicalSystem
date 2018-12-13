<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>待修改-职业暴露-感控科用</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/sense_control/s_occupational_exposure.css" />
</head>
<body>
<div class="title-0">
本年度累计发生职业暴露XXX例，其中锐器<br/>
伤XXX例，血液体液暴露XXX例。
</div>
<div class="line"></div>

<div class="container-1">
       <div class="box-1">
            <div class="cirle"></div>
            <div class="text">利器伤上报</div>
       </div>
       <div class="box-2">
         <div class="cirle"></div>
         <div class="text">血体液上报</div>
       </div>
</div>

<div class="container-1">
      <div class="box-3">
          <div class="cirle"></div>
          <div class="text">暴露历史</div>
      </div>
</div>

<div class="sub-title-2">确认暴露</div> 
<div class="red-container">
     <div class="red-rectangle"></div> 
     <div class="red-sanjiao"></div> 
     <div class="red-line"></div>
</div>  

<div class="container-of-a-line">
<div class="red-dot-1"></div>
<div class="content">$user上报了职业暴露，请立即确认！</div>
<div class="bottom-0" > 查看</div>
</div>

<div class="sub-title-1">提醒事件</div> 
<div class="green-container">
     <div class="green-rectangle"></div> 
     <div class="green-sanjiao"></div> 
     <div class="green-line"></div>
</div> 


<div class="container-of-a-line">
<div class="red-dot-1"></div>
<div class="content">请于近3日，做第N次$test复查。</div>
<div class="bottom-0" > 已查</div>
</div>

<div class="container-of-a-line">
<div class="red-dot-1"></div>
<div class="content">12.31暴露案例需补报暴露源情况</div>
<div class="bottom-0" >补报</div>
</div>

<div class="container-of-a-line">
<div class="red-dot-1"></div>
<div class="content">12.31补报第四周后有无特殊症状</div>
<div class="bottom-0" > 补报</div>
</div>

<div class="sub-title-3">个人暴露历史</div> 
<div class="blue-container">
     <div class="blue-rectangle"></div> 
     <div class="blue-sanjiao"></div> 
     <div class="blue-line"></div>
</div> 



<div class="text-container-1">
  <div class="sub-container" >
       <div class="div12">
             2016.12.31&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;利器伤&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$暴露源
       </div>
       <div class="div13">
       <div class="a"></div>
       </div> 
   </div>
    
</div>

<div class="text-container-2">
   <div class="sub-container" >
       <div class="div12">
             2016.12.31&nbsp;&nbsp;&nbsp;&nbsp;血液体液暴露&nbsp;&nbsp;&nbsp;&nbsp;$暴露源
       </div>
       <div class="div13">
       <div class="a"></div>
       </div> 
    </div> 
    <div class="line-thin"></div>
    <div class="level">暴露级别：</div>
    <div class="red-text">1级</div>
     <div class="level">暴露源头严重程度：</div>
    <div class="red-text">3级</div>
    <div class="line-thin"></div>
    <div class="level">治疗预案或处理措施</div>
    <div class="items">1.立即注射乙肝疫苗10&nbsp;ug&nbsp;qd</div>
    <div class="square">
             <div class="little-square"></div>  
    </div>
    <div class="items">2.立即肌注乙肝免疫疫苗球蛋白200&nbsp;IU&nbsp;qd</div>
    <div class="square"></div>
    <div class="items">3.口服双汰芝1片&nbsp;bid</div>
    <div class="square"></div>
    <div class="time">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;月&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;日&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;至&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;月&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;日&nbsp;&nbsp;</div>
    <div class="items">4.口服茚地那伟0.8&nbsp;q8h</div>
    <div class="square"></div>
    <div class="time">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;月&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;日&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;至&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;月&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;日&nbsp;&nbsp;</div>
    <div class="items">5.立即静注人免疫球蛋白50ml&nbsp;qd</div>
    <div class="square"></div>
    <div class="line-UnderOthers"></div>
    <div class="text-0">毒副作用</div>
    <div class="no">无</div>
    <div class="line-UnderOthers"></div>
    <div class="text-1">复查历史</div>
    <div class="text-2">2016.01.31</div>
    <div class="text-3">第1次</div>
    <div class="text-2">乙肝检查</div>
    <div class="bottom-red">阳性</div>
    
    <div class="text-2">2016.03.31</div>
    <div class="text-3">第2次</div>
    <div class="text-2">乙肝检查</div>
    <div class="bottom-green">阳性</div>
    
    <div class="text-2">2016.06.31</div>
    <div class="text-3">第3次</div>
    <div class="text-2">乙肝检查</div>
    <div class="bottom-green">阳性</div>
    
    <div class="text-2">2016.09.31</div>
    <div class="text-3">第4次</div>
    <div class="text-2">乙肝检查</div>
    <div class="bottom-green">阳性</div>
    
    <div class="text-2">2016.12.31</div>
    <div class="text-3">第5次</div>
    <div class="text-2">乙肝检查</div>
    <div class="bottom-gray">未查</div>
</div>
<div class="contact-me">返&nbsp;回</div> 
</body>
</html>