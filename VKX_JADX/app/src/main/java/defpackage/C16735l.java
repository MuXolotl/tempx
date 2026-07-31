package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lٖۣٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16735l extends AbstractC7532l {
    public final C6548l Signature;

    public C16735l(AbstractC7532l abstractC7532l, AbstractC7532l abstractC7532l2) {
        super(3, AbstractC18202l.yandex.loadAd(Map.class), abstractC7532l2.purchase, C14054l.f27396l, 32);
        this.Signature = new C6548l(abstractC7532l, abstractC7532l2);
    }

    @Override // defpackage.AbstractC7532l
    public final void admob(C13161l c13161l, int i, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            return;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.Signature.admob(c13161l, i, (Map.Entry) it.next());
        }
    }

    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        C6548l c6548l = this.Signature;
        Object objCrashlytics = c6548l.Signature.loadAd;
        AbstractC7532l abstractC7532l = c6548l.license;
        Object objCrashlytics2 = abstractC7532l.loadAd;
        long jAmazon = c7084l.amazon();
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                break;
            }
            if (iMopub == 1) {
                objCrashlytics = c6548l.Signature.crashlytics(c7084l);
            } else if (iMopub == 2) {
                objCrashlytics2 = abstractC7532l.crashlytics(c7084l);
            }
        }
        c7084l.purchase(jAmazon);
        if (objCrashlytics == null) {
            C8339l.smaato("Map entry with null key");
            return null;
        }
        if (objCrashlytics2 != null) {
            return Collections.singletonMap(objCrashlytics, objCrashlytics2);
        }
        C8339l.smaato("Map entry with null value");
        return null;
    }

    @Override // defpackage.AbstractC7532l
    public final int firebase(int i, Object obj) {
        Map map = (Map) obj;
        int iFirebase = 0;
        if (map == null) {
            return 0;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            iFirebase += this.Signature.firebase(i, (Map.Entry) it.next());
        }
        return iFirebase;
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // defpackage.AbstractC7532l
    public final Object loadAd(C2881l c2881l) throws IOException {
        C6548l c6548l = this.Signature;
        Object objLoadAd = c6548l.Signature.loadAd;
        AbstractC7532l abstractC7532l = c6548l.license;
        Object objLoadAd2 = abstractC7532l.loadAd;
        int iCrashlytics = c2881l.crashlytics();
        while (true) {
            int iBilling = c2881l.billing();
            if (iBilling == -1) {
                break;
            }
            if (iBilling == 1) {
                objLoadAd = c6548l.Signature.loadAd(c2881l);
            } else if (iBilling == 2) {
                objLoadAd2 = abstractC7532l.loadAd(c2881l);
            }
        }
        c2881l.amazon(iCrashlytics);
        if (objLoadAd == null) {
            C8339l.smaato("Map entry with null key");
            return null;
        }
        if (objLoadAd2 != null) {
            return Collections.singletonMap(objLoadAd, objLoadAd2);
        }
        C8339l.smaato("Map entry with null value");
        return null;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // defpackage.AbstractC7532l
    public final void subs(C1080l c1080l, int i, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            return;
        }
        Map.Entry[] entryArr = (Map.Entry[]) map.entrySet().toArray(new Map.Entry[0]);
        AbstractC8669l.m2413static(entryArr);
        for (Map.Entry entry : entryArr) {
            this.Signature.subs(c1080l, i, entry);
        }
    }
}
