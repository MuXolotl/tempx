package defpackage;

/* JADX INFO: renamed from: lٓۜۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C14440l implements InterfaceC9234l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C8467l f28282l;

    public C14440l(C8467l c8467l) {
        this.f28282l = c8467l;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C14440l) && (obj instanceof InterfaceC9234l)) {
            return this.f28282l == ((InterfaceC9234l) obj).loadAd();
        }
        return false;
    }

    public final int hashCode() {
        return this.f28282l.hashCode();
    }

    @Override // defpackage.InterfaceC9234l
    public final InterfaceC14328l loadAd() {
        return this.f28282l;
    }
}
