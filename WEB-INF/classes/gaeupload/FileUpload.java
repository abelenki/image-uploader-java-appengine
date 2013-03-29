/*    */ package gaeupload;
/*    */ 
/*    */ import com.google.appengine.api.datastore.Blob;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.PrintStream;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collections;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import javax.jdo.PersistenceManager;
/*    */ import javax.jdo.PersistenceManagerFactory;
/*    */ import javax.jdo.Query;
/*    */ import javax.servlet.RequestDispatcher;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.commons.fileupload.FileItemIterator;
/*    */ import org.apache.commons.fileupload.FileItemStream;
/*    */ import org.apache.commons.fileupload.servlet.ServletFileUpload;
/*    */ import org.apache.commons.io.IOUtils;
/*    */ 
/*    */ public class FileUpload extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/* 29 */   private String page = "/pages/images.jsp";
/*    */ 
/*    */   public void doPost(HttpServletRequest req, HttpServletResponse res)
/*    */     throws ServletException, IOException
/*    */   {
/* 34 */     RequestDispatcher rd = req.getRequestDispatcher(this.page);
/*    */     try
/*    */     {
/* 37 */       res.setContentType("text/html");
/*    */ 
/* 39 */       Image myImage = null;
/* 40 */       String desc = "";
/*    */ 
/* 42 */       ServletFileUpload upload = new ServletFileUpload();
/* 43 */       FileItemIterator iterator = upload.getItemIterator(req);
/* 44 */       while (iterator.hasNext()) {
/* 45 */         FileItemStream item = iterator.next();
/* 46 */         InputStream stream = item.openStream();
/*    */ 
/* 48 */         if (!item.isFormField()) {
/* 49 */           Blob imageBlob = new Blob(IOUtils.toByteArray(stream));
/* 50 */           myImage = new Image(item.getName(), imageBlob);
/*    */         }
/* 52 */         else if (item.getFieldName().equalsIgnoreCase("desc")) {
/*    */           try {
/* 54 */             desc = Utils.convertStreamToString(stream);
/*    */           } catch (Exception e) {
/* 56 */             System.out.println(e.getMessage());
/*    */           }
/*    */         }
/*    */ 
/*    */       }
/*    */ 
/* 62 */       myImage.setDesc(desc);
/*    */ 
/* 65 */       PersistenceManager pm = PMF.get().getPersistenceManager();
/* 66 */       pm.makePersistent(myImage);
/* 67 */       pm.close();
/*    */ 
/* 70 */       getImageList(req);
/* 71 */       rd.forward(req, res);
/*    */     }
/*    */     catch (Exception ex) {
/* 74 */       throw new ServletException(ex);
/*    */     }
/*    */   }
/*    */ 
/*    */   public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
/*    */   {
/* 80 */     RequestDispatcher rd = req.getRequestDispatcher(this.page);
/* 81 */     getImageList(req);
/* 82 */     rd.forward(req, res);
/*    */   }
/*    */ 
/*    */   private void getImageList(HttpServletRequest req) {
/* 86 */     PersistenceManager pm = PMF.get().getPersistenceManager();
/* 87 */     Query query = pm.newQuery(Image.class);
/*    */     try
/*    */     {
/* 91 */       List results = (List)query.execute();
/* 92 */       if (!results.isEmpty())
/* 93 */         System.out.println("Images found: " + results.size());
/*    */       else {
/* 95 */         System.out.println("No images");
/*    */       }
/*    */ 
/* 98 */       List images = new ArrayList();
/* 99 */       for (Iterator localIterator = results.iterator(); localIterator.hasNext(); ) { Object object = localIterator.next();
/* 100 */         images.add((Image)object);
/*    */       }
/* 102 */       Collections.reverse(images);
/* 103 */       req.setAttribute("images", images);
/*    */     }
/*    */     finally {
/* 106 */       query.closeAll();
/*    */     }
/*    */   }
/*    */ }

/* Location:           Z:\home\fernando\proyectos\image-uploader-gae-java\WEB-INF\classes\
 * Qualified Name:     gaeupload.FileUpload
 * JD-Core Version:    0.6.2
 */