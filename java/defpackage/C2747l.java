package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٟؔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2747l {
    public final int loadAd;
    public final BigInteger yandex;

    public C2747l(int i, BigInteger bigInteger) {
        if (i < 0) {
            C8339l.metrica("scale may not be negative");
            throw null;
        }
        this.yandex = bigInteger;
        this.loadAd = i;
    }

    public final BigInteger crashlytics() {
        BigInteger bigInteger = InterfaceC11695l.startapp;
        C2747l c2747l = new C2747l(1, bigInteger);
        int i = this.loadAd;
        if (i < 0) {
            C8339l.metrica("scale may not be negative");
            return null;
        }
        if (i != 1) {
            c2747l = new C2747l(i, bigInteger.shiftLeft(i - 1));
        }
        C2747l c2747lYandex = yandex(c2747l);
        return c2747lYandex.yandex.shiftRight(c2747lYandex.loadAd);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2747l)) {
            return false;
        }
        C2747l c2747l = (C2747l) obj;
        return this.yandex.equals(c2747l.yandex) && this.loadAd == c2747l.loadAd;
    }

    public final int hashCode() {
        return this.loadAd ^ this.yandex.hashCode();
    }

    public final int loadAd(BigInteger bigInteger) {
        return this.yandex.compareTo(bigInteger.shiftLeft(this.loadAd));
    }

    public final String toString() {
        BigInteger bigInteger = this.yandex;
        int i = this.loadAd;
        if (i == 0) {
            return bigInteger.toString();
        }
        BigInteger bigIntegerShiftRight = bigInteger.shiftRight(i);
        BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftRight.shiftLeft(i));
        if (bigInteger.signum() == -1) {
            bigIntegerSubtract = InterfaceC11695l.startapp.shiftLeft(i).subtract(bigIntegerSubtract);
        }
        if (bigIntegerShiftRight.signum() == -1 && !bigIntegerSubtract.equals(InterfaceC11695l.metrica)) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(InterfaceC11695l.startapp);
        }
        String string = bigIntegerShiftRight.toString();
        char[] cArr = new char[i];
        String string2 = bigIntegerSubtract.toString(2);
        int length = string2.length();
        int i2 = i - length;
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = '0';
        }
        for (int i4 = 0; i4 < length; i4++) {
            cArr[i2 + i4] = string2.charAt(i4);
        }
        return AbstractC15560l.Signature(string, ".", new String(cArr));
    }

    public final C2747l yandex(C2747l c2747l) {
        int i = c2747l.loadAd;
        int i2 = this.loadAd;
        if (i2 == i) {
            return new C2747l(i2, this.yandex.add(c2747l.yandex));
        }
        C8339l.metrica("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
        return null;
    }
}
