package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.Queue;

/* JADX INFO: renamed from: lٜۣؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1974l implements InterfaceC6272l, Serializable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Queue f4488l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C0903l f4489l;

    @Override // defpackage.InterfaceC6272l
    public final boolean admob() {
        return true;
    }

    @Override // defpackage.InterfaceC6272l
    public final void amazon(String str, Throwable th) {
        startapp(1, null);
    }

    @Override // defpackage.InterfaceC6272l
    public final boolean billing() {
        return true;
    }

    @Override // defpackage.InterfaceC6272l
    public final boolean crashlytics() {
        return true;
    }

    @Override // defpackage.InterfaceC6272l
    public final void firebase(String str) {
        startapp(3, null);
    }

    @Override // defpackage.InterfaceC6272l
    public final void isPro(String str, Throwable th) {
        startapp(4, null);
    }

    @Override // defpackage.InterfaceC6272l
    public final boolean loadAd() {
        return true;
    }

    @Override // defpackage.InterfaceC6272l
    public final /* synthetic */ boolean metrica(int i) {
        return AbstractC1757l.admob(this, i);
    }

    @Override // defpackage.InterfaceC6272l
    public final void mopub(String str) {
        startapp(4, null);
    }

    @Override // defpackage.InterfaceC6272l
    public final boolean purchase() {
        return true;
    }

    @Override // defpackage.InterfaceC6272l
    public final void remoteconfig(String str) {
        startapp(2, null);
    }

    @Override // defpackage.InterfaceC6272l
    public final void smaato(Exception exc) {
        startapp(2, null);
    }

    public final void startapp(int i, Object[] objArr) {
        C8260l c8260l = new C8260l();
        System.currentTimeMillis();
        c8260l.yandex = i;
        c8260l.loadAd = this.f4489l;
        Thread.currentThread().getName();
        c8260l.crashlytics = objArr;
        this.f4488l.add(c8260l);
    }

    @Override // defpackage.InterfaceC6272l
    public final void subs(String str, IOException iOException) {
        startapp(5, null);
    }

    @Override // defpackage.InterfaceC6272l
    public final void vip(String str) {
        startapp(5, null);
    }

    @Override // defpackage.InterfaceC6272l
    public final void yandex(Object obj) {
        startapp(4, new Object[]{obj});
    }
}
