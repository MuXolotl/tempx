package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٕؑٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C15379l extends AbstractC16071l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f30044l;

    public C15379l(byte[] bArr) {
        this.f31495l = 0;
        bArr.getClass();
        this.f30044l = bArr;
    }

    @Override // defpackage.AbstractC16071l
    public void admob(int i, byte[] bArr) {
        System.arraycopy(this.f30044l, 0, bArr, 0, i);
    }

    @Override // defpackage.AbstractC16071l
    public byte amazon(int i) {
        return this.f30044l[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC16071l) && size() == ((AbstractC16071l) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C15379l)) {
                return obj.equals(this);
            }
            C15379l c15379l = (C15379l) obj;
            int i = this.f31495l;
            int i2 = c15379l.f31495l;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > c15379l.size()) {
                    C18353l.loadAd(size, size());
                    return false;
                }
                if (size > c15379l.size()) {
                    StringBuilder sbSignature = AbstractC2812l.Signature("Ran off end of other: 0, ", size, ", ");
                    sbSignature.append(c15379l.size());
                    throw new IllegalArgumentException(sbSignature.toString());
                }
                byte[] bArr = c15379l.f30044l;
                int iFirebase = firebase() + size;
                int iFirebase2 = firebase();
                int iFirebase3 = c15379l.firebase();
                while (iFirebase2 < iFirebase) {
                    if (this.f30044l[iFirebase2] == bArr[iFirebase3]) {
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

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C7515l(this);
    }

    @Override // defpackage.AbstractC16071l
    public int size() {
        return this.f30044l.length;
    }

    public byte smaato(int i) {
        return this.f30044l[i];
    }
}
