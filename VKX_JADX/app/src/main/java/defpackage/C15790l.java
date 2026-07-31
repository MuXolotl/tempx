package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٕٛٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15790l extends AbstractC11340l implements InterfaceC12499l {

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public float f31003l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C7806l f31004l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f31006l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f31007l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public Function0 f31008l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C4369l f31002l = new C4369l(this, null);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C13765l f31009l = new C13765l(0.0f);

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C13765l f31005l = new C13765l(0.0f);

    public C15790l(boolean z, Function0 function0, boolean z2, C7806l c7806l, float f) {
        this.f31007l = z;
        this.f31008l = function0;
        this.f31006l = z2;
        this.f31004l = c7806l;
        this.f31003l = f;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public static final Object m4115l(C15790l c15790l, AbstractC0283l abstractC0283l) {
        C8338l c8338l;
        c15790l.getClass();
        if (abstractC0283l instanceof C8338l) {
            c8338l = (C8338l) abstractC0283l;
            int i = c8338l.f17265l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8338l.f17265l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8338l = new C8338l(c15790l, abstractC0283l);
            }
        } else {
            c8338l = new C8338l(c15790l, abstractC0283l);
        }
        C8338l c8338l2 = c8338l;
        Object obj = c8338l2.f17264l;
        int i2 = c8338l2.f17265l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                C7806l c7806l = c15790l.f31004l;
                c8338l2.f17265l = 1;
                Object objLoadAd = C5616l.loadAd(c7806l.yandex, new Float(1.0f), null, null, null, c8338l2, 14);
                Object obj2 = EnumC9342l.f19165l;
                if (objLoadAd != obj2) {
                    objLoadAd = Unit.INSTANCE;
                }
                if (objLoadAd == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
            }
            if (c15790l.f29462l) {
                c15790l.m4117l(c15790l.m4119l());
                c15790l.m4118l(c15790l.m4119l());
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            if (!c15790l.f29462l) {
                throw th;
            }
            c15790l.m4117l(c15790l.m4119l());
            c15790l.m4118l(c15790l.m4119l());
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public final Object m4116l(AbstractC0283l abstractC0283l) {
        C18308l c18308l;
        if (abstractC0283l instanceof C18308l) {
            c18308l = (C18308l) abstractC0283l;
            int i = c18308l.f35811l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c18308l.f35811l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c18308l = new C18308l(this, abstractC0283l);
            }
        } else {
            c18308l = new C18308l(this, abstractC0283l);
        }
        C18308l c18308l2 = c18308l;
        Object obj = c18308l2.f35810l;
        int i2 = c18308l2.f35811l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                C7806l c7806l = this.f31004l;
                c18308l2.f35811l = 1;
                Object objLoadAd = C5616l.loadAd(c7806l.yandex, new Float(0.0f), null, null, null, c18308l2, 14);
                Object obj2 = EnumC9342l.f19165l;
                if (objLoadAd != obj2) {
                    objLoadAd = Unit.INSTANCE;
                }
                if (objLoadAd == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
            }
            m4117l(0.0f);
            m4118l(0.0f);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            m4117l(0.0f);
            m4118l(0.0f);
            throw th;
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        m3069l(this.f31002l);
        AbstractC10999l.mopub(m3914l(), null, 0, new C14618l(this, null, 0), 3);
        m4118l(this.f31007l ? m4119l() : 0.0f);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }

    /* JADX INFO: renamed from: lٍۤٙ, reason: contains not printable characters */
    public final void m4117l(float f) {
        this.f31005l.subs(f);
    }

    /* JADX INFO: renamed from: lؘْٔ, reason: contains not printable characters */
    public final void m4118l(float f) {
        this.f31009l.subs(f);
    }

    /* JADX INFO: renamed from: lٌٖؖ, reason: contains not printable characters */
    public final int m4119l() {
        return AbstractC5573l.metrica(this).f7668l.mo870l(this.f31003l);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: lَٖؕ */
    public final Object mo1110l(long j, InterfaceC14029l interfaceC14029l) {
        C10590l c10590l;
        if (interfaceC14029l instanceof C10590l) {
            c10590l = (C10590l) interfaceC14029l;
            int i = c10590l.f21502l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10590l.f21502l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10590l = new C10590l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c10590l = new C10590l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object objM4120l = c10590l.f21501l;
        int i2 = c10590l.f21502l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objM4120l);
            float fCrashlytics = C12121l.crashlytics(j);
            c10590l.f21502l = 1;
            objM4120l = m4120l(fCrashlytics, c10590l);
            Object obj = EnumC9342l.f19165l;
            if (objM4120l == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objM4120l);
        }
        return new C12121l(AbstractC12311l.mopub(0.0f, ((Number) objM4120l).floatValue()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: lٖۡٓ, reason: contains not printable characters */
    public final Object m4120l(float f, AbstractC0283l abstractC0283l) {
        C10283l c10283l;
        if (abstractC0283l instanceof C10283l) {
            c10283l = (C10283l) abstractC0283l;
            int i = c10283l.f20924l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10283l.f20924l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10283l = new C10283l(this, abstractC0283l);
            }
        } else {
            c10283l = new C10283l(this, abstractC0283l);
        }
        Object obj = c10283l.f20925l;
        int i2 = c10283l.f20924l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (this.f31007l) {
                return new Float(0.0f);
            }
            C13765l c13765l = this.f31005l;
            if (c13765l.admob() * 0.5f > m4119l()) {
                this.f31008l.invoke();
            }
            if (c13765l.admob() == 0.0f || f < 0.0f) {
                f = 0.0f;
            }
            c10283l.f20926l = f;
            c10283l.f20924l = 1;
            Object objM4116l = m4116l(c10283l);
            Object obj2 = EnumC9342l.f19165l;
            if (objM4116l == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = c10283l.f20926l;
            AbstractC2829l.crashlytics(obj);
        }
        m4117l(0.0f);
        return new Float(f);
    }

    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    public final long m4121l(long j) {
        float fAdmob;
        float fM4119l;
        if (this.f31007l) {
            fAdmob = 0.0f;
        } else {
            C13765l c13765l = this.f31005l;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) + c13765l.admob();
            if (fIntBitsToFloat < 0.0f) {
                fIntBitsToFloat = 0.0f;
            }
            fAdmob = fIntBitsToFloat - c13765l.admob();
            m4117l(fIntBitsToFloat);
            if (c13765l.admob() * 0.5f <= m4119l()) {
                fM4119l = c13765l.admob() * 0.5f;
            } else {
                float fAmazon = AbstractC8576l.amazon(Math.abs((c13765l.admob() * 0.5f) / m4119l()) - 1.0f, 0.0f, 2.0f);
                fM4119l = m4119l() + (m4119l() * (fAmazon - (((float) Math.pow(fAmazon, 2.0d)) / 4.0f)));
            }
            m4118l(fM4119l);
        }
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fAdmob)));
    }

    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: return */
    public final long mo1111return(int i, long j, long j2) {
        if (this.f31004l.yandex.purchase() || !this.f31006l) {
            return 0L;
        }
        int i2 = 1;
        if (i != 1) {
            return 0L;
        }
        long jM4121l = m4121l(j2);
        AbstractC10999l.mopub(m3914l(), null, 0, new C14618l(this, null, i2), 3);
        return jM4121l;
    }

    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: switch */
    public final long mo1112switch(int i, long j) {
        if (!this.f31004l.yandex.purchase() && this.f31006l && i == 1 && Float.intBitsToFloat((int) (4294967295L & j)) < 0.0f) {
            return m4121l(j);
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: throws */
    public final Object mo1113throws(long j, long j2, InterfaceC14029l interfaceC14029l) {
        return new C12121l(0L);
    }
}
