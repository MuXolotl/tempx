package defpackage;

/* JADX INFO: renamed from: lٖۖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16560l extends AbstractC3376l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f32508l;

    public C16560l(String str) {
        this.f32508l = str;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX INFO: renamed from: lْۥٞ, reason: contains not printable characters */
    public static /* synthetic */ void m4185l(int i) {
        String str = (i == 1 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        } else if (i == 2) {
            objArr[0] = "delegate";
        } else if (i == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i != 4) {
            objArr[0] = "newAttributes";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        }
        if (i == 1) {
            objArr[1] = "toString";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        } else {
            objArr[1] = "refine";
        }
        if (i != 1) {
            if (i == 2) {
                objArr[2] = "replaceDelegate";
            } else if (i == 3) {
                objArr[2] = "refine";
            } else if (i != 4) {
                objArr[2] = "replaceAttributes";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.AbstractC15211l, defpackage.AbstractC14318l
    /* JADX INFO: renamed from: abstract */
    public final /* bridge */ /* synthetic */ AbstractC14318l mo686abstract(C16017l c16017l) {
        mo686abstract(c16017l);
        throw null;
    }

    @Override // defpackage.AbstractC3376l, defpackage.AbstractC14318l
    /* JADX INFO: renamed from: default */
    public final AbstractC14318l mo1else(C14945l c14945l) {
        if (c14945l != null) {
            return this;
        }
        m4185l(3);
        throw null;
    }

    @Override // defpackage.AbstractC3376l, defpackage.AbstractC18041l
    /* JADX INFO: renamed from: else */
    public final AbstractC18041l mo1else(C14945l c14945l) {
        if (c14945l != null) {
            return this;
        }
        m4185l(3);
        throw null;
    }

    @Override // defpackage.AbstractC15211l
    /* JADX INFO: renamed from: implements */
    public final AbstractC15211l mo8static(boolean z) {
        throw new IllegalStateException(this.f32508l);
    }

    @Override // defpackage.AbstractC3376l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final AbstractC15211l mo3l() {
        throw new IllegalStateException(this.f32508l);
    }

    @Override // defpackage.AbstractC15211l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final AbstractC15211l mo686abstract(C16017l c16017l) {
        if (c16017l != null) {
            throw new IllegalStateException(this.f32508l);
        }
        m4185l(0);
        throw null;
    }

    @Override // defpackage.AbstractC3376l
    /* JADX INFO: renamed from: lٍٔ۠ */
    public final AbstractC15211l mo0default(C14945l c14945l) {
        if (c14945l != null) {
            return this;
        }
        m4185l(3);
        throw null;
    }

    @Override // defpackage.AbstractC3376l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final AbstractC3376l mo7l(AbstractC15211l abstractC15211l) {
        throw new IllegalStateException(this.f32508l);
    }

    @Override // defpackage.AbstractC15211l, defpackage.AbstractC14318l
    /* JADX INFO: renamed from: static */
    public final /* bridge */ /* synthetic */ AbstractC14318l mo8static(boolean z) {
        mo8static(z);
        throw null;
    }

    @Override // defpackage.AbstractC15211l
    public final String toString() {
        return this.f32508l;
    }
}
