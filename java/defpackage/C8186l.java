package defpackage;

import android.os.Process;

/* JADX INFO: renamed from: lًٟۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8186l extends Thread {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f17082l;

    public C8186l(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f17082l = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f17082l);
        super.run();
    }
}
