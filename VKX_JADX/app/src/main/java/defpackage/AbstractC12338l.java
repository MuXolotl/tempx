package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَّؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12338l implements InterfaceC13112l {
    public abstract void admob(AbstractC14971l abstractC14971l);

    public abstract AbstractC14971l loadAd();

    @Override // defpackage.InterfaceC17242l
    public final /* synthetic */ InterfaceC17242l premium(InterfaceC17242l interfaceC17242l) {
        return AbstractC15560l.admob(this, interfaceC17242l);
    }

    @Override // defpackage.InterfaceC17242l
    /* JADX INFO: renamed from: protected */
    public final boolean mo1539protected(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }

    @Override // defpackage.InterfaceC17242l
    public final Object purchase(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
