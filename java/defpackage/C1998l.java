package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: lَؓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C1998l implements Iterable, Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C1998l f4517l = new C1998l(AbstractC11966l.loadAd);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f4518l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f4519l = 0;

    static {
        int i = AbstractC0286l.yandex;
    }

    public C1998l(byte[] bArr) {
        bArr.getClass();
        this.f4518l = bArr;
    }

    public static void admob(int i) {
        if (((i - 47) | 47) >= 0) {
            return;
        }
        C18262l.adcel(AbstractC9361l.Signature(i, "End index: 47 >= ", new StringBuilder(String.valueOf(47).length() + 15 + String.valueOf(i).length())));
    }

    public byte amazon(int i) {
        return this.f4518l[i];
    }

    public byte billing(int i) {
        return this.f4518l[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C1998l) && mopub() == ((C1998l) obj).mopub()) {
            if (mopub() == 0) {
                return true;
            }
            if (!(obj instanceof C1998l)) {
                return obj.equals(this);
            }
            C1998l c1998l = (C1998l) obj;
            int i = this.f4519l;
            int i2 = c1998l.f4519l;
            if (i == 0 || i2 == 0 || i == i2) {
                int iMopub = mopub();
                if (iMopub > c1998l.mopub()) {
                    int iMopub2 = mopub();
                    StringBuilder sb = new StringBuilder(String.valueOf(iMopub).length() + 18 + String.valueOf(iMopub2).length());
                    sb.append("Length too large: ");
                    sb.append(iMopub);
                    sb.append(iMopub2);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (iMopub > c1998l.mopub()) {
                    int iMopub3 = c1998l.mopub();
                    C11586l.crashlytics(String.valueOf(iMopub).length() + 27 + String.valueOf(iMopub3).length(), iMopub, iMopub3);
                    return false;
                }
                byte[] bArr = c1998l.f4518l;
                int i3 = 0;
                int i4 = 0;
                while (i3 < iMopub) {
                    if (this.f4518l[i3] == bArr[i4]) {
                        i3++;
                        i4++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f4519l;
        if (i != 0) {
            return i;
        }
        int iMopub = mopub();
        Charset charset = AbstractC11966l.yandex;
        int i2 = iMopub;
        for (int i3 = 0; i3 < iMopub; i3++) {
            i2 = (i2 * 31) + this.f4518l[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f4519l = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C7515l(this);
    }

    public int mopub() {
        return this.f4518l.length;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMopub = mopub();
        if (mopub() <= 50) {
            strConcat = AbstractC2219l.subs(this);
        } else {
            admob(mopub());
            strConcat = AbstractC2219l.subs(new C14193l(this.f4518l)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iMopub);
        sb.append(" contents=\"");
        return AbstractC0653l.ads(sb, strConcat, "\">");
    }
}
