package defpackage;

import java.util.Comparator;

/* JADX INFO: renamed from: lٕ٘ؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17638l implements Comparator {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13698l f34325l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34326l;

    public /* synthetic */ C17638l(C13698l c13698l, int i) {
        this.f34326l = i;
        this.f34325l = c13698l;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f34326l;
        C13698l c13698l = this.f34325l;
        switch (i) {
            case 0:
                return AbstractC2920l.crashlytics(Integer.valueOf(c13698l.premium(((InterfaceC9146l) obj).getKey())), Integer.valueOf(c13698l.premium(((InterfaceC9146l) obj2).getKey())));
            case 1:
                return AbstractC2920l.crashlytics(Integer.valueOf(c13698l.premium(((InterfaceC9146l) obj).getKey())), Integer.valueOf(c13698l.premium(((InterfaceC9146l) obj2).getKey())));
            case 2:
                return AbstractC2920l.crashlytics(Integer.valueOf(c13698l.premium(((InterfaceC9146l) obj2).getKey())), Integer.valueOf(c13698l.premium(((InterfaceC9146l) obj).getKey())));
            default:
                return AbstractC2920l.crashlytics(Integer.valueOf(c13698l.premium(((InterfaceC9146l) obj2).getKey())), Integer.valueOf(c13698l.premium(((InterfaceC9146l) obj).getKey())));
        }
    }
}
