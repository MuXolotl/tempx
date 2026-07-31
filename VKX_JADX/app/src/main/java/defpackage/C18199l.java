package defpackage;

import java.util.Set;

/* JADX INFO: renamed from: lّ٘ۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18199l implements InterfaceC6752l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C17893l f35643l = new C17893l(0, new InterfaceC17142l[16]);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Set f35644l;

    public C18199l(Set set) {
        this.f35644l = set;
    }

    @Override // defpackage.InterfaceC6752l
    public final void crashlytics() {
        C17893l c17893l = this.f35643l;
        Object[] objArr = c17893l.f34848l;
        int i = c17893l.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC6752l interfaceC6752l = ((C6031l) ((InterfaceC17142l) objArr[i2])).yandex;
            this.f35644l.remove(interfaceC6752l);
            interfaceC6752l.crashlytics();
        }
    }

    @Override // defpackage.InterfaceC6752l
    public final void loadAd() {
    }

    @Override // defpackage.InterfaceC6752l
    public final void yandex() {
    }
}
