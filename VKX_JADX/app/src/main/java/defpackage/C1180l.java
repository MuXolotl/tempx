package defpackage;

/* JADX INFO: renamed from: lؙٜؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1180l extends AbstractC7940l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C1561l f3172l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C10237l f3173l;

    public C1180l(C18097l c18097l, byte[] bArr) {
        super((Object) c18097l, true);
        int iCrashlytics = c18097l.loadAd.crashlytics();
        int i = iCrashlytics * 4;
        if (bArr.length != i) {
            C8339l.metrica("private key encoding does not match parameters");
            throw null;
        }
        int i2 = iCrashlytics * 2;
        this.f3172l = new C1561l(AbstractC14024l.vip(0, iCrashlytics, bArr), AbstractC14024l.vip(iCrashlytics, i2, bArr));
        int i3 = iCrashlytics * 3;
        this.f3173l = new C10237l(AbstractC14024l.vip(i2, i3, bArr), AbstractC14024l.vip(i3, i, bArr));
    }

    public final byte[] getEncoded() {
        C1561l c1561l = this.f3172l;
        byte[] bArr = c1561l.yandex;
        byte[] bArr2 = c1561l.loadAd;
        C10237l c10237l = this.f3173l;
        return AbstractC14024l.isPro(new byte[][]{bArr, bArr2, c10237l.yandex, c10237l.loadAd});
    }

    public C1180l(C18097l c18097l, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super((Object) c18097l, true);
        this.f3172l = new C1561l(bArr, bArr2);
        this.f3173l = new C10237l(bArr3, bArr4);
    }
}
