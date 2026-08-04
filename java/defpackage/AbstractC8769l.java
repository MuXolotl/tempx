package defpackage;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: renamed from: lٌٓ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8769l {
    public static final Object firebase = new Object();
    public boolean admob;
    public boolean amazon;
    public volatile Object billing;
    public int crashlytics;
    public final RunnableC5360l isPro;
    public final C8348l loadAd;
    public int mopub;
    public volatile Object purchase;
    public boolean subs;
    public final Object yandex;

    public AbstractC8769l() {
        this.yandex = new Object();
        this.loadAd = new C8348l();
        this.crashlytics = 0;
        Object obj = firebase;
        this.billing = obj;
        this.isPro = new RunnableC5360l(14, this);
        this.purchase = obj;
        this.mopub = -1;
    }

    public static void yandex(String str) {
        C0508l.purchase().crashlytics.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        C8339l.smaato(AbstractC15560l.Signature("Cannot invoke ", str, " on a background thread"));
    }

    public final void admob(InterfaceC2810l interfaceC2810l) {
        yandex("removeObserver");
        AbstractC4649l abstractC4649l = (AbstractC4649l) this.loadAd.billing(interfaceC2810l);
        if (abstractC4649l == null) {
            return;
        }
        abstractC4649l.yandex(false);
    }

    public Object amazon() {
        Object obj = this.purchase;
        if (obj != firebase) {
            return obj;
        }
        return null;
    }

    public final void crashlytics(AbstractC4649l abstractC4649l) {
        if (this.admob) {
            this.subs = true;
            return;
        }
        this.admob = true;
        do {
            this.subs = false;
            if (abstractC4649l != null) {
                loadAd(abstractC4649l);
                abstractC4649l = null;
            } else {
                C8348l c8348l = this.loadAd;
                c8348l.getClass();
                C10234l c10234l = new C10234l(c8348l);
                c8348l.f17275l.put(c10234l, Boolean.FALSE);
                while (c10234l.hasNext()) {
                    loadAd((AbstractC4649l) ((Map.Entry) c10234l.next()).getValue());
                    if (this.subs) {
                        break;
                    }
                }
            }
        } while (this.subs);
        this.admob = false;
    }

    public final void loadAd(AbstractC4649l abstractC4649l) {
        if (abstractC4649l.f9465l) {
            if (!abstractC4649l.crashlytics()) {
                abstractC4649l.yandex(false);
                return;
            }
            int i = abstractC4649l.f9464l;
            int i2 = this.mopub;
            if (i >= i2) {
                return;
            }
            abstractC4649l.f9464l = i2;
            abstractC4649l.f9466l.yandex(this.purchase);
        }
    }

    public final void purchase(InterfaceC2810l interfaceC2810l) {
        yandex("observeForever");
        C13537l c13537l = new C13537l(this, interfaceC2810l);
        AbstractC4649l abstractC4649l = (AbstractC4649l) this.loadAd.amazon(interfaceC2810l, c13537l);
        if (abstractC4649l instanceof AbstractC5352l) {
            C8339l.metrica("Cannot add the same observer with different lifecycles");
        } else {
            if (abstractC4649l != null) {
                return;
            }
            c13537l.yandex(true);
        }
    }

    public abstract void subs(Object obj);

    public void billing() {
    }

    public void mopub() {
    }

    public AbstractC8769l(Object obj) {
        this.yandex = new Object();
        this.loadAd = new C8348l();
        this.crashlytics = 0;
        this.billing = firebase;
        this.isPro = new RunnableC5360l(14, this);
        this.purchase = obj;
        this.mopub = 0;
    }
}
