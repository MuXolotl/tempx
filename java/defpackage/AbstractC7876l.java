package defpackage;

import java.io.Closeable;
import java.io.InputStream;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lًٌٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7876l {
    /* JADX WARN: Multi-variable type inference failed */
    public static final C3185l amazon(AbstractC12194l abstractC12194l, int i, boolean z) {
        int i2 = 0;
        if (abstractC12194l instanceof C15740l) {
            return new C3185l(Pattern.quote(((C15740l) abstractC12194l).yandex), 0, 6);
        }
        if (abstractC12194l instanceof C7917l) {
            return new C3185l("\\d", 0, 6);
        }
        if (!(abstractC12194l instanceof InterfaceC17362l)) {
            if (abstractC12194l instanceof C10722l) {
                if (abstractC12194l instanceof C10722l) {
                    C3185l c3185lAmazon = amazon(((C10722l) abstractC12194l).yandex, i, true);
                    return new C3185l(AbstractC2812l.tapsense(new StringBuilder(), c3185lAmazon.loadAd, '+'), c3185lAmazon.crashlytics, 4);
                }
                C17132l.metrica(abstractC12194l, "Unsupported simple grammar element: ");
                return null;
            }
            if (!(abstractC12194l instanceof C8889l)) {
                C17132l.metrica(abstractC12194l, "Unsupported grammar element: ");
                return null;
            }
            StringBuilder sb = new StringBuilder("[");
            C8889l c8889l = (C8889l) abstractC12194l;
            sb.append(c8889l.yandex);
            sb.append('-');
            sb.append(c8889l.loadAd);
            sb.append(']');
            return new C3185l(sb.toString(), 0, 6);
        }
        StringBuilder sb2 = new StringBuilder();
        int i3 = z ? i + 1 : i;
        for (Object obj : ((InterfaceC17362l) abstractC12194l).yandex()) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            C3185l c3185lAmazon2 = amazon((AbstractC12194l) obj, i3, true);
            if (i2 != 0 && (abstractC12194l instanceof C10779l)) {
                sb2.append("|");
            }
            sb2.append(c3185lAmazon2.loadAd);
            i3 += c3185lAmazon2.crashlytics;
            i2 = i4;
        }
        int i5 = i3 - i;
        if (z) {
            i5--;
        }
        return new C3185l(sb2.toString(), z, i5);
    }

    public static final Object crashlytics(AbstractC8237l abstractC8237l, InterfaceC16588l interfaceC16588l, InputStream inputStream) {
        C5008l c5008l = new C5008l(inputStream);
        C11584l c11584l = (C11584l) c5008l.f10245l;
        try {
            return AbstractC10802l.loadAd(abstractC8237l, interfaceC16588l, c5008l);
        } finally {
            c11584l.getClass();
            C12710l.crashlytics.yandex(c11584l.crashlytics.array());
        }
    }

    public static final void loadAd(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC11718l.yandex(th, th2);
            }
        }
    }

    public static final void yandex(C0764l c0764l, C15578l c15578l, C6956l c6956l, int i, int i2) {
        C0764l c0764l2;
        int i3;
        C0764l c0764l3;
        C0764l c0764l4;
        c6956l.m2133new(-480898462);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            c0764l2 = c0764l;
        } else {
            c0764l2 = c0764l;
            i3 = i | (c6956l.billing(c0764l2) ? 4 : 2);
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                Object objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = AbstractC7252l.purchase(AbstractC13209l.purchase.crashlytics);
                    c6956l.m2147try(objM2132native);
                }
                c0764l4 = (C0764l) objM2132native;
            } else {
                c0764l4 = c0764l2;
            }
            C11090l c11090l = AbstractC13106l.admob(c6956l).subs;
            C11090l c11090l2 = AbstractC1193l.amazon;
            C11090l c11090lPurchase = c11090l.purchase(c11090l2);
            C11090l c11090lPurchase2 = AbstractC13106l.admob(c6956l).admob.purchase(c11090l2);
            C11090l c11090lPurchase3 = AbstractC13106l.admob(c6956l).mopub.purchase(c11090l2);
            C11090l c11090lPurchase4 = AbstractC13106l.admob(c6956l).billing.purchase(c11090l2);
            C11090l c11090lPurchase5 = AbstractC13106l.admob(c6956l).purchase.purchase(c11090l2);
            C11090l c11090lPurchase6 = AbstractC13106l.admob(c6956l).amazon.purchase(c11090l2);
            AbstractC16964l.yandex(c0764l4, C17167l.yandex, new C1919l(AbstractC7497l.yandex(8.0f), 30), new C13494l(AbstractC13106l.admob(c6956l).yandex.purchase(c11090l2), AbstractC13106l.admob(c6956l).loadAd.purchase(c11090l2), AbstractC13106l.admob(c6956l).crashlytics.purchase(c11090l2), c11090lPurchase6, c11090lPurchase5, c11090lPurchase4, c11090lPurchase3, c11090lPurchase2, c11090lPurchase, 32256), c15578l, c6956l, (i3 & 14) | 24576);
            c0764l3 = c0764l4;
        } else {
            c6956l.m2124else();
            c0764l3 = c0764l2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(c0764l3, c15578l, i, i2, 26);
        }
    }
}
