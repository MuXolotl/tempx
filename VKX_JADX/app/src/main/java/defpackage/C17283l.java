package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٗٝۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17283l extends Ccase implements Cdefault {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final ad f33535l = new ad(21, C17283l.class);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f33536l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17283l(String str) {
        this(AbstractC9008l.billing(str.toCharArray()));
        String str2 = AbstractC9008l.yandex;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C17283l premium(applovin applovinVar) {
        String strAds;
        if (applovinVar == 0 || (applovinVar instanceof C17283l)) {
            return (C17283l) applovinVar;
        }
        Ccase ccaseBilling = applovinVar.billing();
        if (ccaseBilling instanceof C17283l) {
            return (C17283l) ccaseBilling;
        }
        if (applovinVar instanceof byte[]) {
            try {
                return (C17283l) f33535l.m215l((byte[]) applovinVar);
            } catch (Exception e) {
                strAds = AbstractC5020l.ads(e, new StringBuilder("encoding error in getInstance: "));
            }
        } else {
            strAds = "illegal object in getInstance: ".concat(applovinVar.getClass().getName());
        }
        C8339l.metrica(strAds);
        return null;
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return C7972l.m2216for(this.f33536l.length, z);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return false;
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        return AbstractC14024l.ads(this.f33536l);
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) {
        c7972l.m2240public(12, z, this.f33536l);
    }

    @Override // defpackage.Cdefault
    public final String mopub() {
        String str = AbstractC9008l.yandex;
        byte[] bArr = this.f33536l;
        int length = bArr.length;
        char[] cArr = new char[length];
        short[] sArr = AbstractC15159l.yandex;
        int i = 0;
        int i2 = 0;
        loop0: while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                short s = AbstractC15159l.yandex[b & 127];
                int i4 = s >>> 8;
                byte b2 = (byte) s;
                while (true) {
                    if (b2 >= 0) {
                        if (i3 < length) {
                            int i5 = i3 + 1;
                            byte b3 = bArr[i3];
                            i4 = (i4 << 6) | (b3 & 63);
                            b2 = AbstractC15159l.loadAd[b2 + ((b3 & 255) >>> 4)];
                            i3 = i5;
                        }
                    } else if (b2 != -2) {
                        if (i4 <= 65535) {
                            if (i2 < length) {
                                cArr[i2] = (char) i4;
                                i2++;
                                i = i3;
                            }
                        } else if (i2 < length - 1) {
                            int i6 = i2 + 1;
                            cArr[i2] = (char) ((i4 >>> 10) + 55232);
                            i2 += 2;
                            cArr[i6] = (char) ((i4 & 1023) | 56320);
                            i = i3;
                        }
                    }
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            cArr[i2] = (char) b;
            i = i3;
            i2++;
        }
        if (i2 >= 0) {
            return new String(cArr, 0, i2);
        }
        C8339l.metrica("Invalid UTF-8 input");
        return null;
    }

    public final String toString() {
        return mopub();
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (ccase instanceof C17283l) {
            return Arrays.equals(this.f33536l, ((C17283l) ccase).f33536l);
        }
        return false;
    }

    public C17283l(byte[] bArr) {
        this.f33536l = bArr;
    }
}
