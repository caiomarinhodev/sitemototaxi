
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
object index_mobile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE HTML>
<html>
<head>
    <title>Click Mototaxi</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords"
          content="The free Umbrella Iphone web template, Andriod web template, Smartphone web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="shortcut icon" href="/assets/images_mobile/fav.png"/>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="/assets/js_mobile/jquery.min.js"></script>
    <!---- start-smoth-scrolling---->
    <script type="text/javascript" src="/assets/js_mobile/move-top.js"></script>
    <script type="text/javascript" src="/assets/js_mobile/easing.js"></script>
    <script type="text/javascript">
        jQuery(document).ready(function ($) """),format.raw/*16.45*/("""{"""),format.raw/*16.46*/("""
            """),format.raw/*17.13*/("""$(".scroll").click(function (event) """),format.raw/*17.49*/("""{"""),format.raw/*17.50*/("""
                """),format.raw/*18.17*/("""event.preventDefault();
                $('html,body').animate("""),format.raw/*19.40*/("""{"""),format.raw/*19.41*/("""scrollTop: $(this.hash).offset().top"""),format.raw/*19.77*/("""}"""),format.raw/*19.78*/(""", 1000);
            """),format.raw/*20.13*/("""}"""),format.raw/*20.14*/(""");
        """),format.raw/*21.9*/("""}"""),format.raw/*21.10*/(""");
    </script>
    <!-- Custom Theme files -->
    <link href="/assets/css_mobile/style.css" rel='stylesheet' type='text/css'/>
    <!-- Custom Theme files -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="application/x-javascript"> addEventListener("load", function () """),format.raw/*27.83*/("""{"""),format.raw/*27.84*/("""
        """),format.raw/*28.9*/("""setTimeout(hideURLbar, 0);
    """),format.raw/*29.5*/("""}"""),format.raw/*29.6*/(""", false);
    function hideURLbar() """),format.raw/*30.27*/("""{"""),format.raw/*30.28*/("""
        """),format.raw/*31.9*/("""window.scrollTo(0, 1);
    """),format.raw/*32.5*/("""}"""),format.raw/*32.6*/(""" """),format.raw/*32.7*/("""</script>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,800,700' rel='stylesheet' type='text/css'/>
    <script>
        $(function () """),format.raw/*35.23*/("""{"""),format.raw/*35.24*/("""
            """),format.raw/*36.13*/("""var pull = $('#pull');
            menu = $('nav ul');
            menuHeight = menu.height();
            $(pull).on('click', function (e) """),format.raw/*39.46*/("""{"""),format.raw/*39.47*/("""
                """),format.raw/*40.17*/("""e.preventDefault();
                menu.slideToggle();
            """),format.raw/*42.13*/("""}"""),format.raw/*42.14*/(""");
            $(window).resize(function () """),format.raw/*43.42*/("""{"""),format.raw/*43.43*/("""
                """),format.raw/*44.17*/("""var w = $(window).width();
                if (w > 320 && menu.is(':hidden')) """),format.raw/*45.52*/("""{"""),format.raw/*45.53*/("""
                    """),format.raw/*46.21*/("""menu.removeAttr('style');
                """),format.raw/*47.17*/("""}"""),format.raw/*47.18*/("""
            """),format.raw/*48.13*/("""}"""),format.raw/*48.14*/(""");
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/(""");
    </script>
    <script src="/assets/js_mobile/click.js"></script>
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
                    <a href="#"><img src="/assets/images_mobile/logo2.png" title="logo"/></a>
                </div>
                <!----start-top-nav---->
                <nav class="top-nav">
                    <ul class="top-nav">
                        <li class="active"><a href="#home" class="scroll">Home </a></li>
                        <li class="page-scroll"><a href="#fea" class="scroll">App</a></li>
                        <li class="page-scroll"><a href="#gallery" class="scroll">Galeria</a></li>
                        <li class="contatct-active" class="page-scroll"><a href="#contact" class="scroll">Contato</a>
                        </li>
                    </ul>
                    <a href="#" id="pull"><img src="/assets/images_mobile/nav-icon.png" title="menu"/></a>
                </nav>
                <div class="clear"></div>
            </div>
        </div>
    </div>
    <!----- //End-header---->
    <!----- start-slider---->
    <!----start-slider-script---->
    <script src="/assets/js_mobile/responsiveslides.min.js"></script>
    <script>
        // You can also use "$(window).load(function() """),format.raw/*84.56*/("""{"""),format.raw/*84.57*/(""""
        $(function () """),format.raw/*85.23*/("""{"""),format.raw/*85.24*/("""
            """),format.raw/*86.13*/("""// Slideshow 4
            $("#slider4").responsiveSlides("""),format.raw/*87.44*/("""{"""),format.raw/*87.45*/("""
                """),format.raw/*88.17*/("""auto: true,
                pager: true,
                nav: true,
                speed: 500,
                namespace: "callbacks",
                before: function () """),format.raw/*93.37*/("""{"""),format.raw/*93.38*/("""
                    """),format.raw/*94.21*/("""$('.events').append("<li>before event fired.</li>");
                """),format.raw/*95.17*/("""}"""),format.raw/*95.18*/(""",
                after: function () """),format.raw/*96.36*/("""{"""),format.raw/*96.37*/("""
                    """),format.raw/*97.21*/("""$('.events').append("<li>after event fired.</li>");
                """),format.raw/*98.17*/("""}"""),format.raw/*98.18*/("""
            """),format.raw/*99.13*/("""}"""),format.raw/*99.14*/(""");

        """),format.raw/*101.9*/("""}"""),format.raw/*101.10*/(""");
    </script>
    <!----//End-slider-script---->
    <!-- Slideshow 4 -->
    <div id="top" class="callbacks_container">
        <ul class="rslides" id="slider4">
            <li>
                <img src="/assets/images_mobile/slide.jpg" alt="">

                <div class="caption text-center">
                    <div>
                        <center style="color: #0b0b0b;">

                            <h2>O aplicativo que chama o mototaxista</h2>

                            <h2> mais perto de você.</h2>

                            <div class="clearfix"></div>
                            <div class="big-btns">
                                <center>
                                    <a class="download"
                                       href="https://play.google.com/store/apps/details?id=com.taxicg.clickmototaxi"><label> </label>Download</a>
                                </center>
                            </div>
                        </center>
                    </div>
                </div>
            </li>
        </ul>
    </div>
    <div class="clear"></div>
    <!-----divice----->
    <!--<div class="divice-demo">-->
    <!--<img src="images_mobile/divice-in-hand.png" title="demo" />-->
    <!--</div>-->
    <!---//divice----->
    <!----- //End-slider---->
</div>
<!-----//header-section----->
<!----features----->
<div id="fea" class="features">
    <div class="container">
        <div class="section-head text-center">
            <h3><span class="frist"> </span>SOBRE O APP<span class="second"> </span></h3>

            <p>Ligar no radio mototáxi é coisa do passado: para pedir um mototáxi online basta clicar em 'Chamar Moto'. Veja
                sua localização e mototáxis nos arredores e não espere mais num ponto de mototáxi.</p>
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

                        <p>Diversas ferramentas existem em nosso aplicativo. Vem com suporte completo aos nossos
                            usuários, e possui uma interface bonita e agradável.</p>
                    </div>
                    <div class="clear"></div>
                </div>
                <div class="features-grid-info">
                    <div class="col-md-2 features-icon">
                        <span class="f-icon1"> </span>
                    </div>
                    <div class="col-md-10 features-info">
                        <h4>Atendimento Rápido</h4>

                        <p>Com nossos serviços 24h, temos velocidade no atendimento, e o cliente não perde tempo
                            esperando no central de mototaxi.</p>
                    </div>
                    <div class="clear"></div>
                </div>
                <!--<div class="features-grid-info">-->
                <!--<div class="col-md-2 features-icon">-->
                <!--<span class="f-icon2"> </span>-->
                <!--</div>-->
                <!--<div class="col-md-10 features-info">-->
                <!--<h4>Accusan timar</h4>-->
                <!--<p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium.</p>-->
                <!--</div>-->
                <!--<div class="clear"> </div>-->
                <!--</div>-->

            </div>
            <!---end-features-grid---->
            <div class="col-md-4 features-grid">
                <div class="big-divice">
                    <img src="/assets/images_mobile/divice.png" title="features-demo"/>
                </div>
            </div>
            <!---end-features-grid---->
            <div class="col-md-4 features-grid">
                <div class="features-grid-info">
                    <div class="col-md-2 features-icon1">
                        <span class="f-icon3"> </span>
                    </div>
                    <div class="col-md-10 features-info">
                        <h4>Veja o Perfil</h4>

                        <p>Observe o perfil de cada mototaxista e escolha o que melhor lhe agradar, e assim conte com o
                            serviço de salvar favorito.</p>
                    </div>
                    <div class="clear"></div>
                </div>
                <div class="features-grid-info">
                    <div class="col-md-2 features-icon1">
                        <span class="f-icon4"> </span>
                    </div>
                    <div class="col-md-10 features-info">
                        <h4>Mensagens Instantaneas</h4>

                        <p>Possuimos serviços de chamadas e submissão de curtas mensagens para contato
                            cliente-mototaxista.</p>
                    </div>
                    <div class="clear"></div>
                </div>
                <!--<div class="features-grid-info">-->
                <!--<div class="col-md-2 features-icon1">-->
                <!--<span class="f-icon5"> </span>-->
                <!--</div>-->
                <!--<div class="col-md-10 features-info">-->
                <!--<h4>Accusan timar</h4>-->
                <!--<p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium.</p>-->
                <!--</div>-->
                <!--<div class="clear"> </div>-->
                <!--</div>-->

            </div>
            <!---end-features-grid---->
            <div class="clear"></div>
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
            <link href="/assets/css_mobile/owl.carousel.css" rel="stylesheet">
            <script src="/assets/js_mobile/owl.carousel.js"></script>
            <script>
                $(document).ready(function () """),format.raw/*253.47*/("""{"""),format.raw/*253.48*/("""
                    """),format.raw/*254.21*/("""$("#owl-demo").owlCarousel("""),format.raw/*254.48*/("""{"""),format.raw/*254.49*/("""
                        """),format.raw/*255.25*/("""items: 3,
                        lazyLoad: true,
                        autoPlay: true
                    """),format.raw/*258.21*/("""}"""),format.raw/*258.22*/(""");
                """),format.raw/*259.17*/("""}"""),format.raw/*259.18*/(""");
            </script>
            <!-- //requried-jsfiles-for owl -->
            <!-- start content_slider -->
            <div class="container">
                <div id="owl-demo" class="owl-carousel">
                    <div class="item">
                        <img class="lazyOwl" data-src="/assets/images_mobile/t5.png" alt="screen-name">
                    </div>
                    <div class="item">
                        <img class="lazyOwl" data-src="/assets/images_mobile/t4.png" alt="screen-name">
                    </div>
                    <div class="item">
                        <img class="lazyOwl" data-src="/assets/images_mobile/t3.png" alt="screen-name">
                    </div>
                    <div class="item">
                        <img class="lazyOwl" data-src="/assets/images_mobile/t2.png" alt="screen-name">
                    </div>
                    <div class="item">
                        <img class="lazyOwl" data-src="/assets/images_mobile/t1.png" alt="screen-name">
                    </div>
                    <div class="item">
                        <img class="lazyOwl" data-src="/assets/images_mobile/t7.png" alt="screen-name">
                    </div>
                    <div class="item">
                        <img class="lazyOwl" data-src="/assets/images_mobile/t8.png" alt="screen-name">
                    </div>
                </div>
            </div>
            <!--//sreen-gallery-cursual---->
        </div>
    </div>
    <!--//screen-shot-gallery---->
    <!---- show-reel ---->
    <!---pop-up-box---->
    <link href="/assets/css_mobile/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
    <script src="/assets/js_mobile/jquery.magnific-popup.js" type="text/javascript"></script>
    <!---//pop-up-box---->
    <div class="show-reel text-center">
        <div class="container">
            <h5>VIDEO <a class="popup-with-zoom-anim" href="#small-dialog"><span> </span></a> PROMO</h5>

            <div id="small-dialog" class="mfp-hide">
                <iframe width="360" height="320" src="https://www.youtube.com/embed/gXeJ5BS4iDM" frameborder="0"
                        allowfullscreen></iframe>
            </div>
            <script>
                $(document).ready(function () """),format.raw/*306.47*/("""{"""),format.raw/*306.48*/("""
                    """),format.raw/*307.21*/("""$('.popup-with-zoom-anim').magnificPopup("""),format.raw/*307.62*/("""{"""),format.raw/*307.63*/("""
                        """),format.raw/*308.25*/("""type: 'inline',
                        fixedContentPos: false,
                        fixedBgPos: true,
                        overflowY: 'auto',
                        closeBtnInside: true,
                        preloader: false,
                        midClick: true,
                        removalDelay: 300,
                        mainClass: 'my-mfp-zoom-in'
                    """),format.raw/*317.21*/("""}"""),format.raw/*317.22*/(""");

                """),format.raw/*319.17*/("""}"""),format.raw/*319.18*/(""");
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
                    <h3>Diga Olá!</h3>

                    <form method="post">
                        <input type="text" placeholder="Nome" id="nome" name="nome" required />
                        <input type="text"  placeholder="Email" id="email" name="email" required />
                        <textarea id="mensagem" name="mensagem" placeholder="Digite aqui sua mensagem ..."> </textarea>
                        <input type="submit" onclick="postFormToGoogle();" value="Enviar Recado" />
                    </form>
                </div>
                <!--<ul class="footer-social-icons col-md-2 text-center">-->
                    <!--<li><a class="f-be" href="#"><span> </span></a></li>-->
                    <!--<li><a class="f-tw" href="#"><span> </span></a></li>-->
                    <!--<li><a class="f-db" href="#"><span> </span></a></li>-->
                    <!--<li><a class="f-ti" href="#"><span> </span></a></li>-->
                    <!--<li><a class="f-go" href="#"><span> </span></a></li>-->
                    <!--<div class="clear"></div>-->
                <!--</ul>-->
            </div>
            <div class="col-md-2 getintouch-left">
                <div class="footer-divice">
                    <img src="/assets/images_mobile/divice-half.png" title="getintouch"/>
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
                    <center><a href="#"><img src="/assets/images_mobile/logo2.png" title="Umbrella" /></a></center>
                    <!--<p>eusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>-->
                </div>
                <div class="clear"></div>
                <script type="text/javascript">
                    $(document).ready(function () """),format.raw/*370.51*/("""{"""),format.raw/*370.52*/("""
                        """),format.raw/*371.25*/("""/*
                         var defaults = """),format.raw/*372.41*/("""{"""),format.raw/*372.42*/("""
                         """),format.raw/*373.26*/("""containerID: 'toTop', // fading element id
                         containerHoverID: 'toTopHover', // fading element hover id
                         scrollSpeed: 1200,
                         easingType: 'linear'
                         """),format.raw/*377.26*/("""}"""),format.raw/*377.27*/(""";
                         */

                        $().UItoTop("""),format.raw/*380.37*/("""{"""),format.raw/*380.38*/("""easingType: 'easeOutQuart'"""),format.raw/*380.64*/("""}"""),format.raw/*380.65*/(""");

                    """),format.raw/*382.21*/("""}"""),format.raw/*382.22*/(""");
                </script>
                <a href="#" id="toTop" style="display: block;"> <span id="toTopHover"
                                                                      style="opacity: 1;"> </span></a>
            </div>
            """),format.raw/*387.13*/("""}"""),format.raw/*387.14*/("""
        """),format.raw/*388.9*/("""</div>
    </div>
    <!---//footer----->

</body>
</html>

"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Oct 19 19:57:56 BRST 2015
                  SOURCE: C:/Users/Caio/Downloads/salaorocha/app/views/index_mobile.scala.html
                  HASH: aedd2de469fa9ee00e86d4a2fe6e8b1ceb2dc378
                  MATRIX: 805->0|1743->910|1772->911|1813->924|1877->960|1906->961|1951->978|2042->1041|2071->1042|2135->1078|2164->1079|2213->1100|2242->1101|2280->1112|2309->1113|2654->1430|2683->1431|2719->1440|2777->1471|2805->1472|2869->1508|2898->1509|2934->1518|2988->1545|3016->1546|3044->1547|3238->1713|3267->1714|3308->1727|3476->1867|3505->1868|3550->1885|3646->1953|3675->1954|3747->1998|3776->1999|3821->2016|3927->2094|3956->2095|4005->2116|4075->2158|4104->2159|4145->2172|4174->2173|4212->2184|4241->2185|5752->3668|5781->3669|5833->3693|5862->3694|5903->3707|5989->3765|6018->3766|6063->3783|6263->3955|6292->3956|6341->3977|6438->4046|6467->4047|6532->4084|6561->4085|6610->4106|6706->4174|6735->4175|6776->4188|6805->4189|6845->4201|6875->4202|13518->10816|13548->10817|13598->10838|13654->10865|13684->10866|13738->10891|13876->11000|13906->11001|13954->11020|13984->11021|16309->13317|16339->13318|16389->13339|16459->13380|16489->13381|16543->13406|16964->13798|16994->13799|17043->13819|17073->13820|19708->16426|19738->16427|19792->16452|19864->16495|19894->16496|19949->16522|20220->16764|20250->16765|20346->16832|20376->16833|20431->16859|20461->16860|20514->16884|20544->16885|20822->17134|20852->17135|20889->17144
                  LINES: 29->1|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|47->19|48->20|48->20|49->21|49->21|55->27|55->27|56->28|57->29|57->29|58->30|58->30|59->31|60->32|60->32|60->32|63->35|63->35|64->36|67->39|67->39|68->40|70->42|70->42|71->43|71->43|72->44|73->45|73->45|74->46|75->47|75->47|76->48|76->48|77->49|77->49|112->84|112->84|113->85|113->85|114->86|115->87|115->87|116->88|121->93|121->93|122->94|123->95|123->95|124->96|124->96|125->97|126->98|126->98|127->99|127->99|129->101|129->101|281->253|281->253|282->254|282->254|282->254|283->255|286->258|286->258|287->259|287->259|334->306|334->306|335->307|335->307|335->307|336->308|345->317|345->317|347->319|347->319|398->370|398->370|399->371|400->372|400->372|401->373|405->377|405->377|408->380|408->380|408->380|408->380|410->382|410->382|415->387|415->387|416->388
                  -- GENERATED --
              */
          