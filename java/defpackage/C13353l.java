package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lْٓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C13353l extends advert {
    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return C7972l.m2216for(this.f11l.length, z);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return false;
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) throws IOException {
        byte[] bArr = this.f11l;
        int i = bArr[0] & 255;
        int length = bArr.length;
        int i2 = length - 1;
        byte b = bArr[i2];
        byte b2 = (byte) ((255 << i) & b);
        if (b == b2) {
            c7972l.m2240public(3, z, bArr);
            return;
        }
        c7972l.m2248try(3, z);
        c7972l.m2220abstract(length);
        c7972l.m2232import(bArr, 0, i2);
        c7972l.m2243super(b2);
    }

    @Override // defpackage.advert, defpackage.Ccase
    public final Ccase isVip() {
        return this;
    }

    @Override // defpackage.advert, defpackage.Ccase
    public final Ccase signatures() {
        return this;
    }
}
