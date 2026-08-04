package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lِٙؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11922l {
    public static final Map loadAd;
    public static final C8896l yandex;

    static {
        Float fValueOf = Float.valueOf(1.0f);
        yandex = new C8896l(1.0f, 1.0f, 1.0f, 1.0f);
        C8195l c8195l = new C8195l(AbstractC3483l.billing, fValueOf);
        C8195l c8195l2 = new C8195l(AbstractC3483l.smaato, fValueOf);
        C8195l c8195l3 = new C8195l(AbstractC3483l.firebase, fValueOf);
        C8195l c8195l4 = new C8195l(AbstractC3483l.purchase, Float.valueOf(0.01f));
        C8195l c8195l5 = new C8195l(AbstractC3483l.remoteconfig, fValueOf);
        C8195l c8195l6 = new C8195l(AbstractC3483l.subs, fValueOf);
        C8195l c8195l7 = new C8195l(AbstractC3483l.isPro, fValueOf);
        C0010l c0010l = AbstractC3483l.mopub;
        Float fValueOf2 = Float.valueOf(0.4f);
        loadAd = AbstractC8676l.remoteconfig(c8195l, c8195l2, c8195l3, c8195l4, c8195l5, c8195l6, c8195l7, new C8195l(c0010l, fValueOf2), new C8195l(AbstractC3483l.admob, fValueOf2));
    }
}
