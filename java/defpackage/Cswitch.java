package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: renamed from: switch, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class Cswitch extends Ccase {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final ad f36580l = new ad(16, Cswitch.class);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final ConcurrentHashMap f36581l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f36582l = null;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f36583l;

    public Cswitch(byte[] bArr) {
        this.f36583l = bArr;
    }

    public static boolean appmetrica(byte[] bArr) {
        if (AbstractC8151l.crashlytics("org.bouncycastle.asn1.allow_wrong_oid_enc")) {
            return true;
        }
        if (bArr.length < 1) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            if (z && (bArr[i] & 255) == 128) {
                return false;
            }
            z = (bArr[i] & 128) == 0;
        }
        return z;
    }

    public static boolean inmobi(int i, String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            int i3 = length - 1;
            if (i3 < i) {
                if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                    break;
                }
                return true;
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt == '.') {
                if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                    break;
                }
                i2 = 0;
                length = i3;
            } else {
                if ('0' > cCharAt || cCharAt > '9') {
                    break;
                }
                i2++;
                length = i3;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static void m4587package(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + 6) / 7;
        byte[] bArr = new byte[iBitLength];
        int i = iBitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & 127);
        byteArrayOutputStream.write(bArr, 0, iBitLength);
    }

    public static Cswitch premium(boolean z, byte[] bArr) {
        if (bArr.length > 4096) {
            C8339l.metrica("exceeded relative OID contents length limit");
            return null;
        }
        Cswitch cswitch = (Cswitch) f36581l.get(new Cextends(bArr));
        if (cswitch != null) {
            return cswitch;
        }
        if (!appmetrica(bArr)) {
            C8339l.metrica("invalid relative OID contents");
            return null;
        }
        if (z) {
            bArr = AbstractC14024l.crashlytics(bArr);
        }
        return new Cswitch(bArr);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static void m4588throws(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) (((int) j) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return C7972l.m2216for(this.f36583l.length, z);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return false;
    }

    public final synchronized String applovin() {
        try {
            if (this.f36582l == null) {
                byte[] bArr = this.f36583l;
                StringBuilder sb = new StringBuilder();
                boolean z = true;
                BigInteger bigIntegerShiftLeft = null;
                long j = 0;
                for (int i = 0; i != bArr.length; i++) {
                    byte b = bArr[i];
                    if (j <= 72057594037927808L) {
                        long j2 = j + ((long) (b & 127));
                        if ((b & 128) == 0) {
                            if (z) {
                                z = false;
                            } else {
                                sb.append('.');
                            }
                            sb.append(j2);
                            j = 0;
                        } else {
                            j = j2 << 7;
                        }
                    } else {
                        if (bigIntegerShiftLeft == null) {
                            bigIntegerShiftLeft = BigInteger.valueOf(j);
                        }
                        BigInteger bigIntegerOr = bigIntegerShiftLeft.or(BigInteger.valueOf(b & 127));
                        if ((b & 128) == 0) {
                            if (z) {
                                z = false;
                            } else {
                                sb.append('.');
                            }
                            sb.append(bigIntegerOr);
                            bigIntegerShiftLeft = null;
                            j = 0;
                        } else {
                            bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                        }
                    }
                }
                this.f36582l = sb.toString();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f36582l;
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        return AbstractC14024l.ads(this.f36583l);
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) {
        c7972l.m2240public(13, z, this.f36583l);
    }

    public final String toString() {
        return applovin();
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (this == ccase) {
            return true;
        }
        if (ccase instanceof Cswitch) {
            return Arrays.equals(this.f36583l, ((Cswitch) ccase).f36583l);
        }
        return false;
    }
}
