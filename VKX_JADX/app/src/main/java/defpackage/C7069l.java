package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚؗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7069l {
    public static final C17253l loadAd;
    public static final C7069l yandex = new C7069l();

    static {
        C17253l c17253l = C12719l.yandex;
        loadAd = new C17253l(12.0f, c17253l.loadAd, 12.0f, c17253l.amazon);
    }

    public static InterfaceC6347l crashlytics(int i, int i2, C6956l c6956l) {
        C6839l c6839l = (C6839l) AbstractC2610l.loadAd(c6956l, 7);
        if (i2 == 1) {
            return c6839l;
        }
        if (i == 0) {
            C8448l c8448l = AbstractC0174l.subs;
            return C6839l.crashlytics(c6839l, null, c8448l, c8448l, null, 9);
        }
        if (i != i2 - 1) {
            return AbstractC16837l.yandex;
        }
        C8448l c8448l2 = AbstractC0174l.subs;
        return C6839l.crashlytics(c6839l, c8448l2, null, null, c8448l2, 6);
    }

    public final void loadAd(boolean z, Function2 function2, C6956l c6956l, int i) {
        Function2 function3;
        c6956l.m2133new(-657462570);
        int i2 = i | (c6956l.mopub(z) ? 4 : 2) | 432;
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            c6956l.m2123default(-1416240287);
            AbstractC3308l.amazon(z, null, AbstractC4523l.purchase(C17423l.remoteconfig(c6956l, 4), 2).yandex(new C3000l(new C3313l((C4610l) null, (C5487l) null, (C15457l) null, new C11700l(0.0f, AbstractC5518l.yandex(0.0f, 1.0f), C17423l.remoteconfig(c6956l, 2)), (LinkedHashMap) null, 119))), C0274l.loadAd, null, AbstractC14566l.amazon(2059591811, new C11813l(29), c6956l), c6956l, (i2 & 14) | 196608, 18);
            c6956l.startapp(false);
            function3 = AbstractC16759l.yandex;
        } else {
            c6956l.m2124else();
            function3 = function2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C16693l(this, z, function3, i, 3);
        }
    }

    public final void yandex(C6956l c6956l, int i) {
        C6956l c6956l2;
        c6956l.m2133new(-1273041460);
        int i2 = 2;
        if (c6956l.m2127for(i & 1, (i & 3) != 2)) {
            C5197l c5197lLoadAd = AbstractC17943l.firebase;
            if (c5197lLoadAd == null) {
                C10943l c10943l = new C10943l("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                int i3 = AbstractC8192l.yandex;
                C8990l c8990l = new C8990l(C9735l.loadAd);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new C16574l(9.0f, 16.17f));
                arrayList.add(new C2789l(4.83f, 12.0f));
                arrayList.add(new C0550l(-1.42f, 1.41f));
                arrayList.add(new C2789l(9.0f, 19.0f));
                arrayList.add(new C2789l(21.0f, 7.0f));
                arrayList.add(new C0550l(-1.41f, -1.41f));
                arrayList.add(C10766l.crashlytics);
                C10943l.yandex(c10943l, arrayList, c8990l);
                c5197lLoadAd = c10943l.loadAd();
                AbstractC17943l.firebase = c5197lLoadAd;
            }
            c6956l2 = c6956l;
            AbstractC4597l.yandex(c5197lLoadAd, null, AbstractC0080l.isPro(C4346l.f8873l, 18.0f), 0L, c6956l2, 48, 8);
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1645l(this, i, i2);
        }
    }
}
