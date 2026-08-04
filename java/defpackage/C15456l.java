package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕؕۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15456l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f30224l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30225l;

    public /* synthetic */ C15456l(int i, Function1 function1) {
        this.f30225l = i;
        this.f30224l = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f30225l;
        C0479l c0479l = C0479l.yandex;
        Function1 function1 = this.f30224l;
        switch (i) {
            case 0:
                function1.invoke(null);
                break;
            case 1:
                function1.invoke(c0479l);
                break;
            case 2:
                function1.invoke(c0479l);
                break;
            default:
                function1.invoke(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C15456l(Function1 function1, InterfaceC18514l interfaceC18514l, int i) {
        this.f30225l = i;
        this.f30224l = function1;
    }
}
