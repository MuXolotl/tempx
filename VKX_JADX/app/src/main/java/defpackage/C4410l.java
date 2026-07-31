package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؖۜٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4410l extends AbstractC13869l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final long[] f8944l;

    public C4410l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            C8339l.metrica("x value invalid for SecT239FieldElement");
            throw null;
        }
        this.f8944l = AbstractC4952l.metrica(239, bigInteger);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        char c = 4;
        long[] jArr = new long[4];
        long[] jArr2 = this.f8944l;
        boolean z = false;
        long jIsPro = AbstractC5711l.isPro(jArr2[0]);
        long jIsPro2 = AbstractC5711l.isPro(jArr2[1]);
        long j = (jIsPro & 4294967295L) | (jIsPro2 << 32);
        long j2 = (jIsPro >>> 32) | (jIsPro2 & (-4294967296L));
        long jIsPro3 = AbstractC5711l.isPro(jArr2[2]);
        long jIsPro4 = AbstractC5711l.isPro(jArr2[3]);
        long j3 = (jIsPro3 & 4294967295L) | (jIsPro4 << 32);
        long j4 = (jIsPro3 >>> 32) | (jIsPro4 & (-4294967296L));
        long j5 = j4 >>> 49;
        long j6 = (j2 >>> 49) | (j4 << 15);
        long j7 = j4 ^ (j2 << 15);
        long[] jArr3 = new long[8];
        int[] iArr = {39, 120};
        int i = 0;
        while (i < 2) {
            int i2 = iArr[i];
            int i3 = i2 >>> 6;
            char c2 = c;
            int i4 = i2 & 63;
            jArr3[i3] = jArr3[i3] ^ (j2 << i4);
            int i5 = i3 + 1;
            boolean z2 = z;
            int i6 = -i4;
            jArr3[i5] = jArr3[i5] ^ ((j7 << i4) | (j2 >>> i6));
            int i7 = i3 + 2;
            jArr3[i7] = jArr3[i7] ^ ((j6 << i4) | (j7 >>> i6));
            int i8 = i3 + 3;
            jArr3[i8] = jArr3[i8] ^ ((j5 << i4) | (j6 >>> i6));
            int i9 = i3 + 4;
            jArr3[i9] = jArr3[i9] ^ (j5 >>> i6);
            i++;
            z = z2;
            c = c2;
        }
        boolean z3 = z;
        AbstractC10774l.Signature(jArr3, jArr);
        jArr[z3 ? 1 : 0] = jArr[z3 ? 1 : 0] ^ j;
        jArr[1] = jArr[1] ^ j3;
        return new C4410l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l ad(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[4];
        AbstractC10774l.advert(i, this.f8944l, jArr);
        return new C4410l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l adcel(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l abstractC2426l3) {
        return ads(abstractC2426l, abstractC2426l2, abstractC2426l3);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l admob(AbstractC2426l abstractC2426l) {
        return startapp(abstractC2426l.remoteconfig());
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l ads(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l abstractC2426l3) {
        long[] jArr = ((C4410l) abstractC2426l).f8944l;
        long[] jArr2 = ((C4410l) abstractC2426l2).f8944l;
        long[] jArr3 = ((C4410l) abstractC2426l3).f8944l;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        AbstractC10774l.subs(this.f8944l, jArr, jArr5);
        AbstractC10774l.purchase(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        AbstractC10774l.subs(jArr2, jArr3, jArr6);
        AbstractC10774l.purchase(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        AbstractC10774l.Signature(jArr4, jArr7);
        return new C4410l(jArr7);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        long[] jArr = ((C4410l) abstractC2426l).f8944l;
        long[] jArr2 = this.f8944l;
        return new C4410l(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr[3] ^ jArr2[3]});
    }

    @Override // defpackage.AbstractC13869l
    public final boolean applovin() {
        return true;
    }

    @Override // defpackage.AbstractC13869l
    public final int appmetrica() {
        long[] jArr = this.f8944l;
        return ((int) ((jArr[0] ^ (jArr[1] >>> 17)) ^ (jArr[2] >>> 34))) & 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4410l) {
            return AbstractC5998l.smaato(this.f8944l, ((C4410l) obj).f8944l);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC14024l.tapsense(this.f8944l, 4) ^ 23900158;
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return (this.f8944l[0] & 1) != 0;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        long[] jArr = new long[4];
        AbstractC10774l.pro(this.f8944l, jArr);
        return new C4410l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        return AbstractC5998l.subscription(this.f8944l);
    }

    @Override // defpackage.AbstractC13869l
    public final AbstractC2426l premium() {
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        long[] jArr3 = this.f8944l;
        AbstractC5998l.subs(jArr3, jArr);
        for (int i = 1; i < 239; i += 2) {
            AbstractC5711l.amazon(4, jArr, jArr2);
            AbstractC10774l.Signature(jArr2, jArr);
            AbstractC5711l.amazon(4, jArr, jArr2);
            AbstractC10774l.Signature(jArr2, jArr);
            jArr[0] = jArr[0] ^ jArr3[0];
            jArr[1] = jArr[1] ^ jArr3[1];
            jArr[2] = jArr[2] ^ jArr3[2];
            jArr[3] = jArr[3] ^ jArr3[3];
        }
        return new C4410l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l pro(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        long[] jArr = ((C4410l) abstractC2426l).f8944l;
        long[] jArr2 = ((C4410l) abstractC2426l2).f8944l;
        long[] jArr3 = new long[8];
        long[] jArr4 = new long[8];
        AbstractC5711l.amazon(4, this.f8944l, jArr4);
        AbstractC10774l.purchase(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        AbstractC10774l.subs(jArr, jArr2, jArr5);
        AbstractC10774l.purchase(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[4];
        AbstractC10774l.Signature(jArr3, jArr6);
        return new C4410l(jArr6);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        long[] jArr = this.f8944l;
        return new C4410l(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f8944l;
        if (AbstractC5998l.subscription(jArr2)) {
            C18073l.admob();
            return null;
        }
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        AbstractC10774l.pro(jArr2, jArr3);
        AbstractC10774l.metrica(jArr3, jArr2, jArr3);
        AbstractC10774l.pro(jArr3, jArr3);
        AbstractC10774l.metrica(jArr3, jArr2, jArr3);
        AbstractC10774l.advert(3, jArr3, jArr4);
        AbstractC10774l.metrica(jArr4, jArr3, jArr4);
        AbstractC10774l.pro(jArr4, jArr4);
        AbstractC10774l.metrica(jArr4, jArr2, jArr4);
        AbstractC10774l.advert(7, jArr4, jArr3);
        AbstractC10774l.metrica(jArr3, jArr4, jArr3);
        AbstractC10774l.advert(14, jArr3, jArr4);
        AbstractC10774l.metrica(jArr4, jArr3, jArr4);
        AbstractC10774l.pro(jArr4, jArr4);
        AbstractC10774l.metrica(jArr4, jArr2, jArr4);
        AbstractC10774l.advert(29, jArr4, jArr3);
        AbstractC10774l.metrica(jArr3, jArr4, jArr3);
        AbstractC10774l.pro(jArr3, jArr3);
        AbstractC10774l.metrica(jArr3, jArr2, jArr3);
        AbstractC10774l.advert(59, jArr3, jArr4);
        AbstractC10774l.metrica(jArr4, jArr3, jArr4);
        AbstractC10774l.pro(jArr4, jArr4);
        AbstractC10774l.metrica(jArr4, jArr2, jArr4);
        AbstractC10774l.advert(119, jArr4, jArr3);
        AbstractC10774l.metrica(jArr3, jArr4, jArr3);
        AbstractC10774l.pro(jArr3, jArr);
        return new C4410l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        return AbstractC5998l.premium(this.f8944l);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return 239;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        long[] jArr = new long[4];
        AbstractC10774l.metrica(this.f8944l, ((C4410l) abstractC2426l).f8944l, jArr);
        return new C4410l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        return AbstractC5998l.adcel(this.f8944l);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l subscription() {
        return this;
    }

    public C4410l(long[] jArr) {
        super(3);
        this.f8944l = jArr;
    }
}
