package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: lؘٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13967l implements Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C13967l f27256l = new C13967l(new int[0]);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f27257l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int[] f27258l;

    public C13967l(int[] iArr) {
        int length = iArr.length;
        this.f27258l = iArr;
        this.f27257l = length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13967l) {
            C13967l c13967l = (C13967l) obj;
            int i = c13967l.f27257l;
            int i2 = this.f27257l;
            if (i2 == i) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (loadAd(i3) == c13967l.loadAd(i3)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f27257l; i2++) {
            i = (i * 31) + this.f27258l[i2];
        }
        return i;
    }

    public final int loadAd(int i) {
        AbstractC12442l.smaato(i, this.f27257l);
        return this.f27258l[i];
    }

    public final String toString() {
        int i = this.f27257l;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.f27258l;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0015 A[RETURN] */
    public final boolean yandex(int i) {
        int i2 = 0;
        while (i2 < this.f27257l) {
            if (this.f27258l[i2] == i) {
                if (i2 >= 0) {
                    return true;
                }
                return false;
            }
            i2++;
        }
        i2 = -1;
        if (i2 >= 0) {
            return true;
        }
        return false;
    }
}
