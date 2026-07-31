package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.LinkedHashMap;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lٗۗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17340l extends C0114l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C17340l f33700l = new C17340l(CachedPlaylist.class, "audios", "getAudios()Lio/realm/kotlin/types/RealmList;", 0);

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.C0114l, defpackage.InterfaceC2463l
    public final void appmetrica(Object obj, Object obj2) {
        int i;
        int i2;
        C3364l c3364lLicense;
        long ptr$cinterop_release;
        long ptr$cinterop_release2;
        CachedPlaylist cachedPlaylist = (CachedPlaylist) obj;
        InterfaceC11334l interfaceC11334l = (InterfaceC11334l) obj2;
        C1332l c1332l = cachedPlaylist.f36736l;
        if (c1332l == null) {
            cachedPlaylist.f36734l = interfaceC11334l;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C2336l c2336l = AbstractC18202l.yandex;
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(CachedTrack.class);
        InterfaceC13226l interfaceC13226lYandex = AbstractC5293l.yandex(interfaceC1388lLoadAd);
        if (interfaceC13226lYandex == null) {
            if (interfaceC1388lLoadAd.equals(c2336l.loadAd(InterfaceC3327l.class))) {
                i2 = 2;
            } else {
                i = 1;
            }
            c3364lLicense = C2782l.license(c1332l, c1332l.crashlytics("audios"), interfaceC1388lLoadAd, i2, false, false);
            if (interfaceC11334l instanceof C3364l) {
                LongPointerWrapper longPointerWrapper = c3364lLicense.f7163l;
                LongPointerWrapper longPointerWrapper2 = ((C3364l) interfaceC11334l).f7163l;
                ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                ptr$cinterop_release2 = longPointerWrapper2.getPtr$cinterop_release();
                int i3 = AbstractC9795l.yandex;
                if (realmcJNI.realm_equals(ptr$cinterop_release, ptr$cinterop_release2)) {
                    return;
                }
            }
            c3364lLicense.clear();
            c3364lLicense.f7162l.applovin(c3364lLicense.pro(), interfaceC11334l, 2, linkedHashMap);
        }
        i = interfaceC13226lYandex.amazon() == 2 ? 4 : 3;
        i2 = i;
        c3364lLicense = C2782l.license(c1332l, c1332l.crashlytics("audios"), interfaceC1388lLoadAd, i2, false, false);
        if (interfaceC11334l instanceof C3364l) {
            LongPointerWrapper longPointerWrapper3 = c3364lLicense.f7163l;
            LongPointerWrapper longPointerWrapper4 = ((C3364l) interfaceC11334l).f7163l;
            ptr$cinterop_release = longPointerWrapper3.getPtr$cinterop_release();
            ptr$cinterop_release2 = longPointerWrapper4.getPtr$cinterop_release();
            int i4 = AbstractC9795l.yandex;
            if (realmcJNI.realm_equals(ptr$cinterop_release, ptr$cinterop_release2)) {
                return;
            }
        }
        c3364lLicense.clear();
        c3364lLicense.f7162l.applovin(c3364lLicense.pro(), interfaceC11334l, 2, linkedHashMap);
    }

    @Override // defpackage.C0114l, defpackage.InterfaceC1835l
    public final Object get(Object obj) {
        return ((CachedPlaylist) obj).purchase();
    }
}
