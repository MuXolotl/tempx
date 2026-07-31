package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؘؕؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5426l implements InterfaceC7405l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final List f11626l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f11627l = -1;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f11628l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f11629l;

    public C5426l(long j, List list) {
        this.f11628l = list.size() - 1;
        this.f11629l = j;
        this.f11626l = list;
    }

    @Override // defpackage.InterfaceC7405l
    public final long amazon() {
        long j = this.f11627l;
        if (j < 0 || j > this.f11628l) {
            C4875l.firebase();
            return 0L;
        }
        return this.f11629l + ((AbstractC10042l) this.f11626l.get((int) j)).f20476l;
    }

    @Override // defpackage.InterfaceC7405l
    public final boolean next() {
        long j = this.f11627l + 1;
        this.f11627l = j;
        return !(j > this.f11628l);
    }

    @Override // defpackage.InterfaceC7405l
    public final long vip() {
        long j = this.f11627l;
        if (j < 0 || j > this.f11628l) {
            C4875l.firebase();
            return 0L;
        }
        AbstractC10042l abstractC10042l = (AbstractC10042l) this.f11626l.get((int) j);
        return this.f11629l + abstractC10042l.f20476l + abstractC10042l.f20470l;
    }
}
