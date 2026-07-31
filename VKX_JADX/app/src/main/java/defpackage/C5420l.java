package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: renamed from: lؘؔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5420l extends AbstractC14331l {

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final BigInteger f11612l = new BigInteger(1, AbstractC8535l.crashlytics("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int[] f11613l;

    public C5420l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f11612l) >= 0) {
            C8339l.metrica("x value invalid for SecP224R1FieldElement");
            throw null;
        }
        int[] iArrSmaato = AbstractC3292l.smaato(bigInteger);
        if (iArrSmaato[6] == -1) {
            int[] iArr = AbstractC4654l.yandex;
            if (AbstractC3292l.adcel(iArrSmaato, iArr)) {
                long j = (((long) iArrSmaato[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
                iArrSmaato[0] = (int) j;
                long j2 = ((((long) iArrSmaato[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j >> 32);
                iArrSmaato[1] = (int) j2;
                long j3 = ((((long) iArrSmaato[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j2 >> 32);
                iArrSmaato[2] = (int) j3;
                long j4 = ((((long) iArrSmaato[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j3 >> 32);
                iArrSmaato[3] = (int) j4;
                long j5 = ((((long) iArrSmaato[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) + (j4 >> 32);
                iArrSmaato[4] = (int) j5;
                long j6 = ((((long) iArrSmaato[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) + (j5 >> 32);
                iArrSmaato[5] = (int) j6;
                iArrSmaato[6] = (int) (((((long) iArrSmaato[6]) & 4294967295L) - (4294967295L & ((long) iArr[6]))) + (j6 >> 32));
            }
        }
        this.f11613l = iArrSmaato;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        int i;
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = this.f11613l;
        if (AbstractC3292l.subscription(iArr3) || AbstractC3292l.ads(iArr3)) {
            return this;
        }
        int[] iArr4 = new int[7];
        AbstractC4654l.firebase(iArr3, iArr4);
        Random random = new Random();
        int[] iArr5 = new int[7];
        int[] iArr6 = AbstractC4654l.yandex;
        int i2 = iArr6[6];
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = (i6 >>> 16) | i6;
        do {
            i = 0;
            for (int i8 = 0; i8 != 7; i8++) {
                iArr5[i8] = random.nextInt();
            }
            iArr5[6] = iArr5[6] & i7;
        } while (AbstractC4952l.adcel(7, iArr5, iArr6));
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        int[] iArr9 = new int[7];
        AbstractC3292l.subs(iArr3, iArr8);
        for (int i9 = 0; i9 < 7; i9++) {
            AbstractC3292l.subs(iArr8, iArr9);
            int i10 = 1 << i9;
            int[] iArr10 = new int[14];
            do {
                AbstractC3292l.license(iArr8, iArr10);
                AbstractC4654l.smaato(iArr10, iArr8);
                i10--;
            } while (i10 > 0);
            AbstractC4654l.isPro(iArr8, iArr9, iArr8);
        }
        int[] iArr11 = new int[14];
        AbstractC3292l.license(iArr8, iArr11);
        AbstractC4654l.smaato(iArr11, iArr8);
        int i11 = 95;
        while (true) {
            i11--;
            if (i11 <= 0) {
                break;
            }
            AbstractC3292l.license(iArr8, iArr11);
            AbstractC4654l.smaato(iArr11, iArr8);
        }
        if (!AbstractC3292l.ads(iArr8)) {
            return null;
        }
        loop5: while (true) {
            int[] iArr12 = new int[7];
            AbstractC3292l.subs(iArr5, iArr12);
            int[] iArr13 = new int[7];
            iArr13[i] = 1;
            int[] iArr14 = new int[7];
            AbstractC3292l.subs(iArr4, iArr14);
            int[] iArr15 = new int[7];
            int[] iArr16 = new int[7];
            for (int i12 = i; i12 < 7; i12++) {
                AbstractC3292l.subs(iArr12, iArr15);
                AbstractC3292l.subs(iArr13, iArr16);
                int i13 = 1 << i12;
                while (true) {
                    i13--;
                    if (i13 >= 0) {
                        AbstractC4654l.isPro(iArr13, iArr12, iArr13);
                        AbstractC4654l.startapp(iArr13, iArr13);
                        AbstractC4654l.vip(iArr12, iArr7);
                        AbstractC4654l.loadAd(iArr14, iArr7, iArr12);
                        AbstractC4654l.isPro(iArr14, iArr7, iArr14);
                        AbstractC4654l.remoteconfig(iArr14, AbstractC4952l.appmetrica(iArr14, 7));
                    }
                }
                AbstractC4654l.isPro(iArr13, iArr16, iArr7);
                AbstractC4654l.isPro(iArr7, iArr4, iArr7);
                AbstractC4654l.isPro(iArr12, iArr15, iArr14);
                AbstractC4654l.loadAd(iArr14, iArr7, iArr14);
                AbstractC4654l.isPro(iArr12, iArr16, iArr7);
                AbstractC3292l.subs(iArr14, iArr12);
                AbstractC4654l.isPro(iArr13, iArr15, iArr13);
                AbstractC4654l.loadAd(iArr13, iArr7, iArr13);
                AbstractC4654l.vip(iArr13, iArr14);
                AbstractC4654l.isPro(iArr14, iArr4, iArr14);
            }
            iArr = new int[7];
            iArr2 = new int[7];
            for (int i14 = 1; i14 < 96; i14++) {
                AbstractC3292l.subs(iArr12, iArr);
                AbstractC3292l.subs(iArr13, iArr2);
                AbstractC4654l.isPro(iArr13, iArr12, iArr13);
                AbstractC4654l.startapp(iArr13, iArr13);
                AbstractC4654l.vip(iArr12, iArr7);
                AbstractC4654l.loadAd(iArr14, iArr7, iArr12);
                AbstractC4654l.isPro(iArr14, iArr7, iArr14);
                AbstractC4654l.remoteconfig(iArr14, AbstractC4952l.appmetrica(iArr14, 7));
                if (AbstractC3292l.subscription(iArr12)) {
                    break loop5;
                }
            }
            if (AbstractC4952l.ads(7, iArr5, iArr5) != 0 || (iArr5[6] == -1 && AbstractC3292l.adcel(iArr5, iArr6))) {
                AbstractC4654l.crashlytics(iArr5);
            }
            i = 0;
        }
        AbstractC6974l.loadAd(iArr6, iArr2, iArr7);
        AbstractC4654l.isPro(iArr7, iArr, iArr7);
        AbstractC4654l.vip(iArr7, iArr5);
        if (AbstractC3292l.firebase(iArr3, iArr5)) {
            return new C5420l(iArr7);
        }
        return null;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l admob(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[7];
        AbstractC6974l.loadAd(AbstractC4654l.yandex, ((C5420l) abstractC2426l).f11613l, iArr);
        AbstractC4654l.isPro(iArr, this.f11613l, iArr);
        return new C5420l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l advert(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[7];
        AbstractC4654l.metrica(this.f11613l, ((C5420l) abstractC2426l).f11613l, iArr);
        return new C5420l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[7];
        AbstractC4654l.loadAd(this.f11613l, ((C5420l) abstractC2426l).f11613l, iArr);
        return new C5420l(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5420l) {
            return AbstractC3292l.firebase(this.f11613l, ((C5420l) obj).f11613l);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC14024l.subscription(this.f11613l, 7) ^ f11612l.hashCode();
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return AbstractC3292l.remoteconfig(this.f11613l) == 1;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        int[] iArr = new int[7];
        AbstractC4654l.vip(this.f11613l, iArr);
        return new C5420l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        return AbstractC3292l.subscription(this.f11613l);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        int[] iArr = new int[7];
        if (AbstractC4952l.ads(7, this.f11613l, iArr) != 0 || (iArr[6] == -1 && AbstractC3292l.adcel(iArr, AbstractC4654l.yandex))) {
            AbstractC4654l.crashlytics(iArr);
        }
        return new C5420l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        int[] iArr = new int[7];
        AbstractC6974l.loadAd(AbstractC4654l.yandex, this.f11613l, iArr);
        return new C5420l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        return AbstractC3292l.advert(this.f11613l);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return f11612l.bitLength();
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[7];
        AbstractC4654l.isPro(this.f11613l, ((C5420l) abstractC2426l).f11613l, iArr);
        return new C5420l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l subscription() {
        int[] iArr = new int[7];
        AbstractC4654l.firebase(this.f11613l, iArr);
        return new C5420l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        return AbstractC3292l.ads(this.f11613l);
    }

    public C5420l(int[] iArr) {
        super(3);
        this.f11613l = iArr;
    }
}
