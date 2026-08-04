package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؚؖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3849l extends AbstractC14331l {

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final BigInteger f7954l = new BigInteger(1, AbstractC8535l.crashlytics("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"));

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int[] f7955l;

    public C3849l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f7954l) >= 0) {
            C8339l.metrica("x value invalid for SecP384R1FieldElement");
            throw null;
        }
        int[] iArrVip = AbstractC4952l.vip(384, bigInteger);
        if (iArrVip[11] == -1) {
            int[] iArr = AbstractC16817l.f32844l;
            if (AbstractC4952l.adcel(12, iArrVip, iArr)) {
                AbstractC4952l.m1652synchronized(12, iArr, iArrVip);
            }
        }
        this.f7955l = iArrVip;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        int[] iArr = this.f7955l;
        if (AbstractC4952l.pro(iArr, 12) || AbstractC4952l.license(iArr, 12)) {
            return this;
        }
        int[] iArr2 = new int[24];
        int[] iArr3 = new int[12];
        int[] iArr4 = new int[12];
        int[] iArr5 = new int[12];
        int[] iArr6 = new int[12];
        AbstractC15852l.amazon(iArr, iArr2);
        AbstractC16817l.smaato(iArr2, iArr3);
        AbstractC15852l.crashlytics(iArr3, iArr, iArr2);
        AbstractC16817l.smaato(iArr2, iArr3);
        AbstractC16817l.metrica(2, iArr3, iArr4, iArr2);
        AbstractC15852l.crashlytics(iArr4, iArr3, iArr2);
        AbstractC16817l.smaato(iArr2, iArr4);
        AbstractC15852l.amazon(iArr4, iArr2);
        AbstractC16817l.smaato(iArr2, iArr4);
        AbstractC15852l.crashlytics(iArr4, iArr, iArr2);
        AbstractC16817l.smaato(iArr2, iArr4);
        AbstractC16817l.metrica(5, iArr4, iArr5, iArr2);
        AbstractC15852l.crashlytics(iArr5, iArr4, iArr2);
        AbstractC16817l.smaato(iArr2, iArr5);
        AbstractC16817l.metrica(5, iArr5, iArr6, iArr2);
        AbstractC15852l.crashlytics(iArr6, iArr4, iArr2);
        AbstractC16817l.smaato(iArr2, iArr6);
        AbstractC16817l.metrica(15, iArr6, iArr4, iArr2);
        AbstractC15852l.crashlytics(iArr4, iArr6, iArr2);
        AbstractC16817l.smaato(iArr2, iArr4);
        AbstractC16817l.metrica(2, iArr4, iArr5, iArr2);
        AbstractC15852l.crashlytics(iArr3, iArr5, iArr2);
        AbstractC16817l.smaato(iArr2, iArr3);
        AbstractC16817l.metrica(28, iArr5, iArr5, iArr2);
        AbstractC15852l.crashlytics(iArr4, iArr5, iArr2);
        AbstractC16817l.smaato(iArr2, iArr4);
        AbstractC16817l.metrica(60, iArr4, iArr5, iArr2);
        AbstractC15852l.crashlytics(iArr5, iArr4, iArr2);
        AbstractC16817l.smaato(iArr2, iArr5);
        AbstractC16817l.metrica(120, iArr5, iArr4, iArr2);
        AbstractC15852l.crashlytics(iArr4, iArr5, iArr2);
        AbstractC16817l.smaato(iArr2, iArr4);
        AbstractC16817l.metrica(15, iArr4, iArr4, iArr2);
        AbstractC15852l.crashlytics(iArr4, iArr6, iArr2);
        AbstractC16817l.smaato(iArr2, iArr4);
        AbstractC16817l.metrica(33, iArr4, iArr4, iArr2);
        AbstractC15852l.crashlytics(iArr4, iArr3, iArr2);
        AbstractC16817l.smaato(iArr2, iArr4);
        AbstractC16817l.metrica(64, iArr4, iArr4, iArr2);
        AbstractC15852l.crashlytics(iArr4, iArr, iArr2);
        AbstractC16817l.smaato(iArr2, iArr4);
        AbstractC16817l.metrica(30, iArr4, iArr3, iArr2);
        AbstractC15852l.amazon(iArr3, iArr2);
        AbstractC16817l.smaato(iArr2, iArr4);
        if (AbstractC4952l.firebase(12, iArr, iArr4)) {
            return new C3849l(iArr3);
        }
        return null;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l admob(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[12];
        AbstractC6974l.loadAd(AbstractC16817l.f32844l, ((C3849l) abstractC2426l).f7955l, iArr);
        int[] iArr2 = new int[24];
        AbstractC15852l.crashlytics(iArr, this.f7955l, iArr2);
        AbstractC16817l.smaato(iArr2, iArr);
        return new C3849l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l advert(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[12];
        AbstractC16817l.adcel(this.f7955l, ((C3849l) abstractC2426l).f7955l, iArr);
        return new C3849l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[12];
        if (AbstractC4952l.crashlytics(12, this.f7955l, ((C3849l) abstractC2426l).f7955l, iArr) != 0 || (iArr[11] == -1 && AbstractC4952l.adcel(12, iArr, AbstractC16817l.f32844l))) {
            AbstractC16817l.billing(iArr);
        }
        return new C3849l(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3849l) {
            return AbstractC4952l.firebase(12, this.f7955l, ((C3849l) obj).f7955l);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC14024l.subscription(this.f7955l, 12) ^ f7954l.hashCode();
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return AbstractC4952l.startapp(this.f7955l) == 1;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        int[] iArr = new int[12];
        int[] iArr2 = new int[24];
        AbstractC15852l.amazon(this.f7955l, iArr2);
        AbstractC16817l.smaato(iArr2, iArr);
        return new C3849l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        return AbstractC4952l.pro(this.f7955l, 12);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        int[] iArr = new int[12];
        if (AbstractC4952l.ads(12, this.f7955l, iArr) != 0 || (iArr[11] == -1 && AbstractC4952l.adcel(12, iArr, AbstractC16817l.f32844l))) {
            AbstractC16817l.billing(iArr);
        }
        return new C3849l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        int[] iArr = new int[12];
        AbstractC6974l.loadAd(AbstractC16817l.f32844l, this.f7955l, iArr);
        return new C3849l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        return AbstractC4952l.m1651strictfp(this.f7955l, 12);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return f7954l.bitLength();
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[12];
        int[] iArr2 = new int[24];
        AbstractC15852l.crashlytics(this.f7955l, ((C3849l) abstractC2426l).f7955l, iArr2);
        AbstractC16817l.smaato(iArr2, iArr);
        return new C3849l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l subscription() {
        int[] iArr = new int[12];
        int[] iArr2 = this.f7955l;
        int iSmaato = AbstractC4952l.smaato(iArr2, 12);
        int[] iArr3 = AbstractC16817l.f32844l;
        if (iSmaato != 0) {
            AbstractC4952l.inmobi(12, iArr3, iArr3, iArr);
        } else {
            AbstractC4952l.inmobi(12, iArr3, iArr2, iArr);
        }
        return new C3849l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        return AbstractC4952l.license(this.f7955l, 12);
    }

    public C3849l(int[] iArr) {
        super(3);
        this.f7955l = iArr;
    }
}
