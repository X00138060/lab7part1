
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
    <head>
        <title>"""),_display_(/*5.17*/title),format.raw/*5.22*/("""</title>
        <link rel="stylesheet" media="screeen" href = """"),_display_(/*6.57*/routes/*6.63*/.Assets.versioned("stylesheets/main.css")),format.raw/*6.104*/("""">
        <link rel="shortcut icon" type = "image/png" href=""""),_display_(/*7.61*/routes/*7.67*/.Assets.versioned("images/favicon.png")),format.raw/*7.106*/("""">
    </head>
        <body>             
              <nav>
                  <ul>
                    <li if(title=="Home")"""),format.raw/*12.42*/("""{"""),format.raw/*12.43*/("""class="active""""),format.raw/*12.57*/("""}"""),format.raw/*12.58*/("""><a href=""""),_display_(/*12.69*/routes/*12.75*/.HomeController.index()),format.raw/*12.98*/("""">Home</a></li>
                    <li if(title=="About")"""),format.raw/*13.43*/("""{"""),format.raw/*13.44*/("""class="active""""),format.raw/*13.58*/("""}"""),format.raw/*13.59*/("""><a href=""""),_display_(/*13.70*/routes/*13.76*/.HomeController.about()),format.raw/*13.99*/("""">About</a></li>
                    <li if(title=="Products")"""),format.raw/*14.46*/("""{"""),format.raw/*14.47*/("""class="active""""),format.raw/*14.61*/("""}"""),format.raw/*14.62*/("""><a href=""""),_display_(/*14.73*/routes/*14.79*/.HomeController.products()),format.raw/*14.105*/("""">Products</a></li>
                  </ul>
              </nav>

              <hr>

              """),_display_(/*20.16*/content),format.raw/*20.23*/("""

              """),format.raw/*22.15*/("""<hr>

              <h4>Copyright &copy 2017</h4>

        </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 10 16:04:02 GMT 2017
                  SOURCE: /home/wdd/webapps/play-java-seed/playLABS2017/app/views/main.scala.html
                  HASH: 47a1f2e548afc79bd5f7dbeb4f281b4c72124038
                  MATRIX: 952->1|1077->31|1105->33|1174->76|1199->81|1290->146|1304->152|1366->193|1455->256|1469->262|1529->301|1684->428|1713->429|1755->443|1784->444|1822->455|1837->461|1881->484|1967->542|1996->543|2038->557|2067->558|2105->569|2120->575|2164->598|2254->660|2283->661|2325->675|2354->676|2392->687|2407->693|2455->719|2583->820|2611->827|2655->843
                  LINES: 28->1|33->1|35->3|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|44->12|44->12|44->12|44->12|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|46->14|46->14|46->14|52->20|52->20|54->22
                  -- GENERATED --
              */
          