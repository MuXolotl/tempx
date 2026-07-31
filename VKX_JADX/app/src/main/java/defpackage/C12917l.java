package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lُّۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12917l extends AbstractC13869l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final long[] f25372l;

    public C12917l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            C8339l.metrica("x value invalid for SecT163FieldElement");
            throw null;
        }
        this.f25372l = AbstractC4952l.metrica(163, bigInteger);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        long[] jArr = new long[3];
        long[] jArr2 = this.f25372l;
        long jIsPro = AbstractC5711l.isPro(jArr2[0]);
        long jIsPro2 = AbstractC5711l.isPro(jArr2[1]);
        long j = (jIsPro & 4294967295L) | (jIsPro2 << 32);
        long jIsPro3 = AbstractC5711l.isPro(jArr2[2]);
        AbstractC2387l.firebase(new long[]{(jIsPro >>> 32) | (jIsPro2 & (-4294967296L)), jIsPro3 >>> 32, 0}, AbstractC2387l.yandex, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ (jIsPro3 & 4294967295L);
        return new C12917l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l ad(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[3];
        AbstractC2387l.metrica(i, this.f25372l, jArr);
        return new C12917l(jArr);
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
        long[] jArr = ((C12917l) abstractC2426l).f25372l;
        long[] jArr2 = ((C12917l) abstractC2426l2).f25372l;
        long[] jArr3 = ((C12917l) abstractC2426l3).f25372l;
        long[] jArr4 = new long[6];
        long[] jArr5 = new long[8];
        AbstractC2387l.billing(this.f25372l, jArr, jArr5);
        AbstractC2387l.yandex(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        AbstractC2387l.billing(jArr2, jArr3, jArr6);
        AbstractC2387l.yandex(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[3];
        AbstractC2387l.remoteconfig(jArr4, jArr7);
        return new C12917l(jArr7);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        long[] jArr = ((C12917l) abstractC2426l).f25372l;
        long[] jArr2 = this.f25372l;
        return new C12917l(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr[2] ^ jArr2[2]});
    }

    @Override // defpackage.AbstractC13869l
    public final boolean applovin() {
        return true;
    }

    @Override // defpackage.AbstractC13869l
    public final int appmetrica() {
        long[] jArr = this.f25372l;
        return ((int) (jArr[0] ^ (jArr[2] >>> 29))) & 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12917l)) {
            return false;
        }
        long[] jArr = ((C12917l) obj).f25372l;
        for (int i = 2; i >= 0; i--) {
            if (this.f25372l[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC14024l.tapsense(this.f25372l, 3) ^ 163763;
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return (this.f25372l[0] & 1) != 0;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        long[] jArr = new long[3];
        long[] jArr2 = new long[6];
        AbstractC5711l.amazon(3, this.f25372l, jArr2);
        AbstractC2387l.remoteconfig(jArr2, jArr);
        return new C12917l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        return AbstractC0079l.adcel(this.f25372l);
    }

    @Override // defpackage.AbstractC13869l
    public final AbstractC2426l premium() {
        long[] jArr = new long[6];
        long[] jArr2 = this.f25372l;
        long[] jArr3 = {jArr2[0], jArr2[1], jArr2[2]};
        for (int i = 1; i < 163; i += 2) {
            AbstractC5711l.amazon(3, jArr3, jArr);
            AbstractC2387l.remoteconfig(jArr, jArr3);
            AbstractC5711l.amazon(3, jArr3, jArr);
            AbstractC2387l.remoteconfig(jArr, jArr3);
            jArr3[0] = jArr3[0] ^ jArr2[0];
            jArr3[1] = jArr3[1] ^ jArr2[1];
            jArr3[2] = jArr3[2] ^ jArr2[2];
        }
        return new C12917l(jArr3);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l pro(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        long[] jArr = ((C12917l) abstractC2426l).f25372l;
        long[] jArr2 = ((C12917l) abstractC2426l2).f25372l;
        long[] jArr3 = new long[6];
        long[] jArr4 = new long[6];
        AbstractC5711l.amazon(3, this.f25372l, jArr4);
        AbstractC2387l.yandex(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        AbstractC2387l.billing(jArr, jArr2, jArr5);
        AbstractC2387l.yandex(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[3];
        AbstractC2387l.remoteconfig(jArr3, jArr6);
        return new C12917l(jArr6);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        long[] jArr = this.f25372l;
        return new C12917l(new long[]{jArr[0] ^ 1, jArr[1], jArr[2]});
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        long[] jArr = new long[3];
        long[] jArr2 = this.f25372l;
        if (AbstractC0079l.adcel(jArr2)) {
            C18073l.admob();
            return null;
        }
        long[] jArr3 = new long[3];
        long[] jArr4 = new long[3];
        long[] jArr5 = new long[6];
        AbstractC5711l.amazon(3, jArr2, jArr5);
        AbstractC2387l.remoteconfig(jArr5, jArr3);
        AbstractC2387l.metrica(1, jArr3, jArr4);
        AbstractC2387l.firebase(jArr3, jArr4, jArr3);
        AbstractC2387l.metrica(1, jArr4, jArr4);
        AbstractC2387l.firebase(jArr3, jArr4, jArr3);
        AbstractC2387l.metrica(3, jArr3, jArr4);
        AbstractC2387l.firebase(jArr3, jArr4, jArr3);
        AbstractC2387l.metrica(3, jArr4, jArr4);
        AbstractC2387l.firebase(jArr3, jArr4, jArr3);
        AbstractC2387l.metrica(9, jArr3, jArr4);
        AbstractC2387l.firebase(jArr3, jArr4, jArr3);
        AbstractC2387l.metrica(9, jArr4, jArr4);
        AbstractC2387l.firebase(jArr3, jArr4, jArr3);
        AbstractC2387l.metrica(27, jArr3, jArr4);
        AbstractC2387l.firebase(jArr3, jArr4, jArr3);
        AbstractC2387l.metrica(27, jArr4, jArr4);
        AbstractC2387l.firebase(jArr3, jArr4, jArr3);
        AbstractC2387l.metrica(81, jArr3, jArr4);
        AbstractC2387l.firebase(jArr3, jArr4, jArr);
        return new C12917l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        return AbstractC0079l.advert(this.f25372l);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return 163;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        long[] jArr = new long[3];
        AbstractC2387l.firebase(this.f25372l, ((C12917l) abstractC2426l).f25372l, jArr);
        return new C12917l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        long[] jArr = this.f25372l;
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

    public C12917l(long[] jArr) {
        super(3);
        this.f25372l = jArr;
    }
}
