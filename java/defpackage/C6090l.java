package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lؘۥۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6090l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C6111l f12865l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC13238l f12866l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12867l;

    public /* synthetic */ C6090l(InterfaceC13238l interfaceC13238l, C6111l c6111l, int i) {
        this.f12867l = i;
        this.f12866l = interfaceC13238l;
        this.f12865l = c6111l;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.f12867l;
        InterfaceC13238l interfaceC13238l = this.f12866l;
        C6111l c6111l = this.f12865l;
        switch (i3) {
            case 0:
                C7091l c7091l = (C7091l) obj;
                int iIntValue = ((Number) obj2).intValue();
                C6956l c6956l = (C6956l) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (c6956l.billing(c7091l) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= c6956l.amazon(iIntValue) ? 32 : 16;
                }
                if (c6956l.m2127for(i & 1, (i & 147) != 146)) {
                    CachedTrack cachedTrack = ((C10893l) interfaceC13238l.get(iIntValue)).yandex;
                    c6956l.m2123default(143880719);
                    c6111l.m1940const(cachedTrack, c6956l, 0);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C7091l c7091l2 = (C7091l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C6956l c6956l2 = (C6956l) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (c6956l2.billing(c7091l2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= c6956l2.amazon(iIntValue3) ? 32 : 16;
                }
                if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
                    CachedPlaylist cachedPlaylist = ((C0913l) interfaceC13238l.get(iIntValue3)).yandex;
                    c6956l2.m2123default(-714408416);
                    boolean zBilling = c6956l2.billing(cachedPlaylist) | c6956l2.admob(c6111l);
                    Object objM2132native = c6956l2.m2132native();
                    C13863l c13863l = C1867l.yandex;
                    if (zBilling || objM2132native == c13863l) {
                        objM2132native = new C18231l(cachedPlaylist, c6111l);
                        c6956l2.m2147try(objM2132native);
                    }
                    Function0 function0 = (Function0) objM2132native;
                    boolean zAdmob = c6956l2.admob(c6111l) | c6956l2.billing(cachedPlaylist);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob || objM2132native2 == c13863l) {
                        objM2132native2 = new C18231l(c6111l, cachedPlaylist);
                        c6956l2.m2147try(objM2132native2);
                    }
                    c6111l.m1942implements(cachedPlaylist, AbstractC9151l.amazon(C4346l.f8873l, null, function0, null, (Function0) objM2132native2, 239), c6956l2, 0);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
