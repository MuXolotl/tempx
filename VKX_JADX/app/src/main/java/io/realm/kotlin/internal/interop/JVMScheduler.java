package io.realm.kotlin.internal.interop;

import defpackage.AbstractC10999l;
import defpackage.AbstractC11990l;
import defpackage.AbstractC1872l;
import defpackage.C10483l;
import defpackage.InterfaceC2262l;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/realm/kotlin/internal/interop/JVMScheduler;", "", "Llُٖؓ;", "dispatcher", "<init>", "(Llُٖؓ;)V", "", "schedulerPointer", "", "notifyCore", "(J)V", "cancel", "()V", "Llؓۦۨ;", "scope", "Llؓۦۨ;", "getScope", "()Llؓۦۨ;", "Llَٟۤ;", "lock", "Llَٟۤ;", "getLock", "()Llَٟۤ;", "", "cancelled", "Z", "getCancelled", "()Z", "setCancelled", "(Z)V", "cinterop_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class JVMScheduler {
    private boolean cancelled;
    private final C10483l lock = new C10483l();
    private final InterfaceC2262l scope;

    public JVMScheduler(AbstractC1872l abstractC1872l) {
        this.scope = AbstractC11990l.yandex(abstractC1872l);
    }

    public final void cancel() {
        synchronized (this.lock) {
            this.cancelled = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean getCancelled() {
        return this.cancelled;
    }

    public final C10483l getLock() {
        return this.lock;
    }

    public final InterfaceC2262l getScope() {
        return this.scope;
    }

    public final void notifyCore(long schedulerPointer) {
        AbstractC10999l.mopub(this.scope, null, 0, new yandex(this, schedulerPointer, null), 3);
    }

    public final void setCancelled(boolean z) {
        this.cancelled = z;
    }
}
