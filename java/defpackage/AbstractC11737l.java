package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lٍِۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11737l implements InterfaceC14991l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC14991l f23514l;

    public AbstractC11737l(InterfaceC14991l interfaceC14991l) {
        this.f23514l = interfaceC14991l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f23514l.close();
    }

    @Override // defpackage.InterfaceC14991l
    public final C3446l isPro() {
        return this.f23514l.isPro();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f23514l + ')';
    }
}
