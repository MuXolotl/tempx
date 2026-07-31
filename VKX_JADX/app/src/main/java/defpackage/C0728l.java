package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: renamed from: lؑۧۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0728l extends AbstractC13821l {
    public final /* synthetic */ C18338l billing;
    public final /* synthetic */ InterfaceC7476l purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0728l(String str, InterfaceC7476l interfaceC7476l, C18338l c18338l) {
        super(str, true);
        this.purchase = interfaceC7476l;
        this.billing = c18338l;
    }

    @Override // defpackage.AbstractC13821l
    public final long yandex() throws InterruptedException {
        C3329l c3329l;
        InterfaceC7476l interfaceC7476l = this.purchase;
        try {
            c3329l = interfaceC7476l.amazon();
        } catch (Throwable th) {
            c3329l = new C3329l(interfaceC7476l, null, th, 2);
        }
        C18338l c18338l = this.billing;
        if (!((CopyOnWriteArrayList) c18338l.f35850l).contains(interfaceC7476l)) {
            return -1L;
        }
        ((LinkedBlockingDeque) c18338l.f35849l).put(c3329l);
        return -1L;
    }
}
