package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: lِؔ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2561l implements InterfaceC10634l {
    public static final byte[] billing = new byte[0];
    public final InterfaceC3881l amazon;
    public final C10828l crashlytics;
    public final InterfaceC6211l loadAd;
    public final byte[] purchase;
    public final byte[] yandex;

    public C2561l(C0346l c0346l, InterfaceC6211l interfaceC6211l, C10828l c10828l, InterfaceC3881l interfaceC3881l, C0346l c0346l2) {
        this.yandex = c0346l.loadAd();
        this.loadAd = interfaceC6211l;
        this.crashlytics = c10828l;
        this.amazon = interfaceC3881l;
        this.purchase = c0346l2.loadAd();
    }

    @Override // defpackage.InterfaceC10634l
    public final byte[] yandex(byte[] bArr) throws GeneralSecurityException {
        InterfaceC6211l interfaceC6211l = this.loadAd;
        C10758l c10758lLoadAd = interfaceC6211l.loadAd(this.yandex);
        byte[] bArr2 = c10758lLoadAd.loadAd;
        byte[] bArr3 = c10758lLoadAd.yandex;
        C1424l c1424lM903volatile = C1424l.m903volatile(AbstractC2383l.yandex, bArr2, bArr3, interfaceC6211l, this.crashlytics, this.amazon, new byte[0]);
        byte[] bArr4 = (byte[]) c1424lM903volatile.f3604l;
        byte[] bArr5 = this.purchase;
        int length = bArr5.length + bArr4.length;
        byte[] bArrMopub = ((InterfaceC3881l) c1424lM903volatile.f3603l).mopub((byte[]) c1424lM903volatile.f3601l, c1424lM903volatile.m959synchronized(), bArr, length, billing);
        System.arraycopy(bArr5, 0, bArrMopub, 0, bArr5.length);
        System.arraycopy(bArr4, 0, bArrMopub, bArr5.length, bArr4.length);
        return bArrMopub;
    }
}
