package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Arrays;

/* JADX INFO: renamed from: lؙٜٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6630l {
    public C7838l amazon;
    public SecureRandom billing;
    public AbstractC2017l crashlytics;
    public boolean loadAd;
    public int purchase;
    public final InterfaceC9273l yandex;

    public C6630l(InterfaceC9273l interfaceC9273l) {
        this.yandex = interfaceC9273l;
    }

    public final byte[] amazon(int i, byte[] bArr) throws C10352l {
        BigInteger bigIntegerCrashlytics;
        if (i > bArr.length || i == 0) {
            C10754l.ad("input buffer too short");
            return null;
        }
        boolean z = this.loadAd;
        InterfaceC9273l interfaceC9273l = this.yandex;
        if (!z) {
            int i2 = (this.purchase * 2) + 1;
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            AbstractC8859l abstractC8859lMopub = this.amazon.f16360l.mopub(bArr2);
            if (abstractC8859lMopub.vip(this.amazon.f16361l).smaato()) {
                C11467l.remoteconfig("[h]C1 at infinity");
                return null;
            }
            AbstractC8859l abstractC8859lStartapp = abstractC8859lMopub.vip(((C8374l) this.crashlytics).f17335l).startapp();
            int digestSize = (i - i2) - interfaceC9273l.getDigestSize();
            byte[] bArr3 = new byte[digestSize];
            System.arraycopy(bArr, i2, bArr3, 0, digestSize);
            crashlytics(interfaceC9273l, abstractC8859lStartapp, bArr3);
            int digestSize2 = interfaceC9273l.getDigestSize();
            byte[] bArr4 = new byte[digestSize2];
            abstractC8859lStartapp.loadAd();
            yandex(interfaceC9273l, abstractC8859lStartapp.loadAd);
            interfaceC9273l.update(bArr3, 0, digestSize);
            yandex(interfaceC9273l, abstractC8859lStartapp.purchase());
            interfaceC9273l.doFinal(bArr4, 0);
            int i3 = 0;
            for (int i4 = 0; i4 != digestSize2; i4++) {
                i3 |= bArr4[i4] ^ bArr[(i2 + digestSize) + i4];
            }
            Arrays.fill(bArr2, (byte) 0);
            Arrays.fill(bArr4, (byte) 0);
            if (i3 == 0) {
                return bArr3;
            }
            Arrays.fill(bArr3, (byte) 0);
            C11467l.remoteconfig("invalid cipher text");
            return null;
        }
        byte[] bArr5 = new byte[i];
        System.arraycopy(bArr, 0, bArr5, 0, i);
        C16732l c16732l = new C16732l(0);
        while (true) {
            int iBitLength = this.amazon.f16362l.bitLength();
            while (true) {
                bigIntegerCrashlytics = AbstractC16784l.crashlytics(iBitLength, this.billing);
                if (!bigIntegerCrashlytics.equals(AbstractC16784l.yandex) && bigIntegerCrashlytics.compareTo(this.amazon.f16362l) < 0) {
                    break;
                }
            }
            byte[] bArrAdmob = c16732l.loadAd(this.amazon.f16358l, bigIntegerCrashlytics).startapp().admob(false);
            AbstractC8859l abstractC8859lStartapp2 = ((C4148l) this.crashlytics).f8515l.vip(bigIntegerCrashlytics).startapp();
            crashlytics(interfaceC9273l, abstractC8859lStartapp2, bArr5);
            for (int i5 = 0; i5 != i; i5++) {
                if (bArr5[i5] != bArr[i5]) {
                    byte[] bArr6 = new byte[interfaceC9273l.getDigestSize()];
                    abstractC8859lStartapp2.loadAd();
                    yandex(interfaceC9273l, abstractC8859lStartapp2.loadAd);
                    interfaceC9273l.update(bArr, 0, i);
                    yandex(interfaceC9273l, abstractC8859lStartapp2.purchase());
                    interfaceC9273l.doFinal(bArr6, 0);
                    return AbstractC14024l.admob(bArrAdmob, bArr5, bArr6);
                }
            }
        }
    }

    public final void crashlytics(InterfaceC9273l interfaceC9273l, AbstractC8859l abstractC8859l, byte[] bArr) {
        InterfaceC11512l interfaceC11512l;
        InterfaceC11512l interfaceC11512lYandex;
        int digestSize = interfaceC9273l.getDigestSize();
        byte[] bArr2 = new byte[Math.max(4, digestSize)];
        if (interfaceC9273l instanceof InterfaceC11512l) {
            abstractC8859l.loadAd();
            yandex(interfaceC9273l, abstractC8859l.loadAd);
            yandex(interfaceC9273l, abstractC8859l.purchase());
            interfaceC11512l = (InterfaceC11512l) interfaceC9273l;
            interfaceC11512lYandex = interfaceC11512l.yandex();
        } else {
            interfaceC11512l = null;
            interfaceC11512lYandex = null;
        }
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            if (interfaceC11512l != null) {
                interfaceC11512l.loadAd(interfaceC11512lYandex);
            } else {
                abstractC8859l.loadAd();
                yandex(interfaceC9273l, abstractC8859l.loadAd);
                yandex(interfaceC9273l, abstractC8859l.purchase());
            }
            i2++;
            AbstractC10000l.isPro(i2, 0, bArr2);
            interfaceC9273l.update(bArr2, 0, 4);
            interfaceC9273l.doFinal(bArr2, 0);
            int iMin = Math.min(digestSize, bArr.length - i);
            AbstractC15269l.billing(bArr2, iMin, 0, bArr, i);
            i += iMin;
        }
    }

    public final void loadAd(boolean z, InterfaceC9719l interfaceC9719l) {
        this.loadAd = z;
        if (z) {
            C6114l c6114l = (C6114l) interfaceC9719l;
            AbstractC2017l abstractC2017l = (AbstractC2017l) c6114l.f12903l;
            this.crashlytics = abstractC2017l;
            C7838l c7838l = abstractC2017l.f4542l;
            this.amazon = c7838l;
            if (((C4148l) abstractC2017l).f8515l.vip(c7838l.f16361l).smaato()) {
                C8339l.metrica("invalid key: [h]Q at infinity");
                return;
            }
            this.billing = c6114l.f12904l;
        } else {
            AbstractC2017l abstractC2017l2 = (AbstractC2017l) interfaceC9719l;
            this.crashlytics = abstractC2017l2;
            this.amazon = abstractC2017l2.f4542l;
        }
        this.purchase = this.amazon.f16360l.firebase();
        AbstractC16336l.amazon(this.amazon.f16360l);
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
    }

    public final void yandex(InterfaceC9273l interfaceC9273l, AbstractC2426l abstractC2426l) {
        byte[] bArrYandex = AbstractC16784l.yandex(this.purchase, abstractC2426l.signatures());
        interfaceC9273l.update(bArrYandex, 0, bArrYandex.length);
    }
}
