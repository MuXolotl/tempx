package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: lؔۢؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2975l extends AbstractC1872l implements InterfaceC8680l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Handler f6459l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f6460l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f6461l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C2975l f6462l;

    public C2975l(Handler handler, String str, boolean z) {
        this.f6459l = handler;
        this.f6461l = str;
        this.f6460l = z;
        this.f6462l = z ? this : new C2975l(handler, str, true);
    }

    @Override // defpackage.InterfaceC8680l
    public final void billing(long j, C2397l c2397l) {
        RunnableC0336l runnableC0336l = new RunnableC0336l(c2397l, this, 24);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f6459l.postDelayed(runnableC0336l, j)) {
            c2397l.ad(new C3005l(this, runnableC0336l, 16));
        } else {
            m1273l(c2397l.f5166l, runnableC0336l);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2975l)) {
            return false;
        }
        C2975l c2975l = (C2975l) obj;
        return c2975l.f6459l == this.f6459l && c2975l.f6460l == this.f6460l;
    }

    public final int hashCode() {
        return (this.f6460l ? 1231 : 1237) ^ System.identityHashCode(this.f6459l);
    }

    /* JADX INFO: renamed from: lًٚٔ, reason: contains not printable characters */
    public final void m1273l(InterfaceC12932l interfaceC12932l, Runnable runnable) {
        AbstractC11174l.crashlytics(interfaceC12932l, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C16552l c16552l = AbstractC11463l.yandex;
        ExecutorC6708l.f14063l.vip(interfaceC12932l, runnable);
    }

    @Override // defpackage.AbstractC1872l
    /* JADX INFO: renamed from: throw */
    public final boolean mo1065throw(InterfaceC12932l interfaceC12932l) {
        return (this.f6460l && AbstractC8576l.yandex(Looper.myLooper(), this.f6459l.getLooper())) ? false : true;
    }

    @Override // defpackage.AbstractC1872l
    public final String toString() {
        C2975l c2975l;
        String str;
        C16552l c16552l = AbstractC11463l.yandex;
        C2975l c2975l2 = AbstractC17278l.yandex;
        if (this == c2975l2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c2975l = c2975l2.f6462l;
            } catch (UnsupportedOperationException unused) {
                c2975l = null;
            }
            str = this == c2975l ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f6461l;
        if (string == null) {
            string = this.f6459l.toString();
        }
        return this.f6460l ? AbstractC12900l.firebase(string, ".immediate") : string;
    }

    @Override // defpackage.AbstractC1872l
    public final void vip(InterfaceC12932l interfaceC12932l, Runnable runnable) {
        if (this.f6459l.post(runnable)) {
            return;
        }
        m1273l(interfaceC12932l, runnable);
    }

    @Override // defpackage.AbstractC1872l
    /* JADX INFO: renamed from: while */
    public final AbstractC1872l mo1066while(int i) {
        AbstractC7798l.loadAd(i);
        return this;
    }

    @Override // defpackage.InterfaceC8680l
    public final InterfaceC11791l yandex(long j, Runnable runnable, InterfaceC12932l interfaceC12932l) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f6459l.postDelayed(runnable, j)) {
            return new C15203l(this, runnable, 0);
        }
        m1273l(interfaceC12932l, runnable);
        return C2114l.f4745l;
    }

    public C2975l(Handler handler) {
        this(handler, null, false);
    }
}
