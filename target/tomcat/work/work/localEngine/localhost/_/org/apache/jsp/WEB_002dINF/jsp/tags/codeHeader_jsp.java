package org.apache.jsp.WEB_002dINF.jsp.tags;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class codeHeader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/custom/codeHeader.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/custom/codeHeader.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<div id=\"codeHeaderWrapper\">\r\n");
      out.write("\t<ul id='codeMenu'>\r\n");
      out.write("\t\t<li id='pythonEuler' class='orange left rightBorder' onclick=\"openPage('/navigate/code?page=pythonEuler');\">\r\n");
      out.write("\t\t\t<p class=\"codeHeader\">\r\n");
      out.write("\t\t\t\tEuler Solutions (Python)\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p class=\"codeSubtext\">\r\n");
      out.write("\t\t\t\tSome Project Euler solutions I solved a few years ago written in Python\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li id='javaEuler' class='orange rightBorder' onclick=\"openPage('/navigate/code?page=javaEuler');\">\r\n");
      out.write("\t\t\t<p class=\"codeHeader\">\r\n");
      out.write("\t\t\t\tEuler Solutions (JAVA)\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p class=\"codeSubtext\">\r\n");
      out.write("\t\t\t\tA handful of Project Euler solutions written in JAVA\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li id='spacePictures' class='orange rightBorder' onclick=\"openPage('/navigate/code?page=spacePictures');\">\r\n");
      out.write("\t\t\t<p class=\"codeHeader\">\r\n");
      out.write("\t\t\t\tSpace Pictures\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p class=\"codeSubtext\">\r\n");
      out.write("\t\t\t\tSome pictures of outer space, as well as pictures of Earth from outer space!\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li id='mongoDb' class='orange rightBorder' onclick=\"openPage('/navigate/code?page=mongoDb');\">\r\n");
      out.write("\t\t\t<p class=\"codeHeader\">\r\n");
      out.write("\t\t\t\tMongo DB\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p class=\"codeSubtext\">\r\n");
      out.write("\t\t\t\tSome stuff I'm playing around with to try using MongoDB with Spring!\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li id='currency' class='orange right' onclick=\"openPage('/mongo/getCurrencyForm');\">\r\n");
      out.write("\t\t\t<p class=\"codeHeader\">\r\n");
      out.write("\t\t\t\tCurrency Converter\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p class=\"codeSubtext\">\r\n");
      out.write("\t\t\t\tConvert between currencies: even includes historical data!\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>");
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
