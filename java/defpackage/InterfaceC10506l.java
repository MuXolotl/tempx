package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: renamed from: lٌَۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC10506l extends Closeable, Flushable {
    /* JADX INFO: renamed from: break */
    void mo390break(C0869l c0869l, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    C3446l isPro();
}
