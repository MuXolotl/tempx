package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍِؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11625l implements InterfaceC6940l {
    public boolean admob;
    public final C13765l amazon;
    public final float[] billing;
    public Function0 crashlytics;
    public final C10740l firebase;
    public final C10086l isPro;
    public final C12015l loadAd;
    public final C16801l metrica;
    public final C15308l mopub;
    public Function1 purchase;
    public final C13765l remoteconfig;
    public final C13765l smaato;
    public final C13765l subs;
    public final C12469l vip;
    public final int yandex;

    public C11625l(float f, int i, C12015l c12015l, Function0 function0, Function1 function1) {
        float[] fArr;
        this.yandex = i;
        this.loadAd = c12015l;
        this.crashlytics = function0;
        this.amazon = new C13765l(f);
        this.purchase = new C8854l(this, function1, 4);
        int i2 = 1;
        if (i == 0) {
            fArr = new float[0];
        } else {
            int i3 = i + 2;
            float[] fArr2 = new float[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                fArr2[i4] = i4 / (i + 1);
            }
            fArr = fArr2;
        }
        this.billing = fArr;
        this.mopub = new C15308l(0);
        this.subs = new C13765l(0.0f);
        this.isPro = AbstractC8020l.smaato(Boolean.FALSE);
        this.firebase = new C10740l(i2, this);
        float fAdmob = this.amazon.admob();
        C12015l c12015l2 = this.loadAd;
        float f2 = c12015l2.yandex;
        float f3 = c12015l2.loadAd - f2;
        this.smaato = new C13765l(AbstractC7572l.firebase(0.0f, 0.0f, AbstractC8576l.amazon(f3 == 0.0f ? 0.0f : (fAdmob - f2) / f3, 0.0f, 1.0f)));
        this.remoteconfig = new C13765l(0.0f);
        this.vip = new C12469l(this, i2);
        this.metrica = new C16801l();
    }

    public final void amazon(float f) {
        C12015l c12015l = this.loadAd;
        float f2 = c12015l.yandex;
        float f3 = c12015l.loadAd;
        this.amazon.subs(AbstractC5832l.amazon(AbstractC8576l.amazon(f, f2, f3), f2, f3, this.billing));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object crashlytics(C1304l c1304l, long j, AbstractC0283l abstractC0283l) {
        C15726l c15726l;
        if (abstractC0283l instanceof C15726l) {
            c15726l = (C15726l) abstractC0283l;
            int i = c15726l.f30892l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15726l.f30892l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15726l = new C15726l(this, abstractC0283l);
            }
        } else {
            c15726l = new C15726l(this, abstractC0283l);
        }
        Object obj = c15726l.f30891l;
        int i2 = c15726l.f30892l;
        C13765l c13765l = this.remoteconfig;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                c13765l.subs((this.admob ? this.mopub.admob() - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32))) - this.smaato.admob());
                c15726l.f30892l = 1;
                Object objYandex = c1304l.yandex(c15726l);
                Object obj2 = EnumC9342l.f19165l;
                if (objYandex == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
            }
        } catch (C10528l unused) {
            c13765l.subs(0.0f);
        }
        return Unit.INSTANCE;
    }

    public final void loadAd(float f) {
        float fAdmob = this.mopub.admob();
        C13765l c13765l = this.subs;
        float fMax = Math.max(fAdmob - (c13765l.admob() / 2.0f), 0.0f);
        float fMin = Math.min(c13765l.admob() / 2.0f, fMax);
        C13765l c13765l2 = this.smaato;
        float fAdmob2 = c13765l2.admob() + f;
        C13765l c13765l3 = this.remoteconfig;
        c13765l2.subs(c13765l3.admob() + fAdmob2);
        c13765l3.subs(0.0f);
        float fAmazon = AbstractC5832l.amazon(c13765l2.admob(), fMin, fMax, this.billing);
        Function1 function1 = this.purchase;
        C12015l c12015l = this.loadAd;
        float f2 = fMax - fMin;
        function1.invoke(Float.valueOf(AbstractC7572l.firebase(c12015l.yandex, c12015l.loadAd, AbstractC8576l.amazon(f2 == 0.0f ? 0.0f : (fAmazon - fMin) / f2, 0.0f, 1.0f))));
    }

    @Override // defpackage.InterfaceC6940l
    public final Object yandex(EnumC11011l enumC11011l, Function2 function2, AbstractC5563l abstractC5563l) {
        Object objAdmob = AbstractC11990l.admob(new C4647l(this, enumC11011l, function2, (InterfaceC14029l) null, 29), abstractC5563l);
        return objAdmob == EnumC9342l.f19165l ? objAdmob : Unit.INSTANCE;
    }
}
