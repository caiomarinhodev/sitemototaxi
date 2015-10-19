
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE HTML>
<html>
    <head>
        <title>Click Mototaxi</title>
        <link href="/assets/css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link rel="shortcut icon" href="/assets/images/fav.png" />
            <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="/assets/js/jquery.min.js"></script>
        <script type="text/javascript">
        $ ( document ).ready ( function ( ) """),format.raw/*10.45*/("""{"""),format.raw/*10.46*/("""
        """),format.raw/*11.9*/("""function detectmob ( ) """),format.raw/*11.32*/("""{"""),format.raw/*11.33*/("""
        """),format.raw/*12.9*/("""if ( navigator.userAgent.match ( /Android/i )
        || navigator.userAgent.match ( /webOS/i )
        || navigator.userAgent.match ( /iPhone/i )
        || navigator.userAgent.match ( /iPad/i )
        || navigator.userAgent.match ( /iPod/i )
        || navigator.userAgent.match ( /BlackBerry/i )
        || navigator.userAgent.match ( /Windows Phone/i )
        ) """),format.raw/*19.11*/("""{"""),format.raw/*19.12*/("""
        """),format.raw/*20.9*/("""return true ;
        """),format.raw/*21.9*/("""}"""),format.raw/*21.10*/("""
        """),format.raw/*22.9*/("""else """),format.raw/*22.14*/("""{"""),format.raw/*22.15*/("""
        """),format.raw/*23.9*/("""return false ;
        """),format.raw/*24.9*/("""}"""),format.raw/*24.10*/("""
        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/("""
        """),format.raw/*26.9*/("""function detectmob2 ( ) """),format.raw/*26.33*/("""{"""),format.raw/*26.34*/("""
        """),format.raw/*27.9*/("""if ( window.innerWidth <= 800 && window.innerHeight <= 600 ) """),format.raw/*27.70*/("""{"""),format.raw/*27.71*/("""
        """),format.raw/*28.9*/("""return true ;
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/(""" """),format.raw/*29.11*/("""else """),format.raw/*29.16*/("""{"""),format.raw/*29.17*/("""
        """),format.raw/*30.9*/("""return false ;
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/("""
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/("""

        """),format.raw/*34.9*/("""if ( detectmob ( ) || detectmob2 ( ) ) """),format.raw/*34.48*/("""{"""),format.raw/*34.49*/("""
        """),format.raw/*35.9*/("""window.location.assign ( "http://www.clickmototaxi.com/app" ) ;
        """),format.raw/*36.9*/("""}"""),format.raw/*36.10*/("""
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/(""" """),format.raw/*37.11*/(""") ;
        </script>
            <!---- start-smoth-scrolling---->
        <script type="text/javascript" src="/assets/js/move-top.js"></script>
        <script type="text/javascript" src="/assets/js/easing.js"></script>
        <script type="text/javascript">
        jQuery ( document ).ready ( function ( $ ) """),format.raw/*43.52*/("""{"""),format.raw/*43.53*/("""
        """),format.raw/*44.9*/("""$ ( ".scroll" ).click ( function ( event ) """),format.raw/*44.52*/("""{"""),format.raw/*44.53*/("""
        """),format.raw/*45.9*/("""event.preventDefault ( ) ;
        $ ( 'html,body' ).animate ( """),format.raw/*46.37*/("""{"""),format.raw/*46.38*/(""" """),format.raw/*46.39*/("""scrollTop : $ ( this.hash ).offset ( ).top """),format.raw/*46.82*/("""}"""),format.raw/*46.83*/(""", 1000 ) ;
        """),format.raw/*47.9*/("""}"""),format.raw/*47.10*/(""" """),format.raw/*47.11*/(""") ;
        """),format.raw/*48.9*/("""}"""),format.raw/*48.10*/(""" """),format.raw/*48.11*/(""") ;
        </script>
            <!-- Custom Theme files -->
        <link href="/assets/css/style.css" rel='stylesheet' type='text/css' />
            <!-- Custom Theme files -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script type="application/x-javascript"> addEventListener ( "load", function ( ) """),format.raw/*54.90*/("""{"""),format.raw/*54.91*/(""" """),format.raw/*54.92*/("""setTimeout ( hideURLbar, 0 ) ; """),format.raw/*54.123*/("""}"""),format.raw/*54.124*/(""", false ) ; function hideURLbar ( ) """),format.raw/*54.160*/("""{"""),format.raw/*54.161*/(""" """),format.raw/*54.162*/("""window.scrollTo ( 0, 1 ) ; """),format.raw/*54.189*/("""}"""),format.raw/*54.190*/(""" """),format.raw/*54.191*/("""</script>
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,800,700' rel='stylesheet' type='text/css'/>
        <script>
        $ ( function ( ) """),format.raw/*57.26*/("""{"""),format.raw/*57.27*/("""
        """),format.raw/*58.9*/("""var pull = $ ( '#pull' ) ;
        menu = $ ( 'nav ul' ) ;
        menuHeight = menu.height ( ) ;
        $ ( pull ).on ( 'click', function ( e ) """),format.raw/*61.49*/("""{"""),format.raw/*61.50*/("""
        """),format.raw/*62.9*/("""e.preventDefault ( ) ;
        menu.slideToggle ( ) ;
        """),format.raw/*64.9*/("""}"""),format.raw/*64.10*/(""" """),format.raw/*64.11*/(""") ;
        $ ( window ).resize ( function ( ) """),format.raw/*65.44*/("""{"""),format.raw/*65.45*/("""
        """),format.raw/*66.9*/("""var w = $ ( window ).width ( ) ;
        if ( w > 320 && menu.is ( ':hidden' ) ) """),format.raw/*67.49*/("""{"""),format.raw/*67.50*/("""
        """),format.raw/*68.9*/("""menu.removeAttr ( 'style' ) ;
        """),format.raw/*69.9*/("""}"""),format.raw/*69.10*/("""
        """),format.raw/*70.9*/("""}"""),format.raw/*70.10*/(""" """),format.raw/*70.11*/(""") ;
        """),format.raw/*71.9*/("""}"""),format.raw/*71.10*/(""" """),format.raw/*71.11*/(""") ;
        </script>
    </head>
    <body>
            <!-----start-container----->
            <!-----header-section------>
        <div class="header-section">
                <!----- start-header---->
            <div id="home" class="header">
                <div class="container">
                    <div class="top-header">
                        <div class="logo">
                            <a href="#"><img src="/assets/images/logo4.png" title="logo" /></a>
                        </div>
                            <!----start-top-nav---->
                        <nav class="top-nav">
                            <ul class="top-nav">
                                <li class="active"><a href="#home" class="scroll">Home </a></li>
                                <li class="page-scroll"><a href="#fea" class="scroll">App</a></li>
                                <li class="page-scroll"><a href="#gallery" class="scroll">Galeria</a></li>
                                <li class="contatct-active" class="page-scroll"><a href="#contact" class="scroll">
                                    Contato</a>
                                </li>
                            </ul>
                            <a href="#" id="pull"><img src="/assets/images/nav-icon.png" title="menu" /></a>
                        </nav>
                        <div class="clearfix"> </div>
                    </div>
                </div>
            </div>
                <!----- //End-header---->
                <!----- start-slider---->
                <!----start-slider-script---->
            <script src="/assets/js/responsiveslides.min.js"></script>
            <script>
            // You can also use "$(window).load(function() """),format.raw/*106.60*/("""{"""),format.raw/*106.61*/(""""
            $ ( function ( ) """),format.raw/*107.30*/("""{"""),format.raw/*107.31*/("""
            """),format.raw/*108.13*/("""// Slideshow 4
            $ ( "#slider4" ).responsiveSlides ( """),format.raw/*109.49*/("""{"""),format.raw/*109.50*/("""
            """),format.raw/*110.13*/("""auto : true,
            pager : true,
            nav : true,
            speed : 500,
            namespace : "callbacks",
            before : function ( ) """),format.raw/*115.35*/("""{"""),format.raw/*115.36*/("""
            """),format.raw/*116.13*/("""$ ( '.events' ).append ( "<li>before event fired.</li>" ) ;
            """),format.raw/*117.13*/("""}"""),format.raw/*117.14*/(""",
            after : function ( ) """),format.raw/*118.34*/("""{"""),format.raw/*118.35*/("""
            """),format.raw/*119.13*/("""$ ( '.events' ).append ( "<li>after event fired.</li>" ) ;
            """),format.raw/*120.13*/("""}"""),format.raw/*120.14*/("""
            """),format.raw/*121.13*/("""}"""),format.raw/*121.14*/(""" """),format.raw/*121.15*/(""") ;

            """),format.raw/*123.13*/("""}"""),format.raw/*123.14*/(""" """),format.raw/*123.15*/(""") ;
            </script>
                <!----//End-slider-script---->
                <!-- Slideshow 4 -->
            <div id="top" class="callbacks_container">
                <ul class="rslides" id="slider4">
                    <li>
                        <img src="/assets/images/slide.jpg" alt="">
                        <div class="caption text-center">
                            <div class="slide-text-info">
                                <h1><span>Click Mototaxi</span> é grátis!</h1>
                                <h2>O aplicativo que chama o mototaxista</h2> <h2> mais perto de você.</h2>
                                <br/>
                                <h2>Ligar no radio mototáxi é coisa do passado.</h2>
                                <h2>Veja os mototáxis nos arredores</h2>
                                <h2>e não espere mais num ponto de mototáxi.</h2>
                                <br/>
                                <div class="clearfix"> </div>
                                <div class="big-btns">
                                    <center>
                                        <a class="download" href="https://play.google.com/store/apps/details?id=com.taxicg.clickmototaxi"><label> </label>
                                            Download</a>
                                    </center>
                                </div>
                            </div>

                        </div>
                            <!-----divice----->
                        <div class="divice-demo">
                            <img src="/assets/images/device_hand.png" title="demo" />
                        </div>
                            <!---//divice----->
                    </li>
                </ul>
            </div>
            <div class="clearfix"> </div>
                """),format.raw/*159.40*/("""
            """),format.raw/*160.42*/("""
                """),format.raw/*161.78*/("""
            """),format.raw/*162.23*/("""
                """),format.raw/*163.40*/("""
                """),format.raw/*164.17*/("""<!----- //End-slider---->
        </div>
            <!-----//header-section----->
            <!----features----->
        <div id="fea" class="features">
            <div class="container">
                <div class="section-head text-center">
                    <h3><span class="frist"> </span>SOBRE O APP<span class="second"> </span></h3>
                    <p>Ligar no radio taxi é coisa do passado: para pedir um mototáxi online basta clicar em 'Chamar Moto'. Veja sua localização e mototáxis nos arredores e não espere mais num ponto de mototáxi.</p>
                </div>
                    <!----features-grids----->
                <div class="features-grids">
                    <div class="col-md-4 features-grid">
                        <div class="features-grid-info">
                            <div class="col-md-2 features-icon">
                                <span class="f-icon0"> </span>
                            </div>
                            <div class="col-md-10 features-info">
                                <h4>Ferramentas</h4>
                                <p>Diversas ferramentas existem em nosso aplicativo. Vem com suporte completo aos nossos usuários, e possui uma interface bonita e agradável.</p>
                            </div>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="features-grid-info">
                            <div class="col-md-2 features-icon">
                                <span class="f-icon1"> </span>
                            </div>
                            <div class="col-md-10 features-info">
                                <h4>Atendimento Rápido</h4>
                                <p>Com nossos serviços 24h, temos velocidade no atendimento, e o cliente não perde tempo esperando no central de mototáxi.</p>
                            </div>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="features-grid-info">
                                <!--<div class="col-md-2 features-icon">-->
                                <!--<span class="f-icon2"> </span>-->
                                <!--</div>-->
                                <!--<div class="col-md-10 features-info">-->
                                <!--<h4>Audio Play</h4>-->
                                <!--<p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium.</p>-->
                                <!--</div>-->
                                <!--<div class="clearfix"> </div>-->
                        </div>

                    </div> <!---end-features-grid---->
                    <div class="col-md-4 features-grid">
                        <div class="big-divice">
                            <img src="/assets/images/divice.png" title="features-demo" />
                        </div>
                    </div> <!---end-features-grid---->
                    <div class="col-md-4 features-grid">
                        <div class="features-grid-info">
                            <div class="col-md-2 features-icon1">
                                <span class="f-icon3"> </span>
                            </div>
                            <div class="col-md-10 features-info">
                                <h4>Veja o Perfil</h4>
                                <p>Observe o perfil de cada mototaxista e escolha o que melhor lhe agradar, e assim conte com o serviço de salvar favorito.</p>
                            </div>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="features-grid-info">
                            <div class="col-md-2 features-icon1">
                                <span class="f-icon4"> </span>
                            </div>
                            <div class="col-md-10 features-info">
                                <h4>Mensagens Instantaneas</h4>
                                <p>Possuimos serviços de chamadas e submissão de curtas mensagens para contato cliente-mototaxista.</p>
                            </div>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="features-grid-info">
                                <!--<div class="col-md-2 features-icon1">-->
                                <!--<span class="f-icon8"> </span>-->
                                <!--</div>-->
                                <!--<div class="col-md-10 features-info">-->
                                <!--<h4></h4>-->
                                <!--<p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium.</p>-->
                                <!--</div>-->
                                <!--<div class="clearfix"> </div>-->
                        </div>

                    </div> <!---end-features-grid---->
                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>
            <!----//features-grids----->
            <!----//features----->
            <!----screen-shot-gallery---->
        <div id="gallery" class="screen-shot-gallery">
            <div class="container">
                <div class="section-head text-center">
                    <h3><span class="frist"> </span>GALERIA DE FOTOS<span class="second"> </span></h3>
                    <p>Abaixo veja imagens de nosso aplicativo rodando em um dispositivo mobile ANDROID.</p>
                </div>
            </div>
                <!----sreen-gallery-cursual---->
            <div class="sreen-gallery-cursual">
                    <!-- requried-jsfiles-for owl -->
                <link href="/assets/css/owl.carousel.css" rel="stylesheet">
                <script src="/assets/js/owl.carousel.js"></script>
                <script>
                $ ( document ).ready ( function ( ) """),format.raw/*267.53*/("""{"""),format.raw/*267.54*/("""
                """),format.raw/*268.17*/("""$ ( "#owl-demo" ).owlCarousel ( """),format.raw/*268.49*/("""{"""),format.raw/*268.50*/("""
                """),format.raw/*269.17*/("""items : 3,
                lazyLoad : true,
                autoPlay : true
                """),format.raw/*272.17*/("""}"""),format.raw/*272.18*/(""" """),format.raw/*272.19*/(""") ;
                """),format.raw/*273.17*/("""}"""),format.raw/*273.18*/(""" """),format.raw/*273.19*/(""") ;
                </script>
                    <!-- //requried-jsfiles-for owl -->
                    <!-- start content_slider -->
                <div class="container">
                    <div id="owl-demo" class="owl-carousel">
                        <div class="item">
                            <img class="lazyOwl" data-src="/assets/images/t5.png" alt="screen-name">
                        </div>
                        <div class="item">
                            <img class="lazyOwl" data-src="/assets/images/t4.png" alt="screen-name">
                        </div>
                        <div class="item">
                            <img class="lazyOwl" data-src="/assets/images/t3.png" alt="screen-name">
                        </div>
                        <div class="item">
                            <img class="lazyOwl" data-src="/assets/images/t2.png" alt="screen-name">
                        </div>
                        <div class="item">
                            <img class="lazyOwl" data-src="/assets/images/t1.png" alt="screen-name">
                        </div>
                        <div class="item">
                            <img class="lazyOwl" data-src="/assets/images/t7.png" alt="screen-name">
                        </div>
                        <div class="item">
                            <img class="lazyOwl" data-src="/assets/images/t8.png" alt="screen-name">
                        </div>
                    </div>
                </div>
                    <!--//sreen-gallery-cursual---->
            </div>
        </div>
            <!--//screen-shot-gallery---->
            <!---- show-reel ---->
            <!---pop-up-box---->
        <link href="/assets/css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
        <script src="/assets/js/jquery.magnific-popup.js" type="text/javascript"></script>
            <!---//pop-up-box---->
        <div class="show-reel text-center">
            <div class="container">
                <h5>VIDEO <a class="popup-with-zoom-anim" href="#small-dialog"><span> </span></a> PROMO</h5>
                <div id="small-dialog" class="mfp-hide">
                    <iframe width="600" height="480" src="https://www.youtube.com/embed/gXeJ5BS4iDM" frameborder="0" allowfullscreen></iframe>
                </div>
                <script>
                $ ( document ).ready ( function ( ) """),format.raw/*318.53*/("""{"""),format.raw/*318.54*/("""
                """),format.raw/*319.17*/("""$ ( '.popup-with-zoom-anim' ).magnificPopup ( """),format.raw/*319.63*/("""{"""),format.raw/*319.64*/("""
                """),format.raw/*320.17*/("""type : 'inline',
                fixedContentPos : false,
                fixedBgPos : true,
                overflowY : 'auto',
                closeBtnInside : true,
                preloader : false,
                midClick : true,
                removalDelay : 300,
                mainClass : 'my-mfp-zoom-in'
                """),format.raw/*329.17*/("""}"""),format.raw/*329.18*/(""" """),format.raw/*329.19*/(""") ;

                """),format.raw/*331.17*/("""}"""),format.raw/*331.18*/(""" """),format.raw/*331.19*/(""") ;
                </script>
            </div>
        </div>
            <!---- //show-reel ---->
            <!-----getintouch----->
        <div id="contact" class="getintouch">
            <div class="container">
                <div class="section-head text-center">
                    <h3><span class="frist"> </span>CONTATO<span class="second"> </span></h3>
                    <p>Utilize o formulário abaixo para contatar-nos.</p>
                </div>
                    <!---->
                <div class="col-md-9 getintouch-left">
                    <div class="contact-form col-md-10">
                        <h3>Diga olá!</h3>
                        <form method="post">
                            <input type="text" placeholder="Nome" id="nome" name="nome" required />
                            <input type="text" placeholder="Email" id="email" name="email" required />
                            <textarea id="mensagem" name="mensagem" placeholder="Digite aqui sua mensagem ..."> </textarea>
                            <input type="submit" onclick="postFormToGoogle ( ) ;" value="Enviar Recado" />
                        </form>
                    </div>
                        <!--<ul class="footer-social-icons col-md-2 text-center">-->
                        <!--<li><a class="f-be" href="#"><span> </span></a></li>-->
                        <!--<li><a class="f-tw" href="#"><span> </span></a></li>-->
                        <!--<li><a class="f-db" href="#"><span> </span></a></li>-->
                        <!--<li><a class="f-ti" href="#"><span> </span></a></li>-->
                        <!--<li><a class="f-go" href="#"><span> </span></a></li>-->
                        <!--<div class="clearfix"> </div>-->
                        <!--</ul>-->
                </div>
                <div class="col-md-2 getintouch-left">
                    <div class="footer-divice">
                        <img src="/assets/images/divice-half.png" title="getintouch" />
                    </div>
                </div>
            </div>
        </div>
            <!---//getintouch----->
            <!-----footer----->
        <div class="footer">
            <div class="container">
                <div class="footer-grids">
                    <div class="col-md-12 footer-grid about-info">
                        <center><a href="#"><img src="/assets/images/logo2.png" title="Umbrella" /></a></center>
                            <!--<p>eusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>-->
                    </div>
                        <!--<div class="col-md-3 footer-grid subscribe">-->
                        <!--&lt;!&ndash;<h3>Inscreva-se </h3>&ndash;&gt;-->
                        <!--&lt;!&ndash;<form>&ndash;&gt;-->
                        <!--&lt;!&ndash;<input type="text" placeholder="" required />&ndash;&gt;-->
                        <!--&lt;!&ndash;<input type="submit" value="" />&ndash;&gt;-->
                        <!--&lt;!&ndash;</form>&ndash;&gt;-->
                        <!--&lt;!&ndash;<p>eusmod tempor incididunt ut labore et dolore magna aliqua. </p>&ndash;&gt;-->
                        <!--</div>-->
                        <!--<div class="col-md-3 footer-grid explore">-->
                        <!--&lt;!&ndash;<h3>Explore</h3>&ndash;&gt;-->
                        <!--&lt;!&ndash;<ul class="col-md-6">&ndash;&gt;-->
                        <!--&lt;!&ndash;<li><a href="#">Envato</a></li>&ndash;&gt;-->
                        <!--&lt;!&ndash;<li><a href="#">Themecurve</a></li>&ndash;&gt;-->
                        <!--&lt;!&ndash;<li><a href="#">Kreativeshowcase</a></li>&ndash;&gt;-->
                        <!--&lt;!&ndash;<li><a href="#">Freebiescurve</a></li>&ndash;&gt;-->
                        <!--&lt;!&ndash;</ul>&ndash;&gt;-->
                        <!--&lt;!&ndash;<ul class="col-md-6">&ndash;&gt;-->
                        <!--&lt;!&ndash;<li><a href="#">Themeforest</a></li>&ndash;&gt;-->
                        <!--&lt;!&ndash;<li><a href="#">Microsoft</a></li>&ndash;&gt;-->
                        <!--&lt;!&ndash;<li><a href="#">Google</a></li>&ndash;&gt;-->
                        <!--&lt;!&ndash;<li><a href="#">Yahoo</a></li>&ndash;&gt;-->
                        <!--&lt;!&ndash;</ul>&ndash;&gt;-->
                        <!--&lt;!&ndash;<div class="clearfix"> </div>&ndash;&gt;-->
                        <!--</div>-->
                        <!--<div class="col-md-3 footer-grid copy-right">-->
                        <!--<p>&copy; CONNECT 2015. Click Mototaxi</p>-->
                        <!--</div>-->
                    <div class="clearfix"> </div>
                    <script type="text/javascript">
                    $ ( document ).ready ( function ( ) """),format.raw/*408.57*/("""{"""),format.raw/*408.58*/("""
                    """),format.raw/*409.21*/("""/*
                    var defaults = """),format.raw/*410.36*/("""{"""),format.raw/*410.37*/("""
                          """),format.raw/*411.27*/("""containerID: 'toTop', // fading element id
                        containerHoverID: 'toTopHover', // fading element hover id
                        scrollSpeed: 1200,
                        easingType: 'linear'
                     """),format.raw/*415.22*/("""}"""),format.raw/*415.23*/(""";
                    */

                    $ ( ).UItoTop ( """),format.raw/*418.37*/("""{"""),format.raw/*418.38*/(""" """),format.raw/*418.39*/("""easingType : 'easeOutQuart' """),format.raw/*418.67*/("""}"""),format.raw/*418.68*/(""" """),format.raw/*418.69*/(""") ;

                    """),format.raw/*420.21*/("""}"""),format.raw/*420.22*/(""" """),format.raw/*420.23*/(""") ;
                    </script>

                    <script src="/assets/js/click.js"></script>
                    <a href="#" id="toTop" style="display : block ;"> <span id="toTopHover" style="opacity : 1 ;"> </span></a>
                </div>
            </div>
        </div>
    </body>
    """),format.raw/*429.5*/("""}"""),format.raw/*429.6*/("""
"""),format.raw/*430.1*/("""</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Oct 19 19:57:56 BRST 2015
                  SOURCE: C:/Users/Caio/Downloads/salaorocha/app/views/index.scala.html
                  HASH: 9bf537bf32d212ed9fbd83406b0aec144e74739a
                  MATRIX: 798->0|1273->447|1302->448|1339->458|1390->481|1419->482|1456->492|1859->867|1888->868|1925->878|1975->901|2004->902|2041->912|2074->917|2103->918|2140->928|2191->952|2220->953|2257->963|2286->964|2323->974|2375->998|2404->999|2441->1009|2530->1070|2559->1071|2596->1081|2646->1104|2675->1105|2704->1106|2737->1111|2766->1112|2803->1122|2854->1146|2883->1147|2920->1157|2949->1158|2988->1170|3055->1209|3084->1210|3121->1220|3221->1293|3250->1294|3287->1304|3316->1305|3345->1306|3692->1625|3721->1626|3758->1636|3829->1679|3858->1680|3895->1690|3987->1754|4016->1755|4045->1756|4116->1799|4145->1800|4192->1820|4221->1821|4250->1822|4290->1835|4319->1836|4348->1837|4729->2190|4758->2191|4787->2192|4847->2223|4877->2224|4942->2260|4972->2261|5002->2262|5058->2289|5088->2290|5118->2291|5326->2471|5355->2472|5392->2482|5569->2631|5598->2632|5635->2642|5726->2706|5755->2707|5784->2708|5860->2756|5889->2757|5926->2767|6036->2849|6065->2850|6102->2860|6168->2899|6197->2900|6234->2910|6263->2911|6292->2912|6332->2925|6361->2926|6390->2927|8189->4697|8219->4698|8280->4730|8310->4731|8353->4745|8446->4809|8476->4810|8519->4824|8712->4988|8742->4989|8785->5003|8887->5076|8917->5077|8982->5113|9012->5114|9055->5128|9156->5200|9186->5201|9229->5215|9259->5216|9289->5217|9337->5236|9367->5237|9397->5238|11303->7138|11346->7181|11393->7260|11436->7284|11483->7325|11530->7343|17691->13475|17721->13476|17768->13494|17829->13526|17859->13527|17906->13545|18030->13640|18060->13641|18090->13642|18140->13663|18170->13664|18200->13665|20693->16129|20723->16130|20770->16148|20845->16194|20875->16195|20922->16213|21293->16555|21323->16556|21353->16557|21405->16580|21435->16581|21465->16582|26473->21561|26503->21562|26554->21584|26622->21623|26652->21624|26709->21652|26977->21891|27007->21892|27101->21957|27131->21958|27161->21959|27218->21987|27248->21988|27278->21989|27334->22016|27364->22017|27394->22018|27730->22326|27759->22327|27789->22329
                  LINES: 29->1|38->10|38->10|39->11|39->11|39->11|40->12|47->19|47->19|48->20|49->21|49->21|50->22|50->22|50->22|51->23|52->24|52->24|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|57->29|57->29|57->29|57->29|57->29|58->30|59->31|59->31|60->32|60->32|62->34|62->34|62->34|63->35|64->36|64->36|65->37|65->37|65->37|71->43|71->43|72->44|72->44|72->44|73->45|74->46|74->46|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|82->54|82->54|82->54|82->54|82->54|82->54|82->54|82->54|82->54|82->54|82->54|85->57|85->57|86->58|89->61|89->61|90->62|92->64|92->64|92->64|93->65|93->65|94->66|95->67|95->67|96->68|97->69|97->69|98->70|98->70|98->70|99->71|99->71|99->71|134->106|134->106|135->107|135->107|136->108|137->109|137->109|138->110|143->115|143->115|144->116|145->117|145->117|146->118|146->118|147->119|148->120|148->120|149->121|149->121|149->121|151->123|151->123|151->123|187->159|188->160|189->161|190->162|191->163|192->164|295->267|295->267|296->268|296->268|296->268|297->269|300->272|300->272|300->272|301->273|301->273|301->273|346->318|346->318|347->319|347->319|347->319|348->320|357->329|357->329|357->329|359->331|359->331|359->331|436->408|436->408|437->409|438->410|438->410|439->411|443->415|443->415|446->418|446->418|446->418|446->418|446->418|446->418|448->420|448->420|448->420|457->429|457->429|458->430
                  -- GENERATED --
              */
          