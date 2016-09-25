<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html class="no-js">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Welcome To HaHaMengMeng</title>
  <meta name="description" content="">
  <meta name="keywords" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="icon" type="image/favicon.png" href="images/favicon.png">
  <link rel="stylesheet" href="css/amazeui.min.css">
  <link rel="stylesheet" href="css/app.css">
    <link rel="stylesheet" href="css/welcome.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/amazeui.min.js"></script>
</head>
<body style="height:100%;">
<div class="welcom_photo">
	<!-- logo -->
	<img src="images/favicon.png" class="logo_photo">
	<div class="loginregist">
	<a href="">登录</a>
	<span class="whitespace"></span>
	<a href="">注册</a>
	</div>
	
	<!-- Slider -->
<div data-am-widget="slider"  class="am-slider am-slider-a1" data-am-slider='{"directionNav":false}' style="position:relative; z-index:-100;">
  <ul class="am-slides">
    <li>
      <img src="images/welcome_1.png">
    </li>
    <li>
      <img src="images/welcome_2.png">
    </li>
  </ul>
</div>
<!-- 导航窗口 -->
 <img class="am-circle am-avg-sm-2 navigationstudent" src="images/student.png" width="140" height="140"/>
 <img class="am-circle am-avg-sm-2 navigationparents" src="images/parents.png" width="140" height="140"/>

<div class="footer">
	<div>
	<a  class="footerLink" href="">微信公众号</a>
	<span class="verline">|</span>
	<a  class="footerLink" href="">心声社区</a>
	</div>
	<div class="copyRight">kigMika Copyright ©2016版权所有</div>
</div>
</div>
</body>
</html>