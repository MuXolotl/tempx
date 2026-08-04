package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lِٜؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11974l implements InterfaceC6152l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f23848l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cfor f23849l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C0655l f23850l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte[] f23851l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public byte[] f23852l;

    public C11974l(C0655l c0655l) {
        this.f23850l = c0655l;
    }

    @Override // defpackage.InterfaceC6152l
    public final void billing(InterfaceC16937l interfaceC16937l) {
        C6404l c6404l = (C6404l) interfaceC16937l;
        this.f23849l = c6404l.yandex;
        this.f23848l = c6404l.loadAd;
        this.f23852l = c6404l.crashlytics;
        this.f23851l = c6404l.amazon;
    }

    @Override // defpackage.InterfaceC6152l
    public final int purchase(int i, byte[] bArr) {
        C11974l c11974l = this;
        int i2 = 0;
        if (bArr.length - i < 0) {
            C18073l.ad("output buffer too small");
            return 0;
        }
        C0655l c0655l = c11974l.f23850l;
        c0655l.reset();
        if (i > 85899345900L) {
            C8339l.metrica("Output length too large");
            return 0;
        }
        byte[] bArr2 = new byte[4];
        C15529l c15529l = new C15529l(c11974l.f23849l, C11327l.applovin(bArr2));
        byte[] bArr3 = c11974l.f23851l;
        C11327l c11327lApplovin = bArr3 == null ? null : C11327l.applovin(bArr3);
        byte[] bArr4 = new byte[4];
        AbstractC10000l.isPro(c11974l.f23848l, 0, bArr4);
        C11327l c11327lApplovin2 = C11327l.applovin(bArr4);
        if (c11327lApplovin2 == null) {
            C6541l.subs("'suppPubInfo' cannot be null");
            return 0;
        }
        C16145l c16145l = new C16145l(0, c0655l);
        int i3 = i;
        int i4 = 0;
        int i5 = 0;
        while (i3 > 0) {
            byte[] bArr5 = c11974l.f23852l;
            c0655l.update(bArr5, i2, bArr5.length);
            i4++;
            try {
                AbstractC10000l.firebase(i4, bArr2);
                appmetrica appmetricaVar = new appmetrica(3, i2);
                appmetricaVar.purchase(c15529l);
                if (c11327lApplovin != null) {
                    appmetricaVar.purchase(new C9320l(true, i2, c11327lApplovin));
                }
                appmetricaVar.purchase(new C9320l(true, 2, c11327lApplovin2));
                C11138l c11138l = new C11138l(appmetricaVar);
                c11138l.f22357l = -1;
                c11138l.tapsense(c16145l, "DER");
                if (i3 < 20) {
                    byte[] bArr6 = new byte[20];
                    c0655l.doFinal(bArr6, 0);
                    System.arraycopy(bArr6, 0, bArr, i5, i3);
                    return i;
                }
                c0655l.doFinal(bArr, i5);
                i5 += 20;
                i3 -= 20;
                c11974l = this;
                i2 = 0;
            } catch (IOException e) {
                C8339l.metrica(AbstractC5020l.adcel(e, new StringBuilder("unable to encode parameter info: ")));
                return 0;
            }
        }
        return i;
    }
}
