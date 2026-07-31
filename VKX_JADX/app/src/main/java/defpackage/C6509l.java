package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6509l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f13581l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13582l;

    public /* synthetic */ C6509l(int i, Function2 function2) {
        this.f13582l = i;
        this.f13581l = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f13582l;
        Function2 function2 = this.f13581l;
        switch (i) {
            case 0:
                C2234l c2234l = (C2234l) ((InterfaceC11641l) obj);
                c2234l.f4916l.add(function2);
                c2234l.f4919l = null;
                break;
            default:
                C14734l c14734l = (C14734l) obj;
                function2.invoke(c14734l.purchase.getValue(), AbstractC3483l.purchase.loadAd.invoke(c14734l.billing));
                break;
        }
        return Unit.INSTANCE;
    }
}
