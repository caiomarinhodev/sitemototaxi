
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
            <!---- start-smoth-scrolling---->
        <script type="text/javascript" src="/assets/js/move-top.js"></script>
        <script type="text/javascript" src="/assets/js/easing.js"></script>
        <script type="text/javascript">
        jQuery ( document ).ready ( function ( $ ) """),format.raw/*13.52*/("""{"""),format.raw/*13.53*/("""
        """),format.raw/*14.9*/("""$ ( ".scroll" ).click ( function ( event ) """),format.raw/*14.52*/("""{"""),format.raw/*14.53*/("""
        """),format.raw/*15.9*/("""event.preventDefault ( ) ;
        $ ( 'html,body' ).animate ( """),format.raw/*16.37*/("""{"""),format.raw/*16.38*/(""" """),format.raw/*16.39*/("""scrollTop : $ ( this.hash ).offset ( ).top """),format.raw/*16.82*/("""}"""),format.raw/*16.83*/(""", 1000 ) ;
        """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/(""" """),format.raw/*17.11*/(""") ;
        """),format.raw/*18.9*/("""}"""),format.raw/*18.10*/(""" """),format.raw/*18.11*/(""") ;
        </script>
            <!-- Custom Theme files -->
        <link href="/assets/css/style.css" rel='stylesheet' type='text/css' />
            <!-- Custom Theme files -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script type="application/x-javascript"> addEventListener ( "load", function ( ) """),format.raw/*24.90*/("""{"""),format.raw/*24.91*/(""" """),format.raw/*24.92*/("""setTimeout ( hideURLbar, 0 ) ; """),format.raw/*24.123*/("""}"""),format.raw/*24.124*/(""", false ) ; function hideURLbar ( ) """),format.raw/*24.160*/("""{"""),format.raw/*24.161*/(""" """),format.raw/*24.162*/("""window.scrollTo ( 0, 1 ) ; """),format.raw/*24.189*/("""}"""),format.raw/*24.190*/(""" """),format.raw/*24.191*/("""</script>
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,800,700' rel='stylesheet' type='text/css'/>
        <script>
        $ ( function ( ) """),format.raw/*27.26*/("""{"""),format.raw/*27.27*/("""
        """),format.raw/*28.9*/("""var pull = $ ( '#pull' ) ;
        menu = $ ( 'nav ul' ) ;
        menuHeight = menu.height ( ) ;
        $ ( pull ).on ( 'click', function ( e ) """),format.raw/*31.49*/("""{"""),format.raw/*31.50*/("""
        """),format.raw/*32.9*/("""e.preventDefault ( ) ;
        menu.slideToggle ( ) ;
        """),format.raw/*34.9*/("""}"""),format.raw/*34.10*/(""" """),format.raw/*34.11*/(""") ;
        $ ( window ).resize ( function ( ) """),format.raw/*35.44*/("""{"""),format.raw/*35.45*/("""
        """),format.raw/*36.9*/("""var w = $ ( window ).width ( ) ;
        if ( w > 320 && menu.is ( ':hidden' ) ) """),format.raw/*37.49*/("""{"""),format.raw/*37.50*/("""
        """),format.raw/*38.9*/("""menu.removeAttr ( 'style' ) ;
        """),format.raw/*39.9*/("""}"""),format.raw/*39.10*/("""
        """),format.raw/*40.9*/("""}"""),format.raw/*40.10*/(""" """),format.raw/*40.11*/(""") ;
        """),format.raw/*41.9*/("""}"""),format.raw/*41.10*/(""" """),format.raw/*41.11*/(""") ;
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
                                    Contato</a></li>
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
            // You can also use "$(window).load(function() """),format.raw/*75.60*/("""{"""),format.raw/*75.61*/(""""
            $ ( function ( ) """),format.raw/*76.30*/("""{"""),format.raw/*76.31*/("""
            """),format.raw/*77.13*/("""// Slideshow 4
            $ ( "#slider4" ).responsiveSlides ( """),format.raw/*78.49*/("""{"""),format.raw/*78.50*/("""
            """),format.raw/*79.13*/("""auto : true,
            pager : true,
            nav : true,
            speed : 500,
            namespace : "callbacks",
            before : function ( ) """),format.raw/*84.35*/("""{"""),format.raw/*84.36*/("""
            """),format.raw/*85.13*/("""$ ( '.events' ).append ( "<li>before event fired.</li>" ) ;
            """),format.raw/*86.13*/("""}"""),format.raw/*86.14*/(""",
            after : function ( ) """),format.raw/*87.34*/("""{"""),format.raw/*87.35*/("""
            """),format.raw/*88.13*/("""$ ( '.events' ).append ( "<li>after event fired.</li>" ) ;
            """),format.raw/*89.13*/("""}"""),format.raw/*89.14*/("""
            """),format.raw/*90.13*/("""}"""),format.raw/*90.14*/(""" """),format.raw/*90.15*/(""") ;

            """),format.raw/*92.13*/("""}"""),format.raw/*92.14*/(""" """),format.raw/*92.15*/(""") ;
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
                                <h2>O aplicativo que chama o mototaxista</h2><h2> mais perto de você.</h2>
                                <br/>
                                <h2>Ligar no radio taxi é coisa do passado.</h2>
                                <h2>Veja os mototáxis nos arredores</h2>
                                <h2>e não espere mais num ponto de mototáxi.</h2>
                                <br/>
                                <div class="clearfix"> </div>
                                <div class="big-btns">
                                    <center>
                                        <a class="download" href="https://play.google.com/store/apps/details?id=com.taxicg.clickmototaxi"><label> </label>Download</a>
                                    </center>
                                </div>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
            <div class="clearfix"> </div>
                <!-----divice----->
            <div class="divice-demo">
                <img src="/assets/images/device_hand.png" title="demo" />
            </div>
                <!---//divice----->
                <!----- //End-slider---->
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
                                <p>Com nossos serviços 24h, temos velocidade no atendimento, e o cliente não perde tempo esperando po central de mototaxi.</p>
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

                    </div><!---end-features-grid---->
                    <div class="col-md-4 features-grid">
                        <div class="big-divice">
                            <img src="/assets/images/divice.png" title="features-demo" />
                        </div>
                    </div><!---end-features-grid---->
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

                    </div><!---end-features-grid---->
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
                $ ( document ).ready ( function ( ) """),format.raw/*229.53*/("""{"""),format.raw/*229.54*/("""
                """),format.raw/*230.17*/("""$ ( "#owl-demo" ).owlCarousel ( """),format.raw/*230.49*/("""{"""),format.raw/*230.50*/("""
                """),format.raw/*231.17*/("""items : 3,
                lazyLoad : true,
                autoPlay : true
                """),format.raw/*234.17*/("""}"""),format.raw/*234.18*/(""" """),format.raw/*234.19*/(""") ;
                """),format.raw/*235.17*/("""}"""),format.raw/*235.18*/(""" """),format.raw/*235.19*/(""") ;
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
                <h5>VIDEO  <a class="popup-with-zoom-anim" href="#small-dialog"><span> </span></a> PROMO</h5>
                <div id="small-dialog" class="mfp-hide">
                    <iframe width="600" height="480" src="https://www.youtube.com/embed/gXeJ5BS4iDM" frameborder="0" allowfullscreen></iframe>
                </div>
                <script>
                $ ( document ).ready ( function ( ) """),format.raw/*280.53*/("""{"""),format.raw/*280.54*/("""
                """),format.raw/*281.17*/("""$ ( '.popup-with-zoom-anim' ).magnificPopup ( """),format.raw/*281.63*/("""{"""),format.raw/*281.64*/("""
                """),format.raw/*282.17*/("""type : 'inline',
                fixedContentPos : false,
                fixedBgPos : true,
                overflowY : 'auto',
                closeBtnInside : true,
                preloader : false,
                midClick : true,
                removalDelay : 300,
                mainClass : 'my-mfp-zoom-in'
                """),format.raw/*291.17*/("""}"""),format.raw/*291.18*/(""" """),format.raw/*291.19*/(""") ;

                """),format.raw/*293.17*/("""}"""),format.raw/*293.18*/(""" """),format.raw/*293.19*/(""") ;
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
                    $ ( document ).ready ( function ( ) """),format.raw/*370.57*/("""{"""),format.raw/*370.58*/("""
                    """),format.raw/*371.21*/("""/*
                    var defaults = """),format.raw/*372.36*/("""{"""),format.raw/*372.37*/("""
                          """),format.raw/*373.27*/("""containerID: 'toTop', // fading element id
                        containerHoverID: 'toTopHover', // fading element hover id
                        scrollSpeed: 1200,
                        easingType: 'linear'
                     """),format.raw/*377.22*/("""}"""),format.raw/*377.23*/(""";
                    */

                    $ ( ).UItoTop ( """),format.raw/*380.37*/("""{"""),format.raw/*380.38*/(""" """),format.raw/*380.39*/("""easingType : 'easeOutQuart' """),format.raw/*380.67*/("""}"""),format.raw/*380.68*/(""" """),format.raw/*380.69*/(""") ;

                    """),format.raw/*382.21*/("""}"""),format.raw/*382.22*/(""" """),format.raw/*382.23*/(""") ;
                    </script>
                    <script src="/assets/js/click.js"></script>
                    <a href="#" id="toTop" style="display : block ;"> <span id="toTopHover" style="opacity : 1 ;"> </span></a>
                </div>
            </div>
        </div>
    </body>
    """),format.raw/*390.5*/("""}"""),format.raw/*390.6*/("""
"""),format.raw/*391.1*/("""</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 18 16:43:10 BRST 2015
                  SOURCE: C:/Users/Caio/Downloads/salaorocha/app/views/index.scala.html
                  HASH: 36bc4818f14b28a9a9e8641b783235a8d843fb6b
                  MATRIX: 798->0|1483->657|1512->658|1549->668|1620->711|1649->712|1686->722|1778->786|1807->787|1836->788|1907->831|1936->832|1983->852|2012->853|2041->854|2081->867|2110->868|2139->869|2520->1222|2549->1223|2578->1224|2638->1255|2668->1256|2733->1292|2763->1293|2793->1294|2849->1321|2879->1322|2909->1323|3117->1503|3146->1504|3183->1514|3360->1663|3389->1664|3426->1674|3517->1738|3546->1739|3575->1740|3651->1788|3680->1789|3717->1799|3827->1881|3856->1882|3893->1892|3959->1931|3988->1932|4025->1942|4054->1943|4083->1944|4123->1957|4152->1958|4181->1959|5945->3695|5974->3696|6034->3728|6063->3729|6105->3743|6197->3807|6226->3808|6268->3822|6460->3986|6489->3987|6531->4001|6632->4074|6661->4075|6725->4111|6754->4112|6796->4126|6896->4198|6925->4199|6967->4213|6996->4214|7025->4215|7072->4234|7101->4235|7130->4236|15052->12129|15082->12130|15129->12148|15190->12180|15220->12181|15267->12199|15391->12294|15421->12295|15451->12296|15501->12317|15531->12318|15561->12319|18055->14784|18085->14785|18132->14803|18207->14849|18237->14850|18284->14868|18655->15210|18685->15211|18715->15212|18767->15235|18797->15236|18827->15237|23835->20216|23865->20217|23916->20239|23984->20278|24014->20279|24071->20307|24339->20546|24369->20547|24463->20612|24493->20613|24523->20614|24580->20642|24610->20643|24640->20644|24696->20671|24726->20672|24756->20673|25090->20979|25119->20980|25149->20982
                  LINES: 29->1|41->13|41->13|42->14|42->14|42->14|43->15|44->16|44->16|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|52->24|52->24|52->24|52->24|52->24|52->24|52->24|52->24|52->24|52->24|52->24|55->27|55->27|56->28|59->31|59->31|60->32|62->34|62->34|62->34|63->35|63->35|64->36|65->37|65->37|66->38|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|103->75|103->75|104->76|104->76|105->77|106->78|106->78|107->79|112->84|112->84|113->85|114->86|114->86|115->87|115->87|116->88|117->89|117->89|118->90|118->90|118->90|120->92|120->92|120->92|257->229|257->229|258->230|258->230|258->230|259->231|262->234|262->234|262->234|263->235|263->235|263->235|308->280|308->280|309->281|309->281|309->281|310->282|319->291|319->291|319->291|321->293|321->293|321->293|398->370|398->370|399->371|400->372|400->372|401->373|405->377|405->377|408->380|408->380|408->380|408->380|408->380|408->380|410->382|410->382|410->382|418->390|418->390|419->391
                  -- GENERATED --
              */
          