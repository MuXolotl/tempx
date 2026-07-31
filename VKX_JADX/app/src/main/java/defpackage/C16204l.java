package defpackage;

/* JADX INFO: renamed from: lٖٕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16204l extends RuntimeException {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Throwable f31703l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f31704l;

    public C16204l(int i, Throwable th) {
        super(th);
        this.f31704l = i;
        this.f31703l = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f31703l;
    }
}
