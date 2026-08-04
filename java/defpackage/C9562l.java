package defpackage;

/* JADX INFO: renamed from: lٌٍٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9562l implements InterfaceC16965l {
    @Override // defpackage.InterfaceC16965l
    public final int loadAd(InterfaceC11661l interfaceC11661l, InterfaceC11661l interfaceC11661l2, InterfaceC17477l interfaceC17477l) {
        C8767l c8767l;
        C8767l c8767l2;
        if (!(interfaceC11661l2 instanceof C12113l)) {
            return 3;
        }
        C12113l c12113l = (C12113l) interfaceC11661l2;
        if (!c12113l.getTypeParameters().isEmpty()) {
            return 3;
        }
        C16371l c16371lSubs = C14450l.subs(interfaceC11661l, interfaceC11661l2);
        if ((c16371lSubs != null ? c16371lSubs.loadAd() : 0) != 0) {
            return 3;
        }
        InterfaceC11075l interfaceC11075lAds = AbstractC8669l.ads(new InterfaceC11075l[]{new C11100l(new C17798l(1, c12113l.mo1007finally()), C2100l.f4703l), new C17798l(5, c12113l.f20715l)});
        C10557l c10557l = new C10557l(27);
        if (interfaceC11075lAds instanceof C11100l) {
            C11100l c11100l = (C11100l) interfaceC11075lAds;
            c8767l = new C8767l(c11100l.yandex, c11100l.loadAd, c10557l);
        } else {
            c8767l = new C8767l(interfaceC11075lAds, new C10557l(28), c10557l);
        }
        C7073l c7073l = c12113l.f20722l;
        InterfaceC11075l interfaceC11075lAds2 = AbstractC8669l.ads(new InterfaceC11075l[]{c8767l, new C17798l(1, AbstractC14055l.vip(c7073l != null ? c7073l.yandex() : null))});
        C10557l c10557l2 = new C10557l(27);
        if (interfaceC11075lAds2 instanceof C11100l) {
            C11100l c11100l2 = (C11100l) interfaceC11075lAds2;
            c8767l2 = new C8767l(c11100l2.yandex, c11100l2.loadAd, c10557l2);
        } else {
            c8767l2 = new C8767l(interfaceC11075lAds2, new C10557l(28), c10557l2);
        }
        C12588l c12588l = new C12588l(c8767l2);
        while (c12588l.hasNext()) {
            AbstractC18041l abstractC18041l = (AbstractC18041l) c12588l.next();
            if (!abstractC18041l.inmobi().isEmpty() && !(abstractC18041l.mo3847class() instanceof C6530l)) {
                return 3;
            }
        }
        InterfaceC11661l interfaceC11661lBuild = (InterfaceC11661l) interfaceC11661l.isPro(new C2201l(new C11720l()));
        if (interfaceC11661lBuild == null) {
            return 3;
        }
        if (interfaceC11661lBuild instanceof C17134l) {
            C17134l c17134l = (C17134l) interfaceC11661lBuild;
            if (!c17134l.getTypeParameters().isEmpty()) {
                interfaceC11661lBuild = c17134l.mo1457l().subscription().build();
            }
        }
        return AbstractC6027l.yandex[AbstractC5020l.inmobi(C14450l.crashlytics.vip(interfaceC11661lBuild, interfaceC11661l2, false).loadAd())] == 1 ? 1 : 3;
    }

    @Override // defpackage.InterfaceC16965l
    public final int yandex() {
        return 2;
    }
}
