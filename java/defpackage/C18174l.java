package defpackage;

import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l٘ۙۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18174l extends AbstractC4901l implements InterfaceC17477l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C2278l f35587l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int f35588l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C10038l f35589l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C12544l f35590l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C4763l f35591l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C12875l f35592l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C5509l f35593l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C0177l f35594l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C15284l f35595l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C10038l f35596l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final boolean f35597l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final int f35598l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final InterfaceC17477l f35599l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C8688l f35600l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final AbstractC6107l f35601l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C2252l f35602l;

    static {
        AbstractC8669l.m2407import(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Illegal instructions before constructor call */
    public C18174l(C10038l c10038l, InterfaceC8371l interfaceC8371l, C12875l c12875l, InterfaceC17477l interfaceC17477l) {
        C7757l c7757l = (C7757l) c10038l.f20463l;
        super(c7757l.yandex, interfaceC8371l, c12875l.purchase(), c7757l.isPro.startapp(c12875l));
        this.f35589l = c10038l;
        this.f35592l = c12875l;
        this.f35599l = interfaceC17477l;
        int i = 4;
        C10038l c10038lBilling = AbstractC14460l.billing(c10038l, this, c12875l, 4);
        this.f35596l = c10038lBilling;
        C7757l c7757l2 = (C7757l) c10038lBilling.f20463l;
        C16412l c16412l = c7757l2.yandex;
        c7757l2.mopub.getClass();
        this.f35600l = new C8688l(new C5145l(this, 0));
        Class cls = c12875l.yandex;
        int i2 = 1;
        this.f35598l = cls.isAnnotation() ? 5 : cls.isInterface() ? 2 : cls.isEnum() ? 3 : 1;
        if (cls.isAnnotation() || cls.isEnum()) {
            i = 1;
        } else {
            boolean zAdmob = c12875l.admob();
            boolean z = c12875l.admob() || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean zIsFinal = Modifier.isFinal(cls.getModifiers());
            if (zAdmob) {
                i = 2;
            } else if (!z) {
                if (zIsFinal) {
                    i = 1;
                } else {
                    i = 3;
                }
            }
        }
        this.f35588l = i;
        int modifiers = cls.getModifiers();
        this.f35601l = Modifier.isPublic(modifiers) ? C13429l.f26345l : Modifier.isPrivate(modifiers) ? C13429l.f26347l : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C13429l.f26341l : C13429l.f26349l : C13429l.f26346l;
        Class<?> declaringClass = cls.getDeclaringClass();
        this.f35597l = ((declaringClass != null ? new C12875l(declaringClass) : null) == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        this.f35593l = new C5509l(this);
        C15284l c15284l = new C15284l(c10038lBilling, this, c12875l, interfaceC17477l != null, null);
        this.f35595l = c15284l;
        C6565l c6565l = C2252l.amazon;
        ((C5215l) c7757l2.Signature).getClass();
        C6238l c6238l = new C6238l(22, this);
        c6565l.getClass();
        this.f35602l = new C2252l(this, c16412l, c6238l);
        this.f35594l = new C0177l(c15284l);
        this.f35591l = new C4763l(c10038lBilling, c12875l, this);
        this.f35590l = AbstractC12081l.billing(c10038lBilling, c12875l);
        C5145l c5145l = new C5145l(this, i2);
        c16412l.getClass();
        this.f35587l = new C2278l(c16412l, c5145l);
    }

    @Override // defpackage.InterfaceC17477l
    public final Collection adcel() {
        return (List) this.f35595l.adcel.invoke();
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC5436l, defpackage.InterfaceC10389l
    public final C6561l admob() {
        C6561l c6561l = AbstractC6004l.yandex;
        AbstractC6107l abstractC6107l = this.f35601l;
        if (AbstractC8576l.yandex(abstractC6107l, c6561l)) {
            Class<?> declaringClass = this.f35592l.yandex.getDeclaringClass();
            if ((declaringClass != null ? new C12875l(declaringClass) : null) == null) {
                return AbstractC8009l.yandex;
            }
        }
        return AbstractC15901l.subs(abstractC6107l);
    }

    @Override // defpackage.InterfaceC17477l
    public final boolean ads() {
        return false;
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: case */
    public final boolean mo750case() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: final */
    public final C5786l mo751final() {
        return null;
    }

    @Override // defpackage.InterfaceC2853l
    public final InterfaceC3841l getAnnotations() {
        return this.f35590l;
    }

    public final C15284l inmobi() {
        return (C15284l) super.mo2890l();
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC10607l
    public final List isVip() {
        return (List) this.f35587l.invoke();
    }

    @Override // defpackage.AbstractC10170l, defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final InterfaceC7637l mo2890l() {
        return (C15284l) super.mo2890l();
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final int mo752l() {
        return this.f35598l;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lؘِٞ */
    public final AbstractC5645l mo753l() {
        return null;
    }

    @Override // defpackage.AbstractC10170l, defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lؘْؒ */
    public final InterfaceC7637l mo2893l() {
        return this.f35594l;
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: lٕٕۤ */
    public final boolean mo754l() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lْٗٔ */
    public final boolean mo755l() {
        return false;
    }

    @Override // defpackage.InterfaceC15234l
    public final InterfaceC1925l metrica() {
        return this.f35593l;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: new */
    public final InterfaceC7637l mo756new() {
        return this.f35591l;
    }

    @Override // defpackage.AbstractC11832l
    public final InterfaceC7637l pro(C14945l c14945l) {
        C2252l c2252l = this.f35602l;
        AbstractC10170l abstractC10170l = c2252l.yandex;
        int i = AbstractC3759l.yandex;
        AbstractC11125l.crashlytics(abstractC10170l);
        C2278l c2278l = c2252l.crashlytics;
        InterfaceC13922l interfaceC13922l = C2252l.purchase[0];
        return (C15284l) ((InterfaceC7637l) c2278l.invoke());
    }

    @Override // defpackage.InterfaceC17477l
    public final boolean purchase() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC5436l
    public final int startapp() {
        return this.f35588l;
    }

    @Override // defpackage.InterfaceC10607l
    public final boolean subscription() {
        return this.f35597l;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: throws */
    public final boolean mo757throws() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Lazy Java class ");
        int i = AbstractC3759l.yandex;
        sb.append(AbstractC11125l.billing(this));
        return sb.toString();
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: volatile */
    public final boolean mo758volatile() {
        return false;
    }
}
