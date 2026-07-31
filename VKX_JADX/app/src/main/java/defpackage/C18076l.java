package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l٘ٝۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18076l extends AbstractC15211l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final List f35365l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC1925l f35366l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC7637l f35367l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f35368l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Function1 f35369l;

    public C18076l(InterfaceC1925l interfaceC1925l, List list, boolean z, InterfaceC7637l interfaceC7637l, Function1 function1) {
        this.f35366l = interfaceC1925l;
        this.f35365l = list;
        this.f35368l = z;
        this.f35367l = interfaceC7637l;
        this.f35369l = function1;
        if (!(interfaceC7637l instanceof C7662l) || (interfaceC7637l instanceof C0781l)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + interfaceC7637l + '\n' + interfaceC1925l);
    }

    @Override // defpackage.AbstractC14318l
    /* JADX INFO: renamed from: default */
    public final AbstractC14318l mo1else(C14945l c14945l) {
        AbstractC15211l abstractC15211l = (AbstractC15211l) this.f35369l.invoke(c14945l);
        return abstractC15211l == null ? this : abstractC15211l;
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: else */
    public final AbstractC18041l mo1else(C14945l c14945l) {
        AbstractC15211l abstractC15211l = (AbstractC15211l) this.f35369l.invoke(c14945l);
        return abstractC15211l == null ? this : abstractC15211l;
    }

    @Override // defpackage.AbstractC15211l
    /* JADX INFO: renamed from: implements */
    public final AbstractC15211l mo8static(boolean z) {
        if (z == this.f35368l) {
            return this;
        }
        return z ? new C8636l(this, 1) : new C8636l(this, 0);
    }

    @Override // defpackage.AbstractC18041l
    public final List inmobi() {
        return this.f35365l;
    }

    @Override // defpackage.AbstractC15211l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final AbstractC15211l mo686abstract(C16017l c16017l) {
        return c16017l.isEmpty() ? this : new C13764l(this, c16017l);
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: native */
    public final InterfaceC1925l mo1339native() {
        return this.f35366l;
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: package */
    public final C16017l mo1340package() {
        C16017l.f31395l.getClass();
        return C16017l.f31394l;
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: public */
    public final InterfaceC7637l mo1341public() {
        return this.f35367l;
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: throw */
    public final boolean mo1342throw() {
        return this.f35368l;
    }
}
