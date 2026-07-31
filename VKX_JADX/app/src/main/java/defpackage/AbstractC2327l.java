package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lؔؑۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2327l {
    public static final C4776l crashlytics;
    public static final C4776l loadAd;
    public static final C4776l yandex;

    static {
        C6763l c6763l = new C6763l(0.4f, 0.0f, 0.6f, 1.0f);
        yandex = new C4776l(120, AbstractC5341l.yandex, 2);
        loadAd = new C4776l(150, c6763l, 2);
        crashlytics = new C4776l(120, c6763l, 2);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r1
  0x0009: PHI (r1v3 lٍؗؔ) = (r1v0 lٍؗؔ), (r1v0 lٍؗؔ), (r1v0 lٍؗؔ), (r1v4 lٍؗؔ), (r1v4 lٍؗؔ), (r1v4 lٍؗؔ), (r1v4 lٍؗؔ) binds: [B:19:0x0022, B:22:0x0027, B:28:0x0033, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object yandex(C5616l c5616l, float f, InterfaceC12553l interfaceC12553l, InterfaceC12553l interfaceC12553l2, AbstractC0283l abstractC0283l) {
        C4776l c4776l;
        C4776l c4776l2 = null;
        if (interfaceC12553l2 != null) {
            boolean z = interfaceC12553l2 instanceof C12951l;
            c4776l = yandex;
            if (z || (interfaceC12553l2 instanceof C1311l) || (interfaceC12553l2 instanceof C0261l) || (interfaceC12553l2 instanceof C7008l)) {
                c4776l2 = c4776l;
            }
        } else if (interfaceC12553l != null) {
            boolean z2 = interfaceC12553l instanceof C12951l;
            c4776l = loadAd;
            if (z2 || (interfaceC12553l instanceof C1311l)) {
                c4776l2 = c4776l;
            } else if (interfaceC12553l instanceof C0261l) {
                c4776l2 = crashlytics;
            } else if (interfaceC12553l instanceof C7008l) {
                c4776l2 = c4776l;
            }
        }
        C4776l c4776l3 = c4776l2;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (c4776l3 != null) {
            Object objLoadAd = C5616l.loadAd(c5616l, new C14467l(f), c4776l3, null, null, abstractC0283l, 12);
            return objLoadAd == enumC9342l ? objLoadAd : Unit.INSTANCE;
        }
        Object objBilling = c5616l.billing(abstractC0283l, new C14467l(f));
        return objBilling == enumC9342l ? objBilling : Unit.INSTANCE;
    }
}
