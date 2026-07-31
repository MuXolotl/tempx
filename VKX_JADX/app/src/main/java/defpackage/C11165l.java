package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُٜؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11165l implements InterfaceC10315l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f22451l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f22452l;

    public C11165l(Function1 function1, Function2 function2) {
        this.f22452l = function2;
        this.f22451l = function1;
    }

    @Override // defpackage.InterfaceC10315l
    public final Object billing(Object obj) {
        return this.f22451l.invoke(obj);
    }

    @Override // defpackage.InterfaceC10315l
    public final Object subs(C15543l c15543l, Object obj) {
        return this.f22452l.invoke(c15543l, obj);
    }
}
