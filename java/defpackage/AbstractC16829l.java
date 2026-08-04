package defpackage;

import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;

/* JADX INFO: renamed from: lؙٗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16829l {
    public static final C15578l yandex = new C15578l(-704347243, false, new C1659l(28));
    public static final C15578l loadAd = new C15578l(1536844436, false, new C4076l(0));
    public static final C15578l crashlytics = new C15578l(-1613008353, false, new C1659l(29));
    public static final C15578l amazon = new C15578l(-334138213, false, new C3817l(0));

    public static final C11522l amazon(InterfaceC6942l interfaceC6942l) {
        InterfaceC14592l.subs.getClass();
        int i = C14133l.loadAd;
        if (1 >= i) {
            i = 1;
        }
        int i2 = i - 1;
        if (interfaceC6942l instanceof AbstractC18135l) {
            AbstractC18135l abstractC18135l = (AbstractC18135l) interfaceC6942l;
            int i3 = abstractC18135l.f35447l;
            InterfaceC6942l interfaceC6942lAdmob = abstractC18135l.admob();
            if (interfaceC6942lAdmob != null) {
                int i4 = abstractC18135l.f35448l;
                if (i4 != -3 && i4 != -2 && i4 != 0) {
                    i2 = i4;
                } else if (i3 != 1 || i4 == 0) {
                    i2 = 0;
                }
                return new C11522l(i2, i3, abstractC18135l.f35449l, interfaceC6942lAdmob);
            }
        }
        return new C11522l(i2, 1, C17218l.f33421l, interfaceC6942l);
    }

    public static final C6451l crashlytics(Function1 function1, Object obj, C6451l c6451l) {
        try {
            function1.invoke(obj);
            return c6451l;
        } catch (Throwable th) {
            if (c6451l == null || c6451l.getCause() == th) {
                return new C6451l(16, AbstractC15560l.subscription(obj, "Exception in undelivered element handler for "), th);
            }
            AbstractC11718l.yandex(c6451l, th);
            return c6451l;
        }
    }

    public static final void loadAd(Function1 function1, Object obj, InterfaceC12932l interfaceC12932l) {
        C6451l c6451lCrashlytics = crashlytics(function1, obj, null);
        if (c6451lCrashlytics != null) {
            AbstractC11738l.loadAd(interfaceC12932l, c6451lCrashlytics);
        }
    }

    public static final void purchase(C2494l c2494l, C5667l c5667l, C5667l c5667l2, C0458l c0458l, boolean z) {
        C17893l c17893l = (C17893l) c0458l.f1691l;
        int i = c17893l.f34846l;
        if (i > 1) {
            c2494l.m1198l(new C0574l(0, c5667l.f12057l.toString(), c5667l2.f12057l.toString(), c5667l.f12061l, c5667l2.f12061l, 0L, false, 32));
            return;
        }
        if (i == 1) {
            C0840l c0840l = (C0840l) c17893l.f34848l[0];
            long jLoadAd = AbstractC2296l.loadAd(c0840l.crashlytics, c0840l.amazon);
            C0840l c0840l2 = (C0840l) ((C17893l) c0458l.f1691l).f34848l[0];
            long jLoadAd2 = AbstractC2296l.loadAd(c0840l2.yandex, c0840l2.loadAd);
            if (C12814l.amazon(jLoadAd) && C12814l.amazon(jLoadAd2)) {
                return;
            }
            c2494l.m1198l(new C0574l(C12814l.mopub(jLoadAd), AbstractC2296l.mopub(jLoadAd, c5667l), AbstractC2296l.mopub(jLoadAd2, c5667l2), c5667l.f12061l, c5667l2.f12061l, 0L, z, 32));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static final void yandex(CatalogArtist catalogArtist, C6956l c6956l, int i) {
        int i2;
        ?? r0;
        C6956l c6956l2;
        boolean z;
        C6956l c6956l3;
        C6956l c6956l4 = c6956l;
        c6956l4.m2133new(2083811023);
        if ((i & 6) == 0) {
            i2 = i | (c6956l4.admob(catalogArtist) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (c6956l4.m2127for(i2 & 1, (i2 & 3) != 2)) {
            if (catalogArtist.isPro.length() > 0) {
                c6956l4.m2123default(-642998496);
                String str = catalogArtist.isPro;
                C10707l c10707l = AbstractC16964l.yandex;
                z = false;
                AbstractC13010l.loadAd(str, AbstractC3605l.vip(C4346l.f8873l, 16.0f, 0.0f, 2), ((C14370l) c6956l4.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l4.isPro(c10707l)).loadAd.firebase, c6956l, 48, 0, 131064);
                c6956l3 = c6956l;
            } else {
                z = false;
                c6956l4.m2123default(-643494093);
                c6956l3 = c6956l4;
            }
            c6956l3.startapp(z);
            r0 = z;
            c6956l2 = c6956l3;
        } else {
            r0 = 0;
            c6956l4.m2124else();
            c6956l2 = c6956l4;
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1674l(catalogArtist, i, (int) r0);
        }
    }
}
