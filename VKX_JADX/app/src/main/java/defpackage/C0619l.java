package defpackage;

/* JADX INFO: renamed from: lؑ۟ٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0619l extends AbstractC14904l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final transient int f2075l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC14904l f2076l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient int f2077l;

    public C0619l(AbstractC14904l abstractC14904l, int i, int i2) {
        this.f2076l = abstractC14904l;
        this.f2075l = i;
        this.f2077l = i2;
    }

    @Override // defpackage.AbstractC11819l
    public final Object[] admob() {
        return this.f2076l.admob();
    }

    @Override // defpackage.AbstractC11819l
    public final int billing() {
        return this.f2076l.mopub() + this.f2075l + this.f2077l;
    }

    @Override // defpackage.AbstractC14904l, java.util.List
    /* JADX INFO: renamed from: firebase, reason: merged with bridge method [inline-methods] */
    public final AbstractC14904l subList(int i, int i2) {
        AbstractC4654l.ads(i, i2, this.f2077l);
        int i3 = this.f2075l;
        return this.f2076l.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC4654l.adcel(i, this.f2077l);
        return this.f2076l.get(i + this.f2075l);
    }

    @Override // defpackage.AbstractC11819l
    public final int mopub() {
        return this.f2076l.mopub() + this.f2075l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2077l;
    }
}
