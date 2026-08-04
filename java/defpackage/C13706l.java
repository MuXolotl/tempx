package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْ۟ۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13706l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f26760l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12015l f26761l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ float f26762l;

    public /* synthetic */ C13706l(float f, C12015l c12015l, int i) {
        this.f26762l = f;
        this.f26761l = c12015l;
        this.f26760l = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Float fValueOf = Float.valueOf(this.f26762l);
        C12015l c12015l = this.f26761l;
        AbstractC3668l.smaato((InterfaceC17593l) obj, new C14519l(((Number) AbstractC8576l.admob(fValueOf, c12015l)).floatValue(), c12015l, this.f26760l));
        return Unit.INSTANCE;
    }
}
