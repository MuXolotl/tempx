package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؒۛۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1336l extends AbstractC2219l {
    public C16761l amazon;
    public final C13698l crashlytics = new C13698l((byte) 0, 18);

    public C1336l(Function1 function1) {
        function1.invoke(this);
    }

    @Override // defpackage.AbstractC2219l
    public final C13698l billing() {
        return this.crashlytics;
    }

    public final void firebase(int i, Function1 function1, Function1 function2, C15578l c15578l) {
        this.crashlytics.isPro(i, new C13810l(function1, function2, c15578l));
    }

    public final void isPro(Object obj, Object obj2, Function3 function3) {
        int i = 19;
        this.crashlytics.isPro(1, new C13810l(obj != null ? new C17015l(i, obj) : null, new C17015l(i, obj2), new C15578l(-857469575, true, new C4508l(7, function3))));
    }
}
