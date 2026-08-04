package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: lؚْۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7238l extends AbstractC14384l {
    public final HashMap admob = new HashMap();
    public C7713l isPro;
    public Handler subs;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [lٟؓٝ, lؗۛۦ] */
    public final void ad(final Integer num, AbstractC14384l abstractC14384l) {
        HashMap map = this.admob;
        AbstractC12442l.admob(!map.containsKey(num));
        ?? r1 = new InterfaceC1989l() { // from class: lؗۛۦ
            @Override // defpackage.InterfaceC1989l
            public final void yandex(AbstractC14384l abstractC14384l2, AbstractC10759l abstractC10759l) {
                this.yandex.pro(num, abstractC14384l2, abstractC10759l);
            }
        };
        C13754l c13754l = new C13754l(this, num);
        map.put(num, new C5009l(abstractC14384l, r1, c13754l));
        Handler handler = this.subs;
        handler.getClass();
        abstractC14384l.getClass();
        C13698l c13698l = abstractC14384l.crashlytics;
        c13698l.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c13698l.f26746l;
        C17808l c17808l = new C17808l();
        c17808l.yandex = handler;
        c17808l.loadAd = c13754l;
        copyOnWriteArrayList.add(c17808l);
        Handler handler2 = this.subs;
        handler2.getClass();
        C13281l c13281l = abstractC14384l.amazon;
        c13281l.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = c13281l.crashlytics;
        C15465l c15465l = new C15465l();
        c15465l.yandex = handler2;
        c15465l.loadAd = c13754l;
        copyOnWriteArrayList2.add(c15465l);
        C7713l c7713l = this.isPro;
        C17849l c17849l = this.mopub;
        c17849l.getClass();
        abstractC14384l.firebase(r1, c7713l, c17849l);
        if (this.loadAd.isEmpty()) {
            abstractC14384l.crashlytics(r1);
        }
    }

    @Override // defpackage.AbstractC14384l
    public final void amazon() {
        for (C5009l c5009l : this.admob.values()) {
            c5009l.yandex.crashlytics(c5009l.loadAd);
        }
    }

    @Override // defpackage.AbstractC14384l
    public final void billing() {
        for (C5009l c5009l : this.admob.values()) {
            c5009l.yandex.purchase(c5009l.loadAd);
        }
    }

    @Override // defpackage.AbstractC14384l
    public void isPro() {
        Iterator it = this.admob.values().iterator();
        while (it.hasNext()) {
            ((C5009l) it.next()).yandex.isPro();
        }
    }

    public abstract void pro(Object obj, AbstractC14384l abstractC14384l, AbstractC10759l abstractC10759l);

    @Override // defpackage.AbstractC14384l
    public void startapp() {
        HashMap map = this.admob;
        for (C5009l c5009l : map.values()) {
            AbstractC14384l abstractC14384l = c5009l.yandex;
            C13754l c13754l = c5009l.crashlytics;
            abstractC14384l.metrica(c5009l.loadAd);
            abstractC14384l.ads(c13754l);
            abstractC14384l.adcel(c13754l);
        }
        map.clear();
    }

    public abstract C5019l tapsense(Object obj, C5019l c5019l);

    public long Signature(long j, Object obj) {
        return j;
    }

    public int license(int i, Object obj) {
        return i;
    }
}
