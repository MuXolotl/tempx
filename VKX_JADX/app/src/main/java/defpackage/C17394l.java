package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٗۚ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17394l extends AbstractC9813l implements InterfaceC13238l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f33875l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f33876l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC18082l f33877l;

    public C17394l(AbstractC18082l abstractC18082l, int i, int i2) {
        this.f33877l = abstractC18082l;
        this.f33876l = i;
        AbstractC4603l.amazon(i, i2, abstractC18082l.pro());
        this.f33875l = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC4603l.loadAd(i, this.f33875l);
        return this.f33877l.get(this.f33876l + i);
    }

    @Override // defpackage.AbstractC7095l
    public final int pro() {
        return this.f33875l;
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final List subList(int i, int i2) {
        AbstractC4603l.amazon(i, i2, this.f33875l);
        int i3 = this.f33876l;
        return new C17394l(this.f33877l, i + i3, i3 + i2);
    }
}
