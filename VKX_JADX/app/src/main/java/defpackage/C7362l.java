package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: lؚٛ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C7362l extends AbstractC7735l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f15270l = 0;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f15271l;

    public C7362l(byte[] bArr) {
        this.f15271l = bArr;
    }

    @Override // defpackage.AbstractC7735l
    public void admob(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f15271l, i, bArr, i2, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6[r8] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r6[r8] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        if (r6[r7] > (-65)) goto L59;
     */
    @Override // defpackage.AbstractC7735l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int ads(int r7, int r8, int r9) {
        /*
            r6 = this;
            int r9 = r9 + r8
            byte[] r6 = r6.f15271l
            if (r7 == 0) goto L95
            if (r8 < r9) goto L8
            return r7
        L8:
            byte r0 = (byte) r7
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L1f
            r7 = -62
            if (r0 < r7) goto L94
            int r7 = r8 + 1
            r8 = r6[r8]
            if (r8 <= r3) goto L1c
            goto L94
        L1c:
            r8 = r7
            goto L95
        L1f:
            r4 = -16
            if (r0 >= r4) goto L4c
            int r7 = r7 >> 8
            int r7 = ~r7
            byte r7 = (byte) r7
            if (r7 != 0) goto L37
            int r7 = r8 + 1
            r8 = r6[r8]
            if (r7 < r9) goto L34
            int r6 = defpackage.AbstractC6159l.purchase(r0, r8)
            return r6
        L34:
            r5 = r8
            r8 = r7
            r7 = r5
        L37:
            if (r7 > r3) goto L94
            r4 = -96
            if (r0 != r1) goto L3f
            if (r7 < r4) goto L94
        L3f:
            r1 = -19
            if (r0 != r1) goto L45
            if (r7 >= r4) goto L94
        L45:
            int r7 = r8 + 1
            r8 = r6[r8]
            if (r8 <= r3) goto L1c
            goto L94
        L4c:
            int r1 = r7 >> 8
            int r1 = ~r1
            byte r1 = (byte) r1
            if (r1 != 0) goto L5f
            int r7 = r8 + 1
            r1 = r6[r8]
            if (r7 < r9) goto L5d
            int r6 = defpackage.AbstractC6159l.purchase(r0, r1)
            return r6
        L5d:
            r8 = 0
            goto L65
        L5f:
            int r7 = r7 >> 16
            byte r7 = (byte) r7
            r5 = r8
            r8 = r7
            r7 = r5
        L65:
            if (r8 != 0) goto L81
            int r8 = r7 + 1
            r7 = r6[r7]
            if (r8 < r9) goto L7e
            r6 = -12
            if (r0 > r6) goto L7d
            if (r1 > r3) goto L7d
            if (r7 <= r3) goto L76
            goto L7d
        L76:
            int r6 = r1 << 8
            r6 = r6 ^ r0
            int r7 = r7 << 16
            r6 = r6 ^ r7
            return r6
        L7d:
            return r2
        L7e:
            r5 = r8
            r8 = r7
            r7 = r5
        L81:
            if (r1 > r3) goto L94
            int r0 = r0 << 28
            int r1 = r1 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L94
            if (r8 > r3) goto L94
            int r8 = r7 + 1
            r7 = r6[r7]
            if (r7 <= r3) goto L95
        L94:
            return r2
        L95:
            int r6 = defpackage.AbstractC6159l.mopub(r8, r9, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7362l.ads(int, int, int):int");
    }

    @Override // defpackage.AbstractC7735l
    public final void advert(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f15271l, i, i2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7735l) || size() != ((AbstractC7735l) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C7362l) {
            return isVip((C7362l) obj, 0, size());
        }
        if (obj instanceof C8710l) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        C8339l.metrica(AbstractC0653l.ads(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
        return false;
    }

    @Override // defpackage.AbstractC7735l
    public final int firebase() {
        return 0;
    }

    public final int hashCode() {
        int iMetrica = this.f15270l;
        if (iMetrica == 0) {
            int size = size();
            iMetrica = metrica(size, 0, size);
            if (iMetrica == 0) {
                iMetrica = 1;
            }
            this.f15270l = iMetrica;
        }
        return iMetrica;
    }

    public final boolean isVip(C7362l c7362l, int i, int i2) {
        byte[] bArr = c7362l.f15271l;
        int length = bArr.length;
        byte[] bArr2 = this.f15271l;
        if (i2 > length) {
            int length2 = bArr2.length;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i + i2 <= bArr.length) {
            int i3 = 0;
            while (i3 < i2) {
                if (bArr2[i3] != bArr[i]) {
                    return false;
                }
                i3++;
                i++;
            }
            return true;
        }
        int length3 = bArr.length;
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("Ran off end of other: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        C8339l.metrica(AbstractC9361l.Signature(length3, ", ", sb2));
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C7515l(this);
    }

    @Override // defpackage.AbstractC7735l
    public final int metrica(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.f15271l[i4];
        }
        return i;
    }

    @Override // defpackage.AbstractC7735l
    public final String pro() {
        byte[] bArr = this.f15271l;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // defpackage.AbstractC7735l
    public final boolean remoteconfig() {
        byte[] bArr = this.f15271l;
        return AbstractC6159l.mopub(0, bArr.length, bArr) == 0;
    }

    @Override // defpackage.AbstractC7735l
    public int size() {
        return this.f15271l.length;
    }

    @Override // defpackage.AbstractC7735l
    public final boolean smaato() {
        return true;
    }

    @Override // defpackage.AbstractC7735l
    public final int tapsense() {
        return this.f15270l;
    }
}
