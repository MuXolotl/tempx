package defpackage;

import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: renamed from: l٘ۤٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18318l {
    public final ConcurrentHashMap yandex = new ConcurrentHashMap();
    public static final C3797l loadAd = new C3797l("LibraryVersion", "");
    public static final C18318l crashlytics = new C18318l();

    public final String yandex(String str) throws Throwable {
        IOException e;
        String str2;
        InputStream resourceAsStream;
        C3797l c3797l = loadAd;
        AbstractC1051l.mopub(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.yandex;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        property = null;
        String property = null;
        InputStream inputStream2 = null;
        try {
            try {
                resourceAsStream = C18318l.class.getResourceAsStream("/" + str + ".properties");
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        property = properties.getProperty("version", null);
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
                        sb.append(str);
                        sb.append(" version is ");
                        sb.append(property);
                        String string = sb.toString();
                        if (Log.isLoggable((String) c3797l.f7903l, 2)) {
                            Log.v("LibraryVersion", c3797l.m1424extends(string));
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                        sb2.append("Failed to get app version for libraryName: ");
                        sb2.append(str);
                        String string2 = sb2.toString();
                        if (Log.isLoggable((String) c3797l.f7903l, 5)) {
                            Log.w("LibraryVersion", c3797l.m1424extends(string2));
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    String str3 = property;
                    inputStream = resourceAsStream;
                    str2 = str3;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                    sb3.append("Failed to get app version for libraryName: ");
                    sb3.append(str);
                    String string3 = sb3.toString();
                    if (Log.isLoggable((String) c3797l.f7903l, 6)) {
                        Log.e("LibraryVersion", c3797l.m1424extends(string3), e);
                    }
                    InputStream inputStream3 = inputStream;
                    property = str2;
                    resourceAsStream = inputStream3;
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = resourceAsStream;
                    if (inputStream2 != null) {
                        AbstractC1051l.remoteconfig(inputStream2);
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                str2 = null;
            }
            if (resourceAsStream != null) {
                AbstractC1051l.remoteconfig(resourceAsStream);
            }
            if (property == null) {
                if (Log.isLoggable((String) c3797l.f7903l, 3)) {
                    Log.d("LibraryVersion", c3797l.m1424extends(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"));
                }
                property = "UNKNOWN";
            }
            concurrentHashMap.put(str, property);
            return property;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
