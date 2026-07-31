package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: renamed from: for, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class Cfor extends Ccase {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final ad f829l = new ad(13, Cfor.class);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final ConcurrentHashMap f830l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f831l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f832l;

    public Cfor(String str) {
        if (str == null) {
            C6541l.subs("'identifier' cannot be null");
            throw null;
        }
        if (str.length() > 16385) {
            C8339l.metrica("exceeded OID contents length limit");
            throw null;
        }
        if (!m191synchronized(str)) {
            C8339l.metrica(AbstractC15560l.Signature("string ", str, " not a valid OID"));
            throw null;
        }
        byte[] bArrM189native = m189native(str);
        applovin(bArrM189native.length);
        this.f832l = bArrM189native;
        this.f831l = str;
    }

    public static void applovin(int i) {
        if (i <= 4096) {
            return;
        }
        C8339l.metrica("exceeded OID contents length limit");
    }

    public static Cfor appmetrica(boolean z, byte[] bArr) {
        applovin(bArr.length);
        Cfor cfor = (Cfor) f830l.get(new Cextends(bArr));
        if (cfor != null) {
            return cfor;
        }
        if (!Cswitch.appmetrica(bArr)) {
            C8339l.metrica("invalid OID contents");
            return null;
        }
        if (z) {
            bArr = AbstractC14024l.crashlytics(bArr);
        }
        return new Cfor(null, bArr);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static void m188extends(ByteArrayOutputStream byteArrayOutputStream, String str, int i, int i2, int i3) {
        String strSubstring = str.substring(i, i2);
        if (strSubstring.length() <= 18) {
            Cswitch.m4588throws(byteArrayOutputStream, Long.parseLong(strSubstring) + ((long) i3));
        } else {
            Cswitch.m4587package(byteArrayOutputStream, new BigInteger(strSubstring).add(BigInteger.valueOf(i3)));
        }
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static byte[] m189native(String str) {
        int i = 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        int iCharAt = (str.charAt(0) - '0') * 40;
        int i2 = 2;
        while (true) {
            int i3 = i + 1;
            if (i3 >= str.length()) {
                m188extends(byteArrayOutputStream, str, i2, i3, iCharAt);
                return byteArrayOutputStream.toByteArray();
            }
            if (str.charAt(i3) == '.') {
                m188extends(byteArrayOutputStream, str, i2, i3, iCharAt);
                i2 = i + 2;
                iCharAt = 0;
                i = i2;
            } else {
                i = i3;
            }
        }
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static Cfor m190private(String str) {
        if (str == null) {
            C6541l.subs("'identifier' cannot be null");
            return null;
        }
        if (str.length() > 16385 || !m191synchronized(str)) {
            return null;
        }
        byte[] bArrM189native = m189native(str);
        if (bArrM189native.length <= 4096) {
            return new Cfor(str, bArrM189native);
        }
        return null;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static boolean m191synchronized(String str) {
        char cCharAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (cCharAt = str.charAt(0)) < '0' || cCharAt > '2' || !Cswitch.inmobi(2, str)) {
            return false;
        }
        if (cCharAt == '2' || str.length() == 3 || str.charAt(3) == '.') {
            return true;
        }
        return (str.length() == 4 || str.charAt(4) == '.') && str.charAt(2) < '4';
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static Cfor m192throws(Object obj) {
        String strAdcel;
        if (obj == null || (obj instanceof Cfor)) {
            return (Cfor) obj;
        }
        if (!(obj instanceof applovin)) {
            if (obj instanceof byte[]) {
                try {
                    return (Cfor) f829l.m215l((byte[]) obj);
                } catch (IOException e) {
                    strAdcel = AbstractC5020l.adcel(e, new StringBuilder("failed to construct object identifier from byte[]: "));
                }
            }
            C8339l.metrica(strAdcel);
            return null;
        }
        Ccase ccaseBilling = ((applovin) obj).billing();
        if (ccaseBilling instanceof Cfor) {
            return (Cfor) ccaseBilling;
        }
        strAdcel = "illegal object in getInstance: ".concat(obj.getClass().getName());
        C8339l.metrica(strAdcel);
        return null;
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static String m193volatile(byte[] bArr) {
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
                        if (j2 < 40) {
                            sb.append('0');
                        } else if (j2 < 80) {
                            sb.append('1');
                            j2 -= 40;
                        } else {
                            sb.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    sb.append('.');
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
                        sb.append('2');
                        bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                        z = false;
                    }
                    sb.append('.');
                    sb.append(bigIntegerOr);
                    bigIntegerShiftLeft = null;
                    j = 0;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
        }
        return sb.toString();
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return C7972l.m2216for(this.f832l.length, z);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return false;
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        return AbstractC14024l.ads(this.f832l);
    }

    public final synchronized String inmobi() {
        try {
            if (this.f831l == null) {
                this.f831l = m193volatile(this.f832l);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f831l;
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) {
        c7972l.m2240public(6, z, this.f832l);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final Cfor m194package() {
        Cextends cextends = new Cextends(this.f832l);
        ConcurrentHashMap concurrentHashMap = f830l;
        Cfor cfor = (Cfor) concurrentHashMap.get(cextends);
        if (cfor != null) {
            return cfor;
        }
        synchronized (concurrentHashMap) {
            try {
                if (concurrentHashMap.containsKey(cextends)) {
                    this = (Cfor) concurrentHashMap.get(cextends);
                } else {
                    concurrentHashMap.put(cextends, this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public final Cfor premium(String str) {
        String strSignature;
        int i;
        byte[] bArrMopub;
        ad adVar = Cswitch.f36580l;
        if (str.length() <= 16383) {
            int i2 = 0;
            if (Cswitch.inmobi(0, str)) {
                int length = str.length();
                byte[] bArr = this.f832l;
                if (length <= 2) {
                    applovin(bArr.length + 1);
                    int iCharAt = str.charAt(0) - '0';
                    if (str.length() == 2) {
                        iCharAt = (iCharAt * 10) + (str.charAt(1) - '0');
                    }
                    bArrMopub = AbstractC14024l.yandex((byte) iCharAt, bArr);
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() + 1) / 2);
                    int i3 = 0;
                    while (true) {
                        i = i2 + 1;
                        if (i >= str.length()) {
                            break;
                        }
                        if (str.charAt(i) == '.') {
                            String strSubstring = str.substring(i3, i);
                            if (strSubstring.length() <= 18) {
                                Cswitch.m4588throws(byteArrayOutputStream, Long.parseLong(strSubstring));
                            } else {
                                Cswitch.m4587package(byteArrayOutputStream, new BigInteger(strSubstring));
                            }
                            i3 = i2 + 2;
                            i2 = i3;
                        } else {
                            i2 = i;
                        }
                    }
                    String strSubstring2 = str.substring(i3, i);
                    if (strSubstring2.length() <= 18) {
                        Cswitch.m4588throws(byteArrayOutputStream, Long.parseLong(strSubstring2));
                    } else {
                        Cswitch.m4587package(byteArrayOutputStream, new BigInteger(strSubstring2));
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    applovin(bArr.length + byteArray.length);
                    bArrMopub = AbstractC14024l.mopub(bArr, byteArray);
                }
                return new Cfor(AbstractC9361l.pro(inmobi(), ".", str), bArrMopub);
            }
            strSignature = AbstractC15560l.Signature("string ", str, " not a valid relative OID");
        } else {
            strSignature = "exceeded relative OID contents length limit";
        }
        C8339l.metrica(strSignature);
        return null;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final boolean m195strictfp(Cfor cfor) {
        byte[] bArr = cfor.f832l;
        int length = bArr.length;
        byte[] bArr2 = this.f832l;
        if (bArr2.length > length) {
            for (int i = 0; i < length; i++) {
                if (bArr2[i] == bArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        return inmobi();
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (this == ccase) {
            return true;
        }
        if (ccase instanceof Cfor) {
            return Arrays.equals(this.f832l, ((Cfor) ccase).f832l);
        }
        return false;
    }

    public Cfor(String str, byte[] bArr) {
        this.f832l = bArr;
        this.f831l = str;
    }
}
