package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؓۛۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2117l implements InterfaceC12499l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f4748l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f4749l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4750l;

    public /* synthetic */ C2117l(Object obj, Object obj2, int i) {
        this.f4750l = i;
        this.f4749l = obj;
        this.f4748l = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: lَٖؕ, reason: contains not printable characters */
    public final Object mo1110l(long j, InterfaceC14029l interfaceC14029l) {
        C9717l c9717l;
        C0970l c0970l;
        int i = this.f4750l;
        Object obj = this.f4748l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                if (interfaceC14029l instanceof C9717l) {
                    c9717l = (C9717l) interfaceC14029l;
                    int i2 = c9717l.f19817l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c9717l.f19817l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c9717l = new C9717l(this, (AbstractC0283l) interfaceC14029l);
                    }
                } else {
                    c9717l = new C9717l(this, (AbstractC0283l) interfaceC14029l);
                }
                Object objInvoke = c9717l.f19816l;
                int i3 = c9717l.f19817l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(objInvoke);
                    Float f = new Float(C12121l.crashlytics(j));
                    c9717l.f19817l = 1;
                    objInvoke = ((C11491l) obj).invoke(f, c9717l);
                    if (objInvoke == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(objInvoke);
                }
                return new C12121l(AbstractC12311l.mopub(0.0f, ((Number) objInvoke).floatValue()));
            default:
                C8954l c8954l = (C8954l) this.f4749l;
                C15389l c15389l = c8954l.mopub;
                if (interfaceC14029l instanceof C0970l) {
                    c0970l = (C0970l) interfaceC14029l;
                    int i4 = c0970l.f2670l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c0970l.f2670l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c0970l = new C0970l(this, (AbstractC0283l) interfaceC14029l);
                    }
                } else {
                    c0970l = new C0970l(this, (AbstractC0283l) interfaceC14029l);
                }
                Object obj2 = c0970l.f2671l;
                int i5 = c0970l.f2670l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj2);
                    float fCrashlytics = C12121l.crashlytics(j);
                    float fSmaato = c15389l.smaato();
                    float fPurchase = c15389l.subs().purchase();
                    if (fCrashlytics >= 0.0f || fSmaato <= fPurchase) {
                        j = 0;
                    } else {
                        c0970l.f2672l = j;
                        c0970l.f2670l = 1;
                        if (c8954l.yandex((InterfaceC14745l) obj, fCrashlytics, c0970l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = c0970l.f2672l;
                    AbstractC2829l.crashlytics(obj2);
                }
                return new C12121l(j);
        }
    }

    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: return, reason: not valid java name */
    public final long mo1111return(int i, long j, long j2) {
        int i2 = this.f4750l;
        Object obj = this.f4749l;
        switch (i2) {
            case 0:
                if (i != 1) {
                    return 0L;
                }
                int i3 = (int) (j2 & 4294967295L);
                if (Float.intBitsToFloat(i3) <= 0.0f) {
                    return 0L;
                }
                float fFloatValue = ((Number) ((C3151l) obj).invoke(Float.valueOf(Float.intBitsToFloat(i3)))).floatValue();
                return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue)) & 4294967295L);
            default:
                if (i != 1) {
                    return 0L;
                }
                C15389l c15389l = ((C8954l) obj).mopub;
                float fIsPro = c15389l.isPro(Float.intBitsToFloat((int) (j2 & 4294967295L)));
                float fSmaato = fIsPro - c15389l.smaato();
                ((C14061l) c15389l.firebase).yandex(fIsPro, 0.0f);
                return yandex(fSmaato);
        }
    }

    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final long mo1112switch(int i, long j) {
        int i2 = this.f4750l;
        Object obj = this.f4749l;
        switch (i2) {
            case 0:
                if (i != 1) {
                    return 0L;
                }
                int i3 = (int) (j & 4294967295L);
                if (Float.intBitsToFloat(i3) >= 0.0f) {
                    return 0L;
                }
                float fFloatValue = ((Number) ((C3151l) obj).invoke(Float.valueOf(Float.intBitsToFloat(i3)))).floatValue();
                return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue)) & 4294967295L);
            default:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                if (fIntBitsToFloat >= 0.0f || i != 1) {
                    return 0L;
                }
                C15389l c15389l = ((C8954l) obj).mopub;
                float fIsPro = c15389l.isPro(fIntBitsToFloat);
                float fSmaato = fIsPro - c15389l.smaato();
                ((C14061l) c15389l.firebase).yandex(fIsPro, 0.0f);
                return yandex(fSmaato);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final Object mo1113throws(long j, long j2, InterfaceC14029l interfaceC14029l) {
        C0817l c0817l;
        switch (this.f4750l) {
            case 0:
                return new C12121l(0L);
            default:
                if (interfaceC14029l instanceof C0817l) {
                    c0817l = (C0817l) interfaceC14029l;
                    int i = c0817l.f2448l;
                    if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c0817l.f2448l = i - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c0817l = new C0817l(this, (AbstractC0283l) interfaceC14029l);
                    }
                } else {
                    c0817l = new C0817l(this, (AbstractC0283l) interfaceC14029l);
                }
                Object objYandex = c0817l.f2449l;
                int i2 = c0817l.f2448l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(objYandex);
                    float fCrashlytics = C12121l.crashlytics(j2);
                    C8954l c8954l = (C8954l) this.f4749l;
                    InterfaceC14745l interfaceC14745l = (InterfaceC14745l) this.f4748l;
                    c0817l.f2450l = j;
                    c0817l.f2448l = 1;
                    objYandex = c8954l.yandex(interfaceC14745l, fCrashlytics, c0817l);
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (objYandex == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = c0817l.f2450l;
                    AbstractC2829l.crashlytics(objYandex);
                }
                return new C12121l(AbstractC12311l.mopub(C12121l.loadAd(j), ((Number) objYandex).floatValue()));
        }
    }

    public long yandex(float f) {
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }
}
