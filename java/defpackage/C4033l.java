package defpackage;

/* JADX INFO: renamed from: lَؖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4033l implements InterfaceC18080l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public float f8313l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public float f8314l;

    public C4033l(int i) {
        switch (i) {
            case 5:
                break;
            default:
                this.f8314l = Math.max(1.0E-7f, Math.abs(0.1f));
                this.f8313l = Math.max(1.0E-4f, 1.0f) * (-4.2f);
                break;
        }
    }

    @Override // defpackage.InterfaceC18080l
    public float adcel(float f, float f2) {
        float fAbs = Math.abs(f2);
        float f3 = this.f8314l;
        if (fAbs <= f3) {
            return f;
        }
        double dLog = Math.log(Math.abs(f3 / f2));
        float f4 = this.f8313l;
        return ((f2 / f4) * ((float) Math.exp((((double) f4) * ((dLog / ((double) f4)) * 1000.0d)) / 1000.0d))) + (f - (f2 / f4));
    }

    @Override // defpackage.InterfaceC18080l
    public float firebase(float f, float f2, long j) {
        float f3 = this.f8313l;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }

    public double loadAd(float f) {
        float[] fArr = AbstractC6039l.yandex;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.f8314l * this.f8313l)));
    }

    @Override // defpackage.InterfaceC18080l
    public long metrica(float f) {
        return ((long) ((((float) Math.log(this.f8314l / Math.abs(f))) * 1000.0f) / this.f8313l)) * 1000000;
    }

    @Override // defpackage.InterfaceC18080l
    public float mopub() {
        return this.f8314l;
    }

    @Override // defpackage.InterfaceC18080l
    public float subs(float f, long j) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.f8313l));
    }

    public C18509l yandex(float f) {
        double dLoadAd = loadAd(f);
        double d = AbstractC12964l.yandex;
        double d2 = d - 1.0d;
        return new C18509l(f, (float) (Math.exp((d / d2) * dLoadAd) * ((double) (this.f8314l * this.f8313l))), (long) (Math.exp(dLoadAd / d2) * 1000.0d));
    }

    public /* synthetic */ C4033l(float f, float f2, float f3, float f4) {
        this.f8314l = f3;
        this.f8313l = f4;
    }
}
