package defpackage;

import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: renamed from: lُٗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17195l {
    public static final C15578l yandex = new C15578l(-281232939, false, new C13881l(17));

    public static C7100l admob(Cfor cfor) {
        AbstractC18276l abstractC18276l = (AbstractC18276l) AbstractC5730l.loadAd.get(cfor);
        C7100l c7100lAmazon = abstractC18276l == null ? null : abstractC18276l.amazon();
        if (c7100lAmazon == null) {
            AbstractC18276l abstractC18276l2 = (AbstractC18276l) AbstractC6569l.loadAd.get(cfor);
            c7100lAmazon = abstractC18276l2 == null ? null : abstractC18276l2.amazon();
        }
        if (c7100lAmazon == null) {
            AbstractC18276l abstractC18276l3 = (AbstractC18276l) AbstractC0317l.loadAd.get(cfor);
            c7100lAmazon = abstractC18276l3 == null ? null : abstractC18276l3.amazon();
        }
        if (c7100lAmazon == null) {
            AbstractC18276l abstractC18276l4 = (AbstractC18276l) tapsense.loadAd.get(cfor);
            c7100lAmazon = abstractC18276l4 == null ? null : abstractC18276l4.amazon();
        }
        if (c7100lAmazon == null) {
            c7100lAmazon = AbstractC11696l.amazon(cfor);
        }
        if (c7100lAmazon != null) {
            return c7100lAmazon;
        }
        AbstractC18276l abstractC18276l5 = (AbstractC18276l) AbstractC8660l.loadAd.get(cfor);
        if (abstractC18276l5 == null) {
            return null;
        }
        return abstractC18276l5.amazon();
    }

    public static final int amazon(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static Cfor firebase(String str) {
        Cfor cforBilling = (Cfor) AbstractC5730l.yandex.get(AbstractC9008l.amazon(str));
        if (cforBilling == null) {
            cforBilling = (Cfor) AbstractC6569l.yandex.get(AbstractC9008l.amazon(str));
        }
        if (cforBilling == null) {
            cforBilling = (Cfor) AbstractC6662l.yandex.get(AbstractC9008l.mopub(str));
        }
        if (cforBilling == null) {
            cforBilling = (Cfor) AbstractC0317l.yandex.get(AbstractC9008l.amazon(str));
        }
        if (cforBilling == null) {
            cforBilling = (Cfor) tapsense.yandex.get(AbstractC9008l.amazon(str));
        }
        if (cforBilling == null) {
            cforBilling = AbstractC11696l.billing(str);
        }
        if (cforBilling == null) {
            cforBilling = (Cfor) AbstractC8660l.yandex.get(AbstractC9008l.amazon(str));
        }
        return (cforBilling == null && str.equals("curve25519")) ? AbstractC5723l.yandex : cforBilling;
    }

    public static Enumeration isPro() {
        Vector vector = new Vector();
        loadAd(vector, AbstractC5730l.yandex.keys());
        loadAd(vector, AbstractC6569l.crashlytics.elements());
        loadAd(vector, AbstractC6662l.yandex.keys());
        loadAd(vector, AbstractC0317l.crashlytics.elements());
        loadAd(vector, tapsense.crashlytics.elements());
        loadAd(vector, AbstractC11696l.crashlytics.elements());
        loadAd(vector, AbstractC8660l.crashlytics.elements());
        return vector.elements();
    }

    public static void loadAd(Vector vector, Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            vector.addElement(enumeration.nextElement());
        }
    }

    public static C7100l mopub(String str) {
        AbstractC18276l abstractC18276l;
        AbstractC18276l abstractC18276l2;
        AbstractC18276l abstractC18276l3;
        AbstractC18276l abstractC18276l4;
        AbstractC18276l abstractC18276l5;
        AbstractC18276l abstractC18276l6;
        Cfor cfor = (Cfor) AbstractC5730l.yandex.get(AbstractC9008l.amazon(str));
        C7100l c7100lAmazon = (cfor == null || (abstractC18276l = (AbstractC18276l) AbstractC5730l.loadAd.get(cfor)) == null) ? null : abstractC18276l.amazon();
        if (c7100lAmazon == null) {
            Cfor cfor2 = (Cfor) AbstractC6569l.yandex.get(AbstractC9008l.amazon(str));
            c7100lAmazon = (cfor2 == null || (abstractC18276l6 = (AbstractC18276l) AbstractC6569l.loadAd.get(cfor2)) == null) ? null : abstractC18276l6.amazon();
        }
        if (c7100lAmazon == null) {
            Cfor cfor3 = (Cfor) AbstractC6662l.yandex.get(AbstractC9008l.mopub(str));
            c7100lAmazon = (cfor3 == null || (abstractC18276l5 = (AbstractC18276l) AbstractC6569l.loadAd.get(cfor3)) == null) ? null : abstractC18276l5.amazon();
        }
        if (c7100lAmazon == null) {
            Cfor cfor4 = (Cfor) AbstractC0317l.yandex.get(AbstractC9008l.amazon(str));
            c7100lAmazon = (cfor4 == null || (abstractC18276l4 = (AbstractC18276l) AbstractC0317l.loadAd.get(cfor4)) == null) ? null : abstractC18276l4.amazon();
        }
        if (c7100lAmazon == null) {
            Cfor cfor5 = (Cfor) tapsense.yandex.get(AbstractC9008l.amazon(str));
            c7100lAmazon = (cfor5 == null || (abstractC18276l3 = (AbstractC18276l) tapsense.loadAd.get(cfor5)) == null) ? null : abstractC18276l3.amazon();
        }
        if (c7100lAmazon == null) {
            Cfor cforBilling = AbstractC11696l.billing(str);
            c7100lAmazon = cforBilling == null ? null : AbstractC11696l.amazon(cforBilling);
        }
        if (c7100lAmazon != null) {
            return c7100lAmazon;
        }
        Cfor cfor6 = (Cfor) AbstractC8660l.yandex.get(AbstractC9008l.amazon(str));
        if (cfor6 == null || (abstractC18276l2 = (AbstractC18276l) AbstractC8660l.loadAd.get(cfor6)) == null) {
            return null;
        }
        return abstractC18276l2.amazon();
    }

    public static final int purchase(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static String subs(Cfor cfor) {
        String strPurchase = (String) AbstractC5730l.crashlytics.get(cfor);
        if (strPurchase == null) {
            strPurchase = (String) AbstractC6569l.crashlytics.get(cfor);
        }
        if (strPurchase == null) {
            strPurchase = (String) AbstractC6662l.loadAd.get(cfor);
        }
        if (strPurchase == null) {
            strPurchase = (String) AbstractC0317l.crashlytics.get(cfor);
        }
        if (strPurchase == null) {
            strPurchase = (String) tapsense.crashlytics.get(cfor);
        }
        if (strPurchase == null) {
            strPurchase = AbstractC11696l.purchase(cfor);
        }
        if (strPurchase == null) {
            strPurchase = (String) AbstractC8660l.crashlytics.get(cfor);
        }
        return strPurchase == null ? (String) AbstractC1624l.amazon.get(cfor) : strPurchase;
    }

    public static final long yandex(long j, long j2, float f) {
        return C14467l.loadAd(f, 0.0f) ? j : AbstractC12953l.firebase(C9735l.loadAd(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, j), j2);
    }

    public abstract Object billing(C5138l c5138l);

    public abstract boolean crashlytics(C5138l c5138l);
}
