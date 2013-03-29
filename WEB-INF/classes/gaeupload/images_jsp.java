/*    */ package org.apache.jsp.pages;
/*    */ 
/*    */ import gaeupload.Image;
/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ import javax.el.ExpressionFactory;
/*    */ import javax.servlet.ServletConfig;
/*    */ import javax.servlet.ServletContext;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;
/*    */ import javax.servlet.jsp.JspApplicationContext;
/*    */ import javax.servlet.jsp.JspFactory;
/*    */ import javax.servlet.jsp.JspWriter;
/*    */ import javax.servlet.jsp.PageContext;
/*    */ import javax.servlet.jsp.SkipPageException;
/*    */ import org.apache.AnnotationProcessor;
/*    */ import org.apache.jasper.runtime.HttpJspBase;
/*    */ import org.apache.jasper.runtime.JspSourceDependent;
/*    */ 
/*    */ public final class images_jsp extends HttpJspBase
/*    */   implements JspSourceDependent
/*    */ {
/* 13 */   private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();
/*    */   private static List _jspx_dependants;
/*    */   private ExpressionFactory _el_expressionfactory;
/*    */   private AnnotationProcessor _jsp_annotationprocessor;
/*    */ 
/*    */   public Object getDependants()
/*    */   {
/* 21 */     return _jspx_dependants;
/*    */   }
/*    */ 
/*    */   public void _jspInit() {
/* 25 */     this._el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
/* 26 */     this._jsp_annotationprocessor = ((AnnotationProcessor)getServletConfig().getServletContext().getAttribute(AnnotationProcessor.class.getName()));
/*    */   }
/*    */ 
/*    */   public void _jspDestroy()
/*    */   {
/*    */   }
/*    */ 
/*    */   public void _jspService(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
/*    */   {
/* 35 */     PageContext pageContext = null;
/* 36 */     HttpSession session = null;
/* 37 */     ServletContext application = null;
/* 38 */     ServletConfig config = null;
/* 39 */     JspWriter out = null;
/* 40 */     Object page = this;
/* 41 */     JspWriter _jspx_out = null;
/* 42 */     PageContext _jspx_page_context = null;
/*    */     try
/*    */     {
/* 46 */       response.setContentType("text/html;charset=UTF-8");
/* 47 */       pageContext = _jspxFactory.getPageContext(this, request, response, null, true, 8192, true);
/*    */ 
/* 49 */       _jspx_page_context = pageContext;
/* 50 */       application = pageContext.getServletContext();
/* 51 */       config = pageContext.getServletConfig();
/* 52 */       session = pageContext.getSession();
/* 53 */       out = pageContext.getOut();
/* 54 */       _jspx_out = out;
/*    */ 
/* 56 */       out.write("\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \n\"http://www.w3.org/TR/html4/loose.dtd\">\n\n\n\n\n\n<html>\n\t<head>\n\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n\t\t<title>JSP Life Cycle Example</title>\t\n\t</head>\n\t<body>\n\t\t<h2>File Upload</h2>\n\t\t<form name=\"filesForm\" action=\"/upload\" method=\"post\" enctype=\"multipart/form-data\">\n\t\t\tFile:<input type=\"file\" name=\"file\"><br />\n\t\t\tDescription:<input type=\"text\" name=\"desc\" /><br />\n\t\t\t<input type=\"submit\" name=\"Submit\" value=\"Upload Files\">\n\t\t</form>\n\t\t\t\n\t\t<h2>Files Uploaded</h2>\n\t\t");
/*    */ 
/* 60 */       List images = (List)request.getAttribute("images");
/*    */ 
/* 63 */       out.write("\n\t\t\n\t");
/* 64 */       if (images != null) {
/* 65 */         out.write("\n \t<table>\n      ");
/* 66 */         for (Image image : images) {
/* 67 */           out.write("\n      <tr>\n        <td>");
/* 68 */           out.print(image.getName());
/* 69 */           out.write("</td>\n        <td>\n\t        <a href=\"/image?name=");
/* 70 */           out.print(image.getName());
/* 71 */           out.write("\">\n\t\t\t<img src=\"/image?name=");
/* 72 */           out.print(image.getName());
/* 73 */           out.write("\" width=\"70\" height=\"90\"/>\n\t\t\t</a>\n       \t</td>\n        <td>");
/* 74 */           out.print(image.getDesc());
/* 75 */           out.write("</td>\n      </tr>\n      ");
/*    */         }
/* 77 */         out.write("\n    </table>\n\t");
/*    */       } else {
/* 79 */         out.write("\n\t<h3>...No images...</h3>\n\t");
/*    */       }
/* 81 */       out.write("\n\t\n    </body>\n</html>\n\t");
/*    */     } catch (Throwable t) {
/* 83 */       if (!(t instanceof SkipPageException)) {
/* 84 */         out = _jspx_out;
/* 85 */         if ((out != null) && (out.getBufferSize() != 0)) try {
/* 86 */             out.clearBuffer(); } catch (IOException e) {
/*    */           } if (_jspx_page_context != null) _jspx_page_context.handlePageException(t); 
/*    */       }
/*    */     }
/* 90 */     finally { _jspxFactory.releasePageContext(_jspx_page_context); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           Z:\home\fernando\proyectos\image-uploader-gae-java\WEB-INF\classes\
 * Qualified Name:     org.apache.jsp.pages.images_jsp
 * JD-Core Version:    0.6.2
 */