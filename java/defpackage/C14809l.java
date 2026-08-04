package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lَٔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C14809l extends AbstractC15257l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f28972l;

    public C14809l(byte[] bArr) {
        this.f29848l = 0;
        bArr.getClass();
        this.f28972l = bArr;
    }

    @Override // defpackage.AbstractC15257l
    public void admob(int i, byte[] bArr) {
        System.arraycopy(this.f28972l, 0, bArr, 0, i);
    }

    @Override // defpackage.AbstractC15257l
    public byte amazon(int i) {
        return this.f28972l[i];
    }

    @Override // defpackage.AbstractC15257l
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC15257l) && size() == ((AbstractC15257l) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C14809l)) {
                return obj.equals(this);
            }
            C14809l c14809l = (C14809l) obj;
            int i = this.f29848l;
            int i2 = c14809l.f29848l;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > c14809l.size()) {
                    C18353l.loadAd(size, size());
                    return false;
                }
                if (size > c14809l.size()) {
                    C8339l.metrica(AbstractC12589l.premium(size, c14809l.size(), "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = c14809l.f28972l;
                int iSmaato = smaato() + size;
                int iSmaato2 = smaato();
                int iSmaato3 = c14809l.smaato();
                while (iSmaato2 < iSmaato) {
                    if (this.f28972l[iSmaato2] == bArr[iSmaato3]) {
                        iSmaato2++;
                        iSmaato3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C7515l(this);
    }

    public byte remoteconfig(int i) {
        return this.f28972l[i];
    }

    @Override // defpackage.AbstractC15257l
    public int size() {
        return this.f28972l.length;
    }

    public int smaato() {
        return 0;
    }
}
