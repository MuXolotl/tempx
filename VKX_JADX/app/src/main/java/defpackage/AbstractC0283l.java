package defpackage;

/* JADX INFO: renamed from: lّؑۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0283l extends AbstractC12050l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public transient InterfaceC14029l f1294l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC12932l f1295l;

    public AbstractC0283l(InterfaceC14029l interfaceC14029l) {
        this(interfaceC14029l, interfaceC14029l != null ? interfaceC14029l.metrica() : null);
    }

    @Override // defpackage.AbstractC12050l
    public void license() {
        InterfaceC14029l interfaceC14029l = this.f1294l;
        if (interfaceC14029l != null && interfaceC14029l != this) {
            ((InterfaceC0273l) metrica().mo245l(C6168l.f13001l)).mo392synchronized(interfaceC14029l);
        }
        this.f1294l = C9958l.f20315l;
    }

    @Override // defpackage.InterfaceC14029l
    public InterfaceC12932l metrica() {
        return this.f1295l;
    }

    public AbstractC0283l(InterfaceC14029l interfaceC14029l, InterfaceC12932l interfaceC12932l) {
        super(interfaceC14029l);
        this.f1295l = interfaceC12932l;
    }
}
