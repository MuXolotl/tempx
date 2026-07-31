package defpackage;

/* JADX INFO: renamed from: lِٜۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11984l extends AbstractC18291l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f23892l;

    @Override // defpackage.AbstractC18291l, defpackage.InterfaceC14991l
    public final long ad(C0869l c0869l, long j) {
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.ads(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.f35782l) {
            C8339l.smaato("closed");
            return 0L;
        }
        if (this.f23892l) {
            return -1L;
        }
        long jAd = super.ad(c0869l, j);
        if (jAd != -1) {
            return jAd;
        }
        this.f23892l = true;
        yandex(C8309l.f17203l);
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f35782l) {
            return;
        }
        if (!this.f23892l) {
            yandex(C8417l.billing);
        }
        this.f35782l = true;
    }
}
