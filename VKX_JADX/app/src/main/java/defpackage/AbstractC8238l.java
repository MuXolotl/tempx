package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًۙۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8238l {
    public static final void amazon() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final InterfaceC17242l billing(InterfaceC17242l interfaceC17242l, Function1 function1) {
        return interfaceC17242l.premium(new C9371l(function1));
    }

    public static void crashlytics(int i, byte[] bArr, int[] iArr) {
        int length = iArr.length * 2;
        int[] iArr2 = new int[length];
        int i2 = iArr[iArr.length - 1] >> 31;
        int length2 = iArr.length;
        int i3 = length;
        while (true) {
            length2--;
            if (length2 < 0) {
                break;
            }
            int i4 = iArr[length2];
            iArr2[i3 - 1] = (i2 << 16) | (i4 >>> 16);
            i3 -= 2;
            iArr2[i3] = i4;
            i2 = i4;
        }
        int i5 = 32 - i;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < length) {
            int i9 = iArr2[i6];
            while (i7 < 16) {
                int i10 = i9 >>> i7;
                if ((i10 & 1) == i8) {
                    i7++;
                } else {
                    int i11 = (i10 | 1) << i5;
                    bArr[(i6 << 4) + i7] = (byte) (i11 >> i5);
                    i7 += i;
                    i8 = i11 >>> 31;
                }
            }
            i6++;
            i7 -= 16;
        }
    }

    public static final int loadAd(C6956l c6956l) {
        c6956l.getClass();
        long j = c6956l.f14595continue;
        return (int) (j ^ (j >>> 32));
    }

    public static final C14112l mopub(C6956l c6956l) {
        C6956l c6956l2;
        c6956l.m2122continue(206, AbstractC2032l.purchase);
        if (c6956l.f14603switch) {
            C13006l.isVip(c6956l.f14602strictfp);
        }
        Object objApplovin = c6956l.applovin();
        InterfaceC17142l c17420l = objApplovin instanceof InterfaceC17142l ? (InterfaceC17142l) objApplovin : null;
        if (c17420l == null) {
            c6956l2 = c6956l;
            c17420l = new C17420l(new C2450l(new C14112l(c6956l2, c6956l.f14595continue, c6956l.adcel, c6956l.applovin, c6956l.admob.f14528l)), -1);
            c6956l2.m2118break(c17420l);
        } else {
            c6956l2 = c6956l;
        }
        C2450l c2450l = (C2450l) ((C6031l) c17420l).yandex;
        c2450l.f5235l.billing.setValue(c6956l2.smaato());
        c6956l2.startapp(false);
        return c2450l.f5235l;
    }

    public static final boolean purchase(C3903l c3903l) {
        long j = c3903l.purchase;
        return (j >>> 32) == (4294967295L & j) && j == c3903l.billing && j == c3903l.mopub && j == c3903l.admob;
    }

    public static final C3903l yandex(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new C3903l(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }
}
