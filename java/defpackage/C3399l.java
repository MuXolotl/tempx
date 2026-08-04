package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؕٔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3399l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C1759l f7241l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AtomicReference f7242l = new AtomicReference(null);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f7243l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f7244l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f7245l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ AtomicReference f7246l;

    public C3399l(InterfaceC2262l interfaceC2262l, C1759l c1759l, InterfaceC2262l interfaceC2262l2, Function2 function2, AtomicReference atomicReference) {
        this.f7241l = c1759l;
        this.f7245l = interfaceC2262l2;
        this.f7244l = function2;
        this.f7246l = atomicReference;
        this.f7243l = interfaceC2262l;
    }

    public final void loadAd(long j) {
        if (C9658l.amazon(j) <= 0) {
            AbstractC11990l.billing(this.f7245l, new C13277l("Timed out immediately", this.f7244l.hashCode()));
            return;
        }
        if (C9658l.crashlytics(yandex(), j) < 0) {
            return;
        }
        this.f7241l.getClass();
        this.f7242l.set(Long.valueOf(C9658l.amazon(j) + System.currentTimeMillis()));
        C1759l c1759l = this.f7241l;
        InterfaceC2262l interfaceC2262l = this.f7245l;
        InterfaceC7042l interfaceC7042l = (InterfaceC7042l) this.f7246l.getAndSet(AbstractC10999l.mopub(interfaceC2262l, null, 0, new C8036l(this, c1759l, interfaceC2262l, this.f7244l, null, 10), 3));
        if (interfaceC7042l != null) {
            interfaceC7042l.ads(null);
        }
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f7243l.vip();
    }

    public final long yandex() {
        Long l = (Long) this.f7242l.get();
        if (l == null) {
            C6760l c6760l = C9658l.f19699l;
            return C9658l.f19698l;
        }
        long jLongValue = l.longValue();
        this.f7241l.getClass();
        long jCurrentTimeMillis = jLongValue - System.currentTimeMillis();
        C6760l c6760l2 = C9658l.f19699l;
        return AbstractC15918l.Signature(jCurrentTimeMillis, EnumC16636l.MILLISECONDS);
    }
}
