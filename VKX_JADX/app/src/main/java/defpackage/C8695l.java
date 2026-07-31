package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import kotlin.Unit;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrackLyricsSynchronizedLine;

/* JADX INFO: renamed from: lٌَٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8695l extends C0114l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C8695l f17900l = new C8695l(CachedTrackLyricsSynchronizedLine.class, "interlude", "getInterlude()Z", 0);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.C0114l, defpackage.InterfaceC2463l
    public final void appmetrica(Object obj, Object obj2) {
        CachedTrackLyricsSynchronizedLine cachedTrackLyricsSynchronizedLine = (CachedTrackLyricsSynchronizedLine) obj;
        Boolean bool = (Boolean) obj2;
        boolean zBooleanValue = bool.booleanValue();
        C1332l c1332l = cachedTrackLyricsSynchronizedLine.f36807l;
        if (c1332l == null) {
            cachedTrackLyricsSynchronizedLine.f36808l = zBooleanValue;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("interlude").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (bool instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) bool);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsPro = c3585lRemoteconfig.isPro(bool);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsPro.yandex, realm_value_tVarIsPro, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    @Override // defpackage.C0114l, defpackage.InterfaceC1835l
    public final Object get(Object obj) {
        return Boolean.valueOf(((CachedTrackLyricsSynchronizedLine) obj).crashlytics());
    }
}
