package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؘؘٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5489l extends AbstractC14331l {

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final BigInteger f11743l = new BigInteger(1, AbstractC8535l.crashlytics("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int[] f11744l;

    public C5489l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f11743l) >= 0) {
            C8339l.metrica("x value invalid for SecP160R2FieldElement");
            throw null;
        }
        int[] iArrBilling = C16050l.billing(bigInteger);
        if (iArrBilling[4] == -1) {
            int[] iArr = AbstractC10392l.yandex;
            if (C16050l.admob(iArrBilling, iArr)) {
                C16050l.startapp(iArr, iArrBilling);
            }
        }
        this.f11744l = iArrBilling;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        int[] iArr = this.f11744l;
        if (C16050l.firebase(iArr) || C16050l.isPro(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        AbstractC10392l.admob(iArr, iArr2);
        AbstractC10392l.amazon(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        AbstractC10392l.admob(iArr2, iArr3);
        AbstractC10392l.amazon(iArr3, iArr, iArr3);
        int[] iArr4 = new int[5];
        AbstractC10392l.admob(iArr3, iArr4);
        AbstractC10392l.amazon(iArr4, iArr, iArr4);
        int[] iArr5 = new int[5];
        AbstractC10392l.subs(3, iArr4, iArr5);
        AbstractC10392l.amazon(iArr5, iArr3, iArr5);
        AbstractC10392l.subs(7, iArr5, iArr4);
        AbstractC10392l.amazon(iArr4, iArr5, iArr4);
        AbstractC10392l.subs(3, iArr4, iArr5);
        AbstractC10392l.amazon(iArr5, iArr3, iArr5);
        int[] iArr6 = new int[5];
        AbstractC10392l.subs(14, iArr5, iArr6);
        AbstractC10392l.amazon(iArr6, iArr4, iArr6);
        AbstractC10392l.subs(31, iArr6, iArr4);
        AbstractC10392l.amazon(iArr4, iArr6, iArr4);
        AbstractC10392l.subs(62, iArr4, iArr6);
        AbstractC10392l.amazon(iArr6, iArr4, iArr6);
        AbstractC10392l.subs(3, iArr6, iArr4);
        AbstractC10392l.amazon(iArr4, iArr3, iArr4);
        AbstractC10392l.subs(18, iArr4, iArr4);
        AbstractC10392l.amazon(iArr4, iArr5, iArr4);
        AbstractC10392l.subs(2, iArr4, iArr4);
        AbstractC10392l.amazon(iArr4, iArr, iArr4);
        AbstractC10392l.subs(3, iArr4, iArr4);
        AbstractC10392l.amazon(iArr4, iArr2, iArr4);
        AbstractC10392l.subs(6, iArr4, iArr4);
        AbstractC10392l.amazon(iArr4, iArr3, iArr4);
        AbstractC10392l.subs(2, iArr4, iArr4);
        AbstractC10392l.amazon(iArr4, iArr, iArr4);
        AbstractC10392l.admob(iArr4, iArr2);
        if (C16050l.purchase(iArr, iArr2)) {
            return new C5489l(iArr4);
        }
        return null;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l admob(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[5];
        AbstractC6974l.loadAd(AbstractC10392l.yandex, ((C5489l) abstractC2426l).f11744l, iArr);
        AbstractC10392l.amazon(iArr, this.f11744l, iArr);
        return new C5489l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l advert(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[5];
        AbstractC10392l.isPro(this.f11744l, ((C5489l) abstractC2426l).f11744l, iArr);
        return new C5489l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[5];
        if (C16050l.yandex(this.f11744l, ((C5489l) abstractC2426l).f11744l, iArr) != 0 || (iArr[4] == -1 && C16050l.admob(iArr, AbstractC10392l.yandex))) {
            AbstractC4952l.amazon(5, 21389, iArr);
        }
        return new C5489l(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5489l) {
            return C16050l.purchase(this.f11744l, ((C5489l) obj).f11744l);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC14024l.subscription(this.f11744l, 5) ^ f11743l.hashCode();
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return C16050l.mopub(this.f11744l) == 1;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        int[] iArr = new int[5];
        AbstractC10392l.admob(this.f11744l, iArr);
        return new C5489l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        return C16050l.firebase(this.f11744l);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        int[] iArr = new int[5];
        if (AbstractC4952l.ads(5, this.f11744l, iArr) != 0 || (iArr[4] == -1 && C16050l.admob(iArr, AbstractC10392l.yandex))) {
            AbstractC4952l.amazon(5, 21389, iArr);
        }
        return new C5489l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        int[] iArr = new int[5];
        AbstractC6974l.loadAd(AbstractC10392l.yandex, this.f11744l, iArr);
        return new C5489l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        return C16050l.subscription(this.f11744l);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return f11743l.bitLength();
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[5];
        AbstractC10392l.amazon(this.f11744l, ((C5489l) abstractC2426l).f11744l, iArr);
        return new C5489l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l subscription() {
        int[] iArr = new int[5];
        int[] iArr2 = this.f11744l;
        int iSmaato = AbstractC4952l.smaato(iArr2, 5);
        int[] iArr3 = AbstractC10392l.yandex;
        if (iSmaato != 0) {
            C16050l.metrica(iArr3, iArr3, iArr);
        } else {
            C16050l.metrica(iArr3, iArr2, iArr);
        }
        return new C5489l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        return C16050l.isPro(this.f11744l);
    }

    public C5489l(int[] iArr) {
        super(3);
        this.f11744l = iArr;
    }
}
