package org.apache.jsp.WEB_002dINF.jsp.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Homepage</title>\r\n");
      out.write("<link rel=\"icon\" href=\"/img/icon.ico\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"/img/icon.ico\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/library/bootstrap/bootstrap.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/library/jqueryui/jquery-ui.custom.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/custom/core.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/custom/homepage.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/library/jquery/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/library/jqueryui/jquery-ui.custom.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/custom/core.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/custom/homepage.js\"></script>\r\n");
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
      out.write("\t<div id=\"wrapper\" class=\"blue\">\r\n");
      out.write("\t\t<h1>\r\n");
      out.write("\t\t\tHi there,\r\n");
      out.write("\t\t</h1>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<p class=\"info\">\r\n");
      out.write("\t\t\tMy name is Sully and I'm a JAVA engineer, specializing in making dynamic web applications for creating,\r\n");
      out.write("\t\t\tediting, persisting, integrating, and/or converting data of various types.  Of course, \r\n");
      out.write("\t\t\t<span>\r\n");
      out.write("\t\t\t\t<a href=\"http://www.springsource.org/\" target=\"_blank\">\r\n");
      out.write("\t\t\t\t\tSpring Framework\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</span> \r\n");
      out.write("\t\t\tis my favorite tool, along with Hibernate/JPA, JSR-303, JAX-B, XSTREAM, AWS (etc...)\r\n");
      out.write("\t\t\tand I have now officially completely redone my site with a Spring back-end, as well as with\r\n");
      out.write("\t\t\t<span>\r\n");
      out.write("\t\t\t\t<a href=\"http://jqueryui.com/\" target=\"_blank\">\r\n");
      out.write("\t\t\t\t\tjQuery UI\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</span> \r\n");
      out.write("\t\t\tand\r\n");
      out.write("\t\t\t<span>\r\n");
      out.write("\t\t\t\t<a href=\"http://twitter.github.com/bootstrap/\" target=\"_blank\">\r\n");
      out.write("\t\t\t\t\tTwitter Bootstrap\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t\t's oh-so pretty base CSS.  I use my favorite hosting tool,\r\n");
      out.write("\t\t\t<span>\r\n");
      out.write("\t\t\t\t<a href=\"http://www.cloudbees.com/\" target=\"_blank\">\r\n");
      out.write("\t\t\t\t\tCloudbees\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t\tto dynamically deploy this site using Jenkins whenever I commit to my Cloudbees-hosted repository.\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p class=\"info\">\r\n");
      out.write("\t\t\tIf you don't understand all that nonsense, don't worry; there is some random fun stuff on this site besides all my\r\n");
      out.write("\t\t\tnerdy development stuff.  Basically I just tried to use some of the coolest and newest technologies available\r\n");
      out.write("\t\t\tto JAVA developers to make this site!\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p class=\"info\">\r\n");
      out.write("\t\t\tEnjoy what little there is, please, and feel free to sign my guestbook!\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p class=\"info\">\r\n");
      out.write("\t\t\tSully\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
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
