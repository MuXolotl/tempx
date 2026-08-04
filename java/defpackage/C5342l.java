package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* JADX INFO: renamed from: lؘؐٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5342l implements InterfaceC9492l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final LinkedHashMap f11488l = new LinkedHashMap();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public volatile Map f11487l = C14054l.f27396l;

    @Override // defpackage.InterfaceC9492l
    public final void adcel(InterfaceC10687l interfaceC10687l, long j) {
        for (Map.Entry entry : this.f11487l.entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC3950l(1, j, (InterfaceC9492l) entry.getKey(), interfaceC10687l));
        }
    }

    @Override // defpackage.InterfaceC9492l
    public final void ads(InterfaceC10687l interfaceC10687l) {
        for (Map.Entry entry : this.f11487l.entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC16421l((InterfaceC9492l) entry.getKey(), interfaceC10687l, 0));
        }
    }

    @Override // defpackage.InterfaceC9492l
    public final void billing(final InterfaceC10687l interfaceC10687l, final long j, final int i, final int i2) {
        for (Map.Entry entry : this.f11487l.entrySet()) {
            final InterfaceC9492l interfaceC9492l = (InterfaceC9492l) entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: lًٔؒ
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC9492l.billing(interfaceC10687l, j, i, i2);
                }
            });
        }
    }

    @Override // defpackage.InterfaceC9492l
    public final void inmobi(InterfaceC10687l interfaceC10687l, long j, C9992l c9992l) {
        for (Map.Entry entry : this.f11487l.entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC17598l((InterfaceC9492l) entry.getKey(), interfaceC10687l, j, c9992l, 1));
        }
    }

    @Override // defpackage.InterfaceC9492l
    public final void isVip(InterfaceC10687l interfaceC10687l, long j, long j2) {
        for (Map.Entry entry : this.f11487l.entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC1773l((InterfaceC9492l) entry.getKey(), interfaceC10687l, j, j2, 1));
        }
    }

    public final void loadAd(InterfaceC9492l interfaceC9492l) {
        synchronized (this.f11488l) {
            this.f11488l.remove(interfaceC9492l);
            this.f11487l = AbstractC8676l.tapsense(this.f11488l);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void mo1758package(InterfaceC10687l interfaceC10687l) {
        for (Map.Entry entry : this.f11487l.entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC16421l((InterfaceC9492l) entry.getKey(), interfaceC10687l, 2));
        }
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void mo1759private(InterfaceC10687l interfaceC10687l, long j, InterfaceC9595l interfaceC9595l) {
        for (Map.Entry entry : this.f11487l.entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC17902l((InterfaceC9492l) entry.getKey(), interfaceC10687l, j, interfaceC9595l, 0));
        }
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final void mo1760switch(C15390l c15390l) {
        for (Map.Entry entry : this.f11487l.entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC7762l((InterfaceC9492l) entry.getKey(), c15390l, 21));
        }
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void mo1761synchronized(InterfaceC10687l interfaceC10687l, long j, C15331l c15331l) {
        for (Map.Entry entry : this.f11487l.entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC17902l((InterfaceC9492l) entry.getKey(), interfaceC10687l, j, c15331l, 1));
        }
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final void mo1762throw(InterfaceC10687l interfaceC10687l, long j, C9992l c9992l) {
        for (Map.Entry entry : this.f11487l.entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC17598l((InterfaceC9492l) entry.getKey(), interfaceC10687l, j, c9992l, 0));
        }
    }

    @Override // defpackage.InterfaceC9492l
    public final void vip(InterfaceC10687l interfaceC10687l) {
        for (Map.Entry entry : this.f11487l.entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC16421l((InterfaceC9492l) entry.getKey(), interfaceC10687l, 1));
        }
    }

    public final void yandex(InterfaceC9492l interfaceC9492l, ExecutorC12010l executorC12010l) {
        if (this.f11487l.containsKey(interfaceC9492l)) {
            throw new IllegalStateException((interfaceC9492l + " was already registered!").toString());
        }
        synchronized (this.f11488l) {
            this.f11488l.put(interfaceC9492l, executorC12010l);
            this.f11487l = AbstractC8676l.tapsense(this.f11488l);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void signatures(InterfaceC10687l interfaceC10687l, int i) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void mopub(InterfaceC10687l interfaceC10687l, long j, long j2) {
    }
}
