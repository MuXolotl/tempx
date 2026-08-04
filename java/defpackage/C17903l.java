package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: lٌ٘ٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17903l extends AbstractC13762l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final AbstractC14868l f34856l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Thread f34857l;

    public C17903l(InterfaceC12932l interfaceC12932l, Thread thread, AbstractC14868l abstractC14868l) {
        super(interfaceC12932l, true);
        this.f34857l = thread;
        this.f34856l = abstractC14868l;
    }

    @Override // defpackage.C14750l
    public final void purchase(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f34857l;
        if (AbstractC8576l.yandex(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
