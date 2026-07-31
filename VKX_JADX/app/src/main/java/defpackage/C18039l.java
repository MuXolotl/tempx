package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: l٘ٛۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18039l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f35330l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35331l = 0;

    public /* synthetic */ C18039l(int i, Function1 function1) {
        this.f35330l = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f35331l) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(24583);
                AbstractC2991l.loadAd(this.f35330l, (C6956l) obj, iPurchase);
                break;
            default:
                this.f35330l.invoke(obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C18039l(Function1 function1) {
        this.f35330l = function1;
    }
}
