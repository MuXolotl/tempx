package defpackage;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٖؖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4154l {
    public final C10839l admob;
    public EnumC7283l amazon;
    public C17110l billing;
    public InterfaceC14745l crashlytics;
    public C10306l loadAd;
    public final C9649l mopub;
    public boolean purchase;
    public boolean subs;
    public InterfaceC17955l yandex;
    public int isPro = 1;
    public InterfaceC1555l firebase = AbstractC13611l.loadAd;
    public final C15222l smaato = new C15222l(this);
    public final C16931l remoteconfig = new C16931l(16, this);

    public C4154l(InterfaceC17955l interfaceC17955l, C10306l c10306l, InterfaceC14745l interfaceC14745l, EnumC7283l enumC7283l, boolean z, C17110l c17110l, C9649l c9649l, C10839l c10839l) {
        this.yandex = interfaceC17955l;
        this.loadAd = c10306l;
        this.crashlytics = interfaceC14745l;
        this.amazon = enumC7283l;
        this.purchase = z;
        this.billing = c17110l;
        this.mopub = c9649l;
        this.admob = c10839l;
    }

    public final float admob(long j) {
        return Float.intBitsToFloat(this.amazon == EnumC7283l.f15125l ? (int) (j >> 32) : (int) (j & 4294967295L));
    }

    public final long amazon(InterfaceC1555l interfaceC1555l, long j, int i) {
        C4369l c4369l = this.billing.yandex;
        C4369l c4369lM1543l = c4369l != null ? c4369l.m1543l() : null;
        long jMo1112switch = c4369lM1543l != null ? c4369lM1543l.mo1112switch(i, j) : 0L;
        long jAdmob = C1187l.admob(j, jMo1112switch);
        long jBilling = billing(subs(interfaceC1555l.yandex(admob(billing(this.amazon == EnumC7283l.f15125l ? C1187l.yandex(0.0f, 1, jAdmob) : C1187l.yandex(0.0f, 2, jAdmob))))));
        C9649l c9649l = this.mopub;
        if (c9649l.f29462l) {
            ViewTreeObserver viewTreeObserver = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(c9649l)).getViewTreeObserver();
            try {
                if (ViewTreeObserverOnGlobalLayoutListenerC13840l.f26991l == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    ViewTreeObserverOnGlobalLayoutListenerC13840l.f26991l = declaredMethod;
                }
                Method method = ViewTreeObserverOnGlobalLayoutListenerC13840l.f26991l;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long jAdmob2 = C1187l.admob(jAdmob, jBilling);
        C4369l c4369l2 = this.billing.yandex;
        C4369l c4369lM1543l2 = c4369l2 != null ? c4369l2.m1543l() : null;
        return C1187l.subs(C1187l.subs(jMo1112switch, jBilling), c4369lM1543l2 != null ? c4369lM1543l2.mo1111return(i, jBilling, jAdmob2) : 0L);
    }

    public final long billing(long j) {
        return this.purchase ? C1187l.isPro(-1.0f, j) : j;
    }

    public final Object crashlytics(long j, boolean z, AbstractC5563l abstractC5563l) {
        if (z && (this.crashlytics instanceof C1192l)) {
            return Unit.INSTANCE;
        }
        long jYandex = C12121l.yandex(j, 0.0f, 0.0f, this.amazon == EnumC7283l.f15125l ? 1 : 2);
        C10635l c10635l = new C10635l(this, null);
        C10306l c10306l = this.loadAd;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (c10306l != null && loadAd()) {
            Object objLoadAd = c10306l.loadAd(jYandex, c10635l, abstractC5563l);
            return objLoadAd == enumC9342l ? objLoadAd : Unit.INSTANCE;
        }
        C10635l c10635l2 = new C10635l(this, abstractC5563l);
        c10635l2.f21578l = jYandex;
        Unit unit = Unit.INSTANCE;
        Object objSignature = c10635l2.Signature(unit);
        return objSignature == enumC9342l ? objSignature : unit;
    }

    public final float isPro(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        EnumC7283l enumC7283l = this.amazon;
        if (dAtan2 >= 0.7853981633974483d) {
            if (enumC7283l == EnumC7283l.f15126l) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (enumC7283l == EnumC7283l.f15125l) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }

    public final boolean loadAd() {
        C10306l c10306l;
        return this.yandex.amazon() || this.yandex.crashlytics() || ((c10306l = this.loadAd) != null && c10306l.purchase());
    }

    public final Object mopub(EnumC11011l enumC11011l, Function2 function2, AbstractC0283l abstractC0283l) {
        Object objLoadAd = this.yandex.loadAd(enumC11011l, new C17949l(this, function2, null, 21), abstractC0283l);
        return objLoadAd == EnumC9342l.f19165l ? objLoadAd : Unit.INSTANCE;
    }

    public final float purchase(float f) {
        return this.purchase ? f * (-1.0f) : f;
    }

    public final long subs(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.amazon == EnumC7283l.f15125l) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(long j, AbstractC0283l abstractC0283l) throws Throwable {
        C2801l c2801l;
        C4154l c4154l;
        Throwable th;
        C17078l c17078l;
        if (abstractC0283l instanceof C2801l) {
            c2801l = (C2801l) abstractC0283l;
            int i = c2801l.f6095l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2801l.f6095l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2801l = new C2801l(this, abstractC0283l);
            }
        } else {
            c2801l = new C2801l(this, abstractC0283l);
        }
        Object obj = c2801l.f6096l;
        int i2 = c2801l.f6095l;
        if (i2 != 0) {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c17078l = c2801l.f6097l;
            try {
                AbstractC2829l.crashlytics(obj);
                c4154l = this;
                c4154l.subs = false;
                return new C12121l(c17078l.f33243l);
            } catch (Throwable th2) {
                th = th2;
                c4154l = this;
                c4154l.subs = false;
                throw th;
            }
        }
        AbstractC2829l.crashlytics(obj);
        C17078l c17078l2 = new C17078l();
        c17078l2.f33243l = j;
        this.subs = true;
        try {
            EnumC11011l enumC11011l = EnumC11011l.f22182l;
            c4154l = this;
            try {
                C12278l c12278l = new C12278l(c4154l, c17078l2, j, null);
                c2801l.f6097l = c17078l2;
                c2801l.f6095l = 1;
                Object objMopub = c4154l.mopub(enumC11011l, c12278l, c2801l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objMopub == enumC9342l) {
                    return enumC9342l;
                }
                c17078l = c17078l2;
                c4154l.subs = false;
                return new C12121l(c17078l.f33243l);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                c4154l.subs = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            c4154l = this;
        }
    }
}
