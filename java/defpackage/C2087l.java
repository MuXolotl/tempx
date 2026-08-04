package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؓۙۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2087l implements InterfaceC3128l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC1186l f4676l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC3128l f4677l;

    public C2087l(InterfaceC3128l interfaceC3128l, List list) {
        this.f4677l = interfaceC3128l;
        this.f4676l = AbstractC1186l.Signature(list);
    }

    @Override // defpackage.InterfaceC3128l
    public final boolean adcel(C11495l c11495l) {
        return this.f4677l.adcel(c11495l);
    }

    @Override // defpackage.InterfaceC3128l
    public final long ads() {
        return this.f4677l.ads();
    }

    @Override // defpackage.InterfaceC3128l
    public final boolean amazon() {
        return this.f4677l.amazon();
    }

    @Override // defpackage.InterfaceC3128l
    public final long billing() {
        return this.f4677l.billing();
    }

    @Override // defpackage.InterfaceC3128l
    public final void license(long j) {
        this.f4677l.license(j);
    }
}
