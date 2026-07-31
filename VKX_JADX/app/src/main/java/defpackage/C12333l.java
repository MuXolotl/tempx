package defpackage;

/* JADX INFO: renamed from: lّؓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12333l implements InterfaceC16937l {
    public final byte[] crashlytics;
    public final byte[] loadAd;
    public final byte[] yandex;

    public C12333l(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            C8339l.metrica("IKM (input keying material) should not be null");
            throw null;
        }
        this.yandex = AbstractC14024l.crashlytics(bArr);
        if (bArr2 == null || bArr2.length == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = AbstractC14024l.crashlytics(bArr2);
        }
        if (bArr3 == null) {
            this.crashlytics = new byte[0];
        } else {
            this.crashlytics = AbstractC14024l.crashlytics(bArr3);
        }
    }
}
