package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؙٖۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16231l implements CharSequence, Appendable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public char[] f31765l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f31766l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public ArrayList f31767l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC7987l f31768l = AbstractC8274l.yandex;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f31769l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public String f31770l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f31771l;

    public final void amazon() {
        ArrayList arrayList = this.f31767l;
        InterfaceC7987l interfaceC7987l = this.f31768l;
        if (arrayList != null) {
            this.f31765l = null;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                interfaceC7987l.mo2251l(arrayList.get(i));
            }
        } else {
            char[] cArr = this.f31765l;
            if (cArr != null) {
                interfaceC7987l.mo2251l(cArr);
            }
            this.f31765l = null;
        }
        this.f31769l = true;
        this.f31767l = null;
        this.f31770l = null;
        this.f31766l = 0;
        this.f31771l = 0;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return this;
        }
        int i3 = i;
        while (i3 < i2) {
            char[] cArrCrashlytics = crashlytics();
            int length = cArrCrashlytics.length;
            int i4 = this.f31771l;
            int i5 = length - i4;
            int iMin = Math.min(i2 - i3, i4);
            for (int i6 = 0; i6 < iMin; i6++) {
                cArrCrashlytics[i5 + i6] = charSequence.charAt(i3 + i6);
            }
            i3 += iMin;
            this.f31771l -= iMin;
        }
        this.f31770l = null;
        this.f31766l = (i2 - i) + this.f31766l;
        return this;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0) {
            C10754l.metrica(AbstractC0653l.vip(i, "index is negative: "));
            return (char) 0;
        }
        if (i < this.f31766l) {
            return yandex(i)[i % this.f31765l.length];
        }
        C10754l.metrica(AbstractC0653l.adcel(AbstractC2812l.Signature("index ", i, " is not in range [0, "), this.f31766l, ')'));
        return (char) 0;
    }

    public final char[] crashlytics() {
        if (this.f31771l != 0) {
            return this.f31765l;
        }
        char[] cArr = (char[]) this.f31768l.mo2252strictfp();
        char[] cArr2 = this.f31765l;
        this.f31765l = cArr;
        this.f31771l = cArr.length;
        this.f31769l = false;
        if (cArr2 != null) {
            ArrayList arrayList = this.f31767l;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f31767l = arrayList;
                arrayList.add(cArr2);
            }
            arrayList.add(cArr);
        }
        return cArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (this.f31766l == charSequence.length()) {
                int i = this.f31766l;
                for (int i2 = 0; i2 < i; i2++) {
                    if (yandex(i2)[i2 % this.f31765l.length] != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f31770l;
        if (str != null) {
            return str.hashCode();
        }
        int i = this.f31766l;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + yandex(i3)[i3 % this.f31765l.length];
        }
        return i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f31766l;
    }

    public final CharSequence loadAd(int i, int i2) {
        if (i == i2) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i2 - i);
        for (int i3 = i - (i % 2048); i3 < i2; i3 += 2048) {
            char[] cArrYandex = yandex(i3);
            int iMin = Math.min(i2 - i3, 2048);
            for (int iMax = Math.max(0, i - i3); iMax < iMin; iMax++) {
                sb.append(cArrYandex[iMax]);
            }
        }
        return sb;
    }

    public final void purchase(int i) {
        if (this.f31769l) {
            throw new IllegalStateException("Buffer is already released");
        }
        throw new IndexOutOfBoundsException(i + " is not in range [0; " + (this.f31765l.length - this.f31771l) + ')');
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i > i2) {
            C18353l.smaato(i, i2, ") should be less or equal to endIndex (", "startIndex (");
            return null;
        }
        if (i < 0) {
            C10754l.metrica(AbstractC0653l.vip(i, "startIndex is negative: "));
            return null;
        }
        if (i2 <= this.f31766l) {
            return new C13545l(this, i, i2);
        }
        C10754l.metrica(AbstractC0653l.adcel(AbstractC2812l.Signature("endIndex (", i2, ") is greater than length ("), this.f31766l, ')'));
        return null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.f31770l;
        if (str != null) {
            return str;
        }
        String string = loadAd(0, this.f31766l).toString();
        this.f31770l = string;
        return string;
    }

    public final char[] yandex(int i) {
        ArrayList arrayList = this.f31767l;
        if (arrayList != null) {
            return (char[]) arrayList.get(i / this.f31765l.length);
        }
        if (i >= 2048) {
            purchase(i);
            throw null;
        }
        char[] cArr = this.f31765l;
        if (cArr != null) {
            return cArr;
        }
        purchase(i);
        throw null;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        char[] cArrCrashlytics = crashlytics();
        int length = this.f31765l.length;
        int i = this.f31771l;
        cArrCrashlytics[length - i] = c;
        this.f31770l = null;
        this.f31771l = i - 1;
        this.f31766l++;
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            return this;
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }
}
