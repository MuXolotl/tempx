package defpackage;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lٔٝؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15035l {
    public final C17528l admob;
    public final C18200l amazon;
    public final C4236l billing;
    public final C0059l crashlytics;
    public final C0059l loadAd;
    public final C15406l mopub;
    public final C15406l purchase;
    public final C18662l yandex;

    public C15035l(C18662l c18662l, C0059l c0059l, C0059l c0059l2, C18200l c18200l, C15406l c15406l, C4236l c4236l, C15406l c15406l2, C17528l c17528l) {
        this.yandex = c18662l;
        this.loadAd = c0059l;
        this.crashlytics = c0059l2;
        this.amazon = c18200l;
        this.purchase = c15406l;
        this.billing = c4236l;
        this.mopub = c15406l2;
        this.admob = c17528l;
    }

    public static C5159l yandex() {
        return new C5159l(-6, new Bundle());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object loadAd(String str, AbstractC7778l abstractC7778l, InterfaceC14029l interfaceC14029l) throws Throwable {
        C3991l c3991l;
        Object obj;
        if (interfaceC14029l instanceof C3991l) {
            c3991l = (C3991l) interfaceC14029l;
            int i = c3991l.f8197l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3991l.f8197l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3991l = new C3991l(this, interfaceC14029l);
            }
        } else {
            c3991l = new C3991l(this, interfaceC14029l);
        }
        Object obj2 = c3991l.f8196l;
        int i2 = c3991l.f8197l;
        InterfaceC14029l interfaceC14029l2 = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj2);
            C2258l c2258l = (C2258l) this.crashlytics.get();
            if (str == null) {
                return yandex();
            }
            C10507l c10507lIsPro = c2258l.isPro(str);
            if (c10507lIsPro == null || (obj = c10507lIsPro.loadAd) == null) {
                return yandex();
            }
            if (!(obj instanceof InterfaceC9764l)) {
                return yandex();
            }
            C1673l c1673l = abstractC7778l instanceof C1673l ? (C1673l) abstractC7778l : null;
            if (c1673l == null) {
                c1673l = new C1673l(!((InterfaceC9764l) obj).getSmaato());
            }
            InterfaceC9764l interfaceC9764l = (InterfaceC9764l) obj;
            boolean smaato = interfaceC9764l.getSmaato();
            boolean z = c1673l.crashlytics;
            if (smaato != z) {
                interfaceC9764l.crashlytics(z);
                C16552l c16552l = AbstractC11463l.yandex;
                C2975l c2975l = AbstractC17278l.yandex;
                C4781l c4781l = new C4781l(this, c1673l, interfaceC14029l2, 7);
                c3991l.f8197l = 1;
                Object objFirebase = AbstractC10999l.firebase(c2975l, c4781l, c3991l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objFirebase == enumC9342l) {
                    return enumC9342l;
                }
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj2);
        }
        return new C5159l(0, new Bundle());
    }
}
