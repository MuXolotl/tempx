package defpackage;

/* JADX INFO: renamed from: lؘٖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5738l extends AbstractC6897l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f12114l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f12115l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C1503l f12116l;

    public C5738l(String str, long j, C1503l c1503l) {
        this.f12115l = str;
        this.f12114l = j;
        this.f12116l = c1503l;
    }

    @Override // defpackage.AbstractC6897l
    public final long billing() {
        return this.f12114l;
    }

    @Override // defpackage.AbstractC6897l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final InterfaceC9473l mo1516l() {
        return this.f12116l;
    }

    @Override // defpackage.AbstractC6897l
    public final C12105l mopub() {
        String str = this.f12115l;
        if (str != null) {
            C11155l c11155l = C12105l.amazon;
            try {
                return AbstractC0775l.m674strictfp(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
