package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: renamed from: lٌ٘۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8859l {
    public static final AbstractC2426l[] billing = new AbstractC2426l[0];
    public final AbstractC2426l[] amazon;
    public final AbstractC2426l crashlytics;
    public final AbstractC2426l loadAd;
    public Hashtable purchase;
    public final AbstractC11918l yandex;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC8859l(AbstractC11918l abstractC11918l, AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        AbstractC2426l[] abstractC2426lArr;
        int i = abstractC11918l == null ? 0 : abstractC11918l.billing;
        if (i == 0 || i == 5) {
            abstractC2426lArr = billing;
        } else {
            AbstractC2426l abstractC2426lIsPro = abstractC11918l.isPro(InterfaceC11695l.startapp);
            if (i == 1 || i == 2) {
                abstractC2426lArr = new AbstractC2426l[]{abstractC2426lIsPro};
            } else if (i == 3) {
                abstractC2426lArr = new AbstractC2426l[]{abstractC2426lIsPro, abstractC2426lIsPro, abstractC2426lIsPro};
            } else if (i != 4) {
                if (i != 6) {
                    C8339l.metrica("unknown coordinate system");
                    throw null;
                }
                abstractC2426lArr = new AbstractC2426l[]{abstractC2426lIsPro};
            } else {
                abstractC2426lArr = new AbstractC2426l[]{abstractC2426lIsPro, abstractC11918l.loadAd};
            }
        }
        this(abstractC11918l, abstractC2426l, abstractC2426l2, abstractC2426lArr);
    }

    public AbstractC8859l Signature(AbstractC2426l abstractC2426l) {
        if (smaato()) {
            return this;
        }
        return this.yandex.billing(this.loadAd, this.crashlytics.startapp(abstractC2426l), this.amazon);
    }

    public AbstractC8859l ad(int i) {
        if (i < 0) {
            C8339l.metrica("'e' cannot be negative");
            return null;
        }
        while (true) {
            i--;
            if (i < 0) {
                return this;
            }
            this = this.advert();
        }
    }

    public final AbstractC8859l adcel(AbstractC2426l abstractC2426l) {
        int iMopub = mopub();
        AbstractC2426l abstractC2426l2 = this.crashlytics;
        AbstractC2426l abstractC2426l3 = this.loadAd;
        AbstractC11918l abstractC11918l = this.yandex;
        if (iMopub != 1) {
            if (iMopub == 2 || iMopub == 3 || iMopub == 4) {
                AbstractC2426l abstractC2426lLicense = abstractC2426l.license();
                return abstractC11918l.purchase(abstractC2426l3.startapp(abstractC2426lLicense), abstractC2426l2.startapp(abstractC2426lLicense.startapp(abstractC2426l)));
            }
            if (iMopub != 6) {
                C8339l.smaato("not a projective coordinate system");
                return null;
            }
        }
        return abstractC11918l.purchase(abstractC2426l3.startapp(abstractC2426l), abstractC2426l2.startapp(abstractC2426l));
    }

    public final byte[] admob(boolean z) {
        if (smaato()) {
            return new byte[1];
        }
        AbstractC8859l abstractC8859lStartapp = startapp();
        byte[] bArrIsPro = abstractC8859lStartapp.loadAd.isPro();
        if (z) {
            byte[] bArr = new byte[bArrIsPro.length + 1];
            bArr[0] = (byte) (abstractC8859lStartapp.billing() ? 3 : 2);
            System.arraycopy(bArrIsPro, 0, bArr, 1, bArrIsPro.length);
            return bArr;
        }
        byte[] bArrIsPro2 = abstractC8859lStartapp.subs().isPro();
        byte[] bArr2 = new byte[bArrIsPro.length + bArrIsPro2.length + 1];
        bArr2[0] = 4;
        System.arraycopy(bArrIsPro, 0, bArr2, 1, bArrIsPro.length);
        System.arraycopy(bArrIsPro2, 0, bArr2, bArrIsPro.length + 1, bArrIsPro2.length);
        return bArr2;
    }

    public abstract boolean ads();

    public abstract AbstractC8859l advert();

    /* JADX WARN: Code duplicated, block: B:38:0x0075 A[RETURN] */
    public final boolean amazon(AbstractC8859l abstractC8859l) {
        if (abstractC8859l != null) {
            AbstractC11918l abstractC11918l = abstractC8859l.yandex;
            AbstractC11918l abstractC11918l2 = this.yandex;
            boolean z = abstractC11918l2 == null;
            boolean z2 = abstractC11918l == null;
            boolean zSmaato = smaato();
            boolean zSmaato2 = abstractC8859l.smaato();
            if (zSmaato || zSmaato2) {
                if (zSmaato && zSmaato2 && (z || z2 || abstractC11918l2.subs(abstractC11918l))) {
                    return true;
                }
            } else if (!z || !z2) {
                if (z) {
                    abstractC8859l = abstractC8859l.startapp();
                } else if (z2) {
                    this = startapp();
                } else if (abstractC11918l2.subs(abstractC11918l)) {
                    AbstractC8859l[] abstractC8859lArr = {this, abstractC11918l2.vip(abstractC8859l)};
                    abstractC11918l2.startapp(abstractC8859lArr, 0, 2, null);
                    this = abstractC8859lArr[0];
                    abstractC8859l = abstractC8859lArr[1];
                }
                if (!this.loadAd.equals(abstractC8859l.loadAd) && this.subs().equals(abstractC8859l.subs())) {
                    return true;
                }
            } else if (!this.loadAd.equals(abstractC8859l.loadAd)) {
            }
        }
        return false;
    }

    public abstract boolean billing();

    public abstract AbstractC8859l crashlytics();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8859l) {
            return amazon((AbstractC8859l) obj);
        }
        return false;
    }

    public final boolean firebase(boolean z, boolean z2) {
        if (smaato()) {
            return true;
        }
        return !((C2772l) this.yandex.adcel(this, "bc_validity", new C16025l(this, z, z2))).yandex;
    }

    public final int hashCode() {
        AbstractC11918l abstractC11918l = this.yandex;
        int i = abstractC11918l == null ? 0 : ~abstractC11918l.hashCode();
        if (smaato()) {
            return i;
        }
        AbstractC8859l abstractC8859lStartapp = startapp();
        return (abstractC8859lStartapp.subs().hashCode() * 257) ^ (i ^ (abstractC8859lStartapp.loadAd.hashCode() * 17));
    }

    public AbstractC2426l isPro() {
        AbstractC2426l[] abstractC2426lArr = this.amazon;
        if (abstractC2426lArr.length <= 0) {
            return null;
        }
        return abstractC2426lArr[0];
    }

    public abstract AbstractC8859l isVip(AbstractC8859l abstractC8859l);

    public abstract AbstractC8859l license(AbstractC8859l abstractC8859l);

    public final void loadAd() {
        if (remoteconfig()) {
            return;
        }
        C8339l.smaato("point not in normal form");
    }

    public abstract AbstractC8859l metrica();

    public final int mopub() {
        AbstractC11918l abstractC11918l = this.yandex;
        if (abstractC11918l == null) {
            return 0;
        }
        return abstractC11918l.billing;
    }

    public AbstractC8859l pro() {
        return isVip(this);
    }

    public final AbstractC2426l purchase() {
        loadAd();
        return subs();
    }

    public final boolean remoteconfig() {
        int iMopub = mopub();
        return iMopub == 0 || iMopub == 5 || smaato() || this.amazon[0].vip();
    }

    public final boolean smaato() {
        if (this.loadAd == null || this.crashlytics == null) {
            return true;
        }
        AbstractC2426l[] abstractC2426lArr = this.amazon;
        return abstractC2426lArr.length > 0 && abstractC2426lArr[0].metrica();
    }

    public final AbstractC8859l startapp() {
        int iMopub;
        if (smaato() || (iMopub = mopub()) == 0 || iMopub == 5) {
            return this;
        }
        AbstractC2426l abstractC2426lIsPro = isPro();
        if (abstractC2426lIsPro.vip()) {
            return this;
        }
        AbstractC11918l abstractC11918l = this.yandex;
        if (abstractC11918l != null) {
            AbstractC2426l abstractC2426lAds = abstractC11918l.ads(AbstractC8776l.loadAd());
            return adcel(abstractC2426lIsPro.startapp(abstractC2426lAds).remoteconfig().startapp(abstractC2426lAds));
        }
        C8339l.smaato("Detached points must be in affine coordinates");
        return null;
    }

    public AbstractC2426l subs() {
        return this.crashlytics;
    }

    public boolean subscription() {
        BigInteger bigInteger;
        BigInteger bigInteger2 = InterfaceC11695l.startapp;
        AbstractC11918l abstractC11918l = this.yandex;
        return bigInteger2.equals(abstractC11918l.purchase) || (bigInteger = abstractC11918l.amazon) == null || AbstractC6974l.startapp(this, bigInteger).smaato();
    }

    public AbstractC8859l tapsense(AbstractC2426l abstractC2426l) {
        if (smaato()) {
            return this;
        }
        return this.yandex.billing(this.loadAd.startapp(abstractC2426l), this.crashlytics, this.amazon);
    }

    public final String toString() {
        if (smaato()) {
            return "INF";
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.loadAd);
        sb.append(',');
        sb.append(this.crashlytics);
        int i = 0;
        while (true) {
            AbstractC2426l[] abstractC2426lArr = this.amazon;
            if (i >= abstractC2426lArr.length) {
                sb.append(')');
                return sb.toString();
            }
            sb.append(',');
            sb.append(abstractC2426lArr[i]);
            i++;
        }
    }

    public final AbstractC8859l vip(BigInteger bigInteger) {
        AbstractC11918l abstractC11918l = this.yandex;
        if (abstractC11918l.admob == null) {
            abstractC11918l.admob = abstractC11918l.crashlytics();
        }
        return abstractC11918l.admob.loadAd(this, bigInteger);
    }

    public abstract AbstractC8859l yandex(AbstractC8859l abstractC8859l);

    public AbstractC8859l(AbstractC11918l abstractC11918l, AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr) {
        this.purchase = null;
        this.yandex = abstractC11918l;
        this.loadAd = abstractC2426l;
        this.crashlytics = abstractC2426l2;
        this.amazon = abstractC2426lArr;
    }
}
