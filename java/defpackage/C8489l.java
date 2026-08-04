package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٌۣؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8489l extends AbstractC14331l {

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final BigInteger f17544l = new BigInteger(1, AbstractC8535l.crashlytics("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int[] f17545l;

    public C8489l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f17544l) >= 0) {
            C8339l.metrica("x value invalid for SecP521R1FieldElement");
            throw null;
        }
        int[] iArrVip = AbstractC4952l.vip(521, bigInteger);
        if (AbstractC4952l.firebase(17, iArrVip, AbstractC11994l.yandex)) {
            for (int i = 0; i < 17; i++) {
                iArrVip[i] = 0;
            }
        }
        this.f17545l = iArrVip;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        int[] iArr = this.f17545l;
        if (AbstractC4952l.pro(iArr, 17) || AbstractC4952l.license(iArr, 17)) {
            return this;
        }
        int[] iArr2 = new int[33];
        int[] iArr3 = new int[17];
        int[] iArr4 = new int[17];
        AbstractC11994l.mopub(iArr, iArr2);
        AbstractC11994l.isPro(iArr2, iArr3);
        int i = 519;
        while (true) {
            i--;
            if (i <= 0) {
                break;
            }
            AbstractC11994l.mopub(iArr3, iArr2);
            AbstractC11994l.isPro(iArr2, iArr3);
        }
        AbstractC11994l.mopub(iArr3, iArr2);
        AbstractC11994l.isPro(iArr2, iArr4);
        if (AbstractC4952l.firebase(17, iArr, iArr4)) {
            return new C8489l(iArr3);
        }
        return null;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l admob(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[17];
        AbstractC6974l.loadAd(AbstractC11994l.yandex, ((C8489l) abstractC2426l).f17545l, iArr);
        int[] iArr2 = new int[33];
        AbstractC11994l.billing(iArr, this.f17545l, iArr2);
        AbstractC11994l.isPro(iArr2, iArr);
        return new C8489l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l advert(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[17];
        AbstractC11994l.remoteconfig(this.f17545l, ((C8489l) abstractC2426l).f17545l, iArr);
        return new C8489l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[17];
        AbstractC11994l.yandex(this.f17545l, ((C8489l) abstractC2426l).f17545l, iArr);
        return new C8489l(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8489l) {
            return AbstractC4952l.firebase(17, this.f17545l, ((C8489l) obj).f17545l);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC14024l.subscription(this.f17545l, 17) ^ f17544l.hashCode();
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return AbstractC4952l.startapp(this.f17545l) == 1;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        int[] iArr = new int[17];
        int[] iArr2 = new int[33];
        AbstractC11994l.mopub(this.f17545l, iArr2);
        AbstractC11994l.isPro(iArr2, iArr);
        return new C8489l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        return AbstractC4952l.pro(this.f17545l, 17);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        int[] iArr = new int[17];
        int[] iArr2 = this.f17545l;
        int iAds = AbstractC4952l.ads(16, iArr2, iArr) + iArr2[16];
        if (iAds > 511 || (iAds == 511 && AbstractC4952l.firebase(16, iArr, AbstractC11994l.yandex))) {
            iAds = (AbstractC4952l.subscription(iArr) + iAds) & 511;
        }
        iArr[16] = iAds;
        return new C8489l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        int[] iArr = new int[17];
        AbstractC6974l.loadAd(AbstractC11994l.yandex, this.f17545l, iArr);
        return new C8489l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        return AbstractC4952l.m1651strictfp(this.f17545l, 17);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return f17544l.bitLength();
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[17];
        int[] iArr2 = new int[33];
        AbstractC11994l.billing(this.f17545l, ((C8489l) abstractC2426l).f17545l, iArr2);
        AbstractC11994l.isPro(iArr2, iArr);
        return new C8489l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l subscription() {
        int[] iArr = new int[17];
        int[] iArr2 = this.f17545l;
        int iSmaato = AbstractC4952l.smaato(iArr2, 17);
        int[] iArr3 = AbstractC11994l.yandex;
        if (iSmaato != 0) {
            AbstractC4952l.inmobi(17, iArr3, iArr3, iArr);
        } else {
            AbstractC4952l.inmobi(17, iArr3, iArr2, iArr);
        }
        return new C8489l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        return AbstractC4952l.license(this.f17545l, 17);
    }

    public C8489l(int[] iArr) {
        super(3);
        this.f17545l = iArr;
    }
}
