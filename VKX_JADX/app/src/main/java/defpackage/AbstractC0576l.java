package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lؑۚۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0576l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f1971l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f1972l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1973l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f1974l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f1975l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f1976l;

    public AbstractC0576l(C17752l c17752l) {
        this.f1973l = 0;
        this.f1971l = c17752l;
        this.f1975l = new C17219l(c17752l);
        this.f1976l = new StringBuilder();
    }

    public static boolean pro(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    public static /* synthetic */ void tapsense(AbstractC0576l abstractC0576l, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = abstractC0576l.f1972l;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        abstractC0576l.subscription(str, i, str2);
        throw null;
    }

    public int Signature(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        tapsense(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public abstract String ad(String str, boolean z);

    public abstract byte admob();

    public void ads() {
        if (admob() == 10) {
            return;
        }
        tapsense(this, "Expected EOF after parsing, but had " + license().charAt(this.f1972l - 1) + " instead", 0, null, 6);
        throw null;
    }

    public byte advert() {
        CharSequence charSequenceLicense = license();
        int i = this.f1972l;
        while (true) {
            int iSignatures = signatures(i);
            if (iSignatures == -1) {
                this.f1972l = iSignatures;
                return (byte) 10;
            }
            char cCharAt = charSequenceLicense.charAt(iSignatures);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f1972l = iSignatures;
                return AbstractC14205l.loadAd(cCharAt);
            }
            i = iSignatures + 1;
        }
    }

    public void amazon(int i, int i2) {
        ((StringBuilder) this.f1976l).append(license(), i, i2);
    }

    public String applovin(int i, int i2) {
        return license().subSequence(i, i2).toString();
    }

    public boolean appmetrica() {
        int iPremium = premium();
        CharSequence charSequenceLicense = license();
        if (iPremium >= charSequenceLicense.length() || iPremium == -1 || charSequenceLicense.charAt(iPremium) != ',') {
            return false;
        }
        this.f1972l++;
        return true;
    }

    public void billing(int i, String str) {
        if (license().length() - i < str.length()) {
            tapsense(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (license().charAt(i + i2) | ' ')) {
                tapsense(this, "Expected valid boolean literal prefix, but had '" + metrica() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f1972l = str.length() + i;
    }

    public int crashlytics(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f1976l).append((char) (Signature(charSequence, i + 3) + (Signature(charSequence, i) << 12) + (Signature(charSequence, i + 1) << 8) + (Signature(charSequence, i + 2) << 4)));
            return i2;
        }
        this.f1972l = i;
        adcel();
        if (this.f1972l + 4 < charSequence.length()) {
            return crashlytics(charSequence, this.f1972l);
        }
        tapsense(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public abstract void firebase(char c);

    public boolean hasNext() {
        return ((Map.Entry) this.f1976l) != null;
    }

    public boolean inmobi(boolean z) {
        int iSignatures = signatures(premium());
        int length = license().length() - iSignatures;
        if (length >= 4 && iSignatures != -1) {
            for (int i = 0; i < 4; i++) {
                if ("null".charAt(i) == license().charAt(iSignatures + i)) {
                }
            }
            if (length <= 4 || AbstractC14205l.loadAd(license().charAt(iSignatures + 4)) != 0) {
                if (z) {
                    this.f1972l = iSignatures + 4;
                }
                return true;
            }
        }
        return false;
    }

    public String isVip(boolean z) {
        String strRemoteconfig;
        byte bAdvert = advert();
        if (z) {
            if (bAdvert != 1 && bAdvert != 0) {
                return null;
            }
            strRemoteconfig = metrica();
        } else {
            if (bAdvert != 1) {
                return null;
            }
            strRemoteconfig = remoteconfig();
        }
        this.f1974l = strRemoteconfig;
        return strRemoteconfig;
    }

    public abstract CharSequence license();

    public String metrica() {
        String strApplovin;
        StringBuilder sb = (StringBuilder) this.f1976l;
        String str = (String) this.f1974l;
        if (str != null) {
            this.f1974l = null;
            return str;
        }
        int iPremium = premium();
        if (iPremium >= license().length() || iPremium == -1) {
            tapsense(this, "EOF", iPremium, null, 4);
            throw null;
        }
        byte bLoadAd = AbstractC14205l.loadAd(license().charAt(iPremium));
        if (bLoadAd == 1) {
            return remoteconfig();
        }
        if (bLoadAd != 0) {
            tapsense(this, "Expected beginning of the string, but got " + license().charAt(iPremium), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (AbstractC14205l.loadAd(license().charAt(iPremium)) == 0) {
            iPremium++;
            if (iPremium >= license().length()) {
                amazon(this.f1972l, iPremium);
                int iSignatures = signatures(iPremium);
                if (iSignatures == -1) {
                    this.f1972l = iPremium;
                    amazon(0, 0);
                    String string = sb.toString();
                    sb.setLength(0);
                    return string;
                }
                iPremium = iSignatures;
                z = true;
            }
        }
        int i = this.f1972l;
        if (z) {
            amazon(i, iPremium);
            String string2 = sb.toString();
            sb.setLength(0);
            strApplovin = string2;
        } else {
            strApplovin = applovin(i, iPremium);
        }
        this.f1972l = iPremium;
        return strApplovin;
    }

    public abstract String mopub();

    public abstract int premium();

    public abstract boolean purchase();

    public String remoteconfig() {
        String str = (String) this.f1974l;
        if (str == null) {
            return mopub();
        }
        this.f1974l = null;
        return str;
    }

    public void remove() {
        C12376l c12376l = (C12376l) this.f1971l;
        if (c12376l.purchase().amazon != this.f1972l) {
            C8339l.mopub();
            return;
        }
        Map.Entry entry = (Map.Entry) this.f1974l;
        if (entry == null) {
            C18073l.admob();
            return;
        }
        c12376l.remove(entry.getKey());
        this.f1974l = null;
        Unit unit = Unit.INSTANCE;
        this.f1972l = c12376l.purchase().amazon;
    }

    public abstract int signatures(int i);

    public long smaato() {
        boolean z;
        boolean z2;
        boolean z3;
        double dPow;
        int iSignatures = signatures(premium());
        if (iSignatures >= license().length() || iSignatures == -1) {
            tapsense(this, "EOF", 0, null, 6);
            throw null;
        }
        if (license().charAt(iSignatures) == '\"') {
            iSignatures++;
            if (iSignatures == license().length()) {
                tapsense(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iSignatures;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        long j = 0;
        long j2 = 0;
        while (true) {
            if (i == license().length()) {
                z = z;
                z2 = z5;
                z3 = z6;
                break;
            }
            char cCharAt = license().charAt(i);
            z = z;
            if ((cCharAt != 'e' && cCharAt != 'E') || z5) {
                z2 = z5;
                if (cCharAt == '-' && z2) {
                    if (i == iSignatures) {
                        tapsense(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z5 = z2;
                    z4 = false;
                } else if (cCharAt != '+' || !z2) {
                    z3 = z6;
                    if (cCharAt != '-') {
                        if (AbstractC14205l.loadAd(cCharAt) != 0) {
                            break;
                        }
                        int i2 = i + 1;
                        int i3 = cCharAt - '0';
                        if (i3 < 0 || i3 >= 10) {
                            tapsense(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                            throw null;
                        }
                        if (z2) {
                            j = (j * 10) + ((long) i3);
                        } else {
                            j2 = (j2 * 10) - ((long) i3);
                            if (j2 > 0) {
                                tapsense(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        i = i2;
                        z5 = z2;
                        z6 = z3;
                    } else {
                        if (i != iSignatures) {
                            tapsense(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                            throw null;
                        }
                        i++;
                        z5 = z2;
                        z6 = true;
                    }
                } else {
                    if (i == iSignatures) {
                        tapsense(this, "Unexpected symbol '+' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z5 = z2;
                    z4 = true;
                }
            } else {
                if (i == iSignatures) {
                    tapsense(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                    throw null;
                }
                i++;
                z4 = true;
                z5 = true;
            }
        }
        boolean z7 = i != iSignatures;
        if (iSignatures == i || (z3 && iSignatures == i - 1)) {
            tapsense(this, "Expected numeric literal", i, null, 4);
            throw null;
        }
        if (z) {
            if (!z7) {
                tapsense(this, "EOF", 0, null, 6);
                throw null;
            }
            if (license().charAt(i) != '\"') {
                tapsense(this, "Expected closing quotation mark", i, null, 4);
                throw null;
            }
            i++;
        }
        this.f1972l = i;
        if (z2) {
            double d = j2;
            if (!z4) {
                dPow = Math.pow(10.0d, -j);
            } else {
                if (!z4) {
                    C18725l.billing();
                    return 0L;
                }
                dPow = Math.pow(10.0d, j);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                tapsense(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                tapsense(this, "Can't convert " + d2 + " to Long", 0, null, 6);
                throw null;
            }
            j2 = (long) d2;
        }
        if (z3) {
            return j2;
        }
        if (j2 != Long.MIN_VALUE) {
            return -j2;
        }
        tapsense(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public String startapp() {
        String strMetrica = metrica();
        if (!AbstractC8576l.yandex(strMetrica, "null") || license().charAt(this.f1972l - 1) == '\"') {
            return strMetrica;
        }
        tapsense(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public byte subs(byte b) {
        byte bAdmob = admob();
        if (bAdmob == b) {
            return bAdmob;
        }
        String strMopub = AbstractC14205l.mopub(b);
        int i = this.f1972l;
        int i2 = i > 0 ? i - 1 : i;
        tapsense(this, AbstractC14814l.ads("Expected ", strMopub, ", but had '", (i == license().length() || i2 < 0) ? "EOF" : String.valueOf(license().charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    public void subscription(String str, int i, String str2) {
        throw new C5114l(AbstractC2238l.crashlytics(i, str, ((C17219l) this.f1975l).m4289private(), str2, ((C17752l) this.f1971l).smaato ? AbstractC2238l.mopub(license(), i).toString() : null));
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public void m646throws(char c) {
        int i = this.f1972l;
        if (i > 0 && c == '\"') {
            try {
                this.f1972l = i - 1;
                String strMetrica = metrica();
                this.f1972l = i;
                if (AbstractC8576l.yandex(strMetrica, "null")) {
                    subscription("Expected string literal but 'null' literal was found", this.f1972l - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f1972l = i;
                throw th;
            }
        }
        String strMopub = AbstractC14205l.mopub(AbstractC14205l.loadAd(c));
        int i2 = this.f1972l;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        tapsense(this, AbstractC14814l.ads("Expected ", strMopub, ", but had '", (i2 == license().length() || i3 < 0) ? "EOF" : String.valueOf(license().charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    public String toString() {
        switch (this.f1973l) {
            case 0:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append((Object) license());
                sb.append("', currentPosition=");
                return AbstractC0653l.adcel(sb, this.f1972l, ')');
            default:
                return super.toString();
        }
    }

    public String vip(int i, int i2, CharSequence charSequence) {
        String string;
        StringBuilder sb = (StringBuilder) this.f1976l;
        char cCharAt = charSequence.charAt(i2);
        boolean z = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                amazon(i, i2);
                int iSignatures = signatures(i2 + 1);
                if (iSignatures == -1) {
                    tapsense(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int iCrashlytics = iSignatures + 1;
                char cCharAt2 = license().charAt(iSignatures);
                if (cCharAt2 == 'u') {
                    iCrashlytics = crashlytics(license(), iCrashlytics);
                } else {
                    char c = cCharAt2 < 'u' ? C9315l.yandex[cCharAt2] : (char) 0;
                    if (c == 0) {
                        tapsense(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    sb.append(c);
                }
                i = signatures(iCrashlytics);
                if (i == -1) {
                    tapsense(this, "Unexpected EOF", i, null, 4);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    amazon(i, i2);
                    i = signatures(i2);
                    if (i == -1) {
                        tapsense(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                }
                cCharAt = charSequence.charAt(i2);
            }
            i2 = i;
            z = true;
            cCharAt = charSequence.charAt(i2);
        }
        if (z) {
            amazon(i, i2);
            string = sb.toString();
            sb.setLength(0);
        } else {
            string = applovin(i, i2);
        }
        this.f1972l = i2 + 1;
        return string;
    }

    public void yandex() {
        this.f1974l = (Map.Entry) this.f1976l;
        Iterator it = (Iterator) this.f1975l;
        this.f1976l = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    public void adcel() {
    }

    public AbstractC0576l(C12376l c12376l, Iterator it) {
        this.f1973l = 1;
        this.f1971l = c12376l;
        this.f1975l = it;
        this.f1972l = c12376l.purchase().amazon;
        yandex();
    }
}
