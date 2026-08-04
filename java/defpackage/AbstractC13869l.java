package defpackage;

/* JADX INFO: renamed from: lٜٓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13869l extends AbstractC2426l {
    @Override // defpackage.AbstractC2426l
    public AbstractC2426l advert(AbstractC2426l abstractC2426l) {
        return amazon(abstractC2426l);
    }

    public boolean applovin() {
        return this instanceof C17366l;
    }

    public int appmetrica() {
        int iSmaato = smaato();
        int iMopub = AbstractC14289l.mopub(iSmaato) - 1;
        AbstractC2426l abstractC2426lAmazon = this;
        int i = 1;
        while (iMopub > 0) {
            abstractC2426lAmazon = abstractC2426lAmazon.ad(i).amazon(abstractC2426lAmazon);
            iMopub--;
            i = iSmaato >>> iMopub;
            if ((i & 1) != 0) {
                abstractC2426lAmazon = abstractC2426lAmazon.license().amazon(this);
            }
        }
        if (abstractC2426lAmazon.metrica()) {
            return 0;
        }
        if (abstractC2426lAmazon.vip()) {
            return 1;
        }
        C8339l.smaato("Internal error in trace calculation");
        return 0;
    }

    public AbstractC2426l premium() {
        int iSmaato = smaato();
        if ((iSmaato & 1) == 0) {
            C8339l.smaato("Half-trace only defined for odd m");
            return null;
        }
        int i = (iSmaato + 1) >>> 1;
        int iMopub = AbstractC14289l.mopub(i) - 1;
        AbstractC2426l abstractC2426lAmazon = this;
        int i2 = 1;
        while (iMopub > 0) {
            abstractC2426lAmazon = abstractC2426lAmazon.ad(i2 << 1).amazon(abstractC2426lAmazon);
            iMopub--;
            i2 = i >>> iMopub;
            if ((i2 & 1) != 0) {
                abstractC2426lAmazon = abstractC2426lAmazon.ad(2).amazon(this);
            }
        }
        return abstractC2426lAmazon;
    }
}
