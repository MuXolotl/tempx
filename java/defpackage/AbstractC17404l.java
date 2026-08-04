package defpackage;

import android.graphics.Shader;

/* JADX INFO: renamed from: lِٗۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17404l extends AbstractC9544l {
    public long loadAd = 9205357640488583168L;
    public C7026l yandex;

    public abstract Shader crashlytics(long j);

    @Override // defpackage.AbstractC9544l
    public final void yandex(float f, long j, C4480l c4480l) {
        C7026l c7026l = this.yandex;
        if (c7026l == null || !C14174l.loadAd(this.loadAd, j)) {
            if (C14174l.mopub(j)) {
                this.yandex = null;
                this.loadAd = 9205357640488583168L;
                c7026l = null;
            } else {
                c7026l = this.yandex;
                if (c7026l == null) {
                    c7026l = new C7026l(23, false);
                    this.yandex = c7026l;
                }
                c7026l.f14720l = crashlytics(j);
                this.yandex = c7026l;
                this.loadAd = j;
            }
        }
        long jYandex = c4480l.yandex();
        long j2 = C9735l.loadAd;
        if (!C9735l.crashlytics(jYandex, j2)) {
            c4480l.billing(j2);
        }
        if (!AbstractC8576l.yandex(c4480l.crashlytics, c7026l != null ? (Shader) c7026l.f14720l : null)) {
            c4480l.isPro(c7026l != null ? (Shader) c7026l.f14720l : null);
        }
        if (c4480l.yandex.getAlpha() / 255.0f == f) {
            return;
        }
        c4480l.amazon(f);
    }
}
