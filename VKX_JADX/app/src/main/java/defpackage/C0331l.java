package defpackage;

/* JADX INFO: renamed from: lؑٔٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0331l extends AbstractC10199l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f1375l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f1376l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1096l f1377l;

    public C0331l(AbstractC1096l abstractC1096l) {
        super(4);
        this.f1377l = abstractC1096l;
        this.f1376l = 0;
        this.f1375l = abstractC1096l.admob();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1376l < this.f1375l;
    }

    @Override // defpackage.AbstractC10199l
    public final byte yandex() {
        int i = this.f1376l;
        if (i < this.f1375l) {
            this.f1376l = i + 1;
            return this.f1377l.billing(i);
        }
        C4875l.firebase();
        return (byte) 0;
    }
}
