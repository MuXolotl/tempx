package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lًۛٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8266l implements InterfaceC8145l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C10183l f17164l;

    /* JADX WARN: Code duplicated, block: B:17:0x0029  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    @Override // defpackage.InterfaceC8145l
    public final C18595l purchase() {
        SecureRandom secureRandom;
        BigInteger bigInteger;
        BigInteger bigIntegerShiftLeft;
        BigInteger bigIntegerSubtract;
        int iBitLength;
        BigInteger bigIntegerAmazon;
        BigInteger bit;
        int i;
        String str;
        BigInteger bigInteger2 = AbstractC16779l.yandex;
        C12425l c12425l = this.f17164l.f20745l;
        BigInteger bigInteger3 = c12425l.f24533l;
        BigInteger bigInteger4 = c12425l.f24534l;
        int i2 = c12425l.f24532l;
        int i3 = 160;
        if (i2 != 0 && i2 < 160) {
            i3 = i2;
        }
        if (i2 == 0) {
            if (i3 > bigInteger3.bitLength() || AbstractC8151l.crashlytics("org.bouncycastle.dh.allow_unsafe_p_value")) {
                secureRandom = (SecureRandom) this.f17164l.f28907l;
                if (i2 != 0) {
                    i = i2 >>> 2;
                    do {
                        bit = AbstractC16784l.crashlytics(i2, secureRandom).setBit(i2 - 1);
                    } while (AbstractC6660l.billing(bit) < i);
                } else {
                    bigInteger = AbstractC16779l.loadAd;
                    if (i3 != 0) {
                        bigIntegerShiftLeft = AbstractC16779l.yandex.shiftLeft(i3 - 1);
                    } else {
                        bigIntegerShiftLeft = bigInteger;
                    }
                    bigIntegerSubtract = bigInteger3.subtract(bigInteger);
                    iBitLength = bigIntegerSubtract.bitLength() >>> 2;
                    do {
                        bigIntegerAmazon = AbstractC16784l.amazon(bigIntegerShiftLeft, bigIntegerSubtract, secureRandom);
                    } while (AbstractC6660l.billing(bigIntegerAmazon) < iBitLength);
                    bit = bigIntegerAmazon;
                }
                return new C18595l(new C14223l(bigInteger4.modPow(bit, bigInteger3), c12425l), new C1795l(bit, c12425l), 7);
            }
            str = "unsafe p value so small specific l required";
        } else if (i2 > bigInteger3.bitLength()) {
            str = "when l value specified, it must satisfy 2^(l-1) <= p";
        } else {
            if (i2 >= i3) {
                if (i3 > bigInteger3.bitLength()) {
                }
                secureRandom = (SecureRandom) this.f17164l.f28907l;
                if (i2 != 0) {
                    i = i2 >>> 2;
                    do {
                        bit = AbstractC16784l.crashlytics(i2, secureRandom).setBit(i2 - 1);
                    } while (AbstractC6660l.billing(bit) < i);
                } else {
                    bigInteger = AbstractC16779l.loadAd;
                    if (i3 != 0) {
                        bigIntegerShiftLeft = AbstractC16779l.yandex.shiftLeft(i3 - 1);
                    } else {
                        bigIntegerShiftLeft = bigInteger;
                    }
                    bigIntegerSubtract = bigInteger3.subtract(bigInteger);
                    iBitLength = bigIntegerSubtract.bitLength() >>> 2;
                    do {
                        bigIntegerAmazon = AbstractC16784l.amazon(bigIntegerShiftLeft, bigIntegerSubtract, secureRandom);
                    } while (AbstractC6660l.billing(bigIntegerAmazon) < iBitLength);
                    bit = bigIntegerAmazon;
                }
                return new C18595l(new C14223l(bigInteger4.modPow(bit, bigInteger3), c12425l), new C1795l(bit, c12425l), 7);
            }
            str = "when l value specified, it may not be less than m value";
        }
        C8339l.metrica(str);
        return null;
    }

    @Override // defpackage.InterfaceC8145l
    /* JADX INFO: renamed from: throws */
    public final void mo274throws(C14785l c14785l) {
        C10183l c10183l = (C10183l) c14785l;
        this.f17164l = c10183l;
        AbstractC16336l.purchase(c10183l.f20745l.f24533l);
        C12425l c12425l = this.f17164l.f20745l;
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
    }
}
