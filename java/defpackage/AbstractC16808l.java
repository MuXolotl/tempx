package defpackage;

/* JADX INFO: renamed from: lٖۨ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16808l extends AbstractC10759l {
    public final AbstractC10759l purchase;

    public AbstractC16808l(AbstractC10759l abstractC10759l) {
        this.purchase = abstractC10759l;
    }

    @Override // defpackage.AbstractC10759l
    public final int admob() {
        return this.purchase.admob();
    }

    @Override // defpackage.AbstractC10759l
    public C3904l billing(int i, C3904l c3904l, boolean z) {
        return this.purchase.billing(i, c3904l, z);
    }

    @Override // defpackage.AbstractC10759l
    public final int crashlytics(boolean z) {
        return this.purchase.crashlytics(z);
    }

    @Override // defpackage.AbstractC10759l
    public final int firebase(int i, int i2, boolean z) {
        return this.purchase.firebase(i, i2, z);
    }

    @Override // defpackage.AbstractC10759l
    public int loadAd(Object obj) {
        return this.purchase.loadAd(obj);
    }

    @Override // defpackage.AbstractC10759l
    public final int metrica() {
        return this.purchase.metrica();
    }

    @Override // defpackage.AbstractC10759l
    public final int purchase(int i, int i2, boolean z) {
        return this.purchase.purchase(i, i2, z);
    }

    @Override // defpackage.AbstractC10759l
    public C4322l remoteconfig(int i, C4322l c4322l, long j) {
        return this.purchase.remoteconfig(i, c4322l, j);
    }

    @Override // defpackage.AbstractC10759l
    public Object smaato(int i) {
        return this.purchase.smaato(i);
    }

    @Override // defpackage.AbstractC10759l
    public final int yandex(boolean z) {
        return this.purchase.yandex(z);
    }
}
