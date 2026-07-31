package defpackage;

import java.security.SecureRandom;

/* JADX INFO: renamed from: lٔۗۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15107l implements InterfaceC8145l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C18097l f29636l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public SecureRandom f29637l;

    @Override // defpackage.InterfaceC8145l
    public final C18595l purchase() {
        byte[] bArr = new byte[this.f29636l.loadAd.crashlytics()];
        this.f29637l.nextBytes(bArr);
        byte[] bArr2 = new byte[this.f29636l.loadAd.crashlytics()];
        this.f29637l.nextBytes(bArr2);
        byte[] bArr3 = new byte[this.f29636l.loadAd.crashlytics()];
        this.f29637l.nextBytes(bArr3);
        C18097l c18097l = this.f29636l;
        AbstractC6716l abstractC6716lLoadAd = c18097l.loadAd.loadAd();
        abstractC6716lLoadAd.mopub(bArr3);
        return new C18595l(new C9314l(c18097l, AbstractC14024l.mopub(bArr3, (byte[]) new C11644l(abstractC6716lLoadAd, bArr, bArr3).f23362l)), new C1180l(c18097l, bArr, bArr2, bArr3, (byte[]) new C11644l(abstractC6716lLoadAd, bArr, bArr3).f23362l), 7);
    }

    @Override // defpackage.InterfaceC8145l
    /* JADX INFO: renamed from: throws */
    public final void mo274throws(C14785l c14785l) {
        this.f29637l = (SecureRandom) c14785l.f28907l;
        this.f29636l = ((C16731l) c14785l).f32743l;
    }
}
