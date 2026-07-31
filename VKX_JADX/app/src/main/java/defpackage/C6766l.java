package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؙۜۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6766l extends AbstractC14331l {

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final BigInteger f14175l = new BigInteger(1, AbstractC8535l.crashlytics("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int[] f14176l;

    public C6766l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f14175l) >= 0) {
            C8339l.metrica("x value invalid for SecP192R1FieldElement");
            throw null;
        }
        int[] iArrSmaato = AbstractC0079l.smaato(bigInteger);
        if (iArrSmaato[5] == -1) {
            int[] iArr = AbstractC14879l.yandex;
            if (AbstractC0079l.vip(iArrSmaato, iArr)) {
                AbstractC0079l.pro(iArr, iArrSmaato);
            }
        }
        this.f14176l = iArrSmaato;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        int[] iArr = this.f14176l;
        if (AbstractC0079l.startapp(iArr) || AbstractC0079l.metrica(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        AbstractC14879l.subs(iArr, iArr2);
        AbstractC14879l.crashlytics(iArr2, iArr, iArr2);
        AbstractC14879l.isPro(2, iArr2, iArr3);
        AbstractC14879l.crashlytics(iArr3, iArr2, iArr3);
        AbstractC14879l.isPro(4, iArr3, iArr2);
        AbstractC14879l.crashlytics(iArr2, iArr3, iArr2);
        AbstractC14879l.isPro(8, iArr2, iArr3);
        AbstractC14879l.crashlytics(iArr3, iArr2, iArr3);
        AbstractC14879l.isPro(16, iArr3, iArr2);
        AbstractC14879l.crashlytics(iArr2, iArr3, iArr2);
        AbstractC14879l.isPro(32, iArr2, iArr3);
        AbstractC14879l.crashlytics(iArr3, iArr2, iArr3);
        AbstractC14879l.isPro(64, iArr3, iArr2);
        AbstractC14879l.crashlytics(iArr2, iArr3, iArr2);
        AbstractC14879l.isPro(62, iArr2, iArr2);
        AbstractC14879l.subs(iArr2, iArr3);
        if (AbstractC0079l.firebase(iArr, iArr3)) {
            return new C6766l(iArr2);
        }
        return null;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l admob(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[6];
        AbstractC6974l.loadAd(AbstractC14879l.yandex, ((C6766l) abstractC2426l).f14176l, iArr);
        AbstractC14879l.crashlytics(iArr, this.f14176l, iArr);
        return new C6766l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l advert(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[6];
        AbstractC14879l.firebase(this.f14176l, ((C6766l) abstractC2426l).f14176l, iArr);
        return new C6766l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[6];
        if (AbstractC0079l.loadAd(this.f14176l, ((C6766l) abstractC2426l).f14176l, iArr) != 0 || (iArr[5] == -1 && AbstractC0079l.vip(iArr, AbstractC14879l.yandex))) {
            AbstractC14879l.yandex(iArr);
        }
        return new C6766l(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6766l) {
            return AbstractC0079l.firebase(this.f14176l, ((C6766l) obj).f14176l);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC14024l.subscription(this.f14176l, 6) ^ f14175l.hashCode();
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return AbstractC0079l.remoteconfig(this.f14176l) == 1;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        int[] iArr = new int[6];
        AbstractC14879l.subs(this.f14176l, iArr);
        return new C6766l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        return AbstractC0079l.startapp(this.f14176l);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        int[] iArr = new int[6];
        if (AbstractC4952l.ads(6, this.f14176l, iArr) != 0 || (iArr[5] == -1 && AbstractC0079l.vip(iArr, AbstractC14879l.yandex))) {
            AbstractC14879l.yandex(iArr);
        }
        return new C6766l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        int[] iArr = new int[6];
        AbstractC6974l.loadAd(AbstractC14879l.yandex, this.f14176l, iArr);
        return new C6766l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        return AbstractC0079l.ad(this.f14176l);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return f14175l.bitLength();
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[6];
        AbstractC14879l.crashlytics(this.f14176l, ((C6766l) abstractC2426l).f14176l, iArr);
        return new C6766l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l subscription() {
        int[] iArr = new int[6];
        int[] iArr2 = this.f14176l;
        int iSmaato = AbstractC4952l.smaato(iArr2, 6);
        int[] iArr3 = AbstractC14879l.yandex;
        if (iSmaato != 0) {
            AbstractC0079l.Signature(iArr3, iArr3, iArr);
        } else {
            AbstractC0079l.Signature(iArr3, iArr2, iArr);
        }
        return new C6766l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        return AbstractC0079l.metrica(this.f14176l);
    }

    public C6766l(int[] iArr) {
        super(3);
        this.f14176l = iArr;
    }
}
