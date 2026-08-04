package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘٛۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5808l {
    public final C0746l crashlytics;
    public final Function1 loadAd;
    public final Function2 yandex;

    public C5808l(Function2 function2, Function1 function1, Function1 function3) {
        this.yandex = function2;
        this.loadAd = function3;
        this.crashlytics = new C0746l(function1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object crashlytics(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C11053l c11053l;
        if (abstractC0283l instanceof C11053l) {
            c11053l = (C11053l) abstractC0283l;
            int i = c11053l.f22251l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11053l.f22251l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11053l = new C11053l(this, abstractC0283l);
            }
        } else {
            c11053l = new C11053l(this, abstractC0283l);
        }
        Object objPurchase = c11053l.f22250l;
        int i2 = c11053l.f22251l;
        InterfaceC14029l interfaceC14029l = null;
        byte b = 0;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objPurchase);
            C7045l c7045l = new C7045l(this, abstractC10022l, interfaceC14029l, b == true ? 1 : 0);
            c11053l.f22251l = 1;
            objPurchase = this.crashlytics.purchase(c7045l, c11053l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objPurchase == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objPurchase);
        }
        return Boolean.valueOf(((C2855l) objPurchase) != null);
    }

    public final boolean loadAd(AbstractC11393l abstractC11393l) {
        if (abstractC11393l.yandex.equals("Bearer")) {
            return true;
        }
        AbstractC3180l.yandex.vip("Bearer Auth Provider is not applicable for " + abstractC11393l);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(C6806l c6806l, AbstractC0283l abstractC0283l) {
        C0652l c0652l;
        if (abstractC0283l instanceof C0652l) {
            c0652l = (C0652l) abstractC0283l;
            int i = c0652l.f2118l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0652l.f2118l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0652l = new C0652l(this, abstractC0283l);
            }
        } else {
            c0652l = new C0652l(this, abstractC0283l);
        }
        Object objAmazon = c0652l.f2119l;
        int i2 = c0652l.f2118l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objAmazon);
            c0652l.f2120l = c6806l;
            c0652l.f2118l = 1;
            objAmazon = this.crashlytics.amazon(c0652l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAmazon == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c6806l = c0652l.f2120l;
            AbstractC2829l.crashlytics(objAmazon);
        }
        C2855l c2855l = (C2855l) objAmazon;
        if (c2855l == null) {
            return Unit.INSTANCE;
        }
        C11911l c11911l = AbstractC12323l.yandex;
        C0090l c0090l = c6806l.crashlytics;
        String str = "Bearer " + c2855l.yandex;
        if (((Map) c0090l.f833l).containsKey("Authorization")) {
            c0090l.m205l("Authorization");
        }
        if (!c6806l.billing.loadAd(AbstractC3180l.loadAd)) {
            c0090l.mo214l("Authorization", str);
        }
        Unit unit = Unit.INSTANCE;
        return Unit.INSTANCE;
    }
}
