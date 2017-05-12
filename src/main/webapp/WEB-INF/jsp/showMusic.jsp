<!DOCTYPE html>
<html lang="en">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<head>
    <meta charset="UTF-8">
    <title>Music</title>
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <link rel="stylesheet" href="http://fonts.useso.com/css?family=Open+Sans:300,400">   <!-- Google web font "Open Sans" -->
    <link rel="stylesheet" href="../css/bootstrap.min.css">                                      <!-- Bootstrap style -->
    <link rel="stylesheet" href="../css/magnific-popup.css">                                     <!-- Magnific pop up style -->
    <link rel="stylesheet" href="../css/templatemo-style.css">
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script src="../js/jquery-1.11.3.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/jquery.magnific-popup.min.js"></script>
    <script src="../js/jquery.singlePageNav.min.js"></script>
    <script src="../js/jquery.touchSwipe.min.js"></script>
    <script src="../js/login.js"></script>
</head>
<body>
<div class="container">
    <div class="tm-sidebar">
        <img src="img/menu-top.jpg" alt="Menu top image" class="img-fluid tm-sidebar-image">
        <nav class="tm-main-nav">
            <ul>
                <li class="tm-nav-item"><a href="#theme" class="tm-nav-item-link">Theme</a></li>
                <li class="tm-nav-item"><a href="#recent" class="tm-nav-item-link">Recent</a></li>
                <li class="tm-nav-item"><a href="#ideas" class="tm-nav-item-link">Ideas</a></li>
                <li class="tm-nav-item"><a href="#contact" class="tm-nav-item-link">Contact</a></li>
            </ul>
        </nav>
    </div>
    <div class="tm-main-content">
        <section id="theme" class="tm-content-box tm-banner margin-b-10">
            <div class="tm-banner-inner">
                <h1 class="tm-banner-title">MUSIC</h1>
                <p class="tm-banner-text">网易云音乐用户 <br><a href="">旗木雨哲</a></p>
            </div>
        </section>
        <section id="recent" class="tm-content-box  tm-banner margin-b-10 ">
            <div class="tm-content-box flex-2-col">
                <div class=" flex-item">
                    <h2 class="tm-section-title">Our Team</h2>
                    <p class="tm-section-description">${music}Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque vel nisi pharetra nibh varius pharetra ac sagittis nisi. Etiam pharetra vestibulum hendrerit.</p>
                    <p class="tm-section-description">Donec ex libero, fringilla vitae purus sit amet, rhoncus pharetra lorem. Pellentesque id sem id lacus ultricies vehicula. Aliquam rutrum mi non.</p>
                </div>
                <div class="flex-item">
                    <img src="../img/about.jpg" alt="">
                </div>
            </div>
        </section>
    </div>
</div>
</body>
</html>