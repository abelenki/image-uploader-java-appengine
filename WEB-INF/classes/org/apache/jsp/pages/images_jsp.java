package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Collections;
import gaeupload.Image;

public final class images_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \n\"http://www.w3.org/TR/html4/loose.dtd\">\n\n\n\n\n\n<html>\n\t<head>\n\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n\t\t<title>JSP Life Cycle Example</title>\t\n\t</head>\n\t<body>\n\t\t<h2>File Upload</h2>\n\t\t<form name=\"filesForm\" action=\"/upload\" method=\"post\" enctype=\"multipart/form-data\">\n\t\t\tFile:<input type=\"file\" name=\"file\"><br />\n\t\t\tDescription:<input type=\"text\" name=\"desc\" /><br />\n\t\t\t<input type=\"submit\" name=\"Submit\" value=\"Upload Files\">\n\t\t</form>\n\t\t\t\n\t\t<h2>Files Uploaded</h2>\n\t\t");

		
		@SuppressWarnings("unchecked")
		List<Image> images = (List<Image>)request.getAttribute("images");
		
		
      out.write("\n\t\t\n\t");
 if (images != null) { 
      out.write("\n \t<table>\n      ");
 for (Image image: images) { 
      out.write("\n      <tr>\n        <td>");
      out.print(image.getName() );
      out.write("</td>\n        <td>\n\t        <a href=\"/image?name=");
      out.print(image.getName() );
      out.write("\">\n\t\t\t<img src=\"/image?name=");
      out.print(image.getName() );
      out.write("\" width=\"70\" height=\"90\"/>\n\t\t\t</a>\n       \t</td>\n        <td>");
      out.print(image.getDesc() );
      out.write("</td>\n      </tr>\n      ");
 } //endfor
      out.write("\n    </table>\n\t");
 } else { 
      out.write("\n\t<h3>...No images...</h3>\n\t");
 } //endif 
      out.write("\n\t\n    </body>\n</html>\n\t");
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
