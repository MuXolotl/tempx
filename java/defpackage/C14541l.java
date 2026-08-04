package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٓۥٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14541l {
    public int billing;
    public C11919l crashlytics;
    public final Function1 yandex;
    public final C12418l loadAd = new C12418l(0);
    public int amazon = -1;
    public int purchase = -1;

    public C14541l(Function1 function1) {
        this.yandex = function1;
    }

    public final InterfaceC13921l yandex(int i, long j, boolean z, Function1 function1) {
        C11919l c11919l = this.crashlytics;
        if (c11919l == null) {
            return C9791l.yandex;
        }
        InterfaceC1160l interfaceC1160l = (InterfaceC1160l) c11919l.f23766l;
        boolean z2 = interfaceC1160l instanceof ViewOnAttachStateChangeListenerC18312l;
        C11045l c11045l = new C11045l(c11919l, i, this.loadAd, function1);
        c11045l.amazon = new C15519l(j);
        if (!z2) {
            interfaceC1160l.yandex(c11045l);
        } else if (z) {
            ViewOnAttachStateChangeListenerC18312l viewOnAttachStateChangeListenerC18312l = (ViewOnAttachStateChangeListenerC18312l) interfaceC1160l;
            viewOnAttachStateChangeListenerC18312l.f35816l.add(new C12403l(1, c11045l));
            if (!viewOnAttachStateChangeListenerC18312l.f35814l) {
                viewOnAttachStateChangeListenerC18312l.f35814l = true;
                viewOnAttachStateChangeListenerC18312l.f35817l.post(viewOnAttachStateChangeListenerC18312l);
            }
        } else {
            ViewOnAttachStateChangeListenerC18312l viewOnAttachStateChangeListenerC18312l2 = (ViewOnAttachStateChangeListenerC18312l) interfaceC1160l;
            viewOnAttachStateChangeListenerC18312l2.f35816l.add(new C12403l(0, c11045l));
            if (!viewOnAttachStateChangeListenerC18312l2.f35814l) {
                viewOnAttachStateChangeListenerC18312l2.f35814l = true;
                viewOnAttachStateChangeListenerC18312l2.f35817l.post(viewOnAttachStateChangeListenerC18312l2);
            }
        }
        AbstractC11880l.m3277interface(i, "compose:lazy:schedule_prefetch:index");
        return c11045l;
    }
}
