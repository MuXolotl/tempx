package defpackage;

import java.io.Closeable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَٗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10349l implements Closeable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Function0 f21141l = new C11200l(8);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Function1 f21142l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f21143l;

    public C10349l(C11911l c11911l, Object obj, Function1 function1) {
        this.f21143l = obj;
        this.f21142l = function1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f21141l.invoke();
    }
}
