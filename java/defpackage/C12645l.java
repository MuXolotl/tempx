package defpackage;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: lّٖۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12645l implements Comparable, Cloneable {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final BigInteger f24871l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final long f24872l = new BigInteger("FFFFFFFF", 16).longValue();

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C13975l f24873l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f24874l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public byte[] f24875l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final EnumC0678l f24876l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f24877l;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f24873l = new C13975l(4);
        f24871l = new BigInteger("FFFFFFFFFFFFFFFF", 16);
    }

    public C12645l(EnumC0678l enumC0678l, String str, int i, int i2) {
        this.f24875l = new byte[0];
        IllegalArgumentException illegalArgumentExceptionYandex = enumC0678l.yandex(str, new byte[0], i);
        if (illegalArgumentExceptionYandex != null) {
            throw illegalArgumentExceptionYandex;
        }
        this.f24876l = enumC0678l;
        this.f24877l = str;
        this.f24874l = i;
    }

    public final void admob(BigInteger bigInteger) {
        if (BigInteger.ZERO.compareTo(bigInteger) > 0) {
            C8339l.metrica("Only unsigned values allowed (no negative)");
            return;
        }
        if (f24871l.compareTo(bigInteger) < 0) {
            C8339l.metrica("Value exceeds QWORD (64 bit unsigned)");
            return;
        }
        this.f24875l = new byte[8];
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length <= 8) {
            for (int length = byteArray.length - 1; length >= 0; length--) {
                this.f24875l[byteArray.length - (length + 1)] = byteArray[length];
            }
        } else {
            Arrays.fill(this.f24875l, (byte) -1);
        }
        this.f24874l = 4;
    }

    public final byte[] amazon() {
        byte[] bArr = this.f24875l;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final void billing(long j) {
        long j2 = f24872l;
        if (j < 0 || j > j2) {
            C8339l.metrica(AbstractC2812l.subscription(j2, "value out of range (0-", ")"));
            return;
        }
        String str = AbstractC3848l.yandex;
        byte[] bArr = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr[i] = (byte) ((j >>> (i * 8)) & 255);
        }
        this.f24875l = bArr;
        this.f24874l = 3;
    }

    public final Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f24877l.compareTo(((C12645l) obj).f24877l);
    }

    public final long crashlytics() {
        int i = this.f24874l;
        int i2 = 2;
        if (i == 2) {
            i2 = 1;
        } else if (i == 3) {
            i2 = 4;
        } else if (i == 4) {
            i2 = 8;
        } else if (i != 5) {
            C10754l.ads(AbstractC14814l.remoteconfig(this.f24874l, ")", new StringBuilder("The current type doesn't allow an interpretation as a number. (")));
            return 0L;
        }
        if (i2 > this.f24875l.length) {
            C8339l.smaato("The stored data cannot represent the type of current object.");
            return 0L;
        }
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= (((long) this.f24875l[i3]) & 255) << (i3 * 8);
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12645l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C12645l c12645l = (C12645l) obj;
        return c12645l.f24877l.equals(this.f24877l) && c12645l.f24874l == this.f24874l && Arrays.equals(this.f24875l, c12645l.f24875l);
    }

    public final int hashCode() {
        return this.f24877l.hashCode();
    }

    public final C4421l loadAd() {
        if (this.f24874l == 6 && this.f24875l.length == 16) {
            byte[] bArr = this.f24875l;
            C4421l c4421l = new C4421l();
            c4421l.yandex = "";
            c4421l.loadAd = null;
            int length = bArr.length;
            int[] iArr = new int[length];
            for (int i = 0; i < bArr.length; i++) {
                iArr[i] = bArr[i] & 255;
            }
            if (length == 16) {
                int[] iArr2 = new int[16];
                c4421l.loadAd = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 16);
                return c4421l;
            }
            C8339l.metrica("The given guidData doesn't match the GUID specification.");
        }
        return null;
    }

    public final String purchase() {
        switch (this.f24874l) {
            case 0:
                try {
                    return new String(this.f24875l, "UTF-16LE");
                } catch (UnsupportedEncodingException unused) {
                    EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                    f24873l.getClass();
                    int i = C17500l.yandex;
                    return null;
                }
            case 1:
                return "binary data";
            case 2:
                byte[] bArr = this.f24875l;
                boolean z = false;
                if (bArr.length > 0 && bArr[0] != 0) {
                    z = true;
                }
                return String.valueOf(z);
            case 3:
            case 4:
            case 5:
                return String.valueOf(crashlytics());
            case 6:
                return loadAd() == null ? "Invalid GUID" : loadAd().toString();
            default:
                C8339l.smaato("Current type is not known.");
                return null;
        }
    }

    public final void subs(String str) {
        if (str == null) {
            this.f24875l = new byte[0];
        } else {
            byte[] bArrLoadAd = AbstractC3848l.loadAd(str, C4616l.mopub);
            long length = bArrLoadAd.length;
            EnumC0678l enumC0678l = this.f24876l;
            long j = enumC0678l.f2166l;
            if ((j != -1 && j < length) || length < 0) {
                C6356l.amazon();
                C8339l.metrica(String.format(Locale.getDefault(), "Trying to create field with %s bytes of data but the maximum data allowed in WMA files is %s for %s.", Integer.valueOf(bArrLoadAd.length), enumC0678l.f2163l, enumC0678l.f2165l.yandex));
                return;
            }
            this.f24875l = bArrLoadAd;
        }
        this.f24874l = 0;
    }

    public final String toString() {
        return this.f24877l + " : " + new String[]{"String: ", "Binary: ", "Boolean: ", "DWORD: ", "QWORD:", "WORD:", "GUID:"}[this.f24874l] + purchase() + " (language: 0 / stream: 0)";
    }

    public final int yandex(EnumC0678l enumC0678l) {
        EnumC0678l enumC0678l2 = EnumC0678l.EXTENDED_CONTENT;
        int length = (this.f24877l.length() * 2) + (enumC0678l != enumC0678l2 ? 14 : 8);
        int i = this.f24874l;
        if (i == 2) {
            return enumC0678l == enumC0678l2 ? length + 4 : length + 2;
        }
        int length2 = length + this.f24875l.length;
        return i == 0 ? length2 + 2 : length2;
    }

    public C12645l(String str, int i) {
        this(EnumC0678l.METADATA_LIBRARY_OBJECT, str, i, 0);
    }
}
