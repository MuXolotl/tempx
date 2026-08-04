package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lۣٓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13964l extends AbstractC2219l {
    public static final C12513l purchase = new C12513l((byte) 0, 21);
    public final C2093l crashlytics = new C2093l(this);
    public final C13698l amazon = new C13698l((byte) 0, 18);

    public C13964l(Function1 function1) {
        function1.invoke(this);
    }

    @Override // defpackage.AbstractC2219l
    public final C13698l billing() {
        return this.amazon;
    }

    public final void isPro(int i, Function1 function1, Function1 function2, C15578l c15578l) {
        this.amazon.isPro(i, new C7526l(function1, purchase, function2, c15578l));
    }
}
