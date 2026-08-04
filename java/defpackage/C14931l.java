package defpackage;

/* JADX INFO: renamed from: lٔٗؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14931l implements InterfaceC18362l {
    public final C13660l amazon;
    public final C10086l crashlytics = AbstractC8020l.smaato(new C4999l(0));
    public InterfaceC13460l loadAd;
    public final C18656l yandex;

    public C14931l(C18656l c18656l, InterfaceC13460l interfaceC13460l) {
        this.yandex = c18656l;
        this.loadAd = interfaceC13460l;
        long[] jArr = AbstractC12154l.yandex;
        this.amazon = new C13660l();
    }

    @Override // defpackage.InterfaceC17460l
    public final Object amazon() {
        return this.yandex.billing().amazon();
    }

    @Override // defpackage.InterfaceC17460l
    public final boolean crashlytics(Object obj, Object obj2) {
        return obj.equals(loadAd()) && obj2.equals(amazon());
    }

    @Override // defpackage.InterfaceC17460l
    public final Object loadAd() {
        return this.yandex.billing().loadAd();
    }

    @Override // defpackage.InterfaceC18362l
    public final C10405l yandex(C10405l c10405l, C7066l c7066l) {
        c10405l.amazon = c7066l;
        return c10405l;
    }
}
