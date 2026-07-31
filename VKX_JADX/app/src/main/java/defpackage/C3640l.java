package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lِؕۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3640l implements AutoCloseable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC9473l f7619l;

    public /* synthetic */ C3640l(InterfaceC9473l interfaceC9473l) {
        this.f7619l = interfaceC9473l;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7619l.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3640l) {
            return this.f7619l.equals(((C3640l) obj).f7619l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7619l.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.f7619l + ")";
    }
}
