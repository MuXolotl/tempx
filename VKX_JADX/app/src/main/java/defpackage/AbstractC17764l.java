package defpackage;

import java.security.Provider;
import java.security.Security;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lً٘ؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17764l {
    public static final String[] yandex = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static String admob(List list) {
        Collections.sort(list);
        StringBuilder sb = new StringBuilder(list.size() * 16);
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size()) {
                sb.append(" ");
            }
            sb.append((String) list.get(i));
        }
        return sb.toString().trim();
    }

    public static final int amazon(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                C8339l.metrica("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static final long billing(C14153l c14153l, EnumC7283l enumC7283l, C3272l c3272l) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (enumC7283l == null) {
            return c14153l.crashlytics;
        }
        int i = c3272l.yandex;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (c14153l.crashlytics >> 32));
        } else {
            if (i != 2) {
                return c14153l.crashlytics;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (c14153l.crashlytics & 4294967295L));
        }
        if (enumC7283l == EnumC7283l.f15125l) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    public static final void crashlytics(InterfaceC14029l interfaceC14029l, Throwable th) {
        if (th instanceof C1049l) {
            th = ((C1049l) th).f2913l;
        }
        interfaceC14029l.subs(new C18435l(th));
        throw th;
    }

    public static final boolean loadAd(C14153l c14153l) {
        return !c14153l.admob && c14153l.amazon;
    }

    public static Provider mopub() {
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(yandex[i]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    public static final long purchase(C14153l c14153l, EnumC7283l enumC7283l, C3272l c3272l, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        long j2 = c14153l.mopub;
        if (enumC7283l != null) {
            int i = c3272l.yandex;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (enumC7283l == EnumC7283l.f15125l) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j = jFloatToRawIntBits3 << 32;
            }
            j2 = j | (4294967295L & jFloatToRawIntBits);
        }
        long jAdmob = C1187l.admob(billing(c14153l, enumC7283l, c3272l), j2);
        if (z || !c14153l.subs) {
            return jAdmob;
        }
        return 0L;
    }

    public static final boolean yandex(C14153l c14153l) {
        return c14153l.admob && !c14153l.amazon;
    }
}
