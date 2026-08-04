package defpackage;

import java.io.Closeable;
import java.nio.channels.SelectableChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: lُؗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4820l implements Closeable, InterfaceC11791l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9868l = AtomicIntegerFieldUpdater.newUpdater(AbstractC4820l.class, "_interestedOps");

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AtomicBoolean f9870l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C12820l f9869l = new C12820l();
    private volatile /* synthetic */ int _interestedOps = 0;

    public final int ads() {
        return this._interestedOps;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f9870l.compareAndSet(false, true)) {
            this._interestedOps = 0;
            C12820l c12820l = this.f9869l;
            for (EnumC14535l enumC14535l : EnumC14535l.f28461l) {
                c12820l.getClass();
                InterfaceC4305l interfaceC4305l = (InterfaceC4305l) C12820l.yandex[enumC14535l.ordinal()].getAndSet(c12820l, null);
                if (interfaceC4305l != null) {
                    interfaceC4305l.subs(new C18435l(new C12423l("Closed channel.", 0)));
                }
            }
        }
    }

    public abstract SelectableChannel mopub();

    public final void signatures(EnumC14535l enumC14535l, boolean z) {
        int i;
        int i2 = enumC14535l.f28465l;
        do {
            i = this._interestedOps;
        } while (!f9868l.compareAndSet(this, i, z ? i | i2 : (~i2) & i));
    }

    @Override // defpackage.InterfaceC11791l
    public void yandex() {
        close();
    }
}
