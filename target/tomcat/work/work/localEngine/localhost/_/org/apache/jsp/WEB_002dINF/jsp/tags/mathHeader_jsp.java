package org.apache.jsp.WEB_002dINF.jsp.tags;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mathHeader_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/custom/mathHeader.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/javascript/custom/mathHeader.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<div id=\"mathHeaderWrapper\">\r\n");
      out.write("\t<ul id='mathMenu'>\r\n");
      out.write("\t\t<li id='primes' class='yellow left rightBorder' onclick=\"openPage('/navigate/math?page=primes');\">\r\n");
      out.write("\t\t\t<p class=\"mathHeader\">\r\n");
      out.write("\t\t\t\tPrime Numbers\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p class=\"mathSubtext\">\r\n");
      out.write("\t\t\t\tCheck out some prime numbers I generate in this application.\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li id='proofs' class='yellow right' onclick=\"openPage('/navigate/math?page=proofs');\">\r\n");
      out.write("\t\t\t<p class=\"mathHeader\">\r\n");
      out.write("\t\t\t\tProofs\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p class=\"mathSubtext\">\r\n");
      out.write("\t\t\t\tSome of my old college proofs that I happened to still be holding onto.\r\n");
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
