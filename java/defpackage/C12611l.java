package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّٔ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12611l extends AbstractC16653l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C7119l f24839l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f24840l;

    public C12611l(long j, C12611l c12611l, C7119l c7119l, int i) {
        super(j, c12611l, i);
        this.f24839l = c7119l;
        this.f24840l = new AtomicReferenceArray(AbstractC14503l.loadAd * 2);
    }

    @Override // defpackage.AbstractC16653l
    public final void admob(int i, InterfaceC12932l interfaceC12932l) {
        C7119l c7119l;
        Function1 function1;
        Function1 function2;
        int i2 = AbstractC14503l.loadAd;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        Object obj = this.f24840l.get(i * 2);
        while (true) {
            Object objSmaato = smaato(i);
            boolean z2 = objSmaato instanceof InterfaceC15894l;
            c7119l = this.f24839l;
            if (z2 || (objSmaato instanceof C4399l)) {
                if (firebase(i, objSmaato, z ? AbstractC14503l.isPro : AbstractC14503l.firebase)) {
                    vip(i, null);
                    remoteconfig(i, !z);
                    if (!z || (function1 = c7119l.f14924l) == null) {
                        return;
                    }
                    AbstractC16829l.loadAd(function1, obj, interfaceC12932l);
                    return;
                }
            } else {
                if (objSmaato == AbstractC14503l.isPro || objSmaato == AbstractC14503l.firebase) {
                    break;
                }
                if (objSmaato != AbstractC14503l.mopub && objSmaato != AbstractC14503l.billing) {
                    if (objSmaato == AbstractC14503l.subs || objSmaato == AbstractC14503l.amazon || objSmaato == AbstractC14503l.smaato) {
                        return;
                    }
                    C17132l.metrica(objSmaato, "unexpected state: ");
                    return;
                }
            }
        }
        vip(i, null);
        if (!z || (function2 = c7119l.f14924l) == null) {
            return;
        }
        AbstractC16829l.loadAd(function2, obj, interfaceC12932l);
    }

    public final boolean firebase(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f24840l;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final void metrica(int i, Object obj) {
        this.f24840l.set((i * 2) + 1, obj);
    }

    @Override // defpackage.AbstractC16653l
    public final int mopub() {
        return AbstractC14503l.loadAd;
    }

    public final void remoteconfig(int i, boolean z) {
        if (z) {
            this.f24839l.m2177throw((this.f32620l * ((long) AbstractC14503l.loadAd)) + ((long) i));
        }
        subs();
    }

    public final Object smaato(int i) {
        return this.f24840l.get((i * 2) + 1);
    }

    public final void vip(int i, Object obj) {
        this.f24840l.set(i * 2, obj);
    }
}
