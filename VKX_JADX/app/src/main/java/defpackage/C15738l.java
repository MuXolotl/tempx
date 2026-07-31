package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕٗ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15738l {
    public final /* synthetic */ C18656l crashlytics;
    public final C10086l loadAd = AbstractC8020l.smaato(null);
    public final C0010l yandex;

    public C15738l(C18656l c18656l, C0010l c0010l, String str) {
        this.crashlytics = c18656l;
        this.yandex = c0010l;
    }

    public final C17421l yandex(Function1 function1, Object obj, AbstractC2249l abstractC2249l, Function1 function2) {
        C10086l c10086l = this.loadAd;
        C17421l c17421l = (C17421l) c10086l.getValue();
        C18656l c18656l = this.crashlytics;
        if (c17421l == null) {
            Object objInvoke = function2.invoke(c18656l.crashlytics());
            Object objInvoke2 = function2.invoke(c18656l.crashlytics());
            C0010l c0010l = this.yandex;
            AbstractC2249l abstractC2249l2 = (AbstractC2249l) c0010l.yandex.invoke(objInvoke2);
            abstractC2249l2.amazon();
            C9459l c9459l = new C9459l(c18656l, objInvoke, abstractC2249l2, c0010l);
            c17421l = new C17421l(this, c9459l, function1, function2);
            c10086l.setValue(c17421l);
            c18656l.isPro.add(c9459l);
        }
        c17421l.f33956l = function2;
        c17421l.f33957l = function1;
        c17421l.crashlytics(c18656l.billing(), obj, abstractC2249l);
        return c17421l;
    }
}
