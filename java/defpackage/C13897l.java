package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٓؓۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13897l extends AbstractC13869l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final long[] f27173l;

    public C13897l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            C8339l.metrica("x value invalid for SecT283FieldElement");
            throw null;
        }
        this.f27173l = AbstractC4952l.metrica(283, bigInteger);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        long[] jArr = new long[5];
        long[] jArr2 = this.f27173l;
        long jIsPro = AbstractC5711l.isPro(jArr2[0]);
        long jIsPro2 = AbstractC5711l.isPro(jArr2[1]);
        long j = (jIsPro & 4294967295L) | (jIsPro2 << 32);
        long jIsPro3 = AbstractC5711l.isPro(jArr2[2]);
        long jIsPro4 = AbstractC5711l.isPro(jArr2[3]);
        long j2 = (jIsPro3 & 4294967295L) | (jIsPro4 << 32);
        long jIsPro5 = AbstractC5711l.isPro(jArr2[4]);
        AbstractC0140l.firebase(new long[]{(jIsPro >>> 32) | (jIsPro2 & (-4294967296L)), (jIsPro3 >>> 32) | (jIsPro4 & (-4294967296L)), jIsPro5 >>> 32, 0, 0}, AbstractC0140l.yandex, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ j2;
        jArr[2] = jArr[2] ^ (4294967295L & jIsPro5);
        return new C13897l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l ad(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[5];
        AbstractC0140l.subscription(i, this.f27173l, jArr);
        return new C13897l(jArr);
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
        long[] jArr = ((C13897l) abstractC2426l).f27173l;
        long[] jArr2 = ((C13897l) abstractC2426l2).f27173l;
        long[] jArr3 = ((C13897l) abstractC2426l3).f27173l;
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[10];
        AbstractC0140l.billing(this.f27173l, jArr, jArr5);
        AbstractC0140l.yandex(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[10];
        AbstractC0140l.billing(jArr2, jArr3, jArr6);
        AbstractC0140l.yandex(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[5];
        AbstractC0140l.metrica(jArr4, jArr7);
        return new C13897l(jArr7);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        long[] jArr = ((C13897l) abstractC2426l).f27173l;
        long[] jArr2 = this.f27173l;
        return new C13897l(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr2[3] ^ jArr[3], jArr2[4] ^ jArr[4]});
    }

    @Override // defpackage.AbstractC13869l
    public final boolean applovin() {
        return true;
    }

    @Override // defpackage.AbstractC13869l
    public final int appmetrica() {
        long[] jArr = this.f27173l;
        return ((int) (jArr[0] ^ (jArr[4] >>> 15))) & 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13897l)) {
            return false;
        }
        long[] jArr = ((C13897l) obj).f27173l;
        for (int i = 4; i >= 0; i--) {
            if (this.f27173l[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC14024l.tapsense(this.f27173l, 5) ^ 2831275;
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return (this.f27173l[0] & 1) != 0;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        long[] jArr = new long[5];
        AbstractC0140l.adcel(this.f27173l, jArr);
        return new C13897l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        for (int i = 0; i < 5; i++) {
            if (this.f27173l[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC13869l
    public final AbstractC2426l premium() {
        long[] jArr = new long[9];
        long[] jArr2 = this.f27173l;
        long[] jArr3 = {jArr2[0], jArr2[1], jArr2[2], jArr2[3], jArr2[4]};
        for (int i = 1; i < 283; i += 2) {
            AbstractC0140l.isPro(jArr3, jArr);
            AbstractC0140l.metrica(jArr, jArr3);
            AbstractC0140l.isPro(jArr3, jArr);
            AbstractC0140l.metrica(jArr, jArr3);
            jArr3[0] = jArr3[0] ^ jArr2[0];
            jArr3[1] = jArr3[1] ^ jArr2[1];
            jArr3[2] = jArr3[2] ^ jArr2[2];
            jArr3[3] = jArr3[3] ^ jArr2[3];
            jArr3[4] = jArr3[4] ^ jArr2[4];
        }
        return new C13897l(jArr3);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l pro(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        long[] jArr = ((C13897l) abstractC2426l).f27173l;
        long[] jArr2 = ((C13897l) abstractC2426l2).f27173l;
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        AbstractC0140l.isPro(this.f27173l, jArr4);
        AbstractC0140l.yandex(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[10];
        AbstractC0140l.billing(jArr, jArr2, jArr5);
        AbstractC0140l.yandex(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[5];
        AbstractC0140l.metrica(jArr3, jArr6);
        return new C13897l(jArr6);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        long[] jArr = this.f27173l;
        return new C13897l(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4]});
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        long[] jArr = new long[5];
        for (int i = 0; i < 5; i++) {
            long[] jArr2 = this.f27173l;
            if (jArr2[i] != 0) {
                long[] jArr3 = new long[5];
                long[] jArr4 = new long[5];
                AbstractC0140l.adcel(jArr2, jArr3);
                AbstractC0140l.firebase(jArr3, jArr2, jArr3);
                AbstractC0140l.subscription(2, jArr3, jArr4);
                AbstractC0140l.firebase(jArr4, jArr3, jArr4);
                AbstractC0140l.subscription(4, jArr4, jArr3);
                AbstractC0140l.firebase(jArr3, jArr4, jArr3);
                AbstractC0140l.subscription(8, jArr3, jArr4);
                AbstractC0140l.firebase(jArr4, jArr3, jArr4);
                AbstractC0140l.adcel(jArr4, jArr4);
                AbstractC0140l.firebase(jArr4, jArr2, jArr4);
                AbstractC0140l.subscription(17, jArr4, jArr3);
                AbstractC0140l.firebase(jArr3, jArr4, jArr3);
                AbstractC0140l.adcel(jArr3, jArr3);
                AbstractC0140l.firebase(jArr3, jArr2, jArr3);
                AbstractC0140l.subscription(35, jArr3, jArr4);
                AbstractC0140l.firebase(jArr4, jArr3, jArr4);
                AbstractC0140l.subscription(70, jArr4, jArr3);
                AbstractC0140l.firebase(jArr3, jArr4, jArr3);
                AbstractC0140l.adcel(jArr3, jArr3);
                AbstractC0140l.firebase(jArr3, jArr2, jArr3);
                AbstractC0140l.subscription(141, jArr3, jArr4);
                AbstractC0140l.firebase(jArr4, jArr3, jArr4);
                AbstractC0140l.adcel(jArr4, jArr);
                return new C13897l(jArr);
            }
        }
        C18073l.admob();
        return null;
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        byte[] bArr = new byte[40];
        for (int i = 0; i < 5; i++) {
            long j = this.f27173l[i];
            if (j != 0) {
                AbstractC10000l.Signature(j, bArr, (4 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return 283;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        long[] jArr = new long[5];
        AbstractC0140l.firebase(this.f27173l, ((C13897l) abstractC2426l).f27173l, jArr);
        return new C13897l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        long[] jArr = this.f27173l;
        if (jArr[0] == 1) {
            for (int i = 1; i < 5; i++) {
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

    public C13897l(long[] jArr) {
        super(3);
        this.f27173l = jArr;
    }
}
