package ua.itaysonlab.vkxreborn.cache.realm;

import defpackage.AbstractC0593l;
import defpackage.AbstractC10340l;
import defpackage.AbstractC14055l;
import defpackage.AbstractC15011l;
import defpackage.AbstractC18202l;
import defpackage.AbstractC6710l;
import defpackage.AbstractC8576l;
import defpackage.AbstractC8676l;
import defpackage.AbstractC9795l;
import defpackage.C11453l;
import defpackage.C1332l;
import defpackage.C13374l;
import defpackage.C18725l;
import defpackage.C2336l;
import defpackage.C2782l;
import defpackage.C3971l;
import defpackage.C6198l;
import defpackage.C7507l;
import defpackage.C8195l;
import defpackage.C8695l;
import defpackage.InterfaceC13166l;
import defpackage.InterfaceC13226l;
import defpackage.InterfaceC1388l;
import defpackage.InterfaceC2463l;
import defpackage.InterfaceC2851l;
import defpackage.InterfaceC9671l;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedTrackLyricsSynchronizedLine;", "Llؘْٙ;", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CachedTrackLyricsSynchronizedLine implements InterfaceC13166l, InterfaceC2851l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final String f36800l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final Map f36801l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final int f36802l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final InterfaceC1388l f36803l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public String f36804l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f36805l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public long f36806l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C1332l f36807l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f36808l;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedTrackLyricsSynchronizedLine$Companion;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements InterfaceC13226l {
        @Override // defpackage.InterfaceC13226l
        public final int amazon() {
            return CachedTrackLyricsSynchronizedLine.f36802l;
        }

        @Override // defpackage.InterfaceC13226l
        public final Object billing() {
            CachedTrackLyricsSynchronizedLine cachedTrackLyricsSynchronizedLine = new CachedTrackLyricsSynchronizedLine();
            cachedTrackLyricsSynchronizedLine.f36804l = "";
            return cachedTrackLyricsSynchronizedLine;
        }

        @Override // defpackage.InterfaceC13226l
        public final Map crashlytics() {
            return CachedTrackLyricsSynchronizedLine.f36801l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC1388l loadAd() {
            return CachedTrackLyricsSynchronizedLine.f36803l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC2463l mopub() {
            Companion companion = CachedTrackLyricsSynchronizedLine.INSTANCE;
            return null;
        }

        @Override // defpackage.InterfaceC13226l
        public final C3971l purchase() {
            return new C3971l(new C7507l("CachedTrackLyricsSynchronizedLine", "", 4L, 0L, AbstractC10340l.crashlytics(), 1), AbstractC14055l.remoteconfig(AbstractC0593l.loadAd("beginMs", 1, 1, null, "", false, false, false), AbstractC0593l.loadAd("endMs", 1, 1, null, "", false, false, false), AbstractC0593l.loadAd("line", 3, 1, null, "", false, false, false), AbstractC0593l.loadAd("interlude", 2, 1, null, "", false, false, false)));
        }

        @Override // defpackage.InterfaceC13226l
        public final String yandex() {
            return CachedTrackLyricsSynchronizedLine.f36800l;
        }
    }

    static {
        C2336l c2336l = AbstractC18202l.yandex;
        f36803l = c2336l.loadAd(CachedTrackLyricsSynchronizedLine.class);
        f36800l = "CachedTrackLyricsSynchronizedLine";
        Class cls = Long.TYPE;
        f36801l = AbstractC8676l.remoteconfig(new C8195l("beginMs", new C8195l(c2336l.loadAd(cls), C11453l.f23039l)), new C8195l("endMs", new C8195l(c2336l.loadAd(cls), C13374l.f26245l)), new C8195l("line", new C8195l(c2336l.loadAd(String.class), C6198l.f13072l)), new C8195l("interlude", new C8195l(c2336l.loadAd(Boolean.TYPE), C8695l.f17900l)));
        f36802l = 2;
    }

    @Override // defpackage.InterfaceC2851l
    /* JADX INFO: renamed from: Signature, reason: from getter */
    public final C1332l getF3035l() {
        return this.f36807l;
    }

    @Override // defpackage.InterfaceC2851l
    public final void ads(C1332l c1332l) {
        this.f36807l = c1332l;
    }

    public final boolean crashlytics() {
        C1332l c1332l = this.f36807l;
        if (c1332l == null) {
            return this.f36808l;
        }
        long j = c1332l.crashlytics("interlude").amazon;
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
            return false;
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar)) : null).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            InterfaceC9671l interfaceC9671l = (InterfaceC9671l) obj;
            if (AbstractC15011l.subs(interfaceC9671l) && AbstractC15011l.isPro(this) == AbstractC15011l.isPro(interfaceC9671l)) {
                return AbstractC8576l.yandex(AbstractC6710l.purchase(this), AbstractC6710l.purchase(interfaceC9671l));
            }
        }
        return false;
    }

    public final int hashCode() {
        return C2782l.pro(this);
    }

    public final long loadAd() {
        C1332l c1332l = this.f36807l;
        if (c1332l == null) {
            return this.f36805l;
        }
        long j = c1332l.crashlytics("endMs").amazon;
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
            return 0L;
        }
        return (realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null).longValue();
    }

    public final String purchase() {
        C1332l c1332l = this.f36807l;
        if (c1332l == null) {
            return this.f36804l;
        }
        long j = c1332l.crashlytics("line").amazon;
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

    public final String toString() {
        return C2782l.ad(this);
    }

    public final long yandex() {
        C1332l c1332l = this.f36807l;
        if (c1332l == null) {
            return this.f36806l;
        }
        long j = c1332l.crashlytics("beginMs").amazon;
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
            return 0L;
        }
        return (realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null).longValue();
    }
}
