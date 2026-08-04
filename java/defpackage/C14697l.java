package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: lٔؗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14697l {
    public volatile boolean amazon;
    public final C6760l yandex = new C6760l(11);
    public final LinkedHashMap loadAd = new LinkedHashMap();
    public final LinkedHashSet crashlytics = new LinkedHashSet();

    public static void yandex(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                AbstractC12589l.m3425synchronized(autoCloseable);
            } catch (Exception e) {
                C11467l.metrica(e);
            }
        }
    }
}
