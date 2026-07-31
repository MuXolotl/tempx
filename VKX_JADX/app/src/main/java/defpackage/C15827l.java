package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕٝۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15827l implements InterfaceC0084l {
    public final C9336l yandex;

    public C15827l(C9336l c9336l) {
        this.yandex = c9336l;
    }

    @Override // defpackage.InterfaceC12001l
    public final boolean admob(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }

    @Override // defpackage.InterfaceC12001l
    public final /* synthetic */ InterfaceC12001l billing(InterfaceC12001l interfaceC12001l) {
        return AbstractC2812l.crashlytics(this, interfaceC12001l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15827l) && this.yandex == ((C15827l) obj).yandex;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    @Override // defpackage.InterfaceC12001l
    public final boolean mopub(C2613l c2613l) {
        return ((Boolean) c2613l.invoke(this)).booleanValue();
    }

    @Override // defpackage.InterfaceC12001l
    public final Object purchase(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public final String toString() {
        return "SemanticsModifier(configuration=" + this.yandex + ')';
    }
}
