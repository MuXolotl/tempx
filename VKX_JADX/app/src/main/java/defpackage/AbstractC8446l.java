package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: lًٌۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8446l {
    public static final HashMap yandex = new HashMap();
    public static final HashSet loadAd = new HashSet();

    public static C0607l amazon(Context context, ZipInputStream zipInputStream, String str) {
        C10712l c10712lYandex;
        C3547l c3547l;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            c10712lYandex = null;
        } else {
            try {
                c10712lYandex = C16032l.loadAd.yandex(str);
            } catch (IOException e) {
                return new C0607l(e);
            }
        }
        if (c10712lYandex != null) {
            return new C0607l(c10712lYandex);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        C10712l c10712l = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                C1503l c1503l = new C1503l(AbstractC7709l.purchase(zipInputStream));
                String[] strArr = AbstractC9542l.f19444l;
                c10712l = loadAd(new C3122l(c1503l), null, false).yandex;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new C0607l(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    AbstractC17968l.crashlytics("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th5);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    AbstractC17968l.loadAd("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (c10712l == null) {
            return new C0607l(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) c10712l.crashlytics()).values().iterator();
            do {
                if (!it.hasNext()) {
                    c3547l = null;
                    break;
                }
                c3547l = (C3547l) it.next();
            } while (!c3547l.amazon.equals(str4));
            if (c3547l != null) {
                c3547l.billing = AbstractC4218l.amazon((Bitmap) entry.getValue(), c3547l.yandex, c3547l.loadAd);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (C4362l c4362l : c10712l.billing.values()) {
                if (c4362l.yandex.equals(entry2.getKey())) {
                    c4362l.crashlytics = (Typeface) entry2.getValue();
                    z = true;
                }
            }
            if (!z) {
                AbstractC17968l.loadAd("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) c10712l.crashlytics()).entrySet().iterator();
            while (it2.hasNext()) {
                C3547l c3547l2 = (C3547l) ((Map.Entry) it2.next()).getValue();
                if (c3547l2 == null) {
                    return null;
                }
                String str5 = c3547l2.amazon;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            c3547l2.billing = AbstractC4218l.amazon(bitmapDecodeByteArray, c3547l2.yandex, c3547l2.loadAd);
                        }
                    } catch (IllegalArgumentException e2) {
                        AbstractC17968l.crashlytics("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            C16032l.loadAd.yandex.crashlytics(str, c10712l);
        }
        return new C0607l(c10712l);
    }

    public static C0607l crashlytics(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return amazon(context, zipInputStream, str);
        } finally {
            AbstractC4218l.loadAd(zipInputStream);
        }
    }

    public static C0607l loadAd(C3122l c3122l, String str, boolean z) {
        try {
            C10712l c10712lYandex = str == null ? null : C16032l.loadAd.yandex(str);
            if (c10712lYandex != null) {
                return new C0607l(c10712lYandex);
            }
            C10712l c10712lYandex2 = AbstractC4699l.yandex(c3122l);
            if (str != null) {
                C16032l.loadAd.yandex.crashlytics(str, c10712lYandex2);
            }
            return new C0607l(c10712lYandex2);
        } catch (Exception e) {
            return new C0607l(e);
        } finally {
            if (z) {
                AbstractC4218l.loadAd(c3122l);
            }
        }
    }

    public static void purchase() {
        ArrayList arrayList = new ArrayList(loadAd);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        C18725l.loadAd();
    }

    public static C0607l yandex(InputStream inputStream, String str) {
        C1503l c1503l = new C1503l(AbstractC7709l.purchase(inputStream));
        String[] strArr = AbstractC9542l.f19444l;
        return loadAd(new C3122l(c1503l), str, true);
    }
}
