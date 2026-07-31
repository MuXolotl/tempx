package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘُ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11100l implements InterfaceC11075l {
    public final Function1 loadAd;
    public final InterfaceC11075l yandex;

    public C11100l(InterfaceC11075l interfaceC11075l, Function1 function1) {
        this.yandex = interfaceC11075l;
        this.loadAd = function1;
    }

    @Override // defpackage.InterfaceC11075l
    public final Iterator iterator() {
        return new C18343l(this);
    }
}
