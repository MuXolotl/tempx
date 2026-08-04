package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l٘ۤؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18313l implements InterfaceC1218l {
    public static final byte[] purchase = {0};
    public final byte[] amazon;
    public final byte[] crashlytics;
    public final int loadAd;
    public final InterfaceC13504l yandex;

    public C18313l(C12785l c12785l) {
        this.yandex = new C17219l("HMAC".concat(String.valueOf(c12785l.admob.amazon)), new SecretKeySpec(((C0346l) c12785l.subs.f16631l).loadAd(), "HMAC"));
        C0485l c0485l = c12785l.admob;
        this.loadAd = c0485l.loadAd;
        this.crashlytics = c12785l.isPro.loadAd();
        if (c0485l.crashlytics.equals(C3179l.f6838l)) {
            this.amazon = Arrays.copyOf(purchase, 1);
        } else {
            this.amazon = new byte[0];
        }
    }

    public final byte[] yandex(byte[] bArr) {
        byte[] bArr2 = this.amazon;
        int length = bArr2.length;
        int i = this.loadAd;
        InterfaceC13504l interfaceC13504l = this.yandex;
        byte[] bArr3 = this.crashlytics;
        return length > 0 ? AbstractC17265l.amazon(bArr3, interfaceC13504l.mo1221throws(i, AbstractC17265l.amazon(bArr, bArr2))) : AbstractC17265l.amazon(bArr3, interfaceC13504l.mo1221throws(i, bArr));
    }

    public C18313l(C6533l c6533l) {
        this.yandex = C12371l.amazon(C0347l.subs(C9852l.loadAd(c6533l.admob.yandex), c6533l.subs));
        C6023l c6023l = c6533l.admob;
        this.loadAd = c6023l.loadAd;
        this.crashlytics = c6533l.isPro.loadAd();
        if (c6023l.crashlytics.equals(C1693l.f4072l)) {
            this.amazon = Arrays.copyOf(purchase, 1);
        } else {
            this.amazon = new byte[0];
        }
    }

    public C18313l(int i, C17219l c17219l) throws InvalidAlgorithmParameterException {
        this.yandex = c17219l;
        this.loadAd = i;
        this.crashlytics = new byte[0];
        this.amazon = new byte[0];
        if (i >= 10) {
            c17219l.mo1221throws(i, new byte[0]);
        } else {
            C18073l.pro("tag size too small, need at least 10 bytes");
            throw null;
        }
    }
}
