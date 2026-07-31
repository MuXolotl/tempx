package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: renamed from: lٌٛٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8911l extends AbstractC6421l {

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C5885l f18305l = new C5885l(C8911l.class);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final boolean f18306l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public AbstractC5511l f18307l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public C10313l f18308l;

    public C8911l(AbstractC5511l abstractC5511l, boolean z) {
        int size = abstractC5511l.size();
        this.f13441l = null;
        this.f13442l = size;
        this.f18307l = abstractC5511l;
        this.f18306l = z;
    }

    public final void adcel(AbstractC5511l abstractC5511l) {
        int iCrashlytics = AbstractC6421l.f13439l.crashlytics(this);
        AbstractC12442l.ads("Less than 0 remaining futures", iCrashlytics >= 0);
        if (iCrashlytics == 0) {
            if (abstractC5511l != null) {
                AbstractC10199l it = abstractC5511l.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        try {
                            AbstractC11342l.billing(future);
                        } catch (ExecutionException e) {
                            ads(e.getCause());
                        } catch (Throwable th) {
                            ads(th);
                        }
                    }
                }
            }
            this.f13441l = null;
            C10313l c10313l = this.f18308l;
            if (c10313l != null) {
                try {
                    c10313l.f21030l.execute(c10313l);
                } catch (RejectedExecutionException e2) {
                    c10313l.f21033l.remoteconfig(e2);
                }
            }
            this.f18307l = null;
        }
    }

    public final void ads(Throwable th) {
        th.getClass();
        if (this.f18306l && !remoteconfig(th)) {
            Set set = this.f13441l;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.f5919l instanceof C17783l)) {
                    Throwable thMetrica = metrica();
                    Objects.requireNonNull(thMetrica);
                    while (thMetrica != null && setNewSetFromMap.add(thMetrica)) {
                        thMetrica = thMetrica.getCause();
                    }
                }
                AbstractC6421l.f13439l.loadAd(this, setNewSetFromMap);
                Set set2 = this.f13441l;
                Objects.requireNonNull(set2);
                set = set2;
            }
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    f18305l.yandex().log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
                    return;
                } else if (!set.add(cause)) {
                    break;
                } else {
                    cause = cause.getCause();
                }
            }
        }
        if (th instanceof Error) {
            f18305l.yandex().log(Level.SEVERE, "Input Future failed with Error", th);
        }
    }

    @Override // defpackage.AbstractC2722l
    public final void crashlytics() {
        AbstractC5511l abstractC5511l = this.f18307l;
        this.f18307l = null;
        this.f18308l = null;
        if ((this.f5919l instanceof C17783l) && (abstractC5511l != null)) {
            boolean zStartapp = startapp();
            AbstractC10199l it = abstractC5511l.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zStartapp);
            }
        }
    }

    @Override // defpackage.AbstractC2722l
    public final String isPro() {
        AbstractC5511l abstractC5511l = this.f18307l;
        if (abstractC5511l == null) {
            return super.isPro();
        }
        return "futures=" + abstractC5511l;
    }

    @Override // defpackage.AbstractC2722l
    public final void subs() {
        C10313l c10313l = this.f18308l;
        if (c10313l != null) {
            c10313l.crashlytics();
        }
    }

    public final void subscription() {
        Objects.requireNonNull(this.f18307l);
        if (this.f18307l.isEmpty()) {
            C10313l c10313l = this.f18308l;
            if (c10313l != null) {
                try {
                    c10313l.f21030l.execute(c10313l);
                    return;
                } catch (RejectedExecutionException e) {
                    c10313l.f21033l.remoteconfig(e);
                    return;
                }
            }
            return;
        }
        boolean z = this.f18306l;
        EnumC1535l enumC1535l = EnumC1535l.f3808l;
        if (!z) {
            RunnableC7762l runnableC7762l = new RunnableC7762l(this, (Object) null, 1);
            AbstractC10199l it = this.f18307l.iterator();
            while (it.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) it.next();
                if (listenableFuture.isDone()) {
                    adcel(null);
                } else {
                    listenableFuture.yandex(runnableC7762l, enumC1535l);
                }
            }
            return;
        }
        AbstractC10199l it2 = this.f18307l.iterator();
        int i = 0;
        while (it2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            int i2 = i + 1;
            if (listenableFuture2.isDone()) {
                tapsense(listenableFuture2);
            } else {
                listenableFuture2.yandex(new RunnableC7762l(this, i, listenableFuture2), enumC1535l);
            }
            i = i2;
        }
    }

    public final void tapsense(ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.f18307l = null;
                cancel(false);
            } else {
                try {
                    AbstractC11342l.billing(listenableFuture);
                } catch (ExecutionException e) {
                    ads(e.getCause());
                } catch (Throwable th) {
                    ads(th);
                }
            }
        } finally {
            adcel(null);
        }
    }
}
