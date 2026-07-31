package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lَْؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10044l implements InterfaceC3340l {
    public final C4147l loadAd;
    public final InterfaceC3340l yandex;

    public C10044l(InterfaceC3340l interfaceC3340l, C4147l c4147l) {
        this.yandex = interfaceC3340l;
        this.loadAd = c4147l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10044l)) {
            return false;
        }
        C10044l c10044l = (C10044l) obj;
        return this.yandex.equals(c10044l.yandex) && this.loadAd.equals(c10044l.loadAd);
    }

    public final int hashCode() {
        int i;
        int iHashCode = this.yandex.hashCode();
        int[] iArr = this.loadAd.yandex;
        if (iArr == null) {
            i = 0;
        } else {
            int length = iArr.length;
            int i2 = length + 1;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i2 = (i2 * 257) ^ iArr[length];
            }
            i = i2;
        }
        return Integer.rotateLeft(i, 16) ^ iHashCode;
    }

    @Override // defpackage.InterfaceC3340l
    public final BigInteger loadAd() {
        return this.yandex.loadAd();
    }

    @Override // defpackage.InterfaceC3340l
    public final int yandex() {
        int iYandex = this.yandex.yandex();
        int[] iArr = this.loadAd.yandex;
        return iArr[iArr.length - 1] * iYandex;
    }
}
