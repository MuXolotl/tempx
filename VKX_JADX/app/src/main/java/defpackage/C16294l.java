package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;

/* JADX INFO: renamed from: lٍٖٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16294l implements InterfaceC11416l {
    public final byte[] amazon;
    public final InterfaceC14224l billing;
    public final String crashlytics;
    public final C14965l loadAd;
    public final byte[] mopub;
    public final EnumC5521l purchase;
    public final ECPrivateKey yandex;

    public C16294l(ECPrivateKey eCPrivateKey, byte[] bArr, String str, EnumC5521l enumC5521l, InterfaceC14224l interfaceC14224l, byte[] bArr2) {
        this.yandex = eCPrivateKey;
        C14965l c14965l = new C14965l();
        c14965l.f29441l = eCPrivateKey;
        this.loadAd = c14965l;
        this.amazon = bArr;
        this.crashlytics = str;
        this.purchase = enumC5521l;
        this.billing = interfaceC14224l;
        this.mopub = bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:17:0x007a  */
    @Override // defpackage.InterfaceC11416l
    public final byte[] yandex(byte[] bArr) throws GeneralSecurityException {
        int i;
        int i2;
        byte[] bArr2 = this.mopub;
        if (!AbstractC0647l.yandex(bArr2, bArr)) {
            C18262l.ads("Invalid ciphertext (output prefix mismatch)");
            return null;
        }
        int length = bArr2.length;
        int iPurchase = C17423l.purchase(this.yandex.getParams().getCurve());
        EnumC5521l enumC5521l = this.purchase;
        int iOrdinal = enumC5521l.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    C18262l.ads("unknown EC point format");
                    return null;
                }
                i = iPurchase * 2;
            }
            i2 = i + length;
            if (bArr.length >= i2) {
                C18262l.ads("ciphertext too short");
                return null;
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length, i2);
            InterfaceC14224l interfaceC14224l = this.billing;
            int iAmazon = interfaceC14224l.amazon();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) this.loadAd.f29441l;
            ECParameterSpec params = eCPrivateKey.getParams();
            return interfaceC14224l.smaato(AbstractC5170l.crashlytics(iAmazon, this.crashlytics, bArrCopyOfRange, C17423l.yandex(eCPrivateKey, (ECPublicKey) ((KeyFactory) C12437l.billing.yandex.appmetrica("EC")).generatePublic(new ECPublicKeySpec(C17423l.subs(params.getCurve(), enumC5521l, bArrCopyOfRange), params))), this.amazon), i2, bArr);
        }
        iPurchase *= 2;
        i = iPurchase + 1;
        i2 = i + length;
        if (bArr.length >= i2) {
            C18262l.ads("ciphertext too short");
            return null;
        }
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length, i2);
        InterfaceC14224l interfaceC14224l2 = this.billing;
        int iAmazon2 = interfaceC14224l2.amazon();
        ECPrivateKey eCPrivateKey2 = (ECPrivateKey) this.loadAd.f29441l;
        ECParameterSpec params2 = eCPrivateKey2.getParams();
        return interfaceC14224l2.smaato(AbstractC5170l.crashlytics(iAmazon2, this.crashlytics, bArrCopyOfRange2, C17423l.yandex(eCPrivateKey2, (ECPublicKey) ((KeyFactory) C12437l.billing.yandex.appmetrica("EC")).generatePublic(new ECPublicKeySpec(C17423l.subs(params2.getCurve(), enumC5521l, bArrCopyOfRange2), params2))), this.amazon), i2, bArr);
    }
}
