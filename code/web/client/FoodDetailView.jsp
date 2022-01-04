<%-- 
    Document   : FoodDetailView
    Created on : Nov 20, 2021, 10:20:38 PM
    Author     : Administrator
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

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
    <body>
        <br><br><br>
        <div class="mid-text">
            <div class="text-white">
        <h1>${food.getName()}</h1>
        </div>
        </div>
        <div class="text-center">
        <img class="img" src="${food.getUrlimage()}" width="300" height="300"  alt="Card image cap">
        <div class="card-body">
        <h2 class="text-white">Description :  ${food.getDescription()}</h2>
        <h2 class="text-white">Type :  ${food.getType()}</h2>
        <h2 class="text-white">Price :  ${food.getPrice()}</h2>
        <br><br><!-- comment -->
        <button class="btn btn-lg" type="submit">Order Now !</button>
		<a class="btn btn-success" href="SearchFood">Back</a>
        </div>
        </div>
    </body>

<style>
body {
  background-image: url('client/Search.png');
  background-size: cover;
}
.navbar {
    background-color: Tomato;
}
.mid-text{
    text-align: center;
}

</style>