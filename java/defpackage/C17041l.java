package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: renamed from: lُٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17041l implements InterfaceC10634l {
    public static final C3797l admob;
    public static final C3797l mopub;
    public final EnumC5521l amazon;
    public final byte[] billing;
    public final byte[] crashlytics;
    public final String loadAd;
    public final InterfaceC14224l purchase;
    public final C10685l yandex;

    static {
        C0458l c0458lPurchase = C3797l.purchase();
        c0458lPurchase.remoteconfig(EnumC1618l.f3954l, C15059l.loadAd);
        c0458lPurchase.remoteconfig(EnumC1618l.f3953l, C15059l.crashlytics);
        c0458lPurchase.remoteconfig(EnumC1618l.f3952l, C15059l.amazon);
        mopub = c0458lPurchase.isVip();
        C0458l c0458lPurchase2 = C3797l.purchase();
        c0458lPurchase2.remoteconfig(EnumC5521l.f11790l, C12247l.crashlytics);
        c0458lPurchase2.remoteconfig(EnumC5521l.f11789l, C12247l.loadAd);
        c0458lPurchase2.remoteconfig(EnumC5521l.f11788l, C12247l.amazon);
        admob = c0458lPurchase2.isVip();
    }

    public C17041l(ECPublicKey eCPublicKey, byte[] bArr, String str, EnumC5521l enumC5521l, InterfaceC14224l interfaceC14224l, byte[] bArr2) {
        AbstractC12312l.loadAd(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.yandex = new C10685l(eCPublicKey);
        this.crashlytics = bArr;
        this.loadAd = str;
        this.amazon = enumC5521l;
        this.purchase = interfaceC14224l;
        this.billing = bArr2;
    }

    public static final String loadAd(C13114l c13114l) throws GeneralSecurityException {
        if (c13114l.equals(C13114l.loadAd)) {
            return "HmacSha1";
        }
        if (c13114l == C13114l.crashlytics) {
            return "HmacSha224";
        }
        if (c13114l == C13114l.amazon) {
            return "HmacSha256";
        }
        if (c13114l == C13114l.purchase) {
            return "HmacSha384";
        }
        if (c13114l == C13114l.billing) {
            return "HmacSha512";
        }
        throw new GeneralSecurityException("hash unsupported for EciesAeadHkdf: ".concat(String.valueOf(c13114l)));
    }

    @Override // defpackage.InterfaceC10634l
    public final byte[] yandex(byte[] bArr) throws GeneralSecurityException {
        InterfaceC14224l interfaceC14224l = this.purchase;
        int iAmazon = interfaceC14224l.amazon();
        ECPublicKey eCPublicKey = (ECPublicKey) this.yandex.f21690l;
        KeyPair keyPairBilling = C17423l.billing(eCPublicKey.getParams());
        ECPublicKey eCPublicKey2 = (ECPublicKey) keyPairBilling.getPublic();
        byte[] bArrYandex = C17423l.yandex((ECPrivateKey) keyPairBilling.getPrivate(), eCPublicKey);
        byte[] bArrIsPro = C17423l.isPro(eCPublicKey2.getParams().getCurve(), this.amazon, eCPublicKey2.getW());
        return interfaceC14224l.crashlytics(C0346l.yandex(AbstractC5170l.crashlytics(iAmazon, this.loadAd, bArrIsPro, bArrYandex, this.crashlytics)).loadAd(), this.billing, C0346l.yandex(bArrIsPro).loadAd(), bArr);
    }
}
