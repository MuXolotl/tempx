package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* JADX INFO: renamed from: lً٘ۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17778l implements Cloneable {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public boolean f34618l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f34619l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final AtomicBoolean f34620l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f34621l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f34622l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public boolean f34623l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C17032l f34624l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C11610l f34625l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public volatile C4619l f34626l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f34627l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C13247l f34628l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public boolean f34629l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public volatile AbstractC17567l f34630l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C0093l f34631l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public C4619l f34632l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public InterfaceC11772l f34633l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C10064l f34634l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public boolean f34635l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public boolean f34636l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public volatile boolean f34637l;

    static {
        AtomicReferenceFieldUpdater.newUpdater(C17778l.class, AbstractC17567l.class, "lٍۣۢ");
    }

    public C17778l(C11610l c11610l, C17032l c17032l, boolean z) {
        this.f34625l = c11610l;
        this.f34624l = c17032l;
        this.f34619l = z;
        this.f34631l = (C0093l) c11610l.appmetrica.f10245l;
        c11610l.amazon.getClass();
        this.f34630l = AbstractC17567l.yandex;
        C10064l c10064l = new C10064l(this);
        c10064l.mopub(c11610l.license, TimeUnit.MILLISECONDS);
        this.f34634l = c10064l;
        this.f34620l = new AtomicBoolean();
        this.f34627l = true;
        this.f34621l = new CopyOnWriteArrayList();
        new AtomicReference(c17032l.purchase);
    }

    public static final String yandex(C17778l c17778l) {
        StringBuilder sb = new StringBuilder();
        sb.append(c17778l.f34637l ? "canceled " : "");
        sb.append(c17778l.f34619l ? "web socket" : "call");
        sb.append(" to ");
        sb.append(c17778l.f34624l.yandex.mopub());
        return sb.toString();
    }

    public final void admob(boolean z) {
        C4619l c4619l;
        synchronized (this) {
            if (!this.f34627l) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z && (c4619l = this.f34626l) != null) {
            ((InterfaceC1029l) c4619l.f9374l).cancel();
            ((C17778l) c4619l.f9373l).isPro(c4619l, true, true, true, true, null);
        }
        this.f34632l = null;
    }

    public final void amazon() {
        if (this.f34637l) {
            return;
        }
        this.f34637l = true;
        C4619l c4619l = this.f34626l;
        if (c4619l != null) {
            ((InterfaceC1029l) c4619l.f9374l).cancel();
        }
        Iterator it = this.f34621l.iterator();
        while (it.hasNext()) {
            ((InterfaceC7476l) it.next()).cancel();
        }
        this.f34630l.getClass();
    }

    public final C18389l billing() {
        if (!this.f34620l.compareAndSet(false, true)) {
            C8339l.smaato("Already Executed");
            return null;
        }
        this.f34634l.admob();
        AbstractC16844l abstractC16844l = AbstractC16844l.yandex;
        this.f34622l = AbstractC16844l.yandex.mopub();
        this.f34630l.getClass();
        try {
            C12014l c12014l = this.f34625l.yandex;
            synchronized (c12014l) {
                ((ArrayDeque) c12014l.f23944l).add(this);
            }
            C18389l c18389lSubs = subs();
            C12014l c12014l2 = this.f34625l.yandex;
            c12014l2.getClass();
            C12014l.m3297case(c12014l2, null, this, null, 5);
            return c18389lSubs;
        } catch (Throwable th) {
            C12014l c12014l3 = this.f34625l.yandex;
            c12014l3.getClass();
            C12014l.m3297case(c12014l3, null, this, null, 5);
            throw th;
        }
    }

    public final Object clone() {
        return new C17778l(this.f34625l, this.f34624l, this.f34619l);
    }

    public final IOException crashlytics(IOException iOException) {
        IOException interruptedIOException;
        Socket socketSmaato;
        TimeZone timeZone = AbstractC11432l.yandex;
        C13247l c13247l = this.f34628l;
        if (c13247l != null) {
            synchronized (c13247l) {
                socketSmaato = smaato();
            }
            if (this.f34628l == null) {
                if (socketSmaato != null) {
                    AbstractC11432l.crashlytics(socketSmaato);
                }
                this.f34630l.getClass();
            } else if (socketSmaato != null) {
                C8339l.smaato("Check failed.");
                return null;
            }
        }
        if (!this.f34635l && this.f34634l.subs()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        AbstractC17567l abstractC17567l = this.f34630l;
        if (iOException != null) {
            abstractC17567l.getClass();
            return interruptedIOException;
        }
        abstractC17567l.getClass();
        return interruptedIOException;
    }

    public final IOException firebase(IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (this.f34627l) {
                    this.f34627l = false;
                    if (!this.f34618l && !this.f34636l && !this.f34629l && !this.f34623l) {
                        z = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z ? crashlytics(iOException) : iOException;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0028 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x002a A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:8:0x000e, B:23:0x002a, B:25:0x002e, B:27:0x0032, B:29:0x0036, B:30:0x0038, B:32:0x003d, B:34:0x0041, B:36:0x0045, B:41:0x004e, B:46:0x0058, B:14:0x0018, B:17:0x001e, B:20:0x0024), top: B:58:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:25:0x002e A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:8:0x000e, B:23:0x002a, B:25:0x002e, B:27:0x0032, B:29:0x0036, B:30:0x0038, B:32:0x003d, B:34:0x0041, B:36:0x0045, B:41:0x004e, B:46:0x0058, B:14:0x0018, B:17:0x001e, B:20:0x0024), top: B:58:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0032 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:8:0x000e, B:23:0x002a, B:25:0x002e, B:27:0x0032, B:29:0x0036, B:30:0x0038, B:32:0x003d, B:34:0x0041, B:36:0x0045, B:41:0x004e, B:46:0x0058, B:14:0x0018, B:17:0x001e, B:20:0x0024), top: B:58:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0036 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:8:0x000e, B:23:0x002a, B:25:0x002e, B:27:0x0032, B:29:0x0036, B:30:0x0038, B:32:0x003d, B:34:0x0041, B:36:0x0045, B:41:0x004e, B:46:0x0058, B:14:0x0018, B:17:0x001e, B:20:0x0024), top: B:58:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:39:0x004b  */
    public final IOException isPro(C4619l c4619l, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        if (c4619l.equals(this.f34626l)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (this.f34618l) {
                            if (z) {
                                this.f34618l = false;
                            }
                            if (z2) {
                                this.f34636l = false;
                            }
                            if (z4) {
                                this.f34629l = false;
                            }
                            if (z3) {
                                this.f34623l = false;
                            }
                            if (this.f34618l) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                z5 = true;
                            }
                            boolean z8 = z7;
                            z6 = z5;
                            z5 = z8;
                        } else if ((!z2 && this.f34636l) || ((z4 && this.f34629l) || (z3 && this.f34623l))) {
                            if (z) {
                                this.f34618l = false;
                            }
                            if (z2) {
                                this.f34636l = false;
                            }
                            if (z4) {
                                this.f34629l = false;
                            }
                            if (z3) {
                                this.f34623l = false;
                            }
                            if (this.f34618l || this.f34636l || this.f34629l || this.f34623l) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            if (z7 && !this.f34627l) {
                                z5 = true;
                            }
                            boolean z9 = z7;
                            z6 = z5;
                            z5 = z9;
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z6 = !z2 ? false : false;
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            if (z5) {
                this.f34626l = null;
                C13247l c13247l = this.f34628l;
                if (c13247l != null) {
                    c13247l.amazon();
                }
            }
            if (z6) {
                return crashlytics(iOException);
            }
        }
        return iOException;
    }

    public final void loadAd(C13247l c13247l) {
        TimeZone timeZone = AbstractC11432l.yandex;
        if (this.f34628l != null) {
            C8339l.smaato("Check failed.");
        } else {
            this.f34628l = c13247l;
            c13247l.startapp.add(new C13222l(this, this.f34622l));
        }
    }

    public final void purchase(InterfaceC10153l interfaceC10153l) {
        if (!this.f34620l.compareAndSet(false, true)) {
            C8339l.smaato("Already Executed");
            return;
        }
        AbstractC16844l abstractC16844l = AbstractC16844l.yandex;
        this.f34622l = AbstractC16844l.yandex.mopub();
        this.f34630l.getClass();
        C12014l c12014l = this.f34625l.yandex;
        RunnableC11777l runnableC11777l = new RunnableC11777l(this, interfaceC10153l);
        c12014l.getClass();
        C12014l.m3297case(c12014l, runnableC11777l, null, null, 6);
    }

    public final Socket smaato() {
        C13247l c13247l = this.f34628l;
        TimeZone timeZone = AbstractC11432l.yandex;
        ArrayList arrayList = c13247l.startapp;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (AbstractC8576l.yandex(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            C8339l.smaato("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.f34628l = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        c13247l.adcel = System.nanoTime();
        C0093l c0093l = this.f34631l;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c0093l.f1007l;
        C7522l c7522l = (C7522l) c0093l.f1005l;
        TimeZone timeZone2 = AbstractC11432l.yandex;
        if (!c13247l.isPro) {
            c7522l.amazon((C5973l) c0093l.f1004l, 0L);
            return null;
        }
        c13247l.isPro = true;
        concurrentLinkedQueue.remove(c13247l);
        if (concurrentLinkedQueue.isEmpty()) {
            c7522l.yandex();
        }
        return c13247l.purchase;
    }

    public final C18389l subs() {
        ArrayList arrayList = new ArrayList();
        AbstractC3984l.license(arrayList, this.f34625l.loadAd);
        arrayList.add(new C11943l(5));
        arrayList.add(new C11943l(2));
        arrayList.add(new C11943l(3));
        arrayList.add(C11943l.crashlytics);
        if (!this.f34619l) {
            AbstractC3984l.license(arrayList, this.f34625l.crashlytics);
        }
        arrayList.add(C11943l.loadAd);
        C17032l c17032l = this.f34624l;
        C11610l c11610l = this.f34625l;
        try {
            try {
                C18389l c18389lLoadAd = new C8795l(this, arrayList, 0, null, c17032l, c11610l.pro, c11610l.ad, c11610l.advert, c11610l.mopub, c11610l.tapsense, c11610l.appmetrica, c11610l.isPro, c11610l.firebase, c11610l.subscription, c11610l.remoteconfig, c11610l.smaato, c11610l.purchase, c11610l.vip, c11610l.metrica, c11610l.startapp, c11610l.Signature).loadAd(c17032l);
                if (this.f34637l) {
                    AbstractC7712l.loadAd(c18389lLoadAd);
                    throw new IOException("Canceled");
                }
                firebase(null);
                return c18389lLoadAd;
            } catch (IOException e) {
                throw firebase(e);
            }
        } catch (Throwable th) {
            if (0 == 0) {
                firebase(null);
            }
            throw th;
        }
    }
}
