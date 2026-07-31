package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: renamed from: lٕۦٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16071l implements Iterable, Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final InterfaceC8849l f31493l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C15379l f31494l = new C15379l(AbstractC6320l.loadAd);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f31495l;

    static {
        f31493l = AbstractC12500l.yandex() ? new C13863l(26) : new C11485l(25);
    }

    public static int billing(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            C18262l.adcel(AbstractC15560l.tapsense("Beginning index: ", i, " < 0"));
            return 0;
        }
        if (i2 < i) {
            C18262l.adcel(AbstractC12589l.premium(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        C18262l.adcel(AbstractC12589l.premium(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static C15379l mopub(int i, int i2, byte[] bArr) {
        billing(i, i + i2, bArr.length);
        return new C15379l(f31493l.yandex(i, i2, bArr));
    }

    public abstract void admob(int i, byte[] bArr);

    public abstract byte amazon(int i);

    public final int hashCode() {
        int i = this.f31495l;
        if (i != 0) {
            return i;
        }
        int size = size();
        C15379l c15379l = (C15379l) this;
        int iFirebase = c15379l.firebase();
        int i2 = size;
        for (int i3 = iFirebase; i3 < iFirebase + size; i3++) {
            i2 = (i2 * 31) + c15379l.f30044l[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f31495l = i2;
        return i2;
    }

    public abstract int size();

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = AbstractC13273l.yandex(this);
        } else {
            C15379l c15379l = (C15379l) this;
            int iBilling = billing(0, 47, c15379l.size());
            strConcat = AbstractC13273l.yandex(iBilling == 0 ? f31494l : new C16340l(c15379l.f30044l, c15379l.firebase(), iBilling)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return AbstractC0653l.ads(sb, strConcat, "\">");
    }
}
