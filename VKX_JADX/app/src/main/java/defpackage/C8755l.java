package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٌٓؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8755l {
    public final long amazon;
    public final long crashlytics;
    public final long loadAd;
    public final AbstractC1186l yandex;

    public C8755l(long j, long j2, List list) {
        this.yandex = AbstractC1186l.Signature(list);
        this.loadAd = j;
        this.crashlytics = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.amazon = j3;
    }
}
