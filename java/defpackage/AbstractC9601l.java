package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9601l implements InterfaceC13490l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f19562l;

    public static void adcel(AbstractC9601l abstractC9601l, AbstractC10113l abstractC10113l, long j) {
        int i = AbstractC7357l.loadAd;
        C16274l c16274l = C16274l.f31846l;
        abstractC9601l.getClass();
        yandex(abstractC9601l, abstractC10113l);
        abstractC10113l.mo883interface(C5177l.amazon(j, abstractC10113l.f20593l), 0.0f, c16274l);
    }

    public static void isPro(AbstractC9601l abstractC9601l, AbstractC10113l abstractC10113l, long j) {
        abstractC9601l.getClass();
        yandex(abstractC9601l, abstractC10113l);
        abstractC10113l.mo883interface(C5177l.amazon(j, abstractC10113l.f20593l), 0.0f, null);
    }

    public static void metrica(AbstractC9601l abstractC9601l, AbstractC10113l abstractC10113l, long j, C11925l c11925l) {
        if (abstractC9601l.purchase() == EnumC9931l.f20223l || abstractC9601l.billing() == 0) {
            yandex(abstractC9601l, abstractC10113l);
            abstractC10113l.mo1459class(C5177l.amazon(j, abstractC10113l.f20593l), 0.0f, c11925l);
        } else {
            int iBilling = (abstractC9601l.billing() - abstractC10113l.f20592l) - ((int) (j >> 32));
            yandex(abstractC9601l, abstractC10113l);
            abstractC10113l.mo1459class(C5177l.amazon((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iBilling) << 32), abstractC10113l.f20593l), 0.0f, c11925l);
        }
    }

    public static void remoteconfig(AbstractC9601l abstractC9601l, AbstractC10113l abstractC10113l, int i, int i2, Function1 function1, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = AbstractC7357l.loadAd;
            function1 = C16274l.f31846l;
        }
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (abstractC9601l.purchase() == EnumC9931l.f20223l || abstractC9601l.billing() == 0) {
            yandex(abstractC9601l, abstractC10113l);
            abstractC10113l.mo883interface(C5177l.amazon(j, abstractC10113l.f20593l), 0.0f, function1);
        } else {
            yandex(abstractC9601l, abstractC10113l);
            abstractC10113l.mo883interface(C5177l.amazon((((long) ((abstractC9601l.billing() - abstractC10113l.f20592l) - ((int) (j >> 32)))) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), abstractC10113l.f20593l), 0.0f, function1);
        }
    }

    public static void smaato(AbstractC9601l abstractC9601l, AbstractC10113l abstractC10113l, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (abstractC9601l.purchase() == EnumC9931l.f20223l || abstractC9601l.billing() == 0) {
            yandex(abstractC9601l, abstractC10113l);
            abstractC10113l.mo883interface(C5177l.amazon(j, abstractC10113l.f20593l), 0.0f, null);
        } else {
            int iBilling = (abstractC9601l.billing() - abstractC10113l.f20592l) - ((int) (j >> 32));
            yandex(abstractC9601l, abstractC10113l);
            abstractC10113l.mo883interface(C5177l.amazon((((long) iBilling) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), abstractC10113l.f20593l), 0.0f, null);
        }
    }

    public static void startapp(AbstractC9601l abstractC9601l, AbstractC10113l abstractC10113l, int i, int i2, Function1 function1, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = AbstractC7357l.loadAd;
            function1 = C16274l.f31846l;
        }
        abstractC9601l.getClass();
        yandex(abstractC9601l, abstractC10113l);
        abstractC10113l.mo883interface(C5177l.amazon((((long) i2) & 4294967295L) | (((long) i) << 32), abstractC10113l.f20593l), 0.0f, function1);
    }

    public static void vip(AbstractC9601l abstractC9601l, AbstractC10113l abstractC10113l, long j) {
        int i = AbstractC7357l.loadAd;
        C16274l c16274l = C16274l.f31846l;
        if (abstractC9601l.purchase() == EnumC9931l.f20223l || abstractC9601l.billing() == 0) {
            yandex(abstractC9601l, abstractC10113l);
            abstractC10113l.mo883interface(C5177l.amazon(j, abstractC10113l.f20593l), 0.0f, c16274l);
        } else {
            int iBilling = (abstractC9601l.billing() - abstractC10113l.f20592l) - ((int) (j >> 32));
            yandex(abstractC9601l, abstractC10113l);
            abstractC10113l.mo883interface(C5177l.amazon((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iBilling) << 32), abstractC10113l.f20593l), 0.0f, c16274l);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void yandex(AbstractC9601l abstractC9601l, AbstractC10113l abstractC10113l) {
        abstractC9601l.getClass();
        if (abstractC10113l instanceof InterfaceC16113l) {
            ((InterfaceC16113l) abstractC10113l).premium(abstractC9601l.f19562l);
        }
    }

    public InterfaceC18212l amazon() {
        return null;
    }

    public abstract int billing();

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: case */
    public final long mo866case(float f) {
        return AbstractC2812l.purchase(this, f / loadAd());
    }

    public float crashlytics(C3384l c3384l) {
        return Float.NaN;
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

    public final void mopub(AbstractC10113l abstractC10113l, int i, int i2, float f) {
        yandex(this, abstractC10113l);
        abstractC10113l.mo883interface(C5177l.amazon((((long) i2) & 4294967295L) | (((long) i) << 32), abstractC10113l.f20593l), f, null);
    }

    public abstract EnumC9931l purchase();

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: static */
    public final float mo872static(int i) {
        return i / loadAd();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: transient */
    public final int mo874transient(long j) {
        return Math.round(mo871l(j));
    }
}
