package defpackage;

/* JADX INFO: renamed from: lٌۣۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9149l implements InterfaceC15930l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f18794l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC15930l f18795l;

    public C9149l(InterfaceC15930l interfaceC15930l, long j) {
        this.f18795l = interfaceC15930l;
        this.f18794l = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9149l)) {
            return false;
        }
        C9149l c9149l = (C9149l) obj;
        return c9149l.f18794l == this.f18794l && AbstractC8576l.yandex(c9149l.f18795l, this.f18795l);
    }

    public final int hashCode() {
        int iHashCode = this.f18795l.hashCode() * 31;
        long j = this.f18794l;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: package */
    public final AbstractC2249l mo1830package(AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        return subscription(mo1832volatile(abstractC2249l, abstractC2249l2, abstractC2249l3), abstractC2249l, abstractC2249l2, abstractC2249l3);
    }

    @Override // defpackage.InterfaceC15930l
    public final AbstractC2249l subscription(long j, AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        long j2 = this.f18794l;
        return j < j2 ? abstractC2249l3 : this.f18795l.subscription(j - j2, abstractC2249l, abstractC2249l2, abstractC2249l3);
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: throws */
    public final AbstractC2249l mo1831throws(long j, AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        long j2 = this.f18794l;
        return j < j2 ? abstractC2249l : this.f18795l.mo1831throws(j - j2, abstractC2249l, abstractC2249l2, abstractC2249l3);
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: volatile */
    public final long mo1832volatile(AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        return this.f18795l.mo1832volatile(abstractC2249l, abstractC2249l2, abstractC2249l3) + this.f18794l;
    }

    @Override // defpackage.InterfaceC15930l
    public final boolean yandex() {
        return this.f18795l.yandex();
    }
}
