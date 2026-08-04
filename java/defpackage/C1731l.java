package defpackage;

/* JADX INFO: renamed from: lٍؓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1731l extends AbstractC1387l {
    public static final C1731l amazon = new C1731l(0, 2, 1);

    @Override // defpackage.AbstractC1387l
    public final void amazon(C12676l c12676l, InterfaceC3770l interfaceC3770l, C13006l c13006l, C15389l c15389l, InterfaceC3928l interfaceC3928l) {
        C12317l c12317l = (C12317l) c12676l.admob(0);
        Object objAdmob = c12676l.admob(1);
        if (objAdmob instanceof InterfaceC17142l) {
            InterfaceC17142l interfaceC17142l = (InterfaceC17142l) objAdmob;
            ((C17893l) c15389l.purchase).crashlytics(interfaceC17142l);
            ((C6295l) c15389l.amazon).yandex(interfaceC17142l);
        }
        if (c13006l.vip != 0) {
            AbstractC2032l.yandex("Can only append a slot if not current inserting");
        }
        int i = c13006l.subs;
        int i2 = c13006l.isPro;
        int iCrashlytics = c13006l.crashlytics(c12317l);
        int iMopub = c13006l.mopub(c13006l.loadAd, c13006l.ads(iCrashlytics + 1));
        c13006l.subs = iMopub;
        c13006l.isPro = iMopub;
        c13006l.ad(1, iCrashlytics);
        if (i >= iMopub) {
            i++;
            i2++;
        }
        c13006l.crashlytics[iMopub] = objAdmob;
        c13006l.subs = i;
        c13006l.isPro = i2;
    }
}
