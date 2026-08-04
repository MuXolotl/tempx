package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: lٌؙؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6239l extends AbstractC5473l implements InterfaceC0798l, InterfaceC14926l, InterfaceC8977l, InterfaceC3187l, InterfaceC15239l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Handler f13177l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C13734l f13178l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final AbstractActivityC16046l f13179l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractActivityC16046l f13180l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final AbstractActivityC16046l f13181l;

    public C6239l(AbstractActivityC16046l abstractActivityC16046l) {
        this.f13180l = abstractActivityC16046l;
        Handler handler = new Handler();
        this.f13179l = abstractActivityC16046l;
        this.f13181l = abstractActivityC16046l;
        this.f13177l = handler;
        this.f13178l = new C13734l();
    }

    @Override // defpackage.AbstractC5473l
    public final View admob(int i) {
        return this.f13180l.findViewById(i);
    }

    @Override // defpackage.InterfaceC8977l
    public final C16166l amazon() {
        return this.f13180l.f28690l;
    }

    @Override // defpackage.InterfaceC0798l
    public final C15018l firebase() {
        return this.f13180l.firebase();
    }

    @Override // defpackage.InterfaceC3177l
    public final AbstractC6475l loadAd() {
        return this.f13180l.f31439l;
    }

    @Override // defpackage.InterfaceC3187l
    public final C18396l metrica() {
        return (C18396l) this.f13180l.f28688l.f26580l;
    }

    @Override // defpackage.AbstractC5473l
    public final boolean subs() {
        Window window = this.f13180l.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.InterfaceC14926l
    public final C16390l yandex() {
        return this.f13180l.yandex();
    }

    @Override // defpackage.InterfaceC15239l
    public final void crashlytics() {
    }
}
