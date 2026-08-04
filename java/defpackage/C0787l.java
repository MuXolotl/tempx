package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lٟؒؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0787l extends AbstractC2338l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C3600l f2373l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f2374l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final /* synthetic */ C15053l f2375l;

    public C0787l(C3600l c3600l) {
        super(true, false);
        this.f2374l = AbstractC11990l.loadAd();
        this.f2375l = new C15053l(5);
        this.f2373l = c3600l;
    }

    public static void pro(C11533l c11533l, C3600l c3600l) {
        c11533l.f23188l.setText("[" + c3600l.yandex + '/' + c3600l.loadAd + "] " + c3600l.crashlytics);
    }

    @Override // defpackage.AbstractC2338l
    public final View firebase(ViewGroup viewGroup) throws IllegalAccessException, InvocationTargetException {
        Activity activity = this.f5081l;
        C18595l c18595l = (C18595l) this.f2375l.f29576l;
        Object objInvoke = ((Method) c18595l.f36316l).invoke(null, LayoutInflater.from(activity), viewGroup, Boolean.FALSE);
        if (objInvoke == null) {
            C6541l.subs("null cannot be cast to non-null type ua.itaysonlab.vkx.databinding.V7CacheMigratorProgressBinding");
            return null;
        }
        C11533l c11533l = (C11533l) objInvoke;
        c18595l.f36317l = c11533l;
        return c11533l.f23189l;
    }

    @Override // defpackage.AbstractC2338l
    public final void isPro() {
        super.isPro();
        C5060l c5060l = new C5060l(this, null, 0);
        C8490l c8490l = AbstractC6025l.yandex;
        C8084l c8084l = AbstractC6025l.loadAd;
        C2347l c2347l = new C2347l(new C13900l(c8084l, 11), new C5163l(c5060l, null, 19), 2);
        C5268l c5268l = this.f5077l;
        EnumC8981l enumC8981l = EnumC8981l.f18524l;
        AbstractC0622l.startapp(AbstractC14024l.startapp(c2347l, c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
        AbstractC0622l.startapp(AbstractC14024l.startapp(new C2347l(new C13900l(c8084l, 12), new C5163l(new C5060l(this, null, 1), null, 21), 2), c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
    }

    public final C18595l license() {
        return (C18595l) this.f2375l.f29576l;
    }

    @Override // defpackage.AbstractC2338l
    public final int mopub() {
        return -1;
    }

    @Override // defpackage.AbstractC2338l
    public final void smaato() {
        super.smaato();
        ((C18595l) this.f2375l.f29576l).f36317l = null;
    }

    @Override // defpackage.AbstractC2338l
    public final void subscription(View view) {
        C11533l c11533l = (C11533l) license().f36317l;
        C3600l c3600l = this.f2373l;
        if (c3600l == null) {
            return;
        }
        pro(c11533l, c3600l);
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f2374l.f36440l;
    }
}
