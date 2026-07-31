package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;

/* JADX INFO: renamed from: lؚؗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4971l extends AbstractC14971l implements InterfaceC13202l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public C0261l f10158l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C2403l f10159l;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public static final Object m1654l(C4971l c4971l, AbstractC0283l abstractC0283l) throws Throwable {
        C4354l c4354l;
        C0261l c0261l;
        if (abstractC0283l instanceof C4354l) {
            c4354l = (C4354l) abstractC0283l;
            int i = c4354l.f8886l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4354l.f8886l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4354l = new C4354l(c4971l, abstractC0283l);
            }
        } else {
            c4354l = new C4354l(c4971l, abstractC0283l);
        }
        Object obj = c4354l.f8887l;
        int i2 = c4354l.f8886l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (c4971l.f10158l == null) {
                C0261l c0261l2 = new C0261l();
                C2403l c2403l = c4971l.f10159l;
                c4354l.f8888l = c0261l2;
                c4354l.f8886l = 1;
                Object objYandex = c2403l.yandex(c0261l2, c4354l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
                c0261l = c0261l2;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c0261l = c4354l.f8888l;
        AbstractC2829l.crashlytics(obj);
        c4971l.f10158l = c0261l;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static final Object m1655l(C4971l c4971l, AbstractC0283l abstractC0283l) throws Throwable {
        C15032l c15032l;
        if (abstractC0283l instanceof C15032l) {
            c15032l = (C15032l) abstractC0283l;
            int i = c15032l.f29558l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15032l.f29558l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15032l = new C15032l(c4971l, abstractC0283l);
            }
        } else {
            c15032l = new C15032l(c4971l, abstractC0283l);
        }
        Object obj = c15032l.f29557l;
        int i2 = c15032l.f29558l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C0261l c0261l = c4971l.f10158l;
            if (c0261l != null) {
                C12134l c12134l = new C12134l(c0261l);
                C2403l c2403l = c4971l.f10159l;
                c15032l.f29558l = 1;
                Object objYandex = c2403l.yandex(c12134l, c15032l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(obj);
        c4971l.f10158l = null;
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC13202l
    public final void appmetrica(C9185l c9185l, EnumC9065l enumC9065l, long j) {
        if (enumC9065l == EnumC9065l.f18653l) {
            int i = c9185l.billing;
            int i2 = 0;
            InterfaceC14029l interfaceC14029l = null;
            if (i == 4) {
                AbstractC10999l.mopub(m3914l(), null, 0, new C16519l(this, interfaceC14029l, i2), 3);
            } else if (i == 5) {
                AbstractC10999l.mopub(m3914l(), null, 0, new C16519l(this, interfaceC14029l, 1), 3);
            }
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        m1656l();
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lٍؚۖ */
    public final void mo1495l() {
        mo1500throw();
    }

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public final void m1656l() {
        C0261l c0261l = this.f10158l;
        if (c0261l != null) {
            this.f10159l.loadAd(new C12134l(c0261l));
            this.f10158l = null;
        }
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: lْ٘ۚ */
    public final /* synthetic */ boolean mo1497l() {
        return false;
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: lٍٔ۠ */
    public final void mo1498l() {
        mo1500throw();
    }

    @Override // defpackage.InterfaceC13202l
    public final long tapsense() {
        return AbstractC10549l.yandex;
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: throw */
    public final void mo1500throw() {
        m1656l();
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: class */
    public final /* synthetic */ void mo1493class() {
    }
}
