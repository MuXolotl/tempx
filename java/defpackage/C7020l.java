package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: lؚؕؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7020l implements InterfaceC1525l {
    public final int amazon;
    public final int crashlytics;
    public final byte[] loadAd;
    public final String yandex;

    public C7020l(String str, byte[] bArr, int i, int i2) {
        byte b;
        str.getClass();
        boolean z = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                AbstractC12442l.admob(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                AbstractC12442l.admob(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                AbstractC12442l.admob(z);
                break;
            case "auxiliary.tracks.map":
                AbstractC12442l.admob(i2 == 0);
                break;
        }
        this.yandex = str;
        this.loadAd = bArr;
        this.crashlytics = i;
        this.amazon = i2;
    }

    public final ArrayList amazon() {
        AbstractC12442l.ads("Metadata is not an auxiliary tracks map", this.yandex.equals("auxiliary.tracks.map"));
        byte[] bArr = this.loadAd;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ byte[] crashlytics() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7020l.class == obj.getClass()) {
            C7020l c7020l = (C7020l) obj;
            if (this.yandex.equals(c7020l.yandex) && Arrays.equals(this.loadAd, c7020l.loadAd) && this.crashlytics == c7020l.crashlytics && this.amazon == c7020l.amazon) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.loadAd) + AbstractC12589l.advert(527, 31, this.yandex)) * 31) + this.crashlytics) * 31) + this.amazon;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:57:0x011e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0129  */
    /* JADX WARN: Code duplicated, block: B:62:0x0132  */
    /* JADX WARN: Code duplicated, block: B:63:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0137  */
    /* JADX WARN: Code duplicated, block: B:65:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x013e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171 A[EDGE_INSN: B:73:0x0171->B:75:0x0177 BREAK  A[LOOP:0: B:33:0x00c6->B:74:0x0173]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0173 A[LOOP:0: B:33:0x00c6->B:74:0x0173, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x017d  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00c0, please report this as an issue */
    public final String toString() {
        String string;
        C15145l c15145l;
        C1597l c15145l2;
        C18455l c18455l;
        char[] cArr;
        int i;
        int length;
        int i2;
        boolean z;
        char[] cArr2;
        int i3;
        C18455l c18455l2;
        byte[] bArr;
        byte[] bArrCopyOf;
        int i4;
        int i5;
        byte b;
        byte b2;
        boolean z2;
        char c;
        char c2;
        char c3;
        char c4;
        int i6 = this.amazon;
        if (i6 != 0) {
            if (i6 == 1) {
                byte[] bArr2 = this.loadAd;
                String str = AbstractC15323l.yandex;
                string = new String(bArr2, StandardCharsets.UTF_8);
            } else if (i6 == 23) {
                byte[] bArr3 = this.loadAd;
                AbstractC12442l.amazon(bArr3.length, 4, "array too small: %s < %s", bArr3.length >= 4);
                string = String.valueOf(Float.intBitsToFloat(AbstractC9966l.mopub(bArr3[0], bArr3[1], bArr3[2], bArr3[3])));
            } else if (i6 == 67) {
                byte[] bArr4 = this.loadAd;
                AbstractC12442l.amazon(bArr4.length, 4, "array too small: %s < %s", bArr4.length >= 4);
                string = String.valueOf(AbstractC9966l.mopub(bArr4[0], bArr4[1], bArr4[2], bArr4[3]));
            } else if (i6 == 75) {
                string = String.valueOf(this.loadAd[0] & 255);
            } else if (i6 != 78) {
                byte[] bArr5 = this.loadAd;
                String str2 = AbstractC15323l.yandex;
                c15145l = C1597l.purchase;
                c15145l2 = c15145l.crashlytics;
                if (c15145l2 == null) {
                    c18455l = c15145l.yandex;
                    cArr = c18455l.loadAd;
                    for (char c5 : cArr) {
                        if (AbstractC11452l.crashlytics(c5)) {
                            length = cArr.length;
                            i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    z = false;
                                    break;
                                }
                                c4 = cArr[i2];
                                if (c4 < 'a' && c4 <= 'z') {
                                    z = true;
                                    break;
                                }
                                i2++;
                            }
                            AbstractC12442l.ads("Cannot call lowerCase() on a mixed-case alphabet", !z);
                            cArr2 = new char[cArr.length];
                            for (i3 = 0; i3 < cArr.length; i3++) {
                                c3 = cArr[i3];
                                if (AbstractC11452l.crashlytics(c3)) {
                                    c3 = (char) (c3 ^ ' ');
                                }
                                cArr2[i3] = c3;
                            }
                            c18455l2 = new C18455l(AbstractC0653l.ads(new StringBuilder(), c18455l.yandex, ".lowerCase()"), cArr2);
                            if (c18455l.admob) {
                                c18455l = c18455l2;
                                break;
                            }
                            bArr = c18455l2.mopub;
                            if (c18455l2.admob) {
                                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                                for (i4 = 65; i4 <= 90; i4++) {
                                    i5 = i4 | 32;
                                    b = bArr[i4];
                                    b2 = bArr[i5];
                                    if (b == -1) {
                                        bArrCopyOf[i4] = b2;
                                    } else {
                                        if (b2 == -1) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        c = (char) i4;
                                        c2 = (char) i5;
                                        if (z2) {
                                            C8339l.smaato(AbstractC11028l.smaato("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                                            return null;
                                        }
                                        bArrCopyOf[i5] = b;
                                    }
                                }
                                c18455l = new C18455l(AbstractC0653l.ads(new StringBuilder(), c18455l2.yandex, ".ignoreCase()"), c18455l2.loadAd, bArrCopyOf, true);
                                break;
                            }
                            c18455l = c18455l2;
                            break;
                        }
                    }
                    if (c18455l == c15145l.yandex) {
                        c15145l2 = c15145l;
                    } else {
                        c15145l2 = new C15145l(c18455l);
                    }
                    c15145l.crashlytics = c15145l2;
                }
                string = c15145l2.yandex(bArr5);
            } else {
                string = String.valueOf(new C13143l(this.loadAd).m3564package());
            }
        } else if (this.yandex.equals("auxiliary.tracks.map")) {
            ArrayList arrayListAmazon = amazon();
            StringBuilder sbAd = AbstractC5020l.ad("track types = ");
            new C1693l(String.valueOf(',')).yandex(sbAd, arrayListAmazon.iterator());
            string = sbAd.toString();
        } else {
            byte[] bArr6 = this.loadAd;
            String str3 = AbstractC15323l.yandex;
            c15145l = C1597l.purchase;
            c15145l2 = c15145l.crashlytics;
            if (c15145l2 == null) {
                c18455l = c15145l.yandex;
                cArr = c18455l.loadAd;
                while (i < r7) {
                    if (AbstractC11452l.crashlytics(c5)) {
                        length = cArr.length;
                        i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                z = false;
                                break;
                            }
                            c4 = cArr[i2];
                            if (c4 < 'a') {
                            }
                            i2++;
                        }
                        AbstractC12442l.ads("Cannot call lowerCase() on a mixed-case alphabet", !z);
                        cArr2 = new char[cArr.length];
                        while (i3 < cArr.length) {
                            c3 = cArr[i3];
                            if (AbstractC11452l.crashlytics(c3)) {
                                c3 = (char) (c3 ^ ' ');
                            }
                            cArr2[i3] = c3;
                        }
                        c18455l2 = new C18455l(AbstractC0653l.ads(new StringBuilder(), c18455l.yandex, ".lowerCase()"), cArr2);
                        if (c18455l.admob) {
                            c18455l = c18455l2;
                            break;
                        }
                        bArr = c18455l2.mopub;
                        if (c18455l2.admob) {
                            bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            while (i4 <= 90) {
                                i5 = i4 | 32;
                                b = bArr[i4];
                                b2 = bArr[i5];
                                if (b == -1) {
                                    bArrCopyOf[i4] = b2;
                                } else {
                                    if (b2 == -1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    c = (char) i4;
                                    c2 = (char) i5;
                                    if (z2) {
                                        C8339l.smaato(AbstractC11028l.smaato("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                                        return null;
                                    }
                                    bArrCopyOf[i5] = b;
                                }
                            }
                            c18455l = new C18455l(AbstractC0653l.ads(new StringBuilder(), c18455l2.yandex, ".ignoreCase()"), c18455l2.loadAd, bArrCopyOf, true);
                            break;
                        }
                        c18455l = c18455l2;
                        break;
                    }
                }
                if (c18455l == c15145l.yandex) {
                    c15145l2 = c15145l;
                } else {
                    c15145l2 = new C15145l(c18455l);
                }
                c15145l.crashlytics = c15145l2;
            }
            string = c15145l2.yandex(bArr6);
        }
        return AbstractC9361l.ad(new StringBuilder("mdta: key="), this.yandex, ", value=", string);
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ C5978l yandex() {
        return null;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ void loadAd(C3117l c3117l) {
    }
}
