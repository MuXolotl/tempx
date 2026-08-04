package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: lّٖٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14852l implements InterfaceC13342l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f29087l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f29088l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29089l;

    public C14852l(InterfaceC1711l interfaceC1711l) {
        this.f29089l = 3;
        this.f29088l = interfaceC1711l;
        C4498l c4498l = C4498l.crashlytics;
        Class<?> cls = interfaceC1711l.getClass();
        C18241l c18241l = (C18241l) c4498l.yandex.get(cls);
        this.f29087l = c18241l == null ? c4498l.yandex(cls, null) : c18241l;
    }

    @Override // defpackage.InterfaceC13342l
    public final void ads(InterfaceC3177l interfaceC3177l, EnumC14812l enumC14812l) {
        int i = this.f29089l;
        Object obj = this.f29088l;
        Object obj2 = this.f29087l;
        switch (i) {
            case 0:
                InterfaceC18325l interfaceC18325l = (InterfaceC18325l) obj;
                switch (AbstractC6557l.yandex[enumC14812l.ordinal()]) {
                    case 1:
                        interfaceC18325l.mopub();
                        break;
                    case 2:
                        interfaceC18325l.onStart(interfaceC3177l);
                        break;
                    case 3:
                        interfaceC18325l.onResume(interfaceC3177l);
                        break;
                    case 4:
                        interfaceC18325l.onPause(interfaceC3177l);
                        break;
                    case 5:
                        interfaceC18325l.onStop(interfaceC3177l);
                        break;
                    case 6:
                        interfaceC18325l.onDestroy(interfaceC3177l);
                        break;
                    case 7:
                        C8339l.metrica("ON_ANY must not been send by anybody");
                        break;
                    default:
                        C18725l.billing();
                        break;
                }
                InterfaceC13342l interfaceC13342l = (InterfaceC13342l) obj2;
                if (interfaceC13342l != null) {
                    interfaceC13342l.ads(interfaceC3177l, enumC14812l);
                }
                break;
            case 1:
                if (enumC14812l == EnumC14812l.ON_START) {
                    ((AbstractC6475l) obj).loadAd(this);
                    ((C18396l) obj2).m4524native();
                }
                break;
            case 2:
                C0760l c0760l = (C0760l) obj;
                int i2 = AbstractC14481l.yandex[enumC14812l.ordinal()];
                if (i2 == 1) {
                    c0760l.admob(true);
                    break;
                } else if (i2 == 2) {
                    c0760l.admob(false);
                    break;
                } else if (i2 == 3) {
                    c0760l.billing();
                    ((AbstractC6475l) obj2).loadAd(this);
                    break;
                }
                break;
            default:
                HashMap map = ((C18241l) obj2).yandex;
                C18241l.yandex((List) map.get(enumC14812l), interfaceC3177l, enumC14812l, obj);
                C18241l.yandex((List) map.get(EnumC14812l.ON_ANY), interfaceC3177l, enumC14812l, obj);
                break;
        }
    }

    public /* synthetic */ C14852l(Object obj, Object obj2, int i) {
        this.f29089l = i;
        this.f29088l = obj;
        this.f29087l = obj2;
    }

    public C14852l(C0760l c0760l, C16390l c16390l, AbstractC6475l abstractC6475l) {
        this.f29089l = 2;
        this.f29088l = c0760l;
        this.f29087l = abstractC6475l;
    }
}
