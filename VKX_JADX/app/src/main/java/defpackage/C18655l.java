package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lۣؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18655l extends AbstractC15211l implements InterfaceC13340l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C14811l f36435l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC4946l f36436l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C16017l f36437l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f36438l;

    public C18655l(AbstractC4946l abstractC4946l, C14811l c14811l, boolean z, C16017l c16017l) {
        this.f36436l = abstractC4946l;
        this.f36435l = c14811l;
        this.f36438l = z;
        this.f36437l = c16017l;
    }

    @Override // defpackage.AbstractC14318l
    /* JADX INFO: renamed from: default */
    public final AbstractC14318l mo1else(C14945l c14945l) {
        return new C18655l(this.f36436l.amazon(c14945l), this.f36435l, this.f36438l, this.f36437l);
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: else */
    public final AbstractC18041l mo1else(C14945l c14945l) {
        return new C18655l(this.f36436l.amazon(c14945l), this.f36435l, this.f36438l, this.f36437l);
    }

    @Override // defpackage.AbstractC15211l
    /* JADX INFO: renamed from: implements */
    public final AbstractC15211l mo8static(boolean z) {
        if (z == this.f36438l) {
            return this;
        }
        return new C18655l(this.f36436l, this.f36435l, z, this.f36437l);
    }

    @Override // defpackage.AbstractC18041l
    public final List inmobi() {
        return C2580l.f5619l;
    }

    @Override // defpackage.AbstractC15211l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final AbstractC15211l mo686abstract(C16017l c16017l) {
        return new C18655l(this.f36436l, this.f36435l, this.f36438l, c16017l);
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: native */
    public final InterfaceC1925l mo1339native() {
        return this.f36435l;
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: package */
    public final C16017l mo1340package() {
        return this.f36437l;
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: public */
    public final InterfaceC7637l mo1341public() {
        return C8741l.yandex(1, true, new String[0]);
    }

    @Override // defpackage.AbstractC15211l, defpackage.AbstractC14318l
    /* JADX INFO: renamed from: static */
    public final AbstractC14318l mo8static(boolean z) {
        if (z == this.f36438l) {
            return this;
        }
        return new C18655l(this.f36436l, this.f36435l, z, this.f36437l);
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: throw */
    public final boolean mo1342throw() {
        return this.f36438l;
    }

    @Override // defpackage.AbstractC15211l
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.f36436l);
        sb.append(')');
        sb.append(this.f36438l ? "?" : "");
        return sb.toString();
    }
}
