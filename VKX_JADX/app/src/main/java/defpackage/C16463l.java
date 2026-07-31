package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lٖٙۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16463l implements InterfaceC14029l, InterfaceC1840l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f32186l = AtomicReferenceFieldUpdater.newUpdater(C16463l.class, Object.class, "result");

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC14029l f32187l;
    private volatile Object result;

    public C16463l(InterfaceC14029l interfaceC14029l, EnumC9342l enumC9342l) {
        this.f32187l = interfaceC14029l;
        this.result = enumC9342l;
    }

    @Override // defpackage.InterfaceC1840l
    public final InterfaceC1840l admob() {
        InterfaceC14029l interfaceC14029l = this.f32187l;
        if (interfaceC14029l instanceof InterfaceC1840l) {
            return (InterfaceC1840l) interfaceC14029l;
        }
        return null;
    }

    public final Object loadAd() {
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        Object obj = this.result;
        EnumC9342l enumC9342l2 = EnumC9342l.f19164l;
        if (obj == enumC9342l2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32186l;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC9342l2, enumC9342l)) {
                if (atomicReferenceFieldUpdater.get(this) != enumC9342l2) {
                    obj = this.result;
                }
            }
            return enumC9342l;
        }
        if (obj == EnumC9342l.f19163l) {
            return enumC9342l;
        }
        if (obj instanceof C18435l) {
            throw ((C18435l) obj).f36003l;
        }
        return obj;
    }

    @Override // defpackage.InterfaceC14029l
    public final InterfaceC12932l metrica() {
        return this.f32187l.metrica();
    }

    @Override // defpackage.InterfaceC14029l
    public final void subs(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC9342l enumC9342l = EnumC9342l.f19164l;
            if (obj2 == enumC9342l) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32186l;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC9342l, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC9342l) {
                    }
                }
                return;
            }
            EnumC9342l enumC9342l2 = EnumC9342l.f19165l;
            if (obj2 != enumC9342l2) {
                C8339l.smaato("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f32186l;
            EnumC9342l enumC9342l3 = EnumC9342l.f19163l;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, enumC9342l2, enumC9342l3)) {
                    this.f32187l.subs(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == enumC9342l2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f32187l;
    }
}
