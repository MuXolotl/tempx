package defpackage;

/* JADX INFO: renamed from: l٘ؓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17630l extends Cgoto {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC11661l f34314l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17630l(InterfaceC11661l interfaceC11661l, AbstractC18041l abstractC18041l) {
        super(abstractC18041l);
        if (abstractC18041l == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.f34314l = interfaceC11661l;
    }

    @Override // defpackage.Cgoto
    public final String toString() {
        return yandex() + ": Ext {" + this.f34314l + "}";
    }
}
