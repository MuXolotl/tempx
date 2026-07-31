package defpackage;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lَۙۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10545l implements InterfaceC2262l, Closeable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21454l = AtomicIntegerFieldUpdater.newUpdater(AbstractC10545l.class, "closed");

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21455l = AtomicIntegerFieldUpdater.newUpdater(AbstractC10545l.class, "clientRefCount$internal");

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C8688l f21456l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C8688l f21457l;
    private volatile /* synthetic */ int closed = 0;
    public volatile /* synthetic */ int clientRefCount$internal = 0;

    public AbstractC10545l() {
        final int i = 0;
        this.f21457l = new C8688l(new Function0(this) { // from class: lُْؑ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC10545l f1236l;

            {
                this.f1236l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AbstractC10545l abstractC10545l = this.f1236l;
                switch (i2) {
                    case 0:
                        ((C2885l) abstractC10545l).f6284l.getClass();
                        C16552l c16552l = AbstractC11463l.yandex;
                        return ExecutorC6708l.f14063l;
                    default:
                        return AbstractC10586l.billing(new C2993l(null), new C16989l(C13772l.f26879l, 0)).mo246l((AbstractC1872l) abstractC10545l.f21457l.getValue()).mo246l(new C0499l("ktor-okhttp-context"));
                }
            }
        });
        final int i2 = 1;
        this.f21456l = new C8688l(new Function0(this) { // from class: lُْؑ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC10545l f1236l;

            {
                this.f1236l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                AbstractC10545l abstractC10545l = this.f1236l;
                switch (i3) {
                    case 0:
                        ((C2885l) abstractC10545l).f6284l.getClass();
                        C16552l c16552l = AbstractC11463l.yandex;
                        return ExecutorC6708l.f14063l;
                    default:
                        return AbstractC10586l.billing(new C2993l(null), new C16989l(C13772l.f26879l, 0)).mo246l((AbstractC1872l) abstractC10545l.f21457l.getValue()).mo246l(new C0499l("ktor-okhttp-context"));
                }
            }
        });
    }

    public void close() {
        if (f21454l.compareAndSet(this, 0, 1)) {
            InterfaceC5763l interfaceC5763lMo245l = vip().mo245l(C1083l.f2996l);
            C0462l c0462l = interfaceC5763lMo245l instanceof C0462l ? (C0462l) interfaceC5763lMo245l : null;
            if (c0462l == null) {
                return;
            }
            c0462l.m561l();
        }
    }

    @Override // defpackage.InterfaceC2262l
    public InterfaceC12932l vip() {
        return (InterfaceC12932l) this.f21456l.getValue();
    }
}
