/*    */ package gaeupload;
/*    */ 
/*    */ import com.google.appengine.api.datastore.Blob;
/*    */ import com.google.appengine.api.datastore.Key;
/*    */ import javax.jdo.JDOFatalInternalException;
/*    */ import javax.jdo.PersistenceManager;
/*    */ import javax.jdo.annotations.IdGeneratorStrategy;
/*    */ import javax.jdo.annotations.IdentityType;
/*    */ import javax.jdo.annotations.Persistent;
/*    */ import javax.jdo.annotations.PrimaryKey;
/*    */ import javax.jdo.identity.ObjectIdentity;
/*    */ import javax.jdo.spi.JDOImplHelper;
/*    */ import javax.jdo.spi.PersistenceCapable.ObjectIdFieldConsumer;
/*    */ import javax.jdo.spi.PersistenceCapable.ObjectIdFieldSupplier;
/*    */ import javax.jdo.spi.StateManager;
/*    */ 
/*    */ @javax.jdo.annotations.PersistenceCapable(identityType=IdentityType.APPLICATION)
/*    */ public class Image
/*    */   implements javax.jdo.spi.PersistenceCapable
/*    */ {
/*    */ 
/*    */   @PrimaryKey
/*    */   @Persistent(valueStrategy=IdGeneratorStrategy.IDENTITY)
/*    */   private Key id;
/*    */ 
/*    */   @Persistent
/*    */   private String name;
/*    */ 
/*    */   @Persistent
/*    */   private String desc;
/*    */ 
/*    */   @Persistent
/*    */   private Blob image;
/*    */   protected transient StateManager jdoStateManager;
/*    */   protected transient byte jdoFlags;
/*    */   private static final byte[] jdoFieldFlags;
/*    */   private static final Class jdoPersistenceCapableSuperclass;
/*    */   private static final Class[] jdoFieldTypes;
/*    */   private static final String[] jdoFieldNames = __jdoFieldNamesInit();
/*    */   private static final int jdoInheritedFieldCount;
/*    */ 
/*    */   public Image()
/*    */   {
/*    */   }
/*    */ 
/*    */   public Image(String name, Blob image)
/*    */   {
/* 29 */     this.name = name;
/* 30 */     this.image = image;
/*    */   }
/*    */ 
/*    */   public Key getId() {
/* 34 */     return jdoGetid(this);
/*    */   }
/*    */   public void setId(Key id) {
/* 37 */     jdoSetid(this, id);
/*    */   }
/*    */   public String getName() {
/* 40 */     return jdoGetname(this);
/*    */   }
/*    */   public void setName(String name) {
/* 43 */     jdoSetname(this, name);
/*    */   }
/*    */   public String getDesc() {
/* 46 */     return jdoGetdesc(this);
/*    */   }
/*    */   public void setDesc(String desc) {
/* 49 */     jdoSetdesc(this, desc);
/*    */   }
/*    */   public Blob getImage() {
/* 52 */     return jdoGetimage(this);
/*    */   }
/*    */   public void setImage(Blob image) {
/* 55 */     jdoSetimage(this, image);
/*    */   }
/*    */ 
/*    */   static
/*    */   {
/*    */     jdoFieldTypes = __jdoFieldTypesInit();
/*    */     jdoFieldFlags = __jdoFieldFlagsInit();
/*    */     jdoInheritedFieldCount = __jdoGetInheritedFieldCount();
/*    */     jdoPersistenceCapableSuperclass = __jdoPersistenceCapableSuperclassInit();
/*    */     JDOImplHelper.registerClass(___jdo$loadClass("gaeupload.Image"), jdoFieldNames, jdoFieldTypes, jdoFieldFlags, jdoPersistenceCapableSuperclass, new Image());
/*    */   }
/*    */ 
/*    */   public void jdoCopyKeyFieldsFromObjectId(PersistenceCapable.ObjectIdFieldConsumer fc, Object oid)
/*    */   {
/*    */     if (fc == null)
/*    */       throw new IllegalArgumentException("ObjectIdFieldConsumer is null");
/*    */     if (!(oid instanceof ObjectIdentity))
/*    */       throw new ClassCastException("oid is not instanceof javax.jdo.identity.ObjectIdentity");
/*    */     ObjectIdentity o = (ObjectIdentity)oid;
/*    */     fc.storeObjectField(1, o.getKey());
/*    */   }
/*    */ 
/*    */   protected void jdoCopyKeyFieldsFromObjectId(Object oid)
/*    */   {
/*    */     if (!(oid instanceof ObjectIdentity))
/*    */       throw new ClassCastException("key class is not javax.jdo.identity.ObjectIdentity or null");
/*    */     ObjectIdentity o = (ObjectIdentity)oid;
/*    */     this.id = ((Key)o.getKey());
/*    */   }
/*    */ 
/*    */   public final void jdoCopyKeyFieldsToObjectId(Object oid)
/*    */   {
/*    */     throw new JDOFatalInternalException("It's illegal to call jdoCopyKeyFieldsToObjectId for a class with SingleFieldIdentity.");
/*    */   }
/*    */ 
/*    */   public final void jdoCopyKeyFieldsToObjectId(PersistenceCapable.ObjectIdFieldSupplier fs, Object paramObject)
/*    */   {
/*    */     throw new JDOFatalInternalException("It's illegal to call jdoCopyKeyFieldsToObjectId for a class with SingleFieldIdentity.");
/*    */   }
/*    */ 
/*    */   public final Object jdoGetObjectId()
/*    */   {
/*    */     if (this.jdoStateManager != null)
/*    */       return this.jdoStateManager.getObjectId(this);
/*    */     return null;
/*    */   }
/*    */ 
/*    */   public final Object jdoGetVersion()
/*    */   {
/*    */     if (this.jdoStateManager != null)
/*    */       return this.jdoStateManager.getVersion(this);
/*    */     return null;
/*    */   }
/*    */ 
/*    */   protected final void jdoPreSerialize()
/*    */   {
/*    */     if (this.jdoStateManager != null)
/*    */       this.jdoStateManager.preSerialize(this);
/*    */   }
/*    */ 
/*    */   public final PersistenceManager jdoGetPersistenceManager()
/*    */   {
/*    */     return this.jdoStateManager != null ? this.jdoStateManager.getPersistenceManager(this) : null;
/*    */   }
/*    */ 
/*    */   public final Object jdoGetTransactionalObjectId()
/*    */   {
/*    */     return this.jdoStateManager != null ? this.jdoStateManager.getTransactionalObjectId(this) : null;
/*    */   }
/*    */ 
/*    */   public final boolean jdoIsDeleted()
/*    */   {
/*    */     return this.jdoStateManager != null ? this.jdoStateManager.isDeleted(this) : false;
/*    */   }
/*    */ 
/*    */   public final boolean jdoIsDirty()
/*    */   {
/*    */     if (this.jdoStateManager != null)
/*    */       return this.jdoStateManager.isDirty(this);
/*    */     return false;
/*    */   }
/*    */ 
/*    */   public final boolean jdoIsNew()
/*    */   {
/*    */     return this.jdoStateManager != null ? this.jdoStateManager.isNew(this) : false;
/*    */   }
/*    */ 
/*    */   public final boolean jdoIsPersistent()
/*    */   {
/*    */     return this.jdoStateManager != null ? this.jdoStateManager.isPersistent(this) : false;
/*    */   }
/*    */ 
/*    */   public final boolean jdoIsTransactional()
/*    */   {
/*    */     return this.jdoStateManager != null ? this.jdoStateManager.isTransactional(this) : false;
/*    */   }
/*    */ 
/*    */   public void jdoMakeDirty(String fieldName)
/*    */   {
/*    */     if (this.jdoStateManager != null)
/*    */       this.jdoStateManager.makeDirty(this, fieldName);
/*    */   }
/*    */ 
/*    */   public final Object jdoNewObjectIdInstance()
/*    */   {
/*    */     return new ObjectIdentity(getClass(), this.id);
/*    */   }
/*    */ 
/*    */   public final Object jdoNewObjectIdInstance(Object key)
/*    */   {
/*    */     if (key == null)
/*    */       throw new IllegalArgumentException("key is null");
/*    */     if (!(key instanceof String))
/*    */       return new ObjectIdentity(getClass(), key);
/*    */     return new ObjectIdentity(getClass(), (String)key);
/*    */   }
/*    */ 
/*    */   public final void jdoProvideFields(int[] indices)
/*    */   {
/*    */     if (indices == null)
/*    */       throw new IllegalArgumentException("argment is null");
/*    */     int i = indices.length - 1;
/*    */     if (i >= 0)
/*    */       do
/*    */       {
/*    */         jdoProvideField(indices[i]);
/*    */         i--;
/*    */       }
/*    */       while (i >= 0);
/*    */   }
/*    */ 
/*    */   public final void jdoReplaceFields(int[] indices)
/*    */   {
/*    */     if (indices == null)
/*    */       throw new IllegalArgumentException("argument is null");
/*    */     int i = indices.length;
/*    */     if (i > 0)
/*    */     {
/*    */       int j = 0;
/*    */       do
/*    */       {
/*    */         jdoReplaceField(indices[j]);
/*    */         j++;
/*    */       }
/*    */       while (j < i);
/*    */     }
/*    */   }
/*    */ 
/*    */   public final void jdoReplaceFlags()
/*    */   {
/*    */     if (this.jdoStateManager != null)
/*    */       this.jdoFlags = this.jdoStateManager.replacingFlags(this);
/*    */   }
/*    */ 
/*    */   public final synchronized void jdoReplaceStateManager(StateManager sm)
/*    */   {
/*    */     if (this.jdoStateManager != null)
/*    */     {
/*    */       this.jdoStateManager = this.jdoStateManager.replacingStateManager(this, sm);
/*    */     }
/*    */     else
/*    */     {
/*    */       JDOImplHelper.checkAuthorizedStateManager(sm);
/*    */       this.jdoStateManager = sm;
/*    */       this.jdoFlags = 1;
/*    */     }
/*    */   }
/*    */ 
/*    */   public boolean jdoIsDetached()
/*    */   {
/*    */     return false;
/*    */   }
/*    */ 
/*    */   public javax.jdo.spi.PersistenceCapable jdoNewInstance(StateManager sm)
/*    */   {
/*    */     Image result = new Image();
/*    */     result.jdoFlags = 1;
/*    */     result.jdoStateManager = sm;
/*    */     return result;
/*    */   }
/*    */ 
/*    */   public javax.jdo.spi.PersistenceCapable jdoNewInstance(StateManager sm, Object obj)
/*    */   {
/*    */     Image result = new Image();
/*    */     result.jdoFlags = 1;
/*    */     result.jdoStateManager = sm;
/*    */     result.jdoCopyKeyFieldsFromObjectId(obj);
/*    */     return result;
/*    */   }
/*    */ 
/*    */   public void jdoReplaceField(int index)
/*    */   {
/*    */     if (this.jdoStateManager == null)
/*    */       throw new IllegalStateException("state manager is null");
/*    */     switch (index)
/*    */     {
/*    */     case 0:
/*    */       this.desc = this.jdoStateManager.replacingStringField(this, index);
/*    */       break;
/*    */     case 1:
/*    */       this.id = ((Key)this.jdoStateManager.replacingObjectField(this, index));
/*    */       break;
/*    */     case 2:
/*    */       this.image = ((Blob)this.jdoStateManager.replacingObjectField(this, index));
/*    */       break;
/*    */     case 3:
/*    */       this.name = this.jdoStateManager.replacingStringField(this, index);
/*    */       break;
/*    */     default:
/*    */       throw new IllegalArgumentException("out of field index :" + index);
/*    */     }
/*    */   }
/*    */ 
/*    */   public void jdoProvideField(int index)
/*    */   {
/*    */     if (this.jdoStateManager == null)
/*    */       throw new IllegalStateException("state manager is null");
/*    */     switch (index)
/*    */     {
/*    */     case 0:
/*    */       this.jdoStateManager.providedStringField(this, index, this.desc);
/*    */       break;
/*    */     case 1:
/*    */       this.jdoStateManager.providedObjectField(this, index, this.id);
/*    */       break;
/*    */     case 2:
/*    */       this.jdoStateManager.providedObjectField(this, index, this.image);
/*    */       break;
/*    */     case 3:
/*    */       this.jdoStateManager.providedStringField(this, index, this.name);
/*    */       break;
/*    */     default:
/*    */       throw new IllegalArgumentException("out of field index :" + index);
/*    */     }
/*    */   }
/*    */ 
/*    */   protected final void jdoCopyField(Image obj, int index)
/*    */   {
/*    */     switch (index)
/*    */     {
/*    */     case 0:
/*    */       this.desc = obj.desc;
/*    */       break;
/*    */     case 1:
/*    */       this.id = obj.id;
/*    */       break;
/*    */     case 2:
/*    */       this.image = obj.image;
/*    */       break;
/*    */     case 3:
/*    */       this.name = obj.name;
/*    */       break;
/*    */     default:
/*    */       throw new IllegalArgumentException("out of field index :" + index);
/*    */     }
/*    */   }
/*    */ 
/*    */   public void jdoCopyFields(Object obj, int[] indices)
/*    */   {
/*    */     if (this.jdoStateManager == null)
/*    */       throw new IllegalStateException("state manager is null");
/*    */     if (indices == null)
/*    */       throw new IllegalStateException("fieldNumbers is null");
/*    */     if (!(obj instanceof Image))
/*    */       throw new IllegalArgumentException("object is not an object of type gaeupload.Image");
/*    */     Image other = (Image)obj;
/*    */     if (this.jdoStateManager != other.jdoStateManager)
/*    */       throw new IllegalArgumentException("state managers do not match");
/*    */     int i = indices.length - 1;
/*    */     if (i >= 0)
/*    */       do
/*    */       {
/*    */         jdoCopyField(other, indices[i]);
/*    */         i--;
/*    */       }
/*    */       while (i >= 0);
/*    */   }
/*    */ 
/*    */   private static final String[] __jdoFieldNamesInit()
/*    */   {
/*    */     return new String[] { "desc", "id", "image", "name" };
/*    */   }
/*    */ 
/*    */   private static final Class[] __jdoFieldTypesInit()
/*    */   {
/*    */     return new Class[] { ___jdo$loadClass("java.lang.String"), ___jdo$loadClass("com.google.appengine.api.datastore.Key"), ___jdo$loadClass("com.google.appengine.api.datastore.Blob"), ___jdo$loadClass("java.lang.String") };
/*    */   }
/*    */ 
/*    */   private static final byte[] __jdoFieldFlagsInit()
/*    */   {
/*    */     return new byte[] { 21, 24, 21, 21 };
/*    */   }
/*    */ 
/*    */   protected static int __jdoGetInheritedFieldCount()
/*    */   {
/*    */     return 0;
/*    */   }
/*    */ 
/*    */   protected static int jdoGetManagedFieldCount()
/*    */   {
/*    */     return 4;
/*    */   }
/*    */ 
/*    */   private static Class __jdoPersistenceCapableSuperclassInit()
/*    */   {
/*    */     return null;
/*    */   }
/*    */ 
/*    */   public static Class ___jdo$loadClass(String className)
/*    */   {
/*    */     try
/*    */     {
/*  8 */       return Class.forName(className); } catch (ClassNotFoundException e) { throw new NoClassDefFoundError(e.getMessage()); }
/*    */ 
/*    */   }
/*    */ 
/*    */   private Object jdoSuperClone()
/*    */     throws CloneNotSupportedException
/*    */   {
/*    */     Image o = (Image)super.clone();
/*    */     o.jdoFlags = 0;
/*    */     o.jdoStateManager = null;
/*    */     return o;
/*    */   }
/*    */ 
/*    */   private static String jdoGetdesc(Image objPC)
/*    */   {
/*    */     if ((objPC.jdoFlags > 0) && (objPC.jdoStateManager != null) && (!objPC.jdoStateManager.isLoaded(objPC, 0)))
/*    */       return objPC.jdoStateManager.getStringField(objPC, 0, objPC.desc);
/*    */     return objPC.desc;
/*    */   }
/*    */ 
/*    */   private static void jdoSetdesc(Image objPC, String val)
/*    */   {
/*    */     if ((objPC.jdoFlags != 0) && (objPC.jdoStateManager != null))
/*    */       objPC.jdoStateManager.setStringField(objPC, 0, objPC.desc, val);
/*    */     else
/*    */       objPC.desc = val;
/*    */   }
/*    */ 
/*    */   private static Key jdoGetid(Image objPC)
/*    */   {
/*    */     return objPC.id;
/*    */   }
/*    */ 
/*    */   private static void jdoSetid(Image objPC, Key val)
/*    */   {
/*    */     if (objPC.jdoStateManager == null)
/*    */       objPC.id = val;
/*    */     else
/*    */       objPC.jdoStateManager.setObjectField(objPC, 1, objPC.id, val);
/*    */   }
/*    */ 
/*    */   private static Blob jdoGetimage(Image objPC)
/*    */   {
/*    */     if ((objPC.jdoFlags > 0) && (objPC.jdoStateManager != null) && (!objPC.jdoStateManager.isLoaded(objPC, 2)))
/*    */       return (Blob)objPC.jdoStateManager.getObjectField(objPC, 2, objPC.image);
/*    */     return objPC.image;
/*    */   }
/*    */ 
/*    */   private static void jdoSetimage(Image objPC, Blob val)
/*    */   {
/*    */     if ((objPC.jdoFlags != 0) && (objPC.jdoStateManager != null))
/*    */       objPC.jdoStateManager.setObjectField(objPC, 2, objPC.image, val);
/*    */     else
/*    */       objPC.image = val;
/*    */   }
/*    */ 
/*    */   private static String jdoGetname(Image objPC)
/*    */   {
/*    */     if ((objPC.jdoFlags > 0) && (objPC.jdoStateManager != null) && (!objPC.jdoStateManager.isLoaded(objPC, 3)))
/*    */       return objPC.jdoStateManager.getStringField(objPC, 3, objPC.name);
/*    */     return objPC.name;
/*    */   }
/*    */ 
/*    */   private static void jdoSetname(Image objPC, String val)
/*    */   {
/*    */     if ((objPC.jdoFlags != 0) && (objPC.jdoStateManager != null))
/*    */       objPC.jdoStateManager.setStringField(objPC, 3, objPC.name, val);
/*    */     else
/*    */       objPC.name = val;
/*    */   }
/*    */ }

/* Location:           Z:\home\fernando\proyectos\image-uploader-gae-java\WEB-INF\classes\
 * Qualified Name:     gaeupload.Image
 * JD-Core Version:    0.6.2
 */