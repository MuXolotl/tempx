package defpackage;

/* JADX INFO: renamed from: lٖٕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16749l implements InterfaceC2810l {
    public int crashlytics = -1;
    public final InterfaceC2810l loadAd;
    public final AbstractC8769l yandex;

    public C16749l(AbstractC8769l abstractC8769l, InterfaceC2810l interfaceC2810l) {
        this.yandex = abstractC8769l;
        this.loadAd = interfaceC2810l;
    }

    @Override // defpackage.InterfaceC2810l
    public final void yandex(Object obj) {
        int i = this.crashlytics;
        int i2 = this.yandex.mopub;
        if (i != i2) {
            this.crashlytics = i2;
            this.loadAd.yandex(obj);
        }
    }
}
