package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍۣٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14506l {
    public static final C15578l yandex = new C15578l(-234126695, false, new C1590l(9));
    public static final C15578l loadAd = new C15578l(738804440, false, new C1590l(10));
    public static final C15578l crashlytics = new C15578l(830810942, false, new C1590l(11));
    public static final C15578l amazon = new C15578l(2053413567, false, new C1590l(12));
    public static final C15578l purchase = new C15578l(1744383897, false, new C1590l(13));
    public static final C15578l billing = new C15578l(-1764232742, false, new C1590l(14));

    public static final long amazon(C4608l c4608l, C0187l c0187l) {
        Function1 function1 = c4608l.isPro;
        HashMap map = c4608l.firebase;
        C14997l c14997lAmazon = (C14997l) map.get(c0187l);
        if (c14997lAmazon == null) {
            c14997lAmazon = (c0187l.smaato == 2 ? AbstractC12446l.loadAd : AbstractC12446l.yandex).amazon(c4608l, c0187l);
            if (map.size() > 4) {
                map.clear();
            }
            map.put(c0187l, c14997lAmazon);
        }
        int iPurchase = c14997lAmazon.yandex;
        Double d = function1 != null ? (Double) function1.invoke(c0187l) : null;
        if (function1 != null && d != null) {
            iPurchase = (iPurchase & 16777215) | (AbstractC8576l.purchase((int) Math.rint(d.doubleValue() * 255.0d), 0, 255) << 24);
        }
        return AbstractC12953l.loadAd(iPurchase);
    }

    public static final AbstractC14318l billing(AbstractC14318l abstractC14318l, boolean z) {
        C15110l c15110lTapsense = C1083l.tapsense(abstractC14318l, z);
        if (c15110lTapsense != null) {
            return c15110lTapsense;
        }
        AbstractC15211l abstractC15211lMopub = mopub(abstractC14318l);
        return abstractC15211lMopub != null ? abstractC15211lMopub : abstractC14318l.mo8static(false);
    }

    public static final AbstractC15211l isPro(AbstractC15211l abstractC15211l, AbstractC15211l abstractC15211l2) {
        return AbstractC11748l.subs(abstractC15211l) ? abstractC15211l : new Cabstract(abstractC15211l, abstractC15211l2);
    }

    public static final AbstractC15211l mopub(AbstractC14318l abstractC14318l) {
        C11794l c11794l;
        InterfaceC1925l interfaceC1925lMo1339native = abstractC14318l.mo1339native();
        C11794l c11794l2 = interfaceC1925lMo1339native instanceof C11794l ? (C11794l) interfaceC1925lMo1339native : null;
        if (c11794l2 != null) {
            LinkedHashSet<AbstractC18041l> linkedHashSet = c11794l2.f23607l;
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(linkedHashSet, 10));
            boolean z = false;
            for (AbstractC18041l abstractC18041lBilling : linkedHashSet) {
                if (AbstractC12008l.purchase(abstractC18041lBilling)) {
                    abstractC18041lBilling = billing(abstractC18041lBilling.mo3847class(), false);
                    z = true;
                }
                arrayList.add(abstractC18041lBilling);
            }
            if (z) {
                AbstractC18041l abstractC18041lBilling2 = c11794l2.f23608l;
                if (abstractC18041lBilling2 == null) {
                    abstractC18041lBilling2 = null;
                } else if (AbstractC12008l.purchase(abstractC18041lBilling2)) {
                    abstractC18041lBilling2 = billing(abstractC18041lBilling2.mo3847class(), false);
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                c11794l = new C11794l(linkedHashSet2);
                c11794l.f23608l = abstractC18041lBilling2;
            } else {
                c11794l = null;
            }
            if (c11794l != null) {
                return c11794l.loadAd();
            }
        }
        return null;
    }

    public static String purchase(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((C9267l) it.next()).yandex.mopub.metrica;
            if (AbstractC3825l.remoteconfig(str2)) {
                return "video/mp4";
            }
            if (AbstractC3825l.subs(str2)) {
                z = true;
            } else if (AbstractC3825l.firebase(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }

    public abstract void admob(C16075l c16075l, C16075l c16075l2);

    public abstract boolean crashlytics(AbstractC4867l abstractC4867l, C16075l c16075l, C16075l c16075l2);

    public abstract boolean loadAd(AbstractC4867l abstractC4867l, Object obj, Object obj2);

    public abstract void subs(C16075l c16075l, Thread thread);

    public abstract boolean yandex(AbstractC4867l abstractC4867l, C6755l c6755l, C6755l c6755l2);
}
