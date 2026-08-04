package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٗۙؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17366l extends AbstractC13869l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final long[] f33833l;

    public C17366l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            C8339l.metrica("x value invalid for SecT113FieldElement");
            throw null;
        }
        this.f33833l = AbstractC4952l.metrica(113, bigInteger);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        long[] jArr = this.f33833l;
        long jIsPro = AbstractC5711l.isPro(jArr[0]);
        long jIsPro2 = AbstractC5711l.isPro(jArr[1]);
        long j = (4294967295L & jIsPro) | (jIsPro2 << 32);
        long j2 = (jIsPro >>> 32) | (jIsPro2 & (-4294967296L));
        return new C17366l(new long[]{((j2 << 57) ^ j) ^ (j2 << 5), (j2 >>> 59) ^ (j2 >>> 7)});
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l ad(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[2];
        AbstractC16431l.startapp(i, this.f33833l, jArr);
        return new C17366l(jArr);
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
        long[] jArr = ((C17366l) abstractC2426l).f33833l;
        long[] jArr2 = ((C17366l) abstractC2426l2).f33833l;
        long[] jArr3 = ((C17366l) abstractC2426l3).f33833l;
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[8];
        AbstractC16431l.mopub(this.f33833l, jArr, jArr5);
        AbstractC16431l.loadAd(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        AbstractC16431l.mopub(jArr2, jArr3, jArr6);
        AbstractC16431l.loadAd(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[2];
        AbstractC16431l.vip(jArr4, jArr7);
        return new C17366l(jArr7);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        long[] jArr = ((C17366l) abstractC2426l).f33833l;
        long[] jArr2 = this.f33833l;
        return new C17366l(new long[]{jArr2[0] ^ jArr[0], jArr[1] ^ jArr2[1]});
    }

    @Override // defpackage.AbstractC13869l
    public final int appmetrica() {
        return ((int) this.f33833l[0]) & 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17366l)) {
            return false;
        }
        long[] jArr = ((C17366l) obj).f33833l;
        for (int i = 1; i >= 0; i--) {
            if (this.f33833l[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC14024l.tapsense(this.f33833l, 2) ^ 113009;
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return (this.f33833l[0] & 1) != 0;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        long[] jArr = new long[2];
        long[] jArr2 = new long[4];
        AbstractC5711l.amazon(2, this.f33833l, jArr2);
        AbstractC16431l.vip(jArr2, jArr);
        return new C17366l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        for (int i = 0; i < 2; i++) {
            if (this.f33833l[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC13869l
    public final AbstractC2426l premium() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f33833l;
        long[] jArr3 = {jArr2[0], jArr2[1]};
        for (int i = 1; i < 113; i += 2) {
            AbstractC5711l.amazon(2, jArr3, jArr);
            AbstractC16431l.vip(jArr, jArr3);
            AbstractC5711l.amazon(2, jArr3, jArr);
            AbstractC16431l.vip(jArr, jArr3);
            jArr3[0] = jArr3[0] ^ jArr2[0];
            jArr3[1] = jArr3[1] ^ jArr2[1];
        }
        return new C17366l(jArr3);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l pro(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        long[] jArr = ((C17366l) abstractC2426l).f33833l;
        long[] jArr2 = ((C17366l) abstractC2426l2).f33833l;
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        AbstractC5711l.amazon(2, this.f33833l, jArr4);
        AbstractC16431l.loadAd(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        AbstractC16431l.mopub(jArr, jArr2, jArr5);
        AbstractC16431l.loadAd(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[2];
        AbstractC16431l.vip(jArr3, jArr6);
        return new C17366l(jArr6);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        long[] jArr = this.f33833l;
        return new C17366l(new long[]{jArr[0] ^ 1, jArr[1]});
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        long[] jArr = new long[2];
        for (int i = 0; i < 2; i++) {
            long[] jArr2 = this.f33833l;
            if (jArr2[i] != 0) {
                long[] jArr3 = new long[2];
                long[] jArr4 = new long[2];
                long[] jArr5 = new long[4];
                AbstractC5711l.amazon(2, jArr2, jArr5);
                AbstractC16431l.vip(jArr5, jArr3);
                AbstractC16431l.smaato(jArr3, jArr2, jArr3);
                long[] jArr6 = new long[4];
                AbstractC5711l.amazon(2, jArr3, jArr6);
                AbstractC16431l.vip(jArr6, jArr3);
                AbstractC16431l.smaato(jArr3, jArr2, jArr3);
                AbstractC16431l.startapp(3, jArr3, jArr4);
                AbstractC16431l.smaato(jArr4, jArr3, jArr4);
                long[] jArr7 = new long[4];
                AbstractC5711l.amazon(2, jArr4, jArr7);
                AbstractC16431l.vip(jArr7, jArr4);
                AbstractC16431l.smaato(jArr4, jArr2, jArr4);
                AbstractC16431l.startapp(7, jArr4, jArr3);
                AbstractC16431l.smaato(jArr3, jArr4, jArr3);
                AbstractC16431l.startapp(14, jArr3, jArr4);
                AbstractC16431l.smaato(jArr4, jArr3, jArr4);
                AbstractC16431l.startapp(28, jArr4, jArr3);
                AbstractC16431l.smaato(jArr3, jArr4, jArr3);
                AbstractC16431l.startapp(56, jArr3, jArr4);
                AbstractC16431l.smaato(jArr4, jArr3, jArr4);
                long[] jArr8 = new long[4];
                AbstractC5711l.amazon(2, jArr4, jArr8);
                AbstractC16431l.vip(jArr8, jArr);
                return new C17366l(jArr);
            }
        }
        C18073l.admob();
        return null;
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j = this.f33833l[i];
            if (j != 0) {
                AbstractC10000l.Signature(j, bArr, (1 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return 113;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        long[] jArr = new long[2];
        AbstractC16431l.smaato(this.f33833l, ((C17366l) abstractC2426l).f33833l, jArr);
        return new C17366l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        long[] jArr = this.f33833l;
        return jArr[0] == 1 && jArr[1] == 0;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l subscription() {
        return this;
    }

    public C17366l(long[] jArr) {
        super(3);
        this.f33833l = jArr;
    }
}
