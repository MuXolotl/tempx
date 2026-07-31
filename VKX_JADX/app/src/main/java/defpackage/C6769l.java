package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؙۣۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6769l extends OutputStream {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final byte[] f14184l = new byte[0];

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f14185l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f14188l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f14187l = 128;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayList f14186l = new ArrayList();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public byte[] f14189l = new byte[128];

    public final void billing() {
        int i = this.f14188l;
        byte[] bArr = this.f14189l;
        int length = bArr.length;
        ArrayList arrayList = this.f14186l;
        if (i >= length) {
            arrayList.add(new C7362l(this.f14189l));
            this.f14189l = f14184l;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            arrayList.add(new C7362l(bArr2));
        }
        this.f14185l += this.f14188l;
        this.f14188l = 0;
    }

    public final synchronized AbstractC7735l mopub() {
        ArrayList arrayList;
        billing();
        arrayList = this.f14186l;
        if (!(arrayList != null)) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((AbstractC7735l) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? AbstractC7735l.f16231l : AbstractC7735l.amazon(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.f14185l + this.f14188l;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        try {
            byte[] bArr2 = this.f14189l;
            int length = bArr2.length;
            int i3 = this.f14188l;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f14188l += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                yandex(i4);
                System.arraycopy(bArr, i + length2, this.f14189l, 0, i4);
                this.f14188l = i4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void yandex(int i) {
        this.f14186l.add(new C7362l(this.f14189l));
        int length = this.f14185l + this.f14189l.length;
        this.f14185l = length;
        this.f14189l = new byte[Math.max(this.f14187l, Math.max(i, length >>> 1))];
        this.f14188l = 0;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.f14188l == this.f14189l.length) {
                yandex(1);
            }
            byte[] bArr = this.f14189l;
            int i2 = this.f14188l;
            this.f14188l = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }
}
