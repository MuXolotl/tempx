package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: renamed from: lؙؕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3594l {
    public static int loadAd(int i, int i2) {
        if (i2 < 0) {
            C8339l.metrica("cannot store more than MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        return iHighestOneBit < 0 ? Alert.DURATION_SHOW_INDEFINITELY : iHighestOneBit;
    }

    public abstract AbstractC3594l yandex(Object obj);
}
