package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: lؚؒۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0903l implements InterfaceC6272l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Boolean f2554l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f2555l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public volatile InterfaceC6272l f2556l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f2557l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C1974l f2558l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Method f2559l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Queue f2560l;

    public C0903l(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.f2557l = str;
        this.f2560l = linkedBlockingQueue;
        this.f2555l = z;
    }

    public final boolean adcel() {
        Boolean bool = this.f2554l;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f2559l = this.f2556l.getClass().getMethod("log", C8260l.class);
            this.f2554l = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f2554l = Boolean.FALSE;
        }
        return this.f2554l.booleanValue();
    }

    @Override // defpackage.InterfaceC6272l
    public final boolean admob() {
        return startapp().admob();
    }

    @Override // defpackage.InterfaceC6272l
    public final void amazon(String str, Throwable th) {
        startapp().amazon(str, th);
    }

    @Override // defpackage.InterfaceC6272l
    public final boolean billing() {
        return startapp().billing();
    }

    @Override // defpackage.InterfaceC6272l
    public final boolean crashlytics() {
        return startapp().crashlytics();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0903l.class == obj.getClass() && this.f2557l.equals(((C0903l) obj).f2557l);
    }

    @Override // defpackage.InterfaceC6272l
    public final void firebase(String str) {
        startapp().firebase(str);
    }

    public final int hashCode() {
        return this.f2557l.hashCode();
    }

    @Override // defpackage.InterfaceC6272l
    public final void isPro(String str, Throwable th) {
        startapp().isPro(str, th);
    }

    @Override // defpackage.InterfaceC6272l
    public final boolean loadAd() {
        return startapp().loadAd();
    }

    @Override // defpackage.InterfaceC6272l
    public final boolean metrica(int i) {
        return startapp().metrica(i);
    }

    @Override // defpackage.InterfaceC6272l
    public final void mopub(String str) {
        startapp().mopub(str);
    }

    @Override // defpackage.InterfaceC6272l
    public final boolean purchase() {
        return startapp().purchase();
    }

    @Override // defpackage.InterfaceC6272l
    public final void remoteconfig(String str) {
        startapp().remoteconfig(str);
    }

    @Override // defpackage.InterfaceC6272l
    public final void smaato(Exception exc) {
        startapp().smaato(exc);
    }

    public final InterfaceC6272l startapp() {
        if (this.f2556l != null) {
            return this.f2556l;
        }
        if (this.f2555l) {
            return C2929l.f6382l;
        }
        if (this.f2558l == null) {
            Queue queue = this.f2560l;
            C1974l c1974l = new C1974l();
            c1974l.f4489l = this;
            c1974l.f4488l = queue;
            this.f2558l = c1974l;
        }
        return this.f2558l;
    }

    @Override // defpackage.InterfaceC6272l
    public final void subs(String str, IOException iOException) {
        startapp().subs(str, iOException);
    }

    @Override // defpackage.InterfaceC6272l
    public final void vip(String str) {
        startapp().vip(str);
    }

    @Override // defpackage.InterfaceC6272l
    public final void yandex(Object obj) {
        startapp().yandex(obj);
    }
}
