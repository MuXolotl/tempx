package defpackage;

import android.util.Pair;

/* JADX INFO: renamed from: lؖ۠ٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4445l implements InterfaceC1584l {
    public final long crashlytics;
    public final long[] loadAd;
    public final long[] yandex;

    public C4445l(long j, long[] jArr, long[] jArr2) {
        this.yandex = jArr;
        this.loadAd = jArr2;
        this.crashlytics = j == -9223372036854775807L ? AbstractC15323l.m3962continue(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair admob(long j, long[] jArr, long[] jArr2) {
        int iBilling = AbstractC15323l.billing(jArr, j, true);
        long j2 = jArr[iBilling];
        long j3 = jArr2[iBilling];
        int i = iBilling + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.InterfaceC12703l
    public final /* synthetic */ boolean amazon() {
        return false;
    }

    @Override // defpackage.InterfaceC1584l
    public final int billing() {
        return -2147483647;
    }

    @Override // defpackage.InterfaceC1584l
    public final long crashlytics(long j) {
        return AbstractC15323l.m3962continue(((Long) admob(j, this.yandex, this.loadAd).second).longValue());
    }

    @Override // defpackage.InterfaceC12703l
    public final boolean loadAd() {
        return true;
    }

    @Override // defpackage.InterfaceC12703l
    public final long mopub() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC12703l
    public final C15528l purchase(long j) {
        Pair pairAdmob = admob(AbstractC15323l.m3986try(AbstractC15323l.firebase(j, 0L, this.crashlytics)), this.loadAd, this.yandex);
        C4304l c4304l = new C4304l(AbstractC15323l.m3962continue(((Long) pairAdmob.first).longValue()), ((Long) pairAdmob.second).longValue());
        return new C15528l(c4304l, c4304l);
    }

    @Override // defpackage.InterfaceC1584l
    public final long yandex() {
        return -1L;
    }
}
