package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘٙۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5776l implements InterfaceC2538l, InterfaceC7448l, InterfaceC13553l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f12175l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C8030l f12176l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C9405l f12177l;

    public C5776l(C9405l c9405l, C8030l c8030l) {
        this.f12177l = c9405l;
        this.f12176l = c8030l;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: case */
    public final long mo866case(float f) {
        return this.f12177l.mo866case(f);
    }

    @Override // defpackage.InterfaceC7448l
    /* JADX INFO: renamed from: const */
    public final InterfaceC17792l mo1114const(int i, int i2, Map map, Function1 function1, Function1 function2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            AbstractC0081l.crashlytics("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C8538l(i, i2, map, function1, (C10889l) function2, this, 0);
    }

    @Override // defpackage.InterfaceC13553l
    public final /* synthetic */ long crashlytics(InterfaceC18212l interfaceC18212l, InterfaceC18212l interfaceC18212l2) {
        return AbstractC1757l.subs(this, interfaceC18212l, interfaceC18212l2);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: final */
    public final float mo867final(float f) {
        return f / this.f12177l.loadAd();
    }

    @Override // defpackage.InterfaceC12822l
    public final EnumC9931l getLayoutDirection() {
        return this.f12177l.f35281l.f7691l;
    }

    @Override // defpackage.InterfaceC12822l
    /* JADX INFO: renamed from: import */
    public final boolean mo992import() {
        return false;
    }

    @Override // defpackage.InterfaceC13490l
    public final float inmobi(long j) {
        return AbstractC2812l.amazon(j, this.f12177l);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: instanceof */
    public final float mo868instanceof(float f) {
        return this.f12177l.loadAd() * f;
    }

    @Override // defpackage.InterfaceC7448l
    public final InterfaceC17792l isVip(int i, int i2, Map map, Function1 function1) {
        return this.f12177l.mo1114const(i, i2, map, null, function1);
    }

    @Override // defpackage.InterfaceC13490l
    public final long license(long j) {
        return AbstractC9361l.loadAd(j, this.f12177l);
    }

    @Override // defpackage.InterfaceC13490l
    public final float loadAd() {
        return this.f12177l.loadAd();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final long mo869l(long j) {
        return AbstractC9361l.amazon(j, this.f12177l);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final int mo870l(float f) {
        return AbstractC9361l.yandex(this.f12177l, f);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final float mo871l(long j) {
        return AbstractC9361l.crashlytics(j, this.f12177l);
    }

    @Override // defpackage.InterfaceC7448l
    /* JADX INFO: renamed from: private */
    public final InterfaceC17792l mo1115private(int i, int i2, C3006l c3006l, C3956l c3956l, Map map, C16441l c16441l) {
        return this.f12177l.mo1115private(i, i2, c3006l, c3956l, map, c16441l);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: static */
    public final float mo872static(int i) {
        return this.f12177l.mo872static(i);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: super */
    public final float mo873super() {
        return this.f12177l.mo873super();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: transient */
    public final int mo874transient(long j) {
        return this.f12177l.mo874transient(j);
    }

    @Override // defpackage.InterfaceC13553l
    public final InterfaceC18212l yandex(InterfaceC18212l interfaceC18212l) {
        C9083l c9083l;
        if (interfaceC18212l instanceof C9083l) {
            return interfaceC18212l;
        }
        if (interfaceC18212l instanceof AbstractC18026l) {
            AbstractC1668l abstractC1668lMo2645l = ((AbstractC18026l) interfaceC18212l).mo2645l();
            return (abstractC1668lMo2645l == null || (c9083l = abstractC1668lMo2645l.f4022l) == null) ? interfaceC18212l : c9083l;
        }
        AbstractC0081l.loadAd("Unsupported LayoutCoordinates");
        C17132l.firebase();
        return null;
    }
}
