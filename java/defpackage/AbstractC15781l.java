package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕٚۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15781l {
    public C3512l amazon;
    public ExecutorC8064l crashlytics;
    public Executor loadAd;
    public boolean mopub;
    public C15813l purchase;
    public C18662l yandex;
    public final C3797l billing = new C3797l(new C10832l(0, this, AbstractC15781l.class, "onClosed", "onClosed()V", 0, 0, 0));
    public final ThreadLocal admob = new ThreadLocal();
    public final LinkedHashMap subs = new LinkedHashMap();
    public boolean isPro = true;

    public LinkedHashMap admob() {
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(C5746l.f12138l, 10));
        if (iFirebase < 16) {
            iFirebase = 16;
        }
        return new LinkedHashMap(iFirebase);
    }

    public abstract C15813l amazon();

    public final InterfaceC11449l billing() {
        C3512l c3512l = this.amazon;
        if (c3512l == null) {
            c3512l = null;
        }
        InterfaceC11449l interfaceC11449lCrashlytics = c3512l.crashlytics();
        if (interfaceC11449lCrashlytics != null) {
            return interfaceC11449lCrashlytics;
        }
        C8339l.smaato("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public List crashlytics(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC2200l.firebase(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(((InterfaceC13937l) ((InterfaceC1388l) entry.getKey())).mo1730private(), entry.getValue());
        }
        return C2580l.f5619l;
    }

    public final void firebase() {
        billing().mo966this().vip();
        if (isPro()) {
            return;
        }
        C15813l c15813l = this.purchase;
        if (c15813l == null) {
            c15813l = null;
        }
        c15813l.crashlytics.mopub(c15813l.billing, c15813l.mopub);
    }

    public final boolean isPro() {
        return smaato() && billing().mo966this().isVip();
    }

    public final void loadAd() {
        yandex();
        yandex();
        C11442l c11442lMo966this = billing().mo966this();
        if (!c11442lMo966this.isVip()) {
            C15813l c15813l = this.purchase;
            InterfaceC14029l interfaceC14029l = null;
            if (c15813l == null) {
                c15813l = null;
            }
            c15813l.getClass();
            C3156l c3156l = new C3156l(c15813l, interfaceC14029l, 1);
            Thread.interrupted();
            AbstractC10999l.subs(C17218l.f33421l, new C7864l(c3156l, interfaceC14029l, 13));
        }
        if (c11442lMo966this.f23028l.isWriteAheadLoggingEnabled()) {
            c11442lMo966this.billing();
        } else {
            c11442lMo966this.yandex();
        }
    }

    public final Object metrica(boolean z, Function2 function2, AbstractC0283l abstractC0283l) {
        C3512l c3512l = this.amazon;
        if (c3512l == null) {
            c3512l = null;
        }
        return ((InterfaceC2636l) c3512l.billing).tapsense(z, function2, abstractC0283l);
    }

    public Set mopub() {
        return AbstractC16901l.m4229l(new ArrayList(AbstractC14055l.billing(C5746l.f12138l, 10)));
    }

    public AbstractC9963l purchase() {
        throw new C13165l();
    }

    public final Object remoteconfig(Callable callable) {
        loadAd();
        try {
            Object objCall = callable.call();
            vip();
            return objCall;
        } finally {
            firebase();
        }
    }

    public final boolean smaato() {
        C3512l c3512l = this.amazon;
        if (c3512l == null) {
            c3512l = null;
        }
        C11442l c11442l = (C11442l) c3512l.mopub;
        if (c11442l != null) {
            return c11442l.f23028l.isOpen();
        }
        return false;
    }

    public final boolean subs() {
        C3512l c3512l = this.amazon;
        if (c3512l == null) {
            c3512l = null;
        }
        return c3512l.crashlytics() != null;
    }

    public final void vip() {
        billing().mo966this().signatures();
    }

    public final void yandex() {
        if (this.mopub) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            C8339l.smaato("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }
}
