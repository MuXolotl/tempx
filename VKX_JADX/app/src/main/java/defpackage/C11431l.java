package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٍُۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11431l extends AbstractC14331l {

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final BigInteger f23004l = new BigInteger(1, AbstractC8535l.crashlytics("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int[] f23005l;

    public C11431l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f23004l) >= 0) {
            C8339l.metrica("x value invalid for SecP256K1FieldElement");
            throw null;
        }
        int[] iArrRemoteconfig = AbstractC5998l.remoteconfig(bigInteger);
        if (iArrRemoteconfig[7] == -1) {
            int[] iArr = AbstractC12359l.yandex;
            if (AbstractC5998l.metrica(iArrRemoteconfig, iArr)) {
                AbstractC5998l.isVip(iArr, iArrRemoteconfig);
            }
        }
        this.f23005l = iArrRemoteconfig;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        int[] iArr = this.f23005l;
        if (AbstractC5998l.ads(iArr) || AbstractC5998l.startapp(iArr)) {
            return this;
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[8];
        AbstractC5998l.pro(iArr, iArr2);
        AbstractC12359l.purchase(iArr2, iArr3);
        AbstractC5998l.tapsense(iArr3, iArr, iArr2);
        AbstractC12359l.purchase(iArr2, iArr3);
        int[] iArr4 = new int[8];
        AbstractC5998l.pro(iArr3, iArr2);
        AbstractC12359l.purchase(iArr2, iArr4);
        AbstractC5998l.tapsense(iArr4, iArr, iArr2);
        AbstractC12359l.purchase(iArr2, iArr4);
        int[] iArr5 = new int[8];
        AbstractC12359l.mopub(3, iArr4, iArr5, iArr2);
        AbstractC5998l.tapsense(iArr5, iArr4, iArr2);
        AbstractC12359l.purchase(iArr2, iArr5);
        AbstractC12359l.mopub(3, iArr5, iArr5, iArr2);
        AbstractC5998l.tapsense(iArr5, iArr4, iArr2);
        AbstractC12359l.purchase(iArr2, iArr5);
        AbstractC12359l.mopub(2, iArr5, iArr5, iArr2);
        AbstractC5998l.tapsense(iArr5, iArr3, iArr2);
        AbstractC12359l.purchase(iArr2, iArr5);
        int[] iArr6 = new int[8];
        AbstractC12359l.mopub(11, iArr5, iArr6, iArr2);
        AbstractC5998l.tapsense(iArr6, iArr5, iArr2);
        AbstractC12359l.purchase(iArr2, iArr6);
        AbstractC12359l.mopub(22, iArr6, iArr5, iArr2);
        AbstractC5998l.tapsense(iArr5, iArr6, iArr2);
        AbstractC12359l.purchase(iArr2, iArr5);
        int[] iArr7 = new int[8];
        AbstractC12359l.mopub(44, iArr5, iArr7, iArr2);
        AbstractC5998l.tapsense(iArr7, iArr5, iArr2);
        AbstractC12359l.purchase(iArr2, iArr7);
        int[] iArr8 = new int[8];
        AbstractC12359l.mopub(88, iArr7, iArr8, iArr2);
        AbstractC5998l.tapsense(iArr8, iArr7, iArr2);
        AbstractC12359l.purchase(iArr2, iArr8);
        AbstractC12359l.mopub(44, iArr8, iArr7, iArr2);
        AbstractC5998l.tapsense(iArr7, iArr5, iArr2);
        AbstractC12359l.purchase(iArr2, iArr7);
        AbstractC12359l.mopub(3, iArr7, iArr5, iArr2);
        AbstractC5998l.tapsense(iArr5, iArr4, iArr2);
        AbstractC12359l.purchase(iArr2, iArr5);
        AbstractC12359l.mopub(23, iArr5, iArr5, iArr2);
        AbstractC5998l.tapsense(iArr5, iArr6, iArr2);
        AbstractC12359l.purchase(iArr2, iArr5);
        AbstractC12359l.mopub(6, iArr5, iArr5, iArr2);
        AbstractC5998l.tapsense(iArr5, iArr3, iArr2);
        AbstractC12359l.purchase(iArr2, iArr5);
        AbstractC12359l.mopub(2, iArr5, iArr5, iArr2);
        AbstractC5998l.pro(iArr5, iArr2);
        AbstractC12359l.purchase(iArr2, iArr3);
        if (AbstractC5998l.firebase(iArr, iArr3)) {
            return new C11431l(iArr5);
        }
        return null;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l admob(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[8];
        AbstractC6974l.loadAd(AbstractC12359l.yandex, ((C11431l) abstractC2426l).f23005l, iArr);
        int[] iArr2 = new int[16];
        AbstractC5998l.tapsense(iArr, this.f23005l, iArr2);
        AbstractC12359l.purchase(iArr2, iArr);
        return new C11431l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l advert(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[8];
        AbstractC12359l.admob(this.f23005l, ((C11431l) abstractC2426l).f23005l, iArr);
        return new C11431l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[8];
        if (AbstractC5998l.loadAd(this.f23005l, ((C11431l) abstractC2426l).f23005l, iArr) != 0 || (iArr[7] == -1 && AbstractC5998l.metrica(iArr, AbstractC12359l.yandex))) {
            AbstractC4952l.amazon(8, 977, iArr);
        }
        return new C11431l(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11431l) {
            return AbstractC5998l.firebase(this.f23005l, ((C11431l) obj).f23005l);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC14024l.subscription(this.f23005l, 8) ^ f23004l.hashCode();
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return AbstractC5998l.vip(this.f23005l) == 1;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        int[] iArr = new int[8];
        int[] iArr2 = new int[16];
        AbstractC5998l.pro(this.f23005l, iArr2);
        AbstractC12359l.purchase(iArr2, iArr);
        return new C11431l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        return AbstractC5998l.ads(this.f23005l);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        int[] iArr = new int[8];
        if (AbstractC4952l.ads(8, this.f23005l, iArr) != 0 || (iArr[7] == -1 && AbstractC5998l.metrica(iArr, AbstractC12359l.yandex))) {
            AbstractC4952l.amazon(8, 977, iArr);
        }
        return new C11431l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        int[] iArr = new int[8];
        AbstractC6974l.loadAd(AbstractC12359l.yandex, this.f23005l, iArr);
        return new C11431l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        return AbstractC5998l.signatures(this.f23005l);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return f23004l.bitLength();
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[8];
        int[] iArr2 = new int[16];
        AbstractC5998l.tapsense(this.f23005l, ((C11431l) abstractC2426l).f23005l, iArr2);
        AbstractC12359l.purchase(iArr2, iArr);
        return new C11431l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l subscription() {
        int[] iArr = new int[8];
        int[] iArr2 = this.f23005l;
        int iSmaato = AbstractC4952l.smaato(iArr2, 8);
        int[] iArr3 = AbstractC12359l.yandex;
        if (iSmaato != 0) {
            AbstractC5998l.ad(iArr3, iArr3, iArr);
        } else {
            AbstractC5998l.ad(iArr3, iArr2, iArr);
        }
        return new C11431l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        return AbstractC5998l.startapp(this.f23005l);
    }

    public C11431l(int[] iArr) {
        super(3);
        this.f23005l = iArr;
    }
}
