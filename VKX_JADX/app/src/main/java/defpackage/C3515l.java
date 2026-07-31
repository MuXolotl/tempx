package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٜؕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3515l extends AbstractC14331l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int[] f7408l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final BigInteger f7407l = AbstractC5998l.signatures(AbstractC0714l.yandex);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final int[] f7406l = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};

    public C3515l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f7407l) >= 0) {
            C8339l.metrica("x value invalid for Curve25519FieldElement");
            throw null;
        }
        int[] iArrRemoteconfig = AbstractC5998l.remoteconfig(bigInteger);
        while (true) {
            int[] iArr = AbstractC0714l.yandex;
            if (!AbstractC5998l.metrica(iArrRemoteconfig, iArr)) {
                this.f7408l = iArrRemoteconfig;
                return;
            }
            AbstractC5998l.isVip(iArr, iArrRemoteconfig);
        }
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        int[] iArr = this.f7408l;
        if (AbstractC5998l.ads(iArr) || AbstractC5998l.startapp(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        AbstractC0714l.subs(iArr, iArr2);
        AbstractC0714l.amazon(iArr2, iArr, iArr2);
        AbstractC0714l.subs(iArr2, iArr2);
        AbstractC0714l.amazon(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        AbstractC0714l.subs(iArr2, iArr3);
        AbstractC0714l.amazon(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        AbstractC0714l.isPro(3, iArr3, iArr4);
        AbstractC0714l.amazon(iArr4, iArr2, iArr4);
        AbstractC0714l.isPro(4, iArr4, iArr2);
        AbstractC0714l.amazon(iArr2, iArr3, iArr2);
        AbstractC0714l.isPro(4, iArr2, iArr4);
        AbstractC0714l.amazon(iArr4, iArr3, iArr4);
        AbstractC0714l.isPro(15, iArr4, iArr3);
        AbstractC0714l.amazon(iArr3, iArr4, iArr3);
        AbstractC0714l.isPro(30, iArr3, iArr4);
        AbstractC0714l.amazon(iArr4, iArr3, iArr4);
        AbstractC0714l.isPro(60, iArr4, iArr3);
        AbstractC0714l.amazon(iArr3, iArr4, iArr3);
        AbstractC0714l.isPro(11, iArr3, iArr4);
        AbstractC0714l.amazon(iArr4, iArr2, iArr4);
        AbstractC0714l.isPro(120, iArr4, iArr2);
        AbstractC0714l.amazon(iArr2, iArr3, iArr2);
        AbstractC0714l.subs(iArr2, iArr2);
        AbstractC0714l.subs(iArr2, iArr3);
        if (AbstractC5998l.firebase(iArr, iArr3)) {
            return new C3515l(iArr2);
        }
        AbstractC0714l.amazon(iArr2, f7406l, iArr2);
        AbstractC0714l.subs(iArr2, iArr3);
        if (AbstractC5998l.firebase(iArr, iArr3)) {
            return new C3515l(iArr2);
        }
        return null;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l admob(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[8];
        AbstractC6974l.loadAd(AbstractC0714l.yandex, ((C3515l) abstractC2426l).f7408l, iArr);
        AbstractC0714l.amazon(iArr, this.f7408l, iArr);
        return new C3515l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l advert(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[8];
        AbstractC0714l.smaato(this.f7408l, ((C3515l) abstractC2426l).f7408l, iArr);
        return new C3515l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[8];
        AbstractC5998l.loadAd(this.f7408l, ((C3515l) abstractC2426l).f7408l, iArr);
        if (AbstractC5998l.metrica(iArr, AbstractC0714l.yandex)) {
            AbstractC0714l.firebase(iArr);
        }
        return new C3515l(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3515l) {
            return AbstractC5998l.firebase(this.f7408l, ((C3515l) obj).f7408l);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC14024l.subscription(this.f7408l, 8) ^ f7407l.hashCode();
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return AbstractC5998l.vip(this.f7408l) == 1;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        int[] iArr = new int[8];
        AbstractC0714l.subs(this.f7408l, iArr);
        return new C3515l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        return AbstractC5998l.ads(this.f7408l);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        int[] iArr = new int[8];
        AbstractC4952l.ads(8, this.f7408l, iArr);
        if (AbstractC5998l.metrica(iArr, AbstractC0714l.yandex)) {
            AbstractC0714l.firebase(iArr);
        }
        return new C3515l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        int[] iArr = new int[8];
        AbstractC6974l.loadAd(AbstractC0714l.yandex, this.f7408l, iArr);
        return new C3515l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        return AbstractC5998l.signatures(this.f7408l);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return f7407l.bitLength();
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[8];
        AbstractC0714l.amazon(this.f7408l, ((C3515l) abstractC2426l).f7408l, iArr);
        return new C3515l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l subscription() {
        int[] iArr = new int[8];
        int[] iArr2 = this.f7408l;
        int iSmaato = AbstractC4952l.smaato(iArr2, 8);
        int[] iArr3 = AbstractC0714l.yandex;
        if (iSmaato != 0) {
            AbstractC5998l.ad(iArr3, iArr3, iArr);
        } else {
            AbstractC5998l.ad(iArr3, iArr2, iArr);
        }
        return new C3515l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        return AbstractC5998l.startapp(this.f7408l);
    }

    public C3515l(int[] iArr) {
        super(3);
        this.f7408l = iArr;
    }
}
