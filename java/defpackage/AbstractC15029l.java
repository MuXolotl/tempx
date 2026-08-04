package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.util.List;

/* JADX INFO: renamed from: lٜٔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15029l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f29554l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f29555l;

    public AbstractC15029l(C17465l c17465l, int i) {
        if (c17465l == null) {
            C8339l.metrica("format options cannot be null");
            throw null;
        }
        if (i < 0) {
            C8339l.metrica(AbstractC9361l.Signature(i, "invalid index: ", new StringBuilder(String.valueOf(i).length() + 15)));
            throw null;
        }
        this.f29555l = i;
        this.f29554l = c17465l;
    }

    public static int amazon(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long billing(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static C2268l isPro(byte[] bArr, int i, int i2, boolean z) {
        C2268l c2268l = new C2268l(bArr, i, i2, z);
        try {
            c2268l.ads(i2);
            return c2268l;
        } catch (C2297l e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static long mopub(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int purchase(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract C14809l Signature();

    public abstract int ad();

    public void adcel(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, byte[] bArr) {
        if (bArr.length != firebase()) {
            throw new GeneralSecurityException(AbstractC0653l.vip(firebase(), "The nonce length (in bytes) must be "));
        }
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferYandex = yandex(this.f29555l + i3, bArr);
            if (i3 == i) {
                AbstractC17265l.subs(byteBuffer, byteBuffer2, byteBufferYandex, iRemaining % 64);
            } else {
                AbstractC17265l.subs(byteBuffer, byteBuffer2, byteBufferYandex, 64);
            }
        }
    }

    public abstract int admob();

    public abstract int ads(int i);

    public abstract long advert();

    public abstract int applovin();

    public abstract long appmetrica();

    public abstract int[] crashlytics(int[] iArr, int i);

    public abstract int firebase();

    public abstract int inmobi();

    public abstract float isVip();

    public abstract double license();

    public abstract void loadAd(int i);

    public abstract C13645l metrica(C12902l c12902l, C13645l c13645l);

    /* JADX INFO: renamed from: native */
    public abstract long mo1020native();

    /* JADX INFO: renamed from: package */
    public abstract String mo1021package();

    public abstract long premium();

    /* JADX INFO: renamed from: private */
    public abstract void mo1994private(C2934l c2934l, Object obj);

    public abstract int pro();

    public abstract int signatures();

    public abstract void startapp(int i);

    /* JADX INFO: renamed from: strictfp */
    public abstract int mo1023strictfp();

    public abstract boolean subs();

    public abstract boolean subscription();

    /* JADX INFO: renamed from: synchronized */
    public abstract String mo1025synchronized();

    public abstract C15379l tapsense();

    /* JADX INFO: renamed from: throws */
    public abstract long mo1027throws();

    public abstract C1473l vip(C1473l c1473l, List list);

    /* JADX INFO: renamed from: volatile */
    public abstract int mo1028volatile();

    public ByteBuffer yandex(int i, byte[] bArr) {
        int[] iArrCrashlytics = crashlytics(AbstractC0784l.purchase(bArr), i);
        int[] iArr = (int[]) iArrCrashlytics.clone();
        AbstractC0784l.amazon(iArr);
        for (int i2 = 0; i2 < iArrCrashlytics.length; i2++) {
            iArrCrashlytics[i2] = iArrCrashlytics[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrCrashlytics, 0, 16);
        return byteBufferOrder;
    }

    public void remoteconfig(C12902l c12902l) {
    }

    public void smaato(C12902l c12902l) {
    }

    public AbstractC15029l(int i) {
        this.f29555l = i;
    }
}
