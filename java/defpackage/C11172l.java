package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: lُْٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11172l extends Ccase implements Cdefault {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final ad f22460l = new ad(0, C11172l.class);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final char[] f22461l;

    public C11172l(byte[] bArr) {
        if (bArr == null) {
            C6541l.subs("'string' cannot be null");
            throw null;
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            C8339l.metrica("malformed BMPString encoding encountered");
            throw null;
        }
        int i = length / 2;
        char[] cArr = new char[i];
        for (int i2 = 0; i2 != i; i2++) {
            int i3 = i2 * 2;
            cArr[i2] = (char) ((bArr[i3 + 1] & 255) | (bArr[i3] << 8));
        }
        this.f22461l = cArr;
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return C7972l.m2216for(this.f22461l.length * 2, z);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return false;
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        char[] cArr = this.f22461l;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) throws IOException {
        char[] cArr = this.f22461l;
        int length = cArr.length;
        c7972l.m2248try(30, z);
        c7972l.m2220abstract(length * 2);
        byte[] bArr = new byte[8];
        int i = length & (-4);
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            char c2 = cArr[i2 + 1];
            char c3 = cArr[i2 + 2];
            char c4 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            c7972l.m2232import(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c5 = cArr[i2];
                i2++;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (c5 >> '\b');
                i3 += 2;
                bArr[i4] = (byte) c5;
            } while (i2 < length);
            c7972l.m2232import(bArr, 0, i3);
        }
    }

    @Override // defpackage.Cdefault
    public final String mopub() {
        return new String(this.f22461l);
    }

    public final String toString() {
        return mopub();
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (ccase instanceof C11172l) {
            return Arrays.equals(this.f22461l, ((C11172l) ccase).f22461l);
        }
        return false;
    }

    public C11172l(String str) {
        if (str != null) {
            this.f22461l = str.toCharArray();
        } else {
            C6541l.subs("'string' cannot be null");
            throw null;
        }
    }

    public C11172l(char[] cArr) {
        this.f22461l = cArr;
    }
}
