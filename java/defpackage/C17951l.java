package defpackage;

/* JADX INFO: renamed from: lٕ٘ۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C17951l extends C5394l implements InterfaceC0363l, InterfaceC17898l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17951l(int i) {
        super(i, EnumC2441l.f5219l);
        smaato(i);
    }

    public static void smaato(int i) {
        if (i == 128 || i == 256) {
            return;
        }
        C8339l.metrica(AbstractC15560l.tapsense("'bitStrength' ", i, " not supported for SHAKE"));
    }

    @Override // defpackage.InterfaceC0363l
    public final int crashlytics(int i, int i2, byte[] bArr) {
        int iRemoteconfig = remoteconfig(i, i2, bArr);
        reset();
        return iRemoteconfig;
    }

    @Override // defpackage.C5394l, defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        return crashlytics(i, this.f11571l / 4, bArr);
    }

    @Override // defpackage.C5394l, defpackage.InterfaceC16922l
    public String getAlgorithmName() {
        return "SHAKE" + this.f11571l;
    }

    @Override // defpackage.C5394l, defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return this.f11571l / 4;
    }

    public void loadAd(InterfaceC11512l interfaceC11512l) {
        admob((C17951l) interfaceC11512l);
    }

    public int remoteconfig(int i, int i2, byte[] bArr) {
        if (!this.f11566l) {
            mopub(15, 4);
        }
        firebase(((long) i2) * 8, bArr, i);
        return i2;
    }

    @Override // defpackage.C5394l
    public final InterfaceC15464l subs() {
        return new C18176l(getAlgorithmName(), 3);
    }

    public InterfaceC11512l yandex() {
        return new C17951l(this);
    }
}
