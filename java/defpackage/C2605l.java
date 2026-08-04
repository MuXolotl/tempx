package defpackage;

/* JADX INFO: renamed from: lٌؔٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2605l extends AbstractC8996l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final transient int f5669l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8996l f5670l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient int f5671l;

    public C2605l(AbstractC8996l abstractC8996l, int i, int i2) {
        this.f5670l = abstractC8996l;
        this.f5669l = i;
        this.f5671l = i2;
    }

    @Override // defpackage.AbstractC4477l
    public final boolean admob() {
        return true;
    }

    @Override // defpackage.AbstractC4477l
    public final int billing() {
        return this.f5670l.mopub() + this.f5669l + this.f5671l;
    }

    @Override // defpackage.AbstractC4477l
    public final Object[] firebase() {
        return this.f5670l.firebase();
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC5088l.license(i, this.f5671l);
        return this.f5670l.get(i + this.f5669l);
    }

    @Override // defpackage.AbstractC4477l
    public final int mopub() {
        return this.f5670l.mopub() + this.f5669l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5671l;
    }

    @Override // defpackage.AbstractC8996l, java.util.List
    /* JADX INFO: renamed from: smaato, reason: merged with bridge method [inline-methods] */
    public final AbstractC8996l subList(int i, int i2) {
        AbstractC5088l.pro(i, i2, this.f5671l);
        int i3 = this.f5669l;
        return this.f5670l.subList(i + i3, i2 + i3);
    }
}
