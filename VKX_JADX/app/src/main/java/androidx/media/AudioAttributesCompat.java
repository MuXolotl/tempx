package androidx.media;

import android.util.SparseIntArray;
import defpackage.InterfaceC12713l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC12713l {
    public static final /* synthetic */ int loadAd = 0;
    public AudioAttributesImpl yandex;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.yandex;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).yandex;
        if (audioAttributesImpl == null) {
            return audioAttributesImpl2 == null;
        }
        return audioAttributesImpl.equals(audioAttributesImpl2);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return this.yandex.toString();
    }
}
