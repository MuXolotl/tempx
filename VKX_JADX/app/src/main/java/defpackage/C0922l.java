package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import kotlin.Unit;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPhotoSize;

/* JADX INFO: renamed from: lٌؒؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0922l extends C0114l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C0922l f2602l = new C0922l(CachedPhotoSize.class, "type", "getType()Ljava/lang/String;", 0);

    @Override // defpackage.C0114l, defpackage.InterfaceC2463l
    public final void appmetrica(Object obj, Object obj2) {
        CachedPhotoSize cachedPhotoSize = (CachedPhotoSize) obj;
        String str = (String) obj2;
        C1332l c1332l = cachedPhotoSize.f36705l;
        if (c1332l == null) {
            cachedPhotoSize.f36706l = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("type").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (str == null) {
            realm_value_t realm_value_tVarSignatures = c3585lRemoteconfig.signatures();
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarSignatures.yandex, realm_value_tVarSignatures, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    @Override // defpackage.C0114l, defpackage.InterfaceC1835l
    public final Object get(Object obj) {
        CachedPhotoSize cachedPhotoSize = (CachedPhotoSize) obj;
        C1332l c1332l = cachedPhotoSize.f36705l;
        if (c1332l == null) {
            return cachedPhotoSize.f36706l;
        }
        long j = c1332l.crashlytics("type").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return null;
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar);
        }
        return null;
    }
}
