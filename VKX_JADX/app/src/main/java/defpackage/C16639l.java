package defpackage;

/* JADX INFO: renamed from: lٖۛۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16639l implements InterfaceC5793l {
    public final AbstractC13264l yandex;

    public C16639l(AbstractC13264l abstractC13264l) {
        this.yandex = abstractC13264l;
    }

    @Override // defpackage.InterfaceC5793l
    public final boolean amazon() {
        return !this.yandex.firebase().yandex.isEmpty();
    }

    @Override // defpackage.InterfaceC5793l
    public final int crashlytics() {
        int i;
        AbstractC13264l abstractC13264l = this.yandex;
        if (abstractC13264l.firebase().yandex.size() == 0) {
            return 0;
        }
        int iLoadAd = AbstractC4447l.loadAd(abstractC13264l.firebase());
        int i2 = abstractC13264l.firebase().loadAd + abstractC13264l.firebase().crashlytics;
        if (i2 != 0 && (i = iLoadAd / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.InterfaceC5793l
    public final int loadAd() {
        AbstractC13264l abstractC13264l = this.yandex;
        return Math.min(abstractC13264l.smaato() - 1, ((C10824l) AbstractC16901l.m4214continue(abstractC13264l.firebase().yandex)).yandex);
    }

    @Override // defpackage.InterfaceC5793l
    public final int purchase() {
        return Math.max(0, this.yandex.purchase);
    }

    @Override // defpackage.InterfaceC5793l
    public final int yandex() {
        return this.yandex.smaato();
    }
}
