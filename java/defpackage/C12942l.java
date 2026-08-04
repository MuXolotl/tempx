package defpackage;

import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٍّۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12942l implements InterfaceC14762l {
    public static int amazon;
    public static C6536l billing;
    public static boolean crashlytics;
    public static int loadAd;
    public static boolean purchase;
    public static final C12942l yandex = new C12942l();

    @Override // defpackage.InterfaceC14762l
    public final void crashlytics(long j) {
        if (!purchase || crashlytics) {
            return;
        }
        int i = amazon - 1;
        amazon = i;
        C6536l c6536l = billing;
        if (c6536l != null) {
            ((C10056l) c6536l.f13620l).m2876try(i);
        }
        if (amazon <= 0) {
            purchase = false;
            C16076l c16076l = VKXApplication.f36632l;
            if (c16076l == null) {
                c16076l = null;
            }
            c16076l.ads();
        }
    }

    @Override // defpackage.InterfaceC14762l
    public final void yandex(AbstractC18643l abstractC18643l, AbstractC18643l abstractC18643l2) {
        if (crashlytics) {
            crashlytics = false;
            C16076l c16076l = VKXApplication.f36632l;
            if (c16076l == null) {
                c16076l = null;
            }
            c16076l.ads();
        }
    }

    @Override // defpackage.InterfaceC14762l
    public final void loadAd(EnumC11447l enumC11447l) {
    }
}
