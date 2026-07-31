package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؗٛؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4995l extends AbstractC12974l {
    public static final C4995l admob;
    public static final C4995l mopub;
    public final boolean billing;

    static {
        C4995l c4995l = new C4995l(new int[]{2, 3, 0}, false);
        mopub = c4995l;
        int i = c4995l.crashlytics;
        int i2 = c4995l.loadAd;
        admob = (i2 == 1 && i == 9) ? new C4995l(new int[]{2, 0, 0}, false) : new C4995l(new int[]{i2, i + 1, 0}, false);
        new C4995l(new int[0], false);
    }

    public C4995l(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        this.billing = z;
    }
}
