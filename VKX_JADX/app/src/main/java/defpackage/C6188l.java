package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙؒؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6188l implements InterfaceC13112l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17955l f13053l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13054l;

    public /* synthetic */ C6188l(InterfaceC17955l interfaceC17955l, int i) {
        this.f13054l = i;
        this.f13053l = interfaceC17955l;
    }

    @Override // defpackage.InterfaceC17242l
    public final /* synthetic */ InterfaceC17242l premium(InterfaceC17242l interfaceC17242l) {
        int i = this.f13054l;
        return AbstractC15560l.admob(this, interfaceC17242l);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // defpackage.InterfaceC17242l
    /* JADX INFO: renamed from: protected */
    public final boolean mo1539protected(Function1 function1) {
        switch (this.f13054l) {
        }
        return ((Boolean) function1.invoke(this)).booleanValue();
    }

    @Override // defpackage.InterfaceC17242l
    public final Object purchase(Object obj, Function2 function2) {
        switch (this.f13054l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return function2.invoke(obj, this);
    }
}
