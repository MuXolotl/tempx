package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lُؕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3315l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C9430l f7066l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ List f7067l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7068l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f7069l;

    public /* synthetic */ C3315l(InterfaceC13238l interfaceC13238l, C9430l c9430l, InterfaceC12244l interfaceC12244l, int i) {
        this.f7068l = i;
        this.f7067l = interfaceC13238l;
        this.f7066l = c9430l;
        this.f7069l = interfaceC12244l;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.f7068l;
        List list = this.f7067l;
        InterfaceC12244l interfaceC12244l = this.f7069l;
        C13863l c13863l = C1867l.yandex;
        int i4 = 1;
        int i5 = 0;
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
                    CachedTrack cachedTrack = (CachedTrack) list.get(iIntValue);
                    c6956l.m2123default(1539929183);
                    C9430l c9430l = this.f7066l;
                    boolean zAdmob = c6956l.admob(c9430l) | c6956l.admob(cachedTrack) | c6956l.billing(interfaceC12244l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C13093l(c9430l, cachedTrack, interfaceC12244l, 0);
                        c6956l.m2147try(objM2132native);
                    }
                    Function0 function0 = (Function0) objM2132native;
                    boolean zAdmob2 = c6956l.admob(cachedTrack) | c6956l.admob(c9430l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C11302l(cachedTrack, c9430l, i5);
                        c6956l.m2147try(objM2132native2);
                    }
                    c9430l.m2651break(cachedTrack, function0, (Function0) objM2132native2, c6956l, 0);
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
                    CachedTrack cachedTrack2 = (CachedTrack) list.get(iIntValue3);
                    c6956l2.m2123default(-271637987);
                    C9430l c9430l2 = this.f7066l;
                    boolean zAdmob3 = c6956l2.admob(c9430l2) | c6956l2.admob(cachedTrack2) | c6956l2.billing(interfaceC12244l);
                    Object objM2132native3 = c6956l2.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C13093l(c9430l2, cachedTrack2, interfaceC12244l, 1);
                        c6956l2.m2147try(objM2132native3);
                    }
                    Function0 function1 = (Function0) objM2132native3;
                    boolean zAdmob4 = c6956l2.admob(cachedTrack2) | c6956l2.admob(c9430l2);
                    Object objM2132native4 = c6956l2.m2132native();
                    if (zAdmob4 || objM2132native4 == c13863l) {
                        objM2132native4 = new C11302l(cachedTrack2, c9430l2, i4);
                        c6956l2.m2147try(objM2132native4);
                    }
                    c9430l2.m2651break(cachedTrack2, function1, (Function0) objM2132native4, c6956l2, 0);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
