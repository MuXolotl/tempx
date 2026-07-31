package defpackage;

/* JADX INFO: renamed from: lؗؓؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4604l extends C5394l implements InterfaceC17898l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4604l(int i) {
        super(i, EnumC2441l.f5219l);
        smaato(i);
    }

    public static void smaato(int i) {
        if (i == 224 || i == 256 || i == 384 || i == 512) {
            return;
        }
        C8339l.metrica(AbstractC15560l.tapsense("'bitLength' ", i, " not supported for SHA-3"));
    }

    @Override // defpackage.C5394l, defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        mopub(2, 2);
        return super.doFinal(bArr, i);
    }

    @Override // defpackage.C5394l, defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "SHA3-" + this.f11571l;
    }

    @Override // defpackage.InterfaceC11512l
    public final void loadAd(InterfaceC11512l interfaceC11512l) {
        admob((C4604l) interfaceC11512l);
    }

    @Override // defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C4604l(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4604l(int i, int i2) {
        super(i, EnumC2441l.f5220l);
        smaato(i);
    }
}
