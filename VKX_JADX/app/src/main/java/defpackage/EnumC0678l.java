package defpackage;

import java.math.BigInteger;
import java.util.Locale;

/* JADX INFO: renamed from: lۣؑۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC0678l {
    CONTENT_BRANDING(C4421l.amazon, 32, false, false, false, false),
    CONTENT_DESCRIPTION(C4421l.purchase, 16, false, false, false, false),
    EXTENDED_CONTENT(C4421l.billing, 16, false, false, false, false),
    METADATA_LIBRARY_OBJECT(C4421l.firebase, 32, true, true, true, true),
    METADATA_OBJECT(C4421l.isPro, 16, false, true, false, true);


    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final BigInteger f2163l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f2164l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C4421l f2165l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f2166l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f2167l;

    EnumC0678l(C4421l c4421l, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f2165l = c4421l;
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(i).subtract(BigInteger.ONE);
        this.f2163l = bigIntegerSubtract;
        if (bigIntegerSubtract.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
            this.f2166l = bigIntegerSubtract.longValue();
        } else {
            this.f2166l = -1L;
        }
        this.f2164l = z;
        this.f2167l = z4;
    }

    public final IllegalArgumentException yandex(String str, byte[] bArr, int i) {
        IllegalArgumentException illegalArgumentException;
        if (str == null || bArr == null) {
            illegalArgumentException = new IllegalArgumentException("Arguments must not be null.");
        } else {
            String str2 = AbstractC3848l.yandex;
            if (str.length() > 32766) {
                Locale.getDefault();
                illegalArgumentException = new IllegalArgumentException(AbstractC15560l.tapsense("Trying to create field but UTF-16LE representation is ", str.length(), " and exceeds maximum allowed of 65535."));
            } else {
                illegalArgumentException = null;
            }
        }
        C4421l c4421l = this.f2165l;
        if (illegalArgumentException == null) {
            long length = bArr.length;
            long j = this.f2166l;
            if ((j != -1 && j < length) || length < 0) {
                illegalArgumentException = new IllegalArgumentException(String.format(Locale.getDefault(), "Trying to create field with %s bytes of data but the maximum data allowed in WMA files is %s for %s.", Integer.valueOf(bArr.length), this.f2163l, c4421l.yandex));
            }
        }
        if (illegalArgumentException == null && i == 6 && !this.f2164l) {
            Locale.getDefault();
            illegalArgumentException = new IllegalArgumentException(AbstractC14814l.startapp("The use of GUID ist not allowed for ", c4421l.yandex));
        }
        return (illegalArgumentException == null && this == CONTENT_DESCRIPTION && i != 0) ? new IllegalArgumentException("Only Strings are allowed in content description objects") : illegalArgumentException;
    }
}
