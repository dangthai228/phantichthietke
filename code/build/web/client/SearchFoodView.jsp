<%-- 
    Document   : SearchFoodView
    Created on : Dec 31, 2021, 9:27:14 PM
    Author     : Administrator
--%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>

<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<div class="navbar">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <nav class="navbar navbar-expand-lg navbar-light bg-light" >
  <a class="navbar-brand" href="ClientHome">RESTMAN</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Book Table <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="#">Order Food <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="SearchFood">Search Food <span class="sr-only">(current)</span></a>
      </li>
    </ul>
  </div>
</nav>
    </div>

<!------ Include the above in your HEAD tag ---------->

<body>
    <div class="container">
    <br/>
    <form class="form" action="" method="post">
	<div class="row justify-content-center">
                        <div class="col-12 col-md-10 col-lg-8">
                                <div class="card-body row no-gutters align-items-center">
                                    <div class="col-auto">
                                        <i class="fas fa-search h4 text-body"></i>
                                    </div>
                                    <!--end of col-->
                                    <div class="col">
                                        <input class="form-control form-control-lg form-control-borderless" name="foodname" type="text" placeholder="Search topics or keywords">
                                    </div>
                                    <!--end of col-->
                                    <div class="col-auto">
                                        <button class="btn btn-lg" type="submit">Search</button>
                                    </div>
                                    <!--end of col-->
                                </div>
                        </div>
                        <!--end of col-->
                    </div>
    </form>
    </div>
    <div class="center-text">
    <h1>RESULT : </h1>
    </div>
    <br><br>
    
    <div class="container">
    <div id="products" class="row view-group">
      <c:forEach items="${food}" var="s">
        <div class="item col-xs-4 col-lg-4">
                    <div class="thumbnail card">
                        <div class="img-event">
                            <img class="group list-group-image img-fluid" src="${s.getUrlimage()}"  alt="" />
                        </div>
                        <div class="caption card-body">
                            <h4 class="group card-title inner list-group-item-heading">
                                ${s.getName()}</h4>
                            <div class="row">
                                <div class="col-xs-12 col-md-6">
                                    <p class="lead">
                                        ${s.getPrice()}</p>
                                </div>
                                <div class="col-xs-12 col-md-6">
                                    <a class="btn btn-success" href="DetailFood?id=${s.getId()}?name=${s.getName()}">Detail</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
    </c:forEach>
    </div>
    </div>
   
</body>

<style>
body{
  background-image: url('client/Search.png');
  background-size: cover;
}
.navbar {
    background-color: Tomato;
}
.center-text{
    text-align: center;
}
.view-group {
    display: -ms-flexbox;
    display: flex;
    -ms-flex-direction: row;
    flex-direction: row;
    padding-left: 0;
    margin-bottom: 0;
}
.thumbnail
{
    margin-bottom: 30px;
    padding: 0px;
    -webkit-border-radius: 0px;
    -moz-border-radius: 0px;
    border-radius: 0px;
}

.item.list-group-item
{
    float: none;
    width: 80%;
    background-color: #fff;
    margin-bottom: 30px;
    -ms-flex: 0 0 100%;
    flex: 0 0 100%;
    max-width: 100%;
    padding: 0 1rem;
    border: 0;
}
.item.list-group-item .img-event {
    float: left;
    width: 30%;
}

.item.list-group-item .list-group-image
{
    margin-right: 20px;
}
.item.list-group-item .thumbnail
{
    margin-bottom: 0px;
    display: inline-block;
}
.item.list-group-item .caption
{
    float: left;
    width: 30%;
    margin: 0;
}

.item.list-group-item:before, .item.list-group-item:after
{
    display: table;
    content: " ";
}

.item.list-group-item:after
{
    clear: both;
}
</style>
