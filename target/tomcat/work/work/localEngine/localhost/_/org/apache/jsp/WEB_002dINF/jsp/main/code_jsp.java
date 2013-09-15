package org.apache.jsp.WEB_002dINF.jsp.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class code_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Code</title>\r\n");
      out.write("<link rel=\"icon\" href=\"/img/icon.ico\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"/img/icon.ico\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/library/bootstrap/bootstrap.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/library/jqueryui/jquery-ui.custom.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/custom/core.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/custom/code.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/library/jquery/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/library/jqueryui/jquery-ui.custom.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/custom/core.js\"></script>\r\n");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../tags/navbar.jsp", out, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../tags/header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"wrapper\" class=\"blue\">\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../tags/codeHeader.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<div class=\"info\">\r\n");
      out.write("\t\t\t<div id=\"codeIntro\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tSo this is the area of my site where I do some stuff with various forms of code.  Not all of it is intensive\r\n");
      out.write("\t\t\t\t\tin the slightest, and the majority of it is likely readable by non-programmer type people.  Anyways this is also\r\n");
      out.write("\t\t\t\t\tthe portion of the site that will get updated the most, seeing as how I'm a computer nerd and all.\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tBasically it might be worth it to stop back here every once in a while to check for updates, especially if\r\n");
      out.write("\t\t\t\t\tyou have some interest in computers.  As for now I just have some random pictures from and of outer space,\r\n");
      out.write("\t\t\t\t\twhich if you've been around long enough will recognize from that past two versions of this site.  I also\r\n");
      out.write("\t\t\t\t\thave some <a target=\"_blank\" href=\"http://projecteuler.net/\">Project Euler</a> solutions in both Python (it's been a while)\r\n");
      out.write("\t\t\t\t\tand JAVA (which is what I wrote when I made this web page).  More to come!\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tEnjoy!\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../tags/navigation.jsp", out, false);
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
