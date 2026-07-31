package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;

/* JADX INFO: renamed from: lٍٖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16293l {
    public final /* synthetic */ C6827l crashlytics;
    public final HashMap loadAd;
    public final C16091l yandex;

    public C16293l(C6827l c6827l, C16091l c16091l) {
        this.crashlytics = c6827l;
        this.yandex = c16091l;
        HashMap map = new HashMap();
        AbstractC10199l it = AbstractC8481l.ads(c16091l.loadAd.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) c16091l.loadAd.get(str);
            uri.getClass();
            map.put(uri, new C16456l(this.crashlytics, uri, str));
        }
        this.loadAd = map;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c6 A[RETURN] */
    public static boolean crashlytics(C16293l c16293l, Uri uri, long j) {
        boolean z;
        HashMap map = c16293l.loadAd;
        C16456l c16456l = (C16456l) AbstractC2812l.adcel(map, uri, uri);
        c16456l.getClass();
        c16456l.f32174l = SystemClock.elapsedRealtime() + j;
        C6827l c6827l = c16293l.crashlytics;
        C16091l c16091l = c16293l.yandex;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (C16456l c16456l2 : map.values()) {
            if (!c16456l2.f32168l.equals(c16091l.amazon) && jElapsedRealtime > c16456l2.f32174l) {
                Uri uriCrashlytics = c16091l.crashlytics();
                String str = c16456l2.f32168l;
                AbstractC12442l.subscription(c16091l.loadAd.containsKey(str));
                c16091l.amazon = str;
                if (uriCrashlytics.equals(c6827l.f14259l)) {
                    c6827l.subs(c16456l2.f32169l);
                }
                C16456l c16456l3 = (C16456l) map.get(uriCrashlytics);
                c16456l3.getClass();
                c16456l2.f32173l = c16456l3.f32173l;
                c16456l3.f32173l = false;
                return true;
            }
        }
        Uri uri2 = c6827l.f14259l;
        if (uri2 == null || uri.equals(uri2)) {
            AbstractC1186l abstractC1186l = c6827l.f14268l;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            for (int i = 0; i < abstractC1186l.size(); i++) {
                Uri uriCrashlytics2 = ((C16091l) abstractC1186l.get(i)).crashlytics();
                C16293l c16293l2 = (C16293l) c6827l.f14267l.get(uriCrashlytics2);
                c16293l2.getClass();
                HashMap map2 = c16293l2.loadAd;
                C16456l c16456l4 = (C16456l) AbstractC2812l.adcel(map2, uriCrashlytics2, uriCrashlytics2);
                c16456l4.getClass();
                if (jElapsedRealtime2 > c16456l4.f32174l) {
                    c6827l.f14259l = uriCrashlytics2;
                    Uri uriBilling = c6827l.billing(uriCrashlytics2);
                    C16456l c16456l5 = (C16456l) AbstractC2812l.adcel(map2, uriCrashlytics2, uriCrashlytics2);
                    c16456l5.getClass();
                    c16456l5.purchase(uriBilling);
                    z = true;
                    if (z) {
                        return false;
                    }
                }
            }
            z = false;
            if (z) {
                return false;
            }
        }
        return true;
    }

    public static void loadAd(C16293l c16293l, Uri uri, boolean z) {
        C16456l c16456l = (C16456l) AbstractC2812l.adcel(c16293l.loadAd, uri, uri);
        c16456l.getClass();
        c16456l.purchase(z ? c16456l.yandex() : c16456l.f32169l);
    }

    public static C16272l yandex(C16293l c16293l, Uri uri) {
        C16456l c16456l = (C16456l) AbstractC2812l.adcel(c16293l.loadAd, uri, uri);
        c16456l.getClass();
        return c16456l.f32171l;
    }
}
