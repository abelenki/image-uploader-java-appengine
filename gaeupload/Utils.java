/*    */ package gaeupload;
/*    */ 
/*    */ import java.io.BufferedReader;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.InputStreamReader;
/*    */ import java.io.Reader;
/*    */ import java.io.StringWriter;
/*    */ import java.io.Writer;
/*    */ 
/*    */ public class Utils
/*    */ {
/*    */   public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
/*    */ 
/*    */   public static String convertStreamToString(InputStream is)
/*    */     throws IOException
/*    */   {
/* 22 */     if (is != null) {
/* 23 */       Writer writer = new StringWriter();
/*    */ 
/* 25 */       char[] buffer = new char[1024];
/*    */       try {
/* 27 */         Reader reader = new BufferedReader(
/* 28 */           new InputStreamReader(is, "UTF-8"));
/*    */         int n;
/* 30 */         while ((n = reader.read(buffer)) != -1)
/*    */         {
/*    */           int n;
/* 31 */           writer.write(buffer, 0, n);
/*    */         }
/*    */       } finally {
/* 34 */         is.close();
/*    */       }
/* 36 */       return writer.toString();
/*    */     }
/* 38 */     return "";
/*    */   }
/*    */ }

/* Location:           Z:\home\fernando\proyectos\image-uploader-gae-java\WEB-INF\classes\
 * Qualified Name:     gaeupload.Utils
 * JD-Core Version:    0.6.2
 */