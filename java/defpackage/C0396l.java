package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: lٖؑٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0396l implements Closeable {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C3844l f1500l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C3844l f1501l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C3844l f1502l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public String[] f1503l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f1504l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public long f1505l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int[] f1506l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f1507l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public String f1508l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC9473l f1509l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int[] f1510l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f1511l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C0869l f1512l;

    static {
        C3844l c3844l = new C3844l("'\\".getBytes(AbstractC9050l.yandex));
        c3844l.f7951l = "'\\";
        f1502l = c3844l;
        C3844l c3844l2 = new C3844l("\"\\".getBytes(AbstractC9050l.yandex));
        c3844l2.f7951l = "\"\\";
        f1501l = c3844l2;
        C3844l c3844l3 = new C3844l("{}[]:, \n\t\r\f/\\;#=".getBytes(AbstractC9050l.yandex));
        c3844l3.f7951l = "{}[]:, \n\t\r\f/\\;#=";
        f1500l = c3844l3;
        new C3844l("\n\r".getBytes(AbstractC9050l.yandex)).f7951l = "\n\r";
        new C3844l("*/".getBytes(AbstractC9050l.yandex)).f7951l = "*/";
    }

    public C0396l(C0396l c0396l) {
        this.f1507l = c0396l.f1507l;
        this.f1506l = (int[]) c0396l.f1506l.clone();
        this.f1503l = (String[]) c0396l.f1503l.clone();
        this.f1510l = (int[]) c0396l.f1510l.clone();
        this.f1504l = 0;
        C1503l c1503lPeek = c0396l.f1509l.peek();
        this.f1509l = c1503lPeek;
        this.f1512l = c1503lPeek.f3755l;
        this.f1504l = c0396l.f1504l;
        this.f1505l = c0396l.f1505l;
        this.f1511l = c0396l.f1511l;
        this.f1508l = c0396l.f1508l;
        try {
            c1503lPeek.subscription(c0396l.f1512l.f2526l);
        } catch (IOException unused) {
            C11586l.yandex();
            throw null;
        }
    }

    public final void adcel() throws C8413l, EOFException {
        int iVip = this.f1504l;
        if (iVip == 0) {
            iVip = vip();
        }
        if (iVip != 4) {
            C11467l.firebase(AbstractC2812l.premium(m510while()), inmobi(), "Expected END_ARRAY but was ");
            return;
        }
        int i = this.f1507l;
        this.f1507l = i - 1;
        int[] iArr = this.f1510l;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f1504l = 0;
    }

    public final void ads() throws C8413l, EOFException {
        int iVip = this.f1504l;
        if (iVip == 0) {
            iVip = vip();
        }
        if (iVip != 2) {
            C11467l.firebase(AbstractC2812l.premium(m510while()), inmobi(), "Expected END_OBJECT but was ");
            return;
        }
        int i = this.f1507l;
        int i2 = i - 1;
        this.f1507l = i2;
        this.f1503l[i2] = null;
        int[] iArr = this.f1510l;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f1504l = 0;
    }

    public final void billing() throws C8413l, EOFException {
        int iVip = this.f1504l;
        if (iVip == 0) {
            iVip = vip();
        }
        if (iVip != 1) {
            C11467l.firebase(AbstractC2812l.premium(m510while()), inmobi(), "Expected BEGIN_OBJECT but was ");
        } else {
            m498l(3);
            this.f1504l = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f1504l = 0;
        this.f1506l[0] = 8;
        this.f1507l = 1;
        this.f1512l.yandex();
        this.f1509l.close();
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final int m492continue(boolean z) throws C8413l, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            InterfaceC9473l interfaceC9473l = this.f1509l;
            if (!interfaceC9473l.request(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            C0869l c0869l = this.f1512l;
            byte bAds = c0869l.ads(j);
            if (bAds != 10 && bAds != 32 && bAds != 13 && bAds != 9) {
                c0869l.skip(j);
                if (bAds == 47) {
                    if (interfaceC9473l.request(2L)) {
                        mopub();
                        throw null;
                    }
                } else if (bAds == 35) {
                    mopub();
                    throw null;
                }
                return bAds;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final void m493default() throws C8413l, EOFException {
        int iVip = this.f1504l;
        if (iVip == 0) {
            iVip = vip();
        }
        if (iVip != 7) {
            C11467l.firebase(AbstractC2812l.premium(m510while()), inmobi(), "Expected null but was ");
            return;
        }
        this.f1504l = 0;
        int[] iArr = this.f1510l;
        int i = this.f1507l - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final String m494import() throws C8413l, EOFException {
        String strMo712l;
        int iVip = this.f1504l;
        if (iVip == 0) {
            iVip = vip();
        }
        if (iVip == 10) {
            strMo712l = m495instanceof();
        } else if (iVip == 9) {
            strMo712l = m506super(f1501l);
        } else if (iVip == 8) {
            strMo712l = m506super(f1502l);
        } else if (iVip == 11) {
            strMo712l = this.f1508l;
            this.f1508l = null;
        } else if (iVip == 16) {
            strMo712l = Long.toString(this.f1505l);
        } else {
            if (iVip != 17) {
                C11467l.firebase(AbstractC2812l.premium(m510while()), inmobi(), "Expected a string but was ");
                return null;
            }
            long j = this.f1511l;
            C0869l c0869l = this.f1512l;
            c0869l.getClass();
            strMo712l = c0869l.mo712l(j, AbstractC9050l.yandex);
        }
        this.f1504l = 0;
        int[] iArr = this.f1510l;
        int i = this.f1507l - 1;
        iArr[i] = iArr[i] + 1;
        return strMo712l;
    }

    public final String inmobi() {
        return AbstractC10409l.amazon(this.f1507l, this.f1506l, this.f1503l, this.f1510l);
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final String m495instanceof() {
        long jAdvert = this.f1509l.advert(f1500l);
        C0869l c0869l = this.f1512l;
        if (jAdvert == -1) {
            return c0869l.m703continue();
        }
        c0869l.getClass();
        return c0869l.mo712l(jAdvert, AbstractC9050l.yandex);
    }

    public final int isVip(String str, C0458l c0458l) {
        int length = ((String[]) c0458l.f1691l).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) c0458l.f1691l)[i])) {
                this.f1504l = 0;
                this.f1503l[this.f1507l - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: lؚۣؒ, reason: contains not printable characters */
    public final int m496l(C0458l c0458l) throws C8413l, EOFException {
        int iVip = this.f1504l;
        if (iVip == 0) {
            iVip = vip();
        }
        if (iVip < 8 || iVip > 11) {
            return -1;
        }
        if (iVip == 11) {
            return signatures(this.f1508l, c0458l);
        }
        int iMo705else = this.f1509l.mo705else((C5884l) c0458l.f1690l);
        if (iMo705else != -1) {
            this.f1504l = 0;
            int[] iArr = this.f1510l;
            int i = this.f1507l - 1;
            iArr[i] = iArr[i] + 1;
            return iMo705else;
        }
        String strM494import = m494import();
        int iSignatures = signatures(strM494import, c0458l);
        if (iSignatures == -1) {
            this.f1504l = 11;
            this.f1508l = strM494import;
            int[] iArr2 = this.f1510l;
            int i2 = this.f1507l - 1;
            iArr2[i2] = iArr2[i2] - 1;
        }
        return iSignatures;
    }

    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    public final char m497l() throws C8413l, EOFException {
        int i;
        InterfaceC9473l interfaceC9473l = this.f1509l;
        if (!interfaceC9473l.request(1L)) {
            m499l("Unterminated escape sequence");
            throw null;
        }
        C0869l c0869l = this.f1512l;
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
            m499l("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!interfaceC9473l.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(inmobi()));
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
                    m499l("\\u".concat(c0869l.mo712l(4L, AbstractC9050l.yandex)));
                    throw null;
                }
                i = bAds - 55;
            }
            c = (char) (i + c2);
        }
        c0869l.skip(4L);
        return c;
    }

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public final void m498l(int i) {
        int i2 = this.f1507l;
        int[] iArr = this.f1506l;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                C11467l.subscription("Nesting too deep at ".concat(inmobi()));
                return;
            }
            this.f1506l = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f1503l;
            this.f1503l = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f1510l;
            this.f1510l = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f1506l;
        int i3 = this.f1507l;
        this.f1507l = i3 + 1;
        iArr3[i3] = i;
    }

    /* JADX INFO: renamed from: lًٚٔ, reason: contains not printable characters */
    public final void m499l(String str) throws C8413l {
        StringBuilder sbAdvert = AbstractC5020l.advert(str, " at path ");
        sbAdvert.append(inmobi());
        throw new C8413l(sbAdvert.toString());
    }

    /* JADX INFO: renamed from: lؚْٟ, reason: contains not printable characters */
    public final void m500l(C3844l c3844l) throws C8413l, EOFException {
        while (true) {
            long jAdvert = this.f1509l.advert(c3844l);
            if (jAdvert == -1) {
                m499l("Unterminated string");
                throw null;
            }
            C0869l c0869l = this.f1512l;
            if (c0869l.ads(jAdvert) != 92) {
                c0869l.skip(jAdvert + 1);
                return;
            } else {
                c0869l.skip(jAdvert + 1);
                m497l();
            }
        }
    }

    /* JADX INFO: renamed from: lْۥٞ, reason: contains not printable characters */
    public final void m501l() throws C8413l, EOFException {
        int i = 0;
        do {
            int iVip = this.f1504l;
            if (iVip == 0) {
                iVip = vip();
            }
            if (iVip == 3) {
                m498l(1);
            } else {
                if (iVip == 1) {
                    m498l(3);
                } else if (iVip == 4) {
                    i--;
                    if (i < 0) {
                        C11467l.firebase(AbstractC2812l.premium(m510while()), inmobi(), "Expected a value but was ");
                        return;
                    }
                    this.f1507l--;
                } else if (iVip == 2) {
                    i--;
                    if (i < 0) {
                        C11467l.firebase(AbstractC2812l.premium(m510while()), inmobi(), "Expected a value but was ");
                        return;
                    }
                    this.f1507l--;
                } else {
                    C0869l c0869l = this.f1512l;
                    if (iVip == 14 || iVip == 10) {
                        long jAdvert = this.f1509l.advert(f1500l);
                        if (jAdvert == -1) {
                            jAdvert = c0869l.f2526l;
                        }
                        c0869l.skip(jAdvert);
                    } else if (iVip == 9 || iVip == 13) {
                        m500l(f1501l);
                    } else if (iVip == 8 || iVip == 12) {
                        m500l(f1502l);
                    } else if (iVip == 17) {
                        c0869l.skip(this.f1511l);
                    } else if (iVip == 18) {
                        C11467l.firebase(AbstractC2812l.premium(m510while()), inmobi(), "Expected a value but was ");
                        return;
                    }
                }
                this.f1504l = 0;
            }
            i++;
            this.f1504l = 0;
        } while (i != 0);
        int[] iArr = this.f1510l;
        int i2 = this.f1507l - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f1503l[i2] = "null";
    }

    /* JADX INFO: renamed from: lٕؓٗ, reason: contains not printable characters */
    public final void m502l() throws C8413l, EOFException {
        int iVip = this.f1504l;
        if (iVip == 0) {
            iVip = vip();
        }
        if (iVip == 14) {
            long jAdvert = this.f1509l.advert(f1500l);
            C0869l c0869l = this.f1512l;
            if (jAdvert == -1) {
                jAdvert = c0869l.f2526l;
            }
            c0869l.skip(jAdvert);
        } else if (iVip == 13) {
            m500l(f1501l);
        } else if (iVip == 12) {
            m500l(f1502l);
        } else if (iVip != 15) {
            C11467l.firebase(AbstractC2812l.premium(m510while()), inmobi(), "Expected a name but was ");
            return;
        }
        this.f1504l = 0;
        this.f1503l[this.f1507l - 1] = "null";
    }

    /* JADX INFO: renamed from: lَٖؕ, reason: contains not printable characters */
    public final int m503l(C0458l c0458l) throws C8413l, EOFException {
        int iVip = this.f1504l;
        if (iVip == 0) {
            iVip = vip();
        }
        if (iVip < 12 || iVip > 15) {
            return -1;
        }
        if (iVip == 15) {
            return isVip(this.f1508l, c0458l);
        }
        int iMo705else = this.f1509l.mo705else((C5884l) c0458l.f1690l);
        if (iMo705else != -1) {
            this.f1504l = 0;
            this.f1503l[this.f1507l - 1] = ((String[]) c0458l.f1691l)[iMo705else];
            return iMo705else;
        }
        String str = this.f1503l[this.f1507l - 1];
        String strM507switch = m507switch();
        int iIsVip = isVip(strM507switch, c0458l);
        if (iIsVip == -1) {
            this.f1504l = 15;
            this.f1508l = strM507switch;
            this.f1503l[this.f1507l - 1] = str;
        }
        return iIsVip;
    }

    public final void mopub() throws C8413l {
        m499l("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final boolean m504package() throws C8413l, EOFException {
        int iVip = this.f1504l;
        if (iVip == 0) {
            iVip = vip();
        }
        return (iVip == 2 || iVip == 4 || iVip == 18) ? false : true;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final double m505private() throws C8413l, EOFException {
        int iVip = this.f1504l;
        if (iVip == 0) {
            iVip = vip();
        }
        if (iVip == 16) {
            this.f1504l = 0;
            int[] iArr = this.f1510l;
            int i = this.f1507l - 1;
            iArr[i] = iArr[i] + 1;
            return this.f1505l;
        }
        if (iVip == 17) {
            long j = this.f1511l;
            C0869l c0869l = this.f1512l;
            c0869l.getClass();
            this.f1508l = c0869l.mo712l(j, AbstractC9050l.yandex);
        } else if (iVip == 9) {
            this.f1508l = m506super(f1501l);
        } else if (iVip == 8) {
            this.f1508l = m506super(f1502l);
        } else if (iVip == 10) {
            this.f1508l = m495instanceof();
        } else if (iVip != 11) {
            C11467l.firebase(AbstractC2812l.premium(m510while()), inmobi(), "Expected a double but was ");
            return 0.0d;
        }
        this.f1504l = 11;
        try {
            double d = Double.parseDouble(this.f1508l);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new C8413l("JSON forbids NaN and infinities: " + d + " at path " + inmobi());
            }
            this.f1508l = null;
            this.f1504l = 0;
            int[] iArr2 = this.f1510l;
            int i2 = this.f1507l - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            C11467l.firebase(this.f1508l, inmobi(), "Expected a double but was ");
            return 0.0d;
        }
    }

    public final int signatures(String str, C0458l c0458l) {
        int length = ((String[]) c0458l.f1691l).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) c0458l.f1691l)[i])) {
                this.f1504l = 0;
                int[] iArr = this.f1510l;
                int i2 = this.f1507l - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final String m506super(C3844l c3844l) throws C8413l {
        StringBuilder sb = null;
        while (true) {
            long jAdvert = this.f1509l.advert(c3844l);
            if (jAdvert == -1) {
                m499l("Unterminated string");
                throw null;
            }
            C0869l c0869l = this.f1512l;
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
            sb.append(m497l());
        }
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final String m507switch() throws C8413l, EOFException {
        String strM506super;
        int iVip = this.f1504l;
        if (iVip == 0) {
            iVip = vip();
        }
        if (iVip == 14) {
            strM506super = m495instanceof();
        } else if (iVip == 13) {
            strM506super = m506super(f1501l);
        } else if (iVip == 12) {
            strM506super = m506super(f1502l);
        } else {
            if (iVip != 15) {
                C11467l.firebase(AbstractC2812l.premium(m510while()), inmobi(), "Expected a name but was ");
                return null;
            }
            strM506super = this.f1508l;
            this.f1508l = null;
        }
        this.f1504l = 0;
        this.f1503l[this.f1507l - 1] = strM506super;
        return strM506super;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final boolean m508synchronized(int i) throws C8413l {
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
        mopub();
        throw null;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final int m509throw() throws C8413l, EOFException {
        int iVip = this.f1504l;
        if (iVip == 0) {
            iVip = vip();
        }
        int i = 8;
        byte b = 0;
        if (iVip == 16) {
            long j = this.f1505l;
            int i2 = (int) j;
            if (j == i2) {
                this.f1504l = 0;
                int[] iArr = this.f1510l;
                int i3 = this.f1507l - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new C6451l("Expected an int but was " + this.f1505l + " at path " + inmobi(), i, b);
        }
        if (iVip == 17) {
            long j2 = this.f1511l;
            C0869l c0869l = this.f1512l;
            c0869l.getClass();
            this.f1508l = c0869l.mo712l(j2, AbstractC9050l.yandex);
        } else if (iVip == 9 || iVip == 8) {
            String strM506super = iVip == 9 ? m506super(f1501l) : m506super(f1502l);
            this.f1508l = strM506super;
            try {
                int i4 = Integer.parseInt(strM506super);
                this.f1504l = 0;
                int[] iArr2 = this.f1510l;
                int i5 = this.f1507l - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        } else if (iVip != 11) {
            C11467l.firebase(AbstractC2812l.premium(m510while()), inmobi(), "Expected an int but was ");
            return 0;
        }
        this.f1504l = 11;
        try {
            double d = Double.parseDouble(this.f1508l);
            int i6 = (int) d;
            if (i6 != d) {
                C11467l.firebase(this.f1508l, inmobi(), "Expected an int but was ");
                return 0;
            }
            this.f1508l = null;
            this.f1504l = 0;
            int[] iArr3 = this.f1510l;
            int i7 = this.f1507l - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        } catch (NumberFormatException unused2) {
            C11467l.firebase(this.f1508l, inmobi(), "Expected an int but was ");
            return 0;
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f1509l + ")";
    }

    /* JADX WARN: Code duplicated, block: B:150:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:164:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:166:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:169:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:174:0x01fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:175:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:177:0x020b  */
    /* JADX WARN: Code duplicated, block: B:179:0x020f  */
    /* JADX WARN: Code duplicated, block: B:233:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0123 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:90:0x0124  */
    /* JADX WARN: Code duplicated, block: B:94:0x0136  */
    /* JADX WARN: Code duplicated, block: B:96:0x013f  */
    public final int vip() throws C8413l, EOFException {
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
        int[] iArr = this.f1506l;
        int i7 = this.f1507l - 1;
        int i8 = iArr[i7];
        int i9 = 0;
        C0869l c0869l = this.f1512l;
        if (i8 == 1) {
            iArr[i7] = 2;
        } else if (i8 == 2) {
            int iM492continue = m492continue(true);
            c0869l.readByte();
            if (iM492continue != 44) {
                if (iM492continue == 59) {
                    mopub();
                    throw null;
                }
                if (iM492continue == 93) {
                    this.f1504l = 4;
                    return 4;
                }
                m499l("Unterminated array");
                throw null;
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7] = 4;
                if (i8 == 5) {
                    int iM492continue2 = m492continue(true);
                    c0869l.readByte();
                    if (iM492continue2 != 44) {
                        if (iM492continue2 == 59) {
                            mopub();
                            throw null;
                        }
                        if (iM492continue2 == 125) {
                            this.f1504l = 2;
                            return 2;
                        }
                        m499l("Unterminated object");
                        throw null;
                    }
                }
                int iM492continue3 = m492continue(true);
                if (iM492continue3 == 34) {
                    c0869l.readByte();
                    this.f1504l = 13;
                    return 13;
                }
                if (iM492continue3 == 39) {
                    c0869l.readByte();
                    mopub();
                    throw null;
                }
                if (iM492continue3 != 125) {
                    mopub();
                    throw null;
                }
                if (i8 == 5) {
                    m499l("Expected name");
                    throw null;
                }
                c0869l.readByte();
                this.f1504l = 2;
                return 2;
            }
            if (i8 == 4) {
                iArr[i7] = 5;
                int iM492continue4 = m492continue(true);
                c0869l.readByte();
                if (iM492continue4 != 58) {
                    if (iM492continue4 == 61) {
                        mopub();
                        throw null;
                    }
                    m499l("Expected ':'");
                    throw null;
                }
            } else if (i8 == 6) {
                iArr[i7] = 7;
            } else {
                if (i8 == 7) {
                    if (m492continue(false) == -1) {
                        this.f1504l = 18;
                        return 18;
                    }
                    mopub();
                    throw null;
                }
                if (i8 == 9) {
                    throw null;
                }
                if (i8 == 8) {
                    C8339l.smaato("JsonReader is closed");
                    return 0;
                }
            }
        }
        int iM492continue5 = m492continue(true);
        if (iM492continue5 == 34) {
            c0869l.readByte();
            this.f1504l = 9;
            return 9;
        }
        if (iM492continue5 == 39) {
            mopub();
            throw null;
        }
        if (iM492continue5 != 44 && iM492continue5 != 59) {
            if (iM492continue5 == 91) {
                c0869l.readByte();
                this.f1504l = 3;
                return 3;
            }
            if (iM492continue5 != 93) {
                if (iM492continue5 == 123) {
                    c0869l.readByte();
                    this.f1504l = 1;
                    return 1;
                }
                byte bAds2 = c0869l.ads(0L);
                InterfaceC9473l interfaceC9473l = this.f1509l;
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
                            if (interfaceC9473l.request(i4)) {
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
                                        } else if (!m508synchronized(bAds)) {
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
                                    if (m508synchronized(c0869l.ads(j))) {
                                        mopub();
                                        throw null;
                                    }
                                    m499l("Expected value");
                                    throw null;
                                }
                                i6 = 6;
                                if (i2 != 5) {
                                    i5 = i9;
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (m508synchronized(c0869l.ads(j))) {
                                        mopub();
                                        throw null;
                                    }
                                    m499l("Expected value");
                                    throw null;
                                }
                                i2 = i6;
                                i3 = i4;
                            }
                            if (i2 != 2 && i10 != 0 && ((j2 != Long.MIN_VALUE || i11 != 0) && (j2 != j || i11 == 0))) {
                                if (i11 == 0) {
                                    j2 = -j2;
                                }
                                this.f1505l = j2;
                                c0869l.skip(i3);
                                i5 = 16;
                                this.f1504l = 16;
                            } else if (i2 != 2 || i2 == 4 || i2 == 7) {
                                this.f1511l = i3;
                                i5 = 17;
                                this.f1504l = 17;
                            } else {
                                i5 = i9;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (m508synchronized(c0869l.ads(j))) {
                                mopub();
                                throw null;
                            }
                            m499l("Expected value");
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
                        if (!interfaceC9473l.request(length + 1) || !m508synchronized(c0869l.ads(length))) {
                            c0869l.skip(length);
                            this.f1504l = i;
                            break;
                        }
                    } else {
                        int i13 = i12 + 1;
                        if (interfaceC9473l.request(i13) && ((cAds = c0869l.ads(i12)) == str2.charAt(i12) || cAds == str.charAt(i12))) {
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
                    if (interfaceC9473l.request(i4)) {
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
                            if (m508synchronized(c0869l.ads(j))) {
                                mopub();
                                throw null;
                            }
                            m499l("Expected value");
                            throw null;
                        }
                        i6 = 6;
                        if (i2 != 5) {
                            i5 = i9;
                            if (i5 != 0) {
                                return i5;
                            }
                            if (m508synchronized(c0869l.ads(j))) {
                                mopub();
                                throw null;
                            }
                            m499l("Expected value");
                            throw null;
                        }
                        i2 = i6;
                        i3 = i4;
                    }
                    if (i2 != 2) {
                        if (i2 != 2) {
                        }
                        this.f1511l = i3;
                        i5 = 17;
                        this.f1504l = 17;
                    } else {
                        if (i2 != 2) {
                        }
                        this.f1511l = i3;
                        i5 = 17;
                        this.f1504l = 17;
                    }
                    if (i5 != 0) {
                        return i5;
                    }
                    if (m508synchronized(c0869l.ads(j))) {
                        mopub();
                        throw null;
                    }
                    m499l("Expected value");
                    throw null;
                }
            }
            if (i8 == 1) {
                c0869l.readByte();
                this.f1504l = 4;
                return 4;
            }
        }
        if (i8 == 1 || i8 == 2) {
            mopub();
            throw null;
        }
        m499l("Unexpected value");
        throw null;
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public final int m510while() throws C8413l, EOFException {
        int iVip = this.f1504l;
        if (iVip == 0) {
            iVip = vip();
        }
        switch (iVip) {
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

    public final void yandex() throws C8413l, EOFException {
        int iVip = this.f1504l;
        if (iVip == 0) {
            iVip = vip();
        }
        if (iVip != 3) {
            C11467l.firebase(AbstractC2812l.premium(m510while()), inmobi(), "Expected BEGIN_ARRAY but was ");
            return;
        }
        m498l(1);
        this.f1510l[this.f1507l - 1] = 0;
        this.f1504l = 0;
    }

    public C0396l(InterfaceC9473l interfaceC9473l) {
        this.f1506l = new int[32];
        this.f1503l = new String[32];
        this.f1510l = new int[32];
        this.f1504l = 0;
        if (interfaceC9473l != null) {
            this.f1509l = interfaceC9473l;
            this.f1512l = interfaceC9473l.crashlytics();
            m498l(6);
            return;
        }
        C6541l.subs("source == null");
        throw null;
    }
}
