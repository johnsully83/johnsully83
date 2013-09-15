package org.apache.jsp.WEB_002dINF.jsp.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutMe_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>About Me</title>\r\n");
      out.write("<link rel=\"icon\" href=\"/img/icon.ico\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"/img/icon.ico\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/library/bootstrap/bootstrap.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/library/jqueryui/jquery-ui.custom.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/custom/core.css\" />\r\n");
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
      out.write("\t\t<div class=\"info\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tHey there, my name is John Sullivan and you are on my new site.  This is the third version of it, the first one \r\n");
      out.write("\t\t\t\t\tbeing very, very, very rudimentary (made circa 2009), and the second version being somewhat better, but honestly\r\n");
      out.write("\t\t\t\t\tlacking a bit of style.  This new site is supposed to be much more modern in appearance; I am also trying to ensure\r\n");
      out.write("\t\t\t\t\tits usability on mobile devices.\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tSeeing as how I have become a software engineer recently, I decided to redo my site reflecting that side of me\r\n");
      out.write("\t\t\t\t\ta little more.  If you know what any of this means, this site is made with a JAVA Spring back end, MySQL databases,\r\n");
      out.write("\t\t\t\t\tjQuery and CSS for the front end, and a whole bunch of APIs and publicly available JAVA technologies.  If you're\r\n");
      out.write("\t\t\t\t\tmore interested in this, hit up the \r\n");
      out.write("\t\t\t\t\t<a href='javascript:openPage(\"/guestbook/getGuestbookForm\");'>guestbook</a>\r\n");
      out.write("\t\t\t\t\t.  \r\n");
      out.write("\t\t\t\t\tAlso, I have a \r\n");
      out.write("\t\t\t\t\t<a href='javascript:openPage(\"/navigate/base?page=code\");'>code</a> \r\n");
      out.write("\t\t\t\t\tpage that I will be adding to,\r\n");
      out.write("\t\t\t\t\thopefully pretty steadily, and it already has a handful of things on it (including some pretty \r\n");
      out.write("\t\t\t\t\t<a href='javascript:openPage(\"/navigate/code?page=spacePictures\");'>space pictures</a>).\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tAnyways a little more about me; I graduated from \r\n");
      out.write("\t\t\t\t\t<a target=\"_blank\" href=\"http://www.bc.edu/\">Boston College</a>\r\n");
      out.write("\t\t\t\t\t this year (currently 2012) and have since started working\r\n");
      out.write("\t\t\t\t\tfor \r\n");
      out.write("\t\t\t\t\t<a target=\"_blank\" href='http://www.bullhorn.com/'>BULLHORN</a>\r\n");
      out.write("\t\t\t\t\t, who I interned for during college for a little over a year\r\n");
      out.write("\t\t\t\t\tas a reporting engineer.  When I started full-time I became a software engineer, and thus this site.  \r\n");
      out.write("\t\t\t\t\t<a target=\"_blank\" href='http://www.bullhorn.com/'>BULLHORN</a> \r\n");
      out.write("\t\t\t\t\tis a very fun place to work, and I recommend it to anyone looking to work for a well-established \r\n");
      out.write("\t\t\t\t\tup-and-coming tech company (check out the news stories on the site about our recent acquisitions).\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tBack at \r\n");
      out.write("\t\t\t\t\t<a target=\"_blank\" href=\"http://www.bc.edu/\">Boston College</a>\r\n");
      out.write("\t\t\t\t\t I was a Math major and a Computer Science minor; I studied a lot of abstract mathematics\r\n");
      out.write("\t\t\t\t\tsuch as Algebra, Analysis, and Geometry/Topology (my favorite).  I also did a decent amount of computational analytic stuff, \r\n");
      out.write("\t\t\t\t\tusing software tools like \r\n");
      out.write("\t\t\t\t\t<a target=\"_blank\" href=\"http://www.mathworks.com/products/matlab/\">MATLAB</a>\r\n");
      out.write("\t\t\t\t\tor \r\n");
      out.write("\t\t\t\t\t<a target=\"_blank\" href=\"http://www.wolfram.com/mathematica/\">Mathematica</a>\r\n");
      out.write("\t\t\t\t\tto solve complex and/or large math problems; it was during this time that I had my first lessons in Cryptography,\r\n");
      out.write("\t\t\t\t\twhich I plan on writing some JAVA for before too long.  I'll be adding some more stuff here about some of that stuff before too long.\r\n");
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
