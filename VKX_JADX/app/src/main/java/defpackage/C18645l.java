package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؘۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18645l implements InterfaceC12703l {
    public final long[] amazon;
    public final long billing;
    public final long[] crashlytics;
    public final int[] loadAd;
    public final long[] purchase;
    public final int yandex;

    public C18645l(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.loadAd = iArr;
        this.crashlytics = jArr;
        this.amazon = jArr2;
        this.purchase = jArr3;
        int length = iArr.length;
        this.yandex = length;
        if (length <= 0) {
            this.billing = 0L;
        } else {
            int i = length - 1;
            this.billing = jArr2[i] + jArr3[i];
        }
    }

    @Override // defpackage.InterfaceC12703l
    public final /* synthetic */ boolean amazon() {
        return false;
    }

    @Override // defpackage.InterfaceC12703l
    public final boolean loadAd() {
        return true;
    }

    @Override // defpackage.InterfaceC12703l
    public final long mopub() {
        return this.billing;
    }

    @Override // defpackage.InterfaceC12703l
    public final C15528l purchase(long j) {
        long[] jArr = this.purchase;
        int iBilling = AbstractC15323l.billing(jArr, j, true);
        long j2 = jArr[iBilling];
        long[] jArr2 = this.crashlytics;
        C4304l c4304l = new C4304l(j2, jArr2[iBilling]);
        if (j2 >= j || iBilling == this.yandex - 1) {
            return new C15528l(c4304l, c4304l);
        }
        int i = iBilling + 1;
        return new C15528l(c4304l, new C4304l(jArr[i], jArr2[i]));
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.yandex + ", sizes=" + Arrays.toString(this.loadAd) + ", offsets=" + Arrays.toString(this.crashlytics) + ", timeUs=" + Arrays.toString(this.purchase) + ", durationsUs=" + Arrays.toString(this.amazon) + ")";
    }
}
