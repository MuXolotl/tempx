package defpackage;

/* JADX INFO: renamed from: lٌٟۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8990l extends AbstractC9544l implements InterfaceC10955l {
    public final long yandex;

    public C8990l(long j) {
        this.yandex = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8990l) {
            return C9735l.crashlytics(this.yandex, ((C8990l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.yandex);
    }

    @Override // defpackage.InterfaceC10955l
    public final Object loadAd(Object obj, float f) {
        if (obj == null) {
            obj = new C8990l(C9735l.isPro);
        }
        if (!(obj instanceof C8990l)) {
            return null;
        }
        return new C8990l(AbstractC12953l.remoteconfig(this.yandex, ((C8990l) obj).yandex, f));
    }

    public final String toString() {
        return AbstractC15560l.Signature("SolidColor(value=", C9735l.subs(this.yandex), ")");
    }

    @Override // defpackage.AbstractC9544l
    public final void yandex(float f, long j, C4480l c4480l) {
        c4480l.amazon(1.0f);
        long jLoadAd = this.yandex;
        if (f != 1.0f) {
            jLoadAd = C9735l.loadAd(C9735l.amazon(jLoadAd) * f, jLoadAd);
        }
        c4480l.billing(jLoadAd);
        if (c4480l.crashlytics != null) {
            c4480l.isPro(null);
        }
    }
}
