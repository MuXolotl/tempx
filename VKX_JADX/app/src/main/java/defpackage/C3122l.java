package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: lؕؒؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3122l extends AbstractC9542l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C3844l f6686l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C3844l f6687l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C3844l f6688l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C0869l f6689l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f6690l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f6691l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public long f6692l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C1503l f6693l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public String f6694l;

    static {
        Charset charset = AbstractC9050l.yandex;
        C3844l c3844l = new C3844l("'\\".getBytes(charset));
        c3844l.f7951l = "'\\";
        f6687l = c3844l;
        C3844l c3844l2 = new C3844l("\"\\".getBytes(charset));
        c3844l2.f7951l = "\"\\";
        f6686l = c3844l2;
        C3844l c3844l3 = new C3844l("{}[]:, \n\t\r\f/\\;#=".getBytes(charset));
        c3844l3.f7951l = "{}[]:, \n\t\r\f/\\;#=";
        f6688l = c3844l3;
        "\n\r".getBytes(charset);
        "*/".getBytes(charset);
    }

    public C3122l(C1503l c1503l) {
        this.f19446l = new int[32];
        this.f19445l = new String[32];
        this.f19448l = new int[32];
        this.f6690l = 0;
        this.f6693l = c1503l;
        this.f6689l = c1503l.f3755l;
        m2683private(6);
    }

    @Override // defpackage.AbstractC9542l
    public final boolean ads() throws C8413l, EOFException {
        int iM1276import = this.f6690l;
        if (iM1276import == 0) {
            iM1276import = m1276import();
        }
        return (iM1276import == 2 || iM1276import == 4 || iM1276import == 18) ? false : true;
    }

    @Override // defpackage.AbstractC9542l
    public final void billing() throws C8413l, EOFException {
        int iM1276import = this.f6690l;
        if (iM1276import == 0) {
            iM1276import = m1276import();
        }
        if (iM1276import != 1) {
            C11467l.adcel(AbstractC2812l.applovin(mo1287synchronized()), adcel(), "Expected BEGIN_OBJECT but was ");
        } else {
            m2683private(3);
            this.f6690l = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f6690l = 0;
        this.f19446l[0] = 8;
        this.f19447l = 1;
        this.f6689l.yandex();
        this.f6693l.close();
    }

    @Override // defpackage.AbstractC9542l
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final void mo1275continue() throws C8413l, EOFException {
        int i = 0;
        do {
            int iM1276import = this.f6690l;
            if (iM1276import == 0) {
                iM1276import = m1276import();
            }
            if (iM1276import == 3) {
                m2683private(1);
            } else {
                if (iM1276import == 1) {
                    m2683private(3);
                } else if (iM1276import == 4) {
                    i--;
                    if (i < 0) {
                        C11467l.adcel(AbstractC2812l.applovin(mo1287synchronized()), adcel(), "Expected a value but was ");
                        return;
                    }
                    this.f19447l--;
                } else if (iM1276import == 2) {
                    i--;
                    if (i < 0) {
                        C11467l.adcel(AbstractC2812l.applovin(mo1287synchronized()), adcel(), "Expected a value but was ");
                        return;
                    }
                    this.f19447l--;
                } else {
                    C0869l c0869l = this.f6689l;
                    if (iM1276import == 14 || iM1276import == 10) {
                        long jAdvert = this.f6693l.advert(f6688l);
                        if (jAdvert == -1) {
                            jAdvert = c0869l.f2526l;
                        }
                        c0869l.skip(jAdvert);
                    } else if (iM1276import == 9 || iM1276import == 13) {
                        m1281l(f6686l);
                    } else if (iM1276import == 8 || iM1276import == 12) {
                        m1281l(f6687l);
                    } else if (iM1276import == 17) {
                        c0869l.skip(this.f6691l);
                    } else if (iM1276import == 18) {
                        C11467l.adcel(AbstractC2812l.applovin(mo1287synchronized()), adcel(), "Expected a value but was ");
                        return;
                    }
                }
                this.f6690l = 0;
            }
            i++;
            this.f6690l = 0;
        } while (i != 0);
        int[] iArr = this.f19448l;
        int i2 = this.f19447l - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f19445l[i2] = "null";
    }

    /* JADX WARN: Code duplicated, block: B:148:0x01c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:164:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:167:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:172:0x01fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:175:0x0207  */
    /* JADX WARN: Code duplicated, block: B:177:0x020d  */
    /* JADX WARN: Code duplicated, block: B:230:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0120  */
    /* JADX WARN: Code duplicated, block: B:92:0x0132  */
    /* JADX WARN: Code duplicated, block: B:94:0x013b  */
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final int m1276import() throws C8413l, EOFException {
        int i;
        String str;
        String str2;
        long j;
        char cAds;
        int i2;
        int i3;
        int i4;
        int i5;
        byte bAds;
        int i6;
        int[] iArr = this.f19446l;
        int i7 = this.f19447l - 1;
        int i8 = iArr[i7];
        int i9 = 0;
        C0869l c0869l = this.f6689l;
        if (i8 == 1) {
            iArr[i7] = 2;
        } else if (i8 == 2) {
            int iM1279l = m1279l(true);
            c0869l.readByte();
            if (iM1279l != 44) {
                if (iM1279l == 59) {
                    m1285super();
                    throw null;
                }
                if (iM1279l == 93) {
                    this.f6690l = 4;
                    return 4;
                }
                m2682default("Unterminated array");
                throw null;
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7] = 4;
                if (i8 == 5) {
                    int iM1279l2 = m1279l(true);
                    c0869l.readByte();
                    if (iM1279l2 != 44) {
                        if (iM1279l2 == 59) {
                            m1285super();
                            throw null;
                        }
                        if (iM1279l2 == 125) {
                            this.f6690l = 2;
                            return 2;
                        }
                        m2682default("Unterminated object");
                        throw null;
                    }
                }
                int iM1279l3 = m1279l(true);
                if (iM1279l3 == 34) {
                    c0869l.readByte();
                    this.f6690l = 13;
                    return 13;
                }
                if (iM1279l3 == 39) {
                    c0869l.readByte();
                    m1285super();
                    throw null;
                }
                if (iM1279l3 != 125) {
                    m1285super();
                    throw null;
                }
                if (i8 == 5) {
                    m2682default("Expected name");
                    throw null;
                }
                c0869l.readByte();
                this.f6690l = 2;
                return 2;
            }
            if (i8 == 4) {
                iArr[i7] = 5;
                int iM1279l4 = m1279l(true);
                c0869l.readByte();
                if (iM1279l4 != 58) {
                    if (iM1279l4 != 61) {
                        m2682default("Expected ':'");
                        throw null;
                    }
                    m1285super();
                    throw null;
                }
            } else if (i8 == 6) {
                iArr[i7] = 7;
            } else {
                if (i8 == 7) {
                    if (m1279l(false) == -1) {
                        this.f6690l = 18;
                        return 18;
                    }
                    m1285super();
                    throw null;
                }
                if (i8 == 8) {
                    C8339l.smaato("JsonReader is closed");
                    return 0;
                }
            }
        }
        int iM1279l5 = m1279l(true);
        if (iM1279l5 == 34) {
            c0869l.readByte();
            this.f6690l = 9;
            return 9;
        }
        if (iM1279l5 == 39) {
            m1285super();
            throw null;
        }
        if (iM1279l5 != 44 && iM1279l5 != 59) {
            if (iM1279l5 == 91) {
                c0869l.readByte();
                this.f6690l = 3;
                return 3;
            }
            if (iM1279l5 != 93) {
                if (iM1279l5 == 123) {
                    c0869l.readByte();
                    this.f6690l = 1;
                    return 1;
                }
                byte bAds2 = c0869l.ads(0L);
                C1503l c1503l = this.f6693l;
                if (bAds2 == 116 || bAds2 == 84) {
                    i = 5;
                    str2 = "true";
                    str = "TRUE";
                } else {
                    if (bAds2 != 102 && bAds2 != 70) {
                        if (bAds2 == 110 || bAds2 == 78) {
                            i = 7;
                            str2 = "null";
                            str = "NULL";
                        } else {
                            j = 0;
                            i = 0;
                            i9 = 0;
                        }
                        if (i != 0) {
                            return i;
                        }
                        int i10 = 1;
                        i2 = i9;
                        i3 = i2;
                        int i11 = i3;
                        long j2 = j;
                        while (true) {
                            i4 = i3 + 1;
                            if (c1503l.request(i4)) {
                                bAds = c0869l.ads(i3);
                                if (bAds != 43) {
                                    if (bAds != 69 || bAds == 101) {
                                        i6 = 6;
                                        if (i2 != 2 || i2 == 4) {
                                            i2 = 5;
                                            i3 = i4;
                                        } else {
                                            i5 = i9;
                                        }
                                    } else if (bAds == 45) {
                                        i6 = 6;
                                        if (i2 == 0) {
                                            i2 = 1;
                                            i11 = 1;
                                        } else {
                                            if (i2 != 5) {
                                                i5 = i9;
                                            }
                                            i2 = i6;
                                        }
                                        i3 = i4;
                                    } else if (bAds != 46) {
                                        if (bAds >= 48 && bAds <= 57) {
                                            if (i2 == 1 || i2 == 0) {
                                                i6 = 6;
                                                j2 = -(bAds - 48);
                                                i2 = 2;
                                            } else {
                                                if (i2 == 2) {
                                                    if (j2 != j) {
                                                        long j3 = (10 * j2) - ((long) (bAds - 48));
                                                        i10 &= (j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2)) ? 1 : i9;
                                                        j2 = j3;
                                                    }
                                                } else if (i2 == 3) {
                                                    i2 = 4;
                                                } else {
                                                    i6 = 6;
                                                    if (i2 == 5 || i2 == 6) {
                                                        i2 = 7;
                                                    }
                                                }
                                                i6 = 6;
                                                i3 = i4;
                                            }
                                            i3 = i4;
                                        } else if (!m1289while(bAds)) {
                                        }
                                        i5 = i9;
                                    } else {
                                        i6 = 6;
                                        if (i2 == 2) {
                                            i2 = 3;
                                            i3 = i4;
                                        } else {
                                            i5 = i9;
                                        }
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (m1289while(c0869l.ads(j))) {
                                        m1285super();
                                        throw null;
                                    }
                                    m2682default("Expected value");
                                    throw null;
                                }
                                i6 = 6;
                                if (i2 != 5) {
                                    i5 = i9;
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (m1289while(c0869l.ads(j))) {
                                        m2682default("Expected value");
                                        throw null;
                                    }
                                    m1285super();
                                    throw null;
                                }
                                i2 = i6;
                                i3 = i4;
                            }
                            if (i2 != 2 && i10 != 0 && ((j2 != Long.MIN_VALUE || i11 != 0) && (j2 != j || i11 == 0))) {
                                if (i11 == 0) {
                                    j2 = -j2;
                                }
                                this.f6692l = j2;
                                c0869l.skip(i3);
                                i5 = 16;
                                this.f6690l = 16;
                            } else if (i2 != 2 || i2 == 4 || i2 == 7) {
                                this.f6691l = i3;
                                i5 = 17;
                                this.f6690l = 17;
                            } else {
                                i5 = i9;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (m1289while(c0869l.ads(j))) {
                                m2682default("Expected value");
                                throw null;
                            }
                            m1285super();
                            throw null;
                        }
                    }
                    i = 6;
                    str2 = "false";
                    str = "FALSE";
                }
                int length = str2.length();
                j = 0;
                int i12 = 1;
                while (true) {
                    if (i12 >= length) {
                        if (!c1503l.request(length + 1) || !m1289while(c0869l.ads(length))) {
                            c0869l.skip(length);
                            this.f6690l = i;
                            break;
                        }
                    } else {
                        int i13 = i12 + 1;
                        if (c1503l.request(i13) && ((cAds = c0869l.ads(i12)) == str2.charAt(i12) || cAds == str.charAt(i12))) {
                            i12 = i13;
                        }
                    }
                    i = i9;
                    break;
                }
                if (i != 0) {
                    return i;
                }
                int i14 = 1;
                i2 = i9;
                i3 = i2;
                int i15 = i3;
                long j4 = j;
                while (true) {
                    i4 = i3 + 1;
                    if (c1503l.request(i4)) {
                        bAds = c0869l.ads(i3);
                        if (bAds != 43) {
                            if (bAds != 69) {
                                i6 = 6;
                                if (i2 != 2) {
                                }
                                i2 = 5;
                                i3 = i4;
                            } else {
                                i6 = 6;
                                if (i2 != 2) {
                                }
                                i2 = 5;
                                i3 = i4;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (m1289while(c0869l.ads(j))) {
                                m2682default("Expected value");
                                throw null;
                            }
                            m1285super();
                            throw null;
                        }
                        i6 = 6;
                        if (i2 != 5) {
                            i5 = i9;
                            if (i5 != 0) {
                                return i5;
                            }
                            if (m1289while(c0869l.ads(j))) {
                                m2682default("Expected value");
                                throw null;
                            }
                            m1285super();
                            throw null;
                        }
                        i2 = i6;
                        i3 = i4;
                    }
                    if (i2 != 2) {
                        if (i2 != 2) {
                        }
                        this.f6691l = i3;
                        i5 = 17;
                        this.f6690l = 17;
                    } else {
                        if (i2 != 2) {
                        }
                        this.f6691l = i3;
                        i5 = 17;
                        this.f6690l = 17;
                    }
                    if (i5 != 0) {
                        return i5;
                    }
                    if (m1289while(c0869l.ads(j))) {
                        m2682default("Expected value");
                        throw null;
                    }
                    m1285super();
                    throw null;
                }
            }
            if (i8 == 1) {
                c0869l.readByte();
                this.f6690l = 4;
                return 4;
            }
        }
        if (i8 == 1 || i8 == 2) {
            m1285super();
            throw null;
        }
        m2682default("Unexpected value");
        throw null;
    }

    @Override // defpackage.AbstractC9542l
    public final int inmobi() throws C8413l, EOFException {
        int iM1276import = this.f6690l;
        if (iM1276import == 0) {
            iM1276import = m1276import();
        }
        if (iM1276import == 16) {
            long j = this.f6692l;
            int i = (int) j;
            if (j == i) {
                this.f6690l = 0;
                int[] iArr = this.f19448l;
                int i2 = this.f19447l - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new C6451l("Expected an int but was " + this.f6692l + " at path " + adcel(), 9, (byte) 0);
        }
        if (iM1276import == 17) {
            long j2 = this.f6691l;
            C0869l c0869l = this.f6689l;
            c0869l.getClass();
            this.f6694l = c0869l.mo712l(j2, AbstractC9050l.yandex);
        } else if (iM1276import == 9 || iM1276import == 8) {
            String strM1283l = iM1276import == 9 ? m1283l(f6686l) : m1283l(f6687l);
            this.f6694l = strM1283l;
            try {
                int i3 = Integer.parseInt(strM1283l);
                this.f6690l = 0;
                int[] iArr2 = this.f19448l;
                int i4 = this.f19447l - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iM1276import != 11) {
            C11467l.adcel(AbstractC2812l.applovin(mo1287synchronized()), adcel(), "Expected an int but was ");
            return 0;
        }
        this.f6690l = 11;
        try {
            double d = Double.parseDouble(this.f6694l);
            int i5 = (int) d;
            if (i5 != d) {
                C11467l.adcel(this.f6694l, adcel(), "Expected an int but was ");
                return 0;
            }
            this.f6694l = null;
            this.f6690l = 0;
            int[] iArr3 = this.f19448l;
            int i6 = this.f19447l - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            C11467l.adcel(this.f6694l, adcel(), "Expected an int but was ");
            return 0;
        }
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final int m1277instanceof(String str, C3797l c3797l) {
        int length = ((String[]) c3797l.f7903l).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) c3797l.f7903l)[i])) {
                this.f6690l = 0;
                this.f19445l[this.f19447l - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC9542l
    public final boolean isVip() throws C8413l, EOFException {
        int iM1276import = this.f6690l;
        if (iM1276import == 0) {
            iM1276import = m1276import();
        }
        if (iM1276import == 5) {
            this.f6690l = 0;
            int[] iArr = this.f19448l;
            int i = this.f19447l - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM1276import != 6) {
            C11467l.adcel(AbstractC2812l.applovin(mo1287synchronized()), adcel(), "Expected a boolean but was ");
            return false;
        }
        this.f6690l = 0;
        int[] iArr2 = this.f19448l;
        int i2 = this.f19447l - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    /* JADX INFO: renamed from: lؚۣؒ, reason: contains not printable characters */
    public final String m1278l() {
        long jAdvert = this.f6693l.advert(f6688l);
        C0869l c0869l = this.f6689l;
        if (jAdvert == -1) {
            return c0869l.m703continue();
        }
        c0869l.getClass();
        return c0869l.mo712l(jAdvert, AbstractC9050l.yandex);
    }

    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    public final int m1279l(boolean z) throws C8413l, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            C1503l c1503l = this.f6693l;
            if (!c1503l.request(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            C0869l c0869l = this.f6689l;
            byte bAds = c0869l.ads(j);
            if (bAds != 10 && bAds != 32 && bAds != 13 && bAds != 9) {
                c0869l.skip(j);
                if (bAds == 47) {
                    if (c1503l.request(2L)) {
                        m1285super();
                        throw null;
                    }
                } else if (bAds == 35) {
                    m1285super();
                    throw null;
                }
                return bAds;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public final String m1280l() throws C8413l, EOFException {
        String strM1283l;
        int iM1276import = this.f6690l;
        if (iM1276import == 0) {
            iM1276import = m1276import();
        }
        if (iM1276import == 14) {
            strM1283l = m1278l();
        } else if (iM1276import == 13) {
            strM1283l = m1283l(f6686l);
        } else if (iM1276import == 12) {
            strM1283l = m1283l(f6687l);
        } else {
            if (iM1276import != 15) {
                C11467l.adcel(AbstractC2812l.applovin(mo1287synchronized()), adcel(), "Expected a name but was ");
                return null;
            }
            strM1283l = this.f6694l;
        }
        this.f6690l = 0;
        this.f19445l[this.f19447l - 1] = strM1283l;
        return strM1283l;
    }

    /* JADX INFO: renamed from: lؚْٟ, reason: contains not printable characters */
    public final void m1281l(C3844l c3844l) throws C8413l, EOFException {
        while (true) {
            long jAdvert = this.f6693l.advert(c3844l);
            if (jAdvert == -1) {
                m2682default("Unterminated string");
                throw null;
            }
            C0869l c0869l = this.f6689l;
            if (c0869l.ads(jAdvert) != 92) {
                c0869l.skip(jAdvert + 1);
                return;
            } else {
                c0869l.skip(jAdvert + 1);
                m1282l();
            }
        }
    }

    /* JADX INFO: renamed from: lٕؓٗ, reason: contains not printable characters */
    public final char m1282l() throws C8413l, EOFException {
        int i;
        C1503l c1503l = this.f6693l;
        if (!c1503l.request(1L)) {
            m2682default("Unterminated escape sequence");
            throw null;
        }
        C0869l c0869l = this.f6689l;
        byte b = c0869l.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            m2682default("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!c1503l.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(adcel()));
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bAds = c0869l.ads(i2);
            char c2 = (char) (c << 4);
            if (bAds >= 48 && bAds <= 57) {
                i = bAds - 48;
            } else if (bAds >= 97 && bAds <= 102) {
                i = bAds - 87;
            } else {
                if (bAds < 65 || bAds > 70) {
                    m2682default("\\u".concat(c0869l.mo712l(4L, AbstractC9050l.yandex)));
                    throw null;
                }
                i = bAds - 55;
            }
            c = (char) (i + c2);
        }
        c0869l.skip(4L);
        return c;
    }

    /* JADX INFO: renamed from: lَٖؕ, reason: contains not printable characters */
    public final String m1283l(C3844l c3844l) throws C8413l {
        StringBuilder sb = null;
        while (true) {
            long jAdvert = this.f6693l.advert(c3844l);
            if (jAdvert == -1) {
                m2682default("Unterminated string");
                throw null;
            }
            C0869l c0869l = this.f6689l;
            if (c0869l.ads(jAdvert) != 92) {
                if (sb == null) {
                    String strMo712l = c0869l.mo712l(jAdvert, AbstractC9050l.yandex);
                    c0869l.readByte();
                    return strMo712l;
                }
                sb.append(c0869l.mo712l(jAdvert, AbstractC9050l.yandex));
                c0869l.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(c0869l.mo712l(jAdvert, AbstractC9050l.yandex));
            c0869l.readByte();
            sb.append(m1282l());
        }
    }

    @Override // defpackage.AbstractC9542l
    public final void mopub() throws C8413l, EOFException {
        int iM1276import = this.f6690l;
        if (iM1276import == 0) {
            iM1276import = m1276import();
        }
        if (iM1276import != 4) {
            C11467l.adcel(AbstractC2812l.applovin(mo1287synchronized()), adcel(), "Expected END_ARRAY but was ");
            return;
        }
        int i = this.f19447l;
        this.f19447l = i - 1;
        int[] iArr = this.f19448l;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f6690l = 0;
    }

    @Override // defpackage.AbstractC9542l
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final String mo1284package() throws C8413l, EOFException {
        String strMo712l;
        int iM1276import = this.f6690l;
        if (iM1276import == 0) {
            iM1276import = m1276import();
        }
        if (iM1276import == 10) {
            strMo712l = m1278l();
        } else if (iM1276import == 9) {
            strMo712l = m1283l(f6686l);
        } else if (iM1276import == 8) {
            strMo712l = m1283l(f6687l);
        } else if (iM1276import == 11) {
            strMo712l = this.f6694l;
            this.f6694l = null;
        } else if (iM1276import == 16) {
            strMo712l = Long.toString(this.f6692l);
        } else {
            if (iM1276import != 17) {
                C11467l.adcel(AbstractC2812l.applovin(mo1287synchronized()), adcel(), "Expected a string but was ");
                return null;
            }
            long j = this.f6691l;
            C0869l c0869l = this.f6689l;
            c0869l.getClass();
            strMo712l = c0869l.mo712l(j, AbstractC9050l.yandex);
        }
        this.f6690l = 0;
        int[] iArr = this.f19448l;
        int i = this.f19447l - 1;
        iArr[i] = iArr[i] + 1;
        return strMo712l;
    }

    @Override // defpackage.AbstractC9542l
    public final double signatures() throws C8413l, EOFException {
        int iM1276import = this.f6690l;
        if (iM1276import == 0) {
            iM1276import = m1276import();
        }
        if (iM1276import == 16) {
            this.f6690l = 0;
            int[] iArr = this.f19448l;
            int i = this.f19447l - 1;
            iArr[i] = iArr[i] + 1;
            return this.f6692l;
        }
        if (iM1276import == 17) {
            long j = this.f6691l;
            C0869l c0869l = this.f6689l;
            c0869l.getClass();
            this.f6694l = c0869l.mo712l(j, AbstractC9050l.yandex);
        } else if (iM1276import == 9) {
            this.f6694l = m1283l(f6686l);
        } else if (iM1276import == 8) {
            this.f6694l = m1283l(f6687l);
        } else if (iM1276import == 10) {
            this.f6694l = m1278l();
        } else if (iM1276import != 11) {
            C11467l.adcel(AbstractC2812l.applovin(mo1287synchronized()), adcel(), "Expected a double but was ");
            return 0.0d;
        }
        this.f6690l = 11;
        try {
            double d = Double.parseDouble(this.f6694l);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new C8413l("JSON forbids NaN and infinities: " + d + " at path " + adcel());
            }
            this.f6694l = null;
            this.f6690l = 0;
            int[] iArr2 = this.f19448l;
            int i2 = this.f19447l - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            C11467l.adcel(this.f6694l, adcel(), "Expected a double but was ");
            return 0.0d;
        }
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final void m1285super() throws C8413l {
        m2682default("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // defpackage.AbstractC9542l
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final void mo1286switch() throws C8413l, EOFException {
        int iM1276import = this.f6690l;
        if (iM1276import == 0) {
            iM1276import = m1276import();
        }
        if (iM1276import == 14) {
            long jAdvert = this.f6693l.advert(f6688l);
            C0869l c0869l = this.f6689l;
            if (jAdvert == -1) {
                jAdvert = c0869l.f2526l;
            }
            c0869l.skip(jAdvert);
        } else if (iM1276import == 13) {
            m1281l(f6686l);
        } else if (iM1276import == 12) {
            m1281l(f6687l);
        } else if (iM1276import != 15) {
            C11467l.adcel(AbstractC2812l.applovin(mo1287synchronized()), adcel(), "Expected a name but was ");
            return;
        }
        this.f6690l = 0;
        this.f19445l[this.f19447l - 1] = "null";
    }

    @Override // defpackage.AbstractC9542l
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final int mo1287synchronized() throws C8413l, EOFException {
        int iM1276import = this.f6690l;
        if (iM1276import == 0) {
            iM1276import = m1276import();
        }
        switch (iM1276import) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return 7;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return 10;
            default:
                C11586l.yandex();
                return 0;
        }
    }

    @Override // defpackage.AbstractC9542l
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final int mo1288throw(C3797l c3797l) throws C8413l, EOFException {
        int iM1276import = this.f6690l;
        if (iM1276import == 0) {
            iM1276import = m1276import();
        }
        if (iM1276import < 12 || iM1276import > 15) {
            return -1;
        }
        if (iM1276import == 15) {
            return m1277instanceof(this.f6694l, c3797l);
        }
        int iMo705else = this.f6693l.mo705else((C5884l) c3797l.f7902l);
        if (iMo705else != -1) {
            this.f6690l = 0;
            this.f19445l[this.f19447l - 1] = ((String[]) c3797l.f7903l)[iMo705else];
            return iMo705else;
        }
        String str = this.f19445l[this.f19447l - 1];
        String strM1280l = m1280l();
        int iM1277instanceof = m1277instanceof(strM1280l, c3797l);
        if (iM1277instanceof == -1) {
            this.f6690l = 15;
            this.f6694l = strM1280l;
            this.f19445l[this.f19447l - 1] = str;
        }
        return iM1277instanceof;
    }

    public final String toString() {
        return "JsonReader(" + this.f6693l + ")";
    }

    @Override // defpackage.AbstractC9542l
    public final void vip() throws C8413l, EOFException {
        int iM1276import = this.f6690l;
        if (iM1276import == 0) {
            iM1276import = m1276import();
        }
        if (iM1276import != 2) {
            C11467l.adcel(AbstractC2812l.applovin(mo1287synchronized()), adcel(), "Expected END_OBJECT but was ");
            return;
        }
        int i = this.f19447l;
        int i2 = i - 1;
        this.f19447l = i2;
        this.f19445l[i2] = null;
        int[] iArr = this.f19448l;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f6690l = 0;
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public final boolean m1289while(int i) throws C8413l {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m1285super();
        throw null;
    }

    @Override // defpackage.AbstractC9542l
    public final void yandex() throws C8413l, EOFException {
        int iM1276import = this.f6690l;
        if (iM1276import == 0) {
            iM1276import = m1276import();
        }
        if (iM1276import != 3) {
            C11467l.adcel(AbstractC2812l.applovin(mo1287synchronized()), adcel(), "Expected BEGIN_ARRAY but was ");
            return;
        }
        m2683private(1);
        this.f19448l[this.f19447l - 1] = 0;
        this.f6690l = 0;
    }
}
