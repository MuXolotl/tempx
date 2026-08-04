package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؚٜۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7385l extends AbstractC13869l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final long[] f15312l;

    public C7385l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            C8339l.metrica("x value invalid for SecT409FieldElement");
            throw null;
        }
        this.f15312l = AbstractC4952l.metrica(409, bigInteger);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        long[] jArr = this.f15312l;
        long jIsPro = AbstractC5711l.isPro(jArr[0]);
        long jIsPro2 = AbstractC5711l.isPro(jArr[1]);
        long j = (jIsPro & 4294967295L) | (jIsPro2 << 32);
        long j2 = (jIsPro >>> 32) | (jIsPro2 & (-4294967296L));
        long jIsPro3 = AbstractC5711l.isPro(jArr[2]);
        long jIsPro4 = AbstractC5711l.isPro(jArr[3]);
        long j3 = (jIsPro3 & 4294967295L) | (jIsPro4 << 32);
        long j4 = (jIsPro3 >>> 32) | (jIsPro4 & (-4294967296L));
        long jIsPro5 = AbstractC5711l.isPro(jArr[4]);
        long jIsPro6 = AbstractC5711l.isPro(jArr[5]);
        long j5 = (jIsPro5 >>> 32) | (jIsPro6 & (-4294967296L));
        long jIsPro7 = AbstractC5711l.isPro(jArr[6]);
        long j6 = jIsPro7 >>> 32;
        return new C7385l(new long[]{j ^ (j2 << 44), (j3 ^ (j4 << 44)) ^ (j2 >>> 20), (((jIsPro5 & 4294967295L) | (jIsPro6 << 32)) ^ (j5 << 44)) ^ (j4 >>> 20), (((jIsPro7 & 4294967295L) ^ (j6 << 44)) ^ (j5 >>> 20)) ^ (j2 << 13), ((jIsPro7 >>> 52) ^ (j4 << 13)) ^ (j2 >>> 51), (j5 << 13) ^ (j4 >>> 51), (j6 << 13) ^ (j5 >>> 51)});
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l ad(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[7];
        AbstractC10586l.subs(i, this.f15312l, jArr);
        return new C7385l(jArr);
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
        long[] jArr = ((C7385l) abstractC2426l).f15312l;
        long[] jArr2 = ((C7385l) abstractC2426l2).f15312l;
        long[] jArr3 = ((C7385l) abstractC2426l3).f15312l;
        long[] jArr4 = new long[13];
        long[] jArr5 = new long[14];
        AbstractC10586l.loadAd(this.f15312l, jArr, jArr5);
        for (int i = 0; i < 13; i++) {
            jArr4[i] = jArr4[i] ^ jArr5[i];
        }
        long[] jArr6 = new long[14];
        AbstractC10586l.loadAd(jArr2, jArr3, jArr6);
        for (int i2 = 0; i2 < 13; i2++) {
            jArr4[i2] = jArr4[i2] ^ jArr6[i2];
        }
        long[] jArr7 = new long[7];
        AbstractC10586l.mopub(jArr4, jArr7);
        return new C7385l(jArr7);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        long[] jArr = ((C7385l) abstractC2426l).f15312l;
        long[] jArr2 = this.f15312l;
        return new C7385l(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr2[3] ^ jArr[3], jArr2[4] ^ jArr[4], jArr2[5] ^ jArr[5], jArr2[6] ^ jArr[6]});
    }

    @Override // defpackage.AbstractC13869l
    public final boolean applovin() {
        return true;
    }

    @Override // defpackage.AbstractC13869l
    public final int appmetrica() {
        return ((int) this.f15312l[0]) & 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7385l)) {
            return false;
        }
        long[] jArr = ((C7385l) obj).f15312l;
        for (int i = 6; i >= 0; i--) {
            if (this.f15312l[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC14024l.tapsense(this.f15312l, 7) ^ 4090087;
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return (this.f15312l[0] & 1) != 0;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        long[] jArr = new long[7];
        long[] jArr2 = new long[13];
        AbstractC10586l.amazon(this.f15312l, jArr2);
        AbstractC10586l.mopub(jArr2, jArr);
        return new C7385l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        for (int i = 0; i < 7; i++) {
            if (this.f15312l[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC13869l
    public final AbstractC2426l premium() {
        long[] jArr = new long[13];
        long[] jArr2 = this.f15312l;
        long[] jArr3 = {jArr2[0], jArr2[1], jArr2[2], jArr2[3], jArr2[4], jArr2[5], jArr2[6]};
        for (int i = 1; i < 409; i += 2) {
            AbstractC10586l.amazon(jArr3, jArr);
            AbstractC10586l.mopub(jArr, jArr3);
            AbstractC10586l.amazon(jArr3, jArr);
            AbstractC10586l.mopub(jArr, jArr3);
            jArr3[0] = jArr3[0] ^ jArr2[0];
            jArr3[1] = jArr3[1] ^ jArr2[1];
            jArr3[2] = jArr3[2] ^ jArr2[2];
            jArr3[3] = jArr3[3] ^ jArr2[3];
            jArr3[4] = jArr3[4] ^ jArr2[4];
            jArr3[5] = jArr3[5] ^ jArr2[5];
            jArr3[6] = jArr3[6] ^ jArr2[6];
        }
        return new C7385l(jArr3);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l pro(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        long[] jArr = ((C7385l) abstractC2426l).f15312l;
        long[] jArr2 = ((C7385l) abstractC2426l2).f15312l;
        long[] jArr3 = new long[13];
        long[] jArr4 = new long[13];
        AbstractC10586l.amazon(this.f15312l, jArr4);
        for (int i = 0; i < 13; i++) {
            jArr3[i] = jArr3[i] ^ jArr4[i];
        }
        long[] jArr5 = new long[14];
        AbstractC10586l.loadAd(jArr, jArr2, jArr5);
        for (int i2 = 0; i2 < 13; i2++) {
            jArr3[i2] = jArr3[i2] ^ jArr5[i2];
        }
        long[] jArr6 = new long[7];
        AbstractC10586l.mopub(jArr3, jArr6);
        return new C7385l(jArr6);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        long[] jArr = this.f15312l;
        return new C7385l(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4], jArr[5], jArr[6]});
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        long[] jArr = new long[7];
        for (int i = 0; i < 7; i++) {
            long[] jArr2 = this.f15312l;
            if (jArr2[i] != 0) {
                long[] jArr3 = new long[7];
                long[] jArr4 = new long[7];
                long[] jArr5 = new long[7];
                long[] jArr6 = new long[13];
                AbstractC10586l.amazon(jArr2, jArr6);
                AbstractC10586l.mopub(jArr6, jArr3);
                AbstractC10586l.subs(1, jArr3, jArr4);
                AbstractC10586l.purchase(jArr3, jArr4, jArr3);
                AbstractC10586l.subs(1, jArr4, jArr4);
                AbstractC10586l.purchase(jArr3, jArr4, jArr3);
                AbstractC10586l.subs(3, jArr3, jArr4);
                AbstractC10586l.purchase(jArr3, jArr4, jArr3);
                AbstractC10586l.subs(6, jArr3, jArr4);
                AbstractC10586l.purchase(jArr3, jArr4, jArr3);
                AbstractC10586l.subs(12, jArr3, jArr4);
                AbstractC10586l.purchase(jArr3, jArr4, jArr5);
                AbstractC10586l.subs(24, jArr5, jArr3);
                AbstractC10586l.subs(24, jArr3, jArr4);
                AbstractC10586l.purchase(jArr3, jArr4, jArr3);
                AbstractC10586l.subs(48, jArr3, jArr4);
                AbstractC10586l.purchase(jArr3, jArr4, jArr3);
                AbstractC10586l.subs(96, jArr3, jArr4);
                AbstractC10586l.purchase(jArr3, jArr4, jArr3);
                AbstractC10586l.subs(192, jArr3, jArr4);
                AbstractC10586l.purchase(jArr3, jArr4, jArr3);
                AbstractC10586l.purchase(jArr3, jArr5, jArr);
                return new C7385l(jArr);
            }
        }
        C18073l.admob();
        return null;
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        byte[] bArr = new byte[56];
        for (int i = 0; i < 7; i++) {
            long j = this.f15312l[i];
            if (j != 0) {
                AbstractC10000l.Signature(j, bArr, (6 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return 409;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        long[] jArr = new long[7];
        AbstractC10586l.purchase(this.f15312l, ((C7385l) abstractC2426l).f15312l, jArr);
        return new C7385l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        long[] jArr = this.f15312l;
        if (jArr[0] == 1) {
            for (int i = 1; i < 7; i++) {
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

    public C7385l(long[] jArr) {
        super(3);
        this.f15312l = jArr;
    }
}
