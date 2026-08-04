package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍٝٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9709l implements InterfaceC7448l, InterfaceC12822l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final EnumC9931l f19791l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12822l f19792l;

    public C9709l(InterfaceC12822l interfaceC12822l, EnumC9931l enumC9931l) {
        this.f19792l = interfaceC12822l;
        this.f19791l = enumC9931l;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: case */
    public final long mo866case(float f) {
        return this.f19792l.mo866case(f);
    }

    @Override // defpackage.InterfaceC7448l
    /* JADX INFO: renamed from: const */
    public final InterfaceC17792l mo1114const(int i, int i2, Map map, Function1 function1, Function1 function2) {
        int i3 = i < 0 ? 0 : i;
        int i4 = i2 < 0 ? 0 : i2;
        if ((i3 & (-16777216)) != 0 || ((-16777216) & i4) != 0) {
            AbstractC0081l.crashlytics("Size(" + i3 + " x " + i4 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C11418l(i3, i4, map, function1, 1);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: final */
    public final float mo867final(float f) {
        return this.f19792l.mo867final(f);
    }

    @Override // defpackage.InterfaceC12822l
    public final EnumC9931l getLayoutDirection() {
        return this.f19791l;
    }

    @Override // defpackage.InterfaceC12822l
    /* JADX INFO: renamed from: import */
    public final boolean mo992import() {
        return this.f19792l.mo992import();
    }

    @Override // defpackage.InterfaceC13490l
    public final float inmobi(long j) {
        return this.f19792l.inmobi(j);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: instanceof */
    public final float mo868instanceof(float f) {
        return this.f19792l.mo868instanceof(f);
    }

    @Override // defpackage.InterfaceC7448l
    public final InterfaceC17792l isVip(int i, int i2, Map map, Function1 function1) {
        return mo1114const(i, i2, map, null, function1);
    }

    @Override // defpackage.InterfaceC13490l
    public final long license(long j) {
        return this.f19792l.license(j);
    }

    @Override // defpackage.InterfaceC13490l
    public final float loadAd() {
        return this.f19792l.loadAd();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final long mo869l(long j) {
        return this.f19792l.mo869l(j);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final int mo870l(float f) {
        return this.f19792l.mo870l(f);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final float mo871l(long j) {
        return this.f19792l.mo871l(j);
    }

    @Override // defpackage.InterfaceC7448l
    /* JADX INFO: renamed from: private */
    public final /* synthetic */ InterfaceC17792l mo1115private(int i, int i2, C3006l c3006l, C3956l c3956l, Map map, C16441l c16441l) {
        return AbstractC15560l.loadAd(i, i2, c3956l, c3006l, c16441l, this, map);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: static */
    public final float mo872static(int i) {
        return this.f19792l.mo872static(i);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: super */
    public final float mo873super() {
        return this.f19792l.mo873super();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: transient */
    public final int mo874transient(long j) {
        return this.f19792l.mo874transient(j);
    }
}
