package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: renamed from: lؙؓۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2112l {
    public C15855l admob;
    public C6655l billing;
    public final ScheduledExecutorServiceC10335l loadAd;
    public C2974l mopub;
    public ScheduledFuture purchase;
    public C6921l subs;
    public final Executor yandex;
    public final Object crashlytics = new Object();
    public final Object amazon = new Object();
    public final C7162l isPro = new C7162l(0, this);
    public volatile List firebase = C2580l.f5619l;
    public final AtomicBoolean smaato = new AtomicBoolean(false);
    public final CopyOnWriteArrayList remoteconfig = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList vip = new CopyOnWriteArrayList();
    public final LinkedHashMap metrica = new LinkedHashMap();

    public C2112l(Executor executor, ScheduledExecutorServiceC10335l scheduledExecutorServiceC10335l) {
        this.yandex = executor;
        this.loadAd = scheduledExecutorServiceC10335l;
    }

    public final void admob(C6921l c6921l, C6655l c6655l, C2974l c2974l) {
        if (this.smaato.compareAndSet(false, true)) {
            AbstractC5088l.subs("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            this.subs = c6921l;
            Set setLoadAd = c6655l.loadAd();
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(setLoadAd, 10));
            Iterator it = setLoadAd.iterator();
            while (it.hasNext()) {
                arrayList.add(C12371l.crashlytics((String) it.next(), null, null));
            }
            this.firebase = arrayList;
            this.billing = c6655l;
            this.mopub = c2974l;
            this.admob = c6655l.billing;
            this.yandex.execute(new RunnableC2936l(this, 2));
            C15855l c15855l = this.admob;
            if (c15855l != null) {
                c15855l.amazon(new ExecutorC7870l(this.yandex), this.isPro);
            }
        }
    }

    public final void amazon(String str) {
        synchronized (this.crashlytics) {
            InterfaceC2810l interfaceC2810l = (InterfaceC2810l) this.metrica.remove(str);
            C2974l c2974l = this.mopub;
            if (interfaceC2810l != null && c2974l != null) {
                try {
                    AbstractC12272l.admob().execute(new RunnableC7762l(c2974l.crashlytics(str), interfaceC2810l, 15));
                    AbstractC5088l.yandex("CameraPresencePrvdr", "Removed state observer for: " + str);
                } catch (IllegalArgumentException unused) {
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void billing(InterfaceC15879l interfaceC15879l) {
        final String strMopub = interfaceC15879l.mopub();
        if (this.smaato.get()) {
            synchronized (this.crashlytics) {
                if (this.metrica.containsKey(strMopub)) {
                    return;
                }
                InterfaceC2810l interfaceC2810l = new InterfaceC2810l() { // from class: lًۣؒ
                    @Override // defpackage.InterfaceC2810l
                    public final void yandex(Object obj) {
                        C6738l c6738l = (C6738l) obj;
                        C2112l c2112l = this.yandex;
                        if (!c2112l.smaato.get()) {
                            AbstractC5088l.yandex("CameraPresencePrvdr", "Ignore camera state change handling since already stop monitoring");
                            return;
                        }
                        if (c6738l.loadAd != null) {
                            StringBuilder sbIsVip = AbstractC5020l.isVip("Camera ", strMopub, " state changed to ");
                            sbIsVip.append(AbstractC14814l.applovin(c6738l.yandex));
                            sbIsVip.append(" with error: ");
                            C4812l c4812l = c6738l.loadAd;
                            sbIsVip.append(c4812l != null ? Integer.valueOf(c4812l.yandex) : null);
                            sbIsVip.append(". Triggering refresh.");
                            AbstractC5088l.tapsense("CameraPresencePrvdr", sbIsVip.toString());
                            c2112l.yandex.execute(new RunnableC2936l(c2112l, 1));
                        }
                    }
                };
                AbstractC12272l.admob().execute(new RunnableC7762l(interfaceC15879l, interfaceC2810l, 16));
                this.metrica.put(strMopub, interfaceC2810l);
                AbstractC5088l.yandex("CameraPresencePrvdr", "Registered state observer for camera: ".concat(strMopub));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void crashlytics(Set set, Set set2) {
        boolean zIsEmpty = set.isEmpty();
        CopyOnWriteArrayList<C16080l> copyOnWriteArrayList = this.vip;
        if (!zIsEmpty) {
            AbstractC5088l.subs("CameraPresencePrvdr", "Notifying " + set.size() + " cameras added.");
            for (C16080l c16080l : copyOnWriteArrayList) {
                c16080l.loadAd.execute(new RunnableC15875l(c16080l, set));
            }
        }
        if (set2.isEmpty()) {
            return;
        }
        AbstractC5088l.subs("CameraPresencePrvdr", "Notifying " + set2.size() + " cameras removed.");
        for (C16080l c16080l2 : copyOnWriteArrayList) {
            c16080l2.loadAd.execute(new RunnableC7762l(c16080l2, set2, 14));
        }
    }

    public final void loadAd(String str) {
        C2974l c2974l = this.mopub;
        if (c2974l == null) {
            return;
        }
        try {
            billing(c2974l.crashlytics(str).adcel());
        } catch (IllegalArgumentException unused) {
            AbstractC5088l.tapsense("CameraPresencePrvdr", "CameraInternal not found for " + str + ". Cannot setup state observer.");
        }
    }

    public final void mopub() {
        if (!this.smaato.getAndSet(false)) {
            AbstractC5088l.yandex("CameraPresencePrvdr", "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        AbstractC5088l.subs("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        synchronized (this.amazon) {
            try {
                ScheduledFuture scheduledFuture = this.purchase;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.purchase = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        C15855l c15855l = this.admob;
        if (c15855l != null) {
            c15855l.remoteconfig(this.isPro);
        }
        yandex();
        this.subs = null;
        this.remoteconfig.clear();
        this.vip.clear();
        this.firebase = C2580l.f5619l;
        this.billing = null;
        this.mopub = null;
    }

    public final void purchase(int i, List list) {
        if (i > 0 && this.smaato.get()) {
            this.purchase = this.loadAd.schedule(new RunnableC15650l(this, list, i, 0), i == 3 ? 0L : 400L, TimeUnit.MILLISECONDS);
        } else if (i <= 0) {
            AbstractC5088l.tapsense("CameraPresencePrvdr", "Exhausted all retries for camera list refresh.");
        }
    }

    public final void yandex() {
        synchronized (this.crashlytics) {
            if (this.metrica.isEmpty()) {
                return;
            }
            Map mapTapsense = AbstractC8676l.tapsense(this.metrica);
            this.metrica.clear();
            Unit unit = Unit.INSTANCE;
            C2974l c2974l = this.mopub;
            if (c2974l != null) {
                LinkedHashSet<InterfaceC18690l> linkedHashSetAmazon = c2974l.amazon();
                ArrayList arrayList = new ArrayList();
                for (InterfaceC18690l interfaceC18690l : linkedHashSetAmazon) {
                    InterfaceC15879l interfaceC15879lAdcel = interfaceC18690l != null ? interfaceC18690l.adcel() : null;
                    if (interfaceC15879lAdcel != null) {
                        arrayList.add(interfaceC15879lAdcel);
                    }
                }
                AbstractC5088l.yandex("CameraPresencePrvdr", "Clearing all " + mapTapsense.size() + " state observers.");
                for (Map.Entry entry : mapTapsense.entrySet()) {
                    AbstractC12272l.admob().execute(new RunnableC10613l(arrayList, (InterfaceC2810l) entry.getValue(), (String) entry.getKey(), 8));
                }
            }
        }
    }
}
