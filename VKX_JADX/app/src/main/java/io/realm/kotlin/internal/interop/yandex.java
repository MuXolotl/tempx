package io.realm.kotlin.internal.interop;

import defpackage.AbstractC2829l;
import defpackage.AbstractC5563l;
import defpackage.AbstractC9795l;
import defpackage.C10483l;
import defpackage.InterfaceC14029l;
import defpackage.InterfaceC2262l;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class yandex extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ JVMScheduler f843l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ long f844l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yandex(JVMScheduler jVMScheduler, long j, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f843l = jVMScheduler;
        this.f844l = j;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        AbstractC2829l.crashlytics(obj);
        C10483l lock = this.f843l.getLock();
        JVMScheduler jVMScheduler = this.f843l;
        long j = this.f844l;
        synchronized (lock) {
            if (!jVMScheduler.getCancelled()) {
                int i = AbstractC9795l.yandex;
                realmcJNI.invoke_core_notify_callback(j);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new yandex(this.f843l, this.f844l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((yandex) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
