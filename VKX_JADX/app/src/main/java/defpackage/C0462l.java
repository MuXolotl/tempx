package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* JADX INFO: renamed from: lؘؑٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C0462l extends C14750l implements InterfaceC7042l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f1695l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:27:0x0043  */
    public C0462l(InterfaceC7042l interfaceC7042l) {
        super(true);
        boolean z = true;
        m3882interface(interfaceC7042l);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C14750l.f28821l;
        InterfaceC4367l interfaceC4367l = (InterfaceC4367l) atomicReferenceFieldUpdater.get(this);
        C10157l c10157l = interfaceC4367l instanceof C10157l ? (C10157l) interfaceC4367l : null;
        if (c10157l == null) {
            z = false;
            break;
        }
        C14750l c14750l = c10157l.f15589l;
        c14750l = c14750l == null ? null : c14750l;
        if (c14750l == null) {
            z = false;
            break;
        }
        while (!c14750l.mo559for()) {
            InterfaceC4367l interfaceC4367l2 = (InterfaceC4367l) atomicReferenceFieldUpdater.get(c14750l);
            C10157l c10157l2 = interfaceC4367l2 instanceof C10157l ? (C10157l) interfaceC4367l2 : null;
            if (c10157l2 != null) {
                c14750l = c10157l2.f15589l;
                if (c14750l == null) {
                    c14750l = null;
                }
                if (c14750l == null) {
                }
            }
            z = false;
        }
        this.f1695l = z;
    }

    @Override // defpackage.C14750l
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final boolean mo558catch() {
        return true;
    }

    @Override // defpackage.C14750l
    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final boolean mo559for() {
        return this.f1695l;
    }

    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public final boolean m560l(Throwable th) {
        return m3885new(new C2175l(th, false));
    }

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public final boolean m561l() {
        return m3885new(Unit.INSTANCE);
    }
}
