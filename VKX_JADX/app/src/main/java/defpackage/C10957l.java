package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lَُٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10957l extends AbstractC13869l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public long[] f22089l;

    public C10957l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            C8339l.metrica("x value invalid for SecT571FieldElement");
            throw null;
        }
        this.f22089l = AbstractC4952l.metrica(571, bigInteger);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        long[] jArr = new long[9];
        long[] jArr2 = this.f22089l;
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + 1;
            long jIsPro = AbstractC5711l.isPro(jArr2[i]);
            i += 2;
            long jIsPro2 = AbstractC5711l.isPro(jArr2[i3]);
            jArr3[i2] = (4294967295L & jIsPro) | (jIsPro2 << 32);
            jArr4[i2] = (jIsPro >>> 32) | ((-4294967296L) & jIsPro2);
        }
        long jIsPro3 = AbstractC5711l.isPro(jArr2[i]);
        jArr3[4] = 4294967295L & jIsPro3;
        jArr4[4] = jIsPro3 >>> 32;
        AbstractC10774l.vip(jArr4, AbstractC10774l.yandex, jArr);
        AbstractC10774l.yandex(jArr, jArr3, jArr);
        return new C10957l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l ad(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[9];
        AbstractC10774l.ad(i, this.f22089l, jArr);
        return new C10957l(jArr);
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
        long[] jArr = this.f22089l;
        long[] jArr2 = ((C10957l) abstractC2426l).f22089l;
        long[] jArr3 = ((C10957l) abstractC2426l2).f22089l;
        long[] jArr4 = ((C10957l) abstractC2426l3).f22089l;
        long[] jArr5 = new long[18];
        AbstractC10774l.startapp(jArr, jArr2, jArr5);
        AbstractC10774l.startapp(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[9];
        AbstractC10774l.tapsense(jArr5, jArr6);
        return new C10957l(jArr6);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        long[] jArr = new long[9];
        AbstractC10774l.yandex(this.f22089l, ((C10957l) abstractC2426l).f22089l, jArr);
        return new C10957l(jArr);
    }

    @Override // defpackage.AbstractC13869l
    public final boolean applovin() {
        return true;
    }

    @Override // defpackage.AbstractC13869l
    public final int appmetrica() {
        long[] jArr = this.f22089l;
        long j = jArr[0];
        long j2 = jArr[8];
        return ((int) ((j ^ (j2 >>> 49)) ^ (j2 >>> 57))) & 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10957l)) {
            return false;
        }
        long[] jArr = this.f22089l;
        long[] jArr2 = ((C10957l) obj).f22089l;
        for (int i = 8; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC14024l.tapsense(this.f22089l, 9) ^ 5711052;
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return (this.f22089l[0] & 1) != 0;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        long[] jArr = new long[9];
        AbstractC10774l.license(this.f22089l, jArr);
        return new C10957l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        return AbstractC17742l.amazon(this.f22089l);
    }

    @Override // defpackage.AbstractC13869l
    public final AbstractC2426l premium() {
        long[] jArr = new long[9];
        long[] jArr2 = this.f22089l;
        long[] jArr3 = new long[18];
        jArr[0] = jArr2[0];
        jArr[1] = jArr2[1];
        jArr[2] = jArr2[2];
        jArr[3] = jArr2[3];
        jArr[4] = jArr2[4];
        jArr[5] = jArr2[5];
        jArr[6] = jArr2[6];
        jArr[7] = jArr2[7];
        jArr[8] = jArr2[8];
        for (int i = 1; i < 571; i += 2) {
            AbstractC10774l.remoteconfig(jArr, jArr3);
            AbstractC10774l.tapsense(jArr3, jArr);
            AbstractC10774l.remoteconfig(jArr, jArr3);
            AbstractC10774l.tapsense(jArr3, jArr);
            for (int i2 = 0; i2 < 9; i2++) {
                jArr[i2] = jArr[i2] ^ jArr2[i2];
            }
        }
        return new C10957l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l pro(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        long[] jArr = this.f22089l;
        long[] jArr2 = ((C10957l) abstractC2426l).f22089l;
        long[] jArr3 = ((C10957l) abstractC2426l2).f22089l;
        long[] jArr4 = new long[18];
        long[] jArr5 = new long[18];
        AbstractC10774l.remoteconfig(jArr, jArr5);
        AbstractC10774l.amazon(jArr4, jArr5, jArr4);
        AbstractC10774l.startapp(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[9];
        AbstractC10774l.tapsense(jArr4, jArr6);
        return new C10957l(jArr6);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        long[] jArr = new long[9];
        long[] jArr2 = this.f22089l;
        jArr[0] = jArr2[0] ^ 1;
        for (int i = 1; i < 9; i++) {
            jArr[i] = jArr2[i];
        }
        return new C10957l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        long[] jArr = new long[9];
        long[] jArr2 = this.f22089l;
        if (AbstractC17742l.amazon(jArr2)) {
            C18073l.admob();
            return null;
        }
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        AbstractC10774l.license(jArr2, jArr5);
        AbstractC10774l.license(jArr5, jArr3);
        AbstractC10774l.license(jArr3, jArr4);
        AbstractC10774l.vip(jArr3, jArr4, jArr3);
        AbstractC10774l.ad(2, jArr3, jArr4);
        AbstractC10774l.vip(jArr3, jArr4, jArr3);
        AbstractC10774l.vip(jArr3, jArr5, jArr3);
        AbstractC10774l.ad(5, jArr3, jArr4);
        AbstractC10774l.vip(jArr3, jArr4, jArr3);
        AbstractC10774l.ad(5, jArr4, jArr4);
        AbstractC10774l.vip(jArr3, jArr4, jArr3);
        AbstractC10774l.ad(15, jArr3, jArr4);
        AbstractC10774l.vip(jArr3, jArr4, jArr5);
        AbstractC10774l.ad(30, jArr5, jArr3);
        AbstractC10774l.ad(30, jArr3, jArr4);
        AbstractC10774l.vip(jArr3, jArr4, jArr3);
        AbstractC10774l.ad(60, jArr3, jArr4);
        AbstractC10774l.vip(jArr3, jArr4, jArr3);
        AbstractC10774l.ad(60, jArr4, jArr4);
        AbstractC10774l.vip(jArr3, jArr4, jArr3);
        AbstractC10774l.ad(180, jArr3, jArr4);
        AbstractC10774l.vip(jArr3, jArr4, jArr3);
        AbstractC10774l.ad(180, jArr4, jArr4);
        AbstractC10774l.vip(jArr3, jArr4, jArr3);
        AbstractC10774l.vip(jArr3, jArr5, jArr);
        return new C10957l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        long[] jArr = this.f22089l;
        byte[] bArr = new byte[72];
        for (int i = 0; i < 9; i++) {
            long j = jArr[i];
            if (j != 0) {
                AbstractC10000l.Signature(j, bArr, (8 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return 571;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        long[] jArr = new long[9];
        AbstractC10774l.vip(this.f22089l, ((C10957l) abstractC2426l).f22089l, jArr);
        return new C10957l(jArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        long[] jArr = this.f22089l;
        if (jArr[0] == 1) {
            for (int i = 1; i < 9; i++) {
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

    public C10957l(long[] jArr) {
        super(3);
        this.f22089l = jArr;
    }
}
