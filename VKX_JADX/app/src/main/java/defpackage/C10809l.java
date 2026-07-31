package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lُؔؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10809l {
    public final float admob;
    public final C11090l amazon;
    public final Function2 billing;
    public final C11090l crashlytics;
    public final C14282l firebase;
    public final InterfaceC10137l isPro;
    public final Function2 loadAd;
    public final Function3 mopub;
    public final C15089l purchase;
    public final InterfaceC3102l smaato;
    public final InterfaceC11780l subs;
    public final InterfaceC17242l yandex;

    public C10809l(InterfaceC17242l interfaceC17242l, Function2 function2, C11090l c11090l, C11090l c11090l2, C15089l c15089l, Function2 function3, Function3 function4, float f, InterfaceC11780l interfaceC11780l, InterfaceC10137l interfaceC10137l, C14282l c14282l, InterfaceC3102l interfaceC3102l) {
        this.yandex = interfaceC17242l;
        this.loadAd = function2;
        this.crashlytics = c11090l;
        this.amazon = c11090l2;
        this.purchase = c15089l;
        this.billing = function3;
        this.mopub = function4;
        this.admob = f;
        this.subs = interfaceC11780l;
        this.isPro = interfaceC10137l;
        this.firebase = c14282l;
        this.smaato = interfaceC3102l;
    }
}
