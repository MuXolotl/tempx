package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lؙۤۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6864l extends Cthrow {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Cthrow[] f14357l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f14358l;

    static {
        new C6864l(Cthrow.f36591l, null);
    }

    public C6864l(byte[] bArr, Cthrow[] cthrowArr) {
        super(bArr);
        this.f14357l = cthrowArr;
        this.f14358l = 1000;
    }

    public static byte[] applovin(Cthrow[] cthrowArr) {
        int length = cthrowArr.length;
        if (length == 0) {
            return Cthrow.f36591l;
        }
        if (length == 1) {
            return cthrowArr[0].f36593l;
        }
        int length2 = 0;
        for (Cthrow cthrow : cthrowArr) {
            length2 += cthrow.f36593l.length;
        }
        byte[] bArr = new byte[length2];
        int length3 = 0;
        for (Cthrow cthrow2 : cthrowArr) {
            byte[] bArr2 = cthrow2.f36593l;
            System.arraycopy(bArr2, 0, bArr, length3, bArr2.length);
            length3 += bArr2.length;
        }
        return bArr;
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        int iSignature = z ? 4 : 3;
        Cthrow[] cthrowArr = this.f14357l;
        if (cthrowArr != null) {
            for (Cthrow cthrow : cthrowArr) {
                iSignature += cthrow.Signature(true);
            }
            return iSignature;
        }
        byte[] bArr = this.f36593l;
        int length = bArr.length;
        int i = this.f14358l;
        int i2 = length / i;
        C11327l c11327l = C11327l.f22828l;
        int iM2216for = (C7972l.m2216for(i, true) * i2) + iSignature;
        int length2 = bArr.length - (i2 * i);
        return length2 > 0 ? C7972l.m2216for(length2, true) + iM2216for : iM2216for;
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return true;
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) throws IOException {
        c7972l.m2248try(36, z);
        c7972l.m2243super(128);
        Cthrow[] cthrowArr = this.f14357l;
        if (cthrowArr == null) {
            int i = 0;
            while (true) {
                byte[] bArr = this.f36593l;
                if (i >= bArr.length) {
                    break;
                }
                int iMin = Math.min(bArr.length - i, this.f14358l);
                C11327l c11327l = C11327l.f22828l;
                c7972l.m2248try(4, true);
                c7972l.m2220abstract(iMin);
                c7972l.m2232import(bArr, i, iMin);
                i += iMin;
            }
        } else {
            c7972l.mo2250while(cthrowArr);
        }
        c7972l.m2243super(0);
        c7972l.m2243super(0);
    }
}
