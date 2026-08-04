package defpackage;

/* JADX INFO: renamed from: lۣٕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4472l extends Cpackage {
    @Override // defpackage.Cpackage, defpackage.Ccase
    public final int Signature(boolean z) {
        return C7972l.m2216for(m1551private().length, z);
    }

    @Override // defpackage.Cpackage, defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) {
        c7972l.m2240public(24, z, m1551private());
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final byte[] m1551private() {
        byte[] bArr = this.f36536l;
        if (bArr[bArr.length - 1] == 90) {
            if (!m4577synchronized()) {
                byte[] bArr2 = new byte[bArr.length + 4];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length - 1);
                System.arraycopy(AbstractC9008l.crashlytics("0000Z"), 0, bArr2, bArr.length - 1, 5);
                return bArr2;
            }
            if (!m4576strictfp()) {
                byte[] bArr3 = new byte[bArr.length + 2];
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length - 1);
                System.arraycopy(AbstractC9008l.crashlytics("00Z"), 0, bArr3, bArr.length - 1, 3);
                return bArr3;
            }
            if (m4575package()) {
                int length = bArr.length - 2;
                while (length > 0 && bArr[length] == 48) {
                    length--;
                }
                if (bArr[length] == 46) {
                    byte[] bArr4 = new byte[length + 1];
                    System.arraycopy(bArr, 0, bArr4, 0, length);
                    bArr4[length] = 90;
                    return bArr4;
                }
                byte[] bArr5 = new byte[length + 2];
                int i = length + 1;
                System.arraycopy(bArr, 0, bArr5, 0, i);
                bArr5[i] = 90;
                return bArr5;
            }
        }
        return bArr;
    }

    @Override // defpackage.Cpackage, defpackage.Ccase
    public final Ccase isVip() {
        return this;
    }

    @Override // defpackage.Ccase
    public final Ccase signatures() {
        return this;
    }
}
