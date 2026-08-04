package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٜؑٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0448l extends AbstractC14331l {

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final BigInteger f1629l = new BigInteger(1, AbstractC8535l.crashlytics("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int[] f1630l;

    public C0448l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f1629l) >= 0) {
            C8339l.metrica("x value invalid for SecP160R1FieldElement");
            throw null;
        }
        int[] iArrBilling = C16050l.billing(bigInteger);
        if (iArrBilling[4] == -1) {
            int[] iArr = AbstractC3979l.yandex;
            if (C16050l.admob(iArrBilling, iArr)) {
                C16050l.startapp(iArr, iArrBilling);
            }
        }
        this.f1630l = iArrBilling;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        int[] iArr = this.f1630l;
        if (C16050l.firebase(iArr) || C16050l.isPro(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        AbstractC3979l.vip(iArr, iArr2);
        AbstractC3979l.firebase(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        AbstractC3979l.metrica(2, iArr2, iArr3);
        AbstractC3979l.firebase(iArr3, iArr2, iArr3);
        AbstractC3979l.metrica(4, iArr3, iArr2);
        AbstractC3979l.firebase(iArr2, iArr3, iArr2);
        AbstractC3979l.metrica(8, iArr2, iArr3);
        AbstractC3979l.firebase(iArr3, iArr2, iArr3);
        AbstractC3979l.metrica(16, iArr3, iArr2);
        AbstractC3979l.firebase(iArr2, iArr3, iArr2);
        AbstractC3979l.metrica(32, iArr2, iArr3);
        AbstractC3979l.firebase(iArr3, iArr2, iArr3);
        AbstractC3979l.metrica(64, iArr3, iArr2);
        AbstractC3979l.firebase(iArr2, iArr3, iArr2);
        AbstractC3979l.vip(iArr2, iArr3);
        AbstractC3979l.firebase(iArr3, iArr, iArr3);
        AbstractC3979l.metrica(29, iArr3, iArr3);
        AbstractC3979l.vip(iArr3, iArr2);
        if (C16050l.purchase(iArr, iArr2)) {
            return new C0448l(iArr3);
        }
        return null;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l admob(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[5];
        AbstractC6974l.loadAd(AbstractC3979l.yandex, ((C0448l) abstractC2426l).f1630l, iArr);
        AbstractC3979l.firebase(iArr, this.f1630l, iArr);
        return new C0448l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l advert(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[5];
        AbstractC3979l.ads(this.f1630l, ((C0448l) abstractC2426l).f1630l, iArr);
        return new C0448l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[5];
        if (C16050l.yandex(this.f1630l, ((C0448l) abstractC2426l).f1630l, iArr) != 0 || (iArr[4] == -1 && C16050l.admob(iArr, AbstractC3979l.yandex))) {
            AbstractC4952l.subs(5, -2147483647, iArr);
        }
        return new C0448l(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0448l) {
            return C16050l.purchase(this.f1630l, ((C0448l) obj).f1630l);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC14024l.subscription(this.f1630l, 5) ^ f1629l.hashCode();
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return C16050l.mopub(this.f1630l) == 1;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        int[] iArr = new int[5];
        AbstractC3979l.vip(this.f1630l, iArr);
        return new C0448l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        return C16050l.firebase(this.f1630l);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        int[] iArr = new int[5];
        if (AbstractC4952l.ads(5, this.f1630l, iArr) != 0 || (iArr[4] == -1 && C16050l.admob(iArr, AbstractC3979l.yandex))) {
            AbstractC4952l.subs(5, -2147483647, iArr);
        }
        return new C0448l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        int[] iArr = new int[5];
        AbstractC6974l.loadAd(AbstractC3979l.yandex, this.f1630l, iArr);
        return new C0448l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        return C16050l.subscription(this.f1630l);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return f1629l.bitLength();
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[5];
        AbstractC3979l.firebase(this.f1630l, ((C0448l) abstractC2426l).f1630l, iArr);
        return new C0448l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l subscription() {
        int[] iArr = new int[5];
        int[] iArr2 = this.f1630l;
        int iSmaato = AbstractC4952l.smaato(iArr2, 5);
        int[] iArr3 = AbstractC3979l.yandex;
        if (iSmaato != 0) {
            C16050l.metrica(iArr3, iArr3, iArr);
        } else {
            C16050l.metrica(iArr3, iArr2, iArr);
        }
        return new C0448l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        return C16050l.isPro(this.f1630l);
    }

    public C0448l(int[] iArr) {
        super(3);
        this.f1630l = iArr;
    }
}
