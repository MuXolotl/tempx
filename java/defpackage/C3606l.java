package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؕۙۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3606l implements InterfaceC15847l, InterfaceC7448l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9117l f7537l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C2121l f7538l;

    public C3606l(C9117l c9117l) {
        this.f7537l = c9117l;
        this.f7538l = c9117l.f18729l;
    }

    @Override // defpackage.InterfaceC15847l
    public final List ads(Object obj, Function2 function2) {
        C9117l c9117l = this.f7537l;
        C3654l c3654l = c9117l.f18732l;
        C13660l c13660l = c9117l.f18728l;
        C3654l c3654l2 = (C3654l) c13660l.mopub(obj);
        if (c3654l2 != null && ((C17893l) ((C4588l) c3654l.startapp()).f9321l).smaato(c3654l2) < c9117l.f18736l) {
            return c3654l2.vip();
        }
        C13660l c13660l2 = c9117l.f18737l;
        C13660l c13660l3 = c9117l.f18733l;
        C17893l c17893l = c9117l.f18726l;
        if (c17893l.f34846l < c9117l.f18735l) {
            AbstractC0081l.yandex("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        C3654l c3654l3 = (C3654l) c13660l.mopub(obj);
        int i = c17893l.f34846l;
        int i2 = c9117l.f18735l;
        if (i == i2) {
            c17893l.crashlytics(obj);
        } else {
            Object[] objArr = c17893l.f34848l;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        c9117l.f18735l++;
        boolean zLoadAd = c13660l3.loadAd(obj);
        if (zLoadAd || c3654l3 != null) {
            if (!zLoadAd && c3654l3 != null) {
                c9117l.firebase(((C17893l) ((C4588l) c3654l.startapp()).f9321l).smaato(c3654l3), ((C17893l) ((C4588l) c3654l.startapp()).f9321l).f34846l);
                c9117l.f18734l++;
                c13660l.smaato(obj);
                c13660l3.vip(obj, c3654l3);
                c13660l2.vip(obj, c9117l.billing(obj));
                if (c3654l.m1386native()) {
                    c9117l.admob();
                }
            }
            C3654l c3654l4 = (C3654l) c13660l3.mopub(obj);
            C14346l c14346l = c3654l4 != null ? (C14346l) c9117l.f18739l.mopub(c3654l4) : null;
            if (c14346l != null && c14346l.amazon) {
                c9117l.vip(c3654l4, obj, false, function2);
            }
            if ((c14346l != null ? c14346l.billing : null) != null) {
                c9117l.amazon(c14346l, true);
            }
        } else {
            c9117l.smaato(obj, function2, false);
            c13660l2.vip(obj, c9117l.billing(obj));
        }
        C3654l c3654l5 = (C3654l) c13660l3.mopub(obj);
        if (c3654l5 == null) {
            return C2580l.f5619l;
        }
        List listM3902goto = c3654l5.f7667l.startapp.m3902goto();
        C4588l c4588l = (C4588l) listM3902goto;
        int i3 = ((C17893l) c4588l.f9321l).f34846l;
        for (int i4 = 0; i4 < i3; i4++) {
            ((C14903l) c4588l.get(i4)).f29342l.loadAd = true;
        }
        return listM3902goto;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: case */
    public final long mo866case(float f) {
        return this.f7538l.mo866case(f);
    }

    @Override // defpackage.InterfaceC7448l
    /* JADX INFO: renamed from: const */
    public final InterfaceC17792l mo1114const(int i, int i2, Map map, Function1 function1, Function1 function2) {
        return this.f7538l.mo1114const(i, i2, map, function1, function2);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: final */
    public final float mo867final(float f) {
        return f / this.f7538l.loadAd();
    }

    @Override // defpackage.InterfaceC12822l
    public final EnumC9931l getLayoutDirection() {
        return this.f7538l.f4761l;
    }

    @Override // defpackage.InterfaceC12822l
    /* JADX INFO: renamed from: import */
    public final boolean mo992import() {
        return this.f7538l.mo992import();
    }

    @Override // defpackage.InterfaceC13490l
    public final float inmobi(long j) {
        C2121l c2121l = this.f7538l;
        c2121l.getClass();
        return AbstractC2812l.amazon(j, c2121l);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: instanceof */
    public final float mo868instanceof(float f) {
        return this.f7538l.loadAd() * f;
    }

    @Override // defpackage.InterfaceC7448l
    public final InterfaceC17792l isVip(int i, int i2, Map map, Function1 function1) {
        return this.f7538l.mo1114const(i, i2, map, null, function1);
    }

    @Override // defpackage.InterfaceC13490l
    public final long license(long j) {
        C2121l c2121l = this.f7538l;
        c2121l.getClass();
        return AbstractC9361l.loadAd(j, c2121l);
    }

    @Override // defpackage.InterfaceC13490l
    public final float loadAd() {
        return this.f7538l.f4760l;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final long mo869l(long j) {
        C2121l c2121l = this.f7538l;
        c2121l.getClass();
        return AbstractC9361l.amazon(j, c2121l);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final int mo870l(float f) {
        C2121l c2121l = this.f7538l;
        c2121l.getClass();
        return AbstractC9361l.yandex(c2121l, f);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final float mo871l(long j) {
        C2121l c2121l = this.f7538l;
        c2121l.getClass();
        return AbstractC9361l.crashlytics(j, c2121l);
    }

    @Override // defpackage.InterfaceC7448l
    /* JADX INFO: renamed from: private */
    public final InterfaceC17792l mo1115private(int i, int i2, C3006l c3006l, C3956l c3956l, Map map, C16441l c16441l) {
        C2121l c2121l = this.f7538l;
        c2121l.getClass();
        return AbstractC15560l.loadAd(i, i2, c3956l, c3006l, c16441l, c2121l, map);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: static */
    public final float mo872static(int i) {
        return this.f7538l.mo872static(i);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: super */
    public final float mo873super() {
        return this.f7538l.f4759l;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: transient */
    public final int mo874transient(long j) {
        return this.f7538l.mo874transient(j);
    }
}
