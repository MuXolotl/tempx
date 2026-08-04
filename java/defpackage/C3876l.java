package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: renamed from: lؖؓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3876l implements InterfaceC11416l {
    public static final byte[] mopub = new byte[0];
    public final InterfaceC3881l amazon;
    public final byte[] billing;
    public final C10828l crashlytics;
    public final InterfaceC6211l loadAd;
    public final int purchase;
    public final C18595l yandex;

    public C3876l(C18595l c18595l, InterfaceC6211l interfaceC6211l, C10828l c10828l, InterfaceC3881l interfaceC3881l, int i, C0346l c0346l) {
        this.yandex = c18595l;
        this.loadAd = interfaceC6211l;
        this.crashlytics = c10828l;
        this.amazon = interfaceC3881l;
        this.purchase = i;
        this.billing = c0346l.loadAd();
    }

    @Override // defpackage.InterfaceC11416l
    public final byte[] yandex(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.billing;
        int length = this.purchase + bArr2.length;
        if (bArr.length < length) {
            C18262l.ads("Ciphertext is too short.");
            return null;
        }
        if (!AbstractC0647l.yandex(bArr2, bArr)) {
            C18262l.ads("Invalid ciphertext (output prefix mismatch)");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr2.length, length);
        InterfaceC6211l interfaceC6211l = this.loadAd;
        byte[] bArrMo1222transient = interfaceC6211l.mo1222transient(bArrCopyOfRange, this.yandex);
        C1424l c1424lM903volatile = C1424l.m903volatile(AbstractC2383l.yandex, bArrCopyOfRange, bArrMo1222transient, interfaceC6211l, this.crashlytics, this.amazon, new byte[0]);
        return ((InterfaceC3881l) c1424lM903volatile.f3603l).purchase((byte[]) c1424lM903volatile.f3601l, c1424lM903volatile.m959synchronized(), bArr, length, mopub);
    }
}
