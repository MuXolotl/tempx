package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٍؙۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6360l {
    public final /* synthetic */ C13370l admob;
    public final BitSet amazon;
    public final C11154l billing;
    public final C0450l crashlytics;
    public final boolean loadAd;
    public final C11154l mopub;
    public final BitSet purchase;
    public final String yandex;

    public C6360l(C13370l c13370l, String str, C0450l c0450l, BitSet bitSet, BitSet bitSet2, C11154l c11154l, C11154l c11154l2) {
        this.admob = c13370l;
        this.yandex = str;
        this.amazon = bitSet;
        this.purchase = bitSet2;
        this.billing = c11154l;
        this.mopub = new C11154l(0);
        for (Integer num : (C5386l) c11154l2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c11154l2.get(num));
            this.mopub.put(num, arrayList);
        }
        this.loadAd = false;
        this.crashlytics = c0450l;
    }

    public final C6812l loadAd(int i) {
        ArrayList arrayList;
        List list;
        C16689l c16689lSignatures = C6812l.signatures();
        c16689lSignatures.loadAd();
        ((C6812l) c16689lSignatures.f20498l).premium(i);
        c16689lSignatures.loadAd();
        ((C6812l) c16689lSignatures.f20498l).inmobi(this.loadAd);
        C0450l c0450l = this.crashlytics;
        if (c0450l != null) {
            c16689lSignatures.loadAd();
            ((C6812l) c16689lSignatures.f20498l).appmetrica(c0450l);
        }
        C3269l c3269lPremium = C0450l.premium();
        ArrayList arrayListM3705l = C13718l.m3705l(this.amazon);
        c3269lPremium.loadAd();
        ((C0450l) c3269lPremium.f20498l).m545throws(arrayListM3705l);
        ArrayList arrayListM3705l2 = C13718l.m3705l(this.purchase);
        c3269lPremium.loadAd();
        ((C0450l) c3269lPremium.f20498l).appmetrica(arrayListM3705l2);
        C11154l c11154l = this.billing;
        if (c11154l == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(c11154l.f11161l);
            for (Integer num : (C5386l) c11154l.keySet()) {
                int iIntValue = num.intValue();
                Long l = (Long) c11154l.get(num);
                if (l != null) {
                    C0145l c0145lAd = C16986l.ad();
                    c0145lAd.loadAd();
                    ((C16986l) c0145lAd.f20498l).advert(iIntValue);
                    long jLongValue = l.longValue();
                    c0145lAd.loadAd();
                    ((C16986l) c0145lAd.f20498l).isVip(jLongValue);
                    arrayList2.add((C16986l) c0145lAd.amazon());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            c3269lPremium.loadAd();
            ((C0450l) c3269lPremium.f20498l).m544synchronized(arrayList);
        }
        C11154l c11154l2 = this.mopub;
        if (c11154l2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(c11154l2.f11161l);
            for (Integer num2 : (C5386l) c11154l2.keySet()) {
                C15077l c15077lAdvert = C8888l.advert();
                int iIntValue2 = num2.intValue();
                c15077lAdvert.loadAd();
                ((C8888l) c15077lAdvert.f20498l).isVip(iIntValue2);
                List list2 = (List) c11154l2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    c15077lAdvert.loadAd();
                    ((C8888l) c15077lAdvert.f20498l).signatures(list2);
                }
                arrayList3.add((C8888l) c15077lAdvert.amazon());
            }
            list = arrayList3;
        }
        c3269lPremium.loadAd();
        ((C0450l) c3269lPremium.f20498l).m546volatile(list);
        c16689lSignatures.loadAd();
        ((C6812l) c16689lSignatures.f20498l).applovin((C0450l) c3269lPremium.amazon());
        return (C6812l) c16689lSignatures.amazon();
    }

    public final void yandex(C13104l c13104l) {
        int iSignature;
        switch (c13104l.mopub) {
            case 0:
                iSignature = ((C9540l) c13104l.subs).Signature();
                break;
            default:
                iSignature = ((C16493l) c13104l.subs).Signature();
                break;
        }
        boolean z = true;
        if (c13104l.crashlytics != null) {
            this.purchase.set(iSignature, true);
        }
        Boolean bool = c13104l.amazon;
        if (bool != null) {
            this.amazon.set(iSignature, bool.booleanValue());
        }
        if (c13104l.purchase != null) {
            Integer numValueOf = Integer.valueOf(iSignature);
            C11154l c11154l = this.billing;
            Long l = (Long) c11154l.get(numValueOf);
            long jLongValue = c13104l.purchase.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                c11154l.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (c13104l.billing != null) {
            Integer numValueOf2 = Integer.valueOf(iSignature);
            C11154l c11154l2 = this.mopub;
            List arrayList = (List) c11154l2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                c11154l2.put(numValueOf2, arrayList);
            }
            boolean zIsVip = false;
            switch (c13104l.mopub) {
                case 0:
                    z = false;
                    break;
            }
            if (z) {
                arrayList.clear();
            }
            C3264l.yandex();
            C17417l c17417l = (C17417l) this.admob.f833l;
            C5051l c5051l = c17417l.f33945l;
            C3032l c3032l = AbstractC5981l.f12661l;
            String str = this.yandex;
            if (c5051l.m1682l(str, c3032l)) {
                switch (c13104l.mopub) {
                    case 0:
                        zIsVip = ((C9540l) c13104l.subs).isVip();
                        break;
                }
                if (zIsVip) {
                    arrayList.clear();
                }
            }
            C3264l.yandex();
            boolean zM1682l = c17417l.f33945l.m1682l(str, c3032l);
            Long l2 = c13104l.billing;
            if (!zM1682l) {
                arrayList.add(Long.valueOf(l2.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(l2.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public C6360l(C13370l c13370l, String str) {
        this.admob = c13370l;
        this.yandex = str;
        this.loadAd = true;
        this.amazon = new BitSet();
        this.purchase = new BitSet();
        this.billing = new C11154l(0);
        this.mopub = new C11154l(0);
    }
}
