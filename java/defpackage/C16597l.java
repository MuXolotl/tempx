package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٖۘٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16597l extends AbstractC15211l implements InterfaceC13340l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C2314l f32570l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f32571l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f32572l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C16017l f32573l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AbstractC14318l f32574l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f32575l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C16597l(int i, C2314l c2314l, AbstractC14318l abstractC14318l, C16017l c16017l, boolean z, int i2) {
        if ((i2 & 8) != 0) {
            C16017l.f31395l.getClass();
            c16017l = C16017l.f31394l;
        }
        this(i, c2314l, abstractC14318l, c16017l, (i2 & 16) != 0 ? false : z, false);
    }

    @Override // defpackage.AbstractC15211l
    /* JADX INFO: renamed from: implements */
    public final AbstractC15211l mo8static(boolean z) {
        return new C16597l(this.f32572l, this.f32570l, this.f32574l, this.f32573l, z, 32);
    }

    @Override // defpackage.AbstractC18041l
    public final List inmobi() {
        return C2580l.f5619l;
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: lؒۢۜ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C16597l mo1else(C14945l c14945l) {
        C2314l c2314l = this.f32570l;
        AbstractC4946l abstractC4946lAmazon = c2314l.f5025l.amazon(c14945l);
        C11239l c11239l = c2314l.f5024l != null ? new C11239l(c2314l, c14945l, 12) : null;
        C2314l c2314l2 = c2314l.f5023l;
        if (c2314l2 == null) {
            c2314l2 = c2314l;
        }
        C2314l c2314l3 = new C2314l(abstractC4946lAmazon, c11239l, c2314l2, c2314l.f5027l);
        AbstractC14318l abstractC14318l = this.f32574l;
        return new C16597l(this.f32572l, c2314l3, abstractC14318l != null ? abstractC14318l : null, this.f32573l, this.f32575l, 32);
    }

    @Override // defpackage.AbstractC15211l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final AbstractC15211l mo686abstract(C16017l c16017l) {
        return new C16597l(this.f32572l, this.f32570l, this.f32574l, c16017l, this.f32575l, this.f32571l);
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: native */
    public final InterfaceC1925l mo1339native() {
        return this.f32570l;
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: package */
    public final C16017l mo1340package() {
        return this.f32573l;
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: public */
    public final InterfaceC7637l mo1341public() {
        return C8741l.yandex(1, true, new String[0]);
    }

    @Override // defpackage.AbstractC15211l, defpackage.AbstractC14318l
    /* JADX INFO: renamed from: static */
    public final AbstractC14318l mo8static(boolean z) {
        return new C16597l(this.f32572l, this.f32570l, this.f32574l, this.f32573l, z, 32);
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: throw */
    public final boolean mo1342throw() {
        return this.f32575l;
    }

    public C16597l(int i, C2314l c2314l, AbstractC14318l abstractC14318l, C16017l c16017l, boolean z, boolean z2) {
        this.f32572l = i;
        this.f32570l = c2314l;
        this.f32574l = abstractC14318l;
        this.f32573l = c16017l;
        this.f32575l = z;
        this.f32571l = z2;
    }
}
