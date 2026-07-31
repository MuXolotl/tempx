package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَْٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10261l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f20879l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f20880l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20881l;

    public /* synthetic */ C10261l(Function0 function0, Function0 function1, int i) {
        this.f20881l = i;
        this.f20880l = function0;
        this.f20879l = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f20881l;
        Function0 function0 = this.f20879l;
        Function0 function1 = this.f20880l;
        InterfaceC5912l interfaceC5912l = (InterfaceC5912l) obj;
        switch (i) {
            case 0:
                function1.invoke();
                if (function0 != null ? ((Boolean) function0.invoke()).booleanValue() : true) {
                    interfaceC5912l.close();
                }
                break;
            default:
                function1.invoke();
                if (function0 != null ? ((Boolean) function0.invoke()).booleanValue() : true) {
                    interfaceC5912l.close();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
