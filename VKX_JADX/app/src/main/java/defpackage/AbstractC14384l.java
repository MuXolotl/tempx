package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: lٓۙٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14384l {
    public AbstractC10759l billing;
    public C17849l mopub;
    public Looper purchase;
    public final ArrayList yandex = new ArrayList(1);
    public final HashSet loadAd = new HashSet(1);
    public final C13698l crashlytics = new C13698l(new CopyOnWriteArrayList(), 0, (C5019l) null);
    public final C13281l amazon = new C13281l(new CopyOnWriteArrayList(), 0, null);

    public final void adcel(InterfaceC11885l interfaceC11885l) {
        CopyOnWriteArrayList<C15465l> copyOnWriteArrayList = this.amazon.crashlytics;
        for (C15465l c15465l : copyOnWriteArrayList) {
            if (c15465l.loadAd == interfaceC11885l) {
                copyOnWriteArrayList.remove(c15465l);
            }
        }
    }

    public abstract C2427l admob();

    public final void ads(InterfaceC4784l interfaceC4784l) {
        CopyOnWriteArrayList<C17808l> copyOnWriteArrayList = (CopyOnWriteArrayList) this.crashlytics.f26746l;
        for (C17808l c17808l : copyOnWriteArrayList) {
            if (c17808l.loadAd == interfaceC4784l) {
                copyOnWriteArrayList.remove(c17808l);
            }
        }
    }

    public final void crashlytics(InterfaceC1989l interfaceC1989l) {
        HashSet hashSet = this.loadAd;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC1989l);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        amazon();
    }

    public final void firebase(InterfaceC1989l interfaceC1989l, C7713l c7713l, C17849l c17849l) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.purchase;
        AbstractC12442l.admob(looper == null || looper == looperMyLooper);
        this.mopub = c17849l;
        AbstractC10759l abstractC10759l = this.billing;
        this.yandex.add(interfaceC1989l);
        if (this.purchase == null) {
            this.purchase = looperMyLooper;
            this.loadAd.add(interfaceC1989l);
            smaato(c7713l);
        } else if (abstractC10759l != null) {
            purchase(interfaceC1989l);
            interfaceC1989l.yandex(this, abstractC10759l);
        }
    }

    public abstract void isPro();

    public abstract InterfaceC8782l loadAd(C5019l c5019l, InterfaceC3783l interfaceC3783l, long j);

    public final void metrica(InterfaceC1989l interfaceC1989l) {
        ArrayList arrayList = this.yandex;
        arrayList.remove(interfaceC1989l);
        if (!arrayList.isEmpty()) {
            crashlytics(interfaceC1989l);
            return;
        }
        this.purchase = null;
        this.billing = null;
        this.mopub = null;
        this.loadAd.clear();
        startapp();
    }

    public AbstractC10759l mopub() {
        return null;
    }

    public final void purchase(InterfaceC1989l interfaceC1989l) {
        this.purchase.getClass();
        HashSet hashSet = this.loadAd;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC1989l);
        if (zIsEmpty) {
            billing();
        }
    }

    public final void remoteconfig(AbstractC10759l abstractC10759l) {
        this.billing = abstractC10759l;
        Iterator it = this.yandex.iterator();
        while (it.hasNext()) {
            ((InterfaceC1989l) it.next()).yandex(this, abstractC10759l);
        }
    }

    public abstract void smaato(C7713l c7713l);

    public abstract void startapp();

    public boolean subs() {
        return true;
    }

    public abstract void vip(InterfaceC8782l interfaceC8782l);

    public boolean yandex(C2427l c2427l) {
        return false;
    }

    public void amazon() {
    }

    public void billing() {
    }

    public void subscription(C2427l c2427l) {
    }
}
