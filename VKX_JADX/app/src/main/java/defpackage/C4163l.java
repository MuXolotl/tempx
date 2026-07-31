package defpackage;

/* JADX INFO: renamed from: lؖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C4163l extends AbstractC0576l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f8541l;

    public C4163l(String str, C17752l c17752l) {
        super(c17752l);
        this.f8541l = str;
    }

    @Override // defpackage.AbstractC0576l
    public final String ad(String str, boolean z) {
        int i = this.f1972l;
        try {
            if (admob() == 6 && AbstractC8576l.yandex(isVip(z), str)) {
                this.f1974l = null;
                if (admob() == 5) {
                    return isVip(z);
                }
            }
            return null;
        } finally {
            this.f1972l = i;
            this.f1974l = null;
        }
    }

    @Override // defpackage.AbstractC0576l
    public byte admob() {
        String str;
        int i = this.f1972l;
        while (true) {
            str = this.f8541l;
            if (i == -1 || i >= str.length()) {
                break;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1972l = i2;
                return AbstractC14205l.loadAd(cCharAt);
            }
            i = i2;
        }
        this.f1972l = str.length();
        return (byte) 10;
    }

    @Override // defpackage.AbstractC0576l
    public void firebase(char c) {
        int i = this.f1972l;
        if (i == -1) {
            m646throws(c);
            throw null;
        }
        while (true) {
            String str = this.f8541l;
            if (i >= str.length()) {
                this.f1972l = -1;
                m646throws(c);
                throw null;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1972l = i2;
                if (cCharAt == c) {
                    return;
                }
                m646throws(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // defpackage.AbstractC0576l
    public final CharSequence license() {
        return this.f8541l;
    }

    @Override // defpackage.AbstractC0576l
    public final String mopub() {
        firebase('\"');
        int i = this.f1972l;
        String str = this.f8541l;
        int iM3321extends = AbstractC12024l.m3321extends(str, '\"', i, 4);
        if (iM3321extends == -1) {
            metrica();
            int i2 = this.f1972l;
            AbstractC0576l.tapsense(this, AbstractC15560l.Signature("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        for (int i3 = i; i3 < iM3321extends; i3++) {
            if (str.charAt(i3) == '\\') {
                return vip(this.f1972l, i3, str);
            }
        }
        this.f1972l = iM3321extends + 1;
        return str.substring(i, iM3321extends);
    }

    @Override // defpackage.AbstractC0576l
    public int premium() {
        char cCharAt;
        int i = this.f1972l;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.f8541l;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.f1972l = i;
        return i;
    }

    @Override // defpackage.AbstractC0576l
    public boolean purchase() {
        int i = this.f1972l;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.f8541l;
            if (i >= str.length()) {
                this.f1972l = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1972l = i;
                return AbstractC0576l.pro(cCharAt);
            }
            i++;
        }
    }

    @Override // defpackage.AbstractC0576l
    public final int signatures(int i) {
        if (i < this.f8541l.length()) {
            return i;
        }
        return -1;
    }
}
