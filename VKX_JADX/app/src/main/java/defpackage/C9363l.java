package defpackage;

/* JADX INFO: renamed from: lٍؘۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9363l extends AbstractC10199l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public AbstractC10199l f19193l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C5191l f19194l;

    public C9363l(C2485l c2485l) {
        super(4);
        this.f19194l = new C5191l(c2485l);
        this.f19193l = loadAd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19193l != null;
    }

    public final C0331l loadAd() {
        C5191l c5191l = this.f19194l;
        if (c5191l.hasNext()) {
            return new C0331l(c5191l.loadAd());
        }
        return null;
    }

    @Override // defpackage.AbstractC10199l
    public final byte yandex() {
        AbstractC10199l abstractC10199l = this.f19193l;
        if (abstractC10199l == null) {
            C4875l.firebase();
            return (byte) 0;
        }
        byte bYandex = abstractC10199l.yandex();
        if (!this.f19193l.hasNext()) {
            this.f19193l = loadAd();
        }
        return bYandex;
    }
}
