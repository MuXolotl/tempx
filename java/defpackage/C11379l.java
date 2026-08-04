package defpackage;

/* JADX INFO: renamed from: lًُ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11379l {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C11379l(int i) {
        this.yandex = i;
    }

    public final C3242l yandex(InterfaceC9988l interfaceC9988l) {
        C15812l c15812lAmazon;
        C15812l c15812lAmazon2;
        boolean z = false;
        switch (this.yandex) {
            case 0:
                return new C3242l(interfaceC9988l.isPro().yandex(interfaceC9988l.isPro().crashlytics), interfaceC9988l.admob().yandex(interfaceC9988l.admob().amazon), interfaceC9988l.subs() == 1);
            case 1:
                return AbstractC11990l.isPro(new C3242l(interfaceC9988l.isPro().yandex(interfaceC9988l.isPro().crashlytics), interfaceC9988l.admob().yandex(interfaceC9988l.admob().amazon), interfaceC9988l.subs() == 1), interfaceC9988l);
            case 2:
                return AbstractC11990l.crashlytics(interfaceC9988l, C7472l.f15466l);
            case 3:
                return AbstractC11990l.crashlytics(interfaceC9988l, C6928l.f14518l);
            default:
                C3242l c3242lAmazon = interfaceC9988l.amazon();
                if (c3242lAmazon == null) {
                    return AbstractC11990l.crashlytics(interfaceC9988l, C7472l.f15466l);
                }
                C15812l c15812l = c3242lAmazon.loadAd;
                C15812l c15812l2 = c3242lAmazon.yandex;
                if (interfaceC9988l.yandex()) {
                    c15812lAmazon2 = AbstractC11990l.amazon(interfaceC9988l, interfaceC9988l.isPro(), c15812l2);
                    c15812lAmazon = c15812l;
                    c15812l = c15812l2;
                    c15812l2 = c15812lAmazon2;
                } else {
                    c15812lAmazon = AbstractC11990l.amazon(interfaceC9988l, interfaceC9988l.admob(), c15812l);
                    c15812lAmazon2 = c15812lAmazon;
                }
                if (AbstractC8576l.yandex(c15812lAmazon2, c15812l)) {
                    return c3242lAmazon;
                }
                if (interfaceC9988l.subs() == 1 || (interfaceC9988l.subs() == 3 && c15812l2.loadAd > c15812lAmazon.loadAd)) {
                    z = true;
                }
                return AbstractC11990l.isPro(new C3242l(c15812l2, c15812lAmazon, z), interfaceC9988l);
        }
    }
}
