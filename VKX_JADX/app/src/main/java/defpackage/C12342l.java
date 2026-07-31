package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّٜؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12342l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f24435l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f24436l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24437l;

    public /* synthetic */ C12342l(Function1 function1, Function1 function2, int i) {
        this.f24437l = i;
        this.f24436l = function1;
        this.f24435l = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f24437l;
        Function1 function1 = this.f24435l;
        Function1 function2 = this.f24436l;
        switch (i) {
            case 0:
                if (function2 != null) {
                    function2.invoke(obj);
                }
                function1.invoke(obj);
                break;
            case 1:
                C4708l c4708l = (C4708l) obj;
                function2.invoke(c4708l);
                function1.invoke(c4708l);
                break;
            case 2:
                function2.invoke(obj);
                function1.invoke(obj);
                break;
            default:
                function2.invoke(obj);
                function1.invoke(obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
