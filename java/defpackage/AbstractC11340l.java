package defpackage;

/* JADX INFO: renamed from: lُؚۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11340l extends AbstractC14971l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public AbstractC14971l f22875l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final int f22876l = AbstractC3068l.purchase(this);

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙؔؑ, reason: contains not printable characters */
    public final void mo3065l() {
        for (AbstractC14971l abstractC14971l = this.f22875l; abstractC14971l != null; abstractC14971l = abstractC14971l.f29460l) {
            abstractC14971l.mo3065l();
        }
        super.mo3065l();
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lٖؖ۠, reason: contains not printable characters */
    public final void mo3066l() {
        for (AbstractC14971l abstractC14971l = this.f22875l; abstractC14971l != null; abstractC14971l = abstractC14971l.f29460l) {
            abstractC14971l.mo3066l();
        }
        super.mo3066l();
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؗۨؑ, reason: contains not printable characters */
    public final void mo3067l() {
        super.mo3067l();
        for (AbstractC14971l abstractC14971l = this.f22875l; abstractC14971l != null; abstractC14971l = abstractC14971l.f29460l) {
            abstractC14971l.mo3067l();
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lٍؘؘ, reason: contains not printable characters */
    public final void mo3068l() {
        super.mo3068l();
        for (AbstractC14971l abstractC14971l = this.f22875l; abstractC14971l != null; abstractC14971l = abstractC14971l.f29460l) {
            abstractC14971l.mo3068l();
        }
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final InterfaceC8605l m3069l(InterfaceC8605l interfaceC8605l) {
        AbstractC14971l abstractC14971l = ((AbstractC14971l) interfaceC8605l).f29454l;
        if (abstractC14971l != interfaceC8605l) {
            AbstractC14971l abstractC14971l2 = interfaceC8605l instanceof AbstractC14971l ? (AbstractC14971l) interfaceC8605l : null;
            AbstractC14971l abstractC14971l3 = abstractC14971l2 != null ? abstractC14971l2.f29456l : null;
            if (abstractC14971l != this.f29454l || !AbstractC8576l.yandex(abstractC14971l3, this)) {
                C8339l.smaato("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (abstractC14971l.f29462l) {
                AbstractC0081l.crashlytics("Cannot delegate to an already attached node");
            }
            abstractC14971l.mo3074l(this.f29454l);
            int i = this.f29450l;
            int iBilling = AbstractC3068l.billing(abstractC14971l);
            abstractC14971l.f29450l = iBilling;
            int i2 = this.f29450l;
            int i3 = iBilling & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof InterfaceC7150l)) {
                AbstractC0081l.crashlytics("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + abstractC14971l);
            }
            abstractC14971l.f29460l = this.f22875l;
            this.f22875l = abstractC14971l;
            abstractC14971l.f29456l = this;
            m3071l(iBilling | this.f29450l, false);
            if (this.f29462l) {
                if (i3 == 0 || (i & 2) != 0) {
                    mo3072l(this.f29452l);
                } else {
                    C18289l c18289l = AbstractC5573l.metrica(this).f7703l;
                    this.f29454l.mo3072l(null);
                    c18289l.firebase();
                }
                abstractC14971l.mo3070l();
                abstractC14971l.mo3066l();
                if (!abstractC14971l.f29462l) {
                    AbstractC0081l.crashlytics("autoInvalidateInsertedNode called on unattached node");
                }
                AbstractC3068l.yandex(abstractC14971l, -1, 1);
            }
        }
        return interfaceC8605l;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙ۟ٙ, reason: contains not printable characters */
    public final void mo3070l() {
        super.mo3070l();
        for (AbstractC14971l abstractC14971l = this.f22875l; abstractC14971l != null; abstractC14971l = abstractC14971l.f29460l) {
            abstractC14971l.mo3072l(this.f29452l);
            if (!abstractC14971l.f29462l) {
                abstractC14971l.mo3070l();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r2v2, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public final void m3071l(int i, boolean z) {
        AbstractC14971l abstractC14971l;
        int i2 = this.f29450l;
        this.f29450l = i;
        if (i2 != i) {
            AbstractC14971l abstractC14971l2 = this.f29454l;
            if (abstractC14971l2 == this) {
                this.f29457l = i;
            }
            boolean z2 = this.f29462l;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.f29450l;
                    r2.f29450l = i;
                    if (r2 == abstractC14971l2) {
                        break;
                    } else {
                        r2 = r2.f29456l;
                    }
                }
                if (z && r2 == abstractC14971l2) {
                    i = AbstractC3068l.billing(abstractC14971l2);
                    abstractC14971l2.f29450l = i;
                }
                int i3 = i | ((r2 == 0 || (abstractC14971l = r2.f29460l) == null) ? 0 : abstractC14971l.f29457l);
                for (?? r3 = r2; r3 != 0; r3 = r3.f29456l) {
                    i3 |= r3.f29450l;
                    r3.f29457l = i3;
                }
            }
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lٖۥۡ, reason: contains not printable characters */
    public final void mo3072l(AbstractC18026l abstractC18026l) {
        this.f29452l = abstractC18026l;
        for (AbstractC14971l abstractC14971l = this.f22875l; abstractC14971l != null; abstractC14971l = abstractC14971l.f29460l) {
            abstractC14971l.mo3072l(abstractC18026l);
        }
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public final void m3073l(InterfaceC8605l interfaceC8605l) {
        AbstractC14971l abstractC14971l = null;
        for (AbstractC14971l abstractC14971l2 = this.f22875l; abstractC14971l2 != null; abstractC14971l2 = abstractC14971l2.f29460l) {
            if (abstractC14971l2 == interfaceC8605l) {
                boolean z = abstractC14971l2.f29462l;
                if (z) {
                    C7661l c7661l = AbstractC3068l.yandex;
                    if (!z) {
                        AbstractC0081l.crashlytics("autoInvalidateRemovedNode called on unattached node");
                    }
                    AbstractC3068l.yandex(abstractC14971l2, -1, 2);
                    abstractC14971l2.mo3068l();
                    abstractC14971l2.mo3065l();
                }
                abstractC14971l2.mo3074l(abstractC14971l2);
                abstractC14971l2.f29457l = 0;
                AbstractC14971l abstractC14971l3 = abstractC14971l2.f29460l;
                if (abstractC14971l == null) {
                    this.f22875l = abstractC14971l3;
                } else {
                    abstractC14971l.f29460l = abstractC14971l3;
                }
                abstractC14971l2.f29460l = null;
                abstractC14971l2.f29456l = null;
                int i = this.f29450l;
                int iBilling = AbstractC3068l.billing(this);
                m3071l(iBilling, true);
                if (this.f29462l && (i & 2) != 0 && (iBilling & 2) == 0) {
                    C18289l c18289l = AbstractC5573l.metrica(this).f7703l;
                    this.f29454l.mo3072l(null);
                    c18289l.firebase();
                    return;
                }
                return;
            }
            abstractC14971l = abstractC14971l2;
        }
        C17132l.metrica(interfaceC8605l, "Could not find delegate: ");
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lْٗٔ, reason: contains not printable characters */
    public final void mo3074l(AbstractC14971l abstractC14971l) {
        this.f29454l = abstractC14971l;
        for (AbstractC14971l abstractC14971l2 = this.f22875l; abstractC14971l2 != null; abstractC14971l2 = abstractC14971l2.f29460l) {
            abstractC14971l2.mo3074l(abstractC14971l);
        }
    }
}
