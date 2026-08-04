package defpackage;

/* JADX INFO: renamed from: l٘ۜٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18222l {
    public final C1539l yandex;

    public C18222l(C1539l c1539l) {
        this.yandex = c1539l;
    }

    public static C4113l loadAd(C3823l c3823l) {
        C0948l c0948l = new C0948l();
        c0948l.f2633l = c3823l;
        C14099l c14099l = new C14099l(c0948l);
        EnumC1535l enumC1535l = EnumC1535l.f3808l;
        c3823l.loadAd(enumC1535l, c14099l);
        return AbstractC7151l.loadAd(c0948l, C3890l.class, C13368l.loadAd, enumC1535l);
    }

    public final C4113l yandex(C12224l c12224l) throws Throwable {
        String string;
        String simpleName = C8900l.class.getSimpleName();
        C1539l c1539l = this.yandex;
        C18096l c18096lAmazon = c1539l.amazon(c12224l, simpleName);
        String strLicense = AbstractC13950l.license();
        if (strLicense == null) {
            string = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int length = strLicense.length() + 1;
            int iIdentityHashCode = System.identityHashCode(C8900l.class);
            StringBuilder sb = new StringBuilder(length + String.valueOf(iIdentityHashCode).length());
            sb.append(strLicense);
            sb.append("|");
            sb.append(iIdentityHashCode);
            string = sb.toString();
        }
        C5991l c5991l = new C5991l(c1539l, string, c18096lAmazon, 18);
        C16367l c16367l = C16367l.f32015l;
        C13904l c13904lCrashlytics = C13568l.crashlytics();
        c13904lCrashlytics.f27205l = c18096lAmazon;
        c13904lCrashlytics.f27204l = c5991l;
        c13904lCrashlytics.f27203l = c16367l;
        c13904lCrashlytics.f27200l = new C9138l[]{AbstractC9464l.billing};
        c13904lCrashlytics.f27199l = false;
        return loadAd(c1539l.loadAd(c13904lCrashlytics.loadAd()));
    }
}
