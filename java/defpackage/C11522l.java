package defpackage;

import android.content.res.TypedArray;
import android.util.SparseArray;
import java.io.IOException;
import java.io.OutputStream;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: lُٕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C11522l implements InterfaceC1767l {
    public Object amazon;
    public int crashlytics;
    public int loadAd;
    public Object purchase;
    public final /* synthetic */ int yandex;

    public C11522l(CharSequence charSequence, int i, Locale locale) {
        this.yandex = 8;
        this.amazon = charSequence;
        if (charSequence.length() < 0) {
            AbstractC1786l.yandex("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            AbstractC1786l.yandex("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.purchase = wordInstance;
        this.loadAd = Math.max(0, -50);
        this.crashlytics = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new C3942l(charSequence, i));
    }

    public static int adcel(AbstractC14080l abstractC14080l) {
        int iCrashlytics = abstractC14080l.crashlytics();
        return ads(iCrashlytics) + iCrashlytics;
    }

    public static int ads(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int metrica(int i) {
        if (i >= 0) {
            return ads(i);
        }
        return 10;
    }

    public static int remoteconfig(int i, int i2) {
        return metrica(i2) + tapsense(i);
    }

    public static int startapp(int i, AbstractC14080l abstractC14080l) {
        return adcel(abstractC14080l) + tapsense(i);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static boolean m3095strictfp(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public static int subscription(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int tapsense(int i) {
        return ads(i << 3);
    }

    public static int vip(int i, int i2) {
        return metrica(i2) + tapsense(i);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static C11522l m3096volatile(OutputStream outputStream, int i) {
        return new C11522l(outputStream, new byte[i]);
    }

    public boolean Signature(char c) {
        int i = this.loadAd;
        boolean z = i < this.crashlytics && ((String) this.amazon).charAt(i) == c;
        if (z) {
            this.loadAd++;
        }
        return z;
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public void m3097abstract(int i, int i2) throws IOException {
        m3102const(i, 0);
        m3113instanceof(i2);
    }

    public void ad() {
        int length = ((Object[]) this.purchase).length;
        if (this.crashlytics < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.loadAd;
        int i3 = length - i2;
        System.arraycopy((long[]) this.amazon, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.purchase, this.loadAd, objArr, 0, i3);
        int i4 = this.loadAd;
        if (i4 > 0) {
            System.arraycopy((long[]) this.amazon, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.purchase, 0, objArr, i3, this.loadAd);
        }
        this.amazon = jArr;
        this.purchase = objArr;
        this.loadAd = 0;
    }

    public int admob() {
        int i = this.loadAd;
        int i2 = this.crashlytics;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.loadAd = i3;
        if (i3 < i2) {
            return ((String) this.amazon).charAt(i3);
        }
        return -1;
    }

    public boolean advert() {
        return this.loadAd == this.crashlytics;
    }

    @Override // defpackage.InterfaceC1767l
    public void amazon(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        mopub((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
        pro(5);
        float[] fArr = (float[]) this.purchase;
        int i = this.crashlytics;
        int i2 = i + 1;
        this.crashlytics = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.crashlytics = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.crashlytics = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.crashlytics = i5;
        fArr[i4] = f4;
        this.crashlytics = i + 5;
        fArr[i5] = f5;
    }

    public boolean applovin(int i) {
        CharSequence charSequence = (CharSequence) this.amazon;
        int i2 = this.loadAd + 1;
        if (i > this.crashlytics || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!C12304l.amazon()) {
                    return false;
                }
                C12304l c12304lYandex = C12304l.yandex();
                if (c12304lYandex.crashlytics() != 1 || c12304lYandex.loadAd(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean appmetrica(int i) {
        int i2 = this.loadAd + 1;
        if (i > this.crashlytics || i2 > i) {
            return false;
        }
        return AbstractC9498l.billing(Character.codePointBefore((CharSequence) this.amazon, i));
    }

    public synchronized void billing(long j, Object obj) {
        int i = this.crashlytics;
        if (i > 0) {
            if (j <= ((long[]) this.amazon)[((this.loadAd + i) - 1) % ((Object[]) this.purchase).length]) {
                smaato();
            }
        }
        ad();
        int i2 = this.loadAd;
        int i3 = this.crashlytics;
        Object[] objArr = (Object[]) this.purchase;
        int length = (i2 + i3) % objArr.length;
        ((long[]) this.amazon)[length] = j;
        objArr[length] = obj;
        this.crashlytics = i3 + 1;
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public void m3098break(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.loadAd;
        int i2 = this.crashlytics;
        int i3 = i - i2;
        byte[] bArr2 = (byte[]) this.amazon;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i2, length);
            this.crashlytics += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i2, i3);
        int i4 = length - i3;
        this.crashlytics = i;
        m3104default();
        if (i4 > i) {
            ((OutputStream) this.purchase).write(bArr, i3, i4);
        } else {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.crashlytics = i4;
        }
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public int m3099case() {
        String str = (String) this.amazon;
        if (advert()) {
            return 0;
        }
        char cCharAt = str.charAt(this.loadAd);
        int i = this.loadAd;
        if (cCharAt == '%') {
            this.loadAd = i + 1;
            return 9;
        }
        if (i > this.crashlytics - 2) {
            return 0;
        }
        try {
            int iIsVip = AbstractC0653l.isVip(str.substring(i, i + 2).toLowerCase(Locale.US));
            this.loadAd += 2;
            return iIsVip;
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public String m3100catch() {
        return m3105else(' ', false);
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public Object m3101class() {
        AbstractC12442l.subscription(this.crashlytics > 0);
        Object[] objArr = (Object[]) this.purchase;
        int i = this.loadAd;
        Object obj = objArr[i];
        objArr[i] = null;
        this.loadAd = (i + 1) % objArr.length;
        this.crashlytics--;
        return obj;
    }

    @Override // defpackage.InterfaceC1767l
    public void close() {
        mopub((byte) 8);
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public void m3102const(int i, int i2) {
        m3130while((i << 3) | i2);
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public synchronized Object m3103continue(long j) {
        Object objM3101class;
        objM3101class = null;
        while (this.crashlytics > 0 && j - ((long[]) this.amazon)[this.loadAd] >= 0) {
            objM3101class = m3101class();
        }
        return objM3101class;
    }

    @Override // defpackage.InterfaceC1767l
    public void crashlytics(float f, float f2, float f3, float f4, float f5, float f6) {
        mopub((byte) 2);
        pro(6);
        float[] fArr = (float[]) this.purchase;
        int i = this.crashlytics;
        int i2 = i + 1;
        this.crashlytics = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.crashlytics = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.crashlytics = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.crashlytics = i5;
        fArr[i4] = f4;
        int i6 = i + 5;
        this.crashlytics = i6;
        fArr[i5] = f5;
        this.crashlytics = i + 6;
        fArr[i6] = f6;
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public void m3104default() throws IOException {
        ((OutputStream) this.purchase).write((byte[]) this.amazon, 0, this.crashlytics);
        this.crashlytics = 0;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public String m3105else(char c, boolean z) {
        String str = (String) this.amazon;
        if (advert()) {
            return null;
        }
        char cCharAt = str.charAt(this.loadAd);
        if ((!z && m3095strictfp(cCharAt)) || cCharAt == c) {
            return null;
        }
        int i = this.loadAd;
        int iAdmob = admob();
        while (iAdmob != -1 && iAdmob != c && (z || !m3095strictfp(iAdmob))) {
            iAdmob = admob();
        }
        return str.substring(i, this.loadAd);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public float m3106extends() {
        C14513l c14513l = (C14513l) this.purchase;
        float fPremium = c14513l.premium(this.loadAd, this.crashlytics, (String) this.amazon);
        if (!Float.isNaN(fPremium)) {
            this.loadAd = c14513l.f28392l;
        }
        return fPremium;
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public void m3107final(int i, int i2, String str) {
        if (i > i2) {
            AbstractC1786l.yandex("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            AbstractC1786l.yandex("start must be non-negative, but was " + i);
        }
        C14568l c14568l = (C14568l) this.purchase;
        if (c14568l == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.amazon).length() - i2, 64);
            int i3 = i - iMin;
            ((String) this.amazon).getChars(i3, i, cArr, 0);
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            ((String) this.amazon).getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            C14568l c14568l2 = new C14568l(0);
            c14568l2.loadAd = iMax;
            c14568l2.crashlytics = cArr;
            c14568l2.amazon = length;
            c14568l2.purchase = i4;
            this.purchase = c14568l2;
            this.loadAd = i3;
            this.crashlytics = i5;
            return;
        }
        int i6 = this.loadAd;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > c14568l.loadAd - c14568l.yandex()) {
            this.amazon = toString();
            this.purchase = null;
            this.loadAd = -1;
            this.crashlytics = -1;
            m3107final(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > c14568l.yandex()) {
            int iYandex = length2 - c14568l.yandex();
            int i9 = c14568l.loadAd;
            do {
                i9 *= 2;
            } while (i9 - c14568l.loadAd < iYandex);
            char[] cArr2 = new char[i9];
            AbstractC8669l.isVip(c14568l.crashlytics, cArr2, 0, 0, c14568l.amazon);
            int i10 = c14568l.loadAd;
            int i11 = c14568l.purchase;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            AbstractC8669l.isVip(c14568l.crashlytics, cArr2, i13, i11, i12 + i11);
            c14568l.crashlytics = cArr2;
            c14568l.loadAd = i9;
            c14568l.purchase = i13;
        }
        int i14 = c14568l.amazon;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = c14568l.crashlytics;
            AbstractC8669l.isVip(cArr3, cArr3, c14568l.purchase - i15, i8, i14);
            c14568l.amazon = i7;
            c14568l.purchase -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iYandex2 = c14568l.yandex() + i7;
            int iYandex3 = c14568l.yandex() + i8;
            int i16 = c14568l.purchase;
            char[] cArr4 = c14568l.crashlytics;
            AbstractC8669l.isVip(cArr4, cArr4, c14568l.amazon, i16, iYandex2);
            c14568l.amazon += iYandex2 - i16;
            c14568l.purchase = iYandex3;
        } else {
            c14568l.purchase = c14568l.yandex() + i8;
            c14568l.amazon = i7;
        }
        str.getChars(0, str.length(), c14568l.crashlytics, c14568l.amazon);
        c14568l.amazon = str.length() + c14568l.amazon;
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public void m3108finally(AbstractC14080l abstractC14080l) throws IOException {
        m3130while(abstractC14080l.crashlytics());
        abstractC14080l.billing(this);
    }

    public float firebase(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        m3110goto();
        return m3106extends();
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public C12671l m3109for() {
        float fM3106extends = m3106extends();
        if (Float.isNaN(fM3106extends)) {
            return null;
        }
        int iM3099case = m3099case();
        return iM3099case == 0 ? new C12671l(1, fM3106extends) : new C12671l(iM3099case, fM3106extends);
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public boolean m3110goto() {
        m3122super();
        int i = this.loadAd;
        if (i == this.crashlytics || ((String) this.amazon).charAt(i) != ',') {
            return false;
        }
        this.loadAd++;
        m3122super();
        return true;
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public void m3111implements(long j) throws IOException {
        while (((-128) & j) != 0) {
            m3125this((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m3125this((int) j);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public void m3112import(int i, int i2) throws IOException {
        m3102const(i, 0);
        m3113instanceof(i2);
    }

    public boolean inmobi(int i) {
        subs(i);
        if (!((BreakIterator) this.purchase).isBoundary(i)) {
            return false;
        }
        if (m3117package(i) && m3117package(i - 1) && m3117package(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.amazon).length() - 1 || !(m3127throws(i) || m3127throws(i + 1));
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public void m3113instanceof(int i) throws IOException {
        if (i >= 0) {
            m3130while(i);
        } else {
            m3111implements(i);
        }
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public float m3114interface() {
        m3110goto();
        C14513l c14513l = (C14513l) this.purchase;
        float fPremium = c14513l.premium(this.loadAd, this.crashlytics, (String) this.amazon);
        if (!Float.isNaN(fPremium)) {
            this.loadAd = c14513l.f28392l;
        }
        return fPremium;
    }

    public Boolean isPro(Object obj) {
        if (obj == null) {
            return null;
        }
        m3110goto();
        int i = this.loadAd;
        if (i == this.crashlytics) {
            return null;
        }
        char cCharAt = ((String) this.amazon).charAt(i);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        this.loadAd++;
        return Boolean.valueOf(cCharAt == '1');
    }

    public void isVip(InterfaceC1767l interfaceC1767l) {
        int i = 0;
        for (int i2 = 0; i2 < this.loadAd; i2++) {
            byte b = ((byte[]) this.amazon)[i2];
            if (b == 0) {
                float[] fArr = (float[]) this.purchase;
                int i3 = i + 1;
                float f = fArr[i];
                i += 2;
                interfaceC1767l.loadAd(f, fArr[i3]);
            } else if (b == 1) {
                float[] fArr2 = (float[]) this.purchase;
                int i4 = i + 1;
                float f2 = fArr2[i];
                i += 2;
                interfaceC1767l.purchase(f2, fArr2[i4]);
            } else if (b == 2) {
                float[] fArr3 = (float[]) this.purchase;
                interfaceC1767l.crashlytics(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                i += 6;
            } else if (b == 3) {
                float[] fArr4 = (float[]) this.purchase;
                float f3 = fArr4[i];
                float f4 = fArr4[i + 1];
                int i5 = i + 3;
                float f5 = fArr4[i + 2];
                i += 4;
                interfaceC1767l.yandex(f3, f4, f5, fArr4[i5]);
            } else if (b != 8) {
                boolean z = (b & 2) != 0;
                boolean z2 = (b & 1) != 0;
                float[] fArr5 = (float[]) this.purchase;
                interfaceC1767l.amazon(fArr5[i], fArr5[i + 1], fArr5[i + 2], z, z2, fArr5[i + 3], fArr5[i + 4]);
                i += 5;
            } else {
                interfaceC1767l.close();
            }
        }
    }

    public boolean license(String str) {
        int length = str.length();
        int i = this.loadAd;
        boolean z = i <= this.crashlytics - length && ((String) this.amazon).substring(i, i + length).equals(str);
        if (z) {
            this.loadAd += length;
        }
        return z;
    }

    @Override // defpackage.InterfaceC1767l
    public void loadAd(float f, float f2) {
        mopub((byte) 0);
        pro(2);
        float[] fArr = (float[]) this.purchase;
        int i = this.crashlytics;
        int i2 = i + 1;
        this.crashlytics = i2;
        fArr[i] = f;
        this.crashlytics = i + 2;
        fArr[i2] = f2;
    }

    public void mopub(byte b) {
        int i = this.loadAd;
        byte[] bArr = (byte[]) this.amazon;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.amazon = bArr2;
        }
        byte[] bArr3 = (byte[]) this.amazon;
        int i2 = this.loadAd;
        this.loadAd = i2 + 1;
        bArr3[i2] = b;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public int m3115native(int i) {
        subs(i);
        int iFollowing = ((BreakIterator) this.purchase).following(i);
        return (m3117package(iFollowing + (-1)) && m3117package(iFollowing) && !m3127throws(iFollowing)) ? m3115native(iFollowing) : iFollowing;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public synchronized int m3116new() {
        return this.crashlytics;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public boolean m3117package(int i) {
        CharSequence charSequence = (CharSequence) this.amazon;
        int i2 = this.loadAd;
        if (i >= this.crashlytics || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!C12304l.amazon()) {
                return false;
            }
            C12304l c12304lYandex = C12304l.yandex();
            if (c12304lYandex.crashlytics() != 1 || c12304lYandex.loadAd(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public int premium() {
        C14568l c14568l = (C14568l) this.purchase;
        String str = (String) this.amazon;
        if (c14568l == null) {
            return str.length();
        }
        return (c14568l.loadAd - c14568l.yandex()) + (str.length() - (this.crashlytics - this.loadAd));
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public Integer m3118private() {
        int i = this.loadAd;
        if (i == this.crashlytics) {
            return null;
        }
        String str = (String) this.amazon;
        this.loadAd = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    public void pro(int i) {
        float[] fArr = (float[]) this.purchase;
        if (fArr.length < this.crashlytics + i) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.purchase = fArr2;
        }
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public void m3119protected(long j) throws IOException {
        m3125this(((int) j) & 255);
        m3125this(((int) (j >> 8)) & 255);
        m3125this(((int) (j >> 16)) & 255);
        m3125this(((int) (j >> 24)) & 255);
        m3125this(((int) (j >> 32)) & 255);
        m3125this(((int) (j >> 40)) & 255);
        m3125this(((int) (j >> 48)) & 255);
        m3125this(((int) (j >> 56)) & 255);
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public void m3120public(int i, AbstractC14080l abstractC14080l) throws IOException {
        m3102const(i, 2);
        m3108finally(abstractC14080l);
    }

    @Override // defpackage.InterfaceC1767l
    public void purchase(float f, float f2) {
        mopub((byte) 1);
        pro(2);
        float[] fArr = (float[]) this.purchase;
        int i = this.crashlytics;
        int i2 = i + 1;
        this.crashlytics = i2;
        fArr[i] = f;
        this.crashlytics = i + 2;
        fArr[i2] = f2;
    }

    public void signatures() throws IOException {
        m3104default();
    }

    public synchronized void smaato() {
        this.loadAd = 0;
        this.crashlytics = 0;
        Arrays.fill((Object[]) this.purchase, (Object) null);
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public int m3121static(int i) {
        subs(i);
        int iPreceding = ((BreakIterator) this.purchase).preceding(i);
        return (m3117package(iPreceding) && applovin(iPreceding) && !m3127throws(iPreceding)) ? m3121static(iPreceding) : iPreceding;
    }

    public void subs(int i) {
        int i2 = this.loadAd;
        int i3 = this.crashlytics;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbSubscription = AbstractC14814l.subscription(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
        sbSubscription.append(i3);
        sbSubscription.append("]");
        AbstractC1786l.yandex(sbSubscription.toString());
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public void m3122super() {
        while (true) {
            int i = this.loadAd;
            if (i >= this.crashlytics || !m3095strictfp(((String) this.amazon).charAt(i))) {
                return;
            } else {
                this.loadAd++;
            }
        }
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public synchronized Object m3123switch() {
        return this.crashlytics == 0 ? null : m3101class();
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public boolean m3124synchronized(int i) {
        int i2 = this.loadAd;
        if (i >= this.crashlytics || i2 > i) {
            return false;
        }
        return AbstractC9498l.billing(Character.codePointAt((CharSequence) this.amazon, i));
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public void m3125this(int i) throws IOException {
        byte b = (byte) i;
        if (this.crashlytics == this.loadAd) {
            m3104default();
        }
        byte[] bArr = (byte[]) this.amazon;
        int i2 = this.crashlytics;
        this.crashlytics = i2 + 1;
        bArr[i2] = b;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public String m3126throw() {
        String str = (String) this.amazon;
        if (advert()) {
            return null;
        }
        int i = this.loadAd;
        char cCharAt = str.charAt(i);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        int iAdmob = admob();
        while (iAdmob != -1 && iAdmob != cCharAt) {
            iAdmob = admob();
        }
        if (iAdmob == -1) {
            this.loadAd = i;
            return null;
        }
        int i2 = this.loadAd;
        this.loadAd = i2 + 1;
        return str.substring(i + 1, i2);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public boolean m3127throws(int i) {
        CharSequence charSequence = (CharSequence) this.amazon;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (AbstractC8576l.yandex(unicodeBlockOf, unicodeBlock) && AbstractC8576l.yandex(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return AbstractC8576l.yandex(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && AbstractC8576l.yandex(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public String toString() {
        switch (this.yandex) {
            case 3:
                C14568l c14568l = (C14568l) this.purchase;
                String str = (String) this.amazon;
                if (c14568l == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.loadAd);
                sb.append(c14568l.crashlytics, 0, c14568l.amazon);
                char[] cArr = c14568l.crashlytics;
                int i = c14568l.purchase;
                sb.append(cArr, i, c14568l.loadAd - i);
                String str2 = (String) this.amazon;
                sb.append((CharSequence) str2, this.crashlytics, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public void m3128transient(int i) throws IOException {
        m3125this(i & 255);
        m3125this((i >> 8) & 255);
        m3125this((i >> 16) & 255);
        m3125this((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public void m3129try(AbstractC7735l abstractC7735l) throws IOException {
        int size = abstractC7735l.size();
        int i = this.loadAd;
        int i2 = this.crashlytics;
        int i3 = i - i2;
        byte[] bArr = (byte[]) this.amazon;
        if (i3 >= size) {
            abstractC7735l.mopub(bArr, 0, i2, size);
            this.crashlytics += size;
            return;
        }
        abstractC7735l.mopub(bArr, 0, i2, i3);
        int i4 = size - i3;
        this.crashlytics = i;
        m3104default();
        if (i4 <= i) {
            abstractC7735l.mopub(bArr, i3, 0, i4);
            this.crashlytics = i4;
            return;
        }
        OutputStream outputStream = (OutputStream) this.purchase;
        if (i3 < 0) {
            C18353l.mopub(30, i3, "Source offset < 0: ");
            return;
        }
        if (i4 < 0) {
            C18353l.mopub(23, i4, "Length < 0: ");
            return;
        }
        int i5 = i3 + i4;
        if (i5 > abstractC7735l.size()) {
            C18353l.mopub(39, i5, "Source end offset exceeded: ");
        } else if (i4 > 0) {
            abstractC7735l.advert(outputStream, i3, i4);
        }
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public void m3130while(int i) throws IOException {
        while ((i & (-128)) != 0) {
            m3125this((i & 127) | 128);
            i >>>= 7;
        }
        m3125this(i);
    }

    @Override // defpackage.InterfaceC1767l
    public void yandex(float f, float f2, float f3, float f4) {
        mopub((byte) 3);
        pro(4);
        float[] fArr = (float[]) this.purchase;
        int i = this.crashlytics;
        int i2 = i + 1;
        this.crashlytics = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.crashlytics = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.crashlytics = i4;
        fArr[i3] = f3;
        this.crashlytics = i + 4;
        fArr[i4] = f4;
    }

    public C11522l() {
        this.yandex = 7;
        this.amazon = new long[10];
        this.purchase = new Object[10];
    }

    public C11522l(OutputStream outputStream, byte[] bArr) {
        this.yandex = 1;
        this.purchase = outputStream;
        this.amazon = bArr;
        this.crashlytics = 0;
        this.loadAd = bArr.length;
    }

    public C11522l(int i, int i2, InterfaceC12932l interfaceC12932l, InterfaceC6942l interfaceC6942l) {
        this.yandex = 6;
        this.amazon = interfaceC6942l;
        this.loadAd = i;
        this.crashlytics = i2;
        this.purchase = interfaceC12932l;
    }

    public C11522l(C12124l c12124l, C12418l c12418l) {
        this.yandex = 2;
        this.amazon = new SparseArray();
        this.purchase = c12124l;
        TypedArray typedArray = (TypedArray) c12418l.f24518l;
        this.loadAd = typedArray.getResourceId(28, 0);
        this.crashlytics = typedArray.getResourceId(52, 0);
    }

    public C11522l(String str) {
        this.yandex = 5;
        this.loadAd = 0;
        this.crashlytics = 0;
        this.purchase = new C14513l((byte) 0, 2);
        String strTrim = str.trim();
        this.amazon = strTrim;
        this.crashlytics = strTrim.length();
    }

    public C11522l(int i) {
        this.yandex = 0;
        this.amazon = new C4098l[i];
        this.crashlytics = 0;
    }
}
