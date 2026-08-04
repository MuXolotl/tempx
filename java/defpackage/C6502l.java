package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: lؙٖٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6502l implements InterfaceC11766l, Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public volatile transient boolean f13576l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC11766l f13577l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final transient Object f13578l = new Object();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public transient Object f13579l;

    public C6502l(InterfaceC11766l interfaceC11766l) {
        interfaceC11766l.getClass();
        this.f13577l = interfaceC11766l;
    }

    @Override // defpackage.InterfaceC11766l
    public final Object get() {
        if (!this.f13576l) {
            synchronized (this.f13578l) {
                try {
                    if (!this.f13576l) {
                        Object obj = this.f13577l.get();
                        this.f13579l = obj;
                        this.f13576l = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f13579l;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f13576l) {
            obj = "<supplier that returned " + this.f13579l + ">";
        } else {
            obj = this.f13577l;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
