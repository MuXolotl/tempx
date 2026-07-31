package defpackage;

/* JADX INFO: renamed from: lؚؓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6981l extends AbstractC15096l {
    public final C17721l loadAd;

    public C6981l(C17721l c17721l) {
        this.loadAd = c17721l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6981l) && this.loadAd.equals(((C6981l) obj).loadAd);
    }

    public final int hashCode() {
        return this.loadAd.yandex.hashCode();
    }

    @Override // defpackage.AbstractC15096l
    public final AbstractC7444l mopub(C5740l c5740l, int i) {
        return ((C17721l) ((C1080l) AbstractC5715l.yandex(((InterfaceC9955l) c5740l.f12124l).billing())).f2971l).equals(this.loadAd) ? AbstractC7444l.amazon : AbstractC7444l.loadAd;
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("(method:"), this.loadAd.yandex, ')');
    }
}
