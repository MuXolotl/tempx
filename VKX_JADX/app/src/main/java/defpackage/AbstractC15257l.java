package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: renamed from: lٕٔۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15257l implements Iterable, Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final InterfaceC10120l f29846l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C14809l f29847l = new C14809l(AbstractC6061l.loadAd);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f29848l;

    static {
        f29846l = AbstractC10330l.yandex() ? new C13772l(26) : new C15718l(25);
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

    public static C14809l mopub(int i, int i2, byte[] bArr) {
        billing(i, i + i2, bArr.length);
        return new C14809l(f29846l.yandex(i, i2, bArr));
    }

    public abstract void admob(int i, byte[] bArr);

    public abstract byte amazon(int i);

    public abstract boolean equals(Object obj);

    public final byte[] firebase() {
        int size = size();
        if (size == 0) {
            return AbstractC6061l.loadAd;
        }
        byte[] bArr = new byte[size];
        admob(size, bArr);
        return bArr;
    }

    public final int hashCode() {
        int i = this.f29848l;
        if (i != 0) {
            return i;
        }
        int size = size();
        C14809l c14809l = (C14809l) this;
        int iSmaato = c14809l.smaato();
        int i2 = size;
        for (int i3 = iSmaato; i3 < iSmaato + size; i3++) {
            i2 = (i2 * 31) + c14809l.f28972l[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f29848l = i2;
        return i2;
    }

    public abstract int size();

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = AbstractC13743l.amazon(this);
        } else {
            C14809l c14809l = (C14809l) this;
            int iBilling = billing(0, 47, c14809l.size());
            strConcat = AbstractC13743l.amazon(iBilling == 0 ? f29847l : new C7231l(c14809l.f28972l, c14809l.smaato(), iBilling)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return AbstractC0653l.ads(sb, strConcat, "\">");
    }
}
