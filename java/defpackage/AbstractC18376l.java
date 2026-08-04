package defpackage;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l٘ۧۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18376l {
    public static final Map loadAd;
    public static final CopyOnWriteArraySet yandex = new CopyOnWriteArraySet();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = C11610l.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C11610l.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(AbstractC14207l.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C3097l.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        loadAd = AbstractC8676l.tapsense(linkedHashMap);
    }

    public static void loadAd(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (yandex.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(C16879l.yandex);
        }
    }

    public static void yandex(String str, int i, String str2, Throwable th) {
        int iMin;
        String strM3332l = (String) loadAd.get(str);
        if (strM3332l == null) {
            strM3332l = AbstractC12024l.m3332l(23, str);
        }
        if (Log.isLoggable(strM3332l, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int iM3321extends = AbstractC12024l.m3321extends(str2, '\n', i2, 4);
                if (iM3321extends == -1) {
                    iM3321extends = length;
                }
                while (true) {
                    iMin = Math.min(iM3321extends, i2 + 4000);
                    Log.println(i, strM3332l, str2.substring(i2, iMin));
                    if (iMin >= iM3321extends) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}
