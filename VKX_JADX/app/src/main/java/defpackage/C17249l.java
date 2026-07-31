package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٜٗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17249l implements InterfaceC13490l, InterfaceC14029l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C2397l f33473l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C2397l f33474l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C4566l f33475l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C4566l f33476l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public EnumC9065l f33477l = EnumC9065l.f18653l;

    public C17249l(C4566l c4566l, C2397l c2397l) {
        this.f33476l = c4566l;
        this.f33475l = c4566l;
        this.f33474l = c2397l;
    }

    public final long amazon() {
        C4566l c4566l = this.f33476l;
        long jAmazon = AbstractC9361l.amazon(AbstractC5573l.metrica(c4566l).f7699l.amazon(), c4566l);
        long j = c4566l.f9260l;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jAmazon >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jAmazon & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, lٜٗؒ] */
    /* JADX WARN: Type inference failed for: r9v1, types: [lٌؚؖ] */
    /* JADX WARN: Type inference failed for: r9v4, types: [lٌؚؖ] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final Object billing(long j, Function2 function2, AbstractC12050l abstractC12050l) {
        C17939l c17939l;
        C2397l c2397l;
        if (abstractC12050l instanceof C17939l) {
            c17939l = (C17939l) abstractC12050l;
            int i = c17939l.f34914l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c17939l.f34914l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c17939l = new C17939l(this, abstractC12050l);
            }
        } else {
            c17939l = new C17939l(this, abstractC12050l);
        }
        Object objInvoke = c17939l.f34915l;
        int i2 = c17939l.f34914l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objInvoke);
                if (j <= 0 && (c2397l = this.f33473l) != null) {
                    c2397l.subs(new C18435l(new C15658l(j)));
                }
                C7504l c7504lMopub = AbstractC10999l.mopub(this.f33476l.m3914l(), null, 0, new C17400l(j, (Object) this, (InterfaceC14029l) null, 4), 3);
                c17939l.f34916l = c7504lMopub;
                c17939l.f34914l = 1;
                objInvoke = function2.invoke(this, c17939l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                this = c7504lMopub;
                if (objInvoke == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                C7504l c7504l = c17939l.f34916l;
                AbstractC2829l.crashlytics(objInvoke);
                this = c7504l;
            }
            this.ads(C14168l.f27702l);
            return objInvoke;
        } catch (Throwable th) {
            this.ads(C14168l.f27702l);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: case */
    public final long mo866case(float f) {
        return this.f33475l.mo866case(f);
    }

    public final Object crashlytics(EnumC9065l enumC9065l, AbstractC12050l abstractC12050l) {
        C2397l c2397l = new C2397l(1, AbstractC17082l.billing(abstractC12050l));
        c2397l.license();
        this.f33477l = enumC9065l;
        this.f33473l = c2397l;
        return c2397l.Signature();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: final */
    public final float mo867final(float f) {
        return f / this.f33475l.loadAd();
    }

    @Override // defpackage.InterfaceC13490l
    public final float inmobi(long j) {
        return AbstractC2812l.amazon(j, this.f33475l);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: instanceof */
    public final float mo868instanceof(float f) {
        return this.f33475l.loadAd() * f;
    }

    @Override // defpackage.InterfaceC13490l
    public final long license(long j) {
        return AbstractC9361l.loadAd(j, this.f33475l);
    }

    @Override // defpackage.InterfaceC13490l
    public final float loadAd() {
        return this.f33475l.loadAd();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final long mo869l(long j) {
        return AbstractC9361l.amazon(j, this.f33475l);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final int mo870l(float f) {
        return AbstractC9361l.yandex(this.f33475l, f);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final float mo871l(long j) {
        return AbstractC9361l.crashlytics(j, this.f33475l);
    }

    @Override // defpackage.InterfaceC14029l
    public final InterfaceC12932l metrica() {
        return C17218l.f33421l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object mopub(long j, Function2 function2, AbstractC0283l abstractC0283l) {
        C8720l c8720l;
        if (abstractC0283l instanceof C8720l) {
            c8720l = (C8720l) abstractC0283l;
            int i = c8720l.f17942l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8720l.f17942l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8720l = new C8720l(this, abstractC0283l);
            }
        } else {
            c8720l = new C8720l(this, abstractC0283l);
        }
        Object obj = c8720l.f17941l;
        int i2 = c8720l.f17942l;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    AbstractC2829l.crashlytics(obj);
                    return obj;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
            c8720l.f17942l = 1;
            Object objBilling = billing(j, function2, c8720l);
            Object obj2 = EnumC9342l.f19165l;
            return objBilling == obj2 ? obj2 : objBilling;
        } catch (C15658l unused) {
            return null;
        }
    }

    public final InterfaceC3114l purchase() {
        return AbstractC5573l.metrica(this.f33476l).f7699l;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: static */
    public final float mo872static(int i) {
        return this.f33475l.mo872static(i);
    }

    @Override // defpackage.InterfaceC14029l
    public final void subs(Object obj) {
        C4566l c4566l = this.f33476l;
        synchronized (c4566l.f9253l) {
            c4566l.f9254l.remoteconfig(this);
            Unit unit = Unit.INSTANCE;
        }
        this.f33474l.subs(obj);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: super */
    public final float mo873super() {
        return this.f33475l.mo873super();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: transient */
    public final int mo874transient(long j) {
        return this.f33475l.mo874transient(j);
    }
}
