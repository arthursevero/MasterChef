<%@ page language="java" contentType="text/html; charset=iso-8859-1"
   pageEncoding="iso-8859-1" %>
<!DOCTYPE html>
<!--[if lt IE 7 ]> 
<html class="ie ie6 no-js" lang="en">
   <![endif]-->
   <!--[if IE 7 ]>    
   <html class="ie ie7 no-js" lang="en">
      <![endif]-->
      <!--[if IE 8 ]>    
      <html class="ie ie8 no-js" lang="en">
         <![endif]-->
         <!--[if IE 9 ]>    
         <html class="ie ie9 no-js" lang="en">
            <![endif]-->
            <!--[if gt IE 9]><!-->
            <html class="no-js" lang="en">
               <!--<![endif]-->
               <head>
                  <meta charset="UTF-8">
                  <title>Master Chef</title>
                  <meta name="description" content="Onepage Multipurpose Bootstrap HTML Template">
                  <meta name="author" content="">
                  <meta name="viewport" content="width=device-width, initial-scale=1.0">
                  <link rel="stylesheet" type="text/css" media="screen" href="css/bootstrap.css">
                  <link rel="stylesheet" href="css/font-awesome.css">
                  <link rel="stylesheet" href="css/animate.css">
                  <link rel="stylesheet" href="css/theme.css">
                  <link href="css/bootstrap.css" rel="stylesheet" />
                  <link href="css/modal.css" rel="stylesheet" />
                  <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
                  <script src="js/bootstrap.js" type="text/javascript"></script>
                  <script src="js/modal.js" type="text/javascript"></script>
                  <link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
                  <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
                  <link href='https://fonts.googleapis.com/css?family=Playball' rel='stylesheet' type='text/css'>
                  <link rel="stylesheet" href="css/theme.css" type="text/css"/>
               </head>
               <body>
                  <!--wrapper start-->
                  <div class="wrapper" id="wrapper">
                     <!--header-->
                     <header>
                        <div class="banner row" id="banner">
                           <div class="parallax text-center" style="background-image: url(https://www.wowthemes.net/demo/leroy/img/dummy1.jpg);">
                              <div class="parallax-pattern-overlay">
                                 <div class="container text-center" style="height:600px;padding-top:170px;">
                                    <a href="#"><img id="site-title" class=" wow fadeInDown" wow-data-delay="0.0s" wow-data-duration="1.8s" src="img/logo2.png" alt="logo"/></a>
                                    <h2 class="intro wow zoomIn" wow-data-delay="0.4s" wow-data-duration="0.9s">Master Chef</h2>
                                 </div>
                              </div>
                           </div>
                        </div>
                        <div class="menu">
                           <div class="navbar-wrapper">
                              <div class="container">
                                 <div class="navwrapper">
                                    <div class="navbar navbar-inverse navbar-static-top">
                                       <div class="container">
                                          <div class="navArea">
                                             <div class="navbar-collapse collapse">
                                                <ul class="nav navbar-nav">
                                                   <li class="menuItem active"><a href="#wrapper">Home</a></li>
                                                   <li class="menuItem"><a href="#aboutus">Sobre a casa</a></li>
                                                   <li class="menuItem"><a href="#specialties">Especialidades</a></li>
                                                   <li class="menuItem"><a data-toggle="modal" href="javascript:void(0)" onclick="openLoginModal();">Login</a></li>
                                                   <li class="menuItem"><a href="#contact">Contato</a></li>
                                                </ul>
                                             </div>
                                          </div>
                                       </div>
                                    </div>
                                 </div>
                              </div>
                           </div>
                        </div>
                     </header>
                     <div class="modal fade login" id="loginModal">
                        <div class="modal-dialog login animated">
                           <div class="modal-content">
                              <div class="modal-header">
                                 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                 <h4 class="modal-title">Entre!</h4>
                              </div>
                              <div class="modal-body">
                                 <div class="box">
                                    <div class="content">
                                       <div class="error"></div>
                                       <div class="form loginBox">
                                          <form name='loga' id="entra" action="controller" method="post">
                                             <div class="input-with-icon success-control">  
                                                <input type="text" class="form-control" id="login"     name="login" placeholder="Login"><br/>
                                             </div>
                                             <div class="input-with-icon success-control">  
                                                <input type="password" class="form-control" id="password"     name="password" placeholder="Senha"><br/>
                                             </div>
                                             <button onclick="form_submit()"  value='Log in' class="btn btn-danger"><i class="fa fa-user"></i> User</button>
                                             <input type="hidden" name="command" value="login"/>
                                          </form>
                                          <script type="text/javascript">
                                             function form_submit() {
                                               document.getElementById("entra").submit();
                                              }    
                                          </script>
                                       </div>
                                    </div>
                                 </div>
                              </div>
                           </div>
                        </div>
                     </div>
                     <!--about us-->
                     <section class="aboutus" id="aboutus">
                        <div class="container">
                           <div class="heading text-center">
                              <img class="dividerline" src="img/sep.png" alt="">
                              <h2>Sobre a casa</h2>
                              <img class="dividerline" src="img/sep.png" alt="">
                              <h3>O Master Chef vem trazer a você o melhor da culinária, com os melhores chefs e os melhores pratos, elaborados com carinho e atenção, assim como nosso atendimento, sempre buscando serví-lo da melhor maneira possível.</h3>
                           </div>
                           <div class="row">
                              <div class="col-md-6">
                                 <div class="papers text-center">
                                    <img src="img/chef1.jpeg" alt=""><br/>
                                    <h4 class="notopmarg nobotmarg">Cozinha</h4>
                                    <p>
                                       Nossa cozinha sempre muito bem organizada, com produtos frescos e chefs preparados!
                                    </p>
                                 </div>
                              </div>
                              <div class="col-md-6">
                                 <div class="papers text-center">
                                    <img src="img/chef2.jpeg" alt=""><br/>
                                    <h4 class="notopmarg nobotmarg">Entrega</h4>
                                    <p>
                                       Os seus pedidos são entregues totalmente identificados, evitando que haja algum engano. Nossa simpática equipe fará você se sentir na casa da vovó.
                                    </p>
                                 </div>
                              </div>
                           </div>
                        </div>
                     </section>
                     <!--specialties-->
                     <section class="specialties" id="specialties">
                        <div class="container">
                           <div class="heading text-center">
                              <img class="dividerline" src="img/sep.png" alt="">
                              <h2>Especialidades</h2>
                              <img class="dividerline" src="img/sep.png" alt="">
                              <h3>Aqui lhe mostramos nossas especiarias criadas pelos nossos chefs, certificadas por críticos culinários. </h3>
                           </div>
                           <div class="row">
                              <div class="col-md-4">
                                 <div class="restmenuwrap">
                                    <h3 class="maincat notopmarg text-center">APERITIVOS</h3>
                                    <div class="restitem clearfix">
                                       <div class="rm-thumb" style="background-image: url(http://wowthemes.net/demo/leroy/img/dummies/1.jpg)">
                                       </div>
                                       <h5>Pão recheado com vinho tinto</h5>
                                       <p>
                                          Uma leve entrada com um pão caseiro levemente adocicado, acompanhado de uma taça de vinho tinto.
                                       </p>
                                    </div>
                                    <div class="restitem clearfix">
                                       <div class="rm-thumb" style="background-image: url(http://wowthemes.net/demo/leroy/img/dummies/2.jpg)">
                                       </div>
                                       <h5>Light Salad</h5>
                                       <p>
                                          Pequenas tiras de frutas frescas, sendo uma ótima opção para um café da manhã.
                                       </p>
                                    </div>
                                    <div class="restitem clearfix">
                                       <div class="rm-thumb" style="background-image: url(http://wowthemes.net/demo/leroy/img/dummies/3.jpg)">
                                       </div>
                                       <h5>Frango assado</h5>
                                       <p>
                                          Frango cuidadosamente temperado, e assado ao ponto. Irresistível!
                                       </p>
                                    </div>
                                 </div>
                              </div>
                              <div class="col-md-4">
                                 <div class="restmenuwrap">
                                    <h3 class="maincat notopmarg text-center">PRATO PRINCIPAL</h3>
                                    <div class="restitem clearfix">
                                       <div class="rm-thumb" style="background-image: url(http://wowthemes.net/demo/leroy/img/dummies/4.jpg)">
                                       </div>
                                       <h5>Steak Australiano</h5>
                                       <p>
                                          Filé de carne (300g) preparado à moda australiana, acompanhado de tiras de cebola. 
                                       </p>
                                    </div>
                                    <div class="restitem clearfix">
                                       <div class="rm-thumb" style="background-image: url(http://wowthemes.net/demo/leroy/img/dummies/5.jpg)">
                                       </div>
                                       <h5>Vegetariano</h5>
                                       <p>
                                          Salada com pepino, alface e brócolis, juntamente com omelete coberto ao molho de tomate.
                                       </p>
                                    </div>
                                    <div class="restitem clearfix">
                                       <div class="rm-thumb" style="background-image: url(http://wowthemes.net/demo/leroy/img/dummies/6.jpg)">
                                       </div>
                                       <h5>Double Burguer</h5>
                                       <p>
                                         Hambúrguer com 2 carnes de picanha, tiras de bacon, cebola, queijo, alface e picles. Uma delícia!
                                       </p>
                                    </div>
                                 </div>
                              </div>
                              <div class="col-md-4">
                                 <div class="restmenuwrap">
                                    <h3 class="maincat notopmarg text-center">SOBREMESA</h3>
                                    <div class="restitem clearfix">
                                       <div class="rm-thumb" style="background-image: url(http://wowthemes.net/demo/leroy/img/dummies/7.jpg)">
                                       </div>
                                       <h5>Happy Basket</h5>
                                       <p>
                                          Cesta com 10 bombons de chocolate 100% suíço. O melhor da casa!
                                       </p>
                                    </div>
                                    <div class="restitem clearfix">
                                       <div class="rm-thumb" style="background-image: url(http://wowthemes.net/demo/leroy/img/dummies/8.jpg)">
                                       </div>
                                       <h5>Brownie</h5>
                                       <p>
                                          Brownie preparado com chocolate belga, com um toque de avelã.
                                       </p>
                                    </div>
                                    <div class="restitem clearfix">
                                       <div class="rm-thumb" style="background-image: url(http://wowthemes.net/demo/leroy/img/dummies/9.jpg)">
                                       </div>
                                       <h5>Chef Shake</h5>
                                       <p>
                                          Um de nossos chefs irá preparar um milk shake, à sua vontade.
                                       </p>
                                    </div>
                                 </div>
                              </div>
                           </div>
                        </div>
                     </section>
                     <!--feedback-->
                     <section class="feedback" id="feedback">
                        <div class="container w960">
                           <div class="heading">
                              <img class="dividerline" src="img/sep.png" alt="">
                              <h2>Login</h2>
                              <img class="dividerline" src="img/sep.png" alt="">
                              <h3>Agora que você já está por dentro das novidades, que tal aproveitar e fazer um pedido?</h3>
                              <a href="#" class="btn btn-primary btn-lg sharp">Login</a>
                              <button type="button" class="btn btn-primary btn-lg sharp">Sharp</button>
                           </div>
                        </div>
                     </section>
                     <!--feedback-->
                     <section class="contact" id="contact">
                        <div class="container">
                           <div class="heading">
                              <img class="dividerline" src="img/sep.png" alt="">
                              <h2>Entre em Contato!</h2>
                              <img class="dividerline" src="img/sep.png" alt="">
                              <h3>Se você deseja que algum de nossos representantes entre em contato, <br>ou caso tenha alguma dúvida ou ainda mesmo quer mandar uma mensagem para o chef,<br>
                                 fale conosco! Será um prazer lhe atender.
                              </h3>
                           </div>
                        </div>
                        <div class="container w960">
                           <div class="row">
                              <div class="done">
                                 <div class="alert alert-success">
                                    <button type="button" class="close" data-dismiss="alert">×</button>
                                    Sua mensagem
                                 </div>
                              </div>
                              <form method="post" action="contact.php" id="contactform">
                                 <input name="name" type="text" class="contact col-md-6" placeholder="Nome" >
                                 <input name="email" type="email" class="contact noMarr col-md-6" placeholder="E-mail" >
                                 <textarea name="comment" class="contact col-md-12" placeholder="Mensagem"></textarea>
                                 <input type="submit" id="submit" class="contact submit" value="Enviar mensagem!">
                              </form>
                           </div>
                        </div>
                     </section>
                     <!--footer-->
                     <section class="footer" id="footer">
                        <p class="text-center">
                           <a href="#wrapper" class="gototop"><i class="fa fa-angle-double-up fa-2x"></i></a>
                        </p>
                        <div class="container">
                           <ul>
                              <li><a href="http://twitter.com/caionaweb"><i class="fa fa-twitter"></i></a></li>
                              <li><a href="http://fb.com/caionaweb"><i class="fa fa-facebook"></i></a></li>
                           </ul>
                        </div>
                     </section>
                  </div>
                  <!--wrapper end-->
                  <!--Javascripts-->
                  <script src="js/jquery.js"></script>
                  <script src="js/modernizr.js"></script>
                  <script src="js/bootstrap.js"></script>
                  <script src="js/menustick.js"></script>
                  <script src="js/parallax.js"></script>
                  <script src="js/easing.js"></script>
                  <script src="js/wow.js"></script>
                  <script src="js/smoothscroll.js"></script>
                  <script src="js/masonry.js"></script>
                  <script src="js/imgloaded.js"></script>
                  <script src="js/classie.js"></script>
                  <script src="js/colorfinder.js"></script>
                  <script src="js/gridscroll.js"></script>
                  <script src="js/contact.js"></script>
                  <script src="js/common.js"></script>
                  <script type="text/javascript">
                     jQuery(function($) {
                     $(document).ready( function() {
                       //enabling stickUp on the '.navbar-wrapper' class
                     	$('.navbar-wrapper').stickUp({
                     		parts: {
                     		  0: 'banner',
                     		  1: 'aboutus',
                     		  2: 'specialties',
                     		  3: 'feedback',
                     		  4: 'contact'
                     		},
                     		itemClass: 'menuItem',
                     		itemHover: 'active',
                     		topMargin: 'auto'
                     		});
                     	});
                     });
                  </script>
               </body>
            </html>
