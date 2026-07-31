package io.realm.kotlin.internal.interop;

import defpackage.AbstractC1753l;
import defpackage.AbstractC9321l;
import defpackage.AbstractC9795l;
import defpackage.C13774l;
import defpackage.C5456l;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lio/realm/kotlin/internal/interop/LongPointerWrapper;", "", "T", "Lio/realm/kotlin/internal/interop/NativePointer;", "", "ptr", "", "managed", "<init>", "(JZ)V", "", "release", "()V", "isReleased", "()Z", "", "toString", "()Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "released", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getReleased$cinterop_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "_ptr", "J", "getPtr$cinterop_release", "()J", "cinterop_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LongPointerWrapper<T> implements NativePointer<T> {
    private final long _ptr;
    private final AtomicBoolean released;

    public LongPointerWrapper(long j, boolean z) {
        this.released = new AtomicBoolean(false);
        this._ptr = j;
        if (z) {
            C5456l c5456l = C5456l.yandex;
            new C13774l(this, C5456l.loadAd);
        }
    }

    public final long getPtr$cinterop_release() {
        if (this.released.get()) {
            throw AbstractC9321l.yandex;
        }
        return this._ptr;
    }

    /* JADX INFO: renamed from: getReleased$cinterop_release, reason: from getter */
    public final AtomicBoolean getReleased() {
        return this.released;
    }

    @Override // io.realm.kotlin.internal.interop.NativePointer
    public boolean isReleased() {
        return this.released.get();
    }

    @Override // io.realm.kotlin.internal.interop.NativePointer
    public void release() {
        if (this.released.compareAndSet(false, true)) {
            long j = this._ptr;
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_release(j);
        }
    }

    public String toString() {
        return Long.toHexString(this._ptr);
    }

    public /* synthetic */ LongPointerWrapper(long j, boolean z, int i, AbstractC1753l abstractC1753l) {
        this(j, (i & 2) != 0 ? true : z);
    }
}
