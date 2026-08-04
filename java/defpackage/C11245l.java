package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lُٟۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11245l extends AbstractC14331l {

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final BigInteger f22637l = new BigInteger(1, AbstractC8535l.crashlytics("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int[] f22638l;

    public C11245l(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f22637l) >= 0) {
            C8339l.metrica("x value invalid for SecP192K1FieldElement");
            throw null;
        }
        int[] iArrSmaato = AbstractC0079l.smaato(bigInteger);
        if (iArrSmaato[5] == -1) {
            int[] iArr = AbstractC7574l.yandex;
            if (AbstractC0079l.vip(iArrSmaato, iArr)) {
                AbstractC0079l.pro(iArr, iArrSmaato);
            }
        }
        this.f22638l = iArrSmaato;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        int[] iArr = this.f22638l;
        if (AbstractC0079l.startapp(iArr) || AbstractC0079l.metrica(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        AbstractC7574l.admob(iArr, iArr2);
        AbstractC7574l.amazon(iArr2, iArr, iArr2);
        int[] iArr3 = new int[6];
        AbstractC7574l.admob(iArr2, iArr3);
        AbstractC7574l.amazon(iArr3, iArr, iArr3);
        int[] iArr4 = new int[6];
        AbstractC7574l.subs(3, iArr3, iArr4);
        AbstractC7574l.amazon(iArr4, iArr3, iArr4);
        AbstractC7574l.subs(2, iArr4, iArr4);
        AbstractC7574l.amazon(iArr4, iArr2, iArr4);
        AbstractC7574l.subs(8, iArr4, iArr2);
        AbstractC7574l.amazon(iArr2, iArr4, iArr2);
        AbstractC7574l.subs(3, iArr2, iArr4);
        AbstractC7574l.amazon(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[6];
        AbstractC7574l.subs(16, iArr4, iArr5);
        AbstractC7574l.amazon(iArr5, iArr2, iArr5);
        AbstractC7574l.subs(35, iArr5, iArr2);
        AbstractC7574l.amazon(iArr2, iArr5, iArr2);
        AbstractC7574l.subs(70, iArr2, iArr5);
        AbstractC7574l.amazon(iArr5, iArr2, iArr5);
        AbstractC7574l.subs(19, iArr5, iArr2);
        AbstractC7574l.amazon(iArr2, iArr4, iArr2);
        AbstractC7574l.subs(20, iArr2, iArr2);
        AbstractC7574l.amazon(iArr2, iArr4, iArr2);
        AbstractC7574l.subs(4, iArr2, iArr2);
        AbstractC7574l.amazon(iArr2, iArr3, iArr2);
        AbstractC7574l.subs(6, iArr2, iArr2);
        AbstractC7574l.amazon(iArr2, iArr3, iArr2);
        AbstractC7574l.admob(iArr2, iArr2);
        AbstractC7574l.admob(iArr2, iArr3);
        if (AbstractC0079l.firebase(iArr, iArr3)) {
            return new C11245l(iArr2);
        }
        return null;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l admob(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[6];
        AbstractC6974l.loadAd(AbstractC7574l.yandex, ((C11245l) abstractC2426l).f22638l, iArr);
        AbstractC7574l.amazon(iArr, this.f22638l, iArr);
        return new C11245l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l advert(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[6];
        AbstractC7574l.isPro(this.f22638l, ((C11245l) abstractC2426l).f22638l, iArr);
        return new C11245l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[6];
        if (AbstractC0079l.loadAd(this.f22638l, ((C11245l) abstractC2426l).f22638l, iArr) != 0 || (iArr[5] == -1 && AbstractC0079l.vip(iArr, AbstractC7574l.yandex))) {
            AbstractC4952l.amazon(6, 4553, iArr);
        }
        return new C11245l(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11245l) {
            return AbstractC0079l.firebase(this.f22638l, ((C11245l) obj).f22638l);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC14024l.subscription(this.f22638l, 6) ^ f22637l.hashCode();
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        return AbstractC0079l.remoteconfig(this.f22638l) == 1;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        int[] iArr = new int[6];
        AbstractC7574l.admob(this.f22638l, iArr);
        return new C11245l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        return AbstractC0079l.startapp(this.f22638l);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        int[] iArr = new int[6];
        if (AbstractC4952l.ads(6, this.f22638l, iArr) != 0 || (iArr[5] == -1 && AbstractC0079l.vip(iArr, AbstractC7574l.yandex))) {
            AbstractC4952l.amazon(6, 4553, iArr);
        }
        return new C11245l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        int[] iArr = new int[6];
        AbstractC6974l.loadAd(AbstractC7574l.yandex, this.f22638l, iArr);
        return new C11245l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        return AbstractC0079l.ad(this.f22638l);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return f22637l.bitLength();
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        int[] iArr = new int[6];
        AbstractC7574l.amazon(this.f22638l, ((C11245l) abstractC2426l).f22638l, iArr);
        return new C11245l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l subscription() {
        int[] iArr = new int[6];
        int[] iArr2 = this.f22638l;
        int iSmaato = AbstractC4952l.smaato(iArr2, 6);
        int[] iArr3 = AbstractC7574l.yandex;
        if (iSmaato != 0) {
            AbstractC0079l.Signature(iArr3, iArr3, iArr);
        } else {
            AbstractC0079l.Signature(iArr3, iArr2, iArr);
        }
        return new C11245l(iArr);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        return AbstractC0079l.metrica(this.f22638l);
    }

    public C11245l(int[] iArr) {
        super(3);
        this.f22638l = iArr;
    }
}
