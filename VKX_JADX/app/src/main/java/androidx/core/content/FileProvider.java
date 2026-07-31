package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import defpackage.AbstractC14814l;
import defpackage.AbstractC1757l;
import defpackage.AbstractC5646l;
import defpackage.C13817l;
import defpackage.C1759l;
import defpackage.C8339l;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public String f383l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f384l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f385l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C13817l f386l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final String[] f381l = {"_display_name", "_size"};

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final File f382l = new File("/");

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final HashMap f380l = new HashMap();

    public FileProvider(int i) {
        this.f385l = new Object();
        this.f384l = i;
    }

    public static Uri amazon(Context context, File file) {
        C13817l c13817lCrashlytics = crashlytics(0, context, "ua.itaysonlab.vkx.androidx-provider");
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : c13817lCrashlytics.loadAd.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (yandex(canonicalPath).startsWith(yandex(path).concat("/")) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                C8339l.metrica(AbstractC14814l.startapp("Failed to find configured root that contains ", canonicalPath));
                return null;
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme("content").authority(c13817lCrashlytics.yandex).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (IOException unused) {
            C1759l.ads(file, "Failed to resolve canonical path for ");
            return null;
        }
    }

    public static C13817l crashlytics(int i, Context context, String str) {
        C13817l c13817lPurchase;
        HashMap map = f380l;
        synchronized (map) {
            try {
                c13817lPurchase = (C13817l) map.get(str);
                if (c13817lPurchase == null) {
                    try {
                        try {
                            c13817lPurchase = purchase(i, context, str);
                            map.put(str, c13817lPurchase);
                        } catch (XmlPullParserException e) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                        }
                    } catch (IOException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c13817lPurchase;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b1  */
    public static C13817l purchase(int i, Context context, String str) throws XmlPullParserException, IOException {
        File externalStorageDirectory;
        C13817l c13817l = new C13817l(str);
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (providerInfoResolveContentProvider == null) {
            C8339l.metrica(AbstractC14814l.startapp("Couldn't find meta-data for provider with authority ", str));
            return null;
        }
        if (providerInfoResolveContentProvider.metaData == null && i != 0) {
            Bundle bundle = new Bundle(1);
            providerInfoResolveContentProvider.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData == null) {
            C8339l.metrica("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            return null;
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next == 1) {
                return c13817l;
            }
            if (next == 2) {
                String name = xmlResourceParserLoadXmlMetaData.getName();
                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    externalStorageDirectory = f382l;
                } else if ("files-path".equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs.length > 0) {
                        externalStorageDirectory = externalFilesDirs[0];
                    } else {
                        externalStorageDirectory = null;
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = context.getExternalCacheDirs();
                    if (externalCacheDirs.length > 0) {
                        externalStorageDirectory = externalCacheDirs[0];
                    } else {
                        externalStorageDirectory = null;
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        externalStorageDirectory = externalMediaDirs[0];
                    } else {
                        externalStorageDirectory = null;
                    }
                } else {
                    externalStorageDirectory = null;
                }
                if (externalStorageDirectory == null) {
                    continue;
                } else {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        externalStorageDirectory = new File(externalStorageDirectory, str2);
                    }
                    if (TextUtils.isEmpty(attributeValue)) {
                        C8339l.metrica("Name must not be empty");
                        return null;
                    }
                    try {
                        c13817l.loadAd.put(attributeValue, externalStorageDirectory.getCanonicalFile());
                    } catch (IOException e) {
                        throw new IllegalArgumentException("Failed to resolve canonical path for " + externalStorageDirectory, e);
                    }
                }
            }
        }
    }

    public static String yandex(String str) {
        return (str.length() <= 0 || str.charAt(str.length() - 1) != '/') ? str : AbstractC1757l.m1035native(1, 0, str);
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority;
        if (str == null || str.trim().isEmpty()) {
            throw new SecurityException("Provider must have a non-empty authority");
        }
        String str2 = providerInfo.authority.split(";")[0];
        synchronized (this.f385l) {
            this.f383l = str2;
        }
        HashMap map = f380l;
        synchronized (map) {
            map.remove(str2);
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return loadAd().yandex(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File fileYandex = loadAd().yandex(uri);
        int iLastIndexOf = fileYandex.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileYandex.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public final C13817l loadAd() {
        C13817l c13817l;
        synchronized (this.f385l) {
            try {
                AbstractC5646l.metrica(this.f383l, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                if (this.f386l == null) {
                    this.f386l = crashlytics(this.f384l, getContext(), this.f383l);
                }
                c13817l = this.f386l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c13817l;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File fileYandex = loadAd().yandex(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                C8339l.metrica(AbstractC14814l.startapp("Invalid mode: ", str));
                return null;
            }
            i = 1006632960;
        }
        return ParcelFileDescriptor.open(fileYandex, i);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File fileYandex = loadAd().yandex(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f381l;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? fileYandex.getName() : queryParameter;
            } else {
                if ("_size".equals(str3)) {
                    strArr3[i2] = "_size";
                    i = i2 + 1;
                    objArr[i2] = Long.valueOf(fileYandex.length());
                }
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public FileProvider() {
        this(0);
    }
}
