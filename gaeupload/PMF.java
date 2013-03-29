/*    */ package gaeupload;
/*    */ 
/*    */ import javax.jdo.JDOHelper;
/*    */ import javax.jdo.PersistenceManagerFactory;
/*    */ 
/*    */ public final class PMF
/*    */ {
/*  8 */   private static final PersistenceManagerFactory pmfInstance = JDOHelper.getPersistenceManagerFactory("transactions-optional");
/*    */ 
/*    */   public static PersistenceManagerFactory get()
/*    */   {
/* 13 */     return pmfInstance;
/*    */   }
/*    */ }

/* Location:           Z:\home\fernando\proyectos\image-uploader-gae-java\WEB-INF\classes\
 * Qualified Name:     gaeupload.PMF
 * JD-Core Version:    0.6.2
 */