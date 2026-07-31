package defpackage;

/* JADX INFO: renamed from: lَؑ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10012l extends AbstractC15901l implements InterfaceC10952l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f20408l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public int[] f20410l = null;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int[] f20409l = null;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int[] f20407l = null;

    public C10012l() {
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
    }

    @Override // defpackage.InterfaceC10952l
    public final String getAlgorithmName() {
        return "DESede";
    }

    @Override // defpackage.InterfaceC10952l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        if (!(interfaceC9719l instanceof C13886l)) {
            C8339l.metrica(AbstractC5020l.subscription("invalid parameter passed to DESede init - ", interfaceC9719l));
            return;
        }
        byte[] bArr = ((C13886l) interfaceC9719l).f27156l;
        if (bArr.length != 24 && bArr.length != 16) {
            C8339l.metrica("key size must be 16 or 24 bytes.");
            return;
        }
        this.f20408l = z;
        byte[] bArr2 = new byte[8];
        System.arraycopy(bArr, 0, bArr2, 0, 8);
        this.f20410l = purchase(z, bArr2);
        byte[] bArr3 = new byte[8];
        System.arraycopy(bArr, 8, bArr3, 0, 8);
        this.f20409l = purchase(!z, bArr3);
        if (bArr.length == 24) {
            byte[] bArr4 = new byte[8];
            System.arraycopy(bArr, 16, bArr4, 0, 8);
            this.f20407l = purchase(z, bArr4);
        } else {
            this.f20407l = this.f20410l;
        }
        if (interfaceC9719l instanceof EnumC2441l) {
            C8339l.metrica("params should not be CryptoServicePurpose");
        } else {
            ((C5911l) AbstractC8776l.purchase.get()).getClass();
        }
    }

    @Override // defpackage.InterfaceC10952l
    public final int license() {
        return 8;
    }

    @Override // defpackage.InterfaceC10952l
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        int[] iArr = this.f20410l;
        if (iArr == null) {
            C8339l.smaato("DESede engine not initialised");
            return 0;
        }
        if (i + 8 > bArr.length) {
            C10754l.ad("input buffer too short");
            return 0;
        }
        if (i2 + 8 > bArr2.length) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        byte[] bArr3 = new byte[8];
        if (this.f20408l) {
            loadAd(iArr, bArr, i, bArr3, 0);
            loadAd(this.f20409l, bArr3, 0, bArr3, 0);
            loadAd(this.f20407l, bArr3, 0, bArr2, i2);
            return 8;
        }
        loadAd(this.f20407l, bArr, i, bArr3, 0);
        loadAd(this.f20409l, bArr3, 0, bArr3, 0);
        loadAd(this.f20410l, bArr3, 0, bArr2, i2);
        return 8;
    }

    @Override // defpackage.InterfaceC10952l
    public final void reset() {
    }
}
