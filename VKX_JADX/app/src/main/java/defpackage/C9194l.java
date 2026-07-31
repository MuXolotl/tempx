package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٌۦٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9194l extends AbstractC13869l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final long[] f18905l;

    public C9194l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            C8339l.metrica("x value invalid for SecT233FieldElement");
            throw null;
        }
        this.f18905l = AbstractC4952l.metrica(233, bigInteger);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f18905l;
        long jIsPro = AbstractC5711l.isPro(jArr2[0]);
        long jIsPro2 = AbstractC5711l.isPro(jArr2[1]);
        long j = (jIsPro & 4294967295L) | (jIsPro2 << 32);
        long j2 = (jIsPro >>> 32) | (jIsPro2 & (-4294967296L));
        long jIsPro3 = AbstractC5711l.isPro(jArr2[2]);
        int i = 3;
        long jIsPro4 = AbstractC5711l.isPro(jArr2[3]);
        long j3 = (4294967295L & jIsPro3) | (jIsPro4 << 32);
        long j4 = (jIsPro3 >>> 32) | (jIsPro4 & (-4294967296L));
        long j5 = j4 >>> 27;
        long j6 = j4 ^ ((j2 >>> 27) | (j4 << 37));
        long j7 = j2 ^ (j2 << 37);
        long[] jArr3 = new long[8];
        int[] iArr = {32, 117, 191};
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2];
            int i4 = i3 >>> 6;
            int i5 = i3 & 63;
            jArr3[i4] = jArr3[i4] ^ (j7 << i5);
            int i6 = i4 + 1;
            int i7 = i;
            int i8 = -i5;
            jArr3[i6] = jArr3[i6] ^ ((j6 << i5) | (j7 >>> i8));
            int i9 = i4 + 2;
            jArr3[i9] = jArr3[i9] ^ ((j5 << i5) | (j6 >>> i8));
            int i10 = i4 + 3;
            jArr3[i10] = jArr3[i10] ^ (j5 >>> i8);
            i2++;
            i = i7;
        }
        AbstractC0140l.startapp(jArr3, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ j3;
        return new C9194l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l ad(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[4];
        AbstractC0140l.tapsense(i, this.f18905l, jArr);
        return new C9194l(jArr);
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
        long[] jArr = ((C9194l) abstractC2426l).f18905l;
        long[] jArr2 = ((C9194l) abstractC2426l2).f18905l;
        long[] jArr3 = ((C9194l) abstractC2426l3).f18905l;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        AbstractC0140l.mopub(this.f18905l, jArr, jArr5);
        AbstractC0140l.loadAd(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        AbstractC0140l.mopub(jArr2, jArr3, jArr6);
        AbstractC0140l.loadAd(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        AbstractC0140l.startapp(jArr4, jArr7);
        return new C9194l(jArr7);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        long[] jArr = ((C9194l) abstractC2426l).f18905l;
        long[] jArr2 = this.f18905l;
        return new C9194l(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr[3] ^ jArr2[3]});
    }

    @Override // defpackage.AbstractC13869l
    public final boolean applovin() {
        return true;
    }

    @Override // defpackage.AbstractC13869l
    public final int appmetrica() {
        long[] jArr = this.f18905l;
        return ((int) (jArr[0] ^ (jArr[2] >>> 31))) & 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9194l) {
            return AbstractC5998l.smaato(this.f18905l, ((C9194l) obj).f18905l);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC14024l.tapsense(this.f18905l, 4) ^ 2330074;
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return (this.f18905l[0] & 1) != 0;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        long[] jArr = new long[4];
        AbstractC0140l.ads(this.f18905l, jArr);
        return new C9194l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        return AbstractC5998l.subscription(this.f18905l);
    }

    @Override // defpackage.AbstractC13869l
    public final AbstractC2426l premium() {
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        long[] jArr3 = this.f18905l;
        AbstractC5998l.subs(jArr3, jArr);
        for (int i = 1; i < 233; i += 2) {
            AbstractC5711l.amazon(4, jArr, jArr2);
            AbstractC0140l.startapp(jArr2, jArr);
            AbstractC5711l.amazon(4, jArr, jArr2);
            AbstractC0140l.startapp(jArr2, jArr);
            jArr[0] = jArr[0] ^ jArr3[0];
            jArr[1] = jArr[1] ^ jArr3[1];
            jArr[2] = jArr[2] ^ jArr3[2];
            jArr[3] = jArr[3] ^ jArr3[3];
        }
        return new C9194l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l pro(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        long[] jArr = ((C9194l) abstractC2426l).f18905l;
        long[] jArr2 = ((C9194l) abstractC2426l2).f18905l;
        long[] jArr3 = new long[8];
        long[] jArr4 = new long[8];
        AbstractC5711l.amazon(4, this.f18905l, jArr4);
        AbstractC0140l.loadAd(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        AbstractC0140l.mopub(jArr, jArr2, jArr5);
        AbstractC0140l.loadAd(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[4];
        AbstractC0140l.startapp(jArr3, jArr6);
        return new C9194l(jArr6);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        long[] jArr = this.f18905l;
        return new C9194l(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f18905l;
        if (AbstractC5998l.subscription(jArr2)) {
            C18073l.admob();
            return null;
        }
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        AbstractC0140l.ads(jArr2, jArr3);
        AbstractC0140l.smaato(jArr3, jArr2, jArr3);
        AbstractC0140l.ads(jArr3, jArr3);
        AbstractC0140l.smaato(jArr3, jArr2, jArr3);
        AbstractC0140l.tapsense(3, jArr3, jArr4);
        AbstractC0140l.smaato(jArr4, jArr3, jArr4);
        AbstractC0140l.ads(jArr4, jArr4);
        AbstractC0140l.smaato(jArr4, jArr2, jArr4);
        AbstractC0140l.tapsense(7, jArr4, jArr3);
        AbstractC0140l.smaato(jArr3, jArr4, jArr3);
        AbstractC0140l.tapsense(14, jArr3, jArr4);
        AbstractC0140l.smaato(jArr4, jArr3, jArr4);
        AbstractC0140l.ads(jArr4, jArr4);
        AbstractC0140l.smaato(jArr4, jArr2, jArr4);
        AbstractC0140l.tapsense(29, jArr4, jArr3);
        AbstractC0140l.smaato(jArr3, jArr4, jArr3);
        AbstractC0140l.tapsense(58, jArr3, jArr4);
        AbstractC0140l.smaato(jArr4, jArr3, jArr4);
        AbstractC0140l.tapsense(116, jArr4, jArr3);
        AbstractC0140l.smaato(jArr3, jArr4, jArr3);
        AbstractC0140l.ads(jArr3, jArr);
        return new C9194l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        return AbstractC5998l.premium(this.f18905l);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return 233;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        long[] jArr = new long[4];
        AbstractC0140l.smaato(this.f18905l, ((C9194l) abstractC2426l).f18905l, jArr);
        return new C9194l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        return AbstractC5998l.adcel(this.f18905l);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l subscription() {
        return this;
    }

    public C9194l(long[] jArr) {
        super(3);
        this.f18905l = jArr;
    }
}
