package org.apache.jsp.WEB_002dINF.jsp.main.math;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class primes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Primes</title>\r\n");
      out.write("<link rel=\"icon\" href=\"/img/icon.ico\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"/img/icon.ico\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/library/bootstrap/bootstrap.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/library/datatable/demo_table_jui.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/library/jqueryui/jquery-ui.custom.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/library/jalert/jalert.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/custom/core.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/custom/math.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/custom/math/primes.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/library/jquery/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/library/jqueryui/jquery-ui.custom.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/library/jalert/jquery.jalert.packed.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/library/json.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/library/datatable/jquery.dataTables.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/custom/core.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/custom/primes.js\"></script>\r\n");
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
      out.write("\t\r\n");
      out.write("\t<div id=\"wrapper\" class=\"blue\">\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../tags/mathHeader.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<div class=\"info\">\r\n");
      out.write("\t\t\t<div id=\"mathIntro\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tSo this is my page on prime numbers.  I have a thread running on my website\r\n");
      out.write("\t\t\t\t\tthat is constantly finding prime numbers (starting with 2, and working its way up)\r\n");
      out.write("\t\t\t\t\tand shoving them into a database.  You can see the most recent ones here (refresh the page to\r\n");
      out.write("\t\t\t\t\tsee new ones), or find a specific range of primes, or find a single prime.\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tI use MongoDB in order to store and retrieve the values to make the process as fast as possible.\r\n");
      out.write("\t\t\t\t\tThus the load time for the tables below is relatively low, and you should be able to constantly\r\n");
      out.write("\t\t\t\t\tsee new numbers appearing in the first (Most Recent 1000) table.\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"info\">\r\n");
      out.write("\t\t\t<div class=\"primeSection\">\r\n");
      out.write("\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\tMost Recent 1000 Prime Numbers\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"datatable\">\r\n");
      out.write("\t\t\t\t\t<div id=\"containerEH\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"demo_jui\">\r\n");
      out.write("\t\t\t\t\t\t\t<table id=\"primeDataTable\" class=\"datatable\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tCardinality (Order, i.e. 2nd/3rd)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tPrime Number\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"primeSection\">\r\n");
      out.write("\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\tFind a Range of Primes (Max 1000)\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"primeForm\">\r\n");
      out.write("\t\t\t\t\t<div class=\"primeInputWrapper\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"fromPrime\" class=\"primeInputLabel\">\r\n");
      out.write("\t\t\t\t\t\t\tFrom:\r\n");
      out.write("\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"fromPrime\" id=\"fromPrime\" class=\"primeInput\" />\r\n");
      out.write("\t\t\t\t\t\t<span class=\"error\" id=\"fromPrimeError\"></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"primeInputWrapper\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"toPrime\" class=\"primeInputLabel\">\r\n");
      out.write("\t\t\t\t\t\t\tTo:\r\n");
      out.write("\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"toPrime\" id=\"toPrime\" class=\"primeInput\" />\r\n");
      out.write("\t\t\t\t\t\t<span class=\"error\" id=\"toPrimeError\"></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"primeInputWrapper\">\r\n");
      out.write("\t\t\t\t\t\t<button id=\"getRange\" class=\"button\" onclick=\"getPrimeRange();\">\r\n");
      out.write("\t\t\t\t\t\t\tFind\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"datatable\">\r\n");
      out.write("\t\t\t\t\t<div id=\"containerEH\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"demo_jui\">\r\n");
      out.write("\t\t\t\t\t\t\t<table id=\"primeRangeDataTable\" class=\"datatable\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tCardinality (Order, i.e. 2nd/3rd)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tPrime Number\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"primeSection\">\r\n");
      out.write("\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\tFind a Single Prime\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"primeForm\" id=\"findPrimeForm\">\r\n");
      out.write("\t\t\t\t\t<div class=\"primeInputWrapper\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"findPrime\" class=\"primeInputLabel\">\r\n");
      out.write("\t\t\t\t\t\t\tCardinality (Order, i.e. 2nd/3rd):\r\n");
      out.write("\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"findPrime\" id=\"findPrime\" class=\"primeInput\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"primeInputWrapper\">\r\n");
      out.write("\t\t\t\t\t\t<button id=\"getPrime\" class=\"button\" onclick=\"findPrime();\">\r\n");
      out.write("\t\t\t\t\t\t\tFind\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"primeInputWrapper\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"primeValue\" class=\"primeInputLabel\">\r\n");
      out.write("\t\t\t\t\t\t\tPrime Value:\r\n");
      out.write("\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"primeValue\" id=\"primeValue\" class=\"primeInput\" disabled=\"disabled\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
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
