package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؓۛۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2121l implements InterfaceC15847l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public float f4759l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public float f4760l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public EnumC9931l f4761l = EnumC9931l.f20222l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C9117l f4762l;

    public C2121l(C9117l c9117l) {
        this.f4762l = c9117l;
    }

    @Override // defpackage.InterfaceC15847l
    public final List ads(Object obj, Function2 function2) {
        C9117l c9117l = this.f4762l;
        c9117l.admob();
        C3654l c3654l = c9117l.f18732l;
        int i = c3654l.f7667l.amazon;
        if (i != 1 && i != 3 && i != 2 && i != 4) {
            AbstractC0081l.crashlytics("subcompose can only be used inside the measure or layout blocks");
        }
        C13660l c13660l = c9117l.f18728l;
        Object objMopub = c13660l.mopub(obj);
        if (objMopub == null) {
            objMopub = (C3654l) c9117l.f18733l.smaato(obj);
            if (objMopub != null) {
                if (c9117l.f18734l <= 0) {
                    AbstractC0081l.crashlytics("Check failed.");
                }
                c9117l.f18734l--;
            } else {
                objMopub = c9117l.metrica(obj);
                if (objMopub == null) {
                    int i2 = c9117l.f18736l;
                    C3654l c3654l2 = new C3654l(2);
                    c3654l.f7687l = true;
                    c3654l.applovin(i2, c3654l2);
                    Unit unit = Unit.INSTANCE;
                    c3654l.f7687l = false;
                    objMopub = c3654l2;
                }
            }
            c13660l.vip(obj, objMopub);
        }
        C3654l c3654l3 = (C3654l) objMopub;
        if (AbstractC16901l.m4220for(c9117l.f18736l, c3654l.startapp()) != c3654l3) {
            int iSmaato = ((C17893l) ((C4588l) c3654l.startapp()).f9321l).smaato(c3654l3);
            if (iSmaato < c9117l.f18736l) {
                AbstractC0081l.yandex("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i3 = c9117l.f18736l;
            if (i3 != iSmaato) {
                c9117l.firebase(iSmaato, i3);
            }
        }
        c9117l.f18736l++;
        c9117l.vip(c3654l3, obj, false, function2);
        return (i == 1 || i == 3) ? c3654l3.vip() : c3654l3.remoteconfig();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: case */
    public final long mo866case(float f) {
        return AbstractC2812l.purchase(this, mo867final(f));
    }

    @Override // defpackage.InterfaceC7448l
    /* JADX INFO: renamed from: const, reason: not valid java name */
    public final InterfaceC17792l mo1114const(int i, int i2, Map map, Function1 function1, Function1 function2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            AbstractC0081l.crashlytics("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C10597l(i, i2, map, function1, this, this.f4762l, function2);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: final */
    public final float mo867final(float f) {
        return f / loadAd();
    }

    @Override // defpackage.InterfaceC12822l
    public final EnumC9931l getLayoutDirection() {
        return this.f4761l;
    }

    @Override // defpackage.InterfaceC12822l
    /* JADX INFO: renamed from: import */
    public final boolean mo992import() {
        int i = this.f4762l.f18732l.f7667l.amazon;
        return i == 4 || i == 2;
    }

    @Override // defpackage.InterfaceC13490l
    public final /* synthetic */ float inmobi(long j) {
        return AbstractC2812l.amazon(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: instanceof */
    public final float mo868instanceof(float f) {
        return loadAd() * f;
    }

    @Override // defpackage.InterfaceC7448l
    public final InterfaceC17792l isVip(int i, int i2, Map map, Function1 function1) {
        return mo1114const(i, i2, map, null, function1);
    }

    @Override // defpackage.InterfaceC13490l
    public final /* synthetic */ long license(long j) {
        return AbstractC9361l.loadAd(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    public final float loadAd() {
        return this.f4760l;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final /* synthetic */ long mo869l(long j) {
        return AbstractC9361l.amazon(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final /* synthetic */ int mo870l(float f) {
        return AbstractC9361l.yandex(this, f);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final /* synthetic */ float mo871l(long j) {
        return AbstractC9361l.crashlytics(j, this);
    }

    @Override // defpackage.InterfaceC7448l
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final /* synthetic */ InterfaceC17792l mo1115private(int i, int i2, C3006l c3006l, C3956l c3956l, Map map, C16441l c16441l) {
        return AbstractC15560l.loadAd(i, i2, c3956l, c3006l, c16441l, this, map);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: static */
    public final float mo872static(int i) {
        return i / loadAd();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: super */
    public final float mo873super() {
        return this.f4759l;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: transient */
    public final int mo874transient(long j) {
        return Math.round(mo871l(j));
    }
}
