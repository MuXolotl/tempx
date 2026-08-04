package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؖ٘ٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4193l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17778l f8614l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8615l;

    public /* synthetic */ C4193l(C17778l c17778l, int i) {
        this.f8615l = i;
        this.f8614l = c17778l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f8615l;
        C17778l c17778l = this.f8614l;
        switch (i) {
            case 0:
                c17778l.amazon();
                break;
            case 1:
                try {
                    c17778l.amazon();
                    break;
                } catch (Throwable unused) {
                }
                break;
            default:
                c17778l.amazon();
                break;
        }
        return Unit.INSTANCE;
    }
}
