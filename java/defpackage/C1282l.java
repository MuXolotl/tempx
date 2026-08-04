package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lؙؒۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1282l extends AbstractC12655l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Object f3331l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f3332l = 1;

    public C1282l(InterfaceC11792l interfaceC11792l, C15629l c15629l) {
        super(interfaceC11792l);
        this.f3331l = new WeakReference(c15629l);
        yandex(new C6986l(0, this));
    }

    @Override // defpackage.AbstractC12655l, java.lang.AutoCloseable
    public void close() throws Exception {
        switch (this.f3332l) {
            case 1:
                if (!((AtomicBoolean) this.f3331l).getAndSet(true)) {
                    super.close();
                }
                break;
            default:
                super.close();
                break;
        }
    }

    public C1282l(InterfaceC11792l interfaceC11792l) {
        super(interfaceC11792l);
        this.f3331l = new AtomicBoolean(false);
    }
}
