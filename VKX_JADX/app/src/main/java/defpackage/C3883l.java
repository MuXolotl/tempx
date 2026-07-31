package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖؖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3883l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f8021l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C4487l f8022l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8023l;

    public /* synthetic */ C3883l(C4487l c4487l, Function1 function1, int i) {
        this.f8023l = i;
        this.f8022l = c4487l;
        this.f8021l = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f8023l;
        Function1 function1 = this.f8021l;
        C4487l c4487l = this.f8022l;
        switch (i) {
            case 0:
                C0327l c0327l = (C0327l) obj;
                if (c4487l != null) {
                    c4487l.yandex.setValue(c0327l);
                }
                if (function1 != null) {
                    function1.invoke(c0327l);
                }
                return Unit.INSTANCE;
            default:
                c4487l.crashlytics.add(function1);
                return new C18616l(c4487l, function1, 7);
        }
    }
}
