package defpackage;

/* JADX INFO: renamed from: lؘَؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5504l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C5504l yandex;

    static {
        C5504l c5504l = new C5504l();
        yandex = c5504l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.spark.objects.account.SparkAccount", c5504l, 5);
        c13637l.smaato("id", false);
        c13637l.smaato("vk_id", false);
        c13637l.smaato("plus_active", true);
        c13637l.smaato("ultra_expires_at", true);
        c13637l.smaato("restricted", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC16588l interfaceC16588lCrashlytics = AbstractC7303l.crashlytics(C8458l.yandex);
        C2010l c2010l = C2010l.yandex;
        C2796l c2796l = C2796l.yandex;
        return new InterfaceC16588l[]{c2010l, c2010l, c2796l, interfaceC16588lCrashlytics, c2796l};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C5492l c5492l = (C5492l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        long j = c5492l.yandex;
        boolean z = c5492l.purchase;
        C2106l c2106l = c5492l.amazon;
        boolean z2 = c5492l.crashlytics;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.premium(interfaceC18035l, 0, j);
        abstractC4072l.premium(interfaceC18035l, 1, c5492l.loadAd);
        if (abstractC4072l.ads() || z2) {
            abstractC4072l.ad(interfaceC18035l, 2, z2);
        }
        if (abstractC4072l.ads() || c2106l != null) {
            abstractC4072l.startapp(interfaceC18035l, 3, C8458l.yandex, c2106l);
        }
        if (abstractC4072l.ads() || z) {
            abstractC4072l.ad(interfaceC18035l, 4, z);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        int i = 0;
        boolean zIsVip = false;
        boolean zIsVip2 = false;
        long jInmobi = 0;
        long jInmobi2 = 0;
        C2106l c2106l = null;
        boolean z = true;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                jInmobi = interfaceC14988lCrashlytics.inmobi(interfaceC18035l, 0);
                i |= 1;
            } else if (iAdmob == 1) {
                jInmobi2 = interfaceC14988lCrashlytics.inmobi(interfaceC18035l, 1);
                i |= 2;
            } else if (iAdmob == 2) {
                zIsVip = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 2);
                i |= 4;
            } else if (iAdmob == 3) {
                c2106l = (C2106l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, C8458l.yandex, c2106l);
                i |= 8;
            } else {
                if (iAdmob != 4) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                zIsVip2 = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 4);
                i |= 16;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C5492l(i, jInmobi, jInmobi2, zIsVip, c2106l, zIsVip2);
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] yandex() {
        return AbstractC3872l.yandex;
    }
}
