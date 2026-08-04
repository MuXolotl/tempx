package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: lؒؒۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0789l extends AbstractC18291l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f2381l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C8417l f2382l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0789l(C8417l c8417l, C6705l c6705l, long j) {
        super(c8417l, c6705l);
        this.f2382l = c8417l;
        this.f2381l = j;
        if (j == 0) {
            yandex(C8309l.f17203l);
        }
    }

    @Override // defpackage.AbstractC18291l, defpackage.InterfaceC14991l
    public final long ad(C0869l c0869l, long j) throws ProtocolException {
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.ads(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.f35782l) {
            C8339l.smaato("closed");
            return 0L;
        }
        long j2 = this.f2381l;
        if (j2 == 0) {
            return -1L;
        }
        long jAd = super.ad(c0869l, Math.min(j2, j));
        if (jAd == -1) {
            this.f2382l.loadAd.purchase();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            yandex(C8417l.billing);
            throw protocolException;
        }
        long j3 = this.f2381l - jAd;
        this.f2381l = j3;
        if (j3 == 0) {
            yandex(C8309l.f17203l);
        }
        return jAd;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zMopub;
        if (this.f35782l) {
            return;
        }
        if (this.f2381l != 0) {
            try {
                zMopub = AbstractC11432l.mopub(this, 100);
            } catch (IOException unused) {
                zMopub = false;
            }
            if (!zMopub) {
                this.f2382l.loadAd.purchase();
                yandex(C8417l.billing);
            }
        }
        this.f35782l = true;
    }
}
