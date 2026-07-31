package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: renamed from: lؓؔۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C1597l {
    public static final C15362l amazon;
    public static final C15145l purchase;
    public volatile C1597l crashlytics;
    public final Character loadAd;
    public final C18455l yandex;

    static {
        new C15362l("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        amazon = new C15362l("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new C1597l("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new C1597l("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        purchase = new C15145l(new C18455l("base16()", "0123456789ABCDEF".toCharArray()));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public C1597l(C18455l c18455l, Character ch) {
        boolean z;
        this.yandex = c18455l;
        if (ch != null) {
            char cCharValue = ch.charValue();
            byte[] bArr = c18455l.mopub;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        AbstractC12442l.isPro(z, "Padding character %s was already in alphabet", ch);
        this.loadAd = ch;
    }

    public void crashlytics(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        AbstractC12442l.adcel(0, i, bArr.length);
        while (i2 < i) {
            C18455l c18455l = this.yandex;
            loadAd(sb, bArr, i2, Math.min(c18455l.billing, i - i2));
            i2 += c18455l.billing;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1597l) {
            C1597l c1597l = (C1597l) obj;
            if (this.yandex.equals(c1597l.yandex) && Objects.equals(this.loadAd, c1597l.loadAd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.loadAd) ^ this.yandex.hashCode();
    }

    public final void loadAd(StringBuilder sb, byte[] bArr, int i, int i2) {
        AbstractC12442l.adcel(i, i + i2, bArr.length);
        C18455l c18455l = this.yandex;
        int i3 = c18455l.billing;
        int i4 = c18455l.amazon;
        int i5 = 0;
        AbstractC12442l.admob(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(c18455l.loadAd[((int) (j >>> (i7 - i5))) & c18455l.crashlytics]);
            i5 += i4;
        }
        Character ch = this.loadAd;
        if (ch != null) {
            while (i5 < c18455l.billing * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        C18455l c18455l = this.yandex;
        sb.append(c18455l);
        if (8 % c18455l.amazon != 0) {
            Character ch = this.loadAd;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public final String yandex(byte[] bArr) {
        int length = bArr.length;
        AbstractC12442l.adcel(0, length, bArr.length);
        C18455l c18455l = this.yandex;
        int i = c18455l.purchase;
        int i2 = c18455l.billing;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(AbstractC10464l.mopub(length, i2) * i);
        try {
            crashlytics(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            C8339l.subs(e);
            return null;
        }
    }

    public C1597l(String str, String str2) {
        this(new C18455l(str, str2.toCharArray()), (Character) '=');
    }
}
