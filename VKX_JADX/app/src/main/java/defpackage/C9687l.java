package defpackage;

/* JADX INFO: renamed from: lٍٜؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9687l extends AbstractC17054l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C13975l f19761l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f19762l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f19763l;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f19761l = new C13975l(4);
    }

    @Override // defpackage.AbstractC17054l
    public final String toString() {
        C18449l c18449lBilling = AbstractC11999l.billing(this);
        c18449lBilling.subscription(this.f19763l, "timeScale");
        c18449lBilling.tapsense(this.f19762l, "timeLength");
        return c18449lBilling.toString();
    }
}
