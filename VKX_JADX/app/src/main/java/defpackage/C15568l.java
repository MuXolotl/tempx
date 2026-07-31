package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٌٕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15568l extends AbstractC14331l {

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final BigInteger f30405l = new BigInteger(1, AbstractC8535l.crashlytics("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int[] f30406l;

    public C15568l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f30405l) >= 0) {
            C8339l.metrica("x value invalid for SM2P256V1FieldElement");
            throw null;
        }
        int[] iArrRemoteconfig = AbstractC5998l.remoteconfig(bigInteger);
        if ((iArrRemoteconfig[7] >>> 1) >= Integer.MAX_VALUE) {
            int[] iArr = AbstractC14460l.yandex;
            if (AbstractC5998l.metrica(iArrRemoteconfig, iArr)) {
                AbstractC5998l.isVip(iArr, iArrRemoteconfig);
            }
        }
        this.f30406l = iArrRemoteconfig;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        int[] iArr = this.f30406l;
        if (AbstractC5998l.ads(iArr) || AbstractC5998l.startapp(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        AbstractC14460l.remoteconfig(iArr, iArr2);
        AbstractC14460l.subs(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        AbstractC14460l.vip(2, iArr2, iArr3);
        AbstractC14460l.subs(iArr3, iArr2, iArr3);
        int[] iArr4 = new int[8];
        AbstractC14460l.vip(2, iArr3, iArr4);
        AbstractC14460l.subs(iArr4, iArr2, iArr4);
        AbstractC14460l.vip(6, iArr4, iArr2);
        AbstractC14460l.subs(iArr2, iArr4, iArr2);
        int[] iArr5 = new int[8];
        AbstractC14460l.vip(12, iArr2, iArr5);
        AbstractC14460l.subs(iArr5, iArr2, iArr5);
        AbstractC14460l.vip(6, iArr5, iArr2);
        AbstractC14460l.subs(iArr2, iArr4, iArr2);
        AbstractC14460l.remoteconfig(iArr2, iArr4);
        AbstractC14460l.subs(iArr4, iArr, iArr4);
        AbstractC14460l.vip(31, iArr4, iArr5);
        AbstractC14460l.subs(iArr5, iArr4, iArr2);
        AbstractC14460l.vip(32, iArr5, iArr5);
        AbstractC14460l.subs(iArr5, iArr2, iArr5);
        AbstractC14460l.vip(62, iArr5, iArr5);
        AbstractC14460l.subs(iArr5, iArr2, iArr5);
        AbstractC14460l.vip(4, iArr5, iArr5);
        AbstractC14460l.subs(iArr5, iArr3, iArr5);
        AbstractC14460l.vip(32, iArr5, iArr5);
        AbstractC14460l.subs(iArr5, iArr, iArr5);
        AbstractC14460l.vip(62, iArr5, iArr5);
        AbstractC14460l.remoteconfig(iArr5, iArr3);
        if (AbstractC5998l.firebase(iArr, iArr3)) {
            return new C15568l(iArr5);
        }
        return null;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l admob(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[8];
        AbstractC6974l.loadAd(AbstractC14460l.yandex, ((C15568l) abstractC2426l).f30406l, iArr);
        AbstractC14460l.subs(iArr, this.f30406l, iArr);
        return new C15568l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l advert(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[8];
        AbstractC14460l.metrica(this.f30406l, ((C15568l) abstractC2426l).f30406l, iArr);
        return new C15568l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[8];
        AbstractC14460l.loadAd(this.f30406l, ((C15568l) abstractC2426l).f30406l, iArr);
        return new C15568l(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15568l) {
            return AbstractC5998l.firebase(this.f30406l, ((C15568l) obj).f30406l);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC14024l.subscription(this.f30406l, 8) ^ f30405l.hashCode();
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return AbstractC5998l.vip(this.f30406l) == 1;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        int[] iArr = new int[8];
        AbstractC14460l.remoteconfig(this.f30406l, iArr);
        return new C15568l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        return AbstractC5998l.ads(this.f30406l);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        int[] iArr = new int[8];
        if (AbstractC4952l.ads(8, this.f30406l, iArr) != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && AbstractC5998l.metrica(iArr, AbstractC14460l.yandex))) {
            AbstractC14460l.crashlytics(iArr);
        }
        return new C15568l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        int[] iArr = new int[8];
        AbstractC6974l.loadAd(AbstractC14460l.yandex, this.f30406l, iArr);
        return new C15568l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        return AbstractC5998l.signatures(this.f30406l);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return f30405l.bitLength();
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[8];
        AbstractC14460l.subs(this.f30406l, ((C15568l) abstractC2426l).f30406l, iArr);
        return new C15568l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l subscription() {
        int[] iArr = new int[8];
        int[] iArr2 = this.f30406l;
        int iSmaato = AbstractC4952l.smaato(iArr2, 8);
        int[] iArr3 = AbstractC14460l.yandex;
        if (iSmaato != 0) {
            AbstractC5998l.ad(iArr3, iArr3, iArr);
        } else {
            AbstractC5998l.ad(iArr3, iArr2, iArr);
        }
        return new C15568l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        return AbstractC5998l.startapp(this.f30406l);
    }

    public C15568l(int[] iArr) {
        super(3);
        this.f30406l = iArr;
    }
}
