package defpackage;

/* JADX INFO: renamed from: lؗٔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4885l extends AbstractC14971l implements InterfaceC2653l {

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C0086l f9957l;

    @Override // defpackage.InterfaceC2653l
    public final Object crashlytics(InterfaceC13490l interfaceC13490l, Object obj) {
        C1809l c1809l = obj instanceof C1809l ? (C1809l) obj : null;
        if (c1809l == null) {
            c1809l = new C1809l();
        }
        c1809l.crashlytics = new C17974l(this.f9957l);
        return c1809l;
    }
}
