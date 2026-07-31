package defpackage;

import java.util.Hashtable;

/* JADX INFO: renamed from: lٌٖٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16544l implements InterfaceC4190l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final byte[] f32484l = {1};

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final Hashtable f32485l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public byte[] f32486l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f32487l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public byte[] f32488l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C17711l f32489l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC13380l f32490l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f32491l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f32492l;

    static {
        Hashtable hashtable = new Hashtable();
        f32485l = hashtable;
        hashtable.put("SHA-1", 440);
        hashtable.put("SHA-224", 440);
        hashtable.put("SHA-256", 440);
        hashtable.put("SHA-512/256", 440);
        hashtable.put("SHA-512/224", 440);
        hashtable.put("SHA-384", 888);
        hashtable.put("SHA-512", 888);
    }

    public static void yandex(byte[] bArr, byte[] bArr2) {
        int i = 0;
        for (int i2 = 1; i2 <= bArr2.length; i2++) {
            int i3 = (bArr[bArr.length - i2] & 255) + (bArr2[bArr2.length - i2] & 255) + i;
            i = i3 > 255 ? 1 : 0;
            bArr[bArr.length - i2] = (byte) i3;
        }
        for (int length = bArr2.length + 1; length <= bArr.length; length++) {
            int i4 = (bArr[bArr.length - length] & 255) + i;
            i = i4 > 255 ? 1 : 0;
            bArr[bArr.length - length] = (byte) i4;
        }
    }

    @Override // defpackage.InterfaceC4190l
    public final int amazon(boolean z, byte[] bArr) {
        C17711l c17711l = this.f32489l;
        int length = bArr.length * 8;
        if (length > 262144) {
            C8339l.metrica("Number of bits per request limited to 262144");
            return 0;
        }
        if (this.f32491l > 140737488355328L) {
            return -1;
        }
        if (z) {
            purchase(null);
        }
        byte[] bArr2 = this.f32488l;
        c17711l.getClass();
        int i = length / 8;
        int i2 = i / 64;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        byte[] bArr4 = new byte[i];
        byte[] bArr5 = new byte[64];
        for (int i3 = 0; i3 <= i2; i3++) {
            c17711l.update(bArr3, 0, length2);
            c17711l.doFinal(bArr5, 0);
            int i4 = i3 * 64;
            int i5 = i - i4;
            if (i5 > 64) {
                i5 = 64;
            }
            System.arraycopy(bArr5, 0, bArr4, i4, i5);
            yandex(bArr3, f32484l);
        }
        byte[] bArr6 = this.f32488l;
        int length3 = bArr6.length + 1;
        byte[] bArr7 = new byte[length3];
        System.arraycopy(bArr6, 0, bArr7, 1, bArr6.length);
        bArr7[0] = 3;
        c17711l.getClass();
        byte[] bArr8 = new byte[64];
        c17711l.update(bArr7, 0, length3);
        c17711l.doFinal(bArr8, 0);
        yandex(this.f32488l, bArr8);
        yandex(this.f32488l, this.f32486l);
        long j = this.f32491l;
        yandex(this.f32488l, new byte[]{(byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) j});
        this.f32491l++;
        System.arraycopy(bArr4, 0, bArr, 0, bArr.length);
        return length;
    }

    @Override // defpackage.InterfaceC4190l
    public final void purchase(byte[] bArr) {
        byte[] entropy = this.f32490l.getEntropy();
        if (entropy.length < (this.f32492l + 7) / 8) {
            C8339l.smaato("Insufficient entropy provided by entropy source");
            return;
        }
        byte[] bArrSubs = AbstractC14024l.subs(f32484l, this.f32488l, entropy, bArr);
        C17711l c17711l = this.f32489l;
        int i = this.f32487l;
        byte[] bArrYandex = AbstractC18559l.yandex(c17711l, bArrSubs, i);
        this.f32488l = bArrYandex;
        byte[] bArr2 = new byte[bArrYandex.length + 1];
        bArr2[0] = 0;
        System.arraycopy(bArrYandex, 0, bArr2, 1, bArrYandex.length);
        this.f32486l = AbstractC18559l.yandex(c17711l, bArr2, i);
        this.f32491l = 1L;
    }
}
