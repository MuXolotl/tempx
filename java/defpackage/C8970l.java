package defpackage;

/* JADX INFO: renamed from: lٌٟ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8970l extends AbstractC10977l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C8970l f18502l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public transient C7544l f18503l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final transient C3528l f18504l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final transient int f18505l;

    static {
        C3528l c3528l = new C3528l();
        c3528l.amazon(3);
        f18502l = new C8970l(c3528l);
    }

    public C8970l(C3528l c3528l) {
        this.f18504l = c3528l;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = c3528l.crashlytics;
            if (i >= i2) {
                this.f18505l = AbstractC9966l.ads(j);
                return;
            } else {
                AbstractC12442l.smaato(i, i2);
                j += (long) c3528l.loadAd[i];
                i++;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f18505l;
    }

    @Override // defpackage.AbstractC5511l
    public final boolean smaato() {
        throw null;
    }

    @Override // defpackage.AbstractC10977l
    public final AbstractC8481l vip() {
        C7544l c7544l = this.f18503l;
        if (c7544l != null) {
            return c7544l;
        }
        C7544l c7544l2 = new C7544l(this, 1);
        this.f18503l = c7544l2;
        return c7544l2;
    }
}
