package defpackage;

/* JADX INFO: renamed from: lٖٓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14334l extends AbstractC13582l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final transient int f28082l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC13582l f28083l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient int f28084l;

    public C14334l(AbstractC13582l abstractC13582l, int i, int i2) {
        this.f28083l = abstractC13582l;
        this.f28082l = i;
        this.f28084l = i2;
    }

    @Override // defpackage.AbstractC10277l
    public final Object[] admob() {
        return this.f28083l.admob();
    }

    @Override // defpackage.AbstractC10277l
    public final int billing() {
        return this.f28083l.mopub() + this.f28082l + this.f28084l;
    }

    @Override // defpackage.AbstractC13582l, java.util.List
    /* JADX INFO: renamed from: firebase, reason: merged with bridge method [inline-methods] */
    public final AbstractC13582l subList(int i, int i2) {
        AbstractC17122l.admob(i, i2, this.f28084l);
        int i3 = this.f28082l;
        return this.f28083l.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC17122l.mopub(i, this.f28084l);
        return this.f28083l.get(i + this.f28082l);
    }

    @Override // defpackage.AbstractC10277l
    public final int mopub() {
        return this.f28083l.mopub() + this.f28082l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28084l;
    }
}
