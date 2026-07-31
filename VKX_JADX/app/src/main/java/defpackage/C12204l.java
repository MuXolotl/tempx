package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* JADX INFO: renamed from: lِۣؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12204l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f24248l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f24249l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24250l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f24251l;

    public /* synthetic */ C12204l(Object obj, Object obj2, InterfaceC12244l interfaceC12244l, int i) {
        this.f24250l = i;
        this.f24249l = obj;
        this.f24248l = obj2;
        this.f24251l = interfaceC12244l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f24250l;
        C13863l c13863l = C1867l.yandex;
        InterfaceC12244l interfaceC12244l = this.f24251l;
        Object obj3 = this.f24249l;
        Object obj4 = this.f24248l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Number) obj2).intValue();
                MainArtist mainArtist = (MainArtist) obj3;
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zAdmob = c6956l.admob(mainArtist);
                    InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj4;
                    InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) interfaceC12244l;
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C17749l(mainArtist, interfaceC8714l, interfaceC8714l2, 2);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC7470l.billing((Function0) objM2132native, null, false, null, null, null, AbstractC18219l.f35660l, c6956l, 1572864, 62);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj4;
                C1682l c1682l = (C1682l) obj3;
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zYandex = AbstractC8576l.yandex(c1682l.f4048l, ((C3278l) interfaceC12244l.getValue()).f7018l);
                    boolean zAdmob2 = c6956l2.admob(interfaceC2262l) | c6956l2.admob(c1682l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C6975l(interfaceC2262l, c1682l, 1);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC0676l.yandex(zYandex, (Function0) objM2132native2, null, false, null, c6956l2, 0);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
