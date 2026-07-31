package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚؗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4566l extends AbstractC14971l implements InterfaceC6843l, InterfaceC13490l, InterfaceC13202l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C17893l f9253l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C17893l f9254l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C9185l f9255l = AbstractC1782l.yandex;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public Object f9256l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public C9185l f9257l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C7504l f9258l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public Object[] f9259l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public long f9260l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public Object f9261l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public PointerInputEventHandler f9262l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C17893l f9263l;

    public C4566l(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.f9261l = obj;
        this.f9256l = obj2;
        this.f9259l = objArr;
        this.f9262l = pointerInputEventHandler;
        C17893l c17893l = new C17893l(0, new C17249l[16]);
        this.f9254l = c17893l;
        this.f9253l = c17893l;
        this.f9263l = new C17893l(0, new C17249l[16]);
        this.f9260l = 0L;
    }

    @Override // defpackage.InterfaceC13202l
    public final void appmetrica(C9185l c9185l, EnumC9065l enumC9065l, long j) {
        this.f9260l = j;
        if (enumC9065l == EnumC9065l.f18654l) {
            this.f9255l = c9185l;
        }
        InterfaceC14029l interfaceC14029l = null;
        if (this.f9258l == null) {
            this.f9258l = AbstractC10999l.mopub(m3914l(), null, 4, new C17972l(this, interfaceC14029l, 23), 1);
        }
        m1558l(c9185l, enumC9065l);
        List list = c9185l.yandex;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!AbstractC3474l.billing((C15730l) list.get(i))) {
                this.f9257l = c9185l;
            }
        }
        c9185l = null;
        this.f9257l = c9185l;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: case */
    public final long mo866case(float f) {
        return AbstractC2812l.purchase(this, mo867final(f));
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: final */
    public final float mo867final(float f) {
        return f / loadAd();
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

    @Override // defpackage.InterfaceC13490l
    public final /* synthetic */ long license(long j) {
        return AbstractC9361l.loadAd(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    public final float loadAd() {
        return AbstractC5573l.metrica(this).f7668l.loadAd();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final /* synthetic */ long mo869l(long j) {
        return AbstractC9361l.amazon(j, this);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        m1557l();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final /* synthetic */ int mo870l(float f) {
        return AbstractC9361l.yandex(this, f);
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final Object m1556l(Function2 function2, InterfaceC14029l interfaceC14029l) {
        C2397l c2397l = new C2397l(1, AbstractC17082l.billing(interfaceC14029l));
        c2397l.license();
        C17249l c17249l = new C17249l(this, c2397l);
        synchronized (this.f9253l) {
            this.f9254l.crashlytics(c17249l);
            new C16463l(AbstractC17082l.billing(AbstractC17082l.yandex(c17249l, c17249l, function2)), EnumC9342l.f19165l).subs(Unit.INSTANCE);
        }
        c2397l.ad(new C10065l(4, c17249l));
        return c2397l.Signature();
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lٍؚۖ */
    public final void mo1495l() {
        m1557l();
    }

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public final void m1557l() {
        C7504l c7504l = this.f9258l;
        if (c7504l != null) {
            c7504l.ad(new C3036l("Pointer input was reset", 2));
            this.f9258l = null;
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
        m1557l();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final /* synthetic */ float mo871l(long j) {
        return AbstractC9361l.crashlytics(j, this);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004e A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0022, B:17:0x0025, B:20:0x0031, B:22:0x0039, B:24:0x003d, B:25:0x0042, B:26:0x0045, B:28:0x004e, B:30:0x0056, B:32:0x005a), top: B:41:0x000d }] */
    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public final void m1558l(C9185l c9185l, EnumC9065l enumC9065l) {
        Object[] objArr;
        int i;
        int i2;
        C17249l c17249l;
        C2397l c2397l;
        C2397l c2397l2;
        synchronized (this.f9253l) {
            C17893l c17893l = this.f9263l;
            c17893l.amazon(c17893l.f34846l, this.f9254l);
        }
        try {
            int iOrdinal = enumC9065l.ordinal();
            if (iOrdinal == 0) {
                C17893l c17893l2 = this.f9263l;
                objArr = c17893l2.f34848l;
                i = c17893l2.f34846l;
                for (i2 = 0; i2 < i; i2++) {
                    c17249l = (C17249l) objArr[i2];
                    if (enumC9065l != c17249l.f33477l && (c2397l = c17249l.f33473l) != null) {
                        c17249l.f33473l = null;
                        c2397l.subs(c9185l);
                    }
                }
            } else if (iOrdinal == 1) {
                C17893l c17893l3 = this.f9263l;
                int i3 = c17893l3.f34846l - 1;
                Object[] objArr2 = c17893l3.f34848l;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        C17249l c17249l2 = (C17249l) objArr2[i3];
                        if (enumC9065l == c17249l2.f33477l && (c2397l2 = c17249l2.f33473l) != null) {
                            c17249l2.f33473l = null;
                            c2397l2.subs(c9185l);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new C6451l(11);
                }
                C17893l c17893l4 = this.f9263l;
                objArr = c17893l4.f34848l;
                i = c17893l4.f34846l;
                while (i2 < i) {
                    c17249l = (C17249l) objArr[i2];
                    if (enumC9065l != c17249l.f33477l) {
                    }
                }
            }
            this.f9263l.isPro();
        } catch (Throwable th) {
            this.f9263l.isPro();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: static */
    public final float mo872static(int i) {
        return i / loadAd();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: super */
    public final float mo873super() {
        return AbstractC5573l.metrica(this).f7668l.mo873super();
    }

    @Override // defpackage.InterfaceC13202l
    public final long tapsense() {
        return AbstractC10549l.yandex;
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: throw */
    public final void mo1500throw() {
        C9185l c9185l = this.f9257l;
        if (c9185l == null) {
            return;
        }
        List list = c9185l.yandex;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C15730l) list.get(i)).amazon) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C15730l c15730l = (C15730l) list.get(i2);
                    long j = c15730l.yandex;
                    long j2 = c15730l.crashlytics;
                    long j3 = c15730l.loadAd;
                    float f = c15730l.purchase;
                    boolean z = c15730l.amazon;
                    arrayList.add(new C15730l(j, j3, j2, false, f, j3, j2, z, z, c15730l.subs, 0L, 1.0f, 0L));
                }
                C9185l c9185l2 = new C9185l(arrayList, null);
                this.f9255l = c9185l2;
                m1558l(c9185l2, EnumC9065l.f18654l);
                m1558l(c9185l2, EnumC9065l.f18653l);
                m1558l(c9185l2, EnumC9065l.f18652l);
                this.f9257l = null;
                return;
            }
        }
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: transient */
    public final int mo874transient(long j) {
        return Math.round(mo871l(j));
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: class */
    public final /* synthetic */ void mo1493class() {
    }
}
