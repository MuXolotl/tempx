package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lؙؕۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3241l extends advert {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f6934l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final advert[] f6935l;

    public C3241l(advert[] advertVarArr) {
        super(m1302package(advertVarArr));
        this.f6935l = advertVarArr;
        this.f6934l = 1000;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static byte[] m1302package(advert[] advertVarArr) {
        int length = advertVarArr.length;
        if (length == 0) {
            return advert.f8l;
        }
        if (length == 1) {
            return advertVarArr[0].f11l;
        }
        int i = length - 1;
        int length2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr = advertVarArr[i2].f11l;
            if (bArr[0] != 0) {
                C8339l.metrica("only the last nested bitstring can have padding");
                return null;
            }
            length2 += bArr.length - 1;
        }
        byte[] bArr2 = advertVarArr[i].f11l;
        byte b = bArr2[0];
        byte[] bArr3 = new byte[length2 + bArr2.length];
        bArr3[0] = b;
        int i3 = 1;
        for (advert advertVar : advertVarArr) {
            byte[] bArr4 = advertVar.f11l;
            int length3 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i3, length3);
            i3 += length3;
        }
        return bArr3;
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        boolean zAds = ads();
        byte[] bArr = this.f11l;
        if (!zAds) {
            return C7972l.m2216for(bArr.length, z);
        }
        int iSignature = z ? 4 : 3;
        advert[] advertVarArr = this.f6935l;
        if (advertVarArr != null) {
            for (advert advertVar : advertVarArr) {
                iSignature += advertVar.Signature(true);
            }
            return iSignature;
        }
        if (bArr.length < 2) {
            return iSignature;
        }
        int length = bArr.length - 2;
        int i = this.f6934l;
        int i2 = i - 1;
        int i3 = length / i2;
        return C7972l.m2216for(bArr.length - (i2 * i3), true) + (C7972l.m2216for(i, true) * i3) + iSignature;
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return this.f6935l != null || this.f11l.length > this.f6934l;
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) throws IOException {
        boolean zAds = ads();
        byte[] bArr = this.f11l;
        if (!zAds) {
            int length = bArr.length;
            c7972l.m2248try(3, z);
            c7972l.m2220abstract(length);
            c7972l.m2232import(bArr, 0, length);
            return;
        }
        c7972l.m2248try(35, z);
        c7972l.m2243super(128);
        advert[] advertVarArr = this.f6935l;
        if (advertVarArr != null) {
            c7972l.mo2250while(advertVarArr);
        } else if (bArr.length >= 2) {
            byte b = bArr[0];
            int length2 = bArr.length;
            int i = length2 - 1;
            int i2 = this.f6934l;
            int i3 = i2 - 1;
            while (i > i3) {
                c7972l.m2243super(3);
                c7972l.m2220abstract(i2);
                c7972l.m2243super(0);
                c7972l.m2232import(bArr, length2 - i, i3);
                i -= i3;
            }
            c7972l.m2243super(3);
            c7972l.m2220abstract(i + 1);
            c7972l.m2243super(b);
            c7972l.m2232import(bArr, length2 - i, i);
        }
        c7972l.m2243super(0);
        c7972l.m2243super(0);
    }

    public C3241l(byte[] bArr, int i) {
        super(bArr, i);
        this.f6935l = null;
        this.f6934l = 1000;
    }
}
