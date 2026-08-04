package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؚ۠٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7562l extends AbstractC2730l {
    public int loadAd;
    public long[] yandex;

    @Override // defpackage.AbstractC2730l
    public final int amazon() {
        return this.loadAd;
    }

    @Override // defpackage.AbstractC2730l
    public final void loadAd(int i) {
        long[] jArr = this.yandex;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.yandex = Arrays.copyOf(jArr, i);
        }
    }

    @Override // defpackage.AbstractC2730l
    public final Object yandex() {
        return Arrays.copyOf(this.yandex, this.loadAd);
    }
}
