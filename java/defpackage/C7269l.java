package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: lٌؚٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7269l {
    public static boolean admob = false;
    public static final C2183l amazon;
    public static Boolean billing = null;
    public static final C6760l crashlytics;
    public static Boolean isPro = null;
    public static final C6096l loadAd;
    public static C15663l metrica = null;
    public static String mopub = null;
    public static final C6565l purchase;
    public static int subs = -1;
    public static C9436l vip;
    public final Context yandex;
    public static final ThreadLocal firebase = new ThreadLocal();
    public static final C17548l smaato = new C17548l(17);
    public static final C4269l remoteconfig = new C4269l(22);

    static {
        int i = 24;
        loadAd = new C6096l(i);
        crashlytics = new C6760l(i);
        amazon = new C2183l(i);
        purchase = new C6565l(i);
    }

    public C7269l(Context context) {
        this.yandex = context;
    }

    public static C9436l admob(Context context) {
        C9436l c9436l;
        synchronized (C7269l.class) {
            C9436l c9436l2 = vip;
            if (c9436l2 != null) {
                return c9436l2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c9436l = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c9436l = iInterfaceQueryLocalInterface instanceof C9436l ? (C9436l) iInterfaceQueryLocalInterface : new C9436l(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 2);
                }
                if (c9436l != null) {
                    vip = c9436l;
                    return c9436l;
                }
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0191  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4 A[Catch: all -> 0x003b, TryCatch #13 {all -> 0x003b, blocks: (B:10:0x002b, B:12:0x0037, B:52:0x00bd, B:17:0x0040, B:19:0x0047, B:21:0x004d, B:26:0x0054, B:28:0x0058, B:31:0x0061, B:33:0x0069, B:36:0x0070, B:43:0x009c, B:44:0x00a4, B:39:0x0077, B:41:0x007d, B:42:0x008e, B:47:0x00a7, B:50:0x00aa, B:51:0x00b4, B:18:0x0043), top: B:152:0x002b, inners: #11 }] */
    public static int amazon(Context context, String str, boolean z) {
        Throwable th;
        RemoteException remoteException;
        int i;
        Cursor cursor;
        try {
            synchronized (C7269l.class) {
                Boolean bool = billing;
                boolean z2 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        mopub(classLoader);
                                    } catch (C2315l unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!purchase(context)) {
                                        return 0;
                                    }
                                    if (admob) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iBilling = billing(context, str, z, true);
                                                String str2 = mopub;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderStartapp = AbstractC16670l.startapp();
                                                    if (classLoaderStartapp == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            AbstractC17114l.loadAd();
                                                            String str3 = mopub;
                                                            AbstractC1051l.subs(str3);
                                                            classLoaderStartapp = AbstractC17114l.yandex(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = mopub;
                                                            AbstractC1051l.subs(str4);
                                                            classLoaderStartapp = new C0024l(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    mopub(classLoaderStartapp);
                                                    declaredField.set(null, classLoaderStartapp);
                                                    billing = bool2;
                                                    return iBilling;
                                                }
                                                return iBilling;
                                            } catch (C2315l unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                billing = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                        String string = e.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(string);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return billing(context, str, z, false);
                    } catch (C2315l e2) {
                        String message = e2.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        Log.w("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                C9436l c9436lAdmob = admob(context);
                try {
                    if (c9436lAdmob == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelM748l = c9436lAdmob.m748l(c9436lAdmob.m743l(), 6);
                        int i2 = parcelM748l.readInt();
                        parcelM748l.recycle();
                        if (i2 >= 3) {
                            ThreadLocal threadLocal = firebase;
                            C1551l c1551l = (C1551l) threadLocal.get();
                            if (c1551l != null && (cursor = c1551l.yandex) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) BinderC14844l.m3897l(c9436lAdmob.m2659l(new BinderC14844l(context), str, z, ((Long) smaato.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i = cursor3.getInt(0);
                                        if (i > 0) {
                                            C1551l c1551l2 = (C1551l) threadLocal.get();
                                            if (c1551l2 == null || c1551l2.yandex != null) {
                                                z2 = false;
                                            } else {
                                                c1551l2.yandex = cursor3;
                                            }
                                            cursor2 = z2 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e3) {
                                    remoteException = e3;
                                    cursor2 = cursor3;
                                    String message2 = remoteException.getMessage();
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
                                    sb3.append("Failed to retrieve remote module version: ");
                                    sb3.append(message2);
                                    Log.w("DynamiteModule", sb3.toString());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th;
                                    }
                                    cursor2.close();
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            BinderC14844l binderC14844l = new BinderC14844l(context);
                            Parcel parcelM743l = c9436lAdmob.m743l();
                            AbstractC2020l.loadAd(parcelM743l, binderC14844l);
                            parcelM743l.writeString(str);
                            parcelM743l.writeInt(z ? 1 : 0);
                            Parcel parcelM748l2 = c9436lAdmob.m748l(parcelM743l, 5);
                            i = parcelM748l2.readInt();
                            parcelM748l2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            BinderC14844l binderC14844l2 = new BinderC14844l(context);
                            Parcel parcelM743l2 = c9436lAdmob.m743l();
                            AbstractC2020l.loadAd(parcelM743l2, binderC14844l2);
                            parcelM743l2.writeString(str);
                            parcelM743l2.writeInt(z ? 1 : 0);
                            Parcel parcelM748l3 = c9436lAdmob.m748l(parcelM743l2, 3);
                            i = parcelM748l3.readInt();
                            parcelM748l3.recycle();
                        }
                        return i;
                    } catch (RemoteException e4) {
                        remoteException = e4;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            try {
                AbstractC1051l.subs(context);
                throw th5;
            } catch (Exception e5) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e5);
                throw th5;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x013a A[PHI: r3
  0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    public static int billing(Context context, String str, boolean z, boolean z2) throws Throwable {
        Exception exc;
        Throwable th;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) smaato.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z5 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i = 0; i < count; i++) {
                                    if (!cursorQuery.moveToPosition(i)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i2 = 0; i2 < columnCount; i2++) {
                                        int type = cursorQuery.getType(i2);
                                        if (type == 0) {
                                            objArr[i2] = null;
                                        } else if (type == 1) {
                                            objArr[i2] = Long.valueOf(cursorQuery.getLong(i2));
                                        } else if (type == 2) {
                                            objArr[i2] = Double.valueOf(cursorQuery.getDouble(i2));
                                        } else if (type == 3) {
                                            objArr[i2] = cursorQuery.getString(i2);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i2] = cursorQuery.getBlob(i2);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i3 = matrixCursor.getInt(0);
                            if (i3 > 0) {
                                synchronized (C7269l.class) {
                                    try {
                                        mopub = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            subs = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = matrixCursor.getInt(columnIndex2) != 0;
                                            admob = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                C1551l c1551l = (C1551l) firebase.get();
                                if (c1551l == null || c1551l.yandex != null) {
                                    z4 = false;
                                } else {
                                    c1551l.yandex = matrixCursor;
                                }
                                z5 = z3;
                                matrixCursor2 = z4 ? null : matrixCursor;
                            }
                            if (z2 && z5) {
                                throw new C2315l("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i3;
                        }
                    } catch (Exception e) {
                        exc = e;
                        if (exc instanceof C2315l) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                        sb.append("V2 version check failed: ");
                        sb.append(message);
                        throw new C2315l(sb.toString(), exc);
                    } catch (Throwable th6) {
                        th = th6;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new C2315l("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e2) {
                exc = e2;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0251 A[Catch: all -> 0x023a, lؔؐ۟ -> 0x023d, RemoteException -> 0x0240, TryCatch #10 {RemoteException -> 0x0240, lؔؐ۟ -> 0x023d, all -> 0x023a, blocks: (B:90:0x022b, B:103:0x0272, B:105:0x0278, B:106:0x0281, B:107:0x0288, B:97:0x0243, B:98:0x024c, B:101:0x0251, B:102:0x0262, B:108:0x0289, B:109:0x0292, B:110:0x0293, B:111:0x029c, B:119:0x02ad), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0262 A[Catch: all -> 0x023a, lؔؐ۟ -> 0x023d, RemoteException -> 0x0240, TryCatch #10 {RemoteException -> 0x0240, lؔؐ۟ -> 0x023d, all -> 0x023a, blocks: (B:90:0x022b, B:103:0x0272, B:105:0x0278, B:106:0x0281, B:107:0x0288, B:97:0x0243, B:98:0x024c, B:101:0x0251, B:102:0x0262, B:108:0x0289, B:109:0x0292, B:110:0x0293, B:111:0x029c, B:119:0x02ad), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0278 A[Catch: all -> 0x023a, lؔؐ۟ -> 0x023d, RemoteException -> 0x0240, TryCatch #10 {RemoteException -> 0x0240, lؔؐ۟ -> 0x023d, all -> 0x023a, blocks: (B:90:0x022b, B:103:0x0272, B:105:0x0278, B:106:0x0281, B:107:0x0288, B:97:0x0243, B:98:0x024c, B:101:0x0251, B:102:0x0262, B:108:0x0289, B:109:0x0292, B:110:0x0293, B:111:0x029c, B:119:0x02ad), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0281 A[Catch: all -> 0x023a, lؔؐ۟ -> 0x023d, RemoteException -> 0x0240, TryCatch #10 {RemoteException -> 0x0240, lؔؐ۟ -> 0x023d, all -> 0x023a, blocks: (B:90:0x022b, B:103:0x0272, B:105:0x0278, B:106:0x0281, B:107:0x0288, B:97:0x0243, B:98:0x024c, B:101:0x0251, B:102:0x0262, B:108:0x0289, B:109:0x0292, B:110:0x0293, B:111:0x029c, B:119:0x02ad), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0289 A[Catch: all -> 0x023a, lؔؐ۟ -> 0x023d, RemoteException -> 0x0240, TryCatch #10 {RemoteException -> 0x0240, lؔؐ۟ -> 0x023d, all -> 0x023a, blocks: (B:90:0x022b, B:103:0x0272, B:105:0x0278, B:106:0x0281, B:107:0x0288, B:97:0x0243, B:98:0x024c, B:101:0x0251, B:102:0x0262, B:108:0x0289, B:109:0x0292, B:110:0x0293, B:111:0x029c, B:119:0x02ad), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0293 A[Catch: all -> 0x023a, lؔؐ۟ -> 0x023d, RemoteException -> 0x0240, TryCatch #10 {RemoteException -> 0x0240, lؔؐ۟ -> 0x023d, all -> 0x023a, blocks: (B:90:0x022b, B:103:0x0272, B:105:0x0278, B:106:0x0281, B:107:0x0288, B:97:0x0243, B:98:0x024c, B:101:0x0251, B:102:0x0262, B:108:0x0289, B:109:0x0292, B:110:0x0293, B:111:0x029c, B:119:0x02ad), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:136:0x0315  */
    /* JADX WARN: Code duplicated, block: B:137:0x031b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0324  */
    /* JADX WARN: Code duplicated, block: B:145:0x0335 A[Catch: all -> 0x00c0, TryCatch #1 {all -> 0x00c0, blocks: (B:5:0x0042, B:9:0x00b9, B:16:0x00c5, B:19:0x00cb, B:32:0x00f9, B:120:0x02ae, B:121:0x02b5, B:129:0x02c4, B:131:0x02ec, B:133:0x02fd, B:143:0x032d, B:144:0x0334, B:124:0x02b8, B:125:0x02b9, B:126:0x02c0, B:145:0x0335, B:146:0x0355, B:147:0x0356, B:148:0x03a7), top: B:162:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00cb A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #1 {all -> 0x00c0, blocks: (B:5:0x0042, B:9:0x00b9, B:16:0x00c5, B:19:0x00cb, B:32:0x00f9, B:120:0x02ae, B:121:0x02b5, B:129:0x02c4, B:131:0x02ec, B:133:0x02fd, B:143:0x032d, B:144:0x0334, B:124:0x02b8, B:125:0x02b9, B:126:0x02c0, B:145:0x0335, B:146:0x0355, B:147:0x0356, B:148:0x03a7), top: B:162:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:37:0x0104 A[Catch: all -> 0x029d, TryCatch #11 {all -> 0x029d, blocks: (B:35:0x00fe, B:37:0x0104, B:38:0x0106), top: B:166:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0109 A[Catch: all -> 0x0184, lؔؐ۟ -> 0x0189, RemoteException -> 0x018e, TRY_ENTER, TryCatch #11 {RemoteException -> 0x018e, lؔؐ۟ -> 0x0189, all -> 0x0184, blocks: (B:34:0x00fd, B:40:0x0109, B:42:0x0110, B:43:0x0143, B:47:0x0149, B:49:0x0151, B:51:0x0155, B:52:0x0163, B:59:0x016e, B:67:0x01a8, B:69:0x01b0, B:70:0x01b7, B:71:0x01be, B:66:0x0193, B:74:0x01c1, B:75:0x01c2, B:76:0x01c9, B:77:0x01ca, B:78:0x01d1, B:81:0x01d4, B:82:0x01d5, B:84:0x020c, B:86:0x021f, B:88:0x0227), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0110 A[Catch: all -> 0x0184, lؔؐ۟ -> 0x0189, RemoteException -> 0x018e, TryCatch #11 {RemoteException -> 0x018e, lؔؐ۟ -> 0x0189, all -> 0x0184, blocks: (B:34:0x00fd, B:40:0x0109, B:42:0x0110, B:43:0x0143, B:47:0x0149, B:49:0x0151, B:51:0x0155, B:52:0x0163, B:59:0x016e, B:67:0x01a8, B:69:0x01b0, B:70:0x01b7, B:71:0x01be, B:66:0x0193, B:74:0x01c1, B:75:0x01c2, B:76:0x01c9, B:77:0x01ca, B:78:0x01d1, B:81:0x01d4, B:82:0x01d5, B:84:0x020c, B:86:0x021f, B:88:0x0227), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0149 A[Catch: all -> 0x0184, lؔؐ۟ -> 0x0189, RemoteException -> 0x018e, TRY_ENTER, TryCatch #11 {RemoteException -> 0x018e, lؔؐ۟ -> 0x0189, all -> 0x0184, blocks: (B:34:0x00fd, B:40:0x0109, B:42:0x0110, B:43:0x0143, B:47:0x0149, B:49:0x0151, B:51:0x0155, B:52:0x0163, B:59:0x016e, B:67:0x01a8, B:69:0x01b0, B:70:0x01b7, B:71:0x01be, B:66:0x0193, B:74:0x01c1, B:75:0x01c2, B:76:0x01c9, B:77:0x01ca, B:78:0x01d1, B:81:0x01d4, B:82:0x01d5, B:84:0x020c, B:86:0x021f, B:88:0x0227), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01ca A[Catch: all -> 0x0184, lؔؐ۟ -> 0x0189, RemoteException -> 0x018e, TryCatch #11 {RemoteException -> 0x018e, lؔؐ۟ -> 0x0189, all -> 0x0184, blocks: (B:34:0x00fd, B:40:0x0109, B:42:0x0110, B:43:0x0143, B:47:0x0149, B:49:0x0151, B:51:0x0155, B:52:0x0163, B:59:0x016e, B:67:0x01a8, B:69:0x01b0, B:70:0x01b7, B:71:0x01be, B:66:0x0193, B:74:0x01c1, B:75:0x01c2, B:76:0x01c9, B:77:0x01ca, B:78:0x01d1, B:81:0x01d4, B:82:0x01d5, B:84:0x020c, B:86:0x021f, B:88:0x0227), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01d5 A[Catch: all -> 0x0184, lؔؐ۟ -> 0x0189, RemoteException -> 0x018e, TryCatch #11 {RemoteException -> 0x018e, lؔؐ۟ -> 0x0189, all -> 0x0184, blocks: (B:34:0x00fd, B:40:0x0109, B:42:0x0110, B:43:0x0143, B:47:0x0149, B:49:0x0151, B:51:0x0155, B:52:0x0163, B:59:0x016e, B:67:0x01a8, B:69:0x01b0, B:70:0x01b7, B:71:0x01be, B:66:0x0193, B:74:0x01c1, B:75:0x01c2, B:76:0x01c9, B:77:0x01ca, B:78:0x01d1, B:81:0x01d4, B:82:0x01d5, B:84:0x020c, B:86:0x021f, B:88:0x0227), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:84:0x020c A[Catch: all -> 0x0184, lؔؐ۟ -> 0x0189, RemoteException -> 0x018e, TryCatch #11 {RemoteException -> 0x018e, lؔؐ۟ -> 0x0189, all -> 0x0184, blocks: (B:34:0x00fd, B:40:0x0109, B:42:0x0110, B:43:0x0143, B:47:0x0149, B:49:0x0151, B:51:0x0155, B:52:0x0163, B:59:0x016e, B:67:0x01a8, B:69:0x01b0, B:70:0x01b7, B:71:0x01be, B:66:0x0193, B:74:0x01c1, B:75:0x01c2, B:76:0x01c9, B:77:0x01ca, B:78:0x01d1, B:81:0x01d4, B:82:0x01d5, B:84:0x020c, B:86:0x021f, B:88:0x0227), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:86:0x021f A[Catch: all -> 0x0184, lؔؐ۟ -> 0x0189, RemoteException -> 0x018e, TryCatch #11 {RemoteException -> 0x018e, lؔؐ۟ -> 0x0189, all -> 0x0184, blocks: (B:34:0x00fd, B:40:0x0109, B:42:0x0110, B:43:0x0143, B:47:0x0149, B:49:0x0151, B:51:0x0155, B:52:0x0163, B:59:0x016e, B:67:0x01a8, B:69:0x01b0, B:70:0x01b7, B:71:0x01be, B:66:0x0193, B:74:0x01c1, B:75:0x01c2, B:76:0x01c9, B:77:0x01ca, B:78:0x01d1, B:81:0x01d4, B:82:0x01d5, B:84:0x020c, B:86:0x021f, B:88:0x0227), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0227 A[Catch: all -> 0x0184, lؔؐ۟ -> 0x0189, RemoteException -> 0x018e, TRY_LEAVE, TryCatch #11 {RemoteException -> 0x018e, lؔؐ۟ -> 0x0189, all -> 0x0184, blocks: (B:34:0x00fd, B:40:0x0109, B:42:0x0110, B:43:0x0143, B:47:0x0149, B:49:0x0151, B:51:0x0155, B:52:0x0163, B:59:0x016e, B:67:0x01a8, B:69:0x01b0, B:70:0x01b7, B:71:0x01be, B:66:0x0193, B:74:0x01c1, B:75:0x01c2, B:76:0x01c9, B:77:0x01ca, B:78:0x01d1, B:81:0x01d4, B:82:0x01d5, B:84:0x020c, B:86:0x021f, B:88:0x0227), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0243 A[Catch: all -> 0x023a, lؔؐ۟ -> 0x023d, RemoteException -> 0x0240, TryCatch #10 {RemoteException -> 0x0240, lؔؐ۟ -> 0x023d, all -> 0x023a, blocks: (B:90:0x022b, B:103:0x0272, B:105:0x0278, B:106:0x0281, B:107:0x0288, B:97:0x0243, B:98:0x024c, B:101:0x0251, B:102:0x0262, B:108:0x0289, B:109:0x0292, B:110:0x0293, B:111:0x029c, B:119:0x02ad), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:99:0x024d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r30v0, types: [lّٓٛ] */
    public static C7269l crashlytics(Context context, InterfaceC14257l interfaceC14257l, String str) throws C2315l {
        ?? r10;
        int i;
        C7269l c7269l;
        Cursor cursor;
        int i2;
        Boolean bool;
        C9436l c9436lAdmob;
        int i3;
        InterfaceC3396l interfaceC3396lM2661l;
        Object objM3897l;
        C1551l c1551l;
        C15663l c15663l;
        C1551l c1551l2;
        boolean z;
        InterfaceC3396l interfaceC3396lM4105l;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new C2315l("null application Context");
        }
        ThreadLocal threadLocal = firebase;
        C1551l c1551l3 = (C1551l) threadLocal.get();
        C1551l c1551l4 = new C1551l();
        threadLocal.set(c1551l4);
        C17548l c17548l = smaato;
        Long l = (Long) c17548l.get();
        long jLongValue = l.longValue();
        try {
            c17548l.set(Long.valueOf(SystemClock.uptimeMillis()));
            C15380l c15380lMetrica = interfaceC14257l.metrica(context, str, remoteconfig);
            String str2 = "DynamiteModule";
            int i4 = c15380lMetrica.loadAd;
            int i5 = c15380lMetrica.crashlytics;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(i4).length() + 19 + String.valueOf(str).length() + 1 + String.valueOf(i5).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i4);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i5);
            Log.i("DynamiteModule", sb.toString());
            int i6 = c15380lMetrica.amazon;
            if (i6 != 0) {
                if (i6 != -1) {
                    if (i6 == 1 || c15380lMetrica.crashlytics != 0) {
                        if (i6 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                            C7269l c7269l2 = new C7269l(applicationContext);
                            if (jLongValue == 0) {
                                c17548l.remove();
                            } else {
                                c17548l.set(l);
                            }
                            cursor2 = c1551l4.yandex;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(c1551l3);
                            return c7269l2;
                        }
                        if (i6 == 1) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + 36);
                            sb2.append("VersionPolicy returned invalid code:");
                            sb2.append(i6);
                            throw new C2315l(sb2.toString());
                        }
                        byte b = 0;
                        try {
                            try {
                                i2 = c15380lMetrica.crashlytics;
                                try {
                                    try {
                                        try {
                                            synchronized (C7269l.class) {
                                                try {
                                                    if (purchase(context)) {
                                                        throw new C2315l("Remote loading disabled");
                                                    }
                                                    bool = billing;
                                                    if (bool != null) {
                                                        throw new C2315l("Failed to determine which loading route to use.");
                                                    }
                                                    if (bool.booleanValue()) {
                                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i2).length());
                                                        sb3.append("Selected remote version of ");
                                                        sb3.append(str);
                                                        sb3.append(", version >= ");
                                                        sb3.append(i2);
                                                        Log.i("DynamiteModule", sb3.toString());
                                                        synchronized (C7269l.class) {
                                                            c15663l = metrica;
                                                        }
                                                        if (c15663l != null) {
                                                            throw new C2315l("DynamiteLoaderV2 was not cached.");
                                                        }
                                                        c1551l2 = (C1551l) threadLocal.get();
                                                        if (c1551l2 != null || c1551l2.yandex == null) {
                                                            throw new C2315l("No result cursor");
                                                        }
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor3 = c1551l2.yandex;
                                                        new BinderC14844l(null);
                                                        synchronized (C7269l.class) {
                                                            z = subs >= 2;
                                                        }
                                                        if (z) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            interfaceC3396lM4105l = c15663l.m4104l(new BinderC14844l(applicationContext2), str, i2, new BinderC14844l(cursor3));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            interfaceC3396lM4105l = c15663l.m4105l(new BinderC14844l(applicationContext2), str, i2, new BinderC14844l(cursor3));
                                                        }
                                                        Context context2 = (Context) BinderC14844l.m3897l(interfaceC3396lM4105l);
                                                        if (context2 == null) {
                                                            throw new C2315l("Failed to get module context");
                                                        }
                                                        c7269l = new C7269l(context2);
                                                    } else {
                                                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i2).length());
                                                        sb4.append("Selected remote version of ");
                                                        sb4.append(str);
                                                        sb4.append(", version >= ");
                                                        sb4.append(i2);
                                                        Log.i("DynamiteModule", sb4.toString());
                                                        c9436lAdmob = admob(context);
                                                        if (c9436lAdmob != null) {
                                                            throw new C2315l("Failed to create IDynamiteLoader.");
                                                        }
                                                        Parcel parcelM748l = c9436lAdmob.m748l(c9436lAdmob.m743l(), 6);
                                                        i3 = parcelM748l.readInt();
                                                        parcelM748l.recycle();
                                                        if (i3 >= 3) {
                                                            c1551l = (C1551l) threadLocal.get();
                                                            if (c1551l != null) {
                                                                throw new C2315l("No cached result cursor holder");
                                                            }
                                                            interfaceC3396lM2661l = c9436lAdmob.m2660l(new BinderC14844l(context), str, i2, new BinderC14844l(c1551l.yandex));
                                                        } else if (i3 == 2) {
                                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                            interfaceC3396lM2661l = c9436lAdmob.m2658l(new BinderC14844l(context), str, i2);
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                            interfaceC3396lM2661l = c9436lAdmob.m2661l(new BinderC14844l(context), str, i2);
                                                        }
                                                        objM3897l = BinderC14844l.m3897l(interfaceC3396lM2661l);
                                                        if (objM3897l != null) {
                                                            throw new C2315l("Failed to load remote module.");
                                                        }
                                                        c7269l = new C7269l((Context) objM3897l);
                                                    }
                                                    if (jLongValue == 0) {
                                                        smaato.remove();
                                                    } else {
                                                        smaato.set(l);
                                                    }
                                                    cursor = c1551l4.yandex;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    firebase.set(c1551l3);
                                                    return c7269l;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    throw th;
                                                }
                                            }
                                        } catch (RemoteException e) {
                                            e = e;
                                            throw new C2315l("Failed to load remote module.", e);
                                        } catch (C2315l e2) {
                                            throw e2;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            throw new C2315l("Failed to load remote module.", th);
                                        }
                                    } catch (RemoteException e3) {
                                        e = e3;
                                        throw new C2315l("Failed to load remote module.", e);
                                    } catch (C2315l e4) {
                                        throw e4;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw new C2315l("Failed to load remote module.", th);
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (C2315l e5) {
                                e = e5;
                                r10 = str2;
                                String message = e.getMessage();
                                StringBuilder sb5 = new StringBuilder(String.valueOf(message).length() + 30);
                                sb5.append("Failed to load remote module: ");
                                sb5.append(message);
                                Log.w("DynamiteModule", sb5.toString());
                                i = c15380lMetrica.loadAd;
                                if (i != 0) {
                                }
                                throw new C2315l("Remote load failed. No local fallback found.", e);
                            }
                        } catch (C2315l e6) {
                            e = e6;
                            r10 = context;
                            String message2 = e.getMessage();
                            StringBuilder sb6 = new StringBuilder(String.valueOf(message2).length() + 30);
                            sb6.append("Failed to load remote module: ");
                            sb6.append(message2);
                            Log.w("DynamiteModule", sb6.toString());
                            i = c15380lMetrica.loadAd;
                            if (i != 0 || interfaceC14257l.metrica(r10, str, new C14513l(i, 25, b)).amazon != -1) {
                                throw new C2315l("Remote load failed. No local fallback found.", e);
                            }
                            Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                            c7269l = new C7269l(applicationContext);
                        }
                    }
                } else if (c15380lMetrica.loadAd != 0) {
                    i6 = -1;
                    if (i6 == 1) {
                    }
                    if (i6 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                        C7269l c7269l3 = new C7269l(applicationContext);
                        if (jLongValue == 0) {
                            c17548l.remove();
                        } else {
                            c17548l.set(l);
                        }
                        cursor2 = c1551l4.yandex;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(c1551l3);
                        return c7269l3;
                    }
                    if (i6 == 1) {
                        StringBuilder sb7 = new StringBuilder(String.valueOf(i6).length() + 36);
                        sb7.append("VersionPolicy returned invalid code:");
                        sb7.append(i6);
                        throw new C2315l(sb7.toString());
                    }
                    byte b2 = 0;
                    i2 = c15380lMetrica.crashlytics;
                    synchronized (C7269l.class) {
                        if (purchase(context)) {
                            throw new C2315l("Remote loading disabled");
                        }
                        bool = billing;
                        if (bool != null) {
                            throw new C2315l("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb8 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i2).length());
                            sb8.append("Selected remote version of ");
                            sb8.append(str);
                            sb8.append(", version >= ");
                            sb8.append(i2);
                            Log.i("DynamiteModule", sb8.toString());
                            synchronized (C7269l.class) {
                                c15663l = metrica;
                                if (c15663l != null) {
                                    throw new C2315l("DynamiteLoaderV2 was not cached.");
                                }
                                c1551l2 = (C1551l) threadLocal.get();
                                if (c1551l2 != null) {
                                }
                                throw new C2315l("No result cursor");
                            }
                        }
                        StringBuilder sb9 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i2).length());
                        sb9.append("Selected remote version of ");
                        sb9.append(str);
                        sb9.append(", version >= ");
                        sb9.append(i2);
                        Log.i("DynamiteModule", sb9.toString());
                        c9436lAdmob = admob(context);
                        if (c9436lAdmob != null) {
                            throw new C2315l("Failed to create IDynamiteLoader.");
                        }
                        Parcel parcelM748l2 = c9436lAdmob.m748l(c9436lAdmob.m743l(), 6);
                        i3 = parcelM748l2.readInt();
                        parcelM748l2.recycle();
                        if (i3 >= 3) {
                            c1551l = (C1551l) threadLocal.get();
                            if (c1551l != null) {
                                throw new C2315l("No cached result cursor holder");
                            }
                            interfaceC3396lM2661l = c9436lAdmob.m2660l(new BinderC14844l(context), str, i2, new BinderC14844l(c1551l.yandex));
                        } else if (i3 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            interfaceC3396lM2661l = c9436lAdmob.m2658l(new BinderC14844l(context), str, i2);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            interfaceC3396lM2661l = c9436lAdmob.m2661l(new BinderC14844l(context), str, i2);
                        }
                        objM3897l = BinderC14844l.m3897l(interfaceC3396lM2661l);
                        if (objM3897l != null) {
                            throw new C2315l("Failed to load remote module.");
                        }
                        c7269l = new C7269l((Context) objM3897l);
                        if (jLongValue == 0) {
                            smaato.remove();
                        } else {
                            smaato.set(l);
                        }
                        cursor = c1551l4.yandex;
                        if (cursor != null) {
                            cursor.close();
                        }
                        firebase.set(c1551l3);
                        return c7269l;
                    }
                }
            }
            int i7 = c15380lMetrica.loadAd;
            int i8 = c15380lMetrica.crashlytics;
            StringBuilder sb10 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(i7).length() + 23 + String.valueOf(i8).length() + 1);
            sb10.append("No acceptable module ");
            sb10.append(str);
            sb10.append(" found. Local version is ");
            sb10.append(i7);
            sb10.append(" and remote version is ");
            sb10.append(i8);
            sb10.append(".");
            throw new C2315l(sb10.toString());
        } catch (Throwable th5) {
            if (jLongValue == 0) {
                smaato.remove();
            } else {
                smaato.set(l);
            }
            Cursor cursor4 = c1551l4.yandex;
            if (cursor4 != null) {
                cursor4.close();
            }
            firebase.set(c1551l3);
            throw th5;
        }
    }

    public static void mopub(ClassLoader classLoader) throws C2315l {
        try {
            C15663l c15663l = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                c15663l = iInterfaceQueryLocalInterface instanceof C15663l ? (C15663l) iInterfaceQueryLocalInterface : new C15663l(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 2);
            }
            metrica = c15663l;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C2315l("Failed to instantiate dynamite loader", e);
        }
    }

    public static boolean purchase(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(isPro)) {
            return true;
        }
        boolean z = false;
        if (isPro == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (C13268l.loadAd.crashlytics(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            isPro = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                admob = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    public static int yandex(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC7236l.amazon(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    public final IBinder loadAd(String str) {
        try {
            return (IBinder) this.yandex.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new C2315l("Failed to instantiate module class: ".concat(str), e);
        }
    }
}
