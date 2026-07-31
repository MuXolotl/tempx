package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lَۣ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18301l extends AbstractC7940l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f35788l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final byte[] f35789l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final byte[] f35790l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f35791l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f35792l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final byte[] f35793l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f35794l;

    public C18301l(C18260l c18260l, byte[] bArr, C13671l c13671l) {
        int i;
        char c;
        int i2;
        super((Object) c18260l, true);
        int i3 = c18260l.yandex;
        new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        int i4 = 96;
        if (i3 != 2) {
            i = 5;
            if (i3 == 3) {
                i2 = 6;
                i4 = 128;
            } else {
                if (i3 != 5) {
                    C8339l.metrica(AbstractC15560l.tapsense("The mode ", i3, "is not supported by Crystals Dilithium!"));
                    throw null;
                }
                i2 = 8;
                i = 7;
            }
            c = 0;
        } else {
            i = 4;
            c = 0;
            i2 = 4;
        }
        new C17951l(128);
        new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        if (c != 0 && c != 0) {
            C18073l.license("Wrong Dilithium Gamma1!");
            throw null;
        }
        this.f35788l = AbstractC14024l.vip(0, 32, bArr);
        this.f35792l = AbstractC14024l.vip(32, 64, bArr);
        this.f35791l = AbstractC14024l.vip(64, 128, bArr);
        int i5 = (i * i4) + 128;
        this.f35794l = AbstractC14024l.vip(128, i5, bArr);
        int i6 = (i4 * i2) + i5;
        this.f35789l = AbstractC14024l.vip(i5, i6, bArr);
        this.f35790l = AbstractC14024l.vip(i6, (i2 * 416) + i6, bArr);
        if (c13671l != null) {
            this.f35793l = AbstractC14024l.crashlytics(c13671l.f26696l);
        } else {
            this.f35793l = null;
        }
    }

    public final byte[] getEncoded() {
        return AbstractC14024l.isPro(new byte[][]{this.f35788l, this.f35792l, this.f35791l, this.f35794l, this.f35789l, this.f35790l});
    }

    public C18301l(C18260l c18260l, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        super((Object) c18260l, true);
        this.f35788l = AbstractC14024l.crashlytics(bArr);
        this.f35792l = AbstractC14024l.crashlytics(bArr2);
        this.f35791l = AbstractC14024l.crashlytics(bArr3);
        this.f35794l = AbstractC14024l.crashlytics(bArr4);
        this.f35789l = AbstractC14024l.crashlytics(bArr5);
        this.f35790l = AbstractC14024l.crashlytics(bArr6);
        this.f35793l = AbstractC14024l.crashlytics(bArr7);
    }
}
