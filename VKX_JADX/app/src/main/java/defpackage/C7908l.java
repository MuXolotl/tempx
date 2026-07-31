package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lًَٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7908l extends AbstractC13869l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final long[] f16492l;

    public C7908l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            C8339l.metrica("x value invalid for SecT131FieldElement");
            throw null;
        }
        this.f16492l = AbstractC4952l.metrica(131, bigInteger);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        long[] jArr = new long[3];
        long[] jArr2 = this.f16492l;
        long jIsPro = AbstractC5711l.isPro(jArr2[0]);
        long jIsPro2 = AbstractC5711l.isPro(jArr2[1]);
        long j = (jIsPro & 4294967295L) | (jIsPro2 << 32);
        long jIsPro3 = AbstractC5711l.isPro(jArr2[2]);
        AbstractC16431l.firebase(new long[]{(jIsPro >>> 32) | (jIsPro2 & (-4294967296L)), jIsPro3 >>> 32, 0}, AbstractC16431l.yandex, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ (jIsPro3 & 4294967295L);
        return new C7908l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l ad(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[3];
        AbstractC16431l.metrica(i, this.f16492l, jArr);
        return new C7908l(jArr);
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
        long[] jArr = ((C7908l) abstractC2426l).f16492l;
        long[] jArr2 = ((C7908l) abstractC2426l2).f16492l;
        long[] jArr3 = ((C7908l) abstractC2426l3).f16492l;
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[8];
        AbstractC16431l.billing(this.f16492l, jArr, jArr5);
        AbstractC16431l.yandex(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        AbstractC16431l.billing(jArr2, jArr3, jArr6);
        AbstractC16431l.yandex(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[3];
        AbstractC16431l.remoteconfig(jArr4, jArr7);
        return new C7908l(jArr7);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        long[] jArr = ((C7908l) abstractC2426l).f16492l;
        long[] jArr2 = this.f16492l;
        return new C7908l(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr[2] ^ jArr2[2]});
    }

    @Override // defpackage.AbstractC13869l
    public final boolean applovin() {
        return true;
    }

    @Override // defpackage.AbstractC13869l
    public final int appmetrica() {
        long[] jArr = this.f16492l;
        return ((int) ((jArr[0] ^ (jArr[1] >>> 59)) ^ (jArr[2] >>> 1))) & 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7908l)) {
            return false;
        }
        long[] jArr = ((C7908l) obj).f16492l;
        for (int i = 2; i >= 0; i--) {
            if (this.f16492l[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC14024l.tapsense(this.f16492l, 3) ^ 131832;
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return (this.f16492l[0] & 1) != 0;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        long[] jArr = new long[3];
        long[] jArr2 = new long[5];
        AbstractC16431l.isPro(this.f16492l, jArr2);
        AbstractC16431l.remoteconfig(jArr2, jArr);
        return new C7908l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        return AbstractC0079l.adcel(this.f16492l);
    }

    @Override // defpackage.AbstractC13869l
    public final AbstractC2426l premium() {
        long[] jArr = new long[5];
        long[] jArr2 = this.f16492l;
        long[] jArr3 = {jArr2[0], jArr2[1], jArr2[2]};
        for (int i = 1; i < 131; i += 2) {
            AbstractC16431l.isPro(jArr3, jArr);
            AbstractC16431l.remoteconfig(jArr, jArr3);
            AbstractC16431l.isPro(jArr3, jArr);
            AbstractC16431l.remoteconfig(jArr, jArr3);
            jArr3[0] = jArr3[0] ^ jArr2[0];
            jArr3[1] = jArr3[1] ^ jArr2[1];
            jArr3[2] = jArr3[2] ^ jArr2[2];
        }
        return new C7908l(jArr3);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l pro(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        long[] jArr = ((C7908l) abstractC2426l).f16492l;
        long[] jArr2 = ((C7908l) abstractC2426l2).f16492l;
        long[] jArr3 = new long[5];
        long[] jArr4 = new long[5];
        AbstractC16431l.isPro(this.f16492l, jArr4);
        AbstractC16431l.yandex(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        AbstractC16431l.billing(jArr, jArr2, jArr5);
        AbstractC16431l.yandex(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[3];
        AbstractC16431l.remoteconfig(jArr3, jArr6);
        return new C7908l(jArr6);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        long[] jArr = this.f16492l;
        return new C7908l(new long[]{jArr[0] ^ 1, jArr[1], jArr[2]});
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        long[] jArr = new long[3];
        long[] jArr2 = this.f16492l;
        if (AbstractC0079l.adcel(jArr2)) {
            C18073l.admob();
            return null;
        }
        long[] jArr3 = new long[3];
        long[] jArr4 = new long[3];
        long[] jArr5 = new long[5];
        AbstractC16431l.isPro(jArr2, jArr5);
        AbstractC16431l.remoteconfig(jArr5, jArr3);
        AbstractC16431l.firebase(jArr3, jArr2, jArr3);
        AbstractC16431l.metrica(2, jArr3, jArr4);
        AbstractC16431l.firebase(jArr4, jArr3, jArr4);
        AbstractC16431l.metrica(4, jArr4, jArr3);
        AbstractC16431l.firebase(jArr3, jArr4, jArr3);
        AbstractC16431l.metrica(8, jArr3, jArr4);
        AbstractC16431l.firebase(jArr4, jArr3, jArr4);
        AbstractC16431l.metrica(16, jArr4, jArr3);
        AbstractC16431l.firebase(jArr3, jArr4, jArr3);
        AbstractC16431l.metrica(32, jArr3, jArr4);
        AbstractC16431l.firebase(jArr4, jArr3, jArr4);
        long[] jArr6 = new long[5];
        AbstractC16431l.isPro(jArr4, jArr6);
        AbstractC16431l.remoteconfig(jArr6, jArr4);
        AbstractC16431l.firebase(jArr4, jArr2, jArr4);
        AbstractC16431l.metrica(65, jArr4, jArr3);
        AbstractC16431l.firebase(jArr3, jArr4, jArr3);
        long[] jArr7 = new long[5];
        AbstractC16431l.isPro(jArr3, jArr7);
        AbstractC16431l.remoteconfig(jArr7, jArr);
        return new C7908l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        return AbstractC0079l.advert(this.f16492l);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return 131;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        long[] jArr = new long[3];
        AbstractC16431l.firebase(this.f16492l, ((C7908l) abstractC2426l).f16492l, jArr);
        return new C7908l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        long[] jArr = this.f16492l;
        if (jArr[0] == 1) {
            for (int i = 1; i < 3; i++) {
                if (jArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l subscription() {
        return this;
    }

    public C7908l(long[] jArr) {
        super(3);
        this.f16492l = jArr;
    }
}
