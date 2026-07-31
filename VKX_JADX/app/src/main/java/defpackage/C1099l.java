package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lُؒٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1099l extends AbstractC13869l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final long[] f3036l;

    public C1099l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            C8339l.metrica("x value invalid for SecT193FieldElement");
            throw null;
        }
        this.f3036l = AbstractC4952l.metrica(193, bigInteger);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        long[] jArr = this.f3036l;
        long jIsPro = AbstractC5711l.isPro(jArr[0]);
        long jIsPro2 = AbstractC5711l.isPro(jArr[1]);
        long j = (jIsPro & 4294967295L) | (jIsPro2 << 32);
        long j2 = (jIsPro >>> 32) | (jIsPro2 & (-4294967296L));
        long jIsPro3 = AbstractC5711l.isPro(jArr[2]);
        long j3 = jIsPro3 >>> 32;
        return new C1099l(new long[]{j ^ (j2 << 8), ((((4294967295L & jIsPro3) ^ (jArr[3] << 32)) ^ (j3 << 8)) ^ (j2 >>> 56)) ^ (j2 << 33), (j2 >>> 31) ^ (j3 << 33), jIsPro3 >>> 63});
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l ad(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[4];
        AbstractC2387l.startapp(i, this.f3036l, jArr);
        return new C1099l(jArr);
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
        long[] jArr = ((C1099l) abstractC2426l).f3036l;
        long[] jArr2 = ((C1099l) abstractC2426l2).f3036l;
        long[] jArr3 = ((C1099l) abstractC2426l3).f3036l;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        AbstractC2387l.mopub(this.f3036l, jArr, jArr5);
        AbstractC2387l.loadAd(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        AbstractC2387l.mopub(jArr2, jArr3, jArr6);
        AbstractC2387l.loadAd(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        AbstractC2387l.vip(jArr4, jArr7);
        return new C1099l(jArr7);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        long[] jArr = ((C1099l) abstractC2426l).f3036l;
        long[] jArr2 = this.f3036l;
        return new C1099l(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr[3] ^ jArr2[3]});
    }

    @Override // defpackage.AbstractC13869l
    public final boolean applovin() {
        return true;
    }

    @Override // defpackage.AbstractC13869l
    public final int appmetrica() {
        return ((int) this.f3036l[0]) & 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1099l) {
            return AbstractC5998l.smaato(this.f3036l, ((C1099l) obj).f3036l);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC14024l.tapsense(this.f3036l, 4) ^ 1930015;
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return (this.f3036l[0] & 1) != 0;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        AbstractC2387l.isPro(this.f3036l, jArr2);
        AbstractC2387l.vip(jArr2, jArr);
        return new C1099l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        return AbstractC5998l.subscription(this.f3036l);
    }

    @Override // defpackage.AbstractC13869l
    public final AbstractC2426l premium() {
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        long[] jArr3 = this.f3036l;
        AbstractC5998l.subs(jArr3, jArr);
        for (int i = 1; i < 193; i += 2) {
            AbstractC2387l.isPro(jArr, jArr2);
            AbstractC2387l.vip(jArr2, jArr);
            AbstractC2387l.isPro(jArr, jArr2);
            AbstractC2387l.vip(jArr2, jArr);
            jArr[0] = jArr[0] ^ jArr3[0];
            jArr[1] = jArr[1] ^ jArr3[1];
            jArr[2] = jArr[2] ^ jArr3[2];
            jArr[3] = jArr[3] ^ jArr3[3];
        }
        return new C1099l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l pro(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        long[] jArr = ((C1099l) abstractC2426l).f3036l;
        long[] jArr2 = ((C1099l) abstractC2426l2).f3036l;
        long[] jArr3 = new long[8];
        long[] jArr4 = new long[8];
        AbstractC2387l.isPro(this.f3036l, jArr4);
        AbstractC2387l.loadAd(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        AbstractC2387l.mopub(jArr, jArr2, jArr5);
        AbstractC2387l.loadAd(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[4];
        AbstractC2387l.vip(jArr3, jArr6);
        return new C1099l(jArr6);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        long[] jArr = this.f3036l;
        return new C1099l(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f3036l;
        if (AbstractC5998l.subscription(jArr2)) {
            C18073l.admob();
            return null;
        }
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[8];
        AbstractC2387l.isPro(jArr2, jArr5);
        AbstractC2387l.vip(jArr5, jArr3);
        AbstractC2387l.startapp(1, jArr3, jArr4);
        AbstractC2387l.smaato(jArr3, jArr4, jArr3);
        AbstractC2387l.startapp(1, jArr4, jArr4);
        AbstractC2387l.smaato(jArr3, jArr4, jArr3);
        AbstractC2387l.startapp(3, jArr3, jArr4);
        AbstractC2387l.smaato(jArr3, jArr4, jArr3);
        AbstractC2387l.startapp(6, jArr3, jArr4);
        AbstractC2387l.smaato(jArr3, jArr4, jArr3);
        AbstractC2387l.startapp(12, jArr3, jArr4);
        AbstractC2387l.smaato(jArr3, jArr4, jArr3);
        AbstractC2387l.startapp(24, jArr3, jArr4);
        AbstractC2387l.smaato(jArr3, jArr4, jArr3);
        AbstractC2387l.startapp(48, jArr3, jArr4);
        AbstractC2387l.smaato(jArr3, jArr4, jArr3);
        AbstractC2387l.startapp(96, jArr3, jArr4);
        AbstractC2387l.smaato(jArr3, jArr4, jArr);
        return new C1099l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        return AbstractC5998l.premium(this.f3036l);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return 193;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        long[] jArr = new long[4];
        AbstractC2387l.smaato(this.f3036l, ((C1099l) abstractC2426l).f3036l, jArr);
        return new C1099l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        return AbstractC5998l.adcel(this.f3036l);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l subscription() {
        return this;
    }

    public C1099l(long[] jArr) {
        super(3);
        this.f3036l = jArr;
    }
}
