package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٓۥٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14543l extends AbstractC2219l {
    public final C10975l amazon;
    public final C13698l crashlytics;

    public C14543l(Function1 function1) {
        C13698l c13698l = new C13698l((byte) 0, 18);
        this.crashlytics = c13698l;
        this.amazon = new C10975l(15, c13698l);
        function1.invoke(this);
    }

    @Override // defpackage.AbstractC2219l
    public final C13698l billing() {
        return this.crashlytics;
    }
}
