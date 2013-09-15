package org.apache.jsp.WEB_002dINF.jsp.tags;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navigation_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\t<div id=\"accordianWrapper\" class=\"green\">\r\n");
      out.write("\t\t<div id=\"accordion\">\r\n");
      out.write("\t\t\t<h3>About me</h3>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tAll about me!\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p class=\"buttonWrapper\">\r\n");
      out.write("\t\t\t\t\t<button class=\"button\" onclick=\"openPage('/navigate/base?page=aboutMe');\">Go!</button>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<h3>Resume</h3>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tCheck out my resume in case your interested in me employment-wise!\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p class=\"buttonWrapper\">\r\n");
      out.write("\t\t\t\t\t<button class=\"button\" onclick=\"openPage('/navigate/base?page=resume');\">Go!</button>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<h3>Guestbook</h3>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tPlease sign my guestbook!\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p class=\"buttonWrapper\">\r\n");
      out.write("\t\t\t\t\t<button class=\"button\" onclick=\"openPage('/guestbook/getGuestbookForm');\">Go!</button>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<h3>Code</h3>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tSome stuff I'm doing with code!  Yeah, fun!\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p class=\"buttonWrapper\">\r\n");
      out.write("\t\t\t\t\t<button class=\"button\" onclick=\"openPage('/navigate/base?page=code');\">Go!</button>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<h3>Bullhorn</h3>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tCheck out my current employer's site, BULLHORN!\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p class=\"buttonWrapper\">\r\n");
      out.write("\t\t\t\t\t<button class=\"button\" onclick=\"openPage('http://www.bullhorn.com/');\">Go!</button>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<h3>Math</h3>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tFor all you math geeks out there!\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p class=\"buttonWrapper\">\r\n");
      out.write("\t\t\t\t\t<button class=\"button\" onclick=\"openPage('/navigate/base?page=math');\">Go!</button>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>");
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
