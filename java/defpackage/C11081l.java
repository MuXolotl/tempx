package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lُٖۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11081l implements InterfaceC0627l {
    public final C5664l crashlytics;
    public final C7931l loadAd;
    public final C11969l yandex;

    public C11081l(C11969l c11969l, C7931l c7931l, C5664l c5664l) {
        this.yandex = c11969l;
        this.loadAd = c7931l;
        this.crashlytics = c5664l;
    }

    @Override // defpackage.InterfaceC0627l
    public final InterfaceC17866l yandex(InterfaceC2413l interfaceC2413l, Map map, C15202l c15202l) throws Exception {
        int i;
        ArrayList arrayList;
        C7472l c7472l = C7472l.f15449l;
        C7931l c7931l = this.loadAd;
        int i2 = c7931l.admob;
        if (i2 == 0) {
            i = 0;
        } else if (i2 == 1) {
            i = 1;
        } else {
            if (i2 == 2) {
                C18262l.startapp(C10053l.admob(c7931l.admob), "Unsupported session mode: ");
                return null;
            }
            i = i2;
        }
        C4291l c4291lAmazon = AbstractC11965l.amazon(c7931l, this.crashlytics, map);
        ArrayList arrayList2 = c4291lAmazon.yandex;
        if (arrayList2.isEmpty()) {
            Log.w("CXCP", "Failed to create OutputConfigurations for " + c7931l);
            c15202l.yandex();
            return c7472l;
        }
        ArrayList arrayList3 = c7931l.amazon;
        if (arrayList3 != null) {
            arrayList = new ArrayList(AbstractC14055l.billing(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                AbstractC2371l abstractC2371l = (AbstractC2371l) AbstractC16901l.m4208abstract(((C13228l) it.next()).yandex.yandex);
                arrayList.add(new C11765l(abstractC2371l.yandex.getWidth(), abstractC2371l.yandex.getHeight(), abstractC2371l.loadAd));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((C11765l) it2.next()).crashlytics != ((C11765l) arrayList.get(0)).crashlytics) {
                    C8339l.smaato("All InputStream.Config objects must have the same format for multi resolution");
                    return null;
                }
            }
        }
        if (interfaceC2413l.mo840synchronized(new C7104l(i, arrayList, arrayList2, (Executor) this.yandex.admob.getValue(), c15202l, c7931l.billing, c7931l.mopub))) {
            return new C5522l(c4291lAmazon.loadAd, c4291lAmazon.amazon);
        }
        Log.w("CXCP", "Failed to create capture session from " + interfaceC2413l + " for " + c15202l + '!');
        c15202l.yandex();
        return c7472l;
    }
}
