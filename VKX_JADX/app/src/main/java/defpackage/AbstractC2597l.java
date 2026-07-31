package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lْؔۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2597l extends AbstractC4730l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2090l f5657l;

    public AbstractC2597l(AbstractC2439l abstractC2439l) {
        abstractC2439l.f5217l.billing();
        abstractC2439l.f5216l = false;
        this.f5657l = abstractC2439l.f5217l;
    }

    public final Object firebase(C7654l c7654l) {
        metrica(c7654l);
        C7367l c7367l = c7654l.amazon;
        Object obj = this.f5657l.yandex.get(c7367l);
        if (obj == null) {
            return c7654l.loadAd;
        }
        if (!c7367l.f15278l) {
            return c7654l.yandex(obj);
        }
        if (c7367l.f15279l.f35194l != EnumC17173l.f33353l) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(c7654l.yandex(it.next()));
        }
        return arrayList;
    }

    public final int isPro() {
        C16515l c16515l = this.f5657l.yandex;
        int iAmazon = 0;
        for (int i = 0; i < c16515l.f32283l.size(); i++) {
            Map.Entry entry = (Map.Entry) c16515l.f32283l.get(i);
            iAmazon += C2090l.amazon((C7367l) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : c16515l.crashlytics()) {
            iAmazon += C2090l.amazon((C7367l) entry2.getKey(), entry2.getValue());
        }
        return iAmazon;
    }

    public final void metrica(C7654l c7654l) {
        if (c7654l.yandex == loadAd()) {
            return;
        }
        C8339l.metrica("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    public final void remoteconfig() {
        this.f5657l.billing();
    }

    public final boolean smaato(C7654l c7654l) {
        metrica(c7654l);
        C7367l c7367l = c7654l.amazon;
        C2090l c2090l = this.f5657l;
        c2090l.getClass();
        if (!c7367l.f15278l) {
            return c2090l.yandex.get(c7367l) != null;
        }
        C8339l.metrica("hasField() can only be called on non-repeated fields.");
        return false;
    }

    public final boolean subs() {
        C16515l c16515l = this.f5657l.yandex;
        for (int i = 0; i < c16515l.f32283l.size(); i++) {
            if (!C2090l.purchase((Map.Entry) c16515l.f32283l.get(i))) {
                return false;
            }
        }
        Iterator it = c16515l.crashlytics().iterator();
        while (it.hasNext()) {
            if (!C2090l.purchase((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0019  */
    public final boolean vip(C1718l c1718l, C11522l c11522l, C3429l c3429l, int i) throws C12383l {
        boolean z;
        boolean z2;
        Object objCrashlytics;
        AbstractC14080l abstractC14080l;
        int i2 = i & 7;
        C7654l c7654l = (C7654l) c3429l.yandex.get(new C9865l(i >>> 3, loadAd()));
        if (c7654l == null) {
            z2 = true;
            z = false;
        } else {
            C7367l c7367l = c7654l.amazon;
            EnumC17998l enumC17998l = c7367l.f15279l;
            C2090l c2090l = C2090l.crashlytics;
            if (i2 == enumC17998l.f35193l) {
                z2 = false;
                z = false;
            } else if (c7367l.f15278l && enumC17998l.yandex() && i2 == 2) {
                z = true;
                z2 = false;
            } else {
                z2 = true;
                z = false;
            }
        }
        if (z2) {
            return c1718l.ads(i, c11522l);
        }
        AbstractC2398l abstractC2398lAmazon = null;
        C2090l c2090l2 = this.f5657l;
        if (z) {
            int iPurchase = c1718l.purchase(c1718l.smaato());
            C7367l c7367l2 = c7654l.amazon;
            if (c7367l2.f15279l != EnumC17998l.f35188l) {
                while (c1718l.crashlytics() > 0) {
                    c2090l2.yandex(c7367l2, C2090l.admob(c1718l, c7367l2.f15279l));
                }
            } else if (c1718l.crashlytics() > 0) {
                c1718l.smaato();
                throw null;
            }
            c1718l.amazon(iPurchase);
            return true;
        }
        C7367l c7367l3 = c7654l.amazon;
        EnumC17998l enumC17998l2 = c7367l3.f15279l;
        boolean z3 = c7367l3.f15278l;
        int iOrdinal = enumC17998l2.f35194l.ordinal();
        if (iOrdinal == 7) {
            c1718l.smaato();
            throw null;
        }
        if (iOrdinal != 8) {
            objCrashlytics = C2090l.admob(c1718l, enumC17998l2);
        } else {
            if (!z3 && (abstractC14080l = (AbstractC14080l) c2090l2.yandex.get(c7367l3)) != null) {
                abstractC2398lAmazon = abstractC14080l.purchase();
            }
            if (abstractC2398lAmazon == null) {
                abstractC2398lAmazon = c7654l.crashlytics.amazon();
            }
            if (enumC17998l2 == EnumC17998l.f35190l) {
                int i3 = c7367l3.f15280l;
                c1718l.loadAd();
                c1718l.subs++;
                abstractC2398lAmazon.amazon(c1718l, c3429l);
                c1718l.yandex((i3 << 3) | 4);
                c1718l.subs--;
            } else {
                int iSmaato = c1718l.smaato();
                c1718l.loadAd();
                int iPurchase2 = c1718l.purchase(iSmaato);
                c1718l.subs++;
                abstractC2398lAmazon.amazon(c1718l, c3429l);
                c1718l.yandex(0);
                c1718l.subs--;
                c1718l.amazon(iPurchase2);
            }
            objCrashlytics = abstractC2398lAmazon.crashlytics();
        }
        if (z3) {
            c2090l2.yandex(c7367l3, c7654l.loadAd(objCrashlytics));
            return true;
        }
        c2090l2.subs(c7367l3, c7654l.loadAd(objCrashlytics));
        return true;
    }

    public AbstractC2597l() {
        this.f5657l = new C2090l();
    }
}
