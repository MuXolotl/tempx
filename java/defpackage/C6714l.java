package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lؙۙ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6714l implements InterfaceC11075l {
    public final AtomicReference yandex;

    public C6714l(InterfaceC11075l interfaceC11075l) {
        this.yandex = new AtomicReference(interfaceC11075l);
    }

    @Override // defpackage.InterfaceC11075l
    public final Iterator iterator() {
        InterfaceC11075l interfaceC11075l = (InterfaceC11075l) this.yandex.getAndSet(null);
        if (interfaceC11075l != null) {
            return interfaceC11075l.iterator();
        }
        C8339l.smaato("This sequence can be consumed only once.");
        return null;
    }
}
