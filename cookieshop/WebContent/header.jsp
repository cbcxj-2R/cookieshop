<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="header">
    <div class="container">
        <nav class="navbar navbar-default" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <h1 class="navbar-brand"><a href="/index"></a></h1>
            </div>
            <!--navbar-header-->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="/index" >首页</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle " data-toggle="dropdown">商品分类<b class="caret"></b></a>
                        <ul class="dropdown-menu multi-column columns-2">
                            <li>
                                <div class="row">
                                    <div class="col-sm-12">
                                        <h4>商品分类</h4>
                                        <ul class="multi-column-dropdown">

                                            <li><a class="list" href="/goods_list">全部系列</a></li>

                                            
                                                <li><a class="list" href="/goods_list?typeid=1">冰淇淋系列</a></li>
                                            
                                                <li><a class="list" href="/goods_list?typeid=2">零食系列</a></li>
                                            
                                                <li><a class="list" href="/goods_list?typeid=3">儿童系列</a></li>
                                            
                                                <li><a class="list" href="/goods_list?typeid=4">法式系列</a></li>
                                            
                                                <li><a class="list" href="/goods_list?typeid=5">经典系列</a></li>
                                            
                                                <li><a class="list" href="/goods_list?typeid=8">节日系列</a></li>
                                            
                                                <li><a class="list" href="/goods_list?typeid=11">买不起系列</a></li>
                                            
                                                <li><a class="list" href="/goods_list?typeid=12">中式系列</a></li>
                                            


                                        </ul>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </li>
                    <li><a href="/goodsrecommend_list?type=2" >热销</a></li>
                    <li><a href="/goodsrecommend_list?type=3" >新品</a></li>

                    
                        <li><a href="${pageContext.request.contextPath}/user_register.jsp"
                         <c:if test="${param.flag==8}">class="active"</c:if>>注册</a></li>
                        <li><a href="${pageContext.request.contextPath}/user_login.jsp" 
                         <c:if test="${param.flag==9}">class="active"</c:if>>登录</a></li>
                    
                    

                    
                </ul>
                <!--/.navbar-collapse-->
            </div>
            <!--//navbar-header-->
        </nav>
        <div class="header-info">
            <div class="header-right search-box">
                <a href="javascript:;"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></a>
                <div class="search">
                    <form class="navbar-form" action="/goods_search">
                        <input type="text" class="form-control" name="keyword">
                        <button type="submit" class="btn btn-default " aria-label="Left Align">搜索</button>
                    </form>
                </div>
            </div>

            <div class="header-right cart">
                <a href="goods_cart.jsp">
                    <span class="glyphicon glyphicon-shopping-cart " aria-hidden="true"><span class="card_num">0</span></span>
                </a>
            </div>
            <div class="clearfix"> </div>
        </div>
        <div class="clearfix"> </div>
    </div>
</div>

</body>
</html>