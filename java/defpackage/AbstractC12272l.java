package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: lًِۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12272l {
    public static final C15578l yandex = new C15578l(516498437, false, new C11813l(22));
    public static final C15578l loadAd = new C15578l(-791105934, false, new C11813l(23));

    public static ScheduledExecutorServiceC10335l admob() {
        if (AbstractC8532l.yandex != null) {
            return AbstractC8532l.yandex;
        }
        synchronized (AbstractC8532l.class) {
            try {
                if (AbstractC8532l.yandex == null) {
                    AbstractC8532l.yandex = new ScheduledExecutorServiceC10335l(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return AbstractC8532l.yandex;
    }

    public static ExecutorC0877l amazon() {
        if (ExecutorC0877l.f2529l != null) {
            return ExecutorC0877l.f2529l;
        }
        synchronized (ExecutorC0877l.class) {
            try {
                if (ExecutorC0877l.f2529l == null) {
                    ExecutorC0877l.f2529l = new ExecutorC0877l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ExecutorC0877l.f2529l;
    }

    public static final void billing(C2566l c2566l, int i, int i2, CharSequence charSequence) {
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int i3 = 0;
        int i4 = iMin;
        while (i4 < iMax && i3 < charSequence.length() && charSequence.charAt(i3) == c2566l.f5577l.charAt(i4)) {
            i3++;
            i4++;
        }
        int length = charSequence.length();
        while (iMax > i4 && length > i3 && charSequence.charAt(length - 1) == c2566l.f5577l.charAt(iMax - 1)) {
            length--;
            iMax--;
        }
        if (i4 == iMax && i3 == length) {
            c2566l.billing(null);
            c2566l.f5584l = null;
        } else {
            c2566l.crashlytics(i4, iMax, charSequence.subSequence(i3, length));
        }
        int length2 = charSequence.length() + iMin;
        c2566l.mopub(AbstractC2296l.loadAd(length2, length2));
    }

    public static final float crashlytics(long j, EnumC7283l enumC7283l) {
        int iOrdinal = enumC7283l.ordinal();
        if (iOrdinal == 0) {
            return C1187l.billing(j);
        }
        if (iOrdinal == 1) {
            return C1187l.purchase(j);
        }
        C18725l.billing();
        return 0.0f;
    }

    public static final void loadAd(InterfaceC13349l interfaceC13349l, int i, long j, float f, float f2) {
        if (i == 1) {
            float f3 = f / 2.0f;
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)) - f3) - f2;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)) / 2.0f;
            AbstractC9361l.admob(interfaceC13349l, j, f3, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2))), null, 120);
            return;
        }
        float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)) - f) - f2;
        float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)) - f) / 2.0f;
        AbstractC9361l.metrica(interfaceC13349l, j, (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f))), 0.0f, null, null, 0, 120);
    }

    public static ExecutorC17086l mopub() {
        if (ExecutorC17086l.f33245l != null) {
            return ExecutorC17086l.f33245l;
        }
        synchronized (ExecutorC17086l.class) {
            try {
                if (ExecutorC17086l.f33245l == null) {
                    ExecutorC17086l.f33245l = new ExecutorC17086l(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ExecutorC17086l.f33245l;
    }

    public static final void purchase(C2566l c2566l, int i, int i2) {
        C12814l c12814l = c2566l.f5578l;
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        c2566l.amazon(iMin, iMax, "", 0, 0);
        if (c12814l != null) {
            long jYandex = AbstractC16357l.yandex(iMin, iMax, 0, c12814l.yandex);
            if (C12814l.amazon(jYandex)) {
                c2566l.billing(null);
            } else {
                c2566l.purchase(C12814l.mopub(jYandex), C12814l.billing(jYandex), null);
            }
        }
    }

    public static ExecutorC12908l yandex() {
        if (ExecutorC12908l.f25366l != null) {
            return ExecutorC12908l.f25366l;
        }
        synchronized (ExecutorC12908l.class) {
            try {
                if (ExecutorC12908l.f25366l == null) {
                    ExecutorC12908l.f25366l = new ExecutorC12908l(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ExecutorC12908l.f25366l;
    }
}
