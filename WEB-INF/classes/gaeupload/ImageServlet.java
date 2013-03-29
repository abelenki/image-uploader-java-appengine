/*    */ package gaeupload;
/*    */ 
/*    */ import com.google.appengine.api.datastore.Blob;
/*    */ import java.io.IOException;
/*    */ import java.io.PrintWriter;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import javax.jdo.PersistenceManager;
/*    */ import javax.jdo.PersistenceManagerFactory;
/*    */ import javax.jdo.Query;
/*    */ import javax.servlet.ServletOutputStream;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ 
/*    */ public class ImageServlet extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   public void doGet(HttpServletRequest req, HttpServletResponse res)
/*    */   {
/* 21 */     String imageName = req.getParameter("name");
/* 22 */     if (imageName != null)
/*    */     {
/* 24 */       PersistenceManager pm = PMF.get().getPersistenceManager();
/* 25 */       Query query = pm.newQuery(Image.class);
/* 26 */       query.setFilter("name == imageName");
/* 27 */       query.declareParameters("String imageName");
/*    */ 
/* 30 */       List results = (List)query.execute(imageName);
/*    */ 
/* 32 */       Blob image = ((Image)results.iterator().next()).getImage();
/*    */       try
/*    */       {
/* 37 */         res.getOutputStream().write(image.getBytes());
/*    */       } catch (IOException e) {
/* 39 */         e.printStackTrace();
/*    */       }
/*    */     } else {
/* 42 */       res.setContentType("text/plain");
/*    */       try {
/* 44 */         res.getWriter().println("No image found");
/*    */       } catch (IOException e) {
/* 46 */         e.printStackTrace();
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           Z:\home\fernando\proyectos\image-uploader-gae-java\WEB-INF\classes\
 * Qualified Name:     gaeupload.ImageServlet
 * JD-Core Version:    0.6.2
 */