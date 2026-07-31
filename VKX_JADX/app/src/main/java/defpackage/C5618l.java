package defpackage;

/* JADX INFO: renamed from: lؘِٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5618l extends AbstractC1387l {
    public static final C5618l amazon = new C5618l(0, 2, 1);

    @Override // defpackage.AbstractC1387l
    public final void amazon(C12676l c12676l, InterfaceC3770l interfaceC3770l, C13006l c13006l, C15389l c15389l, InterfaceC3928l interfaceC3928l) {
        int i;
        C6467l c6467l = (C6467l) c12676l.admob(0);
        int iCrashlytics = c13006l.crashlytics((C12317l) c12676l.admob(1));
        if (c13006l.tapsense >= iCrashlytics) {
            AbstractC2032l.yandex("Check failed");
        }
        AbstractC4071l.crashlytics(c13006l, interfaceC3770l, iCrashlytics);
        int i2 = c13006l.tapsense;
        int iInmobi = c13006l.license;
        while (iInmobi >= 0 && !c13006l.advert(iInmobi)) {
            iInmobi = c13006l.inmobi(c13006l.loadAd, iInmobi);
        }
        int iSignature = iInmobi + 1;
        int iM3524private = 0;
        while (iSignature < i2) {
            if (c13006l.license(i2, iSignature)) {
                if (c13006l.advert(iSignature)) {
                    iM3524private = 0;
                }
                iSignature++;
            } else {
                iM3524private += c13006l.advert(iSignature) ? 1 : c13006l.loadAd[(c13006l.ads(iSignature) * 5) + 1] & 67108863;
                iSignature += c13006l.Signature(iSignature);
            }
        }
        while (true) {
            i = c13006l.tapsense;
            if (i >= iCrashlytics) {
                break;
            }
            if (c13006l.license(iCrashlytics, i)) {
                int i3 = c13006l.tapsense;
                if (i3 < c13006l.Signature && (c13006l.loadAd[(c13006l.ads(i3) * 5) + 1] & 1073741824) != 0) {
                    interfaceC3770l.admob(c13006l.appmetrica(c13006l.tapsense));
                    iM3524private = 0;
                }
                c13006l.m3516catch();
            } else {
                iM3524private += c13006l.m3524private();
            }
        }
        if (i != iCrashlytics) {
            AbstractC2032l.yandex("Check failed");
        }
        c6467l.yandex = iM3524private;
    }
}
