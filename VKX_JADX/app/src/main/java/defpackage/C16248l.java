package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚٖٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16248l implements InterfaceC13854l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C2552l f31796l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C2397l f31797l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C8241l f31798l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC2262l f31799l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f31800l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f31801l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public long f31802l;

    public C16248l(C3399l c3399l) {
        C8241l c8241l = new C8241l(28);
        this.f31799l = c3399l;
        this.f31798l = c8241l;
        this.f31796l = new C2552l(new C7730l(13, this));
        this.f31801l = new Object();
        this.f31800l = 5;
    }

    public static final void yandex(C16248l c16248l, long j) {
        ((C11644l) c16248l.f31796l.f5556l).m3163l(new C4199l(j, 3));
        synchronized (c16248l.f31801l) {
            c16248l.f31802l = j;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC5763l
    public final InterfaceC15446l getKey() {
        return C11140l.f22361l;
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: import */
    public final InterfaceC12932l mo244import(InterfaceC15446l interfaceC15446l) {
        return AbstractC2044l.mopub(this, interfaceC15446l);
    }

    public final void loadAd() {
        synchronized (this.f31801l) {
            C2397l c2397l = this.f31797l;
            if (c2397l != null) {
                c2397l.yandex(null);
            }
        }
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final InterfaceC5763l mo245l(InterfaceC15446l interfaceC15446l) {
        return AbstractC2044l.crashlytics(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final InterfaceC12932l mo246l(InterfaceC12932l interfaceC12932l) {
        return AbstractC10586l.billing(this, interfaceC12932l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚْٟ */
    public final Object mo247l(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.InterfaceC13854l
    /* JADX INFO: renamed from: super */
    public final Object mo1226super(Function1 function1, InterfaceC14029l interfaceC14029l) {
        return this.f31796l.mo1226super(function1, interfaceC14029l);
    }
}
