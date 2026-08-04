package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍٖۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16604l extends AbstractC14971l implements InterfaceC16031l, InterfaceC3506l, InterfaceC15641l, InterfaceC16388l, InterfaceC11189l, InterfaceC1905l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public C18113l f32581l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C7504l f32582l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C1625l f32583l;

    public C16604l(C18113l c18113l) {
        C1625l c1625l = new C1625l();
        this.f32583l = c1625l;
        c1625l.crashlytics.subs(0.0f);
        this.f32581l = c18113l;
    }

    @Override // defpackage.InterfaceC11189l
    public final Object adcel() {
        return EnumC18100l.f35395l;
    }

    @Override // defpackage.InterfaceC3506l
    /* JADX INFO: renamed from: for */
    public final void mo1346for(InterfaceC18212l interfaceC18212l) {
        m4188l(interfaceC18212l);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        C1625l c1625l = this.f32583l;
        c1625l.yandex.setValue(new C1187l(9205357640488583168L));
        c1625l.loadAd.setValue(new C14174l(9205357640488583168L));
        c1625l.mopub = false;
        C11925l c11925lYandex = c1625l.yandex();
        if (c11925lYandex != null) {
            ((InterfaceC3685l) AbstractC13402l.loadAd(this, AbstractC4751l.mopub)).yandex(c11925lYandex);
        }
        c1625l.billing.setValue(null);
        this.f32581l.yandex.remove(c1625l);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        InterfaceC14029l interfaceC14029l;
        AbstractActivityC14666l abstractActivityC14666l;
        this.f32581l.yandex.add(this.f32583l);
        Context baseContext = (Context) AbstractC13402l.loadAd(this, AbstractC1242l.loadAd);
        while (true) {
            interfaceC14029l = null;
            if (!(baseContext instanceof AbstractActivityC14666l)) {
                if (!(baseContext instanceof ContextWrapper)) {
                    abstractActivityC14666l = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            } else {
                abstractActivityC14666l = (AbstractActivityC14666l) baseContext;
                break;
            }
        }
        if (abstractActivityC14666l != null) {
            AbstractC10999l.mopub(m3914l(), null, 0, new C15559l(abstractActivityC14666l, this, interfaceC14029l, 1), 3);
        }
        mo540while();
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final C7504l m4187l() {
        return AbstractC10999l.mopub(m3914l(), null, 0, new C8912l(this, null, 6), 3);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:3:0x0004, B:7:0x0010, B:9:0x0022, B:11:0x0030, B:20:0x0044, B:19:0x003b, B:21:0x0050), top: B:25:0x0004 }] */
    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo536l(C6742l c6742l) {
        C1625l c1625l = this.f32583l;
        try {
            c1625l.mopub = true;
            if (this.f29462l) {
                if (AbstractC5573l.ads(C14174l.purchase(c6742l.f14144l.f26629l.m4551private())) >= 1) {
                    InterfaceC3685l interfaceC3685l = (InterfaceC3685l) AbstractC13402l.loadAd(this, AbstractC4751l.mopub);
                    C11925l c11925lYandex = c1625l.yandex();
                    if (c11925lYandex == null) {
                        c11925lYandex = interfaceC3685l.crashlytics();
                        c1625l.billing.setValue(c11925lYandex);
                    } else {
                        if (c11925lYandex.subscription) {
                            c11925lYandex = null;
                        }
                        if (c11925lYandex == null) {
                            c11925lYandex = interfaceC3685l.crashlytics();
                            c1625l.billing.setValue(c11925lYandex);
                        }
                    }
                    c6742l.subscription(AbstractC14707l.billing(c6742l.admob()), c11925lYandex, new C15941l(c6742l, c11925lYandex));
                    AbstractC2576l.loadAd(c6742l, c11925lYandex);
                } else {
                    AbstractC3586l.crashlytics(c6742l);
                }
            }
        } finally {
            c1625l.mopub = false;
            m4187l();
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lًٚٔ */
    public final void mo513l() {
        C1625l c1625l = this.f32583l;
        c1625l.yandex.setValue(new C1187l(9205357640488583168L));
        c1625l.loadAd.setValue(new C14174l(9205357640488583168L));
        c1625l.mopub = false;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public final void m4188l(InterfaceC18212l interfaceC18212l) {
        if (this.f29462l) {
            long jStartapp = interfaceC18212l.startapp(0L);
            C1625l c1625l = this.f32583l;
            c1625l.yandex.setValue(new C1187l(jStartapp));
            c1625l.loadAd.setValue(new C14174l(AbstractC14707l.mopub(interfaceC18212l.smaato())));
            c1625l.amazon = ((View) AbstractC13402l.loadAd(this, AbstractC1242l.billing)).getWindowId();
        }
    }

    @Override // defpackage.InterfaceC15641l
    public final void startapp(InterfaceC18212l interfaceC18212l) {
        AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
        Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
        AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
        try {
            if ((this.f32583l.loadAd() & 9223372034707292159L) == 9205357640488583168L) {
                m4188l(interfaceC18212l);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
        }
    }

    @Override // defpackage.InterfaceC1905l
    /* JADX INFO: renamed from: while */
    public final void mo540while() {
        AbstractC3700l.admob(this, new C7730l(7, this));
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: continue */
    public final /* bridge */ void mo533continue() {
    }

    @Override // defpackage.InterfaceC4325l
    public final /* bridge */ void Signature(long j) {
    }
}
