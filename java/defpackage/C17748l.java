package defpackage;

/* JADX INFO: renamed from: lؘؚ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C17748l extends C10739l {

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public byte[] f34569l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final byte[] f34567l = {34, 47, 36, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final byte[] f34565l = {34, 47, 37, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final byte[] f34568l = {35, 47, 36, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final byte[] f34566l = {35, 47, 37, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};

    public static int metrica(byte b, byte b2, byte b3, byte b4) {
        return ((b & 255) << 23) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    @Override // defpackage.C10739l, defpackage.InterfaceC12774l
    public final String getAlgorithmName() {
        return "Zuc-256";
    }

    @Override // defpackage.C10739l, defpackage.InterfaceC11512l
    public final void loadAd(InterfaceC11512l interfaceC11512l) {
        super.loadAd(interfaceC11512l);
        this.f34569l = ((C17748l) interfaceC11512l).f34569l;
    }

    @Override // defpackage.C10739l
    public final int smaato() {
        return 625;
    }

    @Override // defpackage.C10739l
    public final void vip(int[] iArr, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32) {
            C8339l.metrica("A key of 32 bytes is needed");
            return;
        }
        if (bArr2 == null || bArr2.length != 25) {
            C8339l.metrica("An IV of 25 bytes is needed");
            return;
        }
        iArr[0] = metrica(bArr[0], this.f34569l[0], bArr[21], bArr[16]);
        iArr[1] = metrica(bArr[1], this.f34569l[1], bArr[22], bArr[17]);
        iArr[2] = metrica(bArr[2], this.f34569l[2], bArr[23], bArr[18]);
        iArr[3] = metrica(bArr[3], this.f34569l[3], bArr[24], bArr[19]);
        iArr[4] = metrica(bArr[4], this.f34569l[4], bArr[25], bArr[20]);
        iArr[5] = metrica(bArr2[0], (byte) (this.f34569l[5] | (bArr2[17] & 63)), bArr[5], bArr[26]);
        iArr[6] = metrica(bArr2[1], (byte) (this.f34569l[6] | (bArr2[18] & 63)), bArr[6], bArr[27]);
        iArr[7] = metrica(bArr2[10], (byte) (this.f34569l[7] | (bArr2[19] & 63)), bArr[7], bArr2[2]);
        iArr[8] = metrica(bArr[8], (byte) (this.f34569l[8] | (bArr2[20] & 63)), bArr2[3], bArr2[11]);
        iArr[9] = metrica(bArr[9], (byte) ((bArr2[21] & 63) | this.f34569l[9]), bArr2[12], bArr2[4]);
        iArr[10] = metrica(bArr2[5], (byte) (this.f34569l[10] | (bArr2[22] & 63)), bArr[10], bArr[28]);
        iArr[11] = metrica(bArr[11], (byte) (this.f34569l[11] | (bArr2[23] & 63)), bArr2[6], bArr2[13]);
        iArr[12] = metrica(bArr[12], (byte) (this.f34569l[12] | (bArr2[24] & 63)), bArr2[7], bArr2[14]);
        iArr[13] = metrica(bArr[13], this.f34569l[13], bArr2[15], bArr2[8]);
        iArr[14] = metrica(bArr[14], (byte) (this.f34569l[14] | ((bArr[31] >>> 4) & 15)), bArr2[16], bArr2[9]);
        iArr[15] = metrica(bArr[15], (byte) (this.f34569l[15] | (bArr[31] & 15)), bArr[30], bArr[29]);
    }

    @Override // defpackage.C10739l, defpackage.InterfaceC11512l
    public InterfaceC11512l yandex() {
        return new C17748l(this);
    }
}
