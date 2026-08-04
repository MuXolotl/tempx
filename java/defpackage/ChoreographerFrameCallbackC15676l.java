package defpackage;

import android.view.Choreographer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕٔؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC15676l implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f30803l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C2397l f30804l;

    public ChoreographerFrameCallbackC15676l(C2397l c2397l, C2552l c2552l, Function1 function1) {
        this.f30804l = c2397l;
        this.f30803l = function1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object c18435l;
        try {
            c18435l = this.f30803l.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        this.f30804l.subs(c18435l);
    }
}
