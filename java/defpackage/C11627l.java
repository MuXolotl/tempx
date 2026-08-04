package defpackage;

/* JADX INFO: renamed from: lِِؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11627l extends AbstractC1387l {
    public static final C11627l amazon = new C11627l(1, 0, 2);

    @Override // defpackage.AbstractC1387l
    public final void amazon(C12676l c12676l, InterfaceC3770l interfaceC3770l, C13006l c13006l, C15389l c15389l, InterfaceC3928l interfaceC3928l) {
        int iMopub = c12676l.mopub(0);
        int i = c13006l.license;
        int iM3521for = c13006l.m3521for(c13006l.loadAd, c13006l.ads(i));
        int iMopub2 = c13006l.mopub(c13006l.loadAd, c13006l.ads(i + 1));
        for (int iMax = Math.max(iM3521for, iMopub2 - iMopub); iMax < iMopub2; iMax++) {
            Object obj = c13006l.crashlytics[c13006l.admob(iMax)];
            if (obj instanceof InterfaceC17142l) {
                c15389l.mopub((InterfaceC17142l) obj);
            } else if (obj instanceof C4224l) {
                ((C4224l) obj).crashlytics();
            }
        }
        if (iMopub <= 0) {
            AbstractC2032l.yandex("Check failed");
        }
        int i2 = c13006l.license;
        int iM3521for2 = c13006l.m3521for(c13006l.loadAd, c13006l.ads(i2));
        int iMopub3 = c13006l.mopub(c13006l.loadAd, c13006l.ads(i2 + 1)) - iMopub;
        if (iMopub3 < iM3521for2) {
            AbstractC2032l.yandex("Check failed");
        }
        c13006l.m3530volatile(iMopub3, iMopub, i2);
        int i3 = c13006l.subs;
        if (i3 >= iM3521for2) {
            c13006l.subs = i3 - iMopub;
        }
    }
}
