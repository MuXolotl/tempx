package defpackage;

/* JADX INFO: renamed from: lؙؙۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6309l extends Cgoto {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f13260l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AutoCloseable f13261l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6309l(AutoCloseable autoCloseable, int i) {
        super(8, false);
        this.f13260l = i;
        this.f13261l = autoCloseable;
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lؑؓۙ */
    public final int mo201l() {
        int i = this.f13260l;
        AutoCloseable autoCloseable = this.f13261l;
        switch (i) {
            case 0:
                InterfaceC14189l interfaceC14189l = (InterfaceC14189l) autoCloseable;
                if (interfaceC14189l instanceof C18476l) {
                    return AbstractC17291l.amazon((C18476l) interfaceC14189l);
                }
                interfaceC14189l.subscription(1L);
                byte bYandex = interfaceC14189l.crashlytics().yandex(0L);
                if ((bYandex & 224) == 192) {
                    interfaceC14189l.subscription(2L);
                } else if ((bYandex & 240) == 224) {
                    interfaceC14189l.subscription(3L);
                } else if ((bYandex & 248) == 240) {
                    interfaceC14189l.subscription(4L);
                }
                return AbstractC17291l.amazon(interfaceC14189l.crashlytics());
            default:
                return ((InterfaceC9473l) autoCloseable).mo727protected();
        }
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lٕۗٞ */
    public final boolean mo228l() {
        int i = this.f13260l;
        AutoCloseable autoCloseable = this.f13261l;
        switch (i) {
            case 0:
                return ((InterfaceC14189l) autoCloseable).subs();
            default:
                return ((InterfaceC9473l) autoCloseable).subs();
        }
    }
}
