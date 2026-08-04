package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: lَٙؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10371l {
    public C16543l amazon;
    public int billing;
    public long mopub;
    public int purchase;
    public final byte[] yandex = new byte[8];
    public final ArrayDeque loadAd = new ArrayDeque();
    public final C5601l crashlytics = new C5601l(1);

    public final long yandex(InterfaceC10430l interfaceC10430l, int i) {
        byte[] bArr = this.yandex;
        interfaceC10430l.readFully(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }
}
