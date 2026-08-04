package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: lؗ٘ۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C4966l implements Iterable, Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C4966l f10110l = new C4966l(AbstractC4579l.loadAd);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final InterfaceC4374l f10111l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f10112l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f10113l = 0;

    static {
        f10111l = AbstractC16910l.yandex() ? new C11140l(26) : new C6168l(26);
    }

    public C4966l(byte[] bArr) {
        bArr.getClass();
        this.f10112l = bArr;
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

    public static C4966l mopub(int i, int i2, byte[] bArr) {
        billing(i, i + i2, bArr.length);
        return new C4966l(f10111l.yandex(i, i2, bArr));
    }

    public void admob(int i, byte[] bArr) {
        System.arraycopy(this.f10112l, 0, bArr, 0, i);
    }

    public byte amazon(int i) {
        return this.f10112l[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C4966l) && size() == ((C4966l) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C4966l)) {
                return obj.equals(this);
            }
            C4966l c4966l = (C4966l) obj;
            int i = this.f10113l;
            int i2 = c4966l.f10113l;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > c4966l.size()) {
                    C18353l.loadAd(size, size());
                    return false;
                }
                if (size > c4966l.size()) {
                    StringBuilder sbSignature = AbstractC2812l.Signature("Ran off end of other: 0, ", size, ", ");
                    sbSignature.append(c4966l.size());
                    throw new IllegalArgumentException(sbSignature.toString());
                }
                byte[] bArr = c4966l.f10112l;
                int iFirebase = firebase() + size;
                int iFirebase2 = firebase();
                int iFirebase3 = c4966l.firebase();
                while (iFirebase2 < iFirebase) {
                    if (this.f10112l[iFirebase2] == bArr[iFirebase3]) {
                        iFirebase2++;
                        iFirebase3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int firebase() {
        return 0;
    }

    public final int hashCode() {
        int i = this.f10113l;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iFirebase = firebase();
        int i2 = size;
        for (int i3 = iFirebase; i3 < iFirebase + size; i3++) {
            i2 = (i2 * 31) + this.f10112l[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f10113l = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C7515l(this);
    }

    public int size() {
        return this.f10112l.length;
    }

    public byte smaato(int i) {
        return this.f10112l[i];
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = AbstractC7000l.crashlytics(this);
        } else {
            int iBilling = billing(0, 47, size());
            strConcat = AbstractC7000l.crashlytics(iBilling == 0 ? f10110l : new C0122l(this.f10112l, firebase(), iBilling)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return AbstractC0653l.ads(sb, strConcat, "\">");
    }
}
