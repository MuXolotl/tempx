package defpackage;

import java.util.Random;

/* JADX INFO: renamed from: lٌؒٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8502l extends AbstractC4777l {
    @Override // defpackage.AbstractC4777l
    public final int amazon() {
        return subs().nextInt();
    }

    @Override // defpackage.AbstractC4777l
    public final long billing() {
        return subs().nextLong();
    }

    @Override // defpackage.AbstractC4777l
    public final byte[] crashlytics(byte[] bArr) {
        subs().nextBytes(bArr);
        return bArr;
    }

    public final int isPro(int i) {
        return subs().nextInt(i);
    }

    public abstract Random subs();

    @Override // defpackage.AbstractC4777l
    public final int yandex(int i) {
        return (subs().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }
}
