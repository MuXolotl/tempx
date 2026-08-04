package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lؚؔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7012l {
    public static final C3498l yandex = C3498l.purchase("message");
    public static final C3498l loadAd = C3498l.purchase("allowedTargets");
    public static final C3498l crashlytics = C3498l.purchase("value");
    public static final Map amazon = AbstractC8676l.remoteconfig(new C8195l(AbstractC3333l.tapsense, AbstractC6830l.crashlytics), new C8195l(AbstractC3333l.pro, AbstractC6830l.amazon), new C8195l(AbstractC3333l.ad, AbstractC6830l.billing));

    public static InterfaceC5470l loadAd(C10038l c10038l, C8673l c8673l, boolean z) {
        C3624l c3624lYandex = AbstractC1845l.yandex(((InterfaceC13937l) AbstractC16131l.billing(c8673l.yandex)).mo1730private());
        C2312l c2312l = AbstractC6830l.crashlytics;
        if (c3624lYandex.equals(new C3624l(c2312l.loadAd(), c2312l.yandex.mopub()))) {
            return new C13763l(c8673l, c10038l);
        }
        C2312l c2312l2 = AbstractC6830l.amazon;
        if (c3624lYandex.equals(new C3624l(c2312l2.loadAd(), c2312l2.yandex.mopub()))) {
            return new C16404l(c8673l, c10038l);
        }
        C2312l c2312l3 = AbstractC6830l.billing;
        if (c3624lYandex.equals(new C3624l(c2312l3.loadAd(), c2312l3.yandex.mopub()))) {
            return new C1363l(c10038l, c8673l, AbstractC3333l.ad);
        }
        C2312l c2312l4 = AbstractC6830l.purchase;
        if (c3624lYandex.equals(new C3624l(c2312l4.loadAd(), c2312l4.yandex.mopub()))) {
            return null;
        }
        return new C6727l(c10038l, c8673l, z);
    }

    public static InterfaceC5470l yandex(C2312l c2312l, InterfaceC7760l interfaceC7760l, C10038l c10038l) {
        C8673l c8673lLoadAd;
        C8673l c8673lLoadAd2;
        if (c2312l.equals(AbstractC3333l.remoteconfig) && (c8673lLoadAd2 = interfaceC7760l.loadAd(AbstractC6830l.purchase)) != null) {
            return new C15036l(c8673lLoadAd2, c10038l);
        }
        C2312l c2312l2 = (C2312l) amazon.get(c2312l);
        if (c2312l2 == null || (c8673lLoadAd = interfaceC7760l.loadAd(c2312l2)) == null) {
            return null;
        }
        return loadAd(c10038l, c8673lLoadAd, false);
    }
}
