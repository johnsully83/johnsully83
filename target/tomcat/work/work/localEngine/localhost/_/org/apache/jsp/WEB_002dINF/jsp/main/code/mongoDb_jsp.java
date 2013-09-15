package org.apache.jsp.WEB_002dINF.jsp.main.code;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mongoDb_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\t\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Mongo DB</title>\r\n");
      out.write("<link rel=\"icon\" href=\"/img/icon.ico\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"/img/icon.ico\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/library/bootstrap/bootstrap.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/library/datatable/demo_table_jui.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/library/jqueryui/jquery-ui.custom.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/custom/core.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/custom/code.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/custom/code/mongoDb.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/library/jquery/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/library/jqueryui/jquery-ui.custom.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/library/json.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/library/datatable/jquery.dataTables.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/custom/core.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/custom/mongoDb.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("  var _gaq = _gaq || [];\r\n");
      out.write("  _gaq.push(['_setAccount', 'UA-23673631-1']);\r\n");
      out.write("  _gaq.push(['_trackPageview']);\r\n");
      out.write("\r\n");
      out.write("  (function() {\r\n");
      out.write("    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\r\n");
      out.write("    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\r\n");
      out.write("    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\r\n");
      out.write("  })();\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../tags/navbar.jsp", out, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../tags/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"wrapper\" class=\"blue\">\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../tags/codeHeader.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"info\" id=\"mongoIntro\">\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\tSo this page has a couple of examples utilizing the super fast object/document storage engine called \r\n");
      out.write("\t\t\t\t<a href=\"http://www.mongodb.org/\" target=\"_blank\">MongoDB</a>.  It is a NOSQL database, which means it is\r\n");
      out.write("\t\t\t\tthe opposite of a traditional relational database; every object is stored with a key that is a unique identifier.\r\n");
      out.write("\t\t\t\tThere is no relationship between different objects in the database.  In fact, it is better to consider a \r\n");
      out.write("\t\t\t\tNOSQL 'table' as a collection of items (a Map, specifically), where each item in the collection has a key,\r\n");
      out.write("\t\t\t\twhich is a sort of hash-like String representation, and where the object is some number of fields\r\n");
      out.write("\t\t\t\twith values.\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\tAnyways what I decided to do with this is display all of the Countries and States in my MySQL databases by replicating \r\n");
      out.write("\t\t\t\tthem to a MongoDB database nightly (they are originally replicated from the Yahoo GeoPlanet API nightly) and then display\r\n");
      out.write("\t\t\t\tthem in the following UI.  The whole point of it is that every time you sort, search, or change in some way what data is shown, \r\n");
      out.write("\t\t\t\tevery record in the database is pulled and displayed.  This is ALOT of database calls happening incredibly quickly \r\n");
      out.write("\t\t\t\tand immediately.\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\tIf your interested in getting some help with MongoDB, etc., please feel free to sign the guestbook.\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\tFinally, I discovered that even with MongoDb loading 50,000+ records in a reasonable second or so is a bit much.\r\n");
      out.write("\t\t\t\tConsequently I edited this page so you can click on a row in the country or state table; the next table down\r\n");
      out.write("\t\t\t\ton the page will load correspondinly (i.e. click on 'United States' in the country table, you see all U.S. states\r\n");
      out.write("\t\t\t\tin the state table, etc.)\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"datatable\">\r\n");
      out.write("\t\t\t<div id=\"containerEH\">\r\n");
      out.write("\t\t\t\t<div id=\"demo_jui\">\r\n");
      out.write("\t\t\t\t\t<table id=\"countryDataTable\" class=\"datatable\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tCountry\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tHas States\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"datatable\">\r\n");
      out.write("\t\t\t<div id=\"containerEH\">\r\n");
      out.write("\t\t\t\t<div id=\"demo_jui\">\r\n");
      out.write("\t\t\t\t\t<table id=\"stateDataTable\" class=\"datatable\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tCountry\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tState\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"datatable\">\r\n");
      out.write("\t\t\t<div id=\"containerEH\">\r\n");
      out.write("\t\t\t\t<div id=\"demo_jui\">\r\n");
      out.write("\t\t\t\t\t<table id=\"cityDataTable\" class=\"datatable\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tCountry\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tState\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tCity\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../tags/navigation.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
