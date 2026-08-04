package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Arrays;

/* JADX INFO: renamed from: lٖؔٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16162l implements InterfaceC5788l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final BigInteger f31653l = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public SecureRandom f31654l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C6963l f31655l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C6921l f31656l = new C6921l(9, false);

    @Override // defpackage.InterfaceC5788l
    public final int getInputBlockSize() {
        return this.f31656l.subs();
    }

    @Override // defpackage.InterfaceC5788l
    public final int getOutputBlockSize() {
        return this.f31656l.isPro();
    }

    @Override // defpackage.InterfaceC5788l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        SecureRandom secureRandom;
        SecureRandom secureRandomLoadAd = null;
        if (interfaceC9719l instanceof C6114l) {
            C6114l c6114l = (C6114l) interfaceC9719l;
            secureRandom = c6114l.f12904l;
            interfaceC9719l = c6114l.f12903l;
        } else {
            secureRandom = null;
        }
        InterfaceC9719l interfaceC9719l2 = interfaceC9719l instanceof C6114l ? ((C6114l) interfaceC9719l).f12903l : interfaceC9719l;
        C6921l c6921l = this.f31656l;
        c6921l.f14494l = z;
        C6963l c6963l = (C6963l) interfaceC9719l2;
        c6921l.f14493l = c6963l;
        AbstractC16336l.purchase(c6963l.f14630l);
        boolean z2 = ((C6963l) c6921l.f14493l).f18137l;
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
        C6963l c6963l2 = (C6963l) interfaceC9719l;
        this.f31655l = c6963l2;
        if (c6963l2 instanceof C6554l) {
            secureRandomLoadAd = secureRandom == null ? AbstractC8776l.loadAd() : secureRandom;
        }
        this.f31654l = secureRandomLoadAd;
    }

    @Override // defpackage.InterfaceC5788l
    public final byte[] processBlock(byte[] bArr, int i, int i2) {
        BigInteger bigIntegerLicense;
        byte[] bArr2;
        C6554l c6554l;
        BigInteger bigInteger;
        if (this.f31655l == null) {
            C8339l.smaato("RSA engine not initialised");
            return null;
        }
        C6921l c6921l = this.f31656l;
        if (i2 > c6921l.subs() + 1) {
            C10754l.ad("input too large for RSA cipher.");
            return null;
        }
        if (i2 == c6921l.subs() + 1 && !c6921l.f14494l) {
            C10754l.ad("input too large for RSA cipher.");
            return null;
        }
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr3 = new byte[i2];
            System.arraycopy(bArr, i, bArr3, 0, i2);
            bArr = bArr3;
        }
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        if (bigInteger2.compareTo(((C6963l) c6921l.f14493l).f14630l) >= 0) {
            C10754l.ad("input too large for RSA cipher.");
            return null;
        }
        C6963l c6963l = this.f31655l;
        if (!(c6963l instanceof C6554l) || (bigInteger = (c6554l = (C6554l) c6963l).f13683l) == null) {
            bigIntegerLicense = c6921l.license(bigInteger2);
        } else {
            BigInteger bigInteger3 = c6554l.f14630l;
            BigInteger bigInteger4 = f31653l;
            BigInteger bigIntegerAmazon = AbstractC16784l.amazon(bigInteger4, bigInteger3.subtract(bigInteger4), this.f31654l);
            bigIntegerLicense = AbstractC16784l.subs(bigInteger3, bigIntegerAmazon).multiply(c6921l.license(bigIntegerAmazon.modPow(bigInteger, bigInteger3).multiply(bigInteger2).mod(bigInteger3))).mod(bigInteger3);
        }
        byte[] byteArray = bigIntegerLicense.toByteArray();
        if (!c6921l.f14494l) {
            if (byteArray[0] == 0) {
                int length = byteArray.length - 1;
                bArr2 = new byte[length];
                System.arraycopy(byteArray, 1, bArr2, 0, length);
            } else {
                int length2 = byteArray.length;
                bArr2 = new byte[length2];
                System.arraycopy(byteArray, 0, bArr2, 0, length2);
            }
            Arrays.fill(byteArray, (byte) 0);
            return bArr2;
        }
        if (byteArray[0] == 0 && byteArray.length > c6921l.isPro()) {
            int length3 = byteArray.length - 1;
            byte[] bArr4 = new byte[length3];
            System.arraycopy(byteArray, 1, bArr4, 0, length3);
            return bArr4;
        }
        if (byteArray.length >= c6921l.isPro()) {
            return byteArray;
        }
        int iIsPro = c6921l.isPro();
        byte[] bArr5 = new byte[iIsPro];
        System.arraycopy(byteArray, 0, bArr5, iIsPro - byteArray.length, byteArray.length);
        return bArr5;
    }
}
