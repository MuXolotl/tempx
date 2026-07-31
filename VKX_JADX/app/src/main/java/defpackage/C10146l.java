package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lَؚٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10146l extends AbstractC7940l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f20656l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final byte[] f20657l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final byte[] f20658l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f20659l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f20660l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int f20661l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f20662l;

    public C10146l(C18493l c18493l, byte[] bArr, C1658l c1658l) {
        super((Object) c18493l, true);
        C13409l c13409lCrashlytics = C13409l.crashlytics(c18493l);
        if (bArr.length == 64) {
            byte[][] bArrLoadAd = c13409lCrashlytics.loadAd(AbstractC14024l.vip(0, 32, bArr), AbstractC14024l.vip(32, bArr.length, bArr));
            this.f20656l = bArrLoadAd[2];
            this.f20660l = bArrLoadAd[3];
            this.f20659l = bArrLoadAd[4];
            this.f20662l = bArrLoadAd[0];
            this.f20657l = bArrLoadAd[1];
            this.f20658l = bArrLoadAd[5];
        } else {
            int i = c13409lCrashlytics.admob;
            int i2 = c13409lCrashlytics.mopub;
            this.f20656l = AbstractC14024l.vip(0, i, bArr);
            int i3 = c13409lCrashlytics.admob;
            this.f20662l = AbstractC14024l.vip(i3, (i3 + i2) - 32, bArr);
            int i4 = (i2 - 32) + i3;
            int i5 = i4 + 32;
            this.f20657l = AbstractC14024l.vip(i4, i5, bArr);
            int i6 = i4 + 64;
            this.f20660l = AbstractC14024l.vip(i5, i6, bArr);
            this.f20659l = AbstractC14024l.vip(i6, i4 + 96, bArr);
            this.f20658l = null;
        }
        billing();
        if (c1658l == null || (AbstractC14024l.smaato(this.f20662l, c1658l.f4002l) && AbstractC14024l.smaato(this.f20657l, c1658l.f4003l))) {
            this.f20661l = this.f20658l != null ? 0 : 2;
        } else {
            C8339l.metrica("passed in public key does not match private values");
            throw null;
        }
    }

    public final void billing() {
        C13409l c13409lCrashlytics = C13409l.crashlytics((C18493l) this.f16541l);
        byte[] encoded = getEncoded();
        int i = c13409lCrashlytics.loadAd;
        int i2 = i * 384;
        int i3 = i * 768;
        if (i3 + 96 != encoded.length) {
            C8339l.metrica("'encoding' has invalid length");
            return;
        }
        byte[] bArr = new byte[32];
        C4604l c4604l = new C4604l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        c4604l.billing(i2, i2 + 32, encoded);
        c4604l.doFinal(bArr, 0);
        if (AbstractC14024l.firebase(bArr, 32, 0, encoded, i3 + 32)) {
            return;
        }
        C8339l.metrica("'encoding' fails hash check");
    }

    public final byte[] getEncoded() {
        return AbstractC14024l.isPro(new byte[][]{this.f20656l, this.f20662l, this.f20657l, this.f20660l, this.f20659l});
    }

    public final C10146l mopub(int i) {
        if (this.f20661l == i) {
            return this;
        }
        if (i == 0 || i == 1) {
            if (this.f20658l == null) {
                C8339l.smaato("no seed available");
                return null;
            }
        } else if (i != 2) {
            C8339l.metrica("unknown format");
            return null;
        }
        return new C10146l(this, i);
    }

    public C10146l(C18493l c18493l, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        super((Object) c18493l, true);
        this.f20656l = AbstractC14024l.crashlytics(bArr);
        this.f20660l = AbstractC14024l.crashlytics(bArr2);
        this.f20659l = AbstractC14024l.crashlytics(bArr3);
        this.f20662l = AbstractC14024l.crashlytics(bArr4);
        this.f20657l = AbstractC14024l.crashlytics(bArr5);
        this.f20658l = AbstractC14024l.crashlytics(bArr6);
        this.f20661l = 0;
        billing();
    }

    public C10146l(C10146l c10146l, int i) {
        super(c10146l.f16541l, true);
        this.f20656l = c10146l.f20656l;
        this.f20662l = c10146l.f20662l;
        this.f20657l = c10146l.f20657l;
        this.f20660l = c10146l.f20660l;
        this.f20659l = c10146l.f20659l;
        this.f20658l = c10146l.f20658l;
        this.f20661l = i;
        billing();
    }
}
