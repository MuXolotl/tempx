package defpackage;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: lٕ٘ٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17943l {
    public static C5197l firebase;
    public static C10038l smaato;
    public static final C15578l yandex = new C15578l(-1097978549, false, new C7614l(24));
    public static final C15578l loadAd = new C15578l(1338262167, false, new C7614l(25));
    public static final C15578l crashlytics = new C15578l(-141951758, false, new C7614l(26));
    public static final C15578l amazon = new C15578l(370833536, false, new C7614l(27));
    public static final C15578l purchase = new C15578l(-480573413, false, new C7614l(28));
    public static final C15578l billing = new C15578l(-342812257, false, new C7614l(29));
    public static final C15578l mopub = new C15578l(-1194219206, false, new C8337l(0));
    public static final C15578l admob = new C15578l(317878071, false, new C10721l(27));
    public static final C15578l subs = new C15578l(-57782880, false, new C10721l(28));
    public static final C15578l isPro = new C15578l(-144146955, false, new C8337l(1));

    public static final void crashlytics(InterfaceC15879l interfaceC15879l, C1869l c1869l, C5008l c5008l) {
        C10038l c10038l = smaato;
        if (c10038l == null) {
            C8339l.smaato("mCameraUseCaseAdapterProvider must be initialized first!");
            return;
        }
        InterfaceC18690l interfaceC18690lCrashlytics = ((C2974l) c10038l.f20463l).crashlytics(interfaceC15879l.mopub());
        C16057l c16057l = new C16057l(interfaceC18690lCrashlytics.adcel(), AbstractC15078l.yandex);
        C0458l c0458l = C0458l.f1689l;
        C11903l c11903l = new C11903l(interfaceC18690lCrashlytics, null, c16057l, null, c0458l, c0458l, (C7518l) c10038l.f20462l, (C13568l) c10038l.f20465l, (InterfaceC10139l) c10038l.f20466l);
        c11903l.m3291private(c1869l.yandex);
        c11903l.m3292synchronized(c1869l.loadAd);
        c11903l.m3289native(c1869l.yandex());
        c11903l.m3293volatile(c1869l.crashlytics);
        List list = c1869l.billing;
        AbstractC5088l.yandex("CameraUseCaseAdapter", "simulateAddUseCases: appUseCasesToAdd = " + list + ", featureGroup = " + c5008l);
        synchronized (c11903l.f23726l) {
            C16214l c16214l = c11903l.f23734l;
            InterfaceC13235l interfaceC13235l = c11903l.f23741l;
            c16214l.subs(interfaceC13235l);
            C16214l c16214l2 = c11903l.f23733l;
            if (c16214l2 != null) {
                c16214l2.subs(interfaceC13235l);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(c11903l.f23739l);
            linkedHashSet.addAll(list);
            HashMap mapMopub = C11903l.mopub(linkedHashSet, c5008l);
            try {
                try {
                    c11903l.tapsense(linkedHashSet, c11903l.f23733l != null);
                    C11903l.m3288throws(mapMopub);
                } catch (IllegalArgumentException e) {
                    throw new C14687l(e);
                }
            } catch (Throwable th) {
                C11903l.m3288throws(mapMopub);
                throw th;
            }
        }
    }

    public static final int loadAd(InterfaceC16148l interfaceC16148l) {
        return interfaceC16148l.yandex().size();
    }

    public static void yandex(Object obj) {
        if (obj != null) {
            return;
        }
        C6541l.subs("Cannot return null from a non-@Nullable @Provides method");
    }
}
