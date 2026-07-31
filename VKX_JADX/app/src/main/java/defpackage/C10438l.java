package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lَٕٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10438l extends AbstractC14331l {

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final BigInteger f21254l = new BigInteger(1, AbstractC8535l.crashlytics("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int[] f21255l;

    public C10438l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f21254l) >= 0) {
            C8339l.metrica("x value invalid for SecP256R1FieldElement");
            throw null;
        }
        int[] iArrRemoteconfig = AbstractC5998l.remoteconfig(bigInteger);
        if (iArrRemoteconfig[7] == -1) {
            int[] iArr = AbstractC3461l.yandex;
            if (AbstractC5998l.metrica(iArrRemoteconfig, iArr)) {
                AbstractC5998l.isVip(iArr, iArrRemoteconfig);
            }
        }
        this.f21255l = iArrRemoteconfig;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        int[] iArr = this.f21255l;
        if (AbstractC5998l.ads(iArr) || AbstractC5998l.startapp(iArr)) {
            return this;
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[8];
        int[] iArr4 = new int[8];
        AbstractC5998l.pro(iArr, iArr2);
        AbstractC3461l.subs(iArr2, iArr3);
        AbstractC5998l.tapsense(iArr3, iArr, iArr2);
        AbstractC3461l.subs(iArr2, iArr3);
        AbstractC3461l.firebase(2, iArr3, iArr4, iArr2);
        AbstractC5998l.tapsense(iArr4, iArr3, iArr2);
        AbstractC3461l.subs(iArr2, iArr4);
        AbstractC3461l.firebase(4, iArr4, iArr3, iArr2);
        AbstractC5998l.tapsense(iArr3, iArr4, iArr2);
        AbstractC3461l.subs(iArr2, iArr3);
        AbstractC3461l.firebase(8, iArr3, iArr4, iArr2);
        AbstractC5998l.tapsense(iArr4, iArr3, iArr2);
        AbstractC3461l.subs(iArr2, iArr4);
        AbstractC3461l.firebase(16, iArr4, iArr3, iArr2);
        AbstractC5998l.tapsense(iArr3, iArr4, iArr2);
        AbstractC3461l.subs(iArr2, iArr3);
        AbstractC3461l.firebase(32, iArr3, iArr3, iArr2);
        AbstractC5998l.tapsense(iArr3, iArr, iArr2);
        AbstractC3461l.subs(iArr2, iArr3);
        AbstractC3461l.firebase(96, iArr3, iArr3, iArr2);
        AbstractC5998l.tapsense(iArr3, iArr, iArr2);
        AbstractC3461l.subs(iArr2, iArr3);
        AbstractC3461l.firebase(94, iArr3, iArr3, iArr2);
        AbstractC5998l.pro(iArr3, iArr2);
        AbstractC3461l.subs(iArr2, iArr4);
        if (AbstractC5998l.firebase(iArr, iArr4)) {
            return new C10438l(iArr3);
        }
        return null;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l admob(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[8];
        AbstractC6974l.loadAd(AbstractC3461l.yandex, ((C10438l) abstractC2426l).f21255l, iArr);
        int[] iArr2 = new int[16];
        AbstractC5998l.tapsense(iArr, this.f21255l, iArr2);
        AbstractC3461l.subs(iArr2, iArr);
        return new C10438l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l advert(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[8];
        AbstractC3461l.smaato(this.f21255l, ((C10438l) abstractC2426l).f21255l, iArr);
        return new C10438l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[8];
        if (AbstractC5998l.loadAd(this.f21255l, ((C10438l) abstractC2426l).f21255l, iArr) != 0 || (iArr[7] == -1 && AbstractC5998l.metrica(iArr, AbstractC3461l.yandex))) {
            AbstractC3461l.yandex(iArr);
        }
        return new C10438l(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10438l) {
            return AbstractC5998l.firebase(this.f21255l, ((C10438l) obj).f21255l);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC14024l.subscription(this.f21255l, 8) ^ f21254l.hashCode();
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return AbstractC5998l.vip(this.f21255l) == 1;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        int[] iArr = new int[8];
        int[] iArr2 = new int[16];
        AbstractC5998l.pro(this.f21255l, iArr2);
        AbstractC3461l.subs(iArr2, iArr);
        return new C10438l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        return AbstractC5998l.ads(this.f21255l);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        int[] iArr = new int[8];
        if (AbstractC4952l.ads(8, this.f21255l, iArr) != 0 || (iArr[7] == -1 && AbstractC5998l.metrica(iArr, AbstractC3461l.yandex))) {
            AbstractC3461l.yandex(iArr);
        }
        return new C10438l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        int[] iArr = new int[8];
        AbstractC6974l.loadAd(AbstractC3461l.yandex, this.f21255l, iArr);
        return new C10438l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        return AbstractC5998l.signatures(this.f21255l);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return f21254l.bitLength();
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[8];
        int[] iArr2 = new int[16];
        AbstractC5998l.tapsense(this.f21255l, ((C10438l) abstractC2426l).f21255l, iArr2);
        AbstractC3461l.subs(iArr2, iArr);
        return new C10438l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l subscription() {
        int[] iArr = new int[8];
        int[] iArr2 = this.f21255l;
        int iSmaato = AbstractC4952l.smaato(iArr2, 8);
        int[] iArr3 = AbstractC3461l.yandex;
        if (iSmaato != 0) {
            AbstractC5998l.ad(iArr3, iArr3, iArr);
        } else {
            AbstractC5998l.ad(iArr3, iArr2, iArr);
        }
        return new C10438l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        return AbstractC5998l.startapp(this.f21255l);
    }

    public C10438l(int[] iArr) {
        super(3);
        this.f21255l = iArr;
    }
}
