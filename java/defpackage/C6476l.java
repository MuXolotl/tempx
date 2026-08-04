package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lؙٕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6476l implements InterfaceC14091l, InterfaceC11695l {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final Logger f13519l = Logger.getLogger(C6476l.class.getName());

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C6928l f13520l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public AbstractC2017l f13521l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public byte[] f13522l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC7389l f13523l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C0540l f13524l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C7838l f13525l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f13526l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public AbstractC8859l f13527l;

    public C6476l(AbstractC7389l abstractC7389l) {
        C6928l c6928l = C6928l.f14515l;
        this.f13524l = new C0540l();
        this.f13526l = 0;
        this.f13520l = c6928l;
        this.f13523l = abstractC7389l;
    }

    public static void yandex(InterfaceC16922l interfaceC16922l, AbstractC2426l abstractC2426l) {
        byte[] bArrIsPro = abstractC2426l.isPro();
        interfaceC16922l.update(bArrIsPro, 0, bArrIsPro.length);
    }

    public final void amazon() {
        int i = this.f13526l;
        if (i != 1) {
            if (i == 2) {
                return;
            }
            C8339l.smaato("SM2Signer needs to be initialized");
        } else {
            byte[] bArr = this.f13522l;
            this.f13523l.update(bArr, 0, bArr.length);
            this.f13526l = 2;
        }
    }

    public final boolean billing(BigInteger bigInteger, BigInteger bigInteger2) {
        String str;
        BigInteger bigInteger3 = this.f13525l.f16362l;
        BigInteger bigInteger4 = InterfaceC11695l.startapp;
        int iCompareTo = bigInteger.compareTo(bigInteger4);
        Logger logger = f13519l;
        if (iCompareTo < 0 || bigInteger.compareTo(bigInteger3) >= 0) {
            if (logger.isLoggable(Level.FINE)) {
                str = "SM2 signature verification failed: r out of range";
                logger.fine(str);
                return false;
            }
            return false;
        }
        if (bigInteger2.compareTo(bigInteger4) < 0 || bigInteger2.compareTo(bigInteger3) >= 0) {
            if (logger.isLoggable(Level.FINE)) {
                str = "SM2 signature verification failed: s out of range";
                logger.fine(str);
                return false;
            }
            return false;
        }
        AbstractC7389l abstractC7389l = this.f13523l;
        byte[] bArr = new byte[abstractC7389l.getDigestSize()];
        abstractC7389l.doFinal(bArr, 0);
        BigInteger bigInteger5 = new BigInteger(1, bArr);
        BigInteger bigIntegerMod = bigInteger.add(bigInteger2).mod(bigInteger3);
        if (bigIntegerMod.equals(InterfaceC11695l.metrica)) {
            if (logger.isLoggable(Level.FINE)) {
                str = "SM2 signature verification failed: t equals zero";
                logger.fine(str);
                return false;
            }
            return false;
        }
        AbstractC8859l abstractC8859lStartapp = AbstractC6974l.ads(this.f13525l.f16358l, bigInteger2, ((C4148l) this.f13521l).f8515l, bigIntegerMod).startapp();
        if (!abstractC8859lStartapp.smaato()) {
            abstractC8859lStartapp.loadAd();
            return bigInteger5.add(abstractC8859lStartapp.loadAd.signatures()).mod(bigInteger3).equals(bigInteger);
        }
        if (logger.isLoggable(Level.FINE)) {
            str = "SM2 signature verification failed: calculated point at infinity";
            logger.fine(str);
            return false;
        }
        return false;
    }

    @Override // defpackage.InterfaceC14091l
    public final byte[] crashlytics() {
        amazon();
        AbstractC7389l abstractC7389l = this.f13523l;
        byte[] bArr = new byte[abstractC7389l.getDigestSize()];
        abstractC7389l.doFinal(bArr, 0);
        BigInteger bigInteger = this.f13525l.f16362l;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        BigInteger bigInteger3 = ((C8374l) this.f13521l).f17335l;
        C16732l c16732l = new C16732l(0);
        while (true) {
            BigInteger bigIntegerLoadAd = this.f13524l.loadAd();
            AbstractC8859l abstractC8859lStartapp = c16732l.loadAd(this.f13525l.f16358l, bigIntegerLoadAd).startapp();
            abstractC8859lStartapp.loadAd();
            BigInteger bigIntegerMod = bigInteger2.add(abstractC8859lStartapp.loadAd.signatures()).mod(bigInteger);
            BigInteger bigInteger4 = InterfaceC11695l.metrica;
            if (!bigIntegerMod.equals(bigInteger4) && !bigIntegerMod.add(bigIntegerLoadAd).equals(bigInteger)) {
                BigInteger bigIntegerMod2 = AbstractC16784l.subs(bigInteger, bigInteger3.add(InterfaceC11695l.startapp)).multiply(bigIntegerLoadAd.subtract(bigIntegerMod.multiply(bigInteger3)).mod(bigInteger)).mod(bigInteger);
                if (!bigIntegerMod2.equals(bigInteger4)) {
                    try {
                        try {
                            byte[] bArrAdmob = this.f13520l.admob(this.f13525l.f16362l, bigIntegerMod, bigIntegerMod2);
                            purchase();
                            return bArrAdmob;
                        } catch (Exception e) {
                            throw new C11505l("unable to encode signature: " + e.getMessage(), e);
                        }
                    } catch (Throwable th) {
                        purchase();
                        throw th;
                    }
                }
            }
        }
    }

    @Override // defpackage.InterfaceC14091l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        AbstractC8859l abstractC8859lStartapp;
        SecureRandom secureRandomLoadAd;
        byte[] bArrCrashlytics = AbstractC8535l.crashlytics("31323334353637383132333435363738");
        int i = 0;
        if (z) {
            if (interfaceC9719l instanceof C6114l) {
                C6114l c6114l = (C6114l) interfaceC9719l;
                InterfaceC9719l interfaceC9719l2 = c6114l.f12903l;
                secureRandomLoadAd = c6114l.f12904l;
                interfaceC9719l = interfaceC9719l2;
            } else {
                secureRandomLoadAd = null;
            }
            C8374l c8374l = (C8374l) interfaceC9719l;
            this.f13521l = c8374l;
            C7838l c7838l = c8374l.f4542l;
            this.f13525l = c7838l;
            BigInteger bigInteger = c8374l.f17335l;
            BigInteger bigInteger2 = c7838l.f16362l;
            BigInteger bigInteger3 = InterfaceC11695l.startapp;
            if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(bigInteger2.subtract(bigInteger3)) >= 0) {
                C8339l.metrica("SM2 private key out of range");
                return;
            }
            if (secureRandomLoadAd == null) {
                secureRandomLoadAd = AbstractC8776l.loadAd();
            } else {
                ThreadLocal threadLocal = AbstractC8776l.yandex;
            }
            C0540l c0540l = this.f13524l;
            c0540l.f1856l = bigInteger2;
            c0540l.f1855l = secureRandomLoadAd;
            abstractC8859lStartapp = new C16732l(i).loadAd(this.f13525l.f16358l, bigInteger).startapp();
        } else {
            C4148l c4148l = (C4148l) interfaceC9719l;
            this.f13521l = c4148l;
            this.f13525l = c4148l.f4542l;
            abstractC8859lStartapp = c4148l.f8515l;
        }
        this.f13527l = abstractC8859lStartapp;
        AbstractC1497l.amazon("ECNR", this.f13521l, z);
        AbstractC8776l.yandex();
        AbstractC7389l abstractC7389l = this.f13523l;
        abstractC7389l.reset();
        int length = bArrCrashlytics.length * 8;
        abstractC7389l.update((byte) (length >>> 8));
        abstractC7389l.update((byte) length);
        abstractC7389l.update(bArrCrashlytics, 0, bArrCrashlytics.length);
        yandex(abstractC7389l, this.f13525l.f16360l.loadAd);
        yandex(abstractC7389l, this.f13525l.f16360l.crashlytics);
        AbstractC8859l abstractC8859l = this.f13525l.f16358l;
        abstractC8859l.loadAd();
        yandex(abstractC7389l, abstractC8859l.loadAd);
        yandex(abstractC7389l, this.f13525l.f16358l.purchase());
        AbstractC8859l abstractC8859l2 = this.f13527l;
        abstractC8859l2.loadAd();
        yandex(abstractC7389l, abstractC8859l2.loadAd);
        yandex(abstractC7389l, this.f13527l.purchase());
        byte[] bArr = new byte[abstractC7389l.getDigestSize()];
        abstractC7389l.doFinal(bArr, 0);
        this.f13522l = bArr;
        this.f13526l = 1;
    }

    @Override // defpackage.InterfaceC14091l
    public final boolean loadAd(byte[] bArr) {
        amazon();
        try {
            BigInteger[] bigIntegerArrYandex = this.f13520l.yandex(this.f13525l.f16362l, bArr);
            return billing(bigIntegerArrYandex[0], bigIntegerArrYandex[1]);
        } catch (Exception e) {
            Logger logger = f13519l;
            Level level = Level.FINE;
            if (logger.isLoggable(level)) {
                logger.log(level, "SM2 signature verification failed due to exception", (Throwable) e);
            }
            return false;
        } finally {
            purchase();
        }
    }

    public final void purchase() {
        int i = this.f13526l;
        if (i != 1) {
            if (i != 2) {
                C8339l.smaato("SM2Signer needs to be initialized");
            } else {
                this.f13523l.reset();
                this.f13526l = 1;
            }
        }
    }

    @Override // defpackage.InterfaceC14091l
    public final void update(byte b) {
        amazon();
        this.f13523l.update(b);
    }

    @Override // defpackage.InterfaceC14091l
    public final void update(byte[] bArr, int i, int i2) {
        amazon();
        this.f13523l.update(bArr, i, i2);
    }
}
