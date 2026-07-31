package defpackage;

import android.net.ConnectivityManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lٔؓٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14637l implements InterfaceC12550l {
    public final ArrayList yandex;

    public C14637l(C13312l c13312l) {
        String str = AbstractC10076l.yandex;
        AbstractC13851l abstractC13851l = c13312l.loadAd;
        AbstractC13851l abstractC13851l2 = c13312l.amazon;
        ArrayList arrayListMetrica = AbstractC14055l.metrica(new C18140l(abstractC13851l, 0), new C18140l(c13312l.crashlytics, 1), new C18140l(c13312l.purchase, 4));
        if (Build.VERSION.SDK_INT >= 28) {
            arrayListMetrica.add(new C10260l((ConnectivityManager) c13312l.yandex.getSystemService("connectivity")));
        } else {
            arrayListMetrica.addAll(AbstractC14055l.remoteconfig(new C18140l(abstractC13851l2, 2), new C18140l(abstractC13851l2, 3), new C14900l(abstractC13851l2), new C8515l(abstractC13851l2)));
        }
        this.yandex = arrayListMetrica;
    }

    @Override // defpackage.InterfaceC12550l
    public long amazon(long j) {
        ArrayList arrayList = this.yandex;
        if (arrayList.isEmpty() || j < ((C8755l) arrayList.get(0)).loadAd) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((C8755l) arrayList.get(i)).loadAd;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                C8755l c8755l = (C8755l) arrayList.get(i - 1);
                long j3 = c8755l.amazon;
                return (j3 == -9223372036854775807L || j3 > j) ? c8755l.loadAd : j3;
            }
        }
        C8755l c8755l2 = (C8755l) AbstractC11356l.purchase(arrayList);
        long j4 = c8755l2.amazon;
        return (j4 == -9223372036854775807L || j < j4) ? c8755l2.loadAd : j4;
    }

    public int billing(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.yandex;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((C8755l) arrayList.get(i)).loadAd) {
                return i;
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC12550l
    public void clear() {
        this.yandex.clear();
    }

    @Override // defpackage.InterfaceC12550l
    public AbstractC1186l crashlytics(long j) {
        int iBilling = billing(j);
        if (iBilling == 0) {
            C9258l c9258l = AbstractC1186l.f3181l;
            return C13708l.f26763l;
        }
        C8755l c8755l = (C8755l) this.yandex.get(iBilling - 1);
        long j2 = c8755l.amazon;
        if (j2 == -9223372036854775807L || j < j2) {
            return c8755l.yandex;
        }
        C9258l c9258l2 = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    @Override // defpackage.InterfaceC12550l
    public boolean loadAd(C8755l c8755l, long j) {
        boolean z;
        long j2 = c8755l.loadAd;
        AbstractC12442l.admob(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = c8755l.amazon;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        ArrayList arrayList = this.yandex;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((C8755l) arrayList.get(size)).loadAd) {
                arrayList.add(size + 1, c8755l);
                return z;
            }
            if (((C8755l) arrayList.get(size)).loadAd <= j) {
                z = false;
            }
        }
        arrayList.add(0, c8755l);
        return z;
    }

    public InterfaceC6942l mopub(C7718l c7718l) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.yandex) {
            if (((InterfaceC4117l) obj).crashlytics(c7718l)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC4117l) it.next()).loadAd(c7718l.isPro));
        }
        return AbstractC0622l.isPro(new C14970l(13, (InterfaceC6942l[]) AbstractC16901l.m4213const(arrayList2).toArray(new InterfaceC6942l[0])));
    }

    @Override // defpackage.InterfaceC12550l
    public void purchase(long j) {
        int iBilling = billing(j);
        if (iBilling == 0) {
            return;
        }
        ArrayList arrayList = this.yandex;
        long j2 = ((C8755l) arrayList.get(iBilling - 1)).amazon;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iBilling--;
        }
        arrayList.subList(0, iBilling).clear();
    }

    @Override // defpackage.InterfaceC12550l
    public long yandex(long j) {
        ArrayList arrayList = this.yandex;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((C8755l) arrayList.get(0)).loadAd) {
            return ((C8755l) arrayList.get(0)).loadAd;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            C8755l c8755l = (C8755l) arrayList.get(i);
            long j2 = c8755l.loadAd;
            long j3 = c8755l.loadAd;
            if (j < j2) {
                long j4 = ((C8755l) arrayList.get(i - 1)).amazon;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((C8755l) AbstractC11356l.purchase(arrayList)).amazon;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    public C14637l() {
        this.yandex = new ArrayList();
    }
}
