package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* JADX INFO: renamed from: lْٚۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13483l implements InterfaceC9427l, InterfaceC9234l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f26476l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26477l;

    public /* synthetic */ C13483l(int i, Serializable serializable) {
        this.f26477l = i;
        this.f26476l = serializable;
    }

    public final boolean equals(Object obj) {
        switch (this.f26477l) {
            case 0:
                return (obj instanceof InterfaceC9427l) && (obj instanceof InterfaceC9234l) && ((C18731l) this.f26476l) == ((InterfaceC9234l) obj).loadAd();
            default:
                if ((obj instanceof InterfaceC9427l) && (obj instanceof InterfaceC9234l)) {
                    return loadAd().equals(((InterfaceC9234l) obj).loadAd());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f26477l) {
            case 0:
                return ((C18731l) this.f26476l).hashCode();
            default:
                return loadAd().hashCode();
        }
    }

    @Override // defpackage.InterfaceC9427l
    public final Object isPro(Object obj, InterfaceC14029l interfaceC14029l) {
        int i = this.f26477l;
        Serializable serializable = this.f26476l;
        switch (i) {
            case 0:
                return ((C18731l) serializable).invoke(obj, interfaceC14029l);
            default:
                ((AtomicReference) serializable).set((C15067l) obj);
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC9234l
    public final InterfaceC14328l loadAd() {
        int i = this.f26477l;
        Serializable serializable = this.f26476l;
        switch (i) {
            case 0:
                return (C18731l) serializable;
            default:
                return new C2998l(2, 4, AtomicReference.class, (AtomicReference) serializable, "set", "set(Ljava/lang/Object;)V");
        }
    }
}
