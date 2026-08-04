package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lًٌٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8649l extends AbstractC14331l {

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final BigInteger f17821l = new BigInteger(1, AbstractC8535l.crashlytics("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int[] f17822l;

    public C8649l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f17821l) >= 0) {
            C8339l.metrica("x value invalid for SecP128R1FieldElement");
            throw null;
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            C11983l.crashlytics();
            throw null;
        }
        int[] iArr = new int[4];
        for (int i = 0; i < 4; i++) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        if ((iArr[3] >>> 1) >= 2147483646) {
            int[] iArr2 = AbstractC15497l.yandex;
            if (AbstractC9168l.billing(iArr, iArr2)) {
                long j = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
                iArr[0] = (int) j;
                long j2 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j >> 32);
                iArr[1] = (int) j2;
                long j3 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j2 >> 32);
                iArr[2] = (int) j3;
                iArr[3] = (int) (((((long) iArr[3]) & 4294967295L) - (4294967295L & ((long) iArr2[3]))) + (j3 >> 32));
            }
        }
        this.f17822l = iArr;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        int[] iArr = this.f17822l;
        if (AbstractC9168l.admob(iArr) || AbstractC9168l.mopub(iArr)) {
            return this;
        }
        int[] iArr2 = new int[4];
        AbstractC15497l.remoteconfig(iArr, iArr2);
        AbstractC15497l.admob(iArr2, iArr, iArr2);
        int[] iArr3 = new int[4];
        AbstractC15497l.vip(2, iArr2, iArr3);
        AbstractC15497l.admob(iArr3, iArr2, iArr3);
        int[] iArr4 = new int[4];
        AbstractC15497l.vip(4, iArr3, iArr4);
        AbstractC15497l.admob(iArr4, iArr3, iArr4);
        AbstractC15497l.vip(2, iArr4, iArr3);
        AbstractC15497l.admob(iArr3, iArr2, iArr3);
        AbstractC15497l.vip(10, iArr3, iArr2);
        AbstractC15497l.admob(iArr2, iArr3, iArr2);
        AbstractC15497l.vip(10, iArr2, iArr4);
        AbstractC15497l.admob(iArr4, iArr3, iArr4);
        AbstractC15497l.remoteconfig(iArr4, iArr3);
        AbstractC15497l.admob(iArr3, iArr, iArr3);
        AbstractC15497l.vip(95, iArr3, iArr3);
        AbstractC15497l.remoteconfig(iArr3, iArr4);
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr4[i]) {
                return null;
            }
        }
        return new C8649l(iArr3);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l admob(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[4];
        AbstractC6974l.loadAd(AbstractC15497l.yandex, ((C8649l) abstractC2426l).f17822l, iArr);
        AbstractC15497l.admob(iArr, this.f17822l, iArr);
        return new C8649l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l advert(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[4];
        AbstractC15497l.metrica(this.f17822l, ((C8649l) abstractC2426l).f17822l, iArr);
        return new C8649l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[4];
        AbstractC15497l.amazon(this.f17822l, ((C8649l) abstractC2426l).f17822l, iArr);
        return new C8649l(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8649l)) {
            return false;
        }
        int[] iArr = ((C8649l) obj).f17822l;
        for (int i = 3; i >= 0; i--) {
            if (this.f17822l[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC14024l.subscription(this.f17822l, 4) ^ f17821l.hashCode();
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return (this.f17822l[0] & 1) == 1;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        int[] iArr = new int[4];
        AbstractC15497l.remoteconfig(this.f17822l, iArr);
        return new C8649l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        return AbstractC9168l.admob(this.f17822l);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        int[] iArr = new int[4];
        if (AbstractC4952l.ads(4, this.f17822l, iArr) != 0 || ((iArr[3] >>> 1) >= 2147483646 && AbstractC9168l.billing(iArr, AbstractC15497l.yandex))) {
            AbstractC15497l.purchase(iArr);
        }
        return new C8649l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        int[] iArr = new int[4];
        AbstractC6974l.loadAd(AbstractC15497l.yandex, this.f17822l, iArr);
        return new C8649l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = this.f17822l[i];
            if (i2 != 0) {
                AbstractC10000l.isPro(i2, (3 - i) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return f17821l.bitLength();
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[4];
        AbstractC15497l.admob(this.f17822l, ((C8649l) abstractC2426l).f17822l, iArr);
        return new C8649l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l subscription() {
        int[] iArr = new int[4];
        int[] iArr2 = this.f17822l;
        int iSmaato = AbstractC4952l.smaato(iArr2, 4);
        int[] iArr3 = AbstractC15497l.yandex;
        if (iSmaato != 0) {
            AbstractC9168l.firebase(iArr3, iArr3, iArr);
        } else {
            AbstractC9168l.firebase(iArr3, iArr2, iArr);
        }
        return new C8649l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        return AbstractC9168l.mopub(this.f17822l);
    }

    public C8649l(int[] iArr) {
        super(3);
        this.f17822l = iArr;
    }
}
