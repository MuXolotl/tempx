package defpackage;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: renamed from: lٍؔۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9309l implements InterfaceC3905l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C17039l f19115l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C17039l f19118l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C3007l f19119l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final HashMap f19120l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final HashMap f19121l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f19122l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C3007l f19117l = new C3007l(0);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C4471l f19116l = new C4471l();

    /* JADX WARN: Type inference failed for: r0v1, types: [lَٗ۠] */
    /* JADX WARN: Type inference failed for: r0v2, types: [lَٗ۠] */
    static {
        final int i = 0;
        f19118l = new InterfaceC3484l() { // from class: lَٗ۠
            @Override // defpackage.InterfaceC7349l
            public final void yandex(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((InterfaceC10805l) obj2).loadAd((String) obj);
                        break;
                    default:
                        ((InterfaceC10805l) obj2).crashlytics(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        f19115l = new InterfaceC3484l() { // from class: lَٗ۠
            @Override // defpackage.InterfaceC7349l
            public final void yandex(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((InterfaceC10805l) obj2).loadAd((String) obj);
                        break;
                    default:
                        ((InterfaceC10805l) obj2).crashlytics(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public C9309l() {
        HashMap map = new HashMap();
        this.f19121l = map;
        HashMap map2 = new HashMap();
        this.f19120l = map2;
        this.f19119l = f19117l;
        this.f19122l = false;
        map2.put(String.class, f19118l);
        map.remove(String.class);
        map2.put(Boolean.class, f19115l);
        map.remove(Boolean.class);
        map2.put(Date.class, f19116l);
        map.remove(Date.class);
    }

    @Override // defpackage.InterfaceC3905l
    public final InterfaceC3905l subs(Class cls, InterfaceC18528l interfaceC18528l) {
        this.f19121l.put(cls, interfaceC18528l);
        this.f19120l.remove(cls);
        return this;
    }
}
