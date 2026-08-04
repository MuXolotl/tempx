package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lٌۧۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9218l implements InterfaceC5788l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f18966l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public SecureRandom f18967l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public AbstractC14014l f18968l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f18969l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final BigInteger f18964l = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final BigInteger f18965l = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final BigInteger f18963l = BigInteger.valueOf(2);

    @Override // defpackage.InterfaceC5788l
    public final int getInputBlockSize() {
        boolean z = this.f18966l;
        int i = this.f18969l;
        return z ? (i - 1) / 8 : ((i + 7) / 8) * 2;
    }

    @Override // defpackage.InterfaceC5788l
    public final int getOutputBlockSize() {
        boolean z = this.f18966l;
        int i = this.f18969l;
        return z ? ((i + 7) / 8) * 2 : (i - 1) / 8;
    }

    @Override // defpackage.InterfaceC5788l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        SecureRandom secureRandomLoadAd;
        if (interfaceC9719l instanceof C6114l) {
            C6114l c6114l = (C6114l) interfaceC9719l;
            this.f18968l = (AbstractC14014l) c6114l.f12903l;
            secureRandomLoadAd = c6114l.f12904l;
        } else {
            this.f18968l = (AbstractC14014l) interfaceC9719l;
            secureRandomLoadAd = AbstractC8776l.loadAd();
        }
        this.f18967l = secureRandomLoadAd;
        this.f18966l = z;
        this.f18969l = this.f18968l.f27323l.f24533l.bitLength();
        AbstractC14014l abstractC14014l = this.f18968l;
        if (z) {
            if (!(abstractC14014l instanceof C14223l)) {
                C8339l.metrica("ElGamalPublicKeyParameters are required for encryption.");
                return;
            }
        } else if (!(abstractC14014l instanceof C1795l)) {
            C8339l.metrica("ElGamalPrivateKeyParameters are required for decryption.");
            return;
        }
        AbstractC16336l.purchase(this.f18968l.f27323l.f24533l);
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
    }

    @Override // defpackage.InterfaceC5788l
    public final byte[] processBlock(byte[] bArr, int i, int i2) {
        BigInteger bigIntegerCrashlytics;
        if (this.f18968l == null) {
            C8339l.smaato("ElGamal engine not initialised");
            return null;
        }
        if (i2 > (this.f18966l ? (this.f18969l + 6) / 8 : getInputBlockSize())) {
            C10754l.ad("input too large for ElGamal cipher.\n");
            return null;
        }
        AbstractC14014l abstractC14014l = this.f18968l;
        BigInteger bigInteger = abstractC14014l.f27323l.f24533l;
        if (abstractC14014l instanceof C1795l) {
            int i3 = i2 / 2;
            byte[] bArr2 = new byte[i3];
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, i3);
            System.arraycopy(bArr, i + i3, bArr3, 0, i3);
            BigInteger bigIntegerMod = new BigInteger(1, bArr2).modPow(bigInteger.subtract(f18965l).subtract(((C1795l) this.f18968l).f4209l), bigInteger).multiply(new BigInteger(1, bArr3)).mod(bigInteger);
            BigInteger bigInteger2 = AbstractC16784l.yandex;
            byte[] byteArray = bigIntegerMod.toByteArray();
            if (byteArray[0] != 0 || byteArray.length == 1) {
                return byteArray;
            }
            int length = byteArray.length - 1;
            byte[] bArr4 = new byte[length];
            System.arraycopy(byteArray, 1, bArr4, 0, length);
            return bArr4;
        }
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr5 = new byte[i2];
            System.arraycopy(bArr, i, bArr5, 0, i2);
            bArr = bArr5;
        }
        BigInteger bigInteger3 = new BigInteger(1, bArr);
        if (bigInteger3.compareTo(bigInteger) >= 0) {
            C10754l.ad("input too large for ElGamal cipher.\n");
            return null;
        }
        C14223l c14223l = (C14223l) this.f18968l;
        int iBitLength = bigInteger.bitLength();
        while (true) {
            bigIntegerCrashlytics = AbstractC16784l.crashlytics(iBitLength, this.f18967l);
            if (!bigIntegerCrashlytics.equals(f18964l) && bigIntegerCrashlytics.compareTo(bigInteger.subtract(f18963l)) <= 0) {
                break;
            }
        }
        BigInteger bigIntegerModPow = this.f18968l.f27323l.f24534l.modPow(bigIntegerCrashlytics, bigInteger);
        BigInteger bigIntegerMod2 = bigInteger3.multiply(c14223l.f27824l.modPow(bigIntegerCrashlytics, bigInteger)).mod(bigInteger);
        byte[] byteArray2 = bigIntegerModPow.toByteArray();
        byte[] byteArray3 = bigIntegerMod2.toByteArray();
        int outputBlockSize = getOutputBlockSize();
        byte[] bArr6 = new byte[outputBlockSize];
        int i4 = outputBlockSize / 2;
        if (byteArray2.length > i4) {
            System.arraycopy(byteArray2, 1, bArr6, i4 - (byteArray2.length - 1), byteArray2.length - 1);
        } else {
            System.arraycopy(byteArray2, 0, bArr6, i4 - byteArray2.length, byteArray2.length);
        }
        if (byteArray3.length > i4) {
            System.arraycopy(byteArray3, 1, bArr6, outputBlockSize - (byteArray3.length - 1), byteArray3.length - 1);
            return bArr6;
        }
        System.arraycopy(byteArray3, 0, bArr6, outputBlockSize - byteArray3.length, byteArray3.length);
        return bArr6;
    }
}
