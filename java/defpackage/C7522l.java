package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؚۛۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7522l {
    public AbstractC13821l amazon;
    public boolean billing;
    public boolean crashlytics;
    public final String loadAd;
    public final ArrayList purchase = new ArrayList();
    public final C3097l yandex;

    public C7522l(C3097l c3097l, String str) {
        this.yandex = c3097l;
        this.loadAd = str;
    }

    public static void crashlytics(C7522l c7522l, String str, long j, Function0 function0, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        boolean z = (i & 4) != 0;
        c7522l.getClass();
        c7522l.amazon(new C5973l(str, z, function0), j);
    }

    public final void amazon(AbstractC13821l abstractC13821l, long j) {
        synchronized (this.yandex) {
            if (!this.crashlytics) {
                if (purchase(abstractC13821l, j, false)) {
                    this.yandex.crashlytics(this);
                }
                Unit unit = Unit.INSTANCE;
                return;
            }
            boolean z = abstractC13821l.loadAd;
            Logger logger = this.yandex.loadAd;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC4952l.loadAd(logger, abstractC13821l, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC4952l.loadAd(logger, abstractC13821l, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final void billing() {
        C3097l c3097l = this.yandex;
        TimeZone timeZone = AbstractC11432l.yandex;
        synchronized (c3097l) {
            try {
                this.crashlytics = true;
                if (loadAd()) {
                    this.yandex.crashlytics(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean loadAd() {
        AbstractC13821l abstractC13821l = this.amazon;
        if (abstractC13821l != null && abstractC13821l.loadAd) {
            this.billing = true;
        }
        ArrayList arrayList = this.purchase;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((AbstractC13821l) arrayList.get(size)).loadAd) {
                Logger logger = this.yandex.loadAd;
                AbstractC13821l abstractC13821l2 = (AbstractC13821l) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC4952l.loadAd(logger, abstractC13821l2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[LOOP:0: B:23:0x005f->B:28:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0077 A[EDGE_INSN: B:40:0x0077->B:30:0x0077 BREAK  A[LOOP:0: B:23:0x005f->B:28:0x0073], SYNTHETIC] */
    public final boolean purchase(AbstractC13821l abstractC13821l, long j, boolean z) {
        Iterator it;
        int size;
        String strConcat;
        Logger logger = this.yandex.loadAd;
        C7522l c7522l = abstractC13821l.crashlytics;
        if (c7522l != this) {
            if (c7522l != null) {
                C8339l.smaato("task is in multiple queues");
                return false;
            }
            abstractC13821l.crashlytics = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.purchase;
        int iIndexOf = arrayList.indexOf(abstractC13821l);
        if (iIndexOf == -1) {
            abstractC13821l.amazon = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(AbstractC4952l.remoteconfig(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(AbstractC4952l.remoteconfig(j2 - jNanoTime));
                }
                AbstractC4952l.loadAd(logger, abstractC13821l, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((AbstractC13821l) it.next()).amazon - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, abstractC13821l);
            if (size == 0) {
                return true;
            }
        } else if (abstractC13821l.amazon > j2) {
            arrayList.remove(iIndexOf);
            abstractC13821l.amazon = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(AbstractC4952l.remoteconfig(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(AbstractC4952l.remoteconfig(j2 - jNanoTime));
                }
                AbstractC4952l.loadAd(logger, abstractC13821l, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((AbstractC13821l) it.next()).amazon - jNanoTime > j) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, abstractC13821l);
            if (size == 0) {
                return true;
            }
        } else if (logger.isLoggable(Level.FINE)) {
            AbstractC4952l.loadAd(logger, abstractC13821l, this, "already scheduled");
            return false;
        }
        return false;
    }

    public final String toString() {
        return this.loadAd;
    }

    public final void yandex() {
        C3097l c3097l = this.yandex;
        TimeZone timeZone = AbstractC11432l.yandex;
        synchronized (c3097l) {
            try {
                if (loadAd()) {
                    this.yandex.crashlytics(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
