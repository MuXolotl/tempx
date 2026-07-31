package defpackage;

/* JADX INFO: renamed from: lٌْٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13545l implements CharSequence {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f26560l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f26561l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26562l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f26563l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public CharSequence f26564l;

    public C13545l(C16231l c16231l, int i, int i2) {
        this.f26563l = c16231l;
        this.f26561l = i;
        this.f26560l = i2;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        switch (this.f26562l) {
            case 0:
                int i2 = this.f26561l + i;
                if (i < 0) {
                    C10754l.metrica(AbstractC0653l.vip(i, "index is negative: "));
                    return (char) 0;
                }
                if (i2 < this.f26560l) {
                    C16231l c16231l = (C16231l) this.f26563l;
                    return c16231l.yandex(i2)[i2 % c16231l.f31765l.length];
                }
                StringBuilder sbSignature = AbstractC2812l.Signature("index (", i, ") should be less than length (");
                sbSignature.append(length());
                sbSignature.append(')');
                throw new IllegalArgumentException(sbSignature.toString().toString());
            default:
                C14568l c14568l = (C14568l) this.f26563l;
                if (c14568l == null) {
                    return this.f26564l.charAt(i);
                }
                if (i < this.f26561l) {
                    return this.f26564l.charAt(i);
                }
                int iYandex = c14568l.loadAd - c14568l.yandex();
                int i3 = this.f26561l;
                if (i >= iYandex + i3) {
                    return this.f26564l.charAt(i - ((iYandex - this.f26560l) + i3));
                }
                int i4 = i - i3;
                int i5 = c14568l.amazon;
                char[] cArr = c14568l.crashlytics;
                return i4 < i5 ? cArr[i4] : cArr[(i4 - i5) + c14568l.purchase];
        }
    }

    public boolean equals(Object obj) {
        switch (this.f26562l) {
            case 0:
                if (!(obj instanceof CharSequence)) {
                    return false;
                }
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence.length() != length()) {
                    return false;
                }
                C16231l c16231l = (C16231l) this.f26563l;
                int i = this.f26561l;
                int length = length();
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i + i2;
                    if (c16231l.yandex(i3)[i3 % c16231l.f31765l.length] != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.f26562l) {
            case 0:
                String str = (String) this.f26564l;
                if (str != null) {
                    return str.hashCode();
                }
                C16231l c16231l = (C16231l) this.f26563l;
                int i = this.f26560l;
                int i2 = 0;
                for (int i3 = this.f26561l; i3 < i; i3++) {
                    i2 = (i2 * 31) + c16231l.yandex(i3)[i3 % c16231l.f31765l.length];
                }
                return i2;
            default:
                return super.hashCode();
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        switch (this.f26562l) {
            case 0:
                return this.f26560l - this.f26561l;
            default:
                C14568l c14568l = (C14568l) this.f26563l;
                CharSequence charSequence = this.f26564l;
                if (c14568l == null) {
                    return charSequence.length();
                }
                return (c14568l.loadAd - c14568l.yandex()) + (charSequence.length() - (this.f26560l - this.f26561l));
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        switch (this.f26562l) {
            case 0:
                if (i < 0) {
                    C10754l.metrica(AbstractC0653l.vip(i, "start is negative: "));
                    return null;
                }
                if (i > i2) {
                    C18353l.smaato(i, i2, ") should be less or equal to end (", "start (");
                    return null;
                }
                int i3 = this.f26560l;
                int i4 = this.f26561l;
                if (i2 <= i3 - i4) {
                    return i == i2 ? "" : new C13545l((C16231l) this.f26563l, i + i4, i4 + i2);
                }
                throw new IllegalArgumentException(("end should be less than length (" + length() + ')').toString());
            default:
                return toString().subSequence(i, i2);
        }
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        switch (this.f26562l) {
            case 0:
                String str = (String) this.f26564l;
                if (str != null) {
                    return str;
                }
                String string = ((C16231l) this.f26563l).loadAd(this.f26561l, this.f26560l).toString();
                this.f26564l = string;
                return string;
            default:
                C14568l c14568l = (C14568l) this.f26563l;
                if (c14568l == null) {
                    return this.f26564l.toString();
                }
                StringBuilder sb = new StringBuilder((this.f26564l.length() + ((c14568l.loadAd - c14568l.yandex()) + this.f26561l)) - this.f26560l);
                sb.append(this.f26564l, 0, this.f26561l);
                sb.append(c14568l.crashlytics, 0, c14568l.amazon);
                char[] cArr = c14568l.crashlytics;
                int i = c14568l.purchase;
                sb.append(cArr, i, c14568l.loadAd - i);
                CharSequence charSequence = this.f26564l;
                sb.append(charSequence, this.f26560l, charSequence.length());
                return sb.toString();
        }
    }

    public void yandex(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (i > i2) {
            AbstractC14825l.yandex("start=" + i + " > end=" + i2);
        }
        if (i3 > i4) {
            AbstractC14825l.yandex("textStart=" + i3 + " > textEnd=" + i4);
        }
        if (i < 0) {
            AbstractC14825l.yandex("start must be non-negative, but was " + i);
        }
        if (i3 < 0) {
            AbstractC14825l.yandex("textStart must be non-negative, but was " + i3);
        }
        C14568l c14568l = (C14568l) this.f26563l;
        int i5 = i4 - i3;
        if (c14568l == null) {
            int iMax = Math.max(255, i5 + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.f26564l.length() - i2, 64);
            int i6 = i - iMin;
            AbstractC10704l.mopub(this.f26564l, cArr, 0, i6, i);
            int i7 = iMax - iMin2;
            int i8 = iMin2 + i2;
            AbstractC10704l.mopub(this.f26564l, cArr, i7, i2, i8);
            AbstractC10704l.mopub(charSequence, cArr, iMin, i3, i4);
            C14568l c14568l2 = new C14568l(1);
            c14568l2.loadAd = iMax;
            c14568l2.crashlytics = cArr;
            c14568l2.amazon = iMin + i5;
            c14568l2.purchase = i7;
            this.f26563l = c14568l2;
            this.f26561l = i6;
            this.f26560l = i8;
            return;
        }
        int i9 = this.f26561l;
        int i10 = i - i9;
        int i11 = i2 - i9;
        if (i10 < 0 || i11 > c14568l.loadAd - c14568l.yandex()) {
            this.f26564l = toString();
            this.f26563l = null;
            this.f26561l = -1;
            this.f26560l = -1;
            yandex(i, i2, charSequence, i3, i4);
            return;
        }
        int i12 = i5 - (i11 - i10);
        if (i12 > c14568l.yandex()) {
            int iYandex = i12 - c14568l.yandex();
            int i13 = c14568l.loadAd;
            do {
                i13 *= 2;
            } while (i13 - c14568l.loadAd < iYandex);
            char[] cArr2 = new char[i13];
            AbstractC8669l.isVip(c14568l.crashlytics, cArr2, 0, 0, c14568l.amazon);
            int i14 = c14568l.loadAd;
            int i15 = c14568l.purchase;
            int i16 = i14 - i15;
            int i17 = i13 - i16;
            AbstractC8669l.isVip(c14568l.crashlytics, cArr2, i17, i15, i16 + i15);
            c14568l.crashlytics = cArr2;
            c14568l.loadAd = i13;
            c14568l.purchase = i17;
        }
        int i18 = c14568l.amazon;
        if (i10 < i18 && i11 <= i18) {
            int i19 = i18 - i11;
            char[] cArr3 = c14568l.crashlytics;
            AbstractC8669l.isVip(cArr3, cArr3, c14568l.purchase - i19, i11, i18);
            c14568l.amazon = i10;
            c14568l.purchase -= i19;
        } else if (i10 >= i18 || i11 < i18) {
            int iYandex2 = c14568l.yandex() + i10;
            int iYandex3 = c14568l.yandex() + i11;
            int i20 = c14568l.purchase;
            char[] cArr4 = c14568l.crashlytics;
            AbstractC8669l.isVip(cArr4, cArr4, c14568l.amazon, i20, iYandex2);
            c14568l.amazon += iYandex2 - i20;
            c14568l.purchase = iYandex3;
        } else {
            c14568l.purchase = c14568l.yandex() + i11;
            c14568l.amazon = i10;
        }
        AbstractC10704l.mopub(charSequence, c14568l.crashlytics, c14568l.amazon, i3, i4);
        c14568l.amazon += i5;
    }

    public /* synthetic */ C13545l() {
    }
}
