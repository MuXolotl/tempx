package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* JADX INFO: renamed from: lٖٚۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16477l extends AbstractC6691l implements InterfaceC1840l, InterfaceC14029l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32207l = AtomicReferenceFieldUpdater.newUpdater(C16477l.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Object f32208l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final AbstractC0283l f32209l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AbstractC1872l f32210l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f32211l;

    public C16477l(AbstractC1872l abstractC1872l, AbstractC0283l abstractC0283l) {
        super(-1);
        this.f32210l = abstractC1872l;
        this.f32209l = abstractC0283l;
        this.f32211l = AbstractC9853l.yandex;
        this.f32208l = abstractC0283l.metrica().mo247l(0, AbstractC7999l.loadAd);
    }

    @Override // defpackage.InterfaceC1840l
    public final InterfaceC1840l admob() {
        return this.f32209l;
    }

    @Override // defpackage.AbstractC6691l
    public final Object isPro() {
        Object obj = this.f32211l;
        this.f32211l = AbstractC9853l.yandex;
        return obj;
    }

    @Override // defpackage.InterfaceC14029l
    public final InterfaceC12932l metrica() {
        return this.f32209l.metrica();
    }

    @Override // defpackage.InterfaceC14029l
    public final void subs(Object obj) {
        Throwable thYandex = C1171l.yandex(obj);
        Object c2175l = thYandex == null ? obj : new C2175l(thYandex, false);
        AbstractC0283l abstractC0283l = this.f32209l;
        InterfaceC12932l interfaceC12932lMetrica = abstractC0283l.metrica();
        AbstractC1872l abstractC1872l = this.f32210l;
        if (AbstractC9853l.crashlytics(abstractC1872l, interfaceC12932lMetrica)) {
            this.f32211l = c2175l;
            this.f14041l = 0;
            AbstractC9853l.loadAd(abstractC1872l, abstractC0283l.metrica(), this);
            return;
        }
        AbstractC14868l abstractC14868lYandex = AbstractC12706l.yandex();
        if (abstractC14868lYandex.f29099l >= 4294967296L) {
            this.f32211l = c2175l;
            this.f14041l = 0;
            abstractC14868lYandex.m3899l(this);
            return;
        }
        abstractC14868lYandex.m3898l(true);
        try {
            InterfaceC12932l interfaceC12932lMetrica2 = abstractC0283l.metrica();
            Object objLoadAd = AbstractC7999l.loadAd(interfaceC12932lMetrica2, this.f32208l);
            try {
                abstractC0283l.subs(obj);
                Unit unit = Unit.INSTANCE;
                AbstractC7999l.yandex(interfaceC12932lMetrica2, objLoadAd);
                while (abstractC14868lYandex.m3901l()) {
                }
            } catch (Throwable th) {
                AbstractC7999l.yandex(interfaceC12932lMetrica2, objLoadAd);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                mopub(th2);
            } finally {
                abstractC14868lYandex.m3900l(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f32210l + ", " + AbstractC17549l.mopub(this.f32209l) + ']';
    }

    @Override // defpackage.AbstractC6691l
    public final InterfaceC14029l amazon() {
        return this;
    }
}
