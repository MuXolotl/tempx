package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import androidx.car.app.hardware.common.CarResultStub;

/* JADX INFO: renamed from: lٗٚؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17221l implements InterfaceC11652l, InterfaceC1953l, InterfaceC11724l, InterfaceC7456l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f33428l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f33429l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f33430l;

    public /* synthetic */ C17221l(CarResultStub carResultStub, boolean z, C15858l c15858l) {
        this.f33429l = carResultStub;
        this.f33430l = z;
        this.f33428l = c15858l;
    }

    @Override // defpackage.InterfaceC11724l
    public void billing(InterfaceC4725l interfaceC4725l, int i) {
        interfaceC4725l.remoteconfig(((C13208l) this.f33429l).crashlytics, i, ((C13736l) this.f33428l).purchase(), this.f33430l);
    }

    @Override // defpackage.InterfaceC7456l
    /* JADX INFO: renamed from: default */
    public Object mo672default(C5807l c5807l) {
        AbstractC1186l abstractC1186lMo335l;
        C9716l c9716l = (C9716l) this.f33429l;
        C13572l c13572l = (C13572l) this.f33428l;
        AbstractServiceC3639l abstractServiceC3639l = c9716l.f19805l;
        if (!abstractServiceC3639l.admob(c13572l) || !c9716l.amazon(c13572l)) {
            String str = AbstractC15323l.yandex;
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC11965l.yandex(abstractServiceC3639l, true);
            } else {
                abstractServiceC3639l.stopForeground(true);
            }
            if (c9716l.f19813l != null) {
                c9716l.f19800l.cancel(1001);
                c9716l.f19806l++;
                c9716l.f19813l = null;
            }
            c5807l.loadAd(null);
            return "notificationRemoved";
        }
        int i = c9716l.f19806l + 1;
        c9716l.f19806l = i;
        C16811l c16811lLoadAd = c9716l.loadAd(c13572l);
        c16811lLoadAd.getClass();
        c16811lLoadAd.m4198l();
        InterfaceC11345l interfaceC11345l = c16811lLoadAd.f32834l;
        if (interfaceC11345l.mo319l()) {
            abstractC1186lMo335l = interfaceC11345l.mo335l();
        } else {
            C9258l c9258l = AbstractC1186l.f3181l;
            abstractC1186lMo335l = C13708l.f26763l;
        }
        AbstractC15323l.m3966final(new Handler(c13572l.yandex().mo2780l()), new RunnableC9600l(c9716l, c13572l, abstractC1186lMo335l, new C0743l(c9716l, i, c13572l), this.f33430l, c5807l));
        return "notificationUpdated";
    }

    @Override // defpackage.InterfaceC1953l
    public Object smaato(C3823l c3823l) {
        return (AbstractC12300l.subs() && ((Integer) c3823l.isPro()).intValue() == 402) ? C18595l.billing((Context) this.f33429l, (Intent) this.f33428l, this.f33430l).mopub(new ExecutorC11374l(2), new C8876l(19)) : c3823l;
    }

    @Override // defpackage.InterfaceC11652l
    public Object yandex() {
        return ((CarResultStub) this.f33429l).lambda$onCarHardwareResult$0(this.f33430l, (C15858l) this.f33428l);
    }

    public /* synthetic */ C17221l(Object obj, Object obj2, boolean z) {
        this.f33429l = obj;
        this.f33428l = obj2;
        this.f33430l = z;
    }
}
